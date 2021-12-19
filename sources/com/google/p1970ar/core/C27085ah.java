package com.google.p1970ar.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.ah */
final class C27085ah extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ InstallActivity f64085a;

    static {
        Covode.recordClassIndex(32634);
    }

    C27085ah(InstallActivity installActivity) {
        this.f64085a = installActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f64085a.showSpinner();
    }
}
