package com.enrashe.myles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class Publicaciones extends AppCompatActivity {
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference prueba = db.collection("blog");
    private AdapterPost adapterPost;
    RecyclerView rvBlog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicaciones);
        setUpRecyclerView();


    }

    private void setUpRecyclerView() {
        Query query = prueba.orderBy("titulo", Query.Direction.ASCENDING);
        FirestoreRecyclerOptions<BlogElementos> options = new FirestoreRecyclerOptions.Builder<BlogElementos>()
                .setQuery(query, BlogElementos.class)
                .build();
        adapterPost = new AdapterPost(options);

        rvBlog = findViewById(R.id.rvCasa);
        rvBlog.setLayoutManager(new LinearLayoutManager(this));
        rvBlog.setHasFixedSize(true);
        rvBlog.setAdapter(adapterPost);


    }

    @Override
    protected void onStop() {
        super.onStop();
        adapterPost.stopListening();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapterPost.startListening();
    }
}