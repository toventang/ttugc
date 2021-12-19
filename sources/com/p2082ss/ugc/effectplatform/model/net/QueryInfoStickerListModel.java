package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.QueryInfoStickerListModel */
public final class QueryInfoStickerListModel {
    private List<? extends EffectCategoryModel> category;
    private List<InfoStickerEffect> collection;
    private List<InfoStickerEffect> effects;
    private String front_effect_id;
    private PanelDesc panel;
    private String rear_effect_id;
    private List<String> url_prefix;
    private String version;

    static {
        Covode.recordClassIndex(102595);
    }

    public QueryInfoStickerListModel() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.QueryInfoStickerListModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryInfoStickerListModel copy$default(QueryInfoStickerListModel queryInfoStickerListModel, String str, PanelDesc panelDesc, List list, List list2, List list3, String str2, String str3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryInfoStickerListModel.version;
        }
        if ((i & 2) != 0) {
            panelDesc = queryInfoStickerListModel.panel;
        }
        if ((i & 4) != 0) {
            list = queryInfoStickerListModel.effects;
        }
        if ((i & 8) != 0) {
            list2 = queryInfoStickerListModel.collection;
        }
        if ((i & 16) != 0) {
            list3 = queryInfoStickerListModel.category;
        }
        if ((i & 32) != 0) {
            str2 = queryInfoStickerListModel.front_effect_id;
        }
        if ((i & 64) != 0) {
            str3 = queryInfoStickerListModel.rear_effect_id;
        }
        if ((i & 128) != 0) {
            list4 = queryInfoStickerListModel.url_prefix;
        }
        return queryInfoStickerListModel.copy(str, panelDesc, list, list2, list3, str2, str3, list4);
    }

    public final String component1() {
        return this.version;
    }

    public final PanelDesc component2() {
        return this.panel;
    }

    public final List<InfoStickerEffect> component3() {
        return this.effects;
    }

    public final List<InfoStickerEffect> component4() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> component5() {
        return this.category;
    }

    public final String component6() {
        return this.front_effect_id;
    }

    public final String component7() {
        return this.rear_effect_id;
    }

    public final List<String> component8() {
        return this.url_prefix;
    }

    public final QueryInfoStickerListModel copy(String str, PanelDesc panelDesc, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str2, String str3, List<String> list4) {
        return new QueryInfoStickerListModel(str, panelDesc, list, list2, list3, str2, str3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerListModel)) {
            return false;
        }
        QueryInfoStickerListModel queryInfoStickerListModel = (QueryInfoStickerListModel) obj;
        return C89219l.m154714a(this.version, queryInfoStickerListModel.version) && C89219l.m154714a(this.panel, queryInfoStickerListModel.panel) && C89219l.m154714a(this.effects, queryInfoStickerListModel.effects) && C89219l.m154714a(this.collection, queryInfoStickerListModel.collection) && C89219l.m154714a(this.category, queryInfoStickerListModel.category) && C89219l.m154714a(this.front_effect_id, queryInfoStickerListModel.front_effect_id) && C89219l.m154714a(this.rear_effect_id, queryInfoStickerListModel.rear_effect_id) && C89219l.m154714a(this.url_prefix, queryInfoStickerListModel.url_prefix);
    }

    public final int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        PanelDesc panelDesc = this.panel;
        int hashCode2 = (hashCode + (panelDesc != null ? panelDesc.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list = this.effects;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        List<InfoStickerEffect> list2 = this.collection;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<? extends EffectCategoryModel> list3 = this.category;
        int hashCode5 = (hashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str2 = this.front_effect_id;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.rear_effect_id;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<String> list4 = this.url_prefix;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "QueryInfoStickerListModel(version=" + this.version + ", panel=" + this.panel + ", effects=" + this.effects + ", collection=" + this.collection + ", category=" + this.category + ", front_effect_id=" + this.front_effect_id + ", rear_effect_id=" + this.rear_effect_id + ", url_prefix=" + this.url_prefix + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.EffectCategoryModel>, java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    public final List<EffectCategoryModel> getCategory() {
        return this.category;
    }

    public final List<InfoStickerEffect> getCollection() {
        return this.collection;
    }

    public final List<InfoStickerEffect> getEffects() {
        return this.effects;
    }

    public final String getFront_effect_id() {
        return this.front_effect_id;
    }

    public final PanelDesc getPanel() {
        return this.panel;
    }

    public final String getRear_effect_id() {
        return this.rear_effect_id;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setCategory(List<? extends EffectCategoryModel> list) {
        this.category = list;
    }

    public final void setCollection(List<InfoStickerEffect> list) {
        this.collection = list;
    }

    public final void setEffects(List<InfoStickerEffect> list) {
        this.effects = list;
    }

    public final void setFront_effect_id(String str) {
        this.front_effect_id = str;
    }

    public final void setPanel(PanelDesc panelDesc) {
        this.panel = panelDesc;
    }

    public final void setRear_effect_id(String str) {
        this.rear_effect_id = str;
    }

    public final void setUrl_prefix(List<String> list) {
        this.url_prefix = list;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public QueryInfoStickerListModel(String str, PanelDesc panelDesc, List<InfoStickerEffect> list, List<InfoStickerEffect> list2, List<? extends EffectCategoryModel> list3, String str2, String str3, List<String> list4) {
        this.version = str;
        this.panel = panelDesc;
        this.effects = list;
        this.collection = list2;
        this.category = list3;
        this.front_effect_id = str2;
        this.rear_effect_id = str3;
        this.url_prefix = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryInfoStickerListModel(String str, PanelDesc panelDesc, List list, List list2, List list3, String str2, String str3, List list4, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : panelDesc, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? list4 : null);
    }
}
