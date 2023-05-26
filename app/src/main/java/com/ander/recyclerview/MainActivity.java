package com.ander.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    int[] image ={
            R.drawable.usa,
            R.drawable.china,
            R.drawable.england,
            R.drawable.france,
            R.drawable.nepal,
            R.drawable.italy

    };
    String[] countryName, countryDetails;
    MyAdaptor myAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rc=(RecyclerView) findViewById(R.id.rc);
        countryName=getResources().getStringArray(R.array.countryName);
        countryDetails=getResources().getStringArray(R.array.countryDetails);
        myAdaptor =new MyAdaptor(MainActivity.this, countryName, countryDetails,image);
        rc.setAdapter(myAdaptor);
        rc.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}