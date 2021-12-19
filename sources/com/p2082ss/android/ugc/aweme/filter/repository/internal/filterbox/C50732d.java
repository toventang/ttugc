package com.p2082ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27255q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.d */
public final class C50732d {

    /* renamed from: a */
    public final AbstractC27255q<String> f117107a;

    /* renamed from: b */
    public final AbstractC27255q<String> f117108b;

    /* renamed from: c */
    public final AbstractC27255q<String> f117109c;

    /* renamed from: d */
    public final AbstractC27255q<String> f117110d;

    /* renamed from: e */
    public final AbstractC27255q<String> f117111e;

    /* renamed from: f */
    public final AbstractC27255q<String> f117112f;

    /* renamed from: g */
    public final AbstractC27255q<String> f117113g;

    /* renamed from: h */
    public final AbstractC27255q<String> f117114h;

    static {
        Covode.recordClassIndex(59897);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50732d)) {
            return false;
        }
        C50732d dVar = (C50732d) obj;
        return C89219l.m154714a(this.f117107a, dVar.f117107a) && C89219l.m154714a(this.f117108b, dVar.f117108b) && C89219l.m154714a(this.f117109c, dVar.f117109c) && C89219l.m154714a(this.f117110d, dVar.f117110d) && C89219l.m154714a(this.f117111e, dVar.f117111e) && C89219l.m154714a(this.f117112f, dVar.f117112f) && C89219l.m154714a(this.f117113g, dVar.f117113g) && C89219l.m154714a(this.f117114h, dVar.f117114h);
    }

    public final int hashCode() {
        AbstractC27255q<String> qVar = this.f117107a;
        int i = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        AbstractC27255q<String> qVar2 = this.f117108b;
        int hashCode2 = (hashCode + (qVar2 != null ? qVar2.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar3 = this.f117109c;
        int hashCode3 = (hashCode2 + (qVar3 != null ? qVar3.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar4 = this.f117110d;
        int hashCode4 = (hashCode3 + (qVar4 != null ? qVar4.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar5 = this.f117111e;
        int hashCode5 = (hashCode4 + (qVar5 != null ? qVar5.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar6 = this.f117112f;
        int hashCode6 = (hashCode5 + (qVar6 != null ? qVar6.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar7 = this.f117113g;
        int hashCode7 = (hashCode6 + (qVar7 != null ? qVar7.hashCode() : 0)) * 31;
        AbstractC27255q<String> qVar8 = this.f117114h;
        if (qVar8 != null) {
            i = qVar8.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "EffectParams(deviceIdProvider=" + this.f117107a + ", appIdProvider=" + this.f117108b + ", regionProvider=" + this.f117109c + ", appVersionProvider=" + this.f117110d + ", panelProvider=" + this.f117111e + ", effectSdkVersionProvider=" + this.f117112f + ", effectChannelProvider=" + this.f117113g + ", effectAccessKeyProvider=" + this.f117114h + ")";
    }

    public C50732d(AbstractC27255q<String> qVar, AbstractC27255q<String> qVar2, AbstractC27255q<String> qVar3, AbstractC27255q<String> qVar4, AbstractC27255q<String> qVar5, AbstractC27255q<String> qVar6, AbstractC27255q<String> qVar7, AbstractC27255q<String> qVar8) {
        C89219l.m154721d(qVar, "");
        C89219l.m154721d(qVar2, "");
        C89219l.m154721d(qVar3, "");
        C89219l.m154721d(qVar4, "");
        C89219l.m154721d(qVar5, "");
        C89219l.m154721d(qVar6, "");
        C89219l.m154721d(qVar7, "");
        C89219l.m154721d(qVar8, "");
        this.f117107a = qVar;
        this.f117108b = qVar2;
        this.f117109c = qVar3;
        this.f117110d = qVar4;
        this.f117111e = qVar5;
        this.f117112f = qVar6;
        this.f117113g = qVar7;
        this.f117114h = qVar8;
    }
}
