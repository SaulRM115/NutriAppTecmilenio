package com.example.tecmilenio_nutriapp.ui.EstimacionGET;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecmilenio_nutriapp.databinding.FragmentEstimacionGetBinding;

public class GetFragment extends Fragment {

    private FragmentEstimacionGetBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GetViewModel getViewModel;
        getViewModel = new ViewModelProvider(this).get(GetViewModel.class);

        binding = FragmentEstimacionGetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

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