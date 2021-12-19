package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.g */
public final class C75122g {
    @AbstractC27891c(mo46611a = "bar_image")

    /* renamed from: a */
    public String f168875a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    public String f168876b;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: c */
    public String f168877c;

    static {
        Covode.recordClassIndex(87995);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75122g)) {
            return false;
        }
        C75122g gVar = (C75122g) obj;
        return C89219l.m154714a(this.f168875a, gVar.f168875a) && C89219l.m154714a(this.f168876b, gVar.f168876b) && C89219l.m154714a(this.f168877c, gVar.f168877c);
    }

    public final int hashCode() {
        String str = this.f168875a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f168876b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f168877c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProgressBar(barImage=" + this.f168875a + ", text=" + this.f168876b + ", color=" + this.f168877c + ")";
    }

    public /* synthetic */ C75122g() {
        this("", "", "");
    }

    private C75122g(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f168875a = str;
        this.f168876b = str2;
        this.f168877c = str3;
    }
}
