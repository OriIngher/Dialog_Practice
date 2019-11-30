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
import android.widget.Toast;

import java.util.Random;

/**
 * @author oriin
 */

public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb1;
AlertDialog adb2;
LinearLayout ll;
Random rd;
int color;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);



    }

    /**
     *
     * @param view
     */
    public void message(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        AlertDialog ad1 = adb1.create();
        ad1.show();

    }

    /**
     *
     * @param view
     */
    public void message_icon(View view) {
        adb2 = new AlertDialog.Builder(this).create();
        adb2.setTitle(".");
        adb2.setMessage("This Is A Simple Alert");
        adb2.setIcon(R.drawable.tomato);
        adb2.show();
    }

    /**
     *
     * @param view
     */
    public void message_icon_button(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        adb1.setIcon(R.drawable.tomato);
        adb1.setPositiveButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad3 = adb1.create();
        ad3.show();
    }

    /**
     *
     * @param view
     */
    public void random_color(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        adb1.setNegativeButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        adb1.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rd = new Random();
                color = Color.argb(255,rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });
        AlertDialog ad4 = adb1.create();
        ad4.show();
    }

    /**
     *
     * @param view
     */
    public void random_color_reset(View view) {
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        adb1.setNegativeButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();

            }
        });
        adb1.setPositiveButton("Random color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                rd = new Random();
                color = Color.argb(255,rd.nextInt(256),rd.nextInt(256),rd.nextInt(256));
                ll.setBackgroundColor(color);
            }
        });

        adb1.setNeutralButton("White Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               ll.setBackgroundColor(Color.WHITE);
            }
        });
        AlertDialog ad5 = adb1.create();
        ad5.show();
    }

    /**
     *
     * @param menu

     */
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    /**
     *
     * @param item
     * @return checks if "credits" button is pressed and if so moves to "credits" activity
     */
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

