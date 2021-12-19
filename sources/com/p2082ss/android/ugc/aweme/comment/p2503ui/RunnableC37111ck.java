package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ck */
final /* synthetic */ class RunnableC37111ck implements Runnable {

    /* renamed from: a */
    private final DialogInterface$OnShowListenerC37084bz f87471a;

    static {
        Covode.recordClassIndex(44465);
    }

    RunnableC37111ck(DialogInterface$OnShowListenerC37084bz bzVar) {
        this.f87471a = bzVar;
    }

    public final void run() {
        DialogInterface$OnShowListenerC37084bz bzVar = this.f87471a;
        bzVar.f87390V = true;
        int selectionStart = bzVar.f87421d.getSelectionStart();
        Editable text = bzVar.f87421d.getText();
        if (text != null) {
            text.insert(selectionStart, "@");
        }
    }
}
