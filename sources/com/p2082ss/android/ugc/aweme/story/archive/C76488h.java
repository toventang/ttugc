package com.p2082ss.android.ugc.aweme.story.archive;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.C14515a;
import com.bytedance.ext_power_list.C14533l;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.archive.h */
public final class C76488h implements AbstractC14527i<C76488h, C76487g> {

    /* renamed from: a */
    public final C12776a<String> f171768a;

    /* renamed from: b */
    private final C14515a<C76487g> f171769b;

    static {
        Covode.recordClassIndex(89468);
    }

    /* renamed from: a */
    private static C76488h m134060a(C14515a<C76487g> aVar, C12776a<String> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        return new C76488h(aVar, aVar2);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14526h
    /* renamed from: a */
    public final C14515a<C76487g> mo23367a() {
        return this.f171769b;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: b */
    public final AbstractC12783f<C14533l> mo23368b() {
        return AbstractC14527i.C14528a.m26536a(this);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14527i
    /* renamed from: c */
    public final List<C76487g> mo23369c() {
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

    public /* synthetic */ C76488h() {
        this(new C14515a(null, null, null, null, 15), new C12776a(""));
    }

    public final int hashCode() {
        int i;
        C14515a<C76487g> aVar = this.f171769b;
        int i2 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C12776a<String> aVar2 = this.f171768a;
        if (aVar2 != null) {
            i2 = aVar2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "StoryArchState(listState=" + this.f171769b + ", onCellClickEvent=" + this.f171768a + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76488h)) {
            return false;
        }
        C76488h hVar = (C76488h) obj;
        if (!C89219l.m154714a(this.f171769b, hVar.f171769b) || !C89219l.m154714a(this.f171768a, hVar.f171768a)) {
            return false;
        }
        return true;
    }

    private C76488h(C14515a<C76487g> aVar, C12776a<String> aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f171769b = aVar;
        this.f171768a = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C76488h m134061a(C76488h hVar, C14515a aVar, C12776a aVar2, int i) {
        if ((i & 1) != 0) {
            aVar = hVar.f171769b;
        }
        if ((i & 2) != 0) {
            aVar2 = hVar.f171768a;
        }
        return m134060a(aVar, aVar2);
    }
}
