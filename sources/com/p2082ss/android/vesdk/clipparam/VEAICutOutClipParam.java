package com.p2082ss.android.vesdk.clipparam;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.vesdk.clipparam.VEAICutOutClipParam */
public class VEAICutOutClipParam {
    public int archerStrategy = -1;
    public VEListener.AbstractC85223ab listener;
    public String mModelPath = "";
    public String mWorkSpace = "";
    public String originPicForMask = "";
    public int trimIn;
    public int trimOut;

    static {
        Covode.recordClassIndex(99521);
    }

    public String toString() {
        return "VEAICutOutClipParam{trimIn=" + this.trimIn + ", maskPath='" + this.mWorkSpace + '\'' + ", mModelPath='" + this.mModelPath + '\'' + ", trimOut='" + this.trimOut + '\'' + ", archerStrategy='" + this.archerStrategy + '\'' + ", originPicForMask='" + this.originPicForMask + '\'' + '}';
    }
}
