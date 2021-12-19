package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.b */
public final /* synthetic */ class RunnableC74079b implements Runnable {

    /* renamed from: a */
    private final AbstractC74052a f166299a;

    static {
        Covode.recordClassIndex(86831);
    }

    RunnableC74079b(AbstractC74052a aVar) {
        this.f166299a = aVar;
    }

    public final void run() {
        AbstractC74052a aVar = this.f166299a;
        if (aVar.f166203a != null) {
            aVar.f166203a.onProgressUpdate(aVar.f166204b.mo110445a(0, aVar.f166206d.f147742a.get()), false);
        }
    }
}
