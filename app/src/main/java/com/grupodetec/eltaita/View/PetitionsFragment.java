package com.grupodetec.eltaita.View;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grupodetec.eltaita.Pojos.DataSource;
import com.grupodetec.eltaita.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PetitionsFragment extends Fragment {


    public PetitionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_petitions, container, false);


        //set recycler view

        final RecyclerView recyclerView = view.findViewById(R.id.petition_recyclerview);
        recyclerView.setHasFixedSize(true);

        //set layoutmanager

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //set adapter

        final DataSource dataSource = new DataSource();

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(dataSource.actualPetition(), R.layout.cardview_pedidos, getContext());
        recyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

}
