package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$18 */
public final class ListenerAdaptExtKt$toKNListener$18 implements AbstractC86796e<ResourceListModel> {
    final /* synthetic */ IFetchResourceListener $oldListener;

    static {
        Covode.recordClassIndex(95749);
    }

    ListenerAdaptExtKt$toKNListener$18(IFetchResourceListener iFetchResourceListener) {
        this.$oldListener = iFetchResourceListener;
    }

    public final void onSuccess(ResourceListModel resourceListModel) {
        C89219l.m154719c(resourceListModel, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel(resourceListModel));
    }

    public final void onFail(ResourceListModel resourceListModel, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
