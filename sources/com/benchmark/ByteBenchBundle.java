package com.benchmark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

public class ByteBenchBundle {
    private static final Object sPoolSync = new Object();
    private static Queue<ByteBenchBundle> sPools = new ArrayDeque(8);
    private long mHandle;

    private native long nativeCreate();

    private native boolean nativeGetBool(long j, String str);

    private native float nativeGetFloat(long j, String str);

    private native int nativeGetInt(long j, String str);

    private native int[] nativeGetIntArray(long j, String str);

    private native String nativeGetString(long j, String str);

    private static native void nativeRelease(long j);

    private static native void nativeReleaseAll(long[] jArr);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetByteArray(long j, String str, byte[] bArr);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetDoubleArray(long j, String str, double[] dArr);

    private native int nativeSetFloat(long j, String str, float f);

    private native int nativeSetFloatArray(long j, String str, float[] fArr);

    private native int nativeSetHandle(long j, String str, long j2);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetIntArray(long j, String str, int[] iArr);

    private native int nativeSetIntOrigin(long j, String str, int i);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetStringArray(long j, String str, String[] strArr);

    public long getHandle() {
        return this.mHandle;
    }

    static {
        Covode.recordClassIndex(2760);
    }

    private ByteBenchBundle() {
        MethodCollector.m26663i(6924);
        this.mHandle = nativeCreate();
        MethodCollector.m26664o(6924);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(6774);
        super.finalize();
        long j = this.mHandle;
        if (j != 0) {
            nativeRelease(j);
        }
        MethodCollector.m26664o(6774);
    }

    public void recycle() {
        MethodCollector.m26663i(6773);
        synchronized (sPoolSync) {
            try {
                sPools.add(this);
            } finally {
                MethodCollector.m26664o(6773);
            }
        }
    }

    public static void cleanAll() {
        MethodCollector.m26663i(6923);
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    int size = sPools.size();
                    long[] jArr = new long[size];
                    for (int i = 0; i < size; i++) {
                        ByteBenchBundle poll = sPools.poll();
                        jArr[i] = poll.getHandle();
                        poll.mHandle = 0;
                    }
                    nativeReleaseAll(jArr);
                }
            } finally {
                MethodCollector.m26664o(6923);
            }
        }
    }

    public static ByteBenchBundle obtain() {
        ByteBenchBundle byteBenchBundle;
        MethodCollector.m26663i(6639);
        synchronized (sPoolSync) {
            try {
                if (!sPools.isEmpty()) {
                    byteBenchBundle = sPools.poll();
                } else {
                    byteBenchBundle = new ByteBenchBundle();
                }
            } finally {
                MethodCollector.m26664o(6639);
            }
        }
        return byteBenchBundle;
    }

    public ByteBenchBundle(long j) {
        this.mHandle = j;
    }

    public boolean getBool(String str) {
        MethodCollector.m26663i(8582);
        boolean nativeGetBool = nativeGetBool(this.mHandle, str);
        MethodCollector.m26664o(8582);
        return nativeGetBool;
    }

    public float getFloat(String str) {
        MethodCollector.m26663i(8135);
        float nativeGetFloat = nativeGetFloat(this.mHandle, str);
        MethodCollector.m26664o(8135);
        return nativeGetFloat;
    }

    public int getInt(String str) {
        MethodCollector.m26663i(8730);
        int nativeGetInt = nativeGetInt(this.mHandle, str);
        MethodCollector.m26664o(8730);
        return nativeGetInt;
    }

    public int[] getIntArray(String str) {
        MethodCollector.m26663i(8424);
        int[] nativeGetIntArray = nativeGetIntArray(this.mHandle, str);
        MethodCollector.m26664o(8424);
        return nativeGetIntArray;
    }

    public String getString(String str) {
        MethodCollector.m26663i(8272);
        String nativeGetString = nativeGetString(this.mHandle, str);
        MethodCollector.m26664o(8272);
        return nativeGetString;
    }

    public int setBool(String str, boolean z) {
        MethodCollector.m26663i(6926);
        int nativeSetBool = nativeSetBool(this.mHandle, str, z);
        MethodCollector.m26664o(6926);
        return nativeSetBool;
    }

    public int setByteArray(String str, byte[] bArr) {
        MethodCollector.m26663i(7527);
        int nativeSetByteArray = nativeSetByteArray(this.mHandle, str, bArr);
        MethodCollector.m26664o(7527);
        return nativeSetByteArray;
    }

    public int setDoubleArray(String str, double[] dArr) {
        MethodCollector.m26663i(7709);
        int nativeSetDoubleArray = nativeSetDoubleArray(this.mHandle, str, dArr);
        MethodCollector.m26664o(7709);
        return nativeSetDoubleArray;
    }

    public int setFloat(String str, float f) {
        MethodCollector.m26663i(7528);
        int nativeSetFloat = nativeSetFloat(this.mHandle, str, f);
        MethodCollector.m26664o(7528);
        return nativeSetFloat;
    }

    public int setFloatArray(String str, float[] fArr) {
        MethodCollector.m26663i(7529);
        int nativeSetFloatArray = nativeSetFloatArray(this.mHandle, str, fArr);
        MethodCollector.m26664o(7529);
        return nativeSetFloatArray;
    }

    public int setInt(String str, int i) {
        MethodCollector.m26663i(7224);
        int nativeSetInt = nativeSetInt(this.mHandle, str, i);
        MethodCollector.m26664o(7224);
        return nativeSetInt;
    }

    public int setIntArray(String str, int[] iArr) {
        MethodCollector.m26663i(7372);
        int nativeSetIntArray = nativeSetIntArray(this.mHandle, str, iArr);
        MethodCollector.m26664o(7372);
        return nativeSetIntArray;
    }

    public int setIntOrigin(String str, int i) {
        MethodCollector.m26663i(7226);
        int nativeSetIntOrigin = nativeSetIntOrigin(this.mHandle, str, i);
        MethodCollector.m26664o(7226);
        return nativeSetIntOrigin;
    }

    public int setString(String str, String str2) {
        MethodCollector.m26663i(7850);
        int nativeSetString = nativeSetString(this.mHandle, str, str2);
        MethodCollector.m26664o(7850);
        return nativeSetString;
    }

    public int setStringArray(String str, String[] strArr) {
        MethodCollector.m26663i(7991);
        int nativeSetStringArray = nativeSetStringArray(this.mHandle, str, strArr);
        MethodCollector.m26664o(7991);
        return nativeSetStringArray;
    }

    public int setDouble(String str, double d) {
        MethodCollector.m26663i(7708);
        int nativeSetDouble = nativeSetDouble(this.mHandle, str, d);
        MethodCollector.m26664o(7708);
        return nativeSetDouble;
    }

    public int setHandle(String str, long j) {
        MethodCollector.m26663i(7075);
        int nativeSetHandle = nativeSetHandle(this.mHandle, str, j);
        MethodCollector.m26664o(7075);
        return nativeSetHandle;
    }

    public int setLong(String str, long j) {
        MethodCollector.m26663i(7225);
        int nativeSetLong = nativeSetLong(this.mHandle, str, j);
        MethodCollector.m26664o(7225);
        return nativeSetLong;
    }
}
