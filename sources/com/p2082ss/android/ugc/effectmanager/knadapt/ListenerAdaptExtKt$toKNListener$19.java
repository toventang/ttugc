package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$19 */
public final class ListenerAdaptExtKt$toKNListener$19 implements AbstractC86796e<Effect> {
    final /* synthetic */ IScanQRCodeListener $oldListener;

    static {
        Covode.recordClassIndex(95750);
    }

    ListenerAdaptExtKt$toKNListener$19(IScanQRCodeListener iScanQRCodeListener) {
        this.$oldListener = iScanQRCodeListener;
    }

    public final void onSuccess(Effect effect) {
        C89219l.m154719c(effect, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(effect));
    }

    public final void onFail(Effect effect, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
