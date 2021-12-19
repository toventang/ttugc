package com.p2082ss.android.ugc.aweme.feed.p2963q;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.q.o */
public final /* synthetic */ class RunnableC49878o implements Runnable {

    /* renamed from: a */
    private final AbstractC49815a f114967a;

    static {
        Covode.recordClassIndex(58985);
    }

    RunnableC49878o(AbstractC49815a aVar) {
        this.f114967a = aVar;
    }

    public final void run() {
        AbstractC49815a aVar = this.f114967a;
        if (aVar.f114759N != null && aVar.f114776aD != null) {
            aVar.f114759N.postOnAnimation(aVar.f114776aD);
        }
    }
}
