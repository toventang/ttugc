package com.bytedance.common.jato.scheduler;

import android.content.Context;
import com.bytedance.common.jato.C13556d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SchedulerNativeHolder {

    /* renamed from: a */
    private static boolean f33020a;

    static {
        Covode.recordClassIndex(15598);
    }

    public static native int nativeInit(int i, int i2, Context context);

    SchedulerNativeHolder() {
    }

    /* renamed from: a */
    public static synchronized boolean m24391a() {
        boolean z;
        synchronized (SchedulerNativeHolder.class) {
            MethodCollector.m26663i(11756);
            if (!f33020a && C13556d.m24356a()) {
                f33020a = true;
            }
            z = f33020a;
            MethodCollector.m26664o(11756);
        }
        return z;
    }
}
