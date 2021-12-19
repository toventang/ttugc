package com.p2082ss.android.ugc.aweme.follow;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.follow.a */
public final class C51065a {
    @AbstractC27891c(mo46611a = "index")

    /* renamed from: a */
    public final int f117787a;
    @AbstractC27891c(mo46611a = "msg")

    /* renamed from: b */
    public final String f117788b;

    static {
        Covode.recordClassIndex(60251);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51065a)) {
            return false;
        }
        C51065a aVar = (C51065a) obj;
        return this.f117787a == aVar.f117787a && C89219l.m154714a(this.f117788b, aVar.f117788b);
    }

    public final int hashCode() {
        int i = this.f117787a * 31;
        String str = this.f117788b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LastViewData(index=" + this.f117787a + ", lastViewHint=" + this.f117788b + ")";
    }
}
