package com.example.bai8;

import static java.lang.Character.toLowerCase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CountryAdapter extends ArrayAdapter<Country> {

    private List<Country> mListCountries;

    public CountryAdapter(@NonNull Context context, int resource, @NonNull List<Country> objects) {
        super(context, resource, objects);
        mListCountries = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_custom, parent, false);
        }

        TextView tvCountryName = convertView.findViewById(R.id.tv_country_name);
        Country country = getItem(position);
        tvCountryName.setText(country.getName());

        return convertView;

    }

    @NonNull
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<Country> mListSuggest = new ArrayList<>();

                if (constraint == null || constraint.length() == 0) {
                    mListSuggest.addAll(mListCountries);
                } else {
                    String filter = constraint.toString().toLowerCase().trim();
                    for (Country country :mListCountries ) {
                        if (country.getName().toLowerCase().contains(filter)) {
                            mListSuggest.add(country);
                        }
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = mListSuggest;
                filterResults.count = mListSuggest.size();

                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults results) {
                clear();
                addAll((List<Country>)results.values);
                notifyDataSetInvalidated();

            }

            @Override
            public CharSequence convertResultToString(Object resultValue) {
                return ((Country)resultValue).getName();
            }
        };
    }
}
