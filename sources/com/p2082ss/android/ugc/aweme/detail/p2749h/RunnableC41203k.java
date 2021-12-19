package com.p2082ss.android.ugc.aweme.detail.p2749h;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.video.local.C80771f;

/* renamed from: com.ss.android.ugc.aweme.detail.h.k */
final /* synthetic */ class RunnableC41203k implements Runnable {

    /* renamed from: a */
    private final C41178b f96300a;

    static {
        Covode.recordClassIndex(49086);
    }

    RunnableC41203k(C41178b bVar) {
        this.f96300a = bVar;
    }

    public final void run() {
        C41178b bVar = this.f96300a;
        if (bVar.mo84730bE()) {
            AbstractC48149ai bg = bVar.mo84754bg();
            if (bg != null) {
                bg.mo70615a(bg.mo80206b());
                AwemeChangeCallBack.m108596a((ActivityC0945e) bVar.f183419bv, bg.mo80206b());
                if (bg.mo80155a() == 2) {
                    return;
                }
            }
            bVar.mo81102au();
            bVar.mo84759bl();
            if (C80771f.f180597a && bg != null) {
                bg.mo80227r();
            }
        }
    }
}
