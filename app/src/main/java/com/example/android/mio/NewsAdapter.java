package com.example.android.mio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(@NonNull Context context, List<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionTextView = (TextView)listItemView.findViewById(R.id.section_name);
        String sectionName = currentNews.getSectionName();
        sectionTextView.setText(sectionName);

        TextView titleTextView = (TextView)listItemView.findViewById(R.id.title_view);
        String title = currentNews.getTitle();
        titleTextView.setText(title);

        TextView dateTextView = (TextView)listItemView.findViewById(R.id.date_view);
        String date = currentNews.getDate();

        String parts[] = date.split("T");
        String dateParts[] = parts[0].split("-");

        String year = dateParts[0];
        String monthInNumbers = dateParts[1];
        String day = dateParts[2];
        String monthInWords = formattedMonth(monthInNumbers);

        String finalDate = monthInWords + " " + day + ", " + year;
        dateTextView.setText(finalDate);

        return listItemView;
    }

    private String formattedMonth(String monthInNumbers) {
        String monthInWords = "";
        switch (monthInNumbers) {
            case "01":
                monthInWords = "Jan";
                break;
            case "02":
                monthInWords = "Feb";
                break;
            case "03":
                monthInWords = "Mar";
                break;
            case "04":
                monthInWords = "Apr";
                break;
            case "05":
                monthInWords = "May";
                break;
            case "06":
                monthInWords = "June";
                break;
            case "07":
                monthInWords = "July";
                break;
            case "08":
                monthInWords = "Aug";
                break;
            case "09":
                monthInWords = "Sept";
                break;
            case "10":
                monthInWords = "Oct";
                break;
            case "11":
                monthInWords = "Nov";
                break;
            case "12":
                monthInWords = "Dec";
                break;
        }

        return monthInWords;
    }

}
