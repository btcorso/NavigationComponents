package com.example.navigationcomponents;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NewDoacoesFragment extends Fragment {

    NavController navController = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_new_doacoes, container, false);
        Button btnRoupa = rootView.findViewById(R.id.btnRoupa);
        Button btnLivro = rootView.findViewById(R.id.btnLivro);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        Button btnRoupa = view.findViewById(R.id.btnRoupa);
        Button btnLivro = view.findViewById(R.id.btnLivro);

        btnRoupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_newDoacoesFragment_to_newRoupaFragment);
            }
        });

        btnLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.action_newDoacoesFragment_to_newLivrosFragment);
            }
        });

    }

}