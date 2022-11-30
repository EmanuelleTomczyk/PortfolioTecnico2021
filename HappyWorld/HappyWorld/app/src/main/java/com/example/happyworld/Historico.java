package com.example.happyworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class Historico extends AppCompatActivity {
    String usuarioID;
    TextView h_eco, h_hid, h_carb;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
        getSupportActionBar().hide();
        h_eco = findViewById(R.id.h_eco);
        h_hid = findViewById(R.id.h_hidri);
        h_carb = findViewById(R.id.h_carb);
        h_hid.setVisibility(View.INVISIBLE);
        h_eco.setVisibility(View.INVISIBLE);
        h_carb.setVisibility(View.INVISIBLE);
        p_eco();
    }

    public void p_eco() {
        onStart();
        usuarioID = FirebaseAuth.getInstance().getCurrentUser().getUid();
        DocumentReference documentReference = db.collection("HappyWorld").document(usuarioID);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException error) {
                if (documentSnapshot != null) {
                    h_eco.setText(documentSnapshot.getString("resultado_eco"));
                }
            }
        });
    }
}