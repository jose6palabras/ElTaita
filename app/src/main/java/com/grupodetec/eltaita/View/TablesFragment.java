package com.grupodetec.eltaita.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.grupodetec.eltaita.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TablesFragment extends Fragment implements AdapterView.OnItemClickListener{


    public TablesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tables, container, false);

        //GridView

        GridView gridView = (GridView) view.findViewById(R.id.grid_tables);
        GridAdapter gridAdapter = new GridAdapter(getContext());
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(this);
        return view;


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getContext(), PetitionsActivity.class);
        startActivity(intent);
    }
}
