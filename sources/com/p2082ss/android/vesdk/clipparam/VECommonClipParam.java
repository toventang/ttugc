package com.p2082ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;

/* renamed from: com.ss.android.vesdk.clipparam.VECommonClipParam */
public class VECommonClipParam {
    public String mp4DecryptionKey;
    public String path;
    public int seqIn = -1;
    public int seqOut = -1;
    public double speed = 1.0d;
    public int trimIn = -1;
    public int trimOut = -1;
    public int videoClipRotate = ROTATE_DEGREE.ROTATE_NONE.ordinal();

    static {
        Covode.recordClassIndex(99530);
    }

    public String toString() {
        return "VECommonClip{trimIn=" + this.trimIn + ", trimOut=" + this.trimOut + ", path='" + this.path + '\'' + ", mp4DecryptionKey='" + this.mp4DecryptionKey + '\'' + ", speed=" + this.speed + ", seqIn=" + this.seqIn + ", seqOut=" + this.seqOut + ", videoClipRotate=" + this.videoClipRotate + '}';
    }
}
