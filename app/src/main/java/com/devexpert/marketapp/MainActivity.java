package com.devexpert.marketapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devexpert.marketapp.adapter.ItemsAdapter;
import com.devexpert.marketapp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener {


    RecyclerView recyclerView;

    List<Item> itemList;

    ItemsAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        itemList = new ArrayList<>();

        Item fruits = new Item(R.drawable.fruits, "Fruits", "Bucket of fresh fruits");
        Item vegetables = new Item(R.drawable.vegetables, "Vegetables", "Fresh vegetables from the garden");
        Item bread = new Item(R.drawable.bread, "Bread", "Fresh loose bread");
        Item cheese = new Item(R.drawable.cheese, "Cheese", "Tasty 100% cheese");
        Item milk = new Item(R.drawable.milk, "Milk", "Milk 10% fat");
        Item popcorn = new Item(R.drawable.popcorn, "Popcorn", "Tasty snack popcorn");
        Item sausage = new Item(R.drawable.sausage, "Sausage", "Delicious sausage with cheese the higher level");

        itemList.addAll(List.of(fruits, vegetables, bread, cheese, milk, popcorn, sausage));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        itemsAdapter = new ItemsAdapter(itemList);
        recyclerView.setAdapter(itemsAdapter);

        itemsAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int pos) {
        Toast.makeText(this,"You choose" +itemList.get(pos).getItemTitle(),
        Toast.LENGTH_LONG).show();
    }
}