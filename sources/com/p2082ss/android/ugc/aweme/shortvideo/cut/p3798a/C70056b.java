package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.mediaplayer.C59201i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b */
public final /* synthetic */ class C70056b implements AbstractC1214u {

    /* renamed from: a */
    private final C70045a f156668a;

    static {
        Covode.recordClassIndex(82476);
    }

    C70056b(C70045a aVar) {
        this.f156668a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C70045a aVar = this.f156668a;
        C59201i iVar = (C59201i) obj;
        if (iVar != null) {
            switch (iVar.f134735b) {
                case 1:
                    if (!iVar.f134734a) {
                        aVar.mo110513b();
                        return;
                    } else if (aVar.f156645j != null) {
                        aVar.f156645j.f154195d = (int) aVar.f156642g.f134714b.mo96718e();
                        return;
                    } else {
                        return;
                    }
                case 2:
                case 4:
                    aVar.f156637b.setVisibility(8);
                    if (iVar.f134734a) {
                        aVar.f156646k.post(aVar.f156647l);
                        return;
                    }
                    return;
                case 3:
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    if (iVar.f134734a && !aVar.f156641f) {
                        aVar.f156646k.removeCallbacks(aVar.f156647l);
                        aVar.f156637b.setVisibility(0);
                        return;
                    }
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    if (iVar.f134734a) {
                        aVar.f156637b.setVisibility(8);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
