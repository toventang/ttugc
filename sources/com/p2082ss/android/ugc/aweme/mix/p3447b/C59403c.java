package com.p2082ss.android.ugc.aweme.mix.p3447b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.b.c */
public final class C59403c implements AbstractC81914b {

    /* renamed from: a */
    public final String f135695a;

    /* renamed from: b */
    public final String f135696b;

    static {
        Covode.recordClassIndex(69795);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59403c)) {
            return false;
        }
        C59403c cVar = (C59403c) obj;
        return C89219l.m154714a(this.f135695a, cVar.f135695a) && C89219l.m154714a(this.f135696b, cVar.f135696b);
    }

    public final int hashCode() {
        String str = this.f135695a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f135696b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ChangePlayListNameEvent(name=" + this.f135695a + ", mixId=" + this.f135696b + ")";
    }

    public C59403c(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f135695a = str;
        this.f135696b = str2;
    }
}
