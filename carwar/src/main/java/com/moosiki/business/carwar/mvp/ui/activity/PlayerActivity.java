package com.moosiki.business.carwar.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dl7.player.media.IjkPlayerView;

import butterknife.BindView;
import me.jessyan.art.base.BaseActivity;
import me.jessyan.art.mvp.IPresenter;
import me.jessyan.mvpart.carwar.R;

public class PlayerActivity extends BaseActivity {

    @BindView(R.id.ipv_player)
    IjkPlayerView playerView;

    @Override
    public int initView(@Nullable Bundle bundle) {
        return R.layout.activity_player;
    }

    @Override
    public void initData(@Nullable Bundle bundle) {
        playerView.init()
                .setTitle("战车世界")
                .enableOrientation()
                .setVideoPath("http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f30.mp4")
                .setMediaQuality(IjkPlayerView.MEDIA_QUALITY_HIGH)
                .start();
    }

    @Nullable
    @Override
    public IPresenter obtainPresenter() {
        return null;
    }
}
