package com.example.qno218arid2982.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qno218arid2982.BillDetail;
import com.example.qno218arid2982.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.mobilesRecyclerView);

        ArrayList<BillModel> bills = new ArrayList<>();
        bills.add(new BillModel(1, "Nouman Habib", "b12345", "met1234", 23000, 345000, 456000));
        bills.add(new BillModel(2, "Hello Habib", "b12345", "met1234", 43000, 345000, 456000));
        bills.add(new BillModel(3, "Zeshi Habib", "b12345", "met1234", 1000, 345000, 456000));
        bills.add(new BillModel(4, "Muna Habib", "b12345", "met1234", 3000, 345000, 456000));
        bills.add(new BillModel(4, "Stari Habib", "b12345", "met1234", 23000, 345000, 456000));
        bills.add(new BillModel(4, "John Habib", "b12345", "met1234", 300, 345000, 456000));
        bills.add(new BillModel(4, "Haq Ul Habib", "b12345", "met1234", 200, 345000, 456000));
        bills.add(new BillModel(4, "Deo John T.H Habib", "b12345", "met1234", 510, 345000, 456000));
        bills.add(new BillModel(4, "We The World Habib", "b12345", "met1234", 600, 345000, 456000));
        bills.add(new BillModel(4, "Nouman Habib", "b12345", "met1234", 700, 345000, 456000));
        bills.add(new BillModel(4, "Nouman Habib", "b12345", "met1234", 11520, 345000, 456000));
        bills.add(new BillModel(4, "Zeshan Habib", "b12345", "met1234", 4000, 345000, 456000));
        bills.add(new BillModel(4, "Shahan Saeed", "b12345", "met1234", 5000, 345000, 456000));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        BillAdapter customAdapter = new BillAdapter(bills, this);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return root;
    }

    public void detailActivity(BillModel item){
        Intent intent = new Intent(getActivity().getBaseContext(), BillDetail.class);
        intent.putExtra("name", item.getCustomerName());
        intent.putExtra("bill", item.getBillNumber());
        intent.putExtra("meter", item.getMeterNumber());
        intent.putExtra("amount", item.getPendingAmount() + "");
        intent.putExtra("lunits", item.getLastUnits() + "");
        intent.putExtra("cunits", item.getCurrentUnits() + "");
        startActivity(intent);
    }
}