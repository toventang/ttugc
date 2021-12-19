package com.bytedance.android.livesdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.utils.u */
public final /* synthetic */ class RunnableC11286u implements Runnable {

    /* renamed from: a */
    private final boolean f26994a;

    /* renamed from: b */
    private final String f26995b;

    /* renamed from: c */
    private final long f26996c;

    /* renamed from: d */
    private final Throwable f26997d;

    /* renamed from: e */
    private final AbstractC21959b f26998e;

    static {
        Covode.recordClassIndex(12918);
    }

    RunnableC11286u(boolean z, String str, long j, Throwable th, AbstractC21959b bVar) {
        this.f26994a = z;
        this.f26995b = str;
        this.f26996c = j;
        this.f26997d = th;
        this.f26998e = bVar;
    }

    public final void run() {
        LiveAppBundleUtils.lambda$null$5$LiveAppBundleUtils(this.f26994a, this.f26995b, this.f26996c, this.f26997d, this.f26998e);
    }
}
