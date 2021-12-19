package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.r */
public final class C53762r extends AbstractC53746c {

    /* renamed from: a */
    public final List<C19538ai> f123305a;

    /* renamed from: b */
    public final int f123306b;

    /* renamed from: c */
    public final String f123307c;

    static {
        Covode.recordClassIndex(63342);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53762r)) {
            return false;
        }
        C53762r rVar = (C53762r) obj;
        return C89219l.m154714a(this.f123305a, rVar.f123305a) && this.f123306b == rVar.f123306b && C89219l.m154714a(this.f123307c, rVar.f123307c);
    }

    public final int hashCode() {
        List<C19538ai> list = this.f123305a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f123306b) * 31;
        String str = this.f123307c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnQueryMessageEvent(list=" + this.f123305a + ", direction=" + this.f123306b + ", from=" + this.f123307c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53762r(List<C19538ai> list, int i, String str) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        this.f123305a = list;
        this.f123306b = i;
        this.f123307c = str;
    }
}
