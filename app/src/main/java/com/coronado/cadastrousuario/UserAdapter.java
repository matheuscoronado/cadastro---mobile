package com.coronado.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

// Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecyclerView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    // Atributo privado que armazena a referencia dos dados que serão exibidos
    private List<String> listaUsuarios;

    // Construtor que permite que a MainActivity "entregue" a lista de dados para este Adapter
    public UserAdapter(List<String> lista){
        this.listaUsuarios = lista;
    }

    // Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        // LayoutInflater transforma o arquivo XML em um objeto View Java
        // Aqui usamos um layout padrão do android (simple_list_item_1) para facilitar
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent,false);

        // Retorna uma nova instância da nossa classe interna ViewHolder com a view criada
        return new ViewHolder(view);
    }

    // Metodo 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
        // Recupera os dados da lista de acordo com a posição que o Android está desenhando agora
        String nome = listaUsuarios.get(position);

        // Define o texto no componente visual que está guardado dentro do 'holder'
        holder.tvNome.setText(nome);
    }

    // Metodo 3: Informa ao Android quantos itens a lista possui ao todo
    @Override
    public int getItemCount(){
        // Se a lista existir, retorna o tamanho, se não, retorna zero
        return listaUsuarios != null ? listaUsuarios.size(): 0;
    }

    // Classe interna viewHolder: Servir para "segurar" as referências dos componentes de cada linha
    // Evitar chamadas respectivas ao findviewById, melhorando a performance do RecycleView

    public class ViewHolder extends RecyclerView.ViewHolder{
        // Referência para o textView da linha
        TextView tvNome;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            // Faz o mapeamento do ID do layout para o objeto java
            // Android.R.id.text1 é o Id padrão do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }

}
