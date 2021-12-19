package com.p2082ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse */
public final class EffectCategoryResponse extends EffectCategoryResponseTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<EffectCategoryResponse> CREATOR = new EffectCategoryResponse$Companion$CREATOR$1();
    public static final Companion Companion = new Companion(null);
    private final transient com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse;

    public EffectCategoryResponse() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95581);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final List<Effect> getCollectionEffect() {
        return super.getCollectionEffect();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final String getTagsUpdateTime() {
        return super.getTagsUpdateTime();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final List<Effect> getTotalEffects() {
        return super.getTotalEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final boolean isDefault() {
        return super.isDefault();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final boolean is_default() {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            return kCategoryResponse2.is_default();
        }
        return super.is_default();
    }

    static {
        Covode.recordClassIndex(95580);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final List<Effect> getCollection_effect() {
        List<Effect> collection_effect;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (collection_effect = kCategoryResponse2.getCollection_effect()) == null) {
            return super.getCollection_effect();
        }
        return collection_effect;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getExtra() {
        String extra;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (extra = kCategoryResponse2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final Effect getFront_effect() {
        Effect front_effect;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (front_effect = kCategoryResponse2.getFront_effect()) == null) {
            return super.getFront_effect();
        }
        return front_effect;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getIcon_normal_url() {
        String icon_normal_url;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (icon_normal_url = kCategoryResponse2.getIcon_normal_url()) == null) {
            return super.getIcon_normal_url();
        }
        return icon_normal_url;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getIcon_selected_url() {
        String icon_selected_url;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (icon_selected_url = kCategoryResponse2.getIcon_selected_url()) == null) {
            return super.getIcon_selected_url();
        }
        return icon_selected_url;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getId() {
        String id;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (id = kCategoryResponse2.getId()) == null) {
            return super.getId();
        }
        return id;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getKey() {
        String key;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (key = kCategoryResponse2.getKey()) == null) {
            return super.getKey();
        }
        return key;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getName() {
        String name;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (name = kCategoryResponse2.getName()) == null) {
            return super.getName();
        }
        return name;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final Effect getRear_effect() {
        Effect rear_effect;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (rear_effect = kCategoryResponse2.getRear_effect()) == null) {
            return super.getRear_effect();
        }
        return rear_effect;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final List<String> getTags() {
        List<String> tags;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags = kCategoryResponse2.getTags()) == null) {
            return super.getTags();
        }
        return tags;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final String getTags_update_time() {
        String tags_update_time;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags_update_time = kCategoryResponse2.getTags_update_time()) == null) {
            return super.getTags_update_time();
        }
        return tags_update_time;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final List<Effect> getTotal_effects() {
        List<Effect> total_effects;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (total_effects = kCategoryResponse2.getTotal_effects()) == null) {
            return super.getTotal_effects();
        }
        return total_effects;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setDefault(boolean z) {
        super.setDefault(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setTagsUpdateTime(String str) {
        super.setTagsUpdateTime(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setCollectionEffect(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setCollectionEffect(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setExtra(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setFront_effect(Effect effect) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setIcon_normal_url(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setIcon_normal_url(str);
        }
        super.setIcon_normal_url(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setIcon_selected_url(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setIcon_selected_url(str);
        }
        super.setIcon_selected_url(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setRear_effect(Effect effect) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setTags_update_time(String str) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate
    public final void setTotalEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setTotalEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void set_default(boolean z) {
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.set_default(z);
        }
        super.set_default(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setCollection_effect(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setCollection_effect(list);
        }
        super.setCollection_effect(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setId(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setId(str);
        }
        super.setId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setKey(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setKey(str);
        }
        super.setKey(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setName(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setName(str);
        }
        super.setName(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setTags(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags(list);
        }
        super.setTags(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void setTotal_effects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTotal_effects(list);
        }
        super.setTotal_effects(list);
    }

    public EffectCategoryResponse(com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse) {
        super(effectCategoryResponse);
        this.kCategoryResponse = effectCategoryResponse;
        com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            List<Effect> collection_effect = kCategoryResponse2.getCollection_effect();
            if (collection_effect != null) {
                super.setCollection_effect(collection_effect);
            }
            String extra = kCategoryResponse2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            Effect front_effect = kCategoryResponse2.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String icon_normal_url = kCategoryResponse2.getIcon_normal_url();
            if (icon_normal_url != null) {
                super.setIcon_normal_url(icon_normal_url);
            }
            String icon_selected_url = kCategoryResponse2.getIcon_selected_url();
            if (icon_selected_url != null) {
                super.setIcon_selected_url(icon_selected_url);
            }
            String id = kCategoryResponse2.getId();
            if (id != null) {
                super.setId(id);
            }
            super.set_default(kCategoryResponse2.is_default());
            String key = kCategoryResponse2.getKey();
            if (key != null) {
                super.setKey(key);
            }
            String name = kCategoryResponse2.getName();
            if (name != null) {
                super.setName(name);
            }
            Effect rear_effect = kCategoryResponse2.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> tags = kCategoryResponse2.getTags();
            if (tags != null) {
                super.setTags(tags);
            }
            String tags_update_time = kCategoryResponse2.getTags_update_time();
            if (tags_update_time != null) {
                super.setTags_update_time(tags_update_time);
            }
            List<Effect> total_effects = kCategoryResponse2.getTotal_effects();
            if (total_effects != null) {
                super.setTotal_effects(total_effects);
            }
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse
    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        if (getKCategoryResponse() != null) {
            com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
            if (kCategoryResponse2 != null) {
                kCategoryResponse2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryResponse(com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse effectCategoryResponse, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectCategoryResponse);
    }
}
