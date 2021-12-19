package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36407e;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.ci */
public final /* synthetic */ class RunnableC37109ci implements Runnable {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87469a;

    static {
        Covode.recordClassIndex(44463);
    }

    RunnableC37109ci(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87469a = bzVar;
    }

    public final void run() {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87469a;
        if (C36407e.m74108a()) {
            bzVar.f87421d.requestFocus();
            KeyboardUtils.m70896b(bzVar.f87421d);
            bzVar.f87389U.mo63319a(bzVar.f87421d.getSelectionStart(), bzVar.f87421d.getText());
            return;
        }
        bzVar.f87389U.mo63319a(bzVar.f87421d.getSelectionStart(), bzVar.f87421d.getText());
        bzVar.f87421d.requestFocus();
        KeyboardUtils.m70896b(bzVar.f87421d);
    }
}
