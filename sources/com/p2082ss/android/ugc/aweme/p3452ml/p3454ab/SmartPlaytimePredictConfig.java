package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartPlaytimePredictConfig */
public class SmartPlaytimePredictConfig {
    @AbstractC27891c(mo46611a = "services")
    private List<OnePlaytimePredictConfig> serviceList;

    static {
        Covode.recordClassIndex(70412);
    }

    public final List<OnePlaytimePredictConfig> getServiceList() {
        return this.serviceList;
    }

    public String toString() {
        return "{serviceList=" + this.serviceList + "}";
    }

    public final void setServiceList(List<OnePlaytimePredictConfig> list) {
        this.serviceList = list;
    }
}
