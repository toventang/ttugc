package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.cj */
public final /* synthetic */ class RunnableC37110cj implements Runnable {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87470a;

    static {
        Covode.recordClassIndex(44464);
    }

    RunnableC37110cj(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87470a = bzVar;
    }

    public final void run() {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87470a;
        bzVar.f87429l.mo64496b();
        KeyboardUtils.m70897c(bzVar.f87421d);
    }
}
