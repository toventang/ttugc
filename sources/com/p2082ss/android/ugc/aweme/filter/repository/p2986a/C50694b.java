package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.b */
public final class C50694b {

    /* renamed from: a */
    public final C50698f f117036a;

    /* renamed from: b */
    public final boolean f117037b;

    /* renamed from: c */
    public final boolean f117038c;

    static {
        Covode.recordClassIndex(59856);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50694b)) {
            return false;
        }
        C50694b bVar = (C50694b) obj;
        return C89219l.m154714a(this.f117036a, bVar.f117036a) && this.f117037b == bVar.f117037b && this.f117038c == bVar.f117038c;
    }

    public final int hashCode() {
        C50698f fVar = this.f117036a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        boolean z = this.f117037b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        if (!this.f117038c) {
            i = 0;
        }
        return i5 + i;
    }

    public final String toString() {
        return "FilterBoxMeta(filterMeta=" + this.f117036a + ", checked=" + this.f117037b + ", builtin=" + this.f117038c + ")";
    }

    public C50694b(C50698f fVar, boolean z, boolean z2) {
        C89219l.m154721d(fVar, "");
        this.f117036a = fVar;
        this.f117037b = z;
        this.f117038c = z2;
    }
}
