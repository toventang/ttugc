package com.bytedance.tux.p1721g;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.g.c */
public final class C23146c {

    /* renamed from: a */
    public Long f54780a;

    /* renamed from: b */
    public CharSequence f54781b;

    /* renamed from: c */
    public Integer f54782c;

    /* renamed from: d */
    public Integer f54783d;

    /* renamed from: e */
    public long f54784e;

    /* renamed from: f */
    public boolean f54785f;

    /* renamed from: g */
    public boolean f54786g;

    /* renamed from: h */
    public boolean f54787h;

    /* renamed from: i */
    public int f54788i;

    static {
        Covode.recordClassIndex(27075);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23146c)) {
            return false;
        }
        C23146c cVar = (C23146c) obj;
        return C89219l.m154714a(this.f54780a, cVar.f54780a) && C89219l.m154714a(this.f54781b, cVar.f54781b) && C89219l.m154714a(this.f54782c, cVar.f54782c) && C89219l.m154714a(this.f54783d, cVar.f54783d) && this.f54784e == cVar.f54784e && this.f54785f == cVar.f54785f && this.f54786g == cVar.f54786g && this.f54787h == cVar.f54787h && this.f54788i == cVar.f54788i;
    }

    public final int hashCode() {
        Long l = this.f54780a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        CharSequence charSequence = this.f54781b;
        int hashCode2 = (hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        Integer num = this.f54782c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f54783d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        long j = this.f54784e;
        int i2 = (((hashCode3 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f54785f;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f54786g;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        if (!this.f54787h) {
            i3 = 0;
        }
        return ((i11 + i3) * 31) + this.f54788i;
    }

    public final String toString() {
        return "TuxToastBundle(expireTime=" + this.f54780a + ", message=" + this.f54781b + ", icon=" + this.f54782c + ", iconColor=" + this.f54783d + ", duration=" + this.f54784e + ", hasShowAnimation=" + this.f54785f + ", hasDismissAnimation=" + this.f54786g + ", acrossActivities=" + this.f54787h + ", uniqueIdForReuse=" + this.f54788i + ")";
    }

    public /* synthetic */ C23146c() {
        this(null, null, null, null, 3000, true, true, false, 0);
    }

    public C23146c(Long l, CharSequence charSequence, Integer num, Integer num2, long j, boolean z, boolean z2, boolean z3, int i) {
        this.f54780a = l;
        this.f54781b = charSequence;
        this.f54782c = num;
        this.f54783d = num2;
        this.f54784e = j;
        this.f54785f = z;
        this.f54786g = z2;
        this.f54787h = z3;
        this.f54788i = i;
    }
}
