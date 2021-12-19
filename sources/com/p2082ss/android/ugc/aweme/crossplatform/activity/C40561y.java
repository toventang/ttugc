package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.os.MessageQueue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40556v;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.y */
final /* synthetic */ class C40561y implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private final C40556v.RunnableC405571 f94906a;

    /* renamed from: b */
    private final Activity f94907b;

    /* renamed from: c */
    private final C40556v.AbstractC40558a f94908c;

    static {
        Covode.recordClassIndex(48382);
    }

    C40561y(C40556v.RunnableC405571 r1, Activity activity, C40556v.AbstractC40558a aVar) {
        this.f94906a = r1;
        this.f94907b = activity;
        this.f94908c = aVar;
    }

    public final boolean queueIdle() {
        C40556v.RunnableC405571 r3 = this.f94906a;
        Activity activity = this.f94907b;
        C40556v.AbstractC40558a aVar = this.f94908c;
        C40556v.this.f94896b.offer(new SingleWebView(activity));
        aVar.mo67526a();
        return false;
    }
}
