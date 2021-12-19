package com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.viewmodel.f */
public final class C36945f implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<User> f86989a;

    /* renamed from: b */
    public final C12776a<EnumC36944e> f86990b;

    static {
        Covode.recordClassIndex(44287);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36945f)) {
            return false;
        }
        C36945f fVar = (C36945f) obj;
        return C89219l.m154714a(this.f86989a, fVar.f86989a) && C89219l.m154714a(this.f86990b, fVar.f86990b);
    }

    public final int hashCode() {
        C12776a<User> aVar = this.f86989a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<EnumC36944e> aVar2 = this.f86990b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TaggedState(taggedUsers=" + this.f86989a + ", event=" + this.f86990b + ")";
    }

    public /* synthetic */ C36945f() {
        this(null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public C36945f(C12776a<? extends User> aVar, C12776a<? extends EnumC36944e> aVar2) {
        this.f86989a = aVar;
        this.f86990b = aVar2;
    }
}
