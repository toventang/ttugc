package com.bytedance.vcloud.mlcomponent_api;

import com.bytedance.covode.number.Covode;

public interface IMLComponentStateListener {
    static {
        Covode.recordClassIndex(27605);
    }

    void onEngineStateChange(String str, int i, String str2);
}
