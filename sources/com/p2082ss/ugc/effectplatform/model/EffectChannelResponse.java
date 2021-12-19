package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.EffectChannelResponse */
public class EffectChannelResponse {
    private List<? extends Effect> all_category_effects;
    private List<? extends EffectCategoryResponse> category_responses;
    private List<? extends Effect> collection_list;
    private Effect front_effect;
    private String panel;
    private EffectPanelModel panel_model;
    private Effect rear_effect;
    private List<String> url_prefix;
    private String version;

    static {
        Covode.recordClassIndex(102536);
    }

    public EffectChannelResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getAll_category_effects() {
        return this.all_category_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryResponse>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> */
    public List<EffectCategoryResponse> getCategory_responses() {
        return this.category_responses;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getCollection_list() {
        return this.collection_list;
    }

    public Effect getFront_effect() {
        return this.front_effect;
    }

    public String getPanel() {
        return this.panel;
    }

    public EffectPanelModel getPanel_model() {
        return this.panel_model;
    }

    public Effect getRear_effect() {
        return this.rear_effect;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setFront_effect(Effect effect) {
        this.front_effect = effect;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public void setRear_effect(Effect effect) {
        this.rear_effect = effect;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setAll_category_effects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.all_category_effects = list;
    }

    public void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        C89219l.m154719c(list, "");
        this.category_responses = list;
    }

    public void setCollection_list(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.collection_list = list;
    }

    public void setPanel_model(EffectPanelModel effectPanelModel) {
        C89219l.m154719c(effectPanelModel, "");
        this.panel_model = effectPanelModel;
    }

    public void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List<? extends Effect> list, List<? extends EffectCategoryResponse> list2, EffectPanelModel effectPanelModel, List<? extends Effect> list3, List<String> list4) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(effectPanelModel, "");
        C89219l.m154719c(list3, "");
        C89219l.m154719c(list4, "");
        this.panel = str;
        this.version = str2;
        this.front_effect = effect;
        this.rear_effect = effect2;
        this.all_category_effects = list;
        this.category_responses = list2;
        this.panel_model = effectPanelModel;
        this.collection_list = list3;
        this.url_prefix = list4;
        getPanel_model().setId(getPanel());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelResponse(String str, String str2, Effect effect, Effect effect2, List list, List list2, EffectPanelModel effectPanelModel, List list3, List list4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : effect, (i & 8) == 0 ? effect2 : null, (i & 16) != 0 ? new ArrayList() : list, (i & 32) != 0 ? new ArrayList() : list2, (i & 64) != 0 ? new EffectPanelModel(null, null, null, null, null, null, 63, null) : effectPanelModel, (i & 128) != 0 ? new ArrayList() : list3, (i & 256) != 0 ? new ArrayList() : list4);
    }
}
