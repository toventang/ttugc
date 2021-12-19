package com.p2082ss.android.ugc.aweme.feed.model.commercialize;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIStrategyConfig */
public final class CommerceSmartUIStrategyConfig implements Serializable {
    @AbstractC27891c(mo46611a = "default")
    private int defaultIndex;
    @AbstractC27891c(mo46611a = "lable_index_mapping")
    private List<String> lableIndexMapping;
    @AbstractC27891c(mo46611a = "plan")
    private PlanConfig[] plans;

    static {
        Covode.recordClassIndex(58782);
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLableIndexMapping() {
        return this.lableIndexMapping;
    }

    public final PlanConfig[] getPlans() {
        return this.plans;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLableIndexMapping(List<String> list) {
        this.lableIndexMapping = list;
    }

    public final void setPlans(PlanConfig[] planConfigArr) {
        this.plans = planConfigArr;
    }
}
