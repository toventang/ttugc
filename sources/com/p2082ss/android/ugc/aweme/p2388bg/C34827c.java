package com.p2082ss.android.ugc.aweme.p2388bg;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bg.c */
public final class C34827c {
    @AbstractC27891c(mo46611a = "label")

    /* renamed from: a */
    public final String f82267a;
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: b */
    public final String f82268b;
    @AbstractC27891c(mo46611a = "background_image_url")

    /* renamed from: c */
    public final String f82269c;

    static {
        Covode.recordClassIndex(41835);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34827c)) {
            return false;
        }
        C34827c cVar = (C34827c) obj;
        return C89219l.m154714a(this.f82267a, cVar.f82267a) && C89219l.m154714a(this.f82268b, cVar.f82268b) && C89219l.m154714a(this.f82269c, cVar.f82269c);
    }

    public final int hashCode() {
        String str = this.f82267a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f82268b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f82269c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "KproPopupButtonSetting(label=" + this.f82267a + ", color=" + this.f82268b + ", backGroundImageUrl=" + this.f82269c + ")";
    }
}
