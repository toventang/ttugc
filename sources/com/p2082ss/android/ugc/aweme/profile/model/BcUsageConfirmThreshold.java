package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.BcUsageConfirmThreshold */
public final class BcUsageConfirmThreshold implements Serializable {
    @AbstractC27891c(mo46611a = "app")
    private final boolean app;
    @AbstractC27891c(mo46611a = "h5")

    /* renamed from: h5 */
    private final boolean f144670h5;

    static {
        Covode.recordClassIndex(75155);
    }

    public final boolean getApp() {
        return this.app;
    }

    public final boolean getH5() {
        return this.f144670h5;
    }
}
