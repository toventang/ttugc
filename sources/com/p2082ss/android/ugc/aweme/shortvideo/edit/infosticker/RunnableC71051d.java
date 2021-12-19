package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.C45905a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.d */
public final /* synthetic */ class RunnableC71051d implements Runnable {

    /* renamed from: a */
    private final C71050c f159086a;

    /* renamed from: b */
    private final C71044aj f159087b;

    static {
        Covode.recordClassIndex(83549);
    }

    RunnableC71051d(C71050c cVar, C71044aj ajVar) {
        this.f159086a = cVar;
        this.f159087b = ajVar;
    }

    public final void run() {
        C71050c cVar = this.f159086a;
        C71044aj ajVar = this.f159087b;
        cVar.f159080h.mo77289b().postValue(new C45905a(ajVar.f159058g.left + (ajVar.f159058g.width() / 2.0f), ajVar.f159058g.top, R.string.axi, 0));
    }
}
