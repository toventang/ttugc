package com.p2082ss.android.ugc.aweme.specact.popup.p3942a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.a.d */
public final class C75119d {
    @AbstractC27891c(mo46611a = C19386b.f45894a)

    /* renamed from: a */
    public String f168868a;

    static {
        Covode.recordClassIndex(87992);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C75119d) && C89219l.m154714a(this.f168868a, ((C75119d) obj).f168868a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f168868a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Font(color=" + this.f168868a + ")";
    }

    public /* synthetic */ C75119d() {
        this("");
    }

    private C75119d(String str) {
        C89219l.m154721d(str, "");
        this.f168868a = str;
    }
}
