package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface OnPermissionGrantCallback {
    static {
        Covode.recordClassIndex(21154);
    }

    void onAllGranted();

    void onNotGranted();
}
