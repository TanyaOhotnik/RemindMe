package com.tanyaohotnik.remindme;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.tanyaohotnik.remindme.adapter.TabPagerFragmentAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static final int LAYOUT = R.layout.activity_main;
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationView();
        initTabs();

    }

    private void initTabs() {
        mViewPager = (ViewPager)findViewById(R.id.viewPager);
        TabPagerFragmentAdapter adapter = new TabPagerFragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);

        TabLayout tabs = ( TabLayout)findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(mViewPager);

    }

    private void initNavigationView() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void initToolbar() {
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        mToolbar.setTitle(R.string.app_name);
        mToolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.search_menu:; return true;
    }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        mDrawerLayout.closeDrawers();
        switch (item.getItemId()){
            case R.id.nd_remainders: showNotificationTab();
        }

        return false;
    }

    private void showNotificationTab() {
        mViewPager.setCurrentItem(Constants.TAB_NAVIGATION);
    }
}
