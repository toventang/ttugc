package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate */
public class PanelInfoModelTemplate extends PanelInfoModel {
    private CategoryEffectModel categoryEffectModel;
    private List<EffectCategoryModel> categoryList;
    private final transient PanelInfoModel kPanelModel;
    private List<String> urlPrefix;

    static {
        Covode.recordClassIndex(95633);
    }

    public PanelInfoModelTemplate() {
        this(null, 1, null);
    }

    public PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    public String getRecID() {
        PanelInfoModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryEffectModel getCategoryEffectModel() {
        com.p2082ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel2;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (categoryEffectModel2 = kPanelModel2.getCategory_effects()) == null) {
            categoryEffectModel2 = super.getCategory_effects();
        }
        return new CategoryEffectModel(categoryEffectModel2);
    }

    public EffectPanelModel getPanel() {
        com.p2082ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (effectPanelModel = kPanelModel2.getEffect_panel()) == null) {
            effectPanelModel = super.getEffect_panel();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (url_prefix = kPanelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate, com.ss.ugc.effectplatform.model.PanelInfoModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategoryList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.PanelInfoModel r4 = r5.getKPanelModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getCategory_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getCategory_list()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.EffectCategoryModel r1 = (com.p2082ss.ugc.effectplatform.model.EffectCategoryModel) r1
            com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r0 = new com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setCategory_list(r3)
        L_0x0053:
            super.setCategory_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate.getCategoryList():java.util.List");
    }

    public void setCategoryEffectModel(CategoryEffectModel categoryEffectModel2) {
        this.categoryEffectModel = categoryEffectModel2;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_effects(categoryEffectModel2);
        }
        super.setCategory_effects(categoryEffectModel2);
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setEffect_panel(effectPanelModel);
        }
        super.setEffect_panel(effectPanelModel);
    }

    public PanelInfoModelTemplate(PanelInfoModel panelInfoModel) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.kPanelModel = panelInfoModel;
        this.categoryList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setCategoryList(List<EffectCategoryModel> list) {
        C89219l.m154719c(list, "");
        this.categoryList = list;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    public void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.urlPrefix = list;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoModelTemplate(PanelInfoModel panelInfoModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
