package com.example.some.jun20;

/**
 * Created by 205263 on 8/27/15.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Game extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);

        Button button_one, button_two, button_three;

        button_one = (Button)findViewById(R.id.button1);
        button_two = (Button)findViewById(R.id.button2);
        button_three = (Button)findViewById(R.id.button3);

    }


    public void option_one_Click(View view) {

        setContentView(R.layout.ans1);
        Toast.makeText(this, "Wow, you win a car!",Toast.LENGTH_LONG).show();
    }

    public void option_two_Click(View view) {

        setContentView(R.layout.ans2);
        Toast.makeText(this,"You Lost!",Toast.LENGTH_LONG).show();


    }

    public void option_three_Click(View view) {

        setContentView(R.layout.ans3);
        Toast.makeText(this, "You win gifts!!!",Toast.LENGTH_LONG).show();
    }

}
