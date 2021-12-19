package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.model.SearchEffectModel;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$7 */
public final class ListenerAdaptExtKt$toKNListener$7 implements AbstractC86796e<SearchEffectResponseV2> {
    final /* synthetic */ ISearchEffectListenerV2 $oldListener;

    static {
        Covode.recordClassIndex(95757);
    }

    ListenerAdaptExtKt$toKNListener$7(ISearchEffectListenerV2 iSearchEffectListenerV2) {
        this.$oldListener = iSearchEffectListenerV2;
    }

    public final void onSuccess(SearchEffectResponseV2 searchEffectResponseV2) {
        C89219l.m154719c(searchEffectResponseV2, "");
        com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2 searchEffectResponseV22 = new com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2();
        searchEffectResponseV22.setData(new SearchEffectModel(searchEffectResponseV2.getData()));
        searchEffectResponseV22.status_code = searchEffectResponseV2.getStatus_code();
        searchEffectResponseV22.message = searchEffectResponseV2.getMessage();
        this.$oldListener.onSuccess(searchEffectResponseV22);
    }

    public final void onFail(SearchEffectResponseV2 searchEffectResponseV2, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
