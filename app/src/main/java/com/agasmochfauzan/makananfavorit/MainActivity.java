package com.agasmochfauzan.makananfavorit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFood;
    private ArrayList<Food>foods;

    private RecyclerView rvfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        foods= new ArrayList<>();
        foods.add(new Food("Baso",5,12000,true));
        foods.add(new Food("Mie Ayam",4.5f,8000,true));
        foods.add(new Food("Baso Komplit",1,19000,false));
        foods.add(new Food("Cuangki",1,8000,false));
        foods.add(new Food("Baso Aci",5,5000,true));
        foods.add(new Food("Baso Urat",2,7000,false));

        LinearLayoutManager lm = new LinearLayoutManager(this);
        FoodAdapter adapter = new FoodAdapter(this,foods);
        //Sfat Optional
        DividerItemDecoration divider = new DividerItemDecoration(this,lm.getOrientation());
        rvFood.setLayoutManager(lm);
        rvFood.setAdapter(adapter);
        rvFood.addItemDecoration(divider);

    }
}
