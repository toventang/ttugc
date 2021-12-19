package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.AbstractC45904h;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.y */
public final /* synthetic */ class RunnableC71390y implements Runnable {

    /* renamed from: a */
    private final C71056i f159971a;

    /* renamed from: b */
    private final int f159972b;

    /* renamed from: c */
    private final int f159973c;

    /* renamed from: d */
    private final AbstractC45904h f159974d;

    static {
        Covode.recordClassIndex(83918);
    }

    RunnableC71390y(C71056i iVar, int i, int i2, AbstractC45904h hVar) {
        this.f159971a = iVar;
        this.f159972b = i;
        this.f159973c = i2;
        this.f159974d = hVar;
    }

    public final void run() {
        C71056i iVar = this.f159971a;
        iVar.mo112252a(this.f159972b, this.f159973c, this.f159974d);
        iVar.mo112259i();
    }
}
