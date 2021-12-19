package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.q */
public final class C53761q extends AbstractC53746c {

    /* renamed from: a */
    public final List<C19538ai> f123303a;

    /* renamed from: b */
    public final boolean f123304b;

    static {
        Covode.recordClassIndex(63341);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53761q)) {
            return false;
        }
        C53761q qVar = (C53761q) obj;
        return C89219l.m154714a(this.f123303a, qVar.f123303a) && this.f123304b == qVar.f123304b;
    }

    public final int hashCode() {
        List<C19538ai> list = this.f123303a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        boolean z = this.f123304b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "OnLoadOlderEvent(list=" + this.f123303a + ", success=" + this.f123304b + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53761q(List<C19538ai> list, boolean z) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        this.f123303a = list;
        this.f123304b = z;
    }
}
