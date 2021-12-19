package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.d */
final /* synthetic */ class RunnableC74078d implements Runnable {

    /* renamed from: a */
    private final C74062a f166298a;

    static {
        Covode.recordClassIndex(86830);
    }

    RunnableC74078d(C74062a aVar) {
        this.f166298a = aVar;
    }

    public final void run() {
        C74062a aVar = this.f166298a;
        int a = aVar.f166240e.mo110445a(4, aVar.f166245j.f147742a.get());
        if (aVar.f166237b != null) {
            aVar.f166237b.onProgressUpdate(a, false);
        }
    }
}
