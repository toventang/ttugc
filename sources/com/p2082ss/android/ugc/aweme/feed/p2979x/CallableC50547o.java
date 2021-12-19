package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.x.o */
public final /* synthetic */ class CallableC50547o implements Callable {

    /* renamed from: a */
    private final C49672ag f116812a;

    /* renamed from: b */
    private final String f116813b;

    /* renamed from: c */
    private final C49812b f116814c;

    static {
        Covode.recordClassIndex(59694);
    }

    CallableC50547o(C49672ag agVar, String str, C49812b bVar) {
        this.f116812a = agVar;
        this.f116813b = str;
        this.f116814c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C50546n.m94771a(this.f116812a, this.f116813b, this.f116814c);
    }
}
