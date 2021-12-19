package com.p2082ss.android.ugc.aweme.deeplink;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.h */
public final /* synthetic */ class RunnableC41045h implements Runnable {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f95950a;

    static {
        Covode.recordClassIndex(48915);
    }

    RunnableC41045h(DeepLinkHandlerActivity deepLinkHandlerActivity) {
        this.f95950a = deepLinkHandlerActivity;
    }

    public final void run() {
        new C23144b(this.f95950a).mo37640e(R.string.eye).mo37637b();
    }
}
