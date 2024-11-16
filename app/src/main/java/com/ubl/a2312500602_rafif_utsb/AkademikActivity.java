package com.ubl.a2312500602_rafif_utsb;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class AkademikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);

        // Inisialisasi ViewPager dan Adapter
        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // Inisialisasi TabLayout
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        // Tambahkan Listener untuk mendeteksi perubahan tab
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1) { // Index 1 adalah Tab 2
                    showAlertBox();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Tidak ada aksi untuk tab yang tidak dipilih
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Tidak ada aksi untuk tab yang dipilih ulang
            }
        });
    }

    // Metode untuk menampilkan AlertDialog
    private void showAlertBox() {
        new AlertDialog.Builder(AkademikActivity.this)
                .setTitle("MAAF")
                .setMessage("Sistem Sedang Maintenance")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
