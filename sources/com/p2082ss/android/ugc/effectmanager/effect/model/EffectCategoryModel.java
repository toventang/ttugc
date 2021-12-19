package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel */
public final class EffectCategoryModel extends EffectCategoryModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel;

    static {
        Covode.recordClassIndex(95579);
    }

    public EffectCategoryModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.EffectCategoryModel getKCategoryModel() {
        return this.kCategoryModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final boolean is_default() {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            return kCategoryModel2.is_default();
        }
        return super.is_default();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final List<String> getEffects() {
        List<String> effects;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (effects = kCategoryModel2.getEffects()) == null) {
            return super.getEffects();
        }
        return effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getExtra() {
        String extra;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (extra = kCategoryModel2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final UrlModel getIcon() {
        UrlModel icon;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon = kCategoryModel2.getIcon()) == null) {
            return super.getIcon();
        }
        return icon;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final UrlModel getIcon_selected() {
        UrlModel icon_selected;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (icon_selected = kCategoryModel2.getIcon_selected()) == null) {
            return super.getIcon_selected();
        }
        return icon_selected;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getId() {
        String id;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (id = kCategoryModel2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getKey() {
        String key;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (key = kCategoryModel2.getKey()) == null) {
            return super.getKey();
        }
        return key;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getName() {
        String name;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (name = kCategoryModel2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final List<String> getTags() {
        List<String> tags;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags = kCategoryModel2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final String getTags_updated_at() {
        String tags_updated_at;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 == null || (tags_updated_at = kCategoryModel2.getTags_updated_at()) == null) {
            return super.getTags_updated_at();
        }
        return tags_updated_at;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setIsDefault(boolean z) {
        super.setIsDefault(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryModelTemplate
    public final void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setExtra(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setIcon(UrlModel urlModel) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon(urlModel);
        }
        super.setIcon(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setIcon_selected(UrlModel urlModel) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setIcon_selected(urlModel);
        }
        super.setIcon_selected(urlModel);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setTags_updated_at(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags_updated_at(str);
        }
        super.setTags_updated_at(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void set_default(boolean z) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setEffects(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setEffects(list);
        }
        super.setEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setId(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setKey(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setKey(str);
        }
        super.setKey(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setName(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryModel
    public final void setTags(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            kCategoryModel2.setTags(list);
        }
        super.setTags(list);
    }

    public EffectCategoryModel(com.p2082ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel) {
        super(effectCategoryModel);
        this.kCategoryModel = effectCategoryModel;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryModel kCategoryModel2 = getKCategoryModel();
        if (kCategoryModel2 != null) {
            List<String> effects = kCategoryModel2.getEffects();
            if (effects != null) {
                super.setEffects(effects);
            }
            String extra = kCategoryModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            UrlModel icon = kCategoryModel2.getIcon();
            if (icon != null) {
                super.setIcon(icon);
            }
            UrlModel icon_selected = kCategoryModel2.getIcon_selected();
            if (icon_selected != null) {
                super.setIcon_selected(icon_selected);
            }
            String id = kCategoryModel2.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryModel2.is_default());
            String key = kCategoryModel2.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryModel2.getName();
            if (name != null) {
                super.setName(name);
            }
            List<String> tags = kCategoryModel2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_updated_at = kCategoryModel2.getTags_updated_at();
            if (tags_updated_at != null) {
                super.setTags_updated_at(tags_updated_at);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryModel(com.p2082ss.ugc.effectplatform.model.EffectCategoryModel effectCategoryModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectCategoryModel);
    }
}
