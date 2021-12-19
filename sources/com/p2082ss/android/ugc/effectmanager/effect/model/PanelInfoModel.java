package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.EffectPanelModel;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel */
public final class PanelInfoModel extends PanelInfoModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel;

    static {
        Covode.recordClassIndex(95590);
    }

    public PanelInfoModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final CategoryEffectModel getCategoryEffectModel() {
        return super.getCategoryEffectModel();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final List<EffectCategoryModel> getCategoryList() {
        return super.getCategoryList();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final String getRecID() {
        return super.getRecID();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final CategoryEffectModel getCategory_effects() {
        CategoryEffectModel category_effects;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (category_effects = kPanelModel2.getCategory_effects()) == null) {
            return super.getCategory_effects();
        }
        return category_effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final List<EffectCategoryModel> getCategory_list() {
        List<EffectCategoryModel> category_list;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (category_list = kPanelModel2.getCategory_list()) == null) {
            return super.getCategory_list();
        }
        return category_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final String getFront_effect_id() {
        String front_effect_id;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (front_effect_id = kPanelModel2.getFront_effect_id()) == null) {
            return super.getFront_effect_id();
        }
        return front_effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final String getRear_effect_id() {
        String rear_effect_id;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (rear_effect_id = kPanelModel2.getRear_effect_id()) == null) {
            return super.getRear_effect_id();
        }
        return rear_effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (url_prefix = kPanelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final String getVersion() {
        String version;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (version = kPanelModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final void setCategoryEffectModel(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffectModel(categoryEffectModel);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final void setPanel(EffectPanelModel effectPanelModel) {
        super.setPanel(effectPanelModel);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final void setCategoryList(List<EffectCategoryModel> list) {
        C89219l.m154719c(list, "");
        super.setCategoryList(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setFront_effect_id(String str) {
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setRear_effect_id(String str) {
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public final void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        super.setUrlPrefix(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setCategory_list(List<? extends EffectCategoryModel> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.PanelInfoModel
    public final void setVersion(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    public PanelInfoModel(com.p2082ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel) {
        super(panelInfoModel);
        this.kPanelModel = panelInfoModel;
        com.p2082ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            CategoryEffectModel category_effects = kPanelModel2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            List<EffectCategoryModel> category_list = kPanelModel2.getCategory_list();
            if (category_list != null) {
                super.setCategory_list(category_list);
            }
            EffectPanelModel effect_panel = kPanelModel2.getEffect_panel();
            if (effect_panel != null) {
                super.setEffect_panel(effect_panel);
            }
            PanelInfoModel.Extra extra = kPanelModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            String front_effect_id = kPanelModel2.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            String rear_effect_id = kPanelModel2.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kPanelModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kPanelModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoModel(com.p2082ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
