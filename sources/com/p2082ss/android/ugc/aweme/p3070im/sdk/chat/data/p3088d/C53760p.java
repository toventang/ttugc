package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.p */
public final class C53760p extends AbstractC53746c {

    /* renamed from: a */
    public final List<C19538ai> f123301a;

    /* renamed from: b */
    public final boolean f123302b;

    static {
        Covode.recordClassIndex(63340);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53760p)) {
            return false;
        }
        C53760p pVar = (C53760p) obj;
        return C89219l.m154714a(this.f123301a, pVar.f123301a) && this.f123302b == pVar.f123302b;
    }

    public final int hashCode() {
        List<C19538ai> list = this.f123301a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f123302b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "OnLoadNewerEvent(list=" + this.f123301a + ", success=" + this.f123302b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53760p(List<C19538ai> list, boolean z) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        this.f123301a = list;
        this.f123302b = z;
    }
}
