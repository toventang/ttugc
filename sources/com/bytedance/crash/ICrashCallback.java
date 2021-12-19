package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public interface ICrashCallback {
    static {
        Covode.recordClassIndex(15858);
    }

    void onCrash(CrashType crashType, String str, Thread thread);
}
