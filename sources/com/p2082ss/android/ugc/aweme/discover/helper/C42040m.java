package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.m */
public final class C42040m {
    @AbstractC27891c(mo46611a = "query")

    /* renamed from: a */
    public final String f98007a;
    @AbstractC27891c(mo46611a = "search_id")

    /* renamed from: b */
    public final String f98008b;
    @AbstractC27891c(mo46611a = "channel")

    /* renamed from: c */
    public final String f98009c;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: d */
    public final String f98010d;
    @AbstractC27891c(mo46611a = "time")

    /* renamed from: e */
    public final Long f98011e;

    static {
        Covode.recordClassIndex(49970);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42040m)) {
            return false;
        }
        C42040m mVar = (C42040m) obj;
        return C89219l.m154714a(this.f98007a, mVar.f98007a) && C89219l.m154714a(this.f98008b, mVar.f98008b) && C89219l.m154714a(this.f98009c, mVar.f98009c) && C89219l.m154714a(this.f98010d, mVar.f98010d) && C89219l.m154714a(this.f98011e, mVar.f98011e);
    }

    public final int hashCode() {
        String str = this.f98007a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f98008b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f98009c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f98010d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.f98011e;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "LastSearch(query=" + this.f98007a + ", search_id=" + this.f98008b + ", channel=" + this.f98009c + ", source=" + this.f98010d + ", time=" + this.f98011e + ")";
    }

    private /* synthetic */ C42040m() {
        this("", "", "", "", 0L);
    }

    public C42040m(String str, String str2, String str3, String str4, Long l) {
        this.f98007a = str;
        this.f98008b = str2;
        this.f98009c = str3;
        this.f98010d = str4;
        this.f98011e = l;
    }
}
