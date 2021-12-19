package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$preProcess$2 */
public final class ListenerAdaptExtKt$preProcess$2 extends AbstractC89220m implements AbstractC89172b<CategoryPageModel, com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel> {
    public static final ListenerAdaptExtKt$preProcess$2 INSTANCE = new ListenerAdaptExtKt$preProcess$2();

    static {
        Covode.recordClassIndex(95736);
    }

    ListenerAdaptExtKt$preProcess$2() {
        super(1);
    }

    public final com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel invoke(CategoryPageModel categoryPageModel) {
        List<Effect> effects;
        List<Effect> collectEffects;
        List<Effect> bindEffects;
        C89219l.m154719c(categoryPageModel, "");
        com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel categoryPageModel2 = new com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel(categoryPageModel);
        CategoryEffectModel categoryEffects = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects == null || (bindEffects = categoryEffects.getBindEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(bindEffects);
        }
        CategoryEffectModel categoryEffects2 = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects2 == null || (collectEffects = categoryEffects2.getCollectEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(collectEffects);
        }
        CategoryEffectModel categoryEffects3 = categoryPageModel2.getCategoryEffects();
        if (!(categoryEffects3 == null || (effects = categoryEffects3.getEffects()) == null)) {
            ListenerAdaptExtKt.preProcess(effects);
        }
        return categoryPageModel2;
    }
}
