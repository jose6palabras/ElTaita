package com.grupodetec.eltaita.View;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.grupodetec.eltaita.Pojos.GridPojo;
import com.grupodetec.eltaita.Pojos.GridPojoProducts;
import com.grupodetec.eltaita.R;

/**
 * Created by android on 22/01/19.
 */

public class GridAdapterProducts extends BaseAdapter {
    private Context context;

    public GridAdapterProducts(Context context) {
        this.context = context;
    }
    @Override
    public int getCount() {
        return GridPojoProducts.ITEMS.length;
    }

    @Override
    public GridPojoProducts getItem(int position) {
        return GridPojoProducts.ITEMS[position];
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

        final GridPojoProducts item = getItem(position);
        imageView.setImageResource(item.getImageproduct());
        textView.setText(item.getNameproduct());

        return view;
    }
}
