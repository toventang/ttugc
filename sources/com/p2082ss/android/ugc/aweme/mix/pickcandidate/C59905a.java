package com.p2082ss.android.ugc.aweme.mix.pickcandidate;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.pickcandidate.a */
public final class C59905a implements AbstractC17641a {

    /* renamed from: a */
    public UrlModel f136428a;

    /* renamed from: b */
    public boolean f136429b;

    /* renamed from: c */
    public boolean f136430c;

    /* renamed from: d */
    public boolean f136431d;

    /* renamed from: e */
    public Aweme f136432e;

    /* renamed from: f */
    public boolean f136433f;

    /* renamed from: g */
    public boolean f136434g;

    static {
        Covode.recordClassIndex(70316);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C59905a m109350a(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        return new C59905a(urlModel, z, z2, z3, aweme, z4, z5);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59905a)) {
            return false;
        }
        C59905a aVar = (C59905a) obj;
        return C89219l.m154714a(this.f136428a, aVar.f136428a) && this.f136429b == aVar.f136429b && this.f136430c == aVar.f136430c && this.f136431d == aVar.f136431d && C89219l.m154714a(this.f136432e, aVar.f136432e) && this.f136433f == aVar.f136433f && this.f136434g == aVar.f136434g;
    }

    public final int hashCode() {
        UrlModel urlModel = this.f136428a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        boolean z = this.f136429b;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f136430c;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f136431d;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        Aweme aweme = this.f136432e;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        int i15 = (i14 + i) * 31;
        boolean z4 = this.f136433f;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        if (!this.f136434g) {
            i2 = 0;
        }
        return i19 + i2;
    }

    public final String toString() {
        return "MixPickCandidatePowerItem(cover=" + this.f136428a + ", selected=" + this.f136429b + ", gray=" + this.f136430c + ", inOtherList=" + this.f136431d + ", video=" + this.f136432e + ", selectedGray=" + this.f136433f + ", isBlocked=" + this.f136434g + ")";
    }

    public /* synthetic */ C59905a() {
        this(null, false, false, false, null, false, false);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof C59905a) {
            return C89219l.m154714a(this.f136432e, ((C59905a) aVar).f136432e);
        }
        return aVar.equals(this);
    }

    private C59905a(UrlModel urlModel, boolean z, boolean z2, boolean z3, Aweme aweme, boolean z4, boolean z5) {
        this.f136428a = urlModel;
        this.f136429b = z;
        this.f136430c = z2;
        this.f136431d = z3;
        this.f136432e = aweme;
        this.f136433f = z4;
        this.f136434g = z5;
    }
}
