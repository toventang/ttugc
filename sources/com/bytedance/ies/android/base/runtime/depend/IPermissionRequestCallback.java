package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public interface IPermissionRequestCallback {
    static {
        Covode.recordClassIndex(18393);
    }

    void onPermissionsGrant(String[] strArr);
}
