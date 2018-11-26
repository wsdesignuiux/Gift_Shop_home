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

import model.Shop_Home_Model_1;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class Shop_Home_Adapter_1 extends RecyclerView.Adapter<Shop_Home_Adapter_1.ViewHolder> {
    Context context;
    private ArrayList<Shop_Home_Model_1> shop_home_model_1ArrayList;

    public Shop_Home_Adapter_1(Context context, ArrayList<Shop_Home_Model_1> shop_home_model_1ArrayList) {
        this.context = context;
        this.shop_home_model_1ArrayList = shop_home_model_1ArrayList;
    }

    @Override
    public Shop_Home_Adapter_1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop_home_1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Shop_Home_Adapter_1.ViewHolder holder, int position) {
        holder.resimage.setImageResource(shop_home_model_1ArrayList.get(position).getResimage());
        holder.txtregulargift.setText(shop_home_model_1ArrayList.get(position).getTxtregulargift());
    }

    @Override
    public int getItemCount() {
        return shop_home_model_1ArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView resimage;
        TextView txtregulargift;

        public ViewHolder(View itemView) {
            super(itemView);

            resimage=itemView.findViewById(R.id.resimage);
            txtregulargift=itemView.findViewById(R.id.txtregulargift);



        }
    }
}
