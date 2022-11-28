package com.example.tecmilenio_nutriapp.ui.AppStart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tecmilenio_nutriapp.databinding.FragmentAppStartBinding;

public class AppStartFragment extends Fragment {

    private FragmentAppStartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AppStartViewModel appStartViewModel;
        appStartViewModel = new ViewModelProvider(this).get(AppStartViewModel.class);

        binding = FragmentAppStartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textApp; //
        appStartViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}