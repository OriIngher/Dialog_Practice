package com.example.dialog_practice;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb1,adb2,adb3,adb4,adb5;
LinearLayout ll;
Random rd;
int color;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);



    }

    public void message(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        AlertDialog ad1 = adb1.create();
        ad1.show();

    }

    public void message_icon(View view) {
        adb2 = new AlertDialog.Builder(this);
        adb2.setMessage("This Is A Simple Alert");
        adb2.setIcon(R.drawable.tomato);
        AlertDialog ad2 = adb2.create();
        ad2.show();
    }

    public void message_icon_button(View view) {
        adb3 = new AlertDialog.Builder(this);
        adb3.setMessage("This Is A Simple Alert");
        adb3.setIcon(R.drawable.tomato);
        adb3.setPositiveButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad3 = adb3.create();
        ad3.show();
    }

    public void random_color(View view) {
        adb4 = new AlertDialog.Builder(this);
        adb4.setMessage("This Is A Simple Alert");
        adb4.setNegativeButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        adb4.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rd = new Random();
                color = Color.argb(255,rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        AlertDialog ad4 = adb4.create();
        ad4.show();
    }

    public void random_color_reset(View view) {
        adb5 = new AlertDialog.Builder(this);
        adb5.setMessage("This Is A Simple Alert");
        adb5.setNegativeButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        adb5.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rd = new Random();
                color = Color.argb(255,rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });

        adb5.setNeutralButton("White Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               ll.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad5 = adb5.create();
        ad5.show();
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id==R.id.credits)
        {
            Intent si = new Intent(this,Credits3.class);
            startActivity(si);
        }
        return true;
    }}

