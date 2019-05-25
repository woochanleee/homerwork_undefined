package com.example.clickergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {
    int change_hp = 10;
    int power = 10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView header = findViewById(R.id.header);
        final TextView hp = findViewById(R.id.hp);
        final ImageView touch = findViewById(R.id.touch);
        hp.setText("" + change_hp);
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Toast toast = Toast.makeText(getApplicationContext(), "데미지 -" + power, Toast.LENGTH_SHORT);
                final Toast death = Toast.makeText(getApplicationContext(), "난 이미 죽었다고..." , Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 1600);
                toast.setGravity(Gravity.RIGHT, 100, 600);
                if (change_hp > 0)
                {
                    change_hp -= power;
                    toast.show();
                    hp.setText(""+ change_hp);
                    power += 10;

                    if (change_hp <= 0) {
                        header.setText("으악...날죽이다니");
                        hp.setText("CLEAR");
                        touch.setImageResource(R.drawable.jjangu);
                    }
                }
                else {
                    death.show();
                }
            }
        });
    }

}
