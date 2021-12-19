package com.p2082ss.android.ugc.tools.infosticker.view.internal.provider;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.c */
public final class C84856c {
    static {
        Covode.recordClassIndex(98843);
    }

    /* renamed from: a */
    public static final String m145758a(Object obj) {
        String subtitle;
        if (!(obj instanceof ProviderEffectModel)) {
            obj = null;
        }
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel = (com.p2082ss.ugc.effectplatform.model.ProviderEffectModel) obj;
        if (providerEffectModel == null || (subtitle = providerEffectModel.getSubtitle()) == null) {
            return "";
        }
        return subtitle;
    }
}
