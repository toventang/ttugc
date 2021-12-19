package com.p2082ss.android.vesdk.p4389e;

import android.graphics.SurfaceTexture;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.vesdk.e.a */
public final class C85462a extends SurfaceTexture {

    /* renamed from: a */
    private boolean f191399a;

    static {
        Covode.recordClassIndex(99583);
    }

    public final boolean isReleased() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.isReleased();
        }
        return this.f191399a;
    }

    public final synchronized void detachFromGLContext() {
        MethodCollector.m26663i(2716);
        if (isReleased()) {
            MethodCollector.m26664o(2716);
            return;
        }
        super.detachFromGLContext();
        MethodCollector.m26664o(2716);
    }

    public final synchronized long getTimestamp() {
        MethodCollector.m26663i(2784);
        if (isReleased()) {
            MethodCollector.m26664o(2784);
            return -1;
        }
        long timestamp = super.getTimestamp();
        MethodCollector.m26664o(2784);
        return timestamp;
    }

    public final synchronized void release() {
        MethodCollector.m26663i(2789);
        if (isReleased()) {
            MethodCollector.m26664o(2789);
            return;
        }
        super.release();
        this.f191399a = true;
        MethodCollector.m26664o(2789);
    }

    public final synchronized void releaseTexImage() {
        MethodCollector.m26663i(2714);
        if (isReleased()) {
            MethodCollector.m26664o(2714);
            return;
        }
        super.releaseTexImage();
        MethodCollector.m26664o(2714);
    }

    public final synchronized void updateTexImage() {
        MethodCollector.m26663i(2710);
        if (isReleased()) {
            MethodCollector.m26664o(2710);
            return;
        }
        super.updateTexImage();
        MethodCollector.m26664o(2710);
    }

    public C85462a(int i) {
        super(i);
    }

    public final synchronized void attachToGLContext(int i) {
        MethodCollector.m26663i(2720);
        if (isReleased()) {
            MethodCollector.m26664o(2720);
            return;
        }
        super.attachToGLContext(i);
        MethodCollector.m26664o(2720);
    }

    public final synchronized void getTransformMatrix(float[] fArr) {
        MethodCollector.m26663i(2722);
        if (isReleased()) {
            MethodCollector.m26664o(2722);
            return;
        }
        super.getTransformMatrix(fArr);
        MethodCollector.m26664o(2722);
    }

    public final synchronized void setDefaultBufferSize(int i, int i2) {
        MethodCollector.m26663i(2594);
        if (isReleased()) {
            MethodCollector.m26664o(2594);
            return;
        }
        super.setDefaultBufferSize(i, i2);
        MethodCollector.m26664o(2594);
    }
}
