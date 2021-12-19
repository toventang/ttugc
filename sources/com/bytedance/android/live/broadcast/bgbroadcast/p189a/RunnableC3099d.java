package com.bytedance.android.live.broadcast.bgbroadcast.p189a;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.d */
final /* synthetic */ class RunnableC3099d implements Runnable {

    /* renamed from: a */
    private final C3096b f8996a;

    static {
        Covode.recordClassIndex(3580);
    }

    RunnableC3099d(C3096b bVar) {
        this.f8996a = bVar;
    }

    public final void run() {
        C11226ao.m19882a(this.f8996a.f8986b, (int) R.string.gr6);
        C6501b.C6502a.m13948a("livesdk_anchor_network_error").mo12651a("error_type", "2").mo12655b();
    }
}
