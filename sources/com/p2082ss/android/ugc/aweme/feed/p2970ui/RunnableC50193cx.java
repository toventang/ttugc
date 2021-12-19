package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cx */
final /* synthetic */ class RunnableC50193cx implements Runnable {

    /* renamed from: a */
    private final C50188cv f115901a;

    static {
        Covode.recordClassIndex(59319);
    }

    RunnableC50193cx(C50188cv cvVar) {
        this.f115901a = cvVar;
    }

    public final void run() {
        C50188cv cvVar = this.f115901a;
        if (cvVar.f113959R instanceof ActivityC0945e) {
            ActivityC0945e eVar = (ActivityC0945e) cvVar.f113959R;
            cvVar.f115878j = CommentServiceImpl.m73664e().mo63298b(eVar);
            cvVar.f115878j.mo63460a().observe(eVar, cvVar.f115880l);
        }
    }
}
