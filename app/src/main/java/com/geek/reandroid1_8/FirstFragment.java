package com.geek.reandroid1_8;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private MainAdapter adapter;
    private ArrayList<User> list;
    private RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRv(view);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
        list.add(new User("jojo", "saaasas", 15,  "nonImage"));
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
        list.add(new User("jojo", "saaasas", 15,  "nonImage"));
        list.add(new User("jojo", "saaasas", 15,  "nonImage"));
        list.add(new User("jojo", "saaasas", 15,  "nonImage"));
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
        list.add(new User("jojo", "saaasas", 15, R.drawable.ic_launcher_background, "image"));
    }

    private void initRv(View view) {
        rv = view.findViewById(R.id.mainRv);
        adapter = new MainAdapter();
        rv.setAdapter(adapter);
        adapter.setList(list);
    }
}