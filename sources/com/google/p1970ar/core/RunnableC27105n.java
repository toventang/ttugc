package com.google.p1970ar.core;

import android.hardware.camera2.CameraCaptureSession;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.n */
final /* synthetic */ class RunnableC27105n implements Runnable {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f64174a;

    /* renamed from: b */
    private final CameraCaptureSession f64175b;

    /* renamed from: c */
    private final /* synthetic */ int f64176c;

    static {
        Covode.recordClassIndex(32685);
    }

    RunnableC27105n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f64174a = stateCallback;
        this.f64175b = cameraCaptureSession;
    }

    RunnableC27105n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, byte b) {
        this.f64176c = 1;
        this.f64174a = stateCallback;
        this.f64175b = cameraCaptureSession;
    }

    RunnableC27105n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, char c) {
        this.f64176c = 2;
        this.f64174a = stateCallback;
        this.f64175b = cameraCaptureSession;
    }

    RunnableC27105n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, int i) {
        this.f64176c = 4;
        this.f64174a = stateCallback;
        this.f64175b = cameraCaptureSession;
    }

    RunnableC27105n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, short s) {
        this.f64176c = 3;
        this.f64174a = stateCallback;
        this.f64175b = cameraCaptureSession;
    }

    public final void run() {
        int i = this.f64176c;
        if (i == 0) {
            this.f64174a.onConfigured(this.f64175b);
        } else if (i == 1) {
            this.f64174a.onClosed(this.f64175b);
        } else if (i == 2) {
            this.f64174a.onConfigureFailed(this.f64175b);
        } else if (i != 3) {
            this.f64174a.onActive(this.f64175b);
        } else {
            this.f64174a.onReady(this.f64175b);
        }
    }
}
