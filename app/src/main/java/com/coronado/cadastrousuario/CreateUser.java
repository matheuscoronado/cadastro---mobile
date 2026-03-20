package com.coronado.cadastrousuario;

// Bloco de Importação
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;

// Classe principal
public class CreateUser extends AppCompatActivity {
    TextInputEditText editNome, editEmail;
    Button btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        // Víncula variável com elemento da interface gráfica, escrito no arquivo XML
        editNome = findViewById(R.id.nome_completo);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if (!nome.isBlank()){
                MainActivity.listaNomes.add(nome + "("+ email + ")";
                finish();
            }
        });


    }

}
