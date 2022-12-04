package com.example.tecmilenio_nutriapp.ui.CuadroDS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecmilenio_nutriapp.databinding.FragmentCuadroDietoSinteticoBinding;

public class CuadroDSFragment extends Fragment {

    private FragmentCuadroDietoSinteticoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CuadroDSViewModel cuadroDSViewModel =
                new ViewModelProvider(this).get(CuadroDSViewModel.class);

        binding = FragmentCuadroDietoSinteticoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        cuadroDSViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
////