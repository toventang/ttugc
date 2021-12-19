package com.p2082ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.n */
public final class C56867n {
    @AbstractC27891c(mo46611a = "screen_title")

    /* renamed from: a */
    public final String f129493a;
    @AbstractC27891c(mo46611a = "screen_subtitle")

    /* renamed from: b */
    public final String f129494b;
    @AbstractC27891c(mo46611a = "skippable")

    /* renamed from: c */
    public final Boolean f129495c;
    @AbstractC27891c(mo46611a = "choices")

    /* renamed from: d */
    public final C56833a f129496d;

    static {
        Covode.recordClassIndex(66753);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56867n)) {
            return false;
        }
        C56867n nVar = (C56867n) obj;
        return C89219l.m154714a(this.f129493a, nVar.f129493a) && C89219l.m154714a(this.f129494b, nVar.f129494b) && C89219l.m154714a(this.f129495c, nVar.f129495c) && C89219l.m154714a(this.f129496d, nVar.f129496d);
    }

    public final int hashCode() {
        String str = this.f129493a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f129494b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f129495c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        C56833a aVar = this.f129496d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "JourneyGenderSelectionWrapper(screen_title=" + this.f129493a + ", screen_subtitle=" + this.f129494b + ", skippable=" + this.f129495c + ", choices=" + this.f129496d + ")";
    }
}
