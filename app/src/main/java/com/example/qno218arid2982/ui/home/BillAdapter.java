package com.example.qno218arid2982.ui.home;

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

    public BillAdapter(ArrayList<BillModel> m) {
        this.bills = m;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.single_bill_item, parent, false);
        return new CategoryHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {

        holder.nameView.setText(bills.get(position).getCustomerName());
        holder.amountView.setText(bills.get(position).getPendingAmount() + "");
    }

    @Override
    public int getItemCount() {
        return bills.size();
    }

    public static class CategoryHolder extends RecyclerView.ViewHolder{
        private final TextView nameView;
        private final TextView amountView;
        public CategoryHolder(@NonNull View itemView) {
            super(itemView);
            this.nameView = (TextView) itemView.findViewById(R.id.customerName);
            this.amountView = (TextView) itemView.findViewById(R.id.billAmount);
        }

        public TextView getNameView() {
            return nameView;
        }
        public TextView getAmountView(){
            return amountView;
        }
    }
}

