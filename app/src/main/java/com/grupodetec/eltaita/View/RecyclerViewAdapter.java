package com.grupodetec.eltaita.View;





import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.grupodetec.eltaita.R;

import java.util.List;

/**
 * Created by android on 23/01/19.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.cardViewViewHolder> {
    private List<CardViewPetitionsModel> cardViewPetitionsModels;
    private Context context;
    private int resource;


    public RecyclerViewAdapter(List<CardViewPetitionsModel> cardViewPetitionsModels, int resource, Context context) {
        this.cardViewPetitionsModels = cardViewPetitionsModels;
        this.resource = resource;
        this.context = context;
    }

    @Override
    public cardViewViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource, viewGroup, false);
        cardViewViewHolder cardViewViewHolderobj = new cardViewViewHolder(view);

        return cardViewViewHolderobj;
    }

    @Override
    public void onBindViewHolder(cardViewViewHolder holder, int position) {
        holder.tabletitle.setText(cardViewPetitionsModels.get(position).tabletitle);
        holder.value.setText(cardViewPetitionsModels.get(position).value);

    }

    @Override
    public int getItemCount() {
        return cardViewPetitionsModels.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }



    public class cardViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView cardView;
        TextView tabletitle;
        TextView value;
        Button reviewbutton;
        Button valuebutton;


        public cardViewViewHolder(final View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardview_petitions_model);
            tabletitle = (TextView) itemView.findViewById(R.id.petition_card_title);
            value = (TextView) itemView.findViewById(R.id.petition_card_value);
            reviewbutton = (Button) itemView.findViewById(R.id.review_button);
            valuebutton = (Button) itemView.findViewById(R.id.value_button);

            reviewbutton.setOnClickListener(this);
            valuebutton.setOnClickListener(this);


        }


        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = ((AppCompatActivity)context).getSupportFragmentManager();
            ConfirmFragment confirmFragment = new ConfirmFragment();
            PayFragment payFragment = new PayFragment();

            if (v.getId()==reviewbutton.getId()){

                confirmFragment.show(fragmentManager, "claro");

            }else if (v.getId() == valuebutton.getId()){

                payFragment.show(fragmentManager, "claro");
            }

        }
    }
}
