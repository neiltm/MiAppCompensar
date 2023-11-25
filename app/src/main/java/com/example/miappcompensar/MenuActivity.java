package com.example.miappcompensar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
public class MenuActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawerLayout = findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(item -> {
            handleMenuItemClick(item.getItemId());
            return true;
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        GridView productGridView = findViewById(R.id.productGridView);


        String[] productNames = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        int[] productImages = {R.drawable.pro1, R.drawable.pro2, R.drawable.pro3, R.drawable.pro4, R.drawable.pro5};

        ProductAdapter productAdapter = new ProductAdapter(this, productNames, productImages);
        productGridView.setAdapter(productAdapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void handleMenuItemClick(int itemId) {
        if (itemId == R.id.nav_cart) {

        } else if (itemId == R.id.nav_categories) {

        } else if (itemId == R.id.nav_search) {

        } else if (itemId == R.id.nav_profile) {

        } else if (itemId == R.id.nav_logout) {

        }
    }
}
