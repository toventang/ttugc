package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.EffectPanelModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel */
public final class EffectChannelModel extends EffectChannelModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel;

    static {
        Covode.recordClassIndex(95583);
    }

    public EffectChannelModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final List<EffectCategoryModel> getCategory() {
        return super.getCategory();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final String getFront_effect_id() {
        String front_effect_id;
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (front_effect_id = kChannelModel2.getFront_effect_id()) == null) {
            return super.getFront_effect_id();
        }
        return front_effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final String getRear_effect_id() {
        String rear_effect_id;
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (rear_effect_id = kChannelModel2.getRear_effect_id()) == null) {
            return super.getRear_effect_id();
        }
        return rear_effect_id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (url_prefix = kChannelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final String getVersion() {
        String version;
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (version = kChannelModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final void setCategory(List<EffectCategoryModel> list) {
        C89219l.m154719c(list, "");
        super.setCategory(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final void setCollection(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setCollection(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final void setEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final void setFront_effect_id(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final void setPanel(EffectPanelModel effectPanelModel) {
        C89219l.m154719c(effectPanelModel, "");
        super.setPanel(effectPanelModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final void setRear_effect_id(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public final void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        super.setUrlPrefix(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final void setVersion(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectChannelModel
    public final void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelModel(com.p2082ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel) {
        super(effectChannelModel);
        this.kChannelModel = effectChannelModel;
        com.p2082ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            List<EffectCategoryModel> category_list = kChannelModel2.getCategory_list();
            if (category_list != null) {
                super.setCategory_list(category_list);
            }
            List<Effect> collection_list = kChannelModel2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            List<Effect> effect_list = kChannelModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String front_effect_id = kChannelModel2.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            EffectPanelModel panel_model = kChannelModel2.getPanel_model();
            if (panel_model != null) {
                super.setPanel_model(panel_model);
            }
            String rear_effect_id = kChannelModel2.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kChannelModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelModel(com.p2082ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectChannelModel);
    }
}
