package com.p2082ss.android.ugc.aweme.feedback.reply;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.reply.c */
final /* synthetic */ class CallableC50573c implements Callable {

    /* renamed from: a */
    private final FeedbackNewestReplyApi.C50570a f116872a;

    static {
        Covode.recordClassIndex(59722);
    }

    CallableC50573c(FeedbackNewestReplyApi.C50570a aVar) {
        this.f116872a = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        T t = FeedbackNewestReplyApi.f116867a.getNewestReply().execute().f52262b;
        C89219l.m154716b(t, "");
        return t;
    }
}
