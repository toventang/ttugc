package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$13$onSuccess$1 */
public final class ListenerAdaptExtKt$toKNListener$13$onSuccess$1 extends AbstractC89220m implements AbstractC89172b<PanelInfoModel, C89391z> {
    final /* synthetic */ ListenerAdaptExtKt$toKNListener$13 this$0;

    static {
        Covode.recordClassIndex(95744);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListenerAdaptExtKt$toKNListener$13$onSuccess$1(ListenerAdaptExtKt$toKNListener$13 listenerAdaptExtKt$toKNListener$13) {
        super(1);
        this.this$0 = listenerAdaptExtKt$toKNListener$13;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final /* bridge */ /* synthetic */ C89391z invoke(PanelInfoModel panelInfoModel) {
        invoke(panelInfoModel);
        return C89391z.f203057a;
    }

    public final void invoke(PanelInfoModel panelInfoModel) {
        C89219l.m154719c(panelInfoModel, "");
        this.this$0.$oldListener.onSuccess(panelInfoModel);
    }
}
