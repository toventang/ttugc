package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42412i;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67605g;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.l */
final /* synthetic */ class RunnableC42419l implements Runnable {

    /* renamed from: a */
    private final C42412i.C424131 f98834a;

    static {
        Covode.recordClassIndex(50364);
    }

    RunnableC42419l(C42412i.C424131 r1) {
        this.f98834a = r1;
    }

    public final void run() {
        C42412i iVar = C42412i.this;
        iVar.f98114j = null;
        C67592a.f151371d.mo106562c();
        iVar.mIsLoading = false;
        iVar.f98116l = false;
        if (iVar.mData == null || ((C42426m) iVar.mData).f98850c == null || ((C42426m) iVar.mData).f98850c.size() == 0) {
            iVar.f98815c.mo71646a(2, null);
            C67605g.m119730a(iVar.f98113i).mo106583b(1).f151438r = 1;
            return;
        }
        iVar.f98815c.mo71646a(0, null);
    }
}
