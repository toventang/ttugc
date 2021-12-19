package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.do */
public final /* synthetic */ class C73618do implements CheckBAShowLoading {

    /* renamed from: a */
    private final C73560cj f165439a;

    static {
        Covode.recordClassIndex(86356);
    }

    C73618do(C73560cj cjVar) {
        this.f165439a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading
    public final void showLoading() {
        C73560cj cjVar = this.f165439a;
        if (cjVar.f165342q == null) {
            cjVar.f165342q = ObjectAnimator.ofFloat(cjVar.f165341p, "rotation", 0.0f, 360.0f);
            cjVar.f165342q.setDuration(1000L);
            cjVar.f165342q.setRepeatCount(-1);
            cjVar.f165342q.setInterpolator(new LinearInterpolator());
        }
        cjVar.f165340o.setVisibility(8);
        cjVar.f165341p.setVisibility(0);
        if (cjVar.f165342q != null && !cjVar.f165342q.isRunning()) {
            cjVar.f165342q.start();
        }
    }
}
