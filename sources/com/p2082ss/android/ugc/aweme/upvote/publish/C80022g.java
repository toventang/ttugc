package com.p2082ss.android.ugc.aweme.upvote.publish;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.g */
public final class C80022g implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<BaseResponse> f179339a;

    /* renamed from: b */
    public final CommentRethinkPopup f179340b;

    /* renamed from: c */
    public final C12776a<C89378p<Integer, String>> f179341c;

    static {
        Covode.recordClassIndex(93249);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80022g)) {
            return false;
        }
        C80022g gVar = (C80022g) obj;
        return C89219l.m154714a(this.f179339a, gVar.f179339a) && C89219l.m154714a(this.f179340b, gVar.f179340b) && C89219l.m154714a(this.f179341c, gVar.f179341c);
    }

    public final int hashCode() {
        AbstractC12783f<BaseResponse> fVar = this.f179339a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        CommentRethinkPopup commentRethinkPopup = this.f179340b;
        int hashCode2 = (hashCode + (commentRethinkPopup != null ? commentRethinkPopup.hashCode() : 0)) * 31;
        C12776a<C89378p<Integer, String>> aVar = this.f179341c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "UpvotePublishState(request=" + this.f179339a + ", rethinkPopup=" + this.f179340b + ", publishEvent=" + this.f179341c + ")";
    }

    public /* synthetic */ C80022g() {
        this(C12797s.f31127a, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.base.api.BaseResponse> */
    /* JADX WARN: Multi-variable type inference failed */
    private C80022g(AbstractC12783f<? extends BaseResponse> fVar, CommentRethinkPopup commentRethinkPopup, C12776a<C89378p<Integer, String>> aVar) {
        C89219l.m154721d(fVar, "");
        this.f179339a = fVar;
        this.f179340b = commentRethinkPopup;
        this.f179341c = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C80022g m138721a(C80022g gVar, AbstractC12783f fVar, CommentRethinkPopup commentRethinkPopup, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            fVar = gVar.f179339a;
        }
        if ((i & 2) != 0) {
            commentRethinkPopup = gVar.f179340b;
        }
        if ((i & 4) != 0) {
            aVar = gVar.f179341c;
        }
        C89219l.m154721d(fVar, "");
        return new C80022g(fVar, commentRethinkPopup, aVar);
    }
}
