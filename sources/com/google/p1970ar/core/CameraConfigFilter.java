package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.CameraConfig;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.google.ar.core.CameraConfigFilter */
public class CameraConfigFilter {
    private static final String TAG = CameraConfigFilter.class.getSimpleName();
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    protected CameraConfigFilter() {
    }

    private static native long nativeCreateCameraConfigFilter(long j);

    private static native void nativeDestroyCameraConfigFilter(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native int nativeGetStereoCameraUsage(long j, long j2);

    private native int nativeGetTargetFps(long j, long j2);

    private native void nativeSetDepthSensorUsage(long j, long j2, int i);

    private native void nativeSetFacingDirection(long j, long j2, int i);

    private native void nativeSetStereoCameraUsage(long j, long j2, int i);

    private native void nativeSetTargetFps(long j, long j2, int i);

    static {
        Covode.recordClassIndex(32579);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(10961);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfigFilter(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(10961);
    }

    public EnumSet<CameraConfig.DepthSensorUsage> getDepthSensorUsage() {
        MethodCollector.m26663i(11410);
        EnumSet<CameraConfig.DepthSensorUsage> forBitFlags = CameraConfig.DepthSensorUsage.forBitFlags(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(11410);
        return forBitFlags;
    }

    public CameraConfig.FacingDirection getFacingDirection() {
        MethodCollector.m26663i(12871);
        CameraConfig.FacingDirection forNumber = CameraConfig.FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(12871);
        return forNumber;
    }

    public EnumSet<CameraConfig.StereoCameraUsage> getStereoCameraUsage() {
        MethodCollector.m26663i(12869);
        EnumSet<CameraConfig.StereoCameraUsage> forBitFlags = CameraConfig.StereoCameraUsage.forBitFlags(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(12869);
        return forBitFlags;
    }

    public EnumSet<CameraConfig.TargetFps> getTargetFps() {
        MethodCollector.m26663i(11253);
        EnumSet<CameraConfig.TargetFps> forBitFlags = CameraConfig.TargetFps.forBitFlags(nativeGetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(11253);
        return forBitFlags;
    }

    public CameraConfigFilter(Session session2) {
        MethodCollector.m26663i(10815);
        this.session = session2;
        this.nativeHandle = nativeCreateCameraConfigFilter(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.m26664o(10815);
    }

    public CameraConfigFilter setFacingDirection(CameraConfig.FacingDirection facingDirection) {
        MethodCollector.m26663i(12870);
        nativeSetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle, facingDirection.nativeCode);
        MethodCollector.m26664o(12870);
        return this;
    }

    public CameraConfigFilter setDepthSensorUsage(EnumSet<CameraConfig.DepthSensorUsage> enumSet) {
        MethodCollector.m26663i(11409);
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((CameraConfig.DepthSensorUsage) it.next()).nativeCode;
        }
        nativeSetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle, i);
        MethodCollector.m26664o(11409);
        return this;
    }

    public CameraConfigFilter setStereoCameraUsage(EnumSet<CameraConfig.StereoCameraUsage> enumSet) {
        MethodCollector.m26663i(12868);
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((CameraConfig.StereoCameraUsage) it.next()).nativeCode;
        }
        nativeSetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle, i);
        MethodCollector.m26664o(12868);
        return this;
    }

    public CameraConfigFilter setTargetFps(EnumSet<CameraConfig.TargetFps> enumSet) {
        MethodCollector.m26663i(11103);
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((CameraConfig.TargetFps) it.next()).nativeCode;
        }
        nativeSetTargetFps(this.session.nativeWrapperHandle, this.nativeHandle, i);
        MethodCollector.m26664o(11103);
        return this;
    }
}
