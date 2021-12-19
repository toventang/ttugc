package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.ttve.nativePort.TEReverseCallback */
public class TEReverseCallback {
    private VEListener.AbstractC85249r listener;

    static {
        Covode.recordClassIndex(37305);
    }

    public void onProgressChanged(double d) {
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.AbstractC85249r) obj;
    }
}
