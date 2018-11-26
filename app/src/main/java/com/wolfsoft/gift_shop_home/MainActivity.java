package com.wolfsoft.gift_shop_home;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Shop_Home_Adapter;
import adapter.Shop_Home_Adapter_1;
import adapter.ViewPagerAdapter_Shop_Home;
import me.relex.circleindicator.CircleIndicator;
import model.Shop_Home_Model;
import model.Shop_Home_Model_1;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter_Shop_Home viewPagerAdapter_shop_home;
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;


    private Shop_Home_Adapter shop_home_adapter;
    private RecyclerView recyclerview;
    private ArrayList<Shop_Home_Model> shop_home_modelArrayList;

    private Shop_Home_Adapter_1 shop_home_adapter_1;
    private RecyclerView recyclerView;
    private ArrayList<Shop_Home_Model_1> shop_home_model_1ArrayList;

    Integer  imageView1[]={R.drawable.birthday,R.drawable.birthday2,R.drawable.birthday3};
    String   txtprice[]={"$20","$30","$50"};
    String   txtproductname[]={"Product name","Product name","Product name"};
    String   txtreviews[]={"(430)","(430)","(321)"};


    Integer resimage[]={R.drawable.regulargift,R.drawable.boxgift,R.drawable.chocolate,R.drawable.giftwithcard};
    String  txtregulargift[]={"Regular Gift","Box Gift","Chocolate","Gift with card"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator circleIndicator =(CircleIndicator) findViewById(R.id.circleindicator);
        viewPagerAdapter_shop_home = new ViewPagerAdapter_Shop_Home(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter_shop_home);
        circleIndicator.setViewPager(viewPager);
        viewPagerAdapter_shop_home.registerDataSetObserver(circleIndicator.getDataSetObserver());

        recyclerView = findViewById(R.id.recyclerview3);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        shop_home_modelArrayList = new ArrayList<>();

        for (int i = 0; i < imageView1.length; i++) {
            Shop_Home_Model view = new Shop_Home_Model(imageView1[i],txtprice[i],txtproductname[i],txtreviews[i]);
            shop_home_modelArrayList.add(view);
        }
        shop_home_adapter = new Shop_Home_Adapter(MainActivity.this,shop_home_modelArrayList);
        recyclerView.setAdapter(shop_home_adapter);

        recyclerView = findViewById(R.id.recyclerview4);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager1);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        shop_home_model_1ArrayList = new ArrayList<>();

        for (int i = 0; i < resimage.length; i++) {
            Shop_Home_Model_1 view = new Shop_Home_Model_1(resimage[i],txtregulargift[i]);
            shop_home_model_1ArrayList.add(view);
        }
        shop_home_adapter_1 = new Shop_Home_Adapter_1(MainActivity.this,shop_home_model_1ArrayList);
        recyclerView.setAdapter(shop_home_adapter_1);

    }
}
