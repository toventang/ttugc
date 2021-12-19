package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate */
public class CategoryPageModelTemplate extends CategoryPageModel {
    private CategoryEffectModel categoryEffects;
    private final transient CategoryPageModel kCategoryPageModel;

    static {
        Covode.recordClassIndex(95616);
    }

    public CategoryPageModelTemplate() {
        this(null, 1, null);
    }

    public CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    public String getRecId() {
        CategoryPageModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryEffectModel getCategoryEffects() {
        com.p2082ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (categoryEffectModel = kCategoryPageModel2.getCategory_effects()) == null) {
            categoryEffectModel = super.getCategory_effects();
        }
        return new CategoryEffectModel(categoryEffectModel);
    }

    public CategoryPageModelTemplate(CategoryPageModel categoryPageModel) {
        super(null, null, null, 7, null);
        this.kCategoryPageModel = categoryPageModel;
    }

    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.categoryEffects = categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModelTemplate(CategoryPageModel categoryPageModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
