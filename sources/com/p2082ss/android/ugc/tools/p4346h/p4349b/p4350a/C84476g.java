package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.h.b.a.g */
public final class C84476g<KEY, RESULT, INFO> {

    /* renamed from: a */
    public final KEY f188828a;

    /* renamed from: b */
    public final RESULT f188829b;

    /* renamed from: c */
    public final boolean f188830c;

    /* renamed from: d */
    public final INFO f188831d;

    /* renamed from: e */
    public final Long f188832e;

    /* renamed from: f */
    public final Exception f188833f;

    static {
        Covode.recordClassIndex(98441);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84476g)) {
            return false;
        }
        C84476g gVar = (C84476g) obj;
        return C89219l.m154714a(this.f188828a, gVar.f188828a) && C89219l.m154714a(this.f188829b, gVar.f188829b) && this.f188830c == gVar.f188830c && C89219l.m154714a(this.f188831d, gVar.f188831d) && C89219l.m154714a(this.f188832e, gVar.f188832e) && C89219l.m154714a(this.f188833f, gVar.f188833f);
    }

    public final int hashCode() {
        KEY key = this.f188828a;
        int i = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * 31;
        RESULT result = this.f188829b;
        int hashCode2 = (hashCode + (result != null ? result.hashCode() : 0)) * 31;
        boolean z = this.f188830c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        INFO info = this.f188831d;
        int hashCode3 = (i5 + (info != null ? info.hashCode() : 0)) * 31;
        Long l = this.f188832e;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        Exception exc = this.f188833f;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ExecuteResult(key=" + ((Object) this.f188828a) + ", result=" + ((Object) this.f188829b) + ", cached=" + this.f188830c + ", info=" + ((Object) this.f188831d) + ", duration=" + this.f188832e + ", exception=" + this.f188833f + ")";
    }

    public C84476g(KEY key, RESULT result, boolean z, INFO info, Long l, Exception exc) {
        this.f188828a = key;
        this.f188829b = result;
        this.f188830c = z;
        this.f188831d = info;
        this.f188832e = l;
        this.f188833f = exc;
    }
}
