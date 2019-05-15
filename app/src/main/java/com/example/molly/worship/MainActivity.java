package com.example.molly.worship;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;

/*
NAME:ACHIRO MOLLY
COURSE:BIT
REG NO:2017/BIT/162
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button about =(Button) findViewById(R.id.about);
        Button cont =(Button) findViewById(R.id.button3);


        about.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, AboutActivity.class);
              startActivity(intent);
            }
        });


        cont.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeACtivity.class);
                startActivity(intent);
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int x=item.getItemId();
        switch (x){
            case R.id.churches:
                Intent myintent1 =new Intent(MainActivity.this,ChurchActivity.class);
                startActivity(myintent1);
                break;
            case R.id.mosque:
                Intent myintent2 =new Intent(MainActivity.this,MosqueActivity.class);
                startActivity(myintent2);
            case R.id.about:
//                Intent myintent3 =new Intent(MainActivity.this,AboutActivity.class);
//                startActivity(myintent3);

            default:
                return false;

        }

        return super.onOptionsItemSelected(item);
    }
}
