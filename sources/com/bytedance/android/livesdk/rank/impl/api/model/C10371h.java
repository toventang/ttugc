package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.api.model.h */
public final class C10371h {
    @AbstractC27891c(mo46611a = "threshold")

    /* renamed from: a */
    public int f25059a;
    @AbstractC27891c(mo46611a = "fuzzy_text")

    /* renamed from: b */
    public String f25060b;

    static {
        Covode.recordClassIndex(11945);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10371h)) {
            return false;
        }
        C10371h hVar = (C10371h) obj;
        return this.f25059a == hVar.f25059a && C89219l.m154714a(this.f25060b, hVar.f25060b);
    }

    public final int hashCode() {
        int i = this.f25059a * 31;
        String str = this.f25060b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ThresholdConfig(threshold=" + this.f25059a + ", fuzzyText=" + this.f25060b + ")";
    }

    private /* synthetic */ C10371h() {
        this("");
    }

    private C10371h(String str) {
        C89219l.m154721d(str, "");
        this.f25059a = 0;
        this.f25060b = str;
    }
}
