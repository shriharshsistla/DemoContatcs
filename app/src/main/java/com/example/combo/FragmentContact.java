package com.example.combo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myRecyclerview;
    private List<Contact> listContact;



    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v= inflater.inflate(R.layout.contact_fragment,container,false);
        myRecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listContact);
        myRecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContact = new ArrayList<>();
        listContact.add(new Contact("Ayush Lala","7000900699",R.drawable.ic_person));
        listContact.add(new Contact("Shriharsh Sistla","9752144050",R.drawable.ic_person));
        listContact.add(new Contact("Mom","9993062043",R.drawable.ic_person));
        listContact.add(new Contact("Papa","9424244949",R.drawable.ic_person));
        listContact.add(new Contact("Bhai","9860759242",R.drawable.ic_person));
        listContact.add(new Contact("Kalu","8817699193",R.drawable.ic_person));
        listContact.add(new Contact("Ayush Shrivastava","7000900699",R.drawable.ic_person));
        listContact.add(new Contact("Tripathi","6264681918",R.drawable.ic_person));
        listContact.add(new Contact("Pakistan Spam","+92Mullah",R.drawable.ic_person));
        listContact.add(new Contact("Ayush Shrivastava","7000900699",R.drawable.ic_person));
        listContact.add(new Contact("Tripathi","6264681918",R.drawable.ic_person));
        listContact.add(new Contact("Pakistan Spam","+92Mullah",R.drawable.ic_person));
        listContact.add(new Contact("Ayush Shrivastava","7000900699",R.drawable.ic_person));
        listContact.add(new Contact("Bhai","9860759242",R.drawable.ic_person));
        listContact.add(new Contact("Kalu","8817699193",R.drawable.ic_person));
        listContact.add(new Contact("Bhai","9860759242",R.drawable.ic_person));
        listContact.add(new Contact("Kalu","8817699193",R.drawable.ic_person));




    }
}