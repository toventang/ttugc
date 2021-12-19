package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.SearchEffectResponse */
public final class SearchEffectResponse extends SearchEffectResponseTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect;

    static {
        Covode.recordClassIndex(95602);
    }

    public SearchEffectResponse() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final int getCursor() {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final boolean getHas_more() {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final int getStatus_code() {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final List<Effect> getBind_effects() {
        List<Effect> bind_effects;
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (bind_effects = kSearchEffect2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final String getMessage() {
        String message;
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (message = kSearchEffect2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final void setBindEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setBindEffects(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final void setCollection(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setCollection(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final void setCursor(int i) {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate
    public final void setEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final void setHas_more(boolean z) {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final void setMessage(String str) {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final void setStatus_code(int i) {
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse
    public final void setBind_effects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public SearchEffectResponse(com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse) {
        super(searchEffectResponse);
        this.kSearchEffect = searchEffectResponse;
        com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            List<Effect> bind_effects = kSearchEffect2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<Effect> collection_list = kSearchEffect2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            super.setCursor(kSearchEffect2.getCursor());
            List<Effect> effect_list = kSearchEffect2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            super.setHas_more(kSearchEffect2.getHas_more());
            String message = kSearchEffect2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kSearchEffect2.getStatus_code());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponse(com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse searchEffectResponse, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : searchEffectResponse);
    }
}
