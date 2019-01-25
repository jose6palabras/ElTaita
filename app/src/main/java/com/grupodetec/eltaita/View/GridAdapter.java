package com.grupodetec.eltaita.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.grupodetec.eltaita.Pojos.GridPojo;
import com.grupodetec.eltaita.R;

/**
 * Created by android on 20/01/19.
 */

public class GridAdapter extends BaseAdapter {
    private Context context;

    public GridAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return GridPojo.ITEMS.length;
    }

    @Override
    public GridPojo getItem(int position) {
        return GridPojo.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item_model, viewGroup, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.table);
        TextView textView = (TextView) view.findViewById(R.id.positiontable);

        final GridPojo item = getItem(position);
        imageView.setImageResource(item.getIdtables());
        textView.setText(item.getPosition());

        return view;
    }
}
