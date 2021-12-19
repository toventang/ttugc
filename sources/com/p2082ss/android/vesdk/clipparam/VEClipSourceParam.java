package com.p2082ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.clipparam.VEClipSourceParam */
public class VEClipSourceParam {
    public int clipColorValue;
    public String clipFilePath = "";
    public int clipHeight;
    public int clipRefIndex;
    public String clipSegmentId = "";
    public int clipWidth;
    public int sourceType;

    static {
        Covode.recordClassIndex(99526);
    }

    public String toString() {
        return "VEClipSourceParam{sourceType=" + this.sourceType + ", clipFilePath='" + this.clipFilePath + '\'' + ", clipSegmentId='" + this.clipSegmentId + '\'' + ", clipRefIndex=" + this.clipRefIndex + ", clipColorValue=" + this.clipColorValue + ", clipWidth=" + this.clipWidth + ", clipHeight=" + this.clipHeight + '}';
    }
}
