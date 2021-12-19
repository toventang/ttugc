package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.PanelInfoModel */
public class PanelInfoModel {
    private CategoryEffectModel category_effects;
    private List<? extends EffectCategoryModel> category_list;
    private Extra extra;
    private String front_effect_id;
    private EffectPanelModel panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    static {
        Covode.recordClassIndex(102540);
    }

    public PanelInfoModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.PanelInfoModel$Extra */
    public static final class Extra {
        private String rec_id = "";

        static {
            Covode.recordClassIndex(102541);
        }

        public final String getRec_id() {
            return this.rec_id;
        }

        public final void setRec_id(String str) {
            C89219l.m154719c(str, "");
            this.rec_id = str;
        }
    }

    public CategoryEffectModel getCategory_effects() {
        return this.category_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public List<EffectCategoryModel> getCategory_list() {
        return this.category_list;
    }

    public final EffectPanelModel getEffect_panel() {
        return this.panel;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public String getFront_effect_id() {
        return this.front_effect_id;
    }

    public String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        this.category_effects = categoryEffectModel;
    }

    public final void setEffect_panel(EffectPanelModel effectPanelModel) {
        this.panel = effectPanelModel;
    }

    public final void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        C89219l.m154719c(list, "");
        this.category_list = list;
    }

    public void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public void setVersion(String str) {
        C89219l.m154719c(str, "");
        this.version = str;
    }

    public PanelInfoModel(String str, List<? extends EffectCategoryModel> list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List<String> list2, Extra extra2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.version = str;
        this.category_list = list;
        this.category_effects = categoryEffectModel;
        this.panel = effectPanelModel;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list2;
        this.extra = extra2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoModel(String str, List list, CategoryEffectModel categoryEffectModel, EffectPanelModel effectPanelModel, String str2, String str3, List list2, Extra extra2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : categoryEffectModel, (i & 8) != 0 ? null : effectPanelModel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? new ArrayList() : list2, (i & 128) == 0 ? extra2 : null);
    }
}
