package com.grupodetec.eltaita.Pojos;

import com.grupodetec.eltaita.R;

/**
 * Created by android on 20/01/19.
 */

public class GridPojo {
    private String positiont;
    private int idtables;

    public GridPojo(String positiont, int idtables) {
        this.positiont = positiont;
        this.idtables = idtables;
    }

    public String getPosition() {
        return positiont;
    }

    public int getIdtables() {
        return idtables;
    }

    public int getId() {
        return positiont.hashCode();
    }

    public static GridPojo[] ITEMS = {
      new GridPojo("Papelería", R.drawable.colortable),
            new GridPojo("no", R.drawable.colortable),
            new GridPojo("Cuadro", R.drawable.colortable),
            new GridPojo("no", R.drawable.colortable),
            new GridPojo("A5", R.drawable.colortable),
            new GridPojo("B5", R.drawable.colortable),
            new GridPojo("C5", R.drawable.colortable),
            new GridPojo("PC", R.drawable.colortable),
            new GridPojo("A4", R.drawable.colortable),
            new GridPojo("B4", R.drawable.colortable),
            new GridPojo("C4", R.drawable.colortable),
            new GridPojo("no", R.drawable.colortable),
            new GridPojo("A3", R.drawable.colortable),
            new GridPojo("B3", R.drawable.colortable),
            new GridPojo("C3", R.drawable.colortable),
            new GridPojo("no", R.drawable.colortable),
            new GridPojo("A2", R.drawable.colortable),
            new GridPojo("B2", R.drawable.colortable),
            new GridPojo("C2", R.drawable.colortable),
            new GridPojo("Lab", R.drawable.colortable),
            new GridPojo("A1", R.drawable.colortable),
            new GridPojo("B1", R.drawable.colortable),
            new GridPojo("C1", R.drawable.colortable),
            new GridPojo("Odonto", R.drawable.colortable)
    };
    public static GridPojo getItem(int id) {
        for (GridPojo item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
