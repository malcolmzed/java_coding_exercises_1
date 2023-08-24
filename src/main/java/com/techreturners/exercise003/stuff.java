package com.techreturners.exercise003;

public class stuff {

    public static class icecream {
        String  flavour;
        int     code;

        private icecream (String f, int c) {
            this.flavour = f;
            this.code = c;
        }

        public static icecream[] theIcecreams = {
                new icecream("Pistachio",           98  ),
                new icecream("Raspberry Ripple",    1   ),
                new icecream("Vanilla",             12  ),
                new icecream("Mint Chocolate Chip", 3   ),
                new icecream("Chocolate",           99  ),
                new icecream("Mango Sorbet",        5   )
        };

    }

}
