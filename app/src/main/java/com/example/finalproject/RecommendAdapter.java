package com.example.finalproject;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecommendAdapter extends RecyclerView.Adapter {
    RecommendSQLiteHelper recommendSQLiteHelper;

    public RecommendAdapter(RecommendSQLiteHelper recommendSQLiteHelper) {
        this.recommendSQLiteHelper = recommendSQLiteHelper;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recommend_layout, parent, false);
        return new RecommendViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String url = recommendSQLiteHelper.getUrl(position);
        String name = recommendSQLiteHelper.getName(position);
        int size = recommendSQLiteHelper.getBSize(position);
        int price = recommendSQLiteHelper.getPrice(position);

        RecommendViewHolder recommendViewHolder = (RecommendViewHolder) holder;
        recommendViewHolder.update(url,name,size,price);
    }

    @Override
    public int getItemCount() {
        return recommendSQLiteHelper.getSize();
    }

    public static class RecommendViewHolder extends RecyclerView.ViewHolder{
        static WebView webView;
        static TextView textViewName;
        static TextView textViewSize;
        static TextView textViewPrice;
        public RecommendViewHolder(@NonNull View itemView) {
            super(itemView);
            webView = (WebView) itemView.findViewById(R.id.webView);
            webView.setInitialScale(1);
            webView.getSettings().setUseWideViewPort(true);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewSize = (TextView) itemView.findViewById(R.id.textViewSize);
            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);

        }

        public static void update(String url, String name,int size,int price){
            webView.loadUrl(url);
            textViewName.setText(name);
            String cSize = "Size: " + (Integer.toString(size));
            textViewSize.setText(cSize);
            String sPrice = "Price: $" + (Integer.toString(price));
            textViewPrice.setText(sPrice);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
