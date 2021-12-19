package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dp */
public final /* synthetic */ class C73619dp implements CheckBAHideLoading {

    /* renamed from: a */
    private final C73560cj f165440a;

    static {
        Covode.recordClassIndex(86357);
    }

    C73619dp(C73560cj cjVar) {
        this.f165440a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading
    public final void hideLoading() {
        C73560cj cjVar = this.f165440a;
        cjVar.f165340o.setVisibility(0);
        cjVar.f165341p.setVisibility(8);
        if (cjVar.f165342q != null && cjVar.f165342q.isRunning()) {
            cjVar.f165342q.cancel();
        }
    }
}
