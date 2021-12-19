package com.p2082ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipParam */
public class VEClipParam {
    public int clipIndex;
    public int clipRotate;
    public int clipType;
    public String path;
    public int seqIn;
    public int seqOut;
    public double speed;
    public int trimIn;
    public int trimOut;

    static {
        Covode.recordClassIndex(99525);
    }

    public String toString() {
        return "VEClipParam: clipType=" + this.clipType + "path=" + this.path + " trimIn=" + this.trimIn + " trimOut:=" + this.trimOut + " speed=" + this.speed + " clipRotate=" + this.clipRotate;
    }
}
