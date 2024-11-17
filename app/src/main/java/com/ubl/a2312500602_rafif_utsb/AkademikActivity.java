package com.ubl.a2312500602_rafif_utsb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class AkademikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik);


        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);


        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        if (tabLayout.getTabAt(0) != null) {
            tabLayout.getTabAt(0).setIcon(R.drawable.profile);
        }
        if (tabLayout.getTabAt(1) != null) {
            tabLayout.getTabAt(1).setIcon(R.drawable.sarjana);
        }
        if (tabLayout.getTabAt(2) != null) {
            tabLayout.getTabAt(2).setIcon(R.drawable.mengajar);
        }
        if (tabLayout.getTabAt(3) != null) {
            tabLayout.getTabAt(3).setIcon(R.drawable.maps2);
        }

        // Tambahkan Listener untuk mendeteksi perubahan tab
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1) {
                    showAlertBox();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    private void showAlertBox() {
        new AlertDialog.Builder(AkademikActivity.this)
                .setTitle("MAAF")
                .setMessage("Sistem Sedang Maintenance")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss())
                .show();
    }

    public void showIG(View view) {
        String url = "https://www.instagram.com/rapipajaaa";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    // Metode untuk membuka Facebook
    public void showFB(View view) {
        String url = "https://www.facebook.com/Rapipajaaa";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    // Metode untuk membuka Twitter
    public void showTWT(View view) {
        String url = "https://www.twitter.com/rapipajaa";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}
