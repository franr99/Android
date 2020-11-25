package com.example.navdrawer.ui.condiciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.navdrawer.R;

public class CondicionesFragment extends Fragment {

    private CondicionesViewModel condicionesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        condicionesViewModel =
                ViewModelProviders.of(this).get(CondicionesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_condiciones, container, false);
        return root;
    }
}