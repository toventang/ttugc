package com.p2082ss.android.ugc.aweme.feed.p2969u;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.u.g */
public final /* synthetic */ class CallableC49971g implements Callable {

    /* renamed from: a */
    private final C49968d f115268a;

    /* renamed from: b */
    private final int f115269b;

    /* renamed from: c */
    private final Message f115270c;

    /* renamed from: d */
    private final Lock f115271d;

    static {
        Covode.recordClassIndex(59083);
    }

    CallableC49971g(C49968d dVar, int i, Message message, Lock lock) {
        this.f115268a = dVar;
        this.f115269b = i;
        this.f115270c = message;
        this.f115271d = lock;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f115268a.mo85014a(this.f115269b, this.f115270c, this.f115271d);
    }
}
