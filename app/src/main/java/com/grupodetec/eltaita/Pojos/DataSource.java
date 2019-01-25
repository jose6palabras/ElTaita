package com.grupodetec.eltaita.Pojos;

import com.grupodetec.eltaita.View.CardViewPetitionsModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 23/01/19.
 */

public class DataSource {
    public DataSource() {
    }
    public List<CardViewPetitionsModel> actualPetition(){
        List<CardViewPetitionsModel> cardViewPetitionsModels;
        cardViewPetitionsModels = new ArrayList<>();
        cardViewPetitionsModels.add(new CardViewPetitionsModel("A1", "2300"));
        cardViewPetitionsModels.add(new CardViewPetitionsModel("B1", "5300"));
        cardViewPetitionsModels.add(new CardViewPetitionsModel("Lab", "5300"));
        cardViewPetitionsModels.add(new CardViewPetitionsModel("C4", "5800"));
        cardViewPetitionsModels.add(new CardViewPetitionsModel("Pc", "12200"));
        return cardViewPetitionsModels;
    }
}
