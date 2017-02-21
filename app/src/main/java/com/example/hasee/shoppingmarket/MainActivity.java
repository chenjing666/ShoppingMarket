package com.example.hasee.shoppingmarket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hasee.shoppingmarket.adapter.LeftMenuAdapter;
import com.example.hasee.shoppingmarket.imp.ShopCartImp;
import com.example.hasee.shoppingmarket.model.DishMenu;

public class MainActivity extends AppCompatActivity implements LeftMenuAdapter.onItemSelectedListener,ShopCartImp{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLeftItemSelected(int postion, DishMenu menu) {

    }

    @Override
    public void add(View view, int postion) {

    }

    @Override
    public void remove(View view, int postion) {

    }
}
