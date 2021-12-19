package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$10 */
public final class ListenerAdaptExtKt$toKNListener$10 implements AbstractC86796e<ProviderEffectModel> {
    final /* synthetic */ IFetchProviderEffect $oldListener;

    static {
        Covode.recordClassIndex(95739);
    }

    ListenerAdaptExtKt$toKNListener$10(IFetchProviderEffect iFetchProviderEffect) {
        this.$oldListener = iFetchProviderEffect;
    }

    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        C89219l.m154719c(providerEffectModel, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel(providerEffectModel));
    }

    public final void onFail(ProviderEffectModel providerEffectModel, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
