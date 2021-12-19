package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.w */
final /* synthetic */ class RunnableC36255w implements Runnable {

    /* renamed from: a */
    private final C36247s f85671a;

    static {
        Covode.recordClassIndex(43521);
    }

    RunnableC36255w(C36247s sVar) {
        this.f85671a = sVar;
    }

    public final void run() {
        C36247s sVar = this.f85671a;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(sVar.f85631A, "backgroundColor", sVar.f85631A.getResources().getColor(R.color.f), sVar.f85631A.getResources().getColor(R.color.c9));
        ofInt.setDuration(3000L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
        sVar.f85637a.setNeedHint(false);
    }
}
