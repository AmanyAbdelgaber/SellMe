package com.example.org.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(@NonNull Context context, @NonNull ArrayList<Item> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_row, parent, false);

        ImageView imageItem = convertView.findViewById(R.id.imgList);
        TextView itemName = convertView.findViewById(R.id.itemName);
        TextView itemDescription = convertView.findViewById(R.id.itemDescription);

        Item item = getItem(position);
        imageItem.setImageResource(item.getImgId());
        itemName.setText(item.getItemName());
        itemDescription.setText(item.getItemDesription());

        return convertView;
    }
}
