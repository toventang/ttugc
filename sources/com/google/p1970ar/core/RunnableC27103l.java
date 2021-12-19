package com.google.p1970ar.core;

import android.hardware.camera2.CameraDevice;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.l */
final /* synthetic */ class RunnableC27103l implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f64168a;

    /* renamed from: b */
    private final CameraDevice f64169b;

    /* renamed from: c */
    private final int f64170c;

    static {
        Covode.recordClassIndex(32683);
    }

    RunnableC27103l(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.f64168a = stateCallback;
        this.f64169b = cameraDevice;
        this.f64170c = i;
    }

    public final void run() {
        this.f64168a.onError(this.f64169b, this.f64170c);
    }
}
