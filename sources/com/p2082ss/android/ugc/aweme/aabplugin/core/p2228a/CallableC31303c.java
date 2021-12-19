package com.p2082ss.android.ugc.aweme.aabplugin.core.p2228a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1542m.p1544b.C21409a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.a.c */
final /* synthetic */ class CallableC31303c implements Callable {

    /* renamed from: a */
    private final C31302b f75018a;

    /* renamed from: b */
    private final C21409a f75019b;

    static {
        Covode.recordClassIndex(38003);
    }

    CallableC31303c(C31302b bVar, C21409a aVar) {
        this.f75018a = bVar;
        this.f75019b = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f75018a.mo57305c(this.f75019b);
    }
}
