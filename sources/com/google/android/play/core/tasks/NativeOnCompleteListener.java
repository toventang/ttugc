package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;

public class NativeOnCompleteListener {
    static {
        Covode.recordClassIndex(32538);
    }

    public native void nativeOnComplete(long j, int i, Object obj, int i2);
}
