package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Camera */
public class Camera {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32572);
    }

    protected Camera() {
    }

    private static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private static native int nativeGetEarthLocalizationState(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    private static native void nativeReleaseCamera(long j, long j2);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(8369);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(8369);
    }

    public Pose getDisplayOrientedPose() {
        MethodCollector.m26663i(9138);
        Pose nativeDisplayOrientedPose = nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9138);
        return nativeDisplayOrientedPose;
    }

    public EarthLocalizationState getEarthLocalizationState() {
        MethodCollector.m26663i(10394);
        EarthLocalizationState forNumber = EarthLocalizationState.forNumber(nativeGetEarthLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(10394);
        return forNumber;
    }

    public Pose getPose() {
        MethodCollector.m26663i(9137);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9137);
        return nativeGetPose;
    }

    public TrackingFailureReason getTrackingFailureReason() {
        MethodCollector.m26663i(9136);
        TrackingFailureReason forNumber = TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(9136);
        return forNumber;
    }

    public TrackingState getTrackingState() {
        MethodCollector.m26663i(8985);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(8985);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.Camera$EarthLocalizationState */
    public enum EarthLocalizationState {
        NOT_LOCALIZED(0),
        LOCALIZED(1),
        UNAVAILABLE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32573);
        }

        static EarthLocalizationState forNumber(int i) {
            EarthLocalizationState[] values = values();
            for (EarthLocalizationState earthLocalizationState : values) {
                if (earthLocalizationState.nativeCode == i) {
                    return earthLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Unexpected value for native ArEarthLocalizationState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private EarthLocalizationState(int i) {
            this.nativeCode = i;
        }
    }

    public CameraIntrinsics getImageIntrinsics() {
        MethodCollector.m26663i(10076);
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        MethodCollector.m26664o(10076);
        return cameraIntrinsics;
    }

    public CameraIntrinsics getTextureIntrinsics() {
        MethodCollector.m26663i(10240);
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        MethodCollector.m26664o(10240);
        return cameraIntrinsics;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Camera) && ((Camera) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    Camera(Session session2, Frame frame) {
        MethodCollector.m26663i(8367);
        this.session = session2;
        this.nativeHandle = nativeAcquireCamera(session2.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.m26664o(8367);
    }

    public void getViewMatrix(float[] fArr, int i) {
        MethodCollector.m26663i(9139);
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
        MethodCollector.m26664o(9139);
    }

    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        MethodCollector.m26663i(9915);
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, f, f2);
        MethodCollector.m26664o(9915);
    }
}
