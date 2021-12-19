package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d;

public class WebPFrame implements AbstractC24324d {
    private long mNativeContext;

    static {
        Covode.recordClassIndex(28132);
    }

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* access modifiers changed from: package-private */
    public native void nativeDispose();

    /* access modifiers changed from: package-private */
    public native int nativeGetHeight();

    /* access modifiers changed from: package-private */
    public native int nativeGetWidth();

    /* access modifiers changed from: package-private */
    public native int nativeGetXOffset();

    /* access modifiers changed from: package-private */
    public native int nativeGetYOffset();

    /* access modifiers changed from: package-private */
    public native boolean nativeIsBlendWithPreviousFrame();

    /* access modifiers changed from: package-private */
    public native boolean nativeShouldDisposeToBackgroundColor();

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: a */
    public final void mo39493a() {
        MethodCollector.m26663i(2597);
        nativeDispose();
        MethodCollector.m26664o(2597);
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: b */
    public final int mo39495b() {
        MethodCollector.m26663i(2731);
        int nativeGetWidth = nativeGetWidth();
        MethodCollector.m26664o(2731);
        return nativeGetWidth;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: c */
    public final int mo39496c() {
        MethodCollector.m26663i(2866);
        int nativeGetHeight = nativeGetHeight();
        MethodCollector.m26664o(2866);
        return nativeGetHeight;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: d */
    public final int mo39497d() {
        MethodCollector.m26663i(2873);
        int nativeGetXOffset = nativeGetXOffset();
        MethodCollector.m26664o(2873);
        return nativeGetXOffset;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: e */
    public final int mo39498e() {
        MethodCollector.m26663i(2886);
        int nativeGetYOffset = nativeGetYOffset();
        MethodCollector.m26664o(2886);
        return nativeGetYOffset;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(2590);
        nativeFinalize();
        MethodCollector.m26664o(2590);
    }

    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // com.facebook.imagepipeline.p1871a.p1872a.AbstractC24324d
    /* renamed from: a */
    public final void mo39494a(int i, int i2, Bitmap bitmap) {
        MethodCollector.m26663i(2599);
        nativeRenderFrame(i, i2, bitmap);
        MethodCollector.m26664o(2599);
    }
}
