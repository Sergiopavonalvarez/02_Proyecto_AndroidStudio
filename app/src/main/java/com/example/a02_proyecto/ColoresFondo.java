package com.example.a02_proyecto;

import static android.graphics.Color.parseColor;

import android.graphics.Color;

public class ColoresFondo {
    private int anterior = -1;
    String [] colores;
    String [] puros;

    public ColoresFondo(){
        puros = new String[3];
        puros[0] = "#0000ff";
        puros[1] = "#ff0000";
        puros[2] = "#00ff00";
        colores=new String[14];
        colores[0]="#39add1"; //lightblue
        colores[1]="#0000ff";//pureblue
        colores[2]="#c25975";//mauve
        colores[3]="#ff0000";//purered
        colores[4]="#f9845b";//orange
        colores[5]="#838cc7";//lavender
        colores[6]="#7d669e";//purple
        colores[7]="#53bbb4";//aqua
        colores[8]="#00ff00";//pure green
        colores[9]="#e0ab18";//mustard
        colores[10]="#637a91";//dark gray
        colores[11]="#f092b0";//pink
        colores[12]="#b7c0c7";//light gray
        colores[13]="#7a2021";//gamet
    }



    public int damecolor(){

        int a = (int) (Math.random() * this.colores.length);
        return parseColor(this.colores[a]);


    }

    public int colorgarnet(){
        return parseColor(this.colores[13]);
    }

    public int colorespuro(){
        int newValue;

        do{
            newValue = (int) (Math.random() * this.puros.length);
        }while (anterior == newValue);

        anterior = newValue;
        //System.out.println(anterior);
        return parseColor(this.puros[newValue]);
    }

    public int colorFondoAleatorio(){
        int newValue;

        do{
            newValue = (int) (Math.random() * this.colores.length);
        }while (anterior == newValue);

        anterior = newValue;
        //System.out.println(anterior);
        return parseColor(this.colores[newValue]);
    }
}
