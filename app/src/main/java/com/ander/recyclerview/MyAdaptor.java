package com.ander.recyclerview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyHolderView> {
    Context context;
    String[] title,details;

    int[] images;



    public MyAdaptor(Context context, String[] title, String[] details, int[] images) {
        this.context = context;
        this.title = title;
        this.details = details;
        this.images = images;
    }

    @NonNull
    @Override
    public MyAdaptor.MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.c_details, parent, false);


        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptor.MyHolderView holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.title.setText(title[position]);
        holder.details.setText(details[position]);


    }

    @Override
    public int getItemCount() {
        return title.length;
    }


    class MyHolderView extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,details;


        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageview);
            title=(TextView) itemView.findViewById(R.id.title);
            details=(TextView) itemView.findViewById(R.id.description);
        }
    }




}
