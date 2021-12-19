package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.j */
public final class C39138j<DATA> {

    /* renamed from: a */
    public final DATA f92344a;

    /* renamed from: b */
    public final Throwable f92345b;

    static {
        Covode.recordClassIndex(46756);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39138j)) {
            return false;
        }
        C39138j jVar = (C39138j) obj;
        return C89219l.m154714a(this.f92344a, jVar.f92344a) && C89219l.m154714a(this.f92345b, jVar.f92345b);
    }

    public final int hashCode() {
        DATA data = this.f92344a;
        int i = 0;
        int hashCode = (data != null ? data.hashCode() : 0) * 31;
        Throwable th = this.f92345b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EasyRxResponse(data=" + ((Object) this.f92344a) + ", error=" + this.f92345b + ")";
    }

    public /* synthetic */ C39138j(Object obj) {
        this(obj, null);
    }

    public C39138j(DATA data, Throwable th) {
        this.f92344a = data;
        this.f92345b = th;
    }
}
