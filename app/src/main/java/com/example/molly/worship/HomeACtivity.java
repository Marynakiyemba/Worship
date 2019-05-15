package com.example.molly.worship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bcsender.R;

public class HomeACtivity extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);

//         bt= findViewById(R.id.church);

    }
    public void churches(View view){
        Intent intent = new Intent(this,ChurchActivity.class);
        startActivity(intent);
    }
    public void mos(View view) {
        Intent intent = new Intent(this, MosqueActivity.class);
        startActivity(intent);
    }
    public void Framer(View view){
        Intent intent = new Intent(this,ChurchFragment.class);
        startActivity(intent);
    }
}
