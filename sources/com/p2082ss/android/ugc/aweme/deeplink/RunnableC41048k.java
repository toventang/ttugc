package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0569a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.k */
public final /* synthetic */ class RunnableC41048k implements Runnable {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f95955a;

    /* renamed from: b */
    private final Intent f95956b;

    /* renamed from: c */
    private final Bundle f95957c;

    static {
        Covode.recordClassIndex(48918);
    }

    RunnableC41048k(DeepLinkHandlerActivity deepLinkHandlerActivity, Intent intent, Bundle bundle) {
        this.f95955a = deepLinkHandlerActivity;
        this.f95956b = intent;
        this.f95957c = bundle;
    }

    public final void run() {
        C0569a.m2372a(this.f95955a, this.f95956b, this.f95957c);
    }
}
