package com.example.joy.tabbedview7;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("TabbedView7");


        //----initialize--------------------
        tabLayout=findViewById(R.id.my_tabs);
        viewPager=findViewById(R.id.my_view_pager);





    }




    class viewPagerAdapter extends FragmentPagerAdapter{

        private final List<Fragment> my_lists=new ArrayList<Fragment>();
        private final List<String> my_titles=new ArrayList<String>();

        public viewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return my_lists.get(position);
        }

        @Override
        public int getCount() {
            return my_lists.size();
        }

        void addMyFragment(Fragment f,String title){

            my_lists.add(f);
            my_titles.add(title);


        }

        @Override
        public CharSequence getPageTitle(int position) {
            return my_titles.get(position);
        }
    }

}
