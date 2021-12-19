package com.p2082ss.android.ugc.aweme.relation.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66989j;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.viewmodel.b */
public final class C67100b implements AbstractC14527i<C67100b, C66989j> {

    /* renamed from: a */
    private final C14515a<C66989j> f150483a;

    static {
        Covode.recordClassIndex(78682);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C66989j> mo23367a() {
        return this.f150483a;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C66989j> mo23369c() {
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

    public /* synthetic */ C67100b() {
        this(new C14515a(null, null, null, null, 15));
    }

    public final int hashCode() {
        C14515a<C66989j> aVar = this.f150483a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecFriendsListState(listState=" + this.f150483a + ")";
    }

    public C67100b(C14515a<C66989j> aVar) {
        C89219l.m154721d(aVar, "");
        this.f150483a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67100b) || !C89219l.m154714a(this.f150483a, ((C67100b) obj).f150483a)) {
            return false;
        }
        return true;
    }
}
