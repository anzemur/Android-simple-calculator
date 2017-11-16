package com.example.prvaaplikacija.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView rezultat;
    TextView showResult;
    final float[] vrednostEna = new float[1];
    final float[] vrednostDva = new float[1];




    final boolean[] ukaz = new boolean[1];

    final String[] znak = new String[1];






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rezultat = (TextView) findViewById(R.id.rezultat);
        showResult = (TextView) findViewById(R.id.result);









        //1
        Button ena =(Button) findViewById(R.id.ena);
        ena.setOnClickListener(new View.OnClickListener(){

          @Override
            public void onClick(View view){

              if(ukaz[0]){
                  if(vrednostDva[0] == 0.0){
                      vrednostDva[0] = 1;
                      rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                  }else{
                      vrednostDva[0] = vrednostDva[0]*10 + 1;
                      rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                  }
              }else{
                  if(vrednostEna[0] == 0.0) {
                      vrednostEna[0] = 1;
                      rezultat.setText(Float.toString(vrednostEna[0]));

                  }else{
                      vrednostEna[0] = vrednostEna[0]*10 + 1;
                      rezultat.setText(Float.toString(vrednostEna[0]));
                  }
              }

          }
        });


        //2
        Button dva =(Button) findViewById(R.id.dva);
        dva.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 2;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 2;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 2;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +2;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });

        //3
        Button tri =(Button) findViewById(R.id.tri);
        tri.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 3;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 3;
                        rezultat.setText(String.format("%.1f %s %1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 3;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +3;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });



        //4
        Button stiri =(Button) findViewById(R.id.stiri);
        stiri.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 4;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 4;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 4;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +4;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }
                }
            }
        });

        Button pet =(Button) findViewById(R.id.pet);
        pet.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 5;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 5;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 5;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +5;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });

        Button sest =(Button) findViewById(R.id.sest);
        sest.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 6;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 6;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 6;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +6;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });

        Button sedem =(Button) findViewById(R.id.sedem);
        sedem.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 7;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 7;
                        rezultat.setText(String.format("%.1f %s %1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 7;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +7;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });

        Button osem =(Button) findViewById(R.id.osem);
        osem.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 8;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 8;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 8;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +8;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });

        Button devet =(Button) findViewById(R.id.devet);
        devet.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 9;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 9;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 9;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +9;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });


        Button nula =(Button) findViewById(R.id.nula);
        nula.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){

                if(ukaz[0]){
                    if(vrednostDva[0] == 0.0){
                        vrednostDva[0] = 0;
                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }else{
                        vrednostDva[0] = vrednostDva[0]*10 + 0;

                        rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));
                    }
                }else{
                    if(vrednostEna[0] == 0.0) {
                        vrednostEna[0] = 0;
                        rezultat.setText(Float.toString(vrednostEna[0]));

                    }else{
                        vrednostEna[0] = vrednostEna[0]*10 +0;
                        rezultat.setText(Float.toString(vrednostEna[0]));
                    }
                }
            }
        });


        /*   UKAZI   */

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                ukaz[0] = true;
                znak[0] = "+";
                rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));




            }
        });

        Button minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                ukaz[0] = true;
                znak[0] = "-";
                rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));




            }
        });

        Button deljeno = (Button) findViewById(R.id.deljenje);
        deljeno.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                ukaz[0] = true;
                znak[0] = "/";
                rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));


            }
        });

        Button krat = (Button) findViewById(R.id.mnozenje);
        krat.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                ukaz[0] = true;
                znak[0] = "x";
                rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));




            }
        });

        Button celostevilsko = (Button) findViewById(R.id.celo);
        celostevilsko.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                ukaz[0] = true;
                znak[0] = "%";
                rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));


            }
        });

        Button jeEnako = (Button) findViewById(R.id.je);
        jeEnako.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){




                float rez = 0;

                switch(znak[0]){

                    case "+":

                        rez = vrednostEna[0] + vrednostDva[0];
                        rezultat.setText(Float.toString(rez));
                        vrednostEna[0] = rez;
                        vrednostDva[0] = 0;
                        ukaz[0] = false;
                        znak[0] = "";
                        break;

                    case "-":

                        rez = vrednostEna[0] - vrednostDva[0];
                        rezultat.setText(Float.toString(rez));
                        vrednostEna[0] = rez;
                        vrednostDva[0] = 0;
                        ukaz[0] = false;
                        znak[0] = "";
                        break;

                    case "x":

                        rez = vrednostEna[0] * vrednostDva[0];
                        rezultat.setText(Float.toString(rez));
                        vrednostEna[0] = rez;
                        vrednostDva[0] = 0;
                        ukaz[0] = false;
                        znak[0] = "";
                        break;

                    case "/":

                        rez = vrednostEna[0] / vrednostDva[0];
                        rezultat.setText(Float.toString(rez));
                        vrednostEna[0] = rez;
                        vrednostDva[0] = 0;
                        ukaz[0] = false;
                        znak[0] = "";
                        break;

                    case "%":

                        rez = vrednostEna[0] % vrednostDva[0];
                        rezultat.setText(Float.toString(rez));
                        vrednostEna[0] = rez;
                        vrednostDva[0] = 0;
                        ukaz[0] = false;
                        znak[0] = "";
                        break;
                }
            }
        });

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                vrednostEna[0] = 0;
                vrednostDva[0] = 0;
                ukaz[0] = false;
                znak[0] = "";
                rezultat.setText("0.0");
            }
        });

        ImageButton brisi = (ImageButton) findViewById(R.id.brisi);
        brisi.setOnClickListener(new View.OnClickListener(){

            @Override

            public void onClick(View view){

                if(ukaz[0] && vrednostDva[0] == 0.0){
                    rezultat.setText(String.format("%.1f %s", vrednostEna[0], znak[0]));

                }else if(ukaz[0] && vrednostDva[0] > 0.0){

                    float temp = vrednostDva[0] % 10;

                    vrednostDva[0] = vrednostDva[0] - temp;
                    vrednostDva[0] = vrednostDva[0]/10;
                    rezultat.setText(String.format("%.1f %s %.1f", vrednostEna[0], znak[0], vrednostDva[0]));

                }else if(!ukaz[0]){
                    float temp = vrednostEna[0] % 10;

                    vrednostEna[0] = vrednostEna[0] - temp;
                    vrednostEna[0] = vrednostEna[0]/10;
                    rezultat.setText(Float.toString(vrednostEna[0]));
                }

            }
        });





    }
}
