package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aa */
public final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC71035aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final C71056i f159037a;

    static {
        Covode.recordClassIndex(83533);
    }

    public ViewTreeObserver$OnGlobalLayoutListenerC71035aa(C71056i iVar) {
        this.f159037a = iVar;
    }

    public final void onGlobalLayout() {
        C71056i iVar = this.f159037a;
        if (iVar.f159137s != null) {
            VESize b = iVar.f159137s.mo56330b();
            iVar.f159097D = (C70636dh.m124831b(iVar.f159121c) - b.width) >> 1;
            iVar.f159098E = (((C70636dh.m124836e(iVar.f159121c) - C33398a.f79357a.mo59455f()) - b.height) / 2) + C33398a.f79357a.mo59453d();
        }
    }
}
