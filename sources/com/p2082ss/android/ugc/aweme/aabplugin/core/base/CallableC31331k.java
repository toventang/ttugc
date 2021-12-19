package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1542m.p1544b.C21409a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.k */
final /* synthetic */ class CallableC31331k implements Callable {

    /* renamed from: a */
    private final AbstractC31333m f75056a;

    /* renamed from: b */
    private final C21409a f75057b;

    static {
        Covode.recordClassIndex(38031);
    }

    CallableC31331k(AbstractC31333m mVar, C21409a aVar) {
        this.f75056a = mVar;
        this.f75057b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f75056a.mo57333b((AbstractC31333m) this.f75057b);
    }
}
