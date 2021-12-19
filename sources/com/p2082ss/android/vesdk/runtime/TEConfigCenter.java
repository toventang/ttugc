package com.p2082ss.android.vesdk.runtime;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.vesdk.runtime.TEConfigCenter */
public class TEConfigCenter {
    public static native void nativeClear();

    public static native void nativeSetBoolConfig(String str, boolean z, boolean z2, int i);

    public static native void nativeSetFloatConfig(String str, float f, boolean z, int i);

    public static native void nativeSetIntConfig(String str, int i, boolean z, int i2);

    public static native void nativeSetStringConfig(String str, String str2, boolean z, int i);

    static {
        Covode.recordClassIndex(99712);
        C30731d.m63114a();
    }
}
