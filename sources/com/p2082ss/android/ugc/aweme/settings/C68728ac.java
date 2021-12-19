package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.ac */
public final class C68728ac {
    @AbstractC27891c(mo46611a = "channel")

    /* renamed from: a */
    public final String f153746a;
    @AbstractC27891c(mo46611a = "source_url")

    /* renamed from: b */
    public final String f153747b;

    static {
        Covode.recordClassIndex(80997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68728ac)) {
            return false;
        }
        C68728ac acVar = (C68728ac) obj;
        return C89219l.m154714a(this.f153746a, acVar.f153746a) && C89219l.m154714a(this.f153747b, acVar.f153747b);
    }

    public final int hashCode() {
        String str = this.f153746a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f153747b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RnSourceUrlSetting(channel=" + this.f153746a + ", sourceUrl=" + this.f153747b + ")";
    }

    private /* synthetic */ C68728ac() {
        this("", "");
    }

    private C68728ac(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f153746a = str;
        this.f153747b = str2;
    }
}
