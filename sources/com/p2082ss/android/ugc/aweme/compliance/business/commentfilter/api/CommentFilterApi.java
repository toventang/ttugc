package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2648b.C39381a;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi */
public final class CommentFilterApi {

    /* renamed from: a */
    public static API f92956a = ((API) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f79771d).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi$API */
    public interface API {
        static {
            Covode.recordClassIndex(47062);
        }

        @AbstractC89722f(mo144276a = "/aweme/v2/comment/filter/get_words/")
        C1731i<C39381a> getCommentFilterKeywords();

        @AbstractC89731o(mo144285a = "/aweme/v2/comment/filter/update_words/")
        C1731i<BaseResponse> setCommentFilterKeywords(@AbstractC89736t(mo144292a = "words") String str);

        @AbstractC89731o(mo144285a = "/tiktok/v1/comment/filter/trigger/")
        AbstractC88979t<BaseResponse> triggerSyncServerCommentFilter();
    }

    static {
        Covode.recordClassIndex(47061);
    }
}
