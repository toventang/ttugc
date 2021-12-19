package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.ClientUploadRouterModel */
public final class ClientUploadRouterModel {
    @AbstractC27891c(mo46611a = "mode")
    private final int mode;
    @AbstractC27891c(mo46611a = "weight")
    private final int weight;

    static {
        Covode.recordClassIndex(77023);
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getWeight() {
        return this.weight;
    }

    public ClientUploadRouterModel(int i, int i2) {
        this.mode = i;
        this.weight = i2;
    }
}
