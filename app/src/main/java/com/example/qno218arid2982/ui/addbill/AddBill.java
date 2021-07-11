package com.example.qno218arid2982.ui.addbill;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.qno218arid2982.R;

public class AddBill extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.add_bill_fragment, container, false);
        Button saveBtn = root.findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(this::saveBill);
        return root;
    }
    public void saveBill(View v){

    }

}