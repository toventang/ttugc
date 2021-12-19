package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.c */
public final /* synthetic */ class RunnableC74004c implements Runnable {

    /* renamed from: a */
    private final Context f166093a;

    /* renamed from: b */
    private final String f166094b;

    static {
        Covode.recordClassIndex(86754);
    }

    RunnableC74004c(Context context, String str) {
        this.f166093a = context;
        this.f166094b = str;
    }

    public final void run() {
        C73933a b = C73933a.m130025b(this.f166093a, this.f166094b);
        b.f166007b++;
        if (!b.f166008c) {
            b.f166008c = true;
            b.f166006a = b.mo116383a(b.f166009d, "entering");
        }
    }
}
