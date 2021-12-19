package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public interface ImmersionOwner {
    static {
        Covode.recordClassIndex(33741);
    }

    boolean immersionBarEnabled();

    void initImmersionBar();

    void onInvisible();

    void onLazyAfterView();

    void onLazyBeforeView();

    void onVisible();
}
