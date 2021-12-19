package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public interface ICrashFilter {
    static {
        Covode.recordClassIndex(15859);
    }

    boolean onJavaCrashFilter(Throwable th, Thread thread);

    boolean onNativeCrashFilter(String str, String str2);
}
