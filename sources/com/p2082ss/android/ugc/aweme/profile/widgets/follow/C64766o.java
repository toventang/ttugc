package com.p2082ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.follow.o */
public final class C64766o implements AbstractC12853j {

    /* renamed from: a */
    public final C63847n f146526a;

    /* renamed from: b */
    public final AbstractC12783f<FollowStatus> f146527b;

    /* renamed from: c */
    public final AbstractC12783f<BaseResponse> f146528c;

    /* renamed from: d */
    public final C12776a<EnumC64712a> f146529d;

    static {
        Covode.recordClassIndex(76233);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64766o)) {
            return false;
        }
        C64766o oVar = (C64766o) obj;
        return C89219l.m154714a(this.f146526a, oVar.f146526a) && C89219l.m154714a(this.f146527b, oVar.f146527b) && C89219l.m154714a(this.f146528c, oVar.f146528c) && C89219l.m154714a(this.f146529d, oVar.f146529d);
    }

    public final int hashCode() {
        C63847n nVar = this.f146526a;
        int i = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        AbstractC12783f<FollowStatus> fVar = this.f146527b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        AbstractC12783f<BaseResponse> fVar2 = this.f146528c;
        int hashCode3 = (hashCode2 + (fVar2 != null ? fVar2.hashCode() : 0)) * 31;
        C12776a<EnumC64712a> aVar = this.f146529d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "UserProfileFollowState(followParams=" + this.f146526a + ", followRequest=" + this.f146527b + ", removeRequest=" + this.f146528c + ", checkEventEnum=" + this.f146529d + ")";
    }

    public /* synthetic */ C64766o() {
        this(null, C12797s.f31127a, C12797s.f31127a, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.base.api.BaseResponse> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.profile.widgets.follow.a> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64766o(C63847n nVar, AbstractC12783f<FollowStatus> fVar, AbstractC12783f<? extends BaseResponse> fVar2, C12776a<? extends EnumC64712a> aVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        this.f146526a = nVar;
        this.f146527b = fVar;
        this.f146528c = fVar2;
        this.f146529d = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C64766o m116607a(C64766o oVar, C63847n nVar, AbstractC12783f fVar, AbstractC12783f fVar2, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            nVar = oVar.f146526a;
        }
        if ((i & 2) != 0) {
            fVar = oVar.f146527b;
        }
        if ((i & 4) != 0) {
            fVar2 = oVar.f146528c;
        }
        if ((i & 8) != 0) {
            aVar = oVar.f146529d;
        }
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(fVar2, "");
        return new C64766o(nVar, fVar, fVar2, aVar);
    }
}
