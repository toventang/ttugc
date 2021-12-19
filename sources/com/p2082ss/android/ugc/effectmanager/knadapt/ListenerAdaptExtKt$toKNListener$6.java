package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$6 */
public final class ListenerAdaptExtKt$toKNListener$6 implements AbstractC86796e<SearchEffectResponse> {
    final /* synthetic */ ISearchEffectListener $oldListener;

    static {
        Covode.recordClassIndex(95756);
    }

    ListenerAdaptExtKt$toKNListener$6(ISearchEffectListener iSearchEffectListener) {
        this.$oldListener = iSearchEffectListener;
    }

    public final void onSuccess(SearchEffectResponse searchEffectResponse) {
        C89219l.m154719c(searchEffectResponse, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectResponse(searchEffectResponse));
    }

    public final void onFail(SearchEffectResponse searchEffectResponse, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
