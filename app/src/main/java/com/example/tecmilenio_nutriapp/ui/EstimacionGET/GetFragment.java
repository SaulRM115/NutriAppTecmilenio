package com.example.tecmilenio_nutriapp.ui.EstimacionGET;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tecmilenio_nutriapp.R;
//import com.example.tecmilenio_nutriapp.databinding.FragmentEstimacionGetBinding;

public class GetFragment extends Fragment {


Button calculo; // copiar esto tambien


   // private FragmentEstimacionGetBinding binding;



    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //Copiar desde aqui

        View v = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
        calculo = v.findViewById(R.id.calcular_variables_idc);

        // Caracteristica de vibrar (version para fragmento)
        // Su detonador es la variable que contiene el boton [Calcular variables]

        calculo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);
            }

        });

       return v;


    }
// Aqui
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //binding = null;
    }

}