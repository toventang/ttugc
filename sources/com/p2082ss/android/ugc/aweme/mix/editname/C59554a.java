package com.p2082ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.a */
public final class C59554a implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<C59395a> f135908a;

    /* renamed from: b */
    public final AbstractC12783f<C59396b> f135909b;

    static {
        Covode.recordClassIndex(69951);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59554a)) {
            return false;
        }
        C59554a aVar = (C59554a) obj;
        return C89219l.m154714a(this.f135908a, aVar.f135908a) && C89219l.m154714a(this.f135909b, aVar.f135909b);
    }

    public final int hashCode() {
        AbstractC12783f<C59395a> fVar = this.f135908a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        AbstractC12783f<C59396b> fVar2 = this.f135909b;
        if (fVar2 != null) {
            i = fVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "EditNameState(checkNameRequest=" + this.f135908a + ", changeNameRequest=" + this.f135909b + ")";
    }

    public /* synthetic */ C59554a() {
        this(C12797s.f31127a, C12797s.f31127a);
    }

    private C59554a(AbstractC12783f<C59395a> fVar, AbstractC12783f<C59396b> fVar2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        this.f135908a = fVar;
        this.f135909b = fVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C59554a m109177a(C59554a aVar, AbstractC12783f fVar, AbstractC12783f fVar2, int i) {
        if ((i & 1) != 0) {
            fVar = aVar.f135908a;
        }
        if ((i & 2) != 0) {
            fVar2 = aVar.f135909b;
        }
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        return new C59554a(fVar, fVar2);
    }
}
