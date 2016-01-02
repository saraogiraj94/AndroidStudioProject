package com.example.raj.myapplication2;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout main;
    TextView userName,passsword,message;
    EditText userNameValue,passwordValue;
    Button login ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        setContentView(main);

    }

    public void init(){
        main= new RelativeLayout(this);
        RelativeLayout.LayoutParams mainDimaension= new  RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

        userName = new TextView(this);
        passsword= new TextView(this);
        message= new TextView(this);
        userNameValue = new EditText(this);
        passwordValue = new EditText(this);
        login=new Button(this);
    }

    private void textMessage(){


    }
}
