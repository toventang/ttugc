package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.TEVideoUtils;

/* renamed from: com.ss.android.vesdk.VECurveSpeedUtils */
public class VECurveSpeedUtils {
    private double mAveSpeed;
    private float[] mCurveSpeedPointX;
    private float[] mCurveSpeedPointY;
    private volatile long mNative;

    static {
        Covode.recordClassIndex(99280);
    }

    public synchronized void destroy() {
        MethodCollector.m26663i(4073);
        C85315al.m146637a("VECurveSpeedUtils", "destroy...");
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "destroy, mNative == 0");
            MethodCollector.m26664o(4073);
            return;
        }
        TEVideoUtils.nativeCurveSpeedDestroy(this.mNative);
        this.mNative = 0;
        MethodCollector.m26664o(4073);
    }

    public double getAveCurveSpeed() {
        MethodCollector.m26663i(3875);
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "getAveCurveSpeed, mNative == 0");
            MethodCollector.m26664o(3875);
            return -112.0d;
        }
        double nativeGetAveCurveSpeed = TEVideoUtils.nativeGetAveCurveSpeed(this.mNative);
        this.mAveSpeed = nativeGetAveCurveSpeed;
        MethodCollector.m26664o(3875);
        return nativeGetAveCurveSpeed;
    }

    public double getCurveSpeedWithSeqDelta(long j) {
        MethodCollector.m26663i(4005);
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "getCurveSpeedWithSeqDelta, mNative == 0");
            MethodCollector.m26664o(4005);
            return -112.0d;
        }
        double nativeGetCurveSpeedWithSeqDelta = TEVideoUtils.nativeGetCurveSpeedWithSeqDelta(this.mNative, j * 1000);
        MethodCollector.m26664o(4005);
        return nativeGetCurveSpeedWithSeqDelta;
    }

    public long mapSeqDeltaToTrimDelta(long j) {
        MethodCollector.m26663i(4069);
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "mapSeqDeltaToTrimDelta, mNative == 0");
            MethodCollector.m26664o(4069);
            return -112;
        }
        long nativeMapSeqDeltaToTrimDelta = TEVideoUtils.nativeMapSeqDeltaToTrimDelta(this.mNative, j * 1000) / 1000;
        MethodCollector.m26664o(4069);
        return nativeMapSeqDeltaToTrimDelta;
    }

    public long mapTrimDeltaToSeqDelta(long j) {
        MethodCollector.m26663i(4071);
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "mapTrimDeltaToSeqDelta, mNative == 0");
            MethodCollector.m26664o(4071);
            return -112;
        }
        long nativeMapTrimDeltaToSeqDelta = TEVideoUtils.nativeMapTrimDeltaToSeqDelta(this.mNative, j * 1000) / 1000;
        MethodCollector.m26664o(4071);
        return nativeMapTrimDeltaToSeqDelta;
    }

    public void setSeqDuration(long j) {
        MethodCollector.m26663i(4001);
        if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "setSeqDuration, mNative == 0");
            MethodCollector.m26664o(4001);
            return;
        }
        TEVideoUtils.nativeSetSeqDuration(this.mNative, j * 1000);
        MethodCollector.m26664o(4001);
    }

    public int setCurveSpeed(float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(3871);
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            C85315al.m146642d("VECurveSpeedUtils", "setCurveSpeed,incorrect curve anchors, mNative == 0");
            MethodCollector.m26664o(3871);
            return -100;
        } else if (this.mNative == 0) {
            C85315al.m146642d("VECurveSpeedUtils", "setCurveSpeed, mNative == 0");
            MethodCollector.m26664o(3871);
            return -112;
        } else {
            int nativeSetCurveSpeedData = TEVideoUtils.nativeSetCurveSpeedData(this.mNative, fArr, fArr2);
            MethodCollector.m26664o(3871);
            return nativeSetCurveSpeedData;
        }
    }

    public VECurveSpeedUtils(float[] fArr, float[] fArr2) {
        MethodCollector.m26663i(3857);
        if (fArr == null || fArr2 == null || fArr.length != fArr2.length || fArr.length < 2) {
            this.mNative = 0;
            C85315al.m146642d("VECurveSpeedUtils", "incorrect curve anchors, mNative == 0");
            MethodCollector.m26664o(3857);
            return;
        }
        this.mNative = TEVideoUtils.nativeCreateCurveSpeedUtils(fArr, fArr2);
        this.mCurveSpeedPointX = fArr;
        this.mCurveSpeedPointY = fArr2;
        int curveSpeed = setCurveSpeed(fArr, fArr2);
        C85315al.m146639b("VECurveSpeedUtils", "VECurveSpeedUtils ret1 " + curveSpeed + " ret2 " + getAveCurveSpeed());
        MethodCollector.m26664o(3857);
    }

    public static float[] transferTrimPointXtoSeqPointX(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float[] fArr3 = new float[length];
        int i = 0;
        float f = 0.0f;
        fArr3[0] = 0.0f;
        while (i < length - 1) {
            int i2 = i + 1;
            f += (fArr[i2] - fArr[i]) / ((fArr2[i2] + fArr2[i]) * 0.5f);
            fArr3[i2] = f;
            i = i2;
        }
        for (int i3 = 1; i3 < length; i3++) {
            fArr3[i3] = fArr3[i3] / f;
            C85315al.m146639b("TAG", "transferTrimPointXtoSeqPointX SeqPointX[" + i3 + "]= " + fArr3[i3]);
        }
        return fArr3;
    }
}
