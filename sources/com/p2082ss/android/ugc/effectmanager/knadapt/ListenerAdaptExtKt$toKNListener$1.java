package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$1 */
public final class ListenerAdaptExtKt$toKNListener$1 implements AbstractC86798g {
    final /* synthetic */ IFetchEffectListener $oldListener;
    private Effect oldEffect;

    static {
        Covode.recordClassIndex(95738);
    }

    ListenerAdaptExtKt$toKNListener$1(IFetchEffectListener iFetchEffectListener) {
        this.$oldListener = iFetchEffectListener;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
    public final void onStart(com.p2082ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onStart(this.oldEffect);
    }

    public final void onSuccess(com.p2082ss.ugc.effectplatform.model.Effect effect) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onSuccess(this.oldEffect);
    }

    public final void onFail(com.p2082ss.ugc.effectplatform.model.Effect effect, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        this.$oldListener.onFail(this.oldEffect, ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g
    public final void onProgress(com.p2082ss.ugc.effectplatform.model.Effect effect, int i, long j) {
        if (this.oldEffect == null) {
            this.oldEffect = new Effect(effect);
        }
        IFetchEffectListener iFetchEffectListener = this.$oldListener;
        if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
            ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(this.oldEffect, i, j);
        }
    }
}
