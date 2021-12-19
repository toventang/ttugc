package com.google.p1970ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.o */
public final class C27106o extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ Handler f64177a;

    /* renamed from: b */
    final /* synthetic */ CameraCaptureSession.StateCallback f64178b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f64179c;

    static {
        Covode.recordClassIndex(32686);
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f64177a.post(new RunnableC27105n(this.f64178b, cameraCaptureSession, 0));
        this.f64179c.onCaptureSessionActive(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f64177a.post(new RunnableC27105n(this.f64178b, cameraCaptureSession, (byte) 0));
        this.f64179c.onCaptureSessionClosed(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f64177a.post(new RunnableC27105n(this.f64178b, cameraCaptureSession, (char) 0));
        this.f64179c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f64177a.post(new RunnableC27105n(this.f64178b, cameraCaptureSession));
        this.f64179c.onCaptureSessionConfigured(cameraCaptureSession);
        if (this.f64179c.sharedCameraInfo.f64180a != null) {
            this.f64179c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f64177a.post(new RunnableC27105n(this.f64178b, cameraCaptureSession, (short) 0));
        this.f64179c.onCaptureSessionReady(cameraCaptureSession);
    }

    C27106o(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f64179c = sharedCamera;
        this.f64177a = handler;
        this.f64178b = stateCallback;
    }
}
