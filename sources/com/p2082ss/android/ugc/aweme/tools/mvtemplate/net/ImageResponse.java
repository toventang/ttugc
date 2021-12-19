package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse */
public final class ImageResponse extends BaseNetResponse {
    private AfrResponse data;

    static {
        Covode.recordClassIndex(92128);
    }

    public final AfrResponse getData() {
        return this.data;
    }

    public final void setData(AfrResponse afrResponse) {
        this.data = afrResponse;
    }
}
