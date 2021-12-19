package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.VEListener;

/* renamed from: com.ss.android.vesdk.TEEffectCallback */
public class TEEffectCallback {
    private VEListener.VEEditorEffectListener listener;

    static {
        Covode.recordClassIndex(99239);
    }

    public void onDone(int i, boolean z) {
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.VEEditorEffectListener) obj;
    }
}
