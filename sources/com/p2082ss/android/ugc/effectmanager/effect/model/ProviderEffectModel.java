package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel */
public final class ProviderEffectModel extends ProviderEffectModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect;

    static {
        Covode.recordClassIndex(95594);
    }

    public ProviderEffectModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final String getSearchTips() {
        return super.getSearchTips();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final List<ProviderEffect> getStickerList() {
        return super.getStickerList();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final int getCursor() {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final boolean getHas_more() {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getExtra() {
        String extra;
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (extra = kProviderEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getSearch_tips() {
        String search_tips;
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (search_tips = kProviderEffect2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final List<ProviderEffect> getSticker_list() {
        List<ProviderEffect> sticker_list;
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (sticker_list = kProviderEffect2.getSticker_list()) == null) {
            return super.getSticker_list();
        }
        return sticker_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final String getSubtitle() {
        String subtitle;
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (subtitle = kProviderEffect2.getSubtitle()) == null) {
            return super.getSubtitle();
        }
        return subtitle;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setSearchTips(String str) {
        super.setSearchTips(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setCursor(int i) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setExtra(String str) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setHas_more(boolean z) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSearch_tips(String str) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public final void setStickerList(List<ProviderEffect> list) {
        C89219l.m154719c(list, "");
        super.setStickerList(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSubtitle(String str) {
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSubtitle(str);
        }
        super.setSubtitle(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.ProviderEffectModel
    public final void setSticker_list(List<? extends ProviderEffect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_list(list);
        }
        super.setSticker_list(list);
    }

    public ProviderEffectModel(com.p2082ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel) {
        super(providerEffectModel);
        this.kProviderEffect = providerEffectModel;
        com.p2082ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            super.setCursor(kProviderEffect2.getCursor());
            String extra = kProviderEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            super.setHas_more(kProviderEffect2.getHas_more());
            String search_tips = kProviderEffect2.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            List<ProviderEffect> sticker_list = kProviderEffect2.getSticker_list();
            if (sticker_list != null) {
                super.setSticker_list(sticker_list);
            }
            String subtitle = kProviderEffect2.getSubtitle();
            if (subtitle != null) {
                super.setSubtitle(subtitle);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModel(com.p2082ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : providerEffectModel);
    }
}
