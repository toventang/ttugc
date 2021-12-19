package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.c */
public final class C36942c implements AbstractC14527i<C36942c, AbstractC17641a> {

    /* renamed from: a */
    public final C89378p<List<IMUser>, String> f86981a;

    /* renamed from: b */
    private final C14515a<AbstractC17641a> f86982b;

    static {
        Covode.recordClassIndex(44284);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<AbstractC17641a> mo23367a() {
        return this.f86982b;
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

    public final int hashCode() {
        int i;
        C89378p<List<IMUser>, String> pVar = this.f86981a;
        int i2 = 0;
        if (pVar != null) {
            i = pVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C14515a<AbstractC17641a> aVar = this.f86982b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "SearchState(searchResult=" + this.f86981a + ", listState=" + this.f86982b + ")";
    }

    public /* synthetic */ C36942c(C89378p pVar) {
        this(pVar, new C14515a(null, null, null, null, 15));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36942c)) {
            return false;
        }
        C36942c cVar = (C36942c) obj;
        if (!C89219l.m154714a(this.f86981a, cVar.f86981a) || !C89219l.m154714a(this.f86982b, cVar.f86982b)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.p<? extends java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    private C36942c(C89378p<? extends List<? extends IMUser>, String> pVar, C14515a<AbstractC17641a> aVar) {
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(aVar, "");
        this.f86981a = pVar;
        this.f86982b = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C36942c m74552a(C36942c cVar, C89378p pVar, C14515a aVar, int i) {
        if ((i & 1) != 0) {
            pVar = cVar.f86981a;
        }
        if ((i & 2) != 0) {
            aVar = cVar.f86982b;
        }
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(aVar, "");
        return new C36942c(pVar, aVar);
    }
}
