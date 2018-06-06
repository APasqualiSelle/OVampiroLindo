package com.selle.aline.vampirinhadamamae;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBotaoVermelho;
    Button mBotaoAzul;
    TextView mEstoria;
    int mNumeroIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBotaoVermelho = findViewById(R.id.botaoVermelho);
        mBotaoAzul = findViewById(R.id.botaoAzul);
        mEstoria = findViewById(R.id.estoriaTextView);

        mBotaoVermelho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mNumeroIndex == 1) {
                    mBotaoAzul.setText(R.string.T1_Resposta_Azul);
                    mBotaoVermelho.setText(R.string.T1_Resposta_Vermelha);
                    mEstoria.setText(R.string.T1_Estória);
                    mNumeroIndex = 3;
                } else if (mNumeroIndex == 3) {
                    mBotaoAzul.setText(R.string.T3_Resposta_Azul);
                    mBotaoVermelho.setText(R.string.T3_Resposta_Vermelha);
                    mEstoria.setText(R.string.T3_Estória);
                    mNumeroIndex = 4;
                } else if (mNumeroIndex == 4) {
                    mEstoria.setText(R.string.T5_Final);
                }
            }
        });

        mBotaoAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mNumeroIndex == 4){
                    mEstoria.setText(R.string.T6_Final);
                }
            }
        });

    }
}
