package com.example.dialog_practice;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
AlertDialog.Builder adb1,adb2,adb3,adb4,adb5;
LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = (LinearLayout) findViewById(R.id.ll);
        adb1 = new AlertDialog.Builder(this);
        adb1.setMessage("This Is A Simple Alert");
        AlertDialog ad1 = adb1.create();
        ad1.show();
        adb2 = new AlertDialog.Builder(this);
        adb2.setMessage("This Is A Simple Alert");
        adb2.setIcon(R.drawable.ic_launcher_background);
        AlertDialog ad2 = adb2.create();
        ad2.show();
        adb3 = new AlertDialog.Builder(this);
        adb3.setMessage("This Is A Simple Alert");
        adb3.setIcon(R.drawable.ic_launcher_background);
        adb3.setPositiveButton("Press Button To Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog ad3 = adb3.create();
        ad3.show();
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
                switch (Math.random(4))
                {
                    case 0: {
                        ll.setBackground(Color.BLACK);
                        break;
                    }
                }
            }
        });
        AlertDialog ad4 = adb4.create();
        ad4.show();
    }
}
