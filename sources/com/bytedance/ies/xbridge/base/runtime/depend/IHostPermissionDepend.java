package com.bytedance.ies.xbridge.base.runtime.depend;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

public interface IHostPermissionDepend {
    static {
        Covode.recordClassIndex(21142);
    }

    boolean hasPermission(Activity activity, String str);

    void requestPermission(Activity activity, OnPermissionGrantCallback onPermissionGrantCallback, String str);
}
