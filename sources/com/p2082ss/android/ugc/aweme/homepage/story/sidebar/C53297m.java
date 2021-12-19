package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.m */
public final class C53297m implements AbstractC14527i<C53297m, C53296l> {

    /* renamed from: a */
    final C14515a<C53296l> f122332a;

    /* renamed from: b */
    public final C12776a<Integer> f122333b;

    /* renamed from: c */
    public final int f122334c;

    static {
        Covode.recordClassIndex(62848);
    }

    /* renamed from: a */
    private static C53297m m98244a(C14515a<C53296l> aVar, C12776a<Integer> aVar2, int i) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new C53297m(aVar, aVar2, i);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C53296l> mo23367a() {
        return this.f122332a;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C53296l> mo23369c() {
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

    public /* synthetic */ C53297m() {
        this(new C14515a(null, null, null, null, 15), new C12776a(0), 0);
    }

    public final int hashCode() {
        int i;
        C14515a<C53296l> aVar = this.f122332a;
        int i2 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C12776a<Integer> aVar2 = this.f122333b;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return ((i3 + i2) * 31) + this.f122334c;
    }

    public final String toString() {
        return "StorySidebarState(listState=" + this.f122332a + ", incrementalListSize=" + this.f122333b + ", onCellSelectedPosition=" + this.f122334c + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53297m)) {
            return false;
        }
        C53297m mVar = (C53297m) obj;
        if (!C89219l.m154714a(this.f122332a, mVar.f122332a) || !C89219l.m154714a(this.f122333b, mVar.f122333b) || this.f122334c != mVar.f122334c) {
            return false;
        }
        return true;
    }

    private C53297m(C14515a<C53296l> aVar, C12776a<Integer> aVar2, int i) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f122332a = aVar;
        this.f122333b = aVar2;
        this.f122334c = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C53297m m98245a(C53297m mVar, C14515a aVar, C12776a aVar2, int i, int i2) {
        if ((i2 & 1) != 0) {
            aVar = mVar.f122332a;
        }
        if ((i2 & 2) != 0) {
            aVar2 = mVar.f122333b;
        }
        if ((i2 & 4) != 0) {
            i = mVar.f122334c;
        }
        return m98244a(aVar, aVar2, i);
    }
}
