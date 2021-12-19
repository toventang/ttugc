package com.p2082ss.android.ugc.aweme.discover.adapter.p2763b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23159f;
import com.p2082ss.android.ugc.aweme.search.model.C67679e;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.b.k */
final /* synthetic */ class RunnableC41707k implements Runnable {

    /* renamed from: a */
    private final C41703h f97309a;

    /* renamed from: b */
    private final C67679e f97310b;

    static {
        Covode.recordClassIndex(49620);
    }

    RunnableC41707k(C41703h hVar, C67679e eVar) {
        this.f97309a = hVar;
        this.f97310b = eVar;
    }

    public final void run() {
        View view;
        C41703h hVar = this.f97309a;
        int i = 8;
        if (!this.f97310b.mo106740a()) {
            view = hVar.f97293f;
        } else {
            float width = (float) (hVar.f97294g.getWidth() - C23159f.m43650b(15));
            float measureText = hVar.f97289b.getPaint().measureText(hVar.f97289b.getText().toString());
            view = hVar.f97293f;
            if (measureText < width) {
                i = 0;
            }
        }
        view.setVisibility(i);
    }
}
