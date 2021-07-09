package com.example.qno218arid2982.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qno218arid2982.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.mobilesRecyclerView);

        ArrayList<BillModel> bills = new ArrayList<>();
        bills.add(new BillModel(1, "Nouman Habib", "b12345", "met1234", 23000, 345000, 456000));
        bills.add(new BillModel(2, "Nouman Habib", "b12345", "met1234", 23000, 345000, 456000));
        bills.add(new BillModel(3, "Nouman Habib", "b12345", "met1234", 23000, 345000, 456000));
        bills.add(new BillModel(4, "Nouman Habib", "b12345", "met1234", 23000, 345000, 456000));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        BillAdapter customAdapter = new BillAdapter(bills);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return root;
    }
}