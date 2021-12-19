package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.FeatureFeedTypeConfig */
public final class FeatureFeedTypeConfig extends FeatureTypeConfig {
    @AbstractC27891c(mo46611a = "feed_range_type")
    private String feedRangeType = "all";
    private List<String> feedRangeTypeList;
    @AbstractC27891c(mo46611a = "range")
    private int range;

    static {
        Covode.recordClassIndex(70537);
    }

    public final String getFeedRangeType() {
        return this.feedRangeType;
    }

    public final int getRange() {
        return this.range;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig
    public final String toString() {
        return "FeedType{super=" + super.toString() + ", range=" + this.range + ", feedRangeType=" + this.feedRangeType + '}';
    }

    public final void setRange(int i) {
        this.range = i;
    }

    public final void setFeedRangeType(String str) {
        C89219l.m154721d(str, "");
        this.feedRangeType = str;
    }

    public final boolean containFeedRangeType(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(this.feedRangeType)) {
            return false;
        }
        if (TextUtils.equals(this.feedRangeType, "all")) {
            return true;
        }
        if (this.feedRangeTypeList == null) {
            this.feedRangeTypeList = C89361p.m154915b(this.feedRangeType, new String[]{"|"});
        }
        List<String> list = this.feedRangeTypeList;
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }
}
