package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse */
public final class EffectListResponse extends EffectListResponseTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList;

    static {
        Covode.recordClassIndex(95605);
    }

    public EffectListResponse() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final com.p2082ss.ugc.effectplatform.model.net.EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final List<Effect> getData() {
        return super.getData();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final int getStatus_code() {
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            return kEffectList2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final List<com.p2082ss.ugc.effectplatform.model.Effect> getBind_effects() {
        List<com.p2082ss.ugc.effectplatform.model.Effect> bind_effects;
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (bind_effects = kEffectList2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final String getMessage() {
        String message;
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (message = kEffectList2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (url_prefix = kEffectList2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final void setBindEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setBindEffects(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final void setCollection(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setCollection(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final void setData(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setData(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final void setMessage(String str) {
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final void setStatus_code(int i) {
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate
    public final void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        super.setUrlPrefix(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final void setBind_effects(List<? extends com.p2082ss.ugc.effectplatform.model.Effect> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.EffectListResponse
    public final void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectListResponse(com.p2082ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse) {
        super(effectListResponse);
        this.kEffectList = effectListResponse;
        com.p2082ss.ugc.effectplatform.model.net.EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            List<com.p2082ss.ugc.effectplatform.model.Effect> bind_effects = kEffectList2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<com.p2082ss.ugc.effectplatform.model.Effect> collection_list = kEffectList2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            List<com.p2082ss.ugc.effectplatform.model.Effect> effect_list = kEffectList2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String message = kEffectList2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kEffectList2.getStatus_code());
            List<String> url_prefix = kEffectList2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponse(com.p2082ss.ugc.effectplatform.model.net.EffectListResponse effectListResponse, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectListResponse);
    }
}
