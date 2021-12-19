package com.p2082ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi */
public interface VideoTagApi {

    /* renamed from: a */
    public static final C36850a f86831a = C36850a.f86832a;

    static {
        Covode.recordClassIndex(44187);
    }

    @AbstractC89722f(mo144276a = "/tiktok/interaction/mention/general/aweme/check/v1")
    AbstractC88979t<C36852b> mentionAwemeCheck(@AbstractC89736t(mo144292a = "aweme_id") long j);

    @AbstractC89722f(mo144276a = "/tiktok/interaction/mention/general/check/v1")
    AbstractC88979t<C36852b> mentionCheck(@AbstractC89736t(mo144292a = "uids") String str, @AbstractC89736t(mo144292a = "mention_type") String str2, @AbstractC89736t(mo144292a = "is_check_aweme") boolean z, @AbstractC89736t(mo144292a = "aweme_id") long j);

    @AbstractC89722f(mo144276a = "/tiktok/interaction/mention/recent/contact/query/v1")
    AbstractC21983b<C36855e> mentionRecentContactQuery(@AbstractC89736t(mo144292a = "mention_type") int i, @AbstractC89736t(mo144292a = "aweme_id") long j, @AbstractC89736t(mo144292a = "is_check_aweme") boolean z);

    @AbstractC89731o(mo144285a = "/tiktok/interaction/mention/tag/update/v1")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> tagUpdate(@AbstractC89719c(mo144273a = "add_uids") String str, @AbstractC89719c(mo144273a = "remove_uids") String str2, @AbstractC89719c(mo144273a = "aweme_id") long j);

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi$a */
    public static final class C36850a {

        /* renamed from: a */
        static final /* synthetic */ C36850a f86832a = new C36850a();

        private C36850a() {
        }

        static {
            Covode.recordClassIndex(44188);
        }

        /* renamed from: a */
        public static VideoTagApi m74491a() {
            String str = C29736b.f70924e;
            C89219l.m154716b(str, "");
            return (VideoTagApi) C18097a.m33696a().mo28816a(str).mo28858a(VideoTagApi.class);
        }
    }
}
