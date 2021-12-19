package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.da */
public final /* synthetic */ class C73604da implements AbstractC89171a {

    /* renamed from: a */
    private final C73560cj f165422a;

    static {
        Covode.recordClassIndex(86342);
    }

    C73604da(C73560cj cjVar) {
        this.f165422a = cjVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        MethodCollector.m26663i(10645);
        C73560cj cjVar = this.f165422a;
        cjVar.f165327b.setVisibility(0);
        AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(cjVar.getContext(), R.anim.bn);
        animatorSet.setTarget(cjVar.f165327b);
        animatorSet.start();
        MethodCollector.m26664o(10645);
        return null;
    }
}
