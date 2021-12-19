package com.lynx.tasm.behavior;

import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

public abstract class LayoutContext {

    /* renamed from: a */
    long f66938a;

    /* renamed from: b */
    public boolean f66939b;

    static {
        Covode.recordClassIndex(34459);
    }

    /* renamed from: a */
    public abstract DisplayMetrics mo48917a();

    public abstract int createNode(int i, String str, ReadableMap readableMap, long j, ReadableArray readableArray);

    public abstract void destroyNodes(int[] iArr);

    public abstract void dispatchOnLayout(int i, int i2, int i3, int i4, int i5);

    public abstract void dispatchOnLayoutBefore(int i);

    public abstract void dispatchOnLayoutFinish();

    public abstract void insertNode(int i, int i2, int i3);

    public long measure(int i, float f, int i2, float f2, int i3) {
        return 0;
    }

    public abstract void moveNode(int i, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public native void nativeTriggerLayout(long j, long j2);

    public abstract void removeNode(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void scheduleLayout(long j);

    public abstract void setFontFaces(ReadableMap readableMap);

    public void setTextStyleData(int i, int[] iArr, double[] dArr, String str) {
    }

    /* access modifiers changed from: protected */
    public abstract void updateDataWithoutChange();

    public abstract void updateProps(int i, ReadableMap readableMap);

    /* access modifiers changed from: protected */
    public void detachNativePtr() {
        this.f66938a = 0;
    }

    /* access modifiers changed from: protected */
    public void attachNativePtr(long j) {
        this.f66938a = j;
    }
}
