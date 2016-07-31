package com.danxx.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.SparseArray;

import danxx.library.widget.VerticalTabIndicator;

/**
 * Created by Dawish on 2016/7/31.
 */
public class ActivityVerticalTabIndicator extends AppCompatActivity {

    private SparseArray<String> mData = new SparseArray<String>();
    private VerticalTabIndicator tabIndicator;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_tab_indicator);

        tabIndicator = (VerticalTabIndicator) findViewById(R.id.tabIndicator);

        for(int i=0 ; i<21 ; i++){
            mData.put(i, "电影频道 "+i);
        }

        tabIndicator.setTabSelectListrner(new VerticalTabIndicator.TabSelectListrner() {
            @Override
            public void onItemSelect(int index) {
                Log.d("danxx","选中位置： "+index);
            }
        });

        tabIndicator.setData(mData);

    }

}
