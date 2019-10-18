package com.agasmochfauzan.makananfavorit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
//Menampilkan Makanan
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private Context mContext;

    public FoodAdapter(Context mContext, ArrayList<Food> foods) {
        this.mContext = mContext;
        this.foods = foods;
    }

    private ArrayList<Food>foods;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Untuk mengubah list_food_item.xml ke FoodAdapter.java
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.list_food_item,parent,false);
        //Membuat objek ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food currentFood = foods.get(position);
                holder.tvName.setText(currentFood.getName());
                holder.tvPrice.setText(currentFood.getPrice()+"");
                holder.ratingBar.setRating(currentFood.getRate());
                //Menampilkan
                if (currentFood.isFav()==true){
                    holder.imageView.setImageResource(R.drawable.ic_favorite_24dp);
                }else {
                    holder.imageView.setImageResource(R.drawable.ic_close_24dp);
                }
    }

    @Override
    public int getItemCount() {
        return  foods.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvPrice, tvName;
        RatingBar ratingBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
