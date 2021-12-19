package com.bytedance.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;

public interface OnActivityResultCallback {
    static {
        Covode.recordClassIndex(25817);
    }

    void onActivityResult(int i, int i2, Intent intent);
}
