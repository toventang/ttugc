package com.p2082ss.android.ugc.aweme.notice.api.p3510b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.b.b */
public final class C61546b implements AbstractC81914b {

    /* renamed from: a */
    public final String f139697a;

    /* renamed from: b */
    public final int f139698b;

    static {
        Covode.recordClassIndex(72216);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61546b)) {
            return false;
        }
        C61546b bVar = (C61546b) obj;
        return C89219l.m154714a(this.f139697a, bVar.f139697a) && this.f139698b == bVar.f139698b;
    }

    public final int hashCode() {
        String str = this.f139697a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f139698b;
    }

    public final String toString() {
        return "FollowRequestResEvent(uid=" + this.f139697a + ", type=" + this.f139698b + ")";
    }

    public C61546b(String str, int i) {
        C89219l.m154721d(str, "");
        this.f139697a = str;
        this.f139698b = i;
    }
}
