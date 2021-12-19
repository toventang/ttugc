package com.google.p1970ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.m */
public final class C27104m extends CameraDevice.StateCallback {

    /* renamed from: a */
    final /* synthetic */ Handler f64171a;

    /* renamed from: b */
    final /* synthetic */ CameraDevice.StateCallback f64172b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f64173c;

    static {
        Covode.recordClassIndex(32684);
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f64171a.post(new RunnableC27102k(this.f64172b, cameraDevice, (byte) 0));
        this.f64173c.onDeviceClosed(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f64171a.post(new RunnableC27102k(this.f64172b, cameraDevice, (char) 0));
        this.f64173c.onDeviceDisconnected(cameraDevice);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        if (!((Boolean) C15346a.m28238a(this, new Object[]{cameraDevice}, 100200, "void", false, null).first).booleanValue()) {
            C15346a.m28243a(this, new Object[]{cameraDevice}, 100200, "onOpened(Landroid/hardware/camera2/CameraDevice;)V");
            this.f64173c.sharedCameraInfo.f64180a = cameraDevice;
            this.f64171a.post(new RunnableC27102k(this.f64172b, cameraDevice));
            this.f64173c.onDeviceOpened(cameraDevice);
            this.f64173c.sharedCameraInfo.f64182c = this.f64173c.getGpuSurfaceTexture();
            this.f64173c.sharedCameraInfo.f64183d = this.f64173c.getGpuSurface();
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f64171a.post(new RunnableC27103l(this.f64172b, cameraDevice, i));
        this.f64173c.close();
    }

    C27104m(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f64173c = sharedCamera;
        this.f64171a = handler;
        this.f64172b = stateCallback;
    }
}
