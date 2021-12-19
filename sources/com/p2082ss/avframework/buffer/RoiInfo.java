package com.p2082ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.NativeObject;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.buffer.RoiInfo */
public class RoiInfo extends NativeObject {
    private long externalNativeObj;

    static {
        Covode.recordClassIndex(99832);
    }

    private native void nativeCreate();

    private native int nativeGetCenterPosX();

    private native int nativeGetCenterPosY();

    private native ByteBuffer nativeGetFacePointsData();

    private native int nativeGetRoiHeight();

    private native float nativeGetRoiPitch();

    private native float nativeGetRoiRoll();

    private native int nativeGetRoiWidth();

    private native float nativeGetRoiYaw();

    private native int[] nativeGetStretchedRoi();

    private native void nativeLockFacePointsData();

    private native void nativeSetEnable(boolean z);

    private native void nativeSetRoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3);

    private native void nativeUnlockFacePointsData();

    public RoiInfo() {
        MethodCollector.m26663i(5080);
        nativeCreate();
        MethodCollector.m26664o(5080);
    }

    public int getCenterPosX() {
        MethodCollector.m26663i(5176);
        int nativeGetCenterPosX = nativeGetCenterPosX();
        MethodCollector.m26664o(5176);
        return nativeGetCenterPosX;
    }

    public int getCenterPosY() {
        MethodCollector.m26663i(5287);
        int nativeGetCenterPosY = nativeGetCenterPosY();
        MethodCollector.m26664o(5287);
        return nativeGetCenterPosY;
    }

    public ByteBuffer getFacePointsData() {
        MethodCollector.m26663i(6627);
        ByteBuffer nativeGetFacePointsData = nativeGetFacePointsData();
        MethodCollector.m26664o(6627);
        return nativeGetFacePointsData;
    }

    public int getRoiHeight() {
        MethodCollector.m26663i(5739);
        int nativeGetRoiHeight = nativeGetRoiHeight();
        MethodCollector.m26664o(5739);
        return nativeGetRoiHeight;
    }

    public float getRoiPitch() {
        MethodCollector.m26663i(6019);
        float nativeGetRoiPitch = nativeGetRoiPitch();
        MethodCollector.m26664o(6019);
        return nativeGetRoiPitch;
    }

    public float getRoiRoll() {
        MethodCollector.m26663i(6020);
        float nativeGetRoiRoll = nativeGetRoiRoll();
        MethodCollector.m26664o(6020);
        return nativeGetRoiRoll;
    }

    public int getRoiWidth() {
        MethodCollector.m26663i(5503);
        int nativeGetRoiWidth = nativeGetRoiWidth();
        MethodCollector.m26664o(5503);
        return nativeGetRoiWidth;
    }

    public float getRoiYaw() {
        MethodCollector.m26663i(5875);
        float nativeGetRoiYaw = nativeGetRoiYaw();
        MethodCollector.m26664o(5875);
        return nativeGetRoiYaw;
    }

    public int[] getStretchedRoi() {
        MethodCollector.m26663i(6176);
        int[] nativeGetStretchedRoi = nativeGetStretchedRoi();
        MethodCollector.m26664o(6176);
        return nativeGetStretchedRoi;
    }

    public void lockFacePointsData() {
        MethodCollector.m26663i(6330);
        nativeLockFacePointsData();
        MethodCollector.m26664o(6330);
    }

    public void unlockFacePointsData() {
        MethodCollector.m26663i(6477);
        nativeUnlockFacePointsData();
        MethodCollector.m26664o(6477);
    }

    @Override // com.p2082ss.avframework.engine.NativeObject
    public void release() {
        if (this.externalNativeObj != 0) {
            setNativeObj(0);
            this.externalNativeObj = 0;
        }
        super.release();
    }

    public void setEnable(boolean z) {
        MethodCollector.m26663i(5174);
        nativeSetEnable(z);
        MethodCollector.m26664o(5174);
    }

    public RoiInfo(long j) {
        this.externalNativeObj = j;
        setNativeObj(j);
    }

    public RoiInfo(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this();
        MethodCollector.m26663i(5091);
        nativeSetRoiInfo(i, i2, i3, i4, f, f2, f3);
        MethodCollector.m26664o(5091);
    }
}
