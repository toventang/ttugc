package com.p2082ss.android.ugc.aweme.account.agegate.model;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.account.agegate.model.c */
final /* synthetic */ class CallableC31542c implements Callable {

    /* renamed from: a */
    private final C31541b f75439a;

    /* renamed from: b */
    private final String f75440b;

    /* renamed from: c */
    private final boolean f75441c;

    static {
        Covode.recordClassIndex(38260);
    }

    CallableC31542c(C31541b bVar, String str, boolean z) {
        this.f75439a = bVar;
        this.f75440b = str;
        this.f75441c = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C31541b.m65797a(this.f75440b, false, this.f75441c);
    }
}
