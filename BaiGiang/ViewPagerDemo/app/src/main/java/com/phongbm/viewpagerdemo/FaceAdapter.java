package com.phongbm.viewpagerdemo;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FaceAdapter extends PagerAdapter {
    private LayoutInflater inflater;
    private ArrayList<Face> faces;

    public FaceAdapter(Context context, ArrayList<Face> faces) {
        this.faces= faces;
        inflater = LayoutInflater.from(context);
        // inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return faces.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // Tạo view
        View itemView = inflater.inflate(R.layout.item_face, container, false);

        LinearLayout lytContainer = (LinearLayout) itemView.findViewById(R.id.container);
        ImageView imgFace = (ImageView) itemView.findViewById(R.id.img_face);
        TextView tvName = (TextView) itemView.findViewById(R.id.tv_name);

        // Đổ dữ liệu
        Face face = faces.get(position);
        lytContainer.setBackgroundColor(face.getBackgroundColor());
        imgFace.setImageResource(face.getImageId());
        tvName.setText(face.getName());

        // Thêm itemView vào viewPager
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return object.equals(view);
    }

}