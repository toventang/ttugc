package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.e */
public final class C64590e implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<User> f146309a;

    /* renamed from: b */
    public final EnumC64592g f146310b;

    static {
        Covode.recordClassIndex(76056);
    }

    /* renamed from: a */
    public static C64590e m116524a(AbstractC12783f<? extends User> fVar, EnumC64592g gVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        return new C64590e(fVar, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64590e)) {
            return false;
        }
        C64590e eVar = (C64590e) obj;
        return C89219l.m154714a(this.f146309a, eVar.f146309a) && C89219l.m154714a(this.f146310b, eVar.f146310b);
    }

    public final int hashCode() {
        AbstractC12783f<User> fVar = this.f146309a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        EnumC64592g gVar = this.f146310b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "MineProfileInfoState(request=" + this.f146309a + ", action=" + this.f146310b + ")";
    }

    public /* synthetic */ C64590e() {
        this(C12797s.f31127a, EnumC64592g.NORMAL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64590e(AbstractC12783f<? extends User> fVar, EnumC64592g gVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(gVar, "");
        this.f146309a = fVar;
        this.f146310b = gVar;
    }
}
