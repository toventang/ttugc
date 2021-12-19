package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$12 */
public final class ListenerAdaptExtKt$toKNListener$12 implements AbstractC86796e<CategoryPageModel> {
    final /* synthetic */ IFetchCategoryEffectListener $oldListener;
    final /* synthetic */ C86882al $taskManager;

    static {
        Covode.recordClassIndex(95741);
    }

    public final void onSuccess(CategoryPageModel categoryPageModel) {
        C89219l.m154719c(categoryPageModel, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(categoryPageModel, this.$taskManager, new ListenerAdaptExtKt$toKNListener$12$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel(categoryPageModel));
        }
    }

    ListenerAdaptExtKt$toKNListener$12(C86882al alVar, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchCategoryEffectListener;
    }

    public final void onFail(CategoryPageModel categoryPageModel, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
