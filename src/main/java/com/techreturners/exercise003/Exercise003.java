package com.techreturners.exercise003;

import static com.techreturners.exercise003.stuff.*;

public class Exercise003 {

    int getIceCreamCode(String iceCreamFlavour) {
        int theCode = -1;

        for (int i=0; i<icecream.theIcecreams.length; i++)
        {
            if ( iceCreamFlavour.equals(icecream.theIcecreams[i].flavour)){
                theCode = icecream.theIcecreams[i].code;
                break;
            }
        }

        return theCode;
    }

    String[] iceCreamFlavours() {
        String[]  theFlavours = new String[icecream.theIcecreams.length];

        for (int i=0; i<icecream.theIcecreams.length; i++)
            theFlavours[i] = icecream.theIcecreams[i].flavour;

        return theFlavours;
        //throw new UnsupportedOperationException(("You can delete this statement and add your code here."));
    }

}
