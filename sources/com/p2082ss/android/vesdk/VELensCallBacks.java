package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.vesdk.VELensCallBacks */
public class VELensCallBacks {
    private volatile VEListener.AbstractC85257z mLensStateListener;

    static {
        Covode.recordClassIndex(99297);
    }

    public void setmLensStateListener(Object obj) {
        this.mLensStateListener = (VEListener.AbstractC85257z) obj;
    }

    public static boolean onAlgorithmProcess(Object obj, int i) {
        if (obj instanceof VELensCallBacks) {
            VELensCallBacks vELensCallBacks = (VELensCallBacks) obj;
            if (vELensCallBacks.mLensStateListener == null || !vELensCallBacks.mLensStateListener.mo130311a()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
