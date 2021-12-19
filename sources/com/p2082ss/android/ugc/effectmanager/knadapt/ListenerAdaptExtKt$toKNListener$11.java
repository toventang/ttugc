package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$11 */
public final class ListenerAdaptExtKt$toKNListener$11 implements AbstractC86795d {
    final /* synthetic */ IDownloadProviderEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95740);
    }

    ListenerAdaptExtKt$toKNListener$11(IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        this.$oldListener = iDownloadProviderEffectListener;
    }

    public final void onSuccess(ProviderEffect providerEffect) {
        C89219l.m154719c(providerEffect, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect));
    }

    public final void onFail(ProviderEffect providerEffect, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(new com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d
    public final void onProgress(ProviderEffect providerEffect, int i, long j) {
        IDownloadProviderEffectListener iDownloadProviderEffectListener = this.$oldListener;
        if (iDownloadProviderEffectListener instanceof IDownloadProviderEffectProgressListener) {
            ((IDownloadProviderEffectProgressListener) iDownloadProviderEffectListener).onProgress(new com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect(providerEffect), i, j);
        }
    }
}
