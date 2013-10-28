package com.sothree.slidingdownpanel.demo;

import com.sothree.slidingdownpanel.SlidingDownPanelLayout;
import com.sothree.slidinguppanel.demo.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        SlidingDownPanelLayout layout = (SlidingDownPanelLayout) findViewById(R.id.sliding_layout);
        layout.setEnableDragViewTouchEvents(false);
        layout.setDragView(findViewById(R.id.dragview));
        layout.setEnableDragViewTouchEvents(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.demo, menu);
        return true;
    }

}
