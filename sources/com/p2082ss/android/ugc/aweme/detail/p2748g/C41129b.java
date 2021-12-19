package com.p2082ss.android.ugc.aweme.detail.p2748g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.g.b */
public final class C41129b implements AbstractC81914b {

    /* renamed from: a */
    public final String f96128a;

    /* renamed from: b */
    public final Aweme f96129b;

    /* renamed from: c */
    public final Throwable f96130c;

    static {
        Covode.recordClassIndex(49012);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41129b)) {
            return false;
        }
        C41129b bVar = (C41129b) obj;
        return C89219l.m154714a(this.f96128a, bVar.f96128a) && C89219l.m154714a(this.f96129b, bVar.f96129b) && C89219l.m154714a(this.f96130c, bVar.f96130c);
    }

    public final int hashCode() {
        String str = this.f96128a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f96129b;
        int hashCode2 = (hashCode + (aweme != null ? aweme.hashCode() : 0)) * 31;
        Throwable th = this.f96130c;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "DetailAwemeRespEvent(aid=" + this.f96128a + ", aweme=" + this.f96129b + ", error=" + this.f96130c + ")";
    }

    public C41129b(String str, Aweme aweme, Throwable th) {
        this.f96128a = str;
        this.f96129b = aweme;
        this.f96130c = th;
    }
}
