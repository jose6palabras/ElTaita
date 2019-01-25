package com.grupodetec.eltaita.Pojos;

import com.grupodetec.eltaita.R;

/**
 * Created by android on 22/01/19.
 */

public class GridPojoProducts {
    private String nameproduct;
    private int imageproduct;

    public GridPojoProducts(String nameproduct, int imageproduct) {
        this.nameproduct = nameproduct;
        this.imageproduct = imageproduct;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public int getImageproduct() {
        return imageproduct;
    }

    public int getId() {
        return nameproduct.hashCode();
    }

    public static GridPojoProducts[] ITEMS = {

            new GridPojoProducts("Tinto", R.drawable.colortable),
            new GridPojoProducts("Perico", R.drawable.colortable),
            new GridPojoProducts("Empanada", R.drawable.empanadas),
            new GridPojoProducts("Pizza", R.drawable.empanadas),
            new GridPojoProducts("Hamburguesa", R.drawable.empanadas),
            new GridPojoProducts("Salchipapa", R.drawable.colortable)
    };
    public static GridPojoProducts getItem(int id) {
        for (GridPojoProducts item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
