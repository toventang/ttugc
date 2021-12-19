package com.p2082ss.android.ugc.aweme.social.p3914a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.a.a */
public final class C74699a {
    @AbstractC27891c(mo46611a = "group")

    /* renamed from: a */
    public final int f167895a;
    @AbstractC27891c(mo46611a = "unclick_suggestcard_limit")

    /* renamed from: b */
    public final Integer f167896b;
    @AbstractC27891c(mo46611a = "untoplist_suggestcard_day")

    /* renamed from: c */
    public final Integer f167897c;
    @AbstractC27891c(mo46611a = "hidden_suggestcard_day")

    /* renamed from: d */
    public final Integer f167898d;

    static {
        Covode.recordClassIndex(87534);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74699a)) {
            return false;
        }
        C74699a aVar = (C74699a) obj;
        return this.f167895a == aVar.f167895a && C89219l.m154714a(this.f167896b, aVar.f167896b) && C89219l.m154714a(this.f167897c, aVar.f167897c) && C89219l.m154714a(this.f167898d, aVar.f167898d);
    }

    public final int hashCode() {
        int i = this.f167895a * 31;
        Integer num = this.f167896b;
        int i2 = 0;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f167897c;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f167898d;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "FollowingListFreqParams(group=" + this.f167895a + ", maxClickSuggestCardCount=" + this.f167896b + ", unTopListSuggestCardDay=" + this.f167897c + ", hideSuggestCardDay=" + this.f167898d + ")";
    }

    private C74699a() {
        this.f167895a = 1;
        this.f167896b = null;
        this.f167897c = null;
        this.f167898d = null;
    }

    public /* synthetic */ C74699a(byte b) {
        this();
    }
}
