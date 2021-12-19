package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.a */
public final class C41921a implements AbstractC81914b {

    /* renamed from: a */
    public final int f97789a = 2;

    /* renamed from: b */
    public final String f97790b;

    static {
        Covode.recordClassIndex(49847);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41921a)) {
            return false;
        }
        C41921a aVar = (C41921a) obj;
        return this.f97789a == aVar.f97789a && C89219l.m154714a(this.f97790b, aVar.f97790b);
    }

    public final int hashCode() {
        int i = this.f97789a * 31;
        String str = this.f97790b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CancelMixRequestEvent(code=" + this.f97789a + ", reason=" + this.f97790b + ")";
    }

    /* renamed from: a */
    public final AbstractC81914b mo71067a() {
        if (((Boolean) C67641m.f151544b.getValue()).booleanValue()) {
            AbstractC81915c.m141874a(this);
        }
        return this;
    }

    public C41921a(String str) {
        this.f97790b = str;
    }
}
