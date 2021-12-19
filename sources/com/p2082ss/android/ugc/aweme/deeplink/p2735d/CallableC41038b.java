package com.p2082ss.android.ugc.aweme.deeplink.p2735d;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.deeplink.d.b */
public final /* synthetic */ class CallableC41038b implements Callable {

    /* renamed from: a */
    private final C41037a f95926a;

    /* renamed from: b */
    private final Uri f95927b;

    static {
        Covode.recordClassIndex(48908);
    }

    CallableC41038b(C41037a aVar, Uri uri) {
        this.f95926a = aVar;
        this.f95927b = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f95926a.mo70248c(this.f95927b);
    }
}
