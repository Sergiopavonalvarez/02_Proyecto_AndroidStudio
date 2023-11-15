package com.example.a02_proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ListaHechos lh;
    ColoresFondo cf = new ColoresFondo();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }


        public void boton1 (View vista){
            TextView forma = findViewById(R.id.curiosidad);
          //  forma.setText(lh.primera());
            int i=(int) (Math.random()*10);
            String [] arrayString=getResources().getStringArray(R.array.ArrayHechos);
            forma.setText(arrayString[0]);

            View fondo = findViewById(R.id.fondo);
            fondo.setBackgroundColor(new ColoresFondo().colorgarnet());
        }

        public void boton2 (View vista){
            TextView forma2 = findViewById(R.id.curiosidad);
            //forma2.setText(lh.impar());
            String [] arrayString=getResources().getStringArray(R.array.ArrayHechos);
            ArrayList<String> impares= new ArrayList<>();
            for (int i = 1; i < arrayString.length; i+=2) {
                impares.add(arrayString[i]);
            }
            String [] impares1= impares.toArray(new String [0]);
            int a = (int) (Math.random() * impares1.length);
            forma2.setText(impares1[a]);
            View fondo1 = findViewById(R.id.fondo);
            fondo1.setBackgroundColor(cf.colorespuro());

        }

    public void boton3 (View vista){
        TextView forma3 = findViewById(R.id.curiosidad);
        //forma3.setText(lh.Vocal());
        String [] arrayString=getResources().getStringArray(R.array.ArrayHechos);

        ArrayList <String> vocales= new ArrayList<>();
        for (int i = 0; i < arrayString.length; i++) {
            String aux = arrayString[i];
            char a = Character.toLowerCase(aux.charAt(0));
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                vocales.add(arrayString[i]);
            }
        }
        String [] vocales1= vocales.toArray(new String [0]);
        int a = (int) (Math.random() * vocales1.length);
        forma3.setText(vocales1[a]);
        View fondo3 = findViewById(R.id.fondo);
        fondo3.setBackgroundColor(cf.colorFondoAleatorio());
        }

    public void boton4 (View vista) {
        //lh = new ListaHechos();
        TextView forma = findViewById(R.id.curiosidad);
        int a = (int)Math.floor(Math.random()*(9-0+1)+(0));
        //forma.setText(lh.getcuriosidad());
        int i=(int) (Math.random()*10);
        System.out.println(i);
        String [] arrayString=getResources().getStringArray(R.array.ArrayHechos);
        forma.setText(arrayString[i]);

           /* switch(i){
                case 0: forma.setText(getResources().getStringArray(R.array.ArrayHechos));break;
                case 1: forma.setText(getString(R.string.Hecho_curioso_1));break;
                case 2: forma.setText(getString(R.string.Hecho_curioso_2));break;
                case 3: forma.setText(getString(R.string.Hecho_curioso_3));break;
                case 4: forma.setText(getString(R.string.Hecho_curioso_4));break;
                case 5: forma.setText(getString(R.string.Hecho_curioso_5));break;
                case 6: forma.setText(getString(R.string.Hecho_curioso_6));break;
                case 7: forma.setText(getString(R.string.Hecho_curioso_7));break;
                case 8: forma.setText(getString(R.string.Hecho_curioso_8));break;
                case 9: forma.setText(getString(R.string.Hecho_curioso_9));break;
            }*/
        View fondo = findViewById(R.id.fondo);
        fondo.setBackgroundColor(new ColoresFondo().damecolor());
    }
    }



