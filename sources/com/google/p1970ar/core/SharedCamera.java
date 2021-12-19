package com.google.p1970ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ar.core.SharedCamera */
public class SharedCamera {
    private boolean cameraSharedWithAr = false;
    private final Session session;
    private Handler sharedCameraHandler;
    public final C27107p sharedCameraInfo = new C27107p((byte) 0);

    static {
        Covode.recordClassIndex(32621);
    }

    static final /* synthetic */ void lambda$setDummyOnImageAvailableListener$0$SharedCamera(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j, String str, List<Surface> list);

    private native void nativeSharedCameraSetCaptureCallback(long j, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.f64182c;
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        if (this.sharedCameraInfo.f64180a != null) {
            setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public void setDummyListenerToAvoidImageBufferStarvation() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private ImageReader getCpuImageReader() {
        MethodCollector.m26663i(8378);
        ImageReader nativeSharedCameraGetImageReader = nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.f64180a);
        MethodCollector.m26664o(8378);
        return nativeSharedCameraGetImageReader;
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        MethodCollector.m26663i(8532);
        ImageReader nativeSharedCameraGetImageReaderMotionTracking = nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.f64180a);
        MethodCollector.m26664o(8532);
        return nativeSharedCameraGetImageReaderMotionTracking;
    }

    public void close() {
        this.sharedCameraHandler.removeCallbacksAndMessages(null);
        this.sharedCameraHandler.getLooper().quit();
        this.sharedCameraHandler = null;
    }

    public Surface getGpuSurface() {
        MethodCollector.m26663i(8826);
        Surface nativeSharedCameraGetSurface = nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.f64180a);
        MethodCollector.m26664o(8826);
        return nativeSharedCameraGetSurface;
    }

    public SurfaceTexture getGpuSurfaceTexture() {
        MethodCollector.m26663i(8671);
        SurfaceTexture nativeSharedCameraGetSurfaceTexture = nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.f64180a);
        MethodCollector.m26664o(8671);
        return nativeSharedCameraGetSurfaceTexture;
    }

    public List<Surface> getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f64183d);
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(C27101j.f64164a, this.sharedCameraHandler);
        }
    }

    public void onCaptureSessionActive(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.m26663i(7658);
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.m26664o(7658);
    }

    public void onCaptureSessionClosed(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.m26663i(7802);
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.m26664o(7802);
    }

    public void onCaptureSessionConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.m26663i(7938);
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.m26664o(7938);
    }

    public void onCaptureSessionConfigured(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.m26663i(8093);
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.m26664o(8093);
    }

    public void onCaptureSessionReady(CameraCaptureSession cameraCaptureSession) {
        MethodCollector.m26663i(8235);
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
        MethodCollector.m26664o(8235);
    }

    public void onDeviceClosed(CameraDevice cameraDevice) {
        MethodCollector.m26663i(7322);
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        MethodCollector.m26664o(7322);
    }

    public void onDeviceDisconnected(CameraDevice cameraDevice) {
        MethodCollector.m26663i(7481);
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.f64180a = null;
        MethodCollector.m26664o(7481);
    }

    public void onDeviceOpened(CameraDevice cameraDevice) {
        MethodCollector.m26663i(7178);
        this.sharedCameraInfo.f64180a = cameraDevice;
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
        MethodCollector.m26664o(7178);
    }

    SharedCamera(Session session2) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session2;
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new C27104m(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new C27106o(this, handler, stateCallback);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        MethodCollector.m26663i(8827);
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
        MethodCollector.m26664o(8827);
    }

    public void setAppSurfaces(String str, List<Surface> list) {
        MethodCollector.m26663i(7017);
        this.sharedCameraInfo.f64181b.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
        MethodCollector.m26664o(7017);
    }
}
