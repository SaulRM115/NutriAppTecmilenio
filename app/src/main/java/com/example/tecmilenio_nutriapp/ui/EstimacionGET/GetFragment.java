package com.example.tecmilenio_nutriapp.ui.EstimacionGET;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.tecmilenio_nutriapp.R;
import com.example.tecmilenio_nutriapp.databinding.FragmentEstimacionGetBinding;

public class GetFragment extends Fragment {


Button calculo;
TextView observaciones;

    private FragmentEstimacionGetBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        View v = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
        calculo = v.findViewById(R.id.calcular_variables_get);

        calculo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                View vs = inflater.inflate(R.layout.fragment_estimacion_get, container, false);
                observaciones = vs.findViewById(R.id.observacion);
                observaciones.setText("Hola");

                Toast.makeText(getContext(), "Cosas", Toast.LENGTH_SHORT).show();
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