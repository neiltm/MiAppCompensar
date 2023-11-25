package com.example.miappcompensar;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductAdapter extends BaseAdapter {

    private Context context;
    private String[] productNames;
    private int[] productImages;

    public ProductAdapter(Context context, String[] productNames, int[] productImages) {
        this.context = context;
        this.productNames = productNames;
        this.productImages = productImages;
    }

    @Override
    public int getCount() {
        return productNames.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item_layout, parent, false);
        }

        ImageView productImage = convertView.findViewById(R.id.productImage);
        TextView productName = convertView.findViewById(R.id.productName);

        productImage.setImageResource(productImages[position]);
        productName.setText(productNames[position]);

        return convertView;
    }
}
