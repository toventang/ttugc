package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.d */
public final /* synthetic */ class RunnableC46217d implements Runnable {

    /* renamed from: a */
    private final C46216c f107656a;

    /* renamed from: b */
    private final View f107657b;

    static {
        Covode.recordClassIndex(54779);
    }

    RunnableC46217d(C46216c cVar, View view) {
        this.f107656a = cVar;
        this.f107657b = view;
    }

    public final void run() {
        C46216c cVar = this.f107656a;
        View view = this.f107657b;
        cVar.smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (cVar.getWidth() / 2), 0);
    }
}
