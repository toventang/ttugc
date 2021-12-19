package com.gyf.barlibrary;

import com.bytedance.covode.number.Covode;

public interface SimpleImmersionOwner {
    static {
        Covode.recordClassIndex(33747);
    }

    boolean immersionBarEnabled();

    void initImmersionBar();
}
