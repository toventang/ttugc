package com.p2082ss.android.ugc.aweme.shortvideo.p3885v;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3612b.p3613a.C65512a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.v.c */
public final /* synthetic */ class RunnableC74081c implements Runnable {

    /* renamed from: a */
    private final AbstractC74052a f166301a;

    /* renamed from: b */
    private final int f166302b;

    /* renamed from: c */
    private final C65512a f166303c;

    static {
        Covode.recordClassIndex(86833);
    }

    RunnableC74081c(AbstractC74052a aVar, int i, C65512a aVar2) {
        this.f166301a = aVar;
        this.f166302b = i;
        this.f166303c = aVar2;
    }

    public final void run() {
        AbstractC74052a aVar = this.f166301a;
        int a = aVar.f166204b.mo110445a(this.f166302b, this.f166303c.f147742a.get());
        if (aVar.f166203a != null) {
            aVar.f166203a.onProgressUpdate(a, false);
        }
    }
}
