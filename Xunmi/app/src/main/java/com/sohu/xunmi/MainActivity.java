package com.sohu.xunmi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;

import com.loopj.android.http.*;
import com.sohu.xunmi.CardView.CardFragmentPagerAdapter;
import com.sohu.xunmi.CardView.CardItem;
import com.sohu.xunmi.CardView.CardPagerAdapter;
import com.sohu.xunmi.CardView.ShadowTransformer;
import com.sohu.xunmi.utils.AsyncHttpUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.entity.mime.Header;

/**
 * Created by whisky on 2017/4/14.
 */

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;
    private CardFragmentPagerAdapter mFragmentCardAdapter;
    private ShadowTransformer mFragmentCardShadowTransformer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //AsyncHttpUtil.get();

        setContentView(R.layout.layout_main_activity);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.title_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.title_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.title_1));
        mCardAdapter.addCardItem(new CardItem(R.string.title_1, R.string.title_1));
        mFragmentCardAdapter = new CardFragmentPagerAdapter(getSupportFragmentManager(),
                dpToPixels(2, this));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);
    }


    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }


}
