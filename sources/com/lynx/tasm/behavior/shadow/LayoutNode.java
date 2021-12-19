package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class LayoutNode {

    /* renamed from: a */
    private boolean f67129a = true;

    /* renamed from: d */
    public long f67130d;

    /* renamed from: e */
    public boolean f67131e;

    /* renamed from: f */
    public AbstractC28539d f67132f;

    /* renamed from: g */
    public C28545j f67133g;

    static {
        Covode.recordClassIndex(34532);
    }

    private native boolean nativeIsDirty(long j);

    private native void nativeMarkDirty(long j);

    private native void nativeSetMeasureFunc(long j);

    /* renamed from: c */
    public void mo49091c() {
    }

    /* access modifiers changed from: package-private */
    public native int nativeGetFlexDirection(long j);

    public native float nativeGetHeight(long j);

    public native int[] nativeGetMargin(long j);

    /* access modifiers changed from: package-private */
    public native int[] nativeGetPadding(long j);

    public native float nativeGetWidth(long j);

    /* renamed from: d */
    public void mo49092d() {
        MethodCollector.m26663i(186);
        if (!this.f67129a) {
            this.f67129a = true;
            nativeMarkDirty(this.f67130d);
        }
        MethodCollector.m26664o(186);
    }

    /* renamed from: a */
    public final void mo49090a(AbstractC28539d dVar) {
        MethodCollector.m26663i(176);
        this.f67132f = dVar;
        long j = this.f67130d;
        if (j != 0) {
            this.f67131e = true;
            nativeSetMeasureFunc(j);
        }
        MethodCollector.m26664o(176);
    }

    /* renamed from: a */
    public void mo49089a(int i, int i2, int i3, int i4) {
        this.f67129a = false;
    }

    private long measure(float f, int i, float f2, int i2) {
        return this.f67132f.mo30603a(this, f, EnumC28540e.fromInt(i), f2, EnumC28540e.fromInt(i2));
    }
}
