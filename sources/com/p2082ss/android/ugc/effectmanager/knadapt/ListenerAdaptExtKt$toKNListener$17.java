package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$17 */
public final class ListenerAdaptExtKt$toKNListener$17 implements AbstractC86796e<FetchHotEffectResponse> {
    final /* synthetic */ IFetchHotEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95748);
    }

    ListenerAdaptExtKt$toKNListener$17(IFetchHotEffectListener iFetchHotEffectListener) {
        this.$oldListener = iFetchHotEffectListener;
    }

    public final void onSuccess(FetchHotEffectResponse fetchHotEffectResponse) {
        C89219l.m154719c(fetchHotEffectResponse, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse(fetchHotEffectResponse));
    }

    public final void onFail(FetchHotEffectResponse fetchHotEffectResponse, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
