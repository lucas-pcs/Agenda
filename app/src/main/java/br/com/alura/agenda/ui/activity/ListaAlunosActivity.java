package br.com.alura.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.alura.agenda.R;

public class ListaAlunosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        // --- Cria a lista de alunos
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Jose", "Lucas"));

        ListView ListaDeAlunos = findViewById(R.id.activity_lista_aluno_listview);

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
