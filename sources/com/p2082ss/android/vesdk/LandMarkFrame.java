package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.LandMarkFrame */
public class LandMarkFrame {
    private float[] FOVAngle;
    private float[] quaternion;
    private double sensorTimestamp;

    static {
        Covode.recordClassIndex(99235);
    }

    public float[] getFOVAngle() {
        return this.FOVAngle;
    }

    public float[] getQuaternion() {
        return this.quaternion;
    }

    public double getSensorTimestamp() {
        return this.sensorTimestamp;
    }

    public void setFOVAngle(float[] fArr) {
        this.FOVAngle = fArr;
    }

    public void setQuaternion(float[] fArr) {
        this.quaternion = fArr;
    }

    public void setSensorTimestamp(double d) {
        this.sensorTimestamp = d;
    }

    /* access modifiers changed from: package-private */
    public void setInfo(double d, float[] fArr, float[] fArr2) {
        this.sensorTimestamp = d;
        this.quaternion = fArr;
        this.FOVAngle = fArr2;
    }
}
