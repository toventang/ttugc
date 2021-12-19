package com.p2082ss.android.ugc.aweme.comment.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.comment.api.CommentBatchManagementApi */
public interface CommentBatchManagementApi {

    /* renamed from: a */
    public static final C36261a f85690a = C36261a.f85691a;

    static {
        Covode.recordClassIndex(43529);
    }

    @AbstractC89731o(mo144285a = "/tiktok/comment/batch_delete/v1")
    @AbstractC89721e
    AbstractC88403ab<C36268b> commentBatchDelete(@AbstractC89719c(mo144273a = "cids") String str, @AbstractC89719c(mo144273a = "item_id") String str2);

    @AbstractC89731o(mo144285a = "/tiktok/v1/user/batch/block/")
    @AbstractC89721e
    AbstractC88403ab<C36273f> userBatchBlock(@AbstractC89719c(mo144273a = "to_user_id_list") String str);

    /* renamed from: com.ss.android.ugc.aweme.comment.api.CommentBatchManagementApi$a */
    public static final class C36261a {

        /* renamed from: a */
        static final /* synthetic */ C36261a f85691a = new C36261a();

        private C36261a() {
        }

        static {
            Covode.recordClassIndex(43530);
        }

        /* renamed from: a */
        public static CommentBatchManagementApi m73904a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(CommentBatchManagementApi.class);
            C89219l.m154716b(create, "");
            return (CommentBatchManagementApi) create;
        }
    }
}
