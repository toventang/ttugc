package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.c */
public final class C39242c {
    @AbstractC27891c(mo46611a = "following_list")

    /* renamed from: a */
    public int f92684a;

    static {
        Covode.recordClassIndex(46900);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39242c) && this.f92684a == ((C39242c) obj).f92684a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f92684a;
    }

    public final String toString() {
        return "FollowList(followingList=" + this.f92684a + ")";
    }

    public C39242c(int i) {
        this.f92684a = i;
    }
}
