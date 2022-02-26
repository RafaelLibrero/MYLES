package com.enrashe.myles;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class Chat extends AppCompatActivity {
    private RecyclerView rvMensajes;
    private EditText etName;
    private EditText etMensaje;
    private ImageButton btnSend;

    private List<ChatMensaje> lstMensajes;
    private AdaptadorChats AdaptadorChats;

    private void setComponents() {
        rvMensajes = findViewById(R.id.rv2);
        etName = findViewById(R.id.et1);
        etMensaje = findViewById(R.id.et2);
        btnSend = findViewById(R.id.imageButton);

        lstMensajes = new ArrayList<>();
        AdaptadorChats = new AdaptadorChats(lstMensajes);
        rvMensajes.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvMensajes.setAdapter(AdaptadorChats);
        rvMensajes.setHasFixedSize(true);

        FirebaseFirestore.getInstance().collection("Chat")
                .addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                        if (e != null) {
                            Log.d("", "Error : " + e.getMessage());
                        } else {
                            for (DocumentChange mDocumentChange : queryDocumentSnapshots.getDocumentChanges()) {
                                if (mDocumentChange.getType() == DocumentChange.Type.ADDED) {
                                    lstMensajes.add(mDocumentChange.getDocument().toObject(ChatMensaje.class));
                                    AdaptadorChats.notifyDataSetChanged();
                                    rvMensajes.smoothScrollToPosition(lstMensajes.size());
                                }
                            }
                        }
                    }
                });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.length() == 0 || etMensaje.length() == 0)
                    return;
                else {
                    ChatMensaje mensajeUser = new ChatMensaje();
                    mensajeUser.setMensaje(etMensaje.getText().toString());
                    mensajeUser.setNombre(etName.getText().toString());
                    FirebaseFirestore.getInstance().collection("Chat").add(mensajeUser);
                    etMensaje.setText("");
                    //etName.setText("");
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        setComponents();
    }
}