package com.bytedance.p1435io.prefetcher;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.io.prefetcher.MutexLockHook */
public class MutexLockHook {
    static {
        Covode.recordClassIndex(23569);
    }

    public static native int mutexHook(String str);
}
