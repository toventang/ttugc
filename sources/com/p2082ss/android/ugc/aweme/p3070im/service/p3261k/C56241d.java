package com.p2082ss.android.ugc.aweme.p3070im.service.p3261k;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.k.d */
public final class C56241d {

    /* renamed from: a */
    public final EnumC56242e f128250a;

    /* renamed from: b */
    public final EnumC56240c f128251b;

    /* renamed from: c */
    public final boolean f128252c;

    static {
        Covode.recordClassIndex(66050);
    }

    public C56241d() {
        this(null, null, false, 7);
    }

    /* renamed from: a */
    public static C56241d m102182a(EnumC56242e eVar, EnumC56240c cVar, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        return new C56241d(eVar, cVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56241d)) {
            return false;
        }
        C56241d dVar = (C56241d) obj;
        return C89219l.m154714a(this.f128250a, dVar.f128250a) && C89219l.m154714a(this.f128251b, dVar.f128251b) && this.f128252c == dVar.f128252c;
    }

    public final int hashCode() {
        EnumC56242e eVar = this.f128250a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        EnumC56240c cVar = this.f128251b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f128252c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "SessionUnreadViewState(unreadViewType=" + this.f128250a + ", backgroundColor=" + this.f128251b + ", isContentBoldFont=" + this.f128252c + ")";
    }

    public C56241d(EnumC56242e eVar, EnumC56240c cVar, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        this.f128250a = eVar;
        this.f128251b = cVar;
        this.f128252c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C56241d(EnumC56242e eVar, EnumC56240c cVar, boolean z, int i) {
        this((i & 1) != 0 ? EnumC56242e.RIGHT_NUMBER : eVar, (i & 2) != 0 ? EnumC56240c.RED : cVar, (i & 4) != 0 ? false : z);
    }
}
