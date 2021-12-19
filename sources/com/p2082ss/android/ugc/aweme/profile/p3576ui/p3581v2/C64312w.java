package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import android.content.Intent;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12798a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.w */
public final class C64312w implements AbstractC12798a {

    /* renamed from: a */
    public final C12776a<User> f145773a;

    /* renamed from: b */
    public final C12776a<C89391z> f145774b;

    /* renamed from: c */
    public final C12776a<Boolean> f145775c;

    /* renamed from: d */
    public final C12776a<C89386u<Integer, Integer, Intent>> f145776d;

    /* renamed from: e */
    public final boolean f145777e;

    /* renamed from: f */
    public final boolean f145778f;

    static {
        Covode.recordClassIndex(75757);
    }

    /* renamed from: a */
    private static C64312w m116169a(C12776a<? extends User> aVar, C12776a<C89391z> aVar2, C12776a<Boolean> aVar3, C12776a<? extends C89386u<Integer, Integer, ? extends Intent>> aVar4, boolean z, boolean z2) {
        return new C64312w(aVar, aVar2, aVar3, aVar4, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ C64312w m116170a(C64312w wVar, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        boolean z4 = z;
        C12776a aVar5 = aVar;
        C12776a aVar6 = aVar2;
        C12776a aVar7 = aVar3;
        C12776a aVar8 = aVar4;
        if ((i & 1) != 0) {
            aVar5 = wVar.f145773a;
        }
        if ((i & 2) != 0) {
            aVar6 = wVar.f145774b;
        }
        if ((i & 4) != 0) {
            aVar7 = wVar.f145775c;
        }
        if ((i & 8) != 0) {
            aVar8 = wVar.f145776d;
        }
        if ((i & 16) != 0) {
            z4 = wVar.f145777e;
        }
        if ((i & 32) != 0) {
            z3 = wVar.f145778f;
        }
        return m116169a(aVar5, aVar6, aVar7, aVar8, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64312w)) {
            return false;
        }
        C64312w wVar = (C64312w) obj;
        return C89219l.m154714a(this.f145773a, wVar.f145773a) && C89219l.m154714a(this.f145774b, wVar.f145774b) && C89219l.m154714a(this.f145775c, wVar.f145775c) && C89219l.m154714a(this.f145776d, wVar.f145776d) && this.f145777e == wVar.f145777e && this.f145778f == wVar.f145778f;
    }

    public final int hashCode() {
        C12776a<User> aVar = this.f145773a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<C89391z> aVar2 = this.f145774b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar3 = this.f145775c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        C12776a<C89386u<Integer, Integer, Intent>> aVar4 = this.f145776d;
        if (aVar4 != null) {
            i = aVar4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f145777e;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        if (!this.f145778f) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public final String toString() {
        return "MineProfileCommonData(refreshUIEvent=" + this.f145773a + ", bindCouponEntranceGifEvent=" + this.f145774b + ", onHiddenChangedEvent=" + this.f145775c + ", onActivityResultEvent=" + this.f145776d + ", userVisibleHint=" + this.f145777e + ", visibleToUserInFeed=" + this.f145778f + ")";
    }

    public /* synthetic */ C64312w() {
        this(null, null, null, null, true, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends h.u<java.lang.Integer, java.lang.Integer, ? extends android.content.Intent>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64312w(C12776a<? extends User> aVar, C12776a<C89391z> aVar2, C12776a<Boolean> aVar3, C12776a<? extends C89386u<Integer, Integer, ? extends Intent>> aVar4, boolean z, boolean z2) {
        this.f145773a = aVar;
        this.f145774b = aVar2;
        this.f145775c = aVar3;
        this.f145776d = aVar4;
        this.f145777e = z;
        this.f145778f = z2;
    }
}
