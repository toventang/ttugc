package com.p2082ss.android.ugc.aweme.upvote.publish;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79709c;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79713g;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.f */
public final class C80020f implements AbstractC12644a<AbstractC80018e> {

    /* renamed from: a */
    public final AbstractC80018e f179338a = new C80021a();

    static {
        Covode.recordClassIndex(93247);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.f$a */
    public static final class C80021a implements AbstractC80018e {
        static {
            Covode.recordClassIndex(93248);
        }

        C80021a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC80018e
        /* renamed from: a */
        public final AbstractC88403ab<BaseResponse> mo123467a(String str) {
            C89219l.m154721d(str, "");
            return UpvoteApi.f178837a.deleteUpvote(str);
        }

        @Override // com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC80018e
        /* renamed from: a */
        public final AbstractC88403ab<C79709c> mo123469a(List<String> list) {
            C89219l.m154721d(list, "");
            UpvoteApi upvoteApi = UpvoteApi.f178837a;
            String b = C80342dg.m139300a().mo46674b(list);
            C89219l.m154716b(b, "");
            return upvoteApi.publishUpvoteBatch(b);
        }

        @Override // com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC80018e
        /* renamed from: a */
        public final AbstractC88403ab<C79713g> mo123468a(String str, String str2) {
            C89219l.m154721d(str, "");
            return UpvoteApi.f178837a.publishUpvote(str, str2, null);
        }

        @Override // com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC80018e
        /* renamed from: b */
        public final AbstractC88403ab<C79713g> mo123470b(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return UpvoteApi.f178837a.publishUpvote(str, str2, true);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC80018e mo20458a() {
        return this.f179338a;
    }
}
