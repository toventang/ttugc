package com.p2082ss.android.ugc.aweme.shortvideo.p3885v.p3886a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.a.b */
public final /* synthetic */ class RunnableC74076b implements Runnable {

    /* renamed from: a */
    private final C74062a f166295a;

    /* renamed from: b */
    private final C65512a f166296b;

    static {
        Covode.recordClassIndex(86828);
    }

    RunnableC74076b(C74062a aVar, C65512a aVar2) {
        this.f166295a = aVar;
        this.f166296b = aVar2;
    }

    public final void run() {
        C74062a aVar = this.f166295a;
        C65512a aVar2 = this.f166296b;
        if (aVar.f166237b != null) {
            aVar.f166237b.onProgressUpdate(aVar.f166240e.mo110445a(0, aVar2.f147742a.get()), false);
        }
    }
}
