package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.views.h */
public final /* synthetic */ class RunnableC38943h implements Runnable {

    /* renamed from: a */
    private final AbstractC38925d f91994a;

    /* renamed from: b */
    private final View f91995b;

    /* renamed from: c */
    private final Runnable f91996c;

    static {
        Covode.recordClassIndex(46531);
    }

    RunnableC38943h(AbstractC38925d dVar, View view, Runnable runnable) {
        this.f91994a = dVar;
        this.f91995b = view;
        this.f91996c = runnable;
    }

    public final void run() {
        this.f91994a.mo67601b(this.f91995b, this.f91996c);
    }
}
