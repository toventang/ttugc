package com.p2082ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.AbstractC85319ao;

/* renamed from: com.ss.android.ttve.nativePort.TEAudioUtilsCallback */
public class TEAudioUtilsCallback {
    private AbstractC85319ao listener;

    static {
        Covode.recordClassIndex(37290);
    }

    public void onProgressChanged(double d) {
    }

    public void setListener(Object obj) {
        this.listener = (AbstractC85319ao) obj;
    }
}
