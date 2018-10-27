package com.example.org.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FragmentOne extends Fragment {

    ArrayList<Item> itemArrayList;
    ListView itemList;
    ItemAdapter itemAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        itemArrayList = new ArrayList<>();

        itemArrayList.add(new Item("Item 1", "There is some information about item 1", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 2", "There is some information about item 2", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 3", "There is some information about item 3", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 4", "There is some information about item 4", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 5", "There is some information about item 5", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 6", "There is some information about item 6", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 7", "There is some information about item 7", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 8", "There is some information about item 8", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 9", "There is some information about item 9", R.drawable.ic_shopping_bag));
        itemArrayList.add(new Item("Item 10", "There is some information about item 10", R.drawable.ic_shopping_bag));

        itemList = view.findViewById(R.id.listItem);

        itemAdapter = new ItemAdapter(getContext(), itemArrayList);
        itemList.setAdapter(itemAdapter);

        return view;

    }
}
