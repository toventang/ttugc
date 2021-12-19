package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.EffectListResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$16 */
public final class ListenerAdaptExtKt$toKNListener$16 implements AbstractC86796e<EffectListResponse> {
    final /* synthetic */ IEffectListResponseListener $oldListener;

    static {
        Covode.recordClassIndex(95747);
    }

    ListenerAdaptExtKt$toKNListener$16(IEffectListResponseListener iEffectListResponseListener) {
        this.$oldListener = iEffectListResponseListener;
    }

    public final void onSuccess(EffectListResponse effectListResponse) {
        C89219l.m154719c(effectListResponse, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.net.EffectListResponse(effectListResponse));
    }

    public final void onFail(EffectListResponse effectListResponse, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
