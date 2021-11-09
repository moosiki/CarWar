package com.moosiki.business.carwar.mvp.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.SurfaceView;

import butterknife.BindView;
import me.jessyan.art.base.BaseActivity;
import me.jessyan.art.mvp.IPresenter;
import me.jessyan.mvpart.carwar.R;

public class SurfacePlayerActivity extends BaseActivity {

    @BindView(R.id.sv_player)
    SurfaceView playerView;
    @Override
    public int initView(@Nullable Bundle bundle) {
        return R.layout.activity_surface_player;
    }

    @Override
    public void initData(@Nullable Bundle bundle) {

    }

    @Nullable
    @Override
    public IPresenter obtainPresenter() {
        return null;
    }
}
