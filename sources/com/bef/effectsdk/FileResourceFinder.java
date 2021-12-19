package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class FileResourceFinder implements ResourceFinder {
    private final String mDir;

    static {
        Covode.recordClassIndex(2671);
    }

    private static native long nativeCreateFileResourceFinder(long j, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public final void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.mDir = str;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public final long createNativeResourceFinder(long j) {
        MethodCollector.m26663i(5661);
        long nativeCreateFileResourceFinder = nativeCreateFileResourceFinder(j, this.mDir);
        MethodCollector.m26664o(5661);
        return nativeCreateFileResourceFinder;
    }
}
