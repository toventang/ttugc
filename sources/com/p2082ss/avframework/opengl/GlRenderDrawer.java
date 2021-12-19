package com.p2082ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.avframework.opengl.GlRenderDrawer */
public class GlRenderDrawer {
    private long mNativeObj = nativeCreateRender();

    static {
        Covode.recordClassIndex(100664);
    }

    private native long nativeCreateRender();

    private native boolean nativeDrawOes(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawRectangle(long j, int i, int i2, int i3, int i4);

    private native boolean nativeDrawRgb(long j, int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5);

    private native boolean nativeDrawYuv(long j, int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5);

    private native void nativeRelease(long j);

    /* access modifiers changed from: protected */
    public void finalize() {
        release();
    }

    public GlRenderDrawer() {
        MethodCollector.m26663i(2310);
        MethodCollector.m26664o(2310);
    }

    public void release() {
        MethodCollector.m26663i(2320);
        long j = this.mNativeObj;
        if (j != 0) {
            nativeRelease(j);
        }
        this.mNativeObj = 0;
        MethodCollector.m26664o(2320);
    }

    public boolean drawRectangle(int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(2317);
        boolean nativeDrawRectangle = nativeDrawRectangle(this.mNativeObj, i, i2, i3, i4);
        MethodCollector.m26664o(2317);
        return nativeDrawRectangle;
    }

    public boolean drawOes(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(2313);
        boolean nativeDrawOes = nativeDrawOes(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
        MethodCollector.m26664o(2313);
        return nativeDrawOes;
    }

    public boolean drawRgb(int i, float[] fArr, float[] fArr2, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(2312);
        boolean nativeDrawRgb = nativeDrawRgb(this.mNativeObj, i, fArr, fArr2, i2, i3, i4, i5);
        MethodCollector.m26664o(2312);
        return nativeDrawRgb;
    }

    public boolean drawYuv(int[] iArr, float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5) {
        MethodCollector.m26663i(2315);
        boolean nativeDrawYuv = nativeDrawYuv(this.mNativeObj, iArr, fArr, fArr2, i, i2, i3, i4, i5);
        MethodCollector.m26664o(2315);
        return nativeDrawYuv;
    }
}
