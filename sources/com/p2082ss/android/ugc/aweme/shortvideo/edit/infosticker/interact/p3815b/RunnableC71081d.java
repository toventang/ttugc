package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p3815b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.interact.hit.C45905a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.d */
public final /* synthetic */ class RunnableC71081d implements Runnable {

    /* renamed from: a */
    private final AbstractC71078c f159199a;

    static {
        Covode.recordClassIndex(83580);
    }

    RunnableC71081d(AbstractC71078c cVar) {
        this.f159199a = cVar;
    }

    public final void run() {
        AbstractC71078c cVar = this.f159199a;
        if (cVar.f159182l != null) {
            cVar.f159191u.mo77289b().postValue(new C45905a(cVar.f159182l.getContentView().getX() + (((float) cVar.f159182l.getContentView().getWidth()) / 2.0f), cVar.f159182l.getContentView().getY(), cVar.mo112287f(), cVar.mo112286e()));
        }
    }
}
