package com.bytedance.ext_power_list;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ext_power_list.a */
public final class C14515a<ITEM extends AbstractC17641a> implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<C14533l> f35096a;

    /* renamed from: b */
    public final AbstractC12783f<C14533l> f35097b;

    /* renamed from: c */
    public final AbstractC12783f<C14533l> f35098c;

    /* renamed from: d */
    public final List<ITEM> f35099d;

    static {
        Covode.recordClassIndex(16602);
    }

    public C14515a() {
        this(null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14515a)) {
            return false;
        }
        C14515a aVar = (C14515a) obj;
        return C89219l.m154714a(this.f35096a, aVar.f35096a) && C89219l.m154714a(this.f35097b, aVar.f35097b) && C89219l.m154714a(this.f35098c, aVar.f35098c) && C89219l.m154714a(this.f35099d, aVar.f35099d);
    }

    public final int hashCode() {
        AbstractC12783f<C14533l> fVar = this.f35096a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        AbstractC12783f<C14533l> fVar2 = this.f35097b;
        int hashCode2 = (hashCode + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        AbstractC12783f<C14533l> fVar3 = this.f35098c;
        int hashCode3 = (hashCode2 + (fVar3 != null ? fVar3.hashCode() : 0)) * 31;
        List<ITEM> list = this.f35099d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "AssemListState(refreshState=" + this.f35096a + ", loadMoreState=" + this.f35097b + ", loadLatestState=" + this.f35098c + ", listItemState=" + this.f35099d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends ITEM extends com.bytedance.ies.powerlist.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    private C14515a(AbstractC12783f<C14533l> fVar, AbstractC12783f<C14533l> fVar2, AbstractC12783f<C14533l> fVar3, List<? extends ITEM> list) {
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(fVar2, "");
        C89219l.m154719c(fVar3, "");
        this.f35096a = fVar;
        this.f35097b = fVar2;
        this.f35098c = fVar3;
        this.f35099d = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14515a(AbstractC12783f fVar, AbstractC12783f fVar2, AbstractC12783f fVar3, List list, int i) {
        this((i & 1) != 0 ? C12797s.f31127a : fVar, (i & 2) != 0 ? C12797s.f31127a : fVar2, (i & 4) != 0 ? C12797s.f31127a : fVar3, (i & 8) != 0 ? null : list);
    }

    /* renamed from: a */
    public static /* synthetic */ C14515a m26525a(C14515a aVar, AbstractC12783f fVar, AbstractC12783f fVar2, AbstractC12783f fVar3, List list, int i) {
        if ((i & 1) != 0) {
            fVar = aVar.f35096a;
        }
        if ((i & 2) != 0) {
            fVar2 = aVar.f35097b;
        }
        if ((i & 4) != 0) {
            fVar3 = aVar.f35098c;
        }
        if ((i & 8) != 0) {
            list = aVar.f35099d;
        }
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(fVar2, "");
        C89219l.m154719c(fVar3, "");
        return new C14515a(fVar, fVar2, fVar3, list);
    }
}
