package com.example.android.calling;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calling extends AppCompatActivity {
    Button bt1,bt2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calling);
        bt1=(Button) findViewById(R.id.btn1);
        bt2=(Button) findViewById(R.id.btn2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7903945705"));
                startActivity(intent);
            }
        });
    }

}
