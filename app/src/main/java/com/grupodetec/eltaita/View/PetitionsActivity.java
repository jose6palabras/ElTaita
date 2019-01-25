package com.grupodetec.eltaita.View;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.grupodetec.eltaita.R;

public class PetitionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petitions);

        //GridView

        GridView gridView = (GridView) findViewById(R.id.grid_products);
        GridAdapterProducts gridAdapterProducts = new GridAdapterProducts(this);
        gridView.setAdapter(gridAdapterProducts);

    }
    public void confirm(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        ConfirmFragment confirmFragment = new ConfirmFragment();
        confirmFragment.show(fragmentManager, "petition confirmation");
    }
}
