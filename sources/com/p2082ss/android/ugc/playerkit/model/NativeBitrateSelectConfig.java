package com.p2082ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.playerkit.model.NativeBitrateSelectConfig */
public class NativeBitrateSelectConfig {
    public int cacheCheck;
    public boolean useCallback;
    public boolean useNative;

    static {
        Covode.recordClassIndex(98102);
    }

    public NativeBitrateSelectConfig(boolean z, boolean z2, int i) {
        this.useCallback = z;
        this.useNative = z2;
        this.cacheCheck = i;
    }
}
