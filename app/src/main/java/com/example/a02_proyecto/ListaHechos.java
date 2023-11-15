package com.example.a02_proyecto;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ListaHechos {
    String[] curiosidades;

    /*   public ListaHechos() {
           curiosidades = new String[10];
           curiosidades[0] = "Símbolo químico: El zinc tiene el símbolo químico \"Zn\" " +
                   "en la tabla periódica. Es el elemento número 30 en la tabla.\n";
           curiosidades[1] = "Descubrimiento: El zinc ha sido conocido y utilizado desde la " +
                   "antigüedad, pero fue aislado como elemento en su forma metálica por primera vez" +
                   " en el siglo XIII en la India.\n";
           curiosidades[2] = "\n" +
                   "Color y brillo: El zinc es un metal de color blanco azulado con un brillo metálico" +
                   " cuando está recién expuesto a la atmósfera. Sin embargo, puede volverse opaco" +
                   " con el tiempo debido a la formación de una capa de óxido en su superficie.\n";
           curiosidades[3] = "Abundancia: El zinc es el 24º elemento más abundante en la corteza" +
                   " terrestre y se encuentra en minerales como la esfalerita (sulfuro de zinc) y" +
                   " la smithsonita (carbonato de zinc).\n";
           curiosidades[4] = "Usos industriales: El zinc se utiliza en numerosas aplicaciones" +
                   " industriales, incluyendo la galvanización del acero para protegerlo de la" +
                   " corrosión, la fabricación de aleaciones metálicas (como el latón y el bronce)," +
                   " y en la producción de baterías.\n";
           curiosidades[5] = "Importancia biológica: El zinc es un micronutriente esencial para" +
                   " los seres vivos, incluyendo los humanos. Es necesario para una variedad de" +
                   " funciones biológicas, incluyendo el funcionamiento de enzimas y la regulación" +
                   " del sistema inmunológico.\n";
           curiosidades[6] = "\n" +
                   "Reciclaje: El zinc es altamente reciclable. El reciclaje del zinc es" +
                   " económicamente viable y beneficioso para el medio ambiente, ya que reduce la" +
                   " necesidad de extraer y procesar más mineral de zinc.\n";
           curiosidades[7] = "Conductividad eléctrica: El zinc es un buen conductor de" +
                   " electricidad y se utiliza en aplicaciones eléctricas, como la fabricación de" +
                   " pilas y baterías.\n" +
                   "\n";
           curiosidades[8] = "Efecto de los vapores de zinc: La inhalación de vapores de zinc " +
                   "puede causar síntomas similares a la gripe, conocidos como \"fiebre del cinc\" " +
                   "o \"fiebre de los vapores metálicos\". Es una afección temporal que suele" +
                   " ocurrir cuando se calienta el zinc.\n";
           curiosidades[9] = "\n" +
                   "Toxicidad: Aunque el zinc es esencial para la vida, la ingestión excesiva de" +
                   " zinc a través de la dieta o la exposición ocupacional a altas concentraciones" +
                   " de zinc puede ser tóxica y causar problemas de salud, como náuseas" +
                   ", vómitos y diarrea.";
       }*/
    public String getcuriosidad() {

        int a = (int) (Math.random() * curiosidades.length);
        return curiosidades[a];

    }

    public String primera() {
        return curiosidades[0];
    }


    public String impar() {
        ArrayList<String> impares = new ArrayList<>();
        for (int i = 1; i < curiosidades.length; i += 2) {

            impares.add(curiosidades[i]);


        }

        String[] impares1 = impares.toArray(new String[0]);
        int a = (int) (Math.random() * impares1.length);
        return impares1[a];

    }

    public String Vocal() {
        ArrayList<String> vocales = new ArrayList<>();
        for (int i = 0; i < curiosidades.length; i++) {
            String aux = curiosidades[i];
            char a = Character.toLowerCase(aux.charAt(0));


            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                vocales.add(curiosidades[i]);
            }


        }
        String[] vocales1 = vocales.toArray(new String[0]);
        int a = (int) (Math.random() * vocales1.length);
        return vocales1[a];


    }


}



