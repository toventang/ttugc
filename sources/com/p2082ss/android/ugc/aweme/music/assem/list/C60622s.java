package com.p2082ss.android.ugc.aweme.music.assem.list;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.p2082ss.android.ugc.aweme.music.C60837p;
import com.p2082ss.android.ugc.aweme.music.assem.list.cell.C60603d;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.s */
public final class C60622s implements AbstractC14527i<C60622s, C60603d> {

    /* renamed from: a */
    public final boolean f137836a;

    /* renamed from: b */
    public final C12776a<Integer> f137837b;

    /* renamed from: c */
    public final C12776a<C60837p> f137838c;

    /* renamed from: d */
    public final C12776a<Boolean> f137839d;

    /* renamed from: e */
    public final C12776a<Object> f137840e;

    /* renamed from: f */
    private final C14515a<C60603d> f137841f;

    static {
        Covode.recordClassIndex(71176);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C60603d> mo23367a() {
        return this.f137841f;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C60603d> mo23369c() {
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

    public /* synthetic */ C60622s() {
        this(true, new C12776a(0), new C12776a(null), new C12776a(false), new C12776a(null), new C14515a(null, null, null, null, 15));
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = this.f137836a;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = i5 * 31;
        C12776a<Integer> aVar = this.f137837b;
        int i9 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i10 = (i8 + i) * 31;
        C12776a<C60837p> aVar2 = this.f137838c;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (i10 + i2) * 31;
        C12776a<Boolean> aVar3 = this.f137839d;
        if (aVar3 != null) {
            i3 = aVar3.hashCode();
        } else {
            i3 = 0;
        }
        int i12 = (i11 + i3) * 31;
        C12776a<Object> aVar4 = this.f137840e;
        if (aVar4 != null) {
            i4 = aVar4.hashCode();
        } else {
            i4 = 0;
        }
        int i13 = (i12 + i4) * 31;
        C14515a<C60603d> aVar5 = this.f137841f;
        if (aVar5 != null) {
            i9 = aVar5.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "OriginMusicListState(needRefresh=" + this.f137836a + ", refreshEvent=" + this.f137837b + ", pinEvent=" + this.f137838c + ", scrollTop=" + this.f137839d + ", errorEvent=" + this.f137840e + ", listState=" + this.f137841f + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60622s)) {
            return false;
        }
        C60622s sVar = (C60622s) obj;
        if (this.f137836a != sVar.f137836a || !C89219l.m154714a(this.f137837b, sVar.f137837b) || !C89219l.m154714a(this.f137838c, sVar.f137838c) || !C89219l.m154714a(this.f137839d, sVar.f137839d) || !C89219l.m154714a(this.f137840e, sVar.f137840e) || !C89219l.m154714a(this.f137841f, sVar.f137841f)) {
            return false;
        }
        return true;
    }

    private C60622s(boolean z, C12776a<Integer> aVar, C12776a<C60837p> aVar2, C12776a<Boolean> aVar3, C12776a<? extends Object> aVar4, C14515a<C60603d> aVar5) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aVar4, "");
        C89219l.m154721d(aVar5, "");
        this.f137836a = z;
        this.f137837b = aVar;
        this.f137838c = aVar2;
        this.f137839d = aVar3;
        this.f137840e = aVar4;
        this.f137841f = aVar5;
    }

    /* renamed from: a */
    public static /* synthetic */ C60622s m110178a(C60622s sVar, boolean z, C12776a aVar, C12776a aVar2, C12776a aVar3, C12776a aVar4, C14515a aVar5, int i) {
        C14515a aVar6 = aVar5;
        C12776a aVar7 = aVar4;
        boolean z2 = z;
        C12776a aVar8 = aVar;
        C12776a aVar9 = aVar2;
        C12776a aVar10 = aVar3;
        if ((i & 1) != 0) {
            z2 = sVar.f137836a;
        }
        if ((i & 2) != 0) {
            aVar8 = sVar.f137837b;
        }
        if ((i & 4) != 0) {
            aVar9 = sVar.f137838c;
        }
        if ((i & 8) != 0) {
            aVar10 = sVar.f137839d;
        }
        if ((i & 16) != 0) {
            aVar7 = sVar.f137840e;
        }
        if ((i & 32) != 0) {
            aVar6 = sVar.f137841f;
        }
        C89219l.m154721d(aVar8, "");
        C89219l.m154721d(aVar9, "");
        C89219l.m154721d(aVar10, "");
        C89219l.m154721d(aVar7, "");
        C89219l.m154721d(aVar6, "");
        return new C60622s(z2, aVar8, aVar9, aVar10, aVar7, aVar6);
    }
}
