package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.n */
public final class C64644n implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<User> f146357a;

    /* renamed from: b */
    public final EnumC64592g f146358b;

    static {
        Covode.recordClassIndex(76110);
    }

    /* renamed from: a */
    public static C64644n m116542a(AbstractC12783f<? extends User> fVar, EnumC64592g gVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        return new C64644n(fVar, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64644n)) {
            return false;
        }
        C64644n nVar = (C64644n) obj;
        return C89219l.m154714a(this.f146357a, nVar.f146357a) && C89219l.m154714a(this.f146358b, nVar.f146358b);
    }

    public final int hashCode() {
        AbstractC12783f<User> fVar = this.f146357a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        EnumC64592g gVar = this.f146358b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "UserProfileInfoState(request=" + this.f146357a + ", action=" + this.f146358b + ")";
    }

    public /* synthetic */ C64644n() {
        this(C12797s.f31127a, EnumC64592g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64644n(AbstractC12783f<? extends User> fVar, EnumC64592g gVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        this.f146357a = fVar;
        this.f146358b = gVar;
    }
}
