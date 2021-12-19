package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$9 */
public final class ListenerAdaptExtKt$toKNListener$9 implements AbstractC86796e<Boolean> {
    final /* synthetic */ IIsTagNeedUpdatedListener $oldListener;

    static {
        Covode.recordClassIndex(95759);
    }

    ListenerAdaptExtKt$toKNListener$9(IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        this.$oldListener = iIsTagNeedUpdatedListener;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
    public final /* synthetic */ void onSuccess(Boolean bool) {
        onSuccess(bool.booleanValue());
    }

    public final void onSuccess(boolean z) {
        if (z) {
            this.$oldListener.onTagNeedUpdate();
        } else {
            this.$oldListener.onTagNeedNotUpdate();
        }
    }

    public final void onFail(Boolean bool, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onTagNeedNotUpdate();
    }
}
