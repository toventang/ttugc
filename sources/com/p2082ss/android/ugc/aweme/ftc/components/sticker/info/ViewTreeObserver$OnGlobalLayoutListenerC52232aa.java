package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.aa */
final /* synthetic */ class ViewTreeObserver$OnGlobalLayoutListenerC52232aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final C52264i f120342a;

    static {
        Covode.recordClassIndex(61620);
    }

    ViewTreeObserver$OnGlobalLayoutListenerC52232aa(C52264i iVar) {
        this.f120342a = iVar;
    }

    public final void onGlobalLayout() {
        C52264i iVar = this.f120342a;
        if (iVar.f120447r != null) {
            VESize b = iVar.f120447r.mo56330b();
            iVar.f120412C = (C70636dh.m124831b(iVar.f120432c) - b.width) >> 1;
            iVar.f120413D = (((C70636dh.m124836e(iVar.f120432c) - C33398a.f79357a.mo59455f()) - b.height) / 2) + C33398a.f79357a.mo59453d();
        }
    }
}
