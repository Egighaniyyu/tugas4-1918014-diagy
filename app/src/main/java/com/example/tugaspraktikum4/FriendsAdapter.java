package com.example.tugaspraktikum4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder>{
    private ArrayList<Friends> dataList;
    public FriendsAdapter(ArrayList<Friends> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public FriendsAdapter.FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_friends, parent, false);
        return new FriendsViewHolder(view);
    }
    public void onBindViewHolder(FriendsViewHolder holder, int position) {
        holder.img.setImageResource(dataList.get(position).getImg());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class FriendsViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus;
        private ImageView img;
        public FriendsViewHolder(View itemView) {
            super(itemView);
            img=(ImageView) itemView.findViewById(R.id.image_bio);
            txtNama = (TextView) itemView.findViewById(R.id.txt_nama);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status);
        }
    }
}
