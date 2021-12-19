package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.ar.core.CameraIntrinsics */
public class CameraIntrinsics {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32580);
    }

    protected CameraIntrinsics() {
    }

    private native long nativeCreateIntrinsics(long j, float f, float f2, float f3, float f4, int i, int i2);

    private native void nativeDestroyCameraIntrinsics(long j, long j2);

    private native void nativeGetFocalLength(long j, long j2, float[] fArr, int i);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr, int i);

    private native void nativeGetPrincipalPoint(long j, long j2, float[] fArr, int i);

    public float[] getFocalLength() {
        float[] fArr = new float[2];
        getFocalLength(fArr, 0);
        return fArr;
    }

    public int[] getImageDimensions() {
        int[] iArr = new int[2];
        getImageDimensions(iArr, 0);
        return iArr;
    }

    public float[] getPrincipalPoint() {
        float[] fArr = new float[2];
        getPrincipalPoint(fArr, 0);
        return fArr;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(9142);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraIntrinsics(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(9142);
    }

    CameraIntrinsics(long j, Session session2) {
        this.nativeHandle = j;
        this.session = session2;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public void getFocalLength(float[] fArr, int i) {
        MethodCollector.m26663i(9143);
        nativeGetFocalLength(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
        MethodCollector.m26664o(9143);
    }

    public void getImageDimensions(int[] iArr, int i) {
        MethodCollector.m26663i(9444);
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr, i);
        MethodCollector.m26664o(9444);
    }

    public void getPrincipalPoint(float[] fArr, int i) {
        MethodCollector.m26663i(9289);
        nativeGetPrincipalPoint(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
        MethodCollector.m26664o(9289);
    }
}
