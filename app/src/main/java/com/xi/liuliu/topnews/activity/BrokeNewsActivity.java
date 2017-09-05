package com.xi.liuliu.topnews.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xi.liuliu.topnews.R;

public class BrokeNewsActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mCancle;
    private TextView mPublish;
    private EditText mTitle;
    private EditText mContent;
    private LinearLayout mImgLayer1;
    private LinearLayout mImgLayer2;
    private LinearLayout mImgLayer3;
    private ImageView mImg1;
    private ImageView mImg2;
    private ImageView mImg3;
    private ImageView mImg4;
    private ImageView mImg5;
    private ImageView mImg6;
    private ImageView mImg7;
    private ImageView mImg8;
    private ImageView mImg9;
    private EditText mContact;
    private LinearLayout mLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broke_news);
        initView();
    }

    private void initView() {
        mCancle = (TextView) findViewById(R.id.cancle_broke_news_activity);
        mCancle.setOnClickListener(this);
        mPublish = (TextView) findViewById(R.id.broke_news_publish);
        mPublish.setOnClickListener(this);
        mTitle = (EditText) findViewById(R.id.edit_title_broke_news);
        mContent = (EditText) findViewById(R.id.edit_content_brokes_news);
        mImgLayer1 = (LinearLayout) findViewById(R.id.layer_1_imgs_broke_news);
        mImgLayer2 = (LinearLayout) findViewById(R.id.layer_2_imgs_broke_news);
        mImgLayer3 = (LinearLayout) findViewById(R.id.layer_3_imgs_broke_news);
        mImg1 = (ImageView) findViewById(R.id.img_1_broke_news);
        mImg1.setOnClickListener(this);
        mImg2 = (ImageView) findViewById(R.id.img_2_broke_news);
        mImg2.setOnClickListener(this);
        mImg3 = (ImageView) findViewById(R.id.img_3_broke_news);
        mImg3.setOnClickListener(this);
        mImg4 = (ImageView) findViewById(R.id.img_4_broke_news);
        mImg4.setOnClickListener(this);
        mImg5 = (ImageView) findViewById(R.id.img_5_broke_news);
        mImg5.setOnClickListener(this);
        mImg6 = (ImageView) findViewById(R.id.img_6_broke_news);
        mImg6.setOnClickListener(this);
        mImg7 = (ImageView) findViewById(R.id.img_7_broke_news);
        mImg7.setOnClickListener(this);
        mImg8 = (ImageView) findViewById(R.id.img_8_broke_news);
        mImg8.setOnClickListener(this);
        mImg9 = (ImageView) findViewById(R.id.img_9_broke_news);
        mImg9.setOnClickListener(this);
        mContact = (EditText) findViewById(R.id.edit_contact_broke_news);
        mLocation = (LinearLayout) findViewById(R.id.ll_location_broke_news);
        mLocation.setOnClickListener(this);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.zoomout);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancle_broke_news_activity:
                finish();
                break;
            case R.id.broke_news_publish:
                publish();
                break;
            case R.id.ll_location_broke_news:

                break;
        }
    }

    private void publish() {

    }
}
