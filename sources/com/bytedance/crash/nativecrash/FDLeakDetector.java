package com.bytedance.crash.nativecrash;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public class FDLeakDetector {

    /* renamed from: a */
    private static final AtomicBoolean f33971a = new AtomicBoolean();

    private static native void doSetAddrs(long j, long j2);

    private static native void doStartDetect(String str);

    static {
        Covode.recordClassIndex(16005);
    }
}
