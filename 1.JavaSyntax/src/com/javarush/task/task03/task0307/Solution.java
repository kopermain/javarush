package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();

        zerg1.name = "zerg1";
        zerg2.name = "zerg2";
        zerg3.name = "zerg3";
        zerg4.name = "zerg4";
        zerg5.name = "zerg5";
        zerg6.name = "zerg6";
        zerg7.name = "zerg7";
        zerg8.name = "zerg8";
        zerg9.name = "zerg9";
        zerg10.name = "zerg10";

        Protoss protos1 = new Protoss();
        Protoss protos2 = new Protoss();
        Protoss protos3 = new Protoss();
        Protoss protos4 = new Protoss();
        Protoss protos5 = new Protoss();

        protos1.name = "protos1";
        protos2.name = "protos2";
        protos3.name = "protos3";
        protos4.name = "protos4";
        protos5.name = "protos5";


        Terran teran1 = new Terran();
        Terran teran2 = new Terran();
        Terran teran3 = new Terran();
        Terran teran4 = new Terran();
        Terran teran5 = new Terran();
        Terran teran6 = new Terran();
        Terran teran7 = new Terran();
        Terran teran8 = new Terran();
        Terran teran9 = new Terran();
        Terran teran10 = new Terran();
        Terran teran11 = new Terran();
        Terran teran12 = new Terran();

        teran1.name = "teran1";
        teran2.name = "teran2";
        teran3.name = "teran3";
        teran4.name = "teran4";
        teran5.name = "teran5";
        teran6.name = "teran6";
        teran7.name = "teran7";
        teran8.name = "teran8";
        teran9.name = "teran9";
        teran10.name = "teran10";
        teran11.name = "teran11";
        teran12.name = "teran12";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
