package br.com.alura.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // --- Cria a lista de alunos
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Jose", "Lucas"));

        ListView ListaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);

        ListaDeAlunos.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, alunos));

        setTitle("Lista de alunos");

        /* Criando uma text view
        TextView aluno = new TextView(this);
        aluno.setText("Lucas Pereira");
        setContentView(aluno);
         */

    //    Toast.makeText(this, "Lucas", Toast.LENGTH_LONG).show();
    }
}
