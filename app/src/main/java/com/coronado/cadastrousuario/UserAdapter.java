package com.coronado.cadastrousuario;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

// Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecyclerView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    // Atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> ListaUsuarios;

    // Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> lista){
        this.listaUsuarios = lista;
    }

    // Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
}
