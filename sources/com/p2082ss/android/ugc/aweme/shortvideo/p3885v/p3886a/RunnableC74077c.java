package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.c */
final /* synthetic */ class RunnableC74077c implements Runnable {

    /* renamed from: a */
    private final C74062a f166297a;

    static {
        Covode.recordClassIndex(86829);
    }

    RunnableC74077c(C74062a aVar) {
        this.f166297a = aVar;
    }

    public final void run() {
        C74062a aVar = this.f166297a;
        int a = aVar.f166240e.mo110445a(1, aVar.f166244i.f147742a.get());
        if (aVar.f166237b != null) {
            aVar.f166237b.onProgressUpdate(a, false);
        }
    }
}
