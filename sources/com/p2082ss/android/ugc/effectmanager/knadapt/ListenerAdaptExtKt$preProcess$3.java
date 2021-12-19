package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$preProcess$3 */
public final class ListenerAdaptExtKt$preProcess$3 extends AbstractC89220m implements AbstractC89172b<PanelInfoModel, com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel> {
    public static final ListenerAdaptExtKt$preProcess$3 INSTANCE = new ListenerAdaptExtKt$preProcess$3();

    static {
        Covode.recordClassIndex(95737);
    }

    ListenerAdaptExtKt$preProcess$3() {
        super(1);
    }

    public final com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel invoke(PanelInfoModel panelInfoModel) {
        List<Effect> bindEffects;
        List<Effect> collectEffects;
        C89219l.m154719c(panelInfoModel, "");
        com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel panelInfoModel2 = new com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel(panelInfoModel);
        CategoryEffectModel categoryEffectModel = panelInfoModel2.getCategoryEffectModel();
        if (!(categoryEffectModel == null || (collectEffects = categoryEffectModel.getCollectEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffectModel2 = panelInfoModel2.getCategoryEffectModel();
        if (!(categoryEffectModel2 == null || (bindEffects = categoryEffectModel2.getBindEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        panelInfoModel2.getCategoryList();
        return panelInfoModel2;
    }
}
