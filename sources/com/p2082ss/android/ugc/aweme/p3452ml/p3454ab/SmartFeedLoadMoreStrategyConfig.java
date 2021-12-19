package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig */
public final class SmartFeedLoadMoreStrategyConfig {
    @AbstractC27891c(mo46611a = "default")
    private int defaultIndex;
    @AbstractC27891c(mo46611a = "label_index_mapping")
    private List<String> labelIndexMapping;
    @AbstractC27891c(mo46611a = "plan")
    private final List<FeedLoadMorePlan> plans;

    static {
        Covode.recordClassIndex(70411);
    }

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final List<String> getLabelIndexMapping() {
        return this.labelIndexMapping;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final void setLabelIndexMapping(List<String> list) {
        this.labelIndexMapping = list;
    }

    public final FeedLoadMorePlan getPlan(String str) {
        List<String> list;
        int indexOf;
        C89219l.m154721d(str, "");
        if (this.plans == null || (list = this.labelIndexMapping) == null || (indexOf = list.indexOf(str)) < 0 || indexOf >= this.plans.size()) {
            return null;
        }
        return this.plans.get(indexOf);
    }
}
