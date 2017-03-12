package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        hen1.getCountOfEggsPerMonth();
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        hen2.getCountOfEggsPerMonth();
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen3.getCountOfEggsPerMonth();

        System.out.println(hen.getDescription());
        System.out.println(hen1.getDescription());
        System.out.println(hen2.getDescription());
        System.out.println(hen3.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.RUSSIA)){
               hen = new RussianHen();
            }else if (country.equals(Country.UKRAINE)){
                hen = new UkrainianHen();
            }else if (country.equals(Country.MOLDOVA)){
                hen = new MoldovanHen();
            }else if (country.equals(Country.BELARUS)){
                hen = new BelarusianHen();
            }
            //напишите тут ваш код
            return hen;
        }
    }

}

 abstract class Hen {
    String strana = "";

    public abstract int getCountOfEggsPerMonth();

    String getDescription() {
        return "Я - курица.";
    }
}