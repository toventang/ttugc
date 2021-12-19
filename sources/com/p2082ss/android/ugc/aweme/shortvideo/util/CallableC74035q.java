package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.q */
public final /* synthetic */ class CallableC74035q implements Callable {

    /* renamed from: a */
    private final String f166170a;

    /* renamed from: b */
    private final Intent f166171b;

    /* renamed from: c */
    private final Context f166172c;

    /* renamed from: d */
    private final C1743j f166173d;

    static {
        Covode.recordClassIndex(86787);
    }

    CallableC74035q(String str, Intent intent, Context context, C1743j jVar) {
        this.f166170a = str;
        this.f166171b = intent;
        this.f166172c = context;
        this.f166173d = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C74007f.m130160a(this.f166170a, this.f166171b, this.f166172c, this.f166173d);
    }
}
