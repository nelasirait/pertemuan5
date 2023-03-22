package com.unpam.tugasnelasirait;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.MakananViewHolder> {

    Context context;
    List<MakananSunda> makananSundas;

    OnClikShowListener onClikShowListener;

    public MakananAdapter(Context context, List<MakananSunda> makananlist, OnClikShowListener onClikShowListener) {
        this.context = context;
        this.makananSundas = makananlist;
        this.onClikShowListener = onClikShowListener;
    }

    @NonNull
    @NotNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list, parent, false);
        return new MakananViewHolder(view, onClikShowListener);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MakananViewHolder holder, int position) {
        String name = makananSundas.get(position).getNama();
        holder.text.setText(name);
    }

    @Override
    public int getItemCount() {
        return makananSundas.size();
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView text;
        OnClikShowListener onClikShowListener;
        public MakananViewHolder(@NonNull View itemView, OnClikShowListener onClikShowListener)
        {
            super(itemView);
            text = itemView.findViewById(R.id.tvNama);
            this.onClikShowListener = onClikShowListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onClikShowListener.onClickShowListener(getAdapterPosition());
        }
    }

    public interface OnClikShowListener {
        void onClickShowListener(int positon);
    }
}
