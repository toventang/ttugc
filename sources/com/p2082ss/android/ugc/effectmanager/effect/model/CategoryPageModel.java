package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel */
public final class CategoryPageModel extends CategoryPageModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel;

    static {
        Covode.recordClassIndex(95571);
    }

    public CategoryPageModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final CategoryEffectModel getCategoryEffects() {
        return super.getCategoryEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final String getRecId() {
        return super.getRecId();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CategoryPageModel
    public final CategoryEffectModel getCategory_effects() {
        CategoryEffectModel category_effects;
        com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (category_effects = kCategoryPageModel2.getCategory_effects()) == null) {
            return super.getCategory_effects();
        }
        return category_effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CategoryPageModel
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (url_prefix = kCategoryPageModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public final void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffects(categoryEffectModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CategoryPageModel
    public final void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.CategoryPageModel
    public final void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public CategoryPageModel(com.p2082ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel) {
        super(categoryPageModel);
        this.kCategoryPageModel = categoryPageModel;
        com.p2082ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            CategoryEffectModel category_effects = kCategoryPageModel2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            CategoryPageModel.Extra extra = kCategoryPageModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            List<String> url_prefix = kCategoryPageModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(com.p2082ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
