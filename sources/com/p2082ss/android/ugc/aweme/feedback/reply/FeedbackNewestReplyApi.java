package com.p2082ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.AbstractC21983b;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi */
public final class FeedbackNewestReplyApi {

    /* renamed from: a */
    public static Api f116867a = ((Api) RetrofitFactory.m33635a().mo28817b(com.p2082ss.android.ugc.aweme.app.api.Api.f79771d).mo28832d().mo28858a(Api.class));

    /* renamed from: b */
    public static final C50570a f116868b = new C50570a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi$Api */
    interface Api {
        static {
            Covode.recordClassIndex(59718);
        }

        @AbstractC89722f(mo144276a = "/api/feedback/v1/newest_reply/")
        AbstractC21983b<C50575e> getNewestReply();
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi$a */
    public static final class C50570a {
        static {
            Covode.recordClassIndex(59719);
        }

        private C50570a() {
        }

        public /* synthetic */ C50570a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59717);
    }
}
