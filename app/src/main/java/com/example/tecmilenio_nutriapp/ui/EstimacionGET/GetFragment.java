package com.example.tecmilenio_nutriapp.ui.EstimacionGET;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecmilenio_nutriapp.R;
import com.example.tecmilenio_nutriapp.databinding.FragmentEstimacionGetBinding;
import com.example.tecmilenio_nutriapp.ui.AppStart.AppStartFragment;

public class GetFragment extends Fragment {



    private FragmentEstimacionGetBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GetViewModel getViewModel;
        getViewModel = new ViewModelProvider(this).get(GetViewModel.class);

        binding = FragmentEstimacionGetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //BOTON
        View viewC = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
        Button calcular = viewC.findViewById(R.id.calcular_variables_get);


        //LinearLayout
        View viewO = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
        LinearLayout observaciones = viewO.findViewById(R.id.observacion_container);

        //Funcionalidad de BOTON

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AppStartFragment.class);
                startActivity(intent);
            }
        });

        final TextView textView = binding.textGET; //
        getViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}