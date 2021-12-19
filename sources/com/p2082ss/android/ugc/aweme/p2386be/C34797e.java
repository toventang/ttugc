package com.p2082ss.android.ugc.aweme.p2386be;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.e */
public final class C34797e extends AbstractC34793a {

    /* renamed from: c */
    public final String f82172c;

    /* renamed from: d */
    public final boolean f82173d;

    /* renamed from: e */
    private final boolean f82174e;

    /* renamed from: f */
    private final Object f82175f;

    static {
        Covode.recordClassIndex(41793);
    }

    public C34797e(String str) {
        this(str, true, false, 12);
    }

    public C34797e(String str, byte b) {
        this(str, false, false, 14);
    }

    public C34797e(String str, boolean z, boolean z2) {
        this(str, z, z2, 8);
    }

    /* renamed from: a */
    private static C34797e m71060a(String str, boolean z, boolean z2, Object obj) {
        C89219l.m154721d(str, "");
        return new C34797e(str, z, z2, obj);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f82173d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f82174e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: c */
    public final Object mo61502c() {
        return this.f82175f;
    }

    public final int hashCode() {
        int i;
        String str = this.f82172c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        boolean z = this.f82173d;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f82174e) {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Object obj = this.f82175f;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return i9 + i2;
    }

    public final String toString() {
        return "DividerItem(text=" + this.f82172c + ", divider=" + this.f82173d + ", visibility=" + this.f82174e + ", tag=" + this.f82175f + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34797e)) {
            return false;
        }
        C34797e eVar = (C34797e) obj;
        if (!C89219l.m154714a((Object) this.f82172c, (Object) eVar.f82172c) || this.f82173d != eVar.f82173d || this.f82174e != eVar.f82174e || !C89219l.m154714a(this.f82175f, eVar.f82175f)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34797e(String str, boolean z, boolean z2, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34797e(String str, boolean z, boolean z2, Object obj) {
        super(z, z2, obj, null, 8);
        C89219l.m154721d(str, "");
        this.f82172c = str;
        this.f82173d = z;
        this.f82174e = z2;
        this.f82175f = obj;
    }

    /* renamed from: a */
    public static /* synthetic */ C34797e m71059a(C34797e eVar, String str, boolean z, boolean z2, Object obj, int i) {
        if ((i & 1) != 0) {
            str = eVar.f82172c;
        }
        if ((i & 2) != 0) {
            z = eVar.f82173d;
        }
        if ((i & 4) != 0) {
            z2 = eVar.f82174e;
        }
        if ((i & 8) != 0) {
            obj = eVar.f82175f;
        }
        return m71060a(str, z, z2, obj);
    }
}
