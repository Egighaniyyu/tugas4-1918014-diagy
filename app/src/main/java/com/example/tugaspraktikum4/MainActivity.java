package com.example.tugaspraktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FriendsAdapter adapter;
    private ArrayList<Friends> friendsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new FriendsAdapter(friendsArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        friendsArrayList = new ArrayList<>();
        friendsArrayList.add(new Friends(R.drawable.a, "Adinata Emery Orlando", "Sibuk"));
        friendsArrayList.add(new Friends(R.drawable.b, "Elzira Virgina Sandhika", "Halooo"));
        friendsArrayList.add(new Friends(R.drawable.c, "Susilo Wati", "Idle"));
        friendsArrayList.add(new Friends(R.drawable.d, "Alifia Indrasari", "Hello World"));
        friendsArrayList.add(new Friends(R.drawable.e, "Wahyu Anggara Widodo", "Play with burung"));
    }
}