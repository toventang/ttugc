package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.e */
public final /* synthetic */ class CallableC71938e implements Callable {

    /* renamed from: a */
    private final C71924b f161213a;

    static {
        Covode.recordClassIndex(84487);
    }

    CallableC71938e(C71924b bVar) {
        this.f161213a = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return DetailApi.m82809a(this.f161213a.f161178k.getAid(), "", 0);
    }
}
