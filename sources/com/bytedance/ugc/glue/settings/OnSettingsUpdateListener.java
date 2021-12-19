package com.bytedance.ugc.glue.settings;

import com.bytedance.covode.number.Covode;

public abstract class OnSettingsUpdateListener {
    static {
        Covode.recordClassIndex(27541);
    }

    public abstract void onSettingsUpdateListener();
}
