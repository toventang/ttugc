package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$13 */
public final class ListenerAdaptExtKt$toKNListener$13 implements AbstractC86796e<PanelInfoModel> {
    final /* synthetic */ IFetchPanelInfoListener $oldListener;
    final /* synthetic */ C86882al $taskManager;

    static {
        Covode.recordClassIndex(95743);
    }

    public final void onSuccess(PanelInfoModel panelInfoModel) {
        C89219l.m154719c(panelInfoModel, "");
        if (DataPreProcess.enable) {
            ListenerAdaptExtKt.preProcess(panelInfoModel, this.$taskManager, new ListenerAdaptExtKt$toKNListener$13$onSuccess$1(this));
        } else {
            this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel(panelInfoModel));
        }
    }

    ListenerAdaptExtKt$toKNListener$13(C86882al alVar, IFetchPanelInfoListener iFetchPanelInfoListener) {
        this.$taskManager = alVar;
        this.$oldListener = iFetchPanelInfoListener;
    }

    public final void onFail(PanelInfoModel panelInfoModel, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
