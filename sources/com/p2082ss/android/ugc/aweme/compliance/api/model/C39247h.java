package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.h */
public final class C39247h {
    @AbstractC27891c(mo46611a = "favorite_list")

    /* renamed from: a */
    public int f92705a;

    static {
        Covode.recordClassIndex(46905);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39247h) && this.f92705a == ((C39247h) obj).f92705a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f92705a;
    }

    public final String toString() {
        return "LikedList(favoriteList=" + this.f92705a + ")";
    }

    public C39247h(int i) {
        this.f92705a = i;
    }
}
