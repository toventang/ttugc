package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$preProcess$1 */
public final class ListenerAdaptExtKt$preProcess$1 extends AbstractC89220m implements AbstractC89172b<EffectChannelResponse, com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse> {
    public static final ListenerAdaptExtKt$preProcess$1 INSTANCE = new ListenerAdaptExtKt$preProcess$1();

    static {
        Covode.recordClassIndex(95735);
    }

    ListenerAdaptExtKt$preProcess$1() {
        super(1);
    }

    public final com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse invoke(EffectChannelResponse effectChannelResponse) {
        C89219l.m154719c(effectChannelResponse, "");
        com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse effectChannelResponse2 = new com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(effectChannelResponse);
        ListenerAdaptExtKt.preProcess(effectChannelResponse2.getAllCategoryEffects());
        ListenerAdaptExtKt.preProcess(effectChannelResponse2.getCollections());
        for (T t : effectChannelResponse2.getCategoryResponseList()) {
            ListenerAdaptExtKt.preProcess(t.getCollectionEffect());
            ListenerAdaptExtKt.preProcess(t.getTotalEffects());
        }
        return effectChannelResponse2;
    }
}
