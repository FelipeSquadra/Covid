package com.example.covid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SintomasActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private TextView textUsuario;

    // private String[] sintomasCovid = {"febre","tosse", "falta de ar", "cansaço"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);


    }

    public void capturarSintomas(View view) {


        String febre = "A febre é o sintoma mais comum do novo coronavírus, presente em 88% dos casos, de acordo com a OMS (Organização Mundial da Saúde). Além da alta temperatura do corpo (acima de 37,8°C), a febre envolve também fraqueza, dor de cabeça e mal-estar. Ela aparece justamente quando o organismo tem que combater algum vírus ou bactéria, fazendo-o elevar a temperatura 2°C ou 3°C acima do normal. Mas ainda não se sabe se ela de fato ajuda na defesa do corpo ou se é apenas um efeito incidental.Se ela não for maior do que 39°C e não durar mais do que dois ou três dias, é considerada um sintoma leve de um possível coronavírus e, portanto, deve ser tratada em casa.\nComo cessar a febre em casa O governo quer priorizar o atendimento em postos de saúde e hospitais para quem tem sintomas mais graves, como dificuldade para respirar. A medida é para evitar que se aumente ainda mais o número de infectados no sistema de saúde. Isso também funciona para não superlotar os ambulatórios e leitos, que devem ser reservados para quem já está com falta de ar.Portanto, a recomendação é que se use antitérmicos, como dipirona e paracetamol, para baixar a temperatura. O uso do ibuprofeno segue polêmico. No caso de a febre não diminuir com os medicamentos, algumas dicas caseiras podem ajudar:" +
                "1. Tome um banho de água morna ou levemente fria\n2. Faça compressas frias no tronco e nos membros usando toalha úmida ou bolsa térmica.\n3. Alimente-se bem, com alimentos leves e saudáveis, nada de fast food.\n3. Fique em repouso e evite sobrecarregar o organismo com atividades físicas\n4. Hidrate-se para repor a água perdida durante a febre. A água também ajuda na regulação térmica do organismo.";
        String cancaco = " Texto sobre Cansaço";
        String pneumonia = "Texto sobre Pneumonia";
        String faltaDeAr = "Texto sobre Falta de Ar";

        editTextUsuario = findViewById(R.id.editTextSintomas);
        textUsuario = findViewById(R.id.textResultado);
        String sintoma = editTextUsuario.getText().toString();


        if (sintoma.equals("febre")) {
            textUsuario.setText(febre);
        } else if (sintoma.equals("cansaço")) {
            textUsuario.setText(cancaco);

        } else if (sintoma.equals("pneumonia")) {
            textUsuario.setText(pneumonia);

        } else if (sintoma.equals("falta de ar")) {
            textUsuario.setText(sintoma);

        } else
            textUsuario.setText(faltaDeAr);
    }


}
