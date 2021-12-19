package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig */
public final class OnePlaytimePredictRealConfig {
    @AbstractC27891c(mo46611a = "count")
    private int count;
    @AbstractC27891c(mo46611a = "duration")
    private int duration;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;

    static {
        Covode.recordClassIndex(70405);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getType() {
        return this.type;
    }

    public final String toString() {
        return "Real(type=" + this.type + ", count=" + this.count + ", duration=" + this.duration + ')';
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
