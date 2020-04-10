package com.example.saitama.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void inserirPedra(View view){

        this.geradorRandomico(0);
    }

    public void inserirTesoura(View view){

        this.geradorRandomico(1);
     }

    public void inserirPapel(View view){

         this.geradorRandomico(2);
    }


    // papel 0; pedra 1 e tesoura 2

    public void geradorRandomico(int numeroJogador){

        int numeroAleatorio = new Random().nextInt(3);

        ImageView resultado = findViewById(R.id.imgemResultado);
        TextView textoResultado = findViewById(R.id.textoResultado);


        if (numeroAleatorio == 0 && numeroJogador == 0 ){

            resultado.setImageResource(R.drawable.papel);
            textoResultado.setText("Voce perdeu");
        }else
            if (numeroAleatorio == 1 && numeroJogador == 1){

            resultado.setImageResource(R.drawable.pedra);
            textoResultado.setText("Voce Perdeu");
        }else
            if (numeroAleatorio == 2 && numeroJogador == 2){

            resultado.setImageResource(R.drawable.tesoura);
            textoResultado.setText("Voce Perdeu");

        }else
            if(numeroAleatorio == 0 && numeroJogador == 2){
                resultado.setImageResource(R.drawable.papel);
                textoResultado.setText("Empatamos");

        }else
            if(numeroAleatorio == 1 && numeroJogador == 0){
                resultado.setImageResource(R.drawable.pedra);
                textoResultado.setText("Empatamos");

        }else
            if(numeroAleatorio == 2 && numeroJogador == 1){
                resultado.setImageResource(R.drawable.tesoura);
                textoResultado.setText("Empatamos");
        } else
            if(numeroAleatorio == 0 && numeroJogador == 1){
               resultado.setImageResource(R.drawable.papel);
                textoResultado.setText("Voce ganhou");

       }else
            if(numeroAleatorio == 1 && numeroJogador == 2){
               resultado.setImageResource(R.drawable.pedra);
               textoResultado.setText("Voce ganhou");

        }else
            if(numeroAleatorio == 2 && numeroJogador == 0){
              resultado.setImageResource(R.drawable.tesoura);
                textoResultado.setText("Voce ganhou");
    }



    }
}
