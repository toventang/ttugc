package com.p2082ss.android.ugc.aweme.awemeservice.p2353a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2000b.AbstractC27340m;
import com.google.p1998c.p2000b.C27341n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a.e */
final /* synthetic */ class C34281e implements AbstractC27340m {

    /* renamed from: a */
    private final C34279d f81058a;

    static {
        Covode.recordClassIndex(41222);
    }

    C34281e(C34279d dVar) {
        this.f81058a = dVar;
    }

    @Override // com.google.p1998c.p2000b.AbstractC27340m
    /* renamed from: a */
    public final void mo45365a(C27341n nVar) {
        C34279d dVar = this.f81058a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            C1731i.m5640b(new Callable<Object>(nVar) {
                /* class com.p2082ss.android.ugc.aweme.awemeservice.p2353a.C34279d.CallableC342801 */

                /* renamed from: a */
                final /* synthetic */ C27341n f81056a;

                static {
                    Covode.recordClassIndex(41221);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C34279d.this.mo60705a((String) this.f81056a.getKey(), (Aweme) this.f81056a.getValue());
                    return null;
                }

                {
                    this.f81056a = r2;
                }
            }, C1731i.f5562a);
        } else {
            dVar.mo60705a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }
}
