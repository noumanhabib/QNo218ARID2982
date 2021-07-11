package com.example.qno218arid2982.ui.home;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qno218arid2982.R;

import java.util.ArrayList;

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.CategoryHolder> {
    ArrayList<BillModel> bills;
    HomeFragment mainFragment;

    public BillAdapter(ArrayList<BillModel> m, HomeFragment h) {
        this.bills = m;
        this.mainFragment = h;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_bill_item, parent, false);
        CategoryHolder holder = new CategoryHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {
        TextView nameView= holder.nameView;
        TextView amountView = holder.amountView;
        nameView.setText("Customer Name: " + bills.get(position).getCustomerName());
        amountView.setText("Bill Amount: " + bills.get(position).getPendingAmount() + " PKR");

        View itemView = holder.itemView;
        itemView.setOnClickListener(v -> singleItemClicked(position));
    }

    @Override
    public int getItemCount() {
        return bills.size();
    }

    public static class CategoryHolder extends RecyclerView.ViewHolder{
        TextView nameView;
        TextView amountView;
        View itemView;

        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            this.nameView = (TextView) itemView.findViewById(R.id.customerName);
            this.amountView = (TextView) itemView.findViewById(R.id.billAmount);
            this.itemView = itemView;
        }
    }

    public void singleItemClicked(int position){
        BillModel item = bills.get(position);
        mainFragment.detailActivity(item);
    }

}

