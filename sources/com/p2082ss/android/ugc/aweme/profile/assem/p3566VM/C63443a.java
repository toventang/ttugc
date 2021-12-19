package com.p2082ss.android.ugc.aweme.profile.assem.p3566VM;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.p2082ss.android.ugc.aweme.profile.assem.powercell.C63492a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.VM.a */
public final class C63443a implements AbstractC14527i<C63443a, C63492a> {

    /* renamed from: a */
    public final int f144050a;

    /* renamed from: b */
    public final boolean f144051b;

    /* renamed from: c */
    private final C14515a<C63492a> f144052c;

    static {
        Covode.recordClassIndex(74750);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C63492a> mo23367a() {
        return this.f144052c;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C63492a> mo23369c() {
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

    public /* synthetic */ C63443a() {
        this(new C14515a(null, null, null, null, 15), 0, false);
    }

    public final int hashCode() {
        int i;
        C14515a<C63492a> aVar = this.f144052c;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i2 = ((i * 31) + this.f144050a) * 31;
        boolean z = this.f144051b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "MyVideoListState(listState=" + this.f144052c + ", position=" + this.f144050a + ", loadingTimeOver=" + this.f144051b + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63443a)) {
            return false;
        }
        C63443a aVar = (C63443a) obj;
        if (C89219l.m154714a(this.f144052c, aVar.f144052c) && this.f144050a == aVar.f144050a && this.f144051b == aVar.f144051b) {
            return true;
        }
        return false;
    }

    private C63443a(C14515a<C63492a> aVar, int i, boolean z) {
        C89219l.m154721d(aVar, "");
        this.f144052c = aVar;
        this.f144050a = i;
        this.f144051b = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C63443a m115039a(C63443a aVar, C14515a aVar2, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            aVar2 = aVar.f144052c;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f144050a;
        }
        if ((i2 & 4) != 0) {
            z = aVar.f144051b;
        }
        C89219l.m154721d(aVar2, "");
        return new C63443a(aVar2, i, z);
    }
}
