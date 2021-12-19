package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.AfrResponse */
public final class AfrResponse extends DataBaseResponse {
    @AbstractC27891c(mo46611a = "afr_data")
    private List<AfrData> afrData;

    static {
        Covode.recordClassIndex(92126);
    }

    public final List<AfrData> getAfrData() {
        return this.afrData;
    }

    public final void setAfrData(List<AfrData> list) {
        this.afrData = list;
    }
}
