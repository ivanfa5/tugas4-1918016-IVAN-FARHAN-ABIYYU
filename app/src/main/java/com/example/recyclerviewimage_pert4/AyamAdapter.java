package com.example.recyclerviewimage_pert4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AyamAdapter extends RecyclerView.Adapter<AyamAdapter.ViewHolder> {
    Context context;
    String[] ayamNamelist;
    String[] ayamhargalist;
    int[] ayamimages;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
        TextView rowDescription;
        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rowName = itemView.findViewById(R.id.textviewjudul);
            rowDescription = itemView.findViewById(R.id.textviewharga);
            rowImage = itemView.findViewById(R.id.imageView);
        }
    }

    public AyamAdapter(Context context, String[] ayamNamelist, String[] ayamhargalist, int[] ayamimages){
        this.context = context;
        this.ayamNamelist = ayamNamelist;
        this.ayamhargalist = ayamhargalist;
        this.ayamimages = ayamimages;
    }

    @NonNull
    @Override
    public AyamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AyamAdapter.ViewHolder holder, int position) {
        holder.rowName.setText(ayamNamelist[position]);
        holder.rowDescription.setText(ayamhargalist[position]);
        holder.rowImage.setImageResource(ayamimages[position]);
    }

    @Override
    public int getItemCount() {
        return ayamNamelist.length;
    }
}
