package com.coronado.cadastrousuario;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Declarações dos componentes visuais e do adaptador da lista
    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    // Atenção: Atributo estatico(stratic) permite que os dados persistem na memória
    // Enquanto o app estiver aberto e sejam acessados diretamente por outras telas (Activities)
    public static List<String> listaNomes = new ArrayList<>();

    // Metodo de inicialização da Activity (Ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        // Vincula o arquivo de layout XML (activity_main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        // Regra de negocio: Insere um texto no topo da lista, caso ela esteja vazia
        if (listaNomes.isEmpty()){
            listaNomes.add("Nomes de cadastro");
        }

        // Mapeamento dos componentes do RecyclerView do XML para o objeto java
        recyclerView = findViewById(R.id.recycler_view);

        // Define o LayoutManager: organiza itens da lista em uma coluna vertical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}