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
    int now_hp = 500;
    int change_hp;
    int power = 10;
    int stage = 1;
    public void set(int now_hp){
        this.change_hp = now_hp;
        final TextView header = findViewById(R.id.header);
        final TextView hp = findViewById(R.id.hp);
        final ImageView touch = findViewById(R.id.touch);
        header.setText("날 때려보시지!ㅋ\nLEVEL" + stage);
        hp.setText("" + now_hp);
        touch.setImageResource(R.drawable.jjangu);
    }
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView header = findViewById(R.id.header);
        final TextView hp = findViewById(R.id.hp);
        final ImageView touch = findViewById(R.id.touch);
        set(now_hp);
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
                        hp.setText("CLEAR\n다음단계를 하시겠습니까?\ntouch...");
                        touch.setImageResource(R.drawable.deathjjangu);
                    }
                }
                else {
                    death.show();
                }
            }
        });
            hp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity changer = new MainActivity();
                    if (change_hp <= 0) {
                        stage++;
                        now_hp += 250;
                        power = 10;
                        set(now_hp);
                    }
                }
            });

    }

}
