package com.p2082ss.android.ugc.aweme.main.guide;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.ss.android.ugc.aweme.main.guide.e */
public final /* synthetic */ class RunnableC59099e implements Runnable {

    /* renamed from: a */
    private final C59097c f134511a;

    static {
        Covode.recordClassIndex(69449);
    }

    public RunnableC59099e(C59097c cVar) {
        this.f134511a = cVar;
    }

    public final void run() {
        C59097c cVar = this.f134511a;
        if (cVar.f134509e != null) {
            cVar.f134509e.mo5836d();
        }
        View view = cVar.f134508d;
        if (view.getVisibility() != 8) {
            view.setVisibility(8);
        }
        AbstractC81915c.m141874a(new C59096b(false));
    }
}
