package com.example.tecmilenio_nutriapp.ui.CuadroDS;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.tecmilenio_nutriapp.R;
import com.example.tecmilenio_nutriapp.databinding.FragmentCuadroDietoSinteticoBinding;

public class CuadroDSFragment extends Fragment {

    Button calculo;

    private FragmentCuadroDietoSinteticoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
        calculo = v.findViewById(R.id.calcular_variables_ic);

        // Caracteristica de vibrar
        // Su detonador es la variable que contiene el boton [Calcular variables]

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrator = (Vibrator) getContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);
            }

        });

        return v;


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
////