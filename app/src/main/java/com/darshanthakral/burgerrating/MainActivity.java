package com.darshanthakral.burgerrating;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.starts);
        message = findViewById(R.id.message);
    }

    @SuppressLint("SetTextI18n")
    public void submit(View view) {

        float ratingValue = ratingBar.getRating();

        if(ratingValue < 2){
            message.setText("Rating: " + ratingValue + ":(" + "\n We will work hard!");
        }else if (ratingValue >=2 && ratingValue <=3){
            message.setText("Rating: " + ratingValue + ":|" + "\n We need to work for those remaining starts!");
        }else if (ratingValue > 3 && ratingValue <= 4){
            message.setText("Rating: " + ratingValue + ":)" + "\n You are one of our genuine customer!");
        }else if (ratingValue >4 && ratingValue <=4.5){
            message.setText("Rating: " + ratingValue + ":~)" + "\n We are almost there to gain 100% from you!");
        }else if (ratingValue >4.5 && ratingValue <=5){
            message.setText("Rating: " + ratingValue + ":*)" +  "\n Thankyouuuuuu!");
        }
    }
}