package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.detail.api.C41109b;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.bw */
public final /* synthetic */ class C68038bw implements AbstractC1729g {

    /* renamed from: a */
    public static final AbstractC1729g f152399a = new C68038bw();

    static {
        Covode.recordClassIndex(80234);
    }

    private C68038bw() {
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        if (iVar.mo5544c()) {
            return null;
        }
        C41109b bVar = (C41109b) iVar.mo5545d();
        if (bVar.f96104b == 0 || bVar.f96103a == 0) {
            Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", C68034bs.f152394e);
            return null;
        }
        Keva.getRepo("DUET_SETTING_REPO").storeInt("DUET_SETTING_KEY", C68034bs.f152395f);
        return null;
    }
}
