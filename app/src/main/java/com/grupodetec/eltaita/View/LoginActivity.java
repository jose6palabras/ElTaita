package com.grupodetec.eltaita.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.grupodetec.eltaita.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void guestLogin (View view){
        Intent intentguest = new Intent(this, HomeActivity.class);
        startActivity(intentguest);
    }
}
