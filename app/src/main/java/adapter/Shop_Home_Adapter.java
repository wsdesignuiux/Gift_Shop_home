package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.wolfsoft.gift_shop_home.R;

import java.util.ArrayList;

import model.Shop_Home_Model;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class Shop_Home_Adapter extends RecyclerView.Adapter<Shop_Home_Adapter.ViewHolder> {

    Context context;
    private ArrayList<Shop_Home_Model> shop_home_modelArrayList;

    public Shop_Home_Adapter(Context context, ArrayList<Shop_Home_Model> shop_home_modelArrayList) {
        this.context = context;
        this.shop_home_modelArrayList = shop_home_modelArrayList;
    }

    @Override
    public Shop_Home_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop_home,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Shop_Home_Adapter.ViewHolder holder, int position) {
        holder.imageView1.setImageResource(shop_home_modelArrayList.get(position).getImageView1());
        holder.txtprice.setText(shop_home_modelArrayList.get(position).getTxtprice());
        holder.txtproductname.setText(shop_home_modelArrayList.get(position).getTxtproductname());
        holder.txtreviews.setText(shop_home_modelArrayList.get(position).getTxtreviews());

    }

    @Override
    public int getItemCount() {
        return shop_home_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        TextView txtprice,txtproductname,txtreviews;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView1=itemView.findViewById(R.id.imageView1);
            txtprice=itemView.findViewById(R.id.txtprice);
            txtproductname=itemView.findViewById(R.id.txtproductname);
            txtreviews=itemView.findViewById(R.id.txtreviews);


        }
    }
}
