package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.q */
final /* synthetic */ class RunnableC36244q implements Runnable {

    /* renamed from: a */
    private final C36229h f85616a;

    static {
        Covode.recordClassIndex(43510);
    }

    RunnableC36244q(C36229h hVar) {
        this.f85616a = hVar;
    }

    public final void run() {
        C36229h hVar = this.f85616a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(hVar.f85576a, "backgroundColor", hVar.f85576a.getResources().getColor(R.color.f), hVar.f85576a.getResources().getColor(R.color.c9));
        ofInt.setDuration(3000L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        hVar.f85600y.setNeedHint(false);
    }
}
