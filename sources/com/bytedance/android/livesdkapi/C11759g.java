package com.bytedance.android.livesdkapi;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdkapi.g */
final /* synthetic */ class C11759g implements AbstractC88433f {

    /* renamed from: a */
    private final C28022o f28123a;

    static {
        Covode.recordClassIndex(13449);
    }

    C11759g(C28022o oVar) {
        this.f28123a = oVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C28022o oVar = this.f28123a;
        SettingsManager.INSTANCE.saveSettingsValue(oVar);
        C6802e.f16866a.storeString("setting_key", oVar.toString());
    }
}
