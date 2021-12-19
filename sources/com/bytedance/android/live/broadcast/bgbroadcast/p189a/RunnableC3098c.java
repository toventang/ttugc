package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.c */
final /* synthetic */ class RunnableC3098c implements Runnable {

    /* renamed from: a */
    private final C3096b f8995a;

    static {
        Covode.recordClassIndex(3579);
    }

    RunnableC3098c(C3096b bVar) {
        this.f8995a = bVar;
    }

    public final void run() {
        C11226ao.m19882a(this.f8995a.f8986b, (int) R.string.gqa);
        C6501b.C6502a.m13948a("livesdk_anchor_network_error").mo12651a("error_type", "1").mo12655b();
    }
}
