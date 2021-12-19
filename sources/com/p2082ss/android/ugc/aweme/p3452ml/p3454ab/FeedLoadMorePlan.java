package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan */
public final class FeedLoadMorePlan {
    @AbstractC27891c(mo46611a = "delay")
    private int delay;
    @AbstractC27891c(mo46611a = "preload")
    private boolean preload;

    static {
        Covode.recordClassIndex(70403);
    }

    public final int getDelay() {
        return this.delay;
    }

    public final boolean getPreload() {
        return this.preload;
    }

    public final String toString() {
        return "(preload=" + this.preload + ", delay=" + this.delay + ')';
    }

    public final void setDelay(int i) {
        this.delay = i;
    }

    public final void setPreload(boolean z) {
        this.preload = z;
    }
}
