package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recycler.adapter.ContactsAdapter;
import com.example.recycler.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add( new Contacts("Saugat Malla", "9843696526","saugat@gmail.com","Satungal", R.drawable.saugat));
        contactsList.add( new Contacts("Rajesh Hamal", "9843696526","rajesh@gmail.com","Satungal", R.drawable.rajesh));
        contactsList.add( new Contacts("Dayahang Rai", "9843696526","daya@gmail.com","Satungal", R.drawable.dahayang));
        contactsList.add( new Contacts("Bhuwan K.C.", "9843696526","bhuwan@gmail.com","Satungal", R.drawable.bhuwan));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
