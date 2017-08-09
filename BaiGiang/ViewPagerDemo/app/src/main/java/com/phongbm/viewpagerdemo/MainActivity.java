package com.phongbm.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpgFaces;
    private CircleIndicator indicator;
    private ArrayList<Face> faces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initFaces();
    }

    private void initViews() {
        vpgFaces = (ViewPager) findViewById(R.id.vpg_faces);
        indicator = (CircleIndicator) findViewById(R.id.indicator);
    }

    private void initFaces() {
        faces = new ArrayList<>();
        faces.add(new Face(R.drawable.ic_beauty, "Beauty", ContextCompat.getColor(this, R.color.green)));
        faces.add(new Face(R.drawable.ic_boss, "Boss", ContextCompat.getColor(this, R.color.blue)));
        faces.add(new Face(R.drawable.ic_dribble, "Dirbble", 0xff9c27b0));
        faces.add(new Face(R.drawable.ic_oh, "Oh", 0xff009688));
        faces.add(new Face(R.drawable.ic_sweet_kiss, "Sweet Kiss", 0xffff9800));

        FaceAdapter adapter = new FaceAdapter(this, faces);
        vpgFaces.setAdapter(adapter);

        indicator.setViewPager(vpgFaces);
    }

}
