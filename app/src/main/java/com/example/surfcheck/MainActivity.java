package com.example.surfcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton blacks, lowers, saltCreek, rincon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blacks = (ImageButton) findViewById(R.id.spot1);
        saltCreek = (ImageButton) findViewById(R.id.spot3);
        rincon = (ImageButton) findViewById(R.id.spot4);
        lowers = (ImageButton) findViewById(R.id.spot2);

        blacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.surfline.com/surf-report/blacks/5842041f4e65fad6a770883b?camId=5cd2f613e64ac813641c836a")));
            }
        });
        saltCreek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.surfline.com/surf-report/salt-creek/5842041f4e65fad6a770882e?camId=58349fe73421b20545c4b57e")));
            }
        });
        rincon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.surfline.com/surf-report/rincon/5842041f4e65fad6a7708814")));
            }
        });
        lowers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.surfline.com/surf-report/lower-trestles/5842041f4e65fad6a770888a?camId=58a37530c9d273fd4f581beb")));
            }
        });
    }
}