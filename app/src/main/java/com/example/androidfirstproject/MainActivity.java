    package com.example.androidfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {


    Button openSecond;
   // Button button;
    Button sendData;
    //TextView title;
    EditText username1, password1;
//    public String username="Pragya";
 //       public String password="pragya";


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate()", Toast.LENGTH_SHORT).show();

        //openSecond = findViewById(R.id.bt_open);
           // title = findViewById(R.id.tx_title);
            //button = findViewById(R.id.bt_login);
            username1 = findViewById(R.id.et_username);
            password1 = findViewById(R.id.et_password);
            sendData = findViewById(R.id.sendData);



        }
        @Override
        protected void onResume() {
            super.onResume();
            sendData.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view) {

                    String userName=username1.getText().toString();
                    String passWord=password1.getText().toString();

                    Bundle bundle = new Bundle();
                    bundle.putString("key1",userName);
                    bundle.putString("key2",passWord);

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this, "OnStart()", Toast.LENGTH_SHORT).show();
//    }
//        @Override
//        protected void onResume() {
//            super.onResume();
//
//            button.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    if (user.getText().toString().contains(username) && pass.getText().toString().contains(password)) {
//                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                        startActivity(intent);
//                    }else{
//
//                        Toast.makeText(MainActivity.this, "Please enter correct credentials", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });}






//    @Override
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(this, "OnResume()", Toast.LENGTH_SHORT).show();
//
//        openSecond.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(this, "OnStop()", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(this, "OnPause()", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(this, "OnDestroy()", Toast.LENGTH_SHORT).show();
//
//    }





}