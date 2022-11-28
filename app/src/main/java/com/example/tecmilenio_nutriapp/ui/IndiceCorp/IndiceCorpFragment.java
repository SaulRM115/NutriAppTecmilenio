package com.example.tecmilenio_nutriapp.ui.IndiceCorp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecmilenio_nutriapp.databinding.FragmentIndiceCorporalBinding;

public class IndiceCorpFragment extends Fragment {

    private FragmentIndiceCorporalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IndiceCorpViewModel galleryViewModel =
                new ViewModelProvider(this).get(IndiceCorpViewModel.class);

        binding = FragmentIndiceCorporalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}