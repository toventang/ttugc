package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.api.C41109b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.setting.bu */
public final /* synthetic */ class C68036bu implements AbstractC1729g {

    /* renamed from: a */
    public static final AbstractC1729g f152397a = new C68036bu();

    static {
        Covode.recordClassIndex(80232);
    }

    private C68036bu() {
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        if (iVar.mo5544c()) {
            return null;
        }
        C41109b bVar = (C41109b) iVar.mo5545d();
        if (bVar.f96104b == 0 || bVar.f96103a == 0) {
            C63244g.m114602a().mo73277e().setReactDuetSettingCurrent(C68034bs.f152394e);
            return null;
        }
        C63244g.m114602a().mo73277e().setReactDuetSettingCurrent(C68034bs.f152395f);
        return null;
    }
}
