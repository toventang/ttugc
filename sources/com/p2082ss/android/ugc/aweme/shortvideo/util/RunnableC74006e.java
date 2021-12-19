package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.e */
public final /* synthetic */ class RunnableC74006e implements Runnable {

    /* renamed from: a */
    private final Context f166099a;

    /* renamed from: b */
    private final String f166100b;

    static {
        Covode.recordClassIndex(86756);
    }

    RunnableC74006e(Context context, String str) {
        this.f166099a = context;
        this.f166100b = str;
    }

    public final void run() {
        C73933a b = C73933a.m130025b(this.f166099a, this.f166100b);
        if (C73933a.f166004f.get(b.f166010e) != null) {
            C73933a.f166004f.remove(b.f166010e);
        }
    }
}
