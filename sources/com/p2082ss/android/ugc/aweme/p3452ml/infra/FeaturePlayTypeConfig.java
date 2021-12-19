package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.FeaturePlayTypeConfig */
public final class FeaturePlayTypeConfig extends FeatureTypeConfig {
    @AbstractC27891c(mo46611a = "feed_range_type")
    private String feedRangeType = "all";
    private List<String> feedRangeTypeList;
    @AbstractC27891c(mo46611a = "play_range_type")
    private String playRangeType = "all";
    private List<String> playRangeTypeList;
    @AbstractC27891c(mo46611a = "range")
    private int range;
    @AbstractC27891c(mo46611a = "exclude_this")
    private boolean rangeExcludeThis;

    static {
        Covode.recordClassIndex(70539);
    }

    public final String getFeedRangeType() {
        return this.feedRangeType;
    }

    public final String getPlayRangeType() {
        return this.playRangeType;
    }

    public final int getRange() {
        return this.range;
    }

    public final boolean getRangeExcludeThis() {
        return this.rangeExcludeThis;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig
    public final String toString() {
        return "PlayType{super=" + super.toString() + ", range=" + this.range + ", playRangeType=" + this.playRangeType + ", feedRangeType=" + this.feedRangeType + ", rangeExcludeThis=" + this.rangeExcludeThis + '}';
    }

    public final void setRange(int i) {
        this.range = i;
    }

    public final void setRangeExcludeThis(boolean z) {
        this.rangeExcludeThis = z;
    }

    public final void setFeedRangeType(String str) {
        C89219l.m154721d(str, "");
        this.feedRangeType = str;
    }

    public final void setPlayRangeType(String str) {
        C89219l.m154721d(str, "");
        this.playRangeType = str;
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

    public final boolean containPlayRangeType(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(this.playRangeType)) {
            return false;
        }
        if (TextUtils.equals(this.playRangeType, "all")) {
            return true;
        }
        if (this.playRangeTypeList == null) {
            this.playRangeTypeList = C89361p.m154915b(this.playRangeType, new String[]{"|"});
        }
        List<String> list = this.playRangeTypeList;
        if (list != null) {
            return list.contains(str);
        }
        return false;
    }
}
