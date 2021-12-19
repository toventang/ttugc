package com.p2082ss.android.ugc.aweme.player.sdk.p3552a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.model.C84217p;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.a.j */
final /* synthetic */ class RunnableC63007j implements Runnable {

    /* renamed from: a */
    private final C62976i f143097a;

    /* renamed from: b */
    private final C84217p f143098b;

    static {
        Covode.recordClassIndex(73844);
    }

    RunnableC63007j(C62976i iVar, C84217p pVar) {
        this.f143097a = iVar;
        this.f143098b = pVar;
    }

    public final void run() {
        C62976i iVar = this.f143097a;
        C84217p pVar = this.f143098b;
        if (iVar.f142981v != null) {
            iVar.f142981v.onPreparePlay(pVar.f188196j);
        }
    }
}
