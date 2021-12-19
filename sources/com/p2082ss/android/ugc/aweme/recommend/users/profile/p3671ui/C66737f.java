package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.f */
public final class C66737f implements AbstractC14527i<C66737f, AbstractC17641a> {

    /* renamed from: a */
    public final int f149927a;

    /* renamed from: b */
    public final boolean f149928b;

    /* renamed from: c */
    private final C14515a<AbstractC17641a> f149929c;

    static {
        Covode.recordClassIndex(78306);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<AbstractC17641a> mo23367a() {
        return this.f149929c;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<AbstractC17641a> mo23369c() {
        return AbstractC14527i.C14528a.m26537b(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: d */
    public final AbstractC12783f<C14533l> mo23370d() {
        return AbstractC14527i.C14528a.m26538c(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: e */
    public final AbstractC12783f<C14533l> mo23371e() {
        return AbstractC14527i.C14528a.m26539d(this);
    }

    public /* synthetic */ C66737f() {
        this(new C14515a(null, null, null, null, 15), 0, false);
    }

    public final int hashCode() {
        int i;
        C14515a<AbstractC17641a> aVar = this.f149929c;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i2 = ((i * 31) + this.f149927a) * 31;
        boolean z = this.f149928b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "UserProfilePublishListRecommendUserState(listState=" + this.f149929c + ", position=" + this.f149927a + ", loadingTimeOver=" + this.f149928b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66737f)) {
            return false;
        }
        C66737f fVar = (C66737f) obj;
        if (C89219l.m154714a(this.f149929c, fVar.f149929c) && this.f149927a == fVar.f149927a && this.f149928b == fVar.f149928b) {
            return true;
        }
        return false;
    }

    private C66737f(C14515a<AbstractC17641a> aVar, int i, boolean z) {
        C89219l.m154721d(aVar, "");
        this.f149929c = aVar;
        this.f149927a = i;
        this.f149928b = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C66737f m118521a(C66737f fVar, C14515a aVar, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            aVar = fVar.f149929c;
        }
        if ((i2 & 2) != 0) {
            i = fVar.f149927a;
        }
        if ((i2 & 4) != 0) {
            z = fVar.f149928b;
        }
        C89219l.m154721d(aVar, "");
        return new C66737f(aVar, i, z);
    }
}
