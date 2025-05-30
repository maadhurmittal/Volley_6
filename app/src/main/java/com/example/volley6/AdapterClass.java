package com.example.volley6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {

    List<ModelClass> ModelList;
    Context context;

    public AdapterClass(List<ModelClass> ModelList, Context context){
        this.ModelList = ModelList;
        this.context = context;
    }
    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {
        ModelClass modelClass = ModelList.get(position);
        holder.title_tv.setText(modelClass.getTitle());
        Glide.with(holder.itemView.getContext())
                .load(modelClass.getThumbnailUrl())   // get image URL from model
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return ModelList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title_tv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title_tv = itemView.findViewById(R.id.title_tv);
        }
    }
}
