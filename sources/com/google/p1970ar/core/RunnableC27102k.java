package com.google.p1970ar.core;

import android.hardware.camera2.CameraDevice;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.k */
final /* synthetic */ class RunnableC27102k implements Runnable {

    /* renamed from: a */
    private final CameraDevice.StateCallback f64165a;

    /* renamed from: b */
    private final CameraDevice f64166b;

    /* renamed from: c */
    private final /* synthetic */ int f64167c;

    static {
        Covode.recordClassIndex(32682);
    }

    RunnableC27102k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f64165a = stateCallback;
        this.f64166b = cameraDevice;
    }

    RunnableC27102k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, byte b) {
        this.f64167c = 1;
        this.f64165a = stateCallback;
        this.f64166b = cameraDevice;
    }

    RunnableC27102k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, char c) {
        this.f64167c = 2;
        this.f64165a = stateCallback;
        this.f64166b = cameraDevice;
    }

    public final void run() {
        int i = this.f64167c;
        if (i == 0) {
            this.f64165a.onOpened(this.f64166b);
        } else if (i != 1) {
            this.f64165a.onDisconnected(this.f64166b);
        } else {
            this.f64165a.onClosed(this.f64166b);
        }
    }
}
