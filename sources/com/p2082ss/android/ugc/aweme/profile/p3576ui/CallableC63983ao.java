package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.ui.ao */
public final /* synthetic */ class CallableC63983ao implements Callable {

    /* renamed from: a */
    private final AbstractC63980al f145114a;

    /* renamed from: b */
    private final String f145115b;

    /* renamed from: c */
    private final long f145116c;

    /* renamed from: d */
    private final int f145117d;

    static {
        Covode.recordClassIndex(75427);
    }

    CallableC63983ao(AbstractC63980al alVar, String str, long j, int i) {
        this.f145114a = alVar;
        this.f145115b = str;
        this.f145116c = j;
        this.f145117d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f145114a.mo103542a(this.f145115b, this.f145116c, this.f145117d);
    }
}
