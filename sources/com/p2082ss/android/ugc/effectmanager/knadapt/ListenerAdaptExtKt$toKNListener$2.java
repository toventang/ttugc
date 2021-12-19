package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$2 */
public final class ListenerAdaptExtKt$toKNListener$2 implements AbstractC86796e<EffectChannelResponse> {
    final /* synthetic */ IFetchEffectChannelListener $oldListener;
    final /* synthetic */ C86882al $taskManager;

    static {
        Covode.recordClassIndex(95751);
    }

    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        C89219l.m154719c(effectChannelResponse, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(effectChannelResponse, this.$taskManager, new ListenerAdaptExtKt$toKNListener$2$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse(effectChannelResponse));
        }
    }

    ListenerAdaptExtKt$toKNListener$2(C86882al alVar, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchEffectChannelListener;
    }

    public final void onFail(EffectChannelResponse effectChannelResponse, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
