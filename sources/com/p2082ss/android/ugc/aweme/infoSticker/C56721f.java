package com.p2082ss.android.ugc.aweme.infoSticker;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.f */
public final class C56721f implements AbstractC27235f<ProviderEffect, Effect> {
    static {
        Covode.recordClassIndex(66581);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Effect mo45319a(ProviderEffect providerEffect) {
        return m102728a(providerEffect);
    }

    /* renamed from: a */
    public static Effect m102728a(ProviderEffect providerEffect) {
        Effect effect = new Effect();
        effect.setEffectId(providerEffect.getId());
        effect.setName(providerEffect.getTitle());
        effect.setUnzipPath(providerEffect.getPath());
        effect.setEffectType(10);
        return effect;
    }
}
