package com.lynx.tasm.utils;

import com.bytedance.covode.number.Covode;

public class ValueUtils {
    static {
        Covode.recordClassIndex(35041);
    }

    private static native long nativeToNativeBoolValue(boolean z);

    private static native long nativeToNativeByteValue(byte b);

    private static native long nativeToNativeDoubleValue(double d);

    private static native long nativeToNativeIntValue(int i);

    private static native long nativeToNativeLongValue(long j);

    private static native long nativeToNativeShortValue(short s);

    private static native long nativeToNativeStringValue(String str);
}
