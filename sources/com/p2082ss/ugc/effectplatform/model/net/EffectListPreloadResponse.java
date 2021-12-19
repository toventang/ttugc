package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.EffectListPreloadResponse */
public final class EffectListPreloadResponse extends AbstractC86845h<EffectListPreloadResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private final List<String> preloading_effect_id_list;
    private int status_code;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102576);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final EffectListPreloadResponse getResponseData() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPreloading_effect_id_list() {
        return this.preloading_effect_id_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final boolean checkValue() {
        if (!this.data.isEmpty()) {
            return true;
        }
        return false;
    }

    public final List<Effect> getPreloadEffectList() {
        ArrayList arrayList = new ArrayList();
        List<? extends Effect> list = this.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.collection = list;
    }

    public final void setData(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.data = list;
    }

    public final void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public EffectListPreloadResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, List<? extends Effect> list4, List<String> list5, int i, String str) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        C89219l.m154719c(list4, "");
        C89219l.m154719c(list5, "");
        this.preloading_effect_id_list = list;
        this.data = list2;
        this.collection = list3;
        this.bind_effects = list4;
        this.url_prefix = list5;
        this.status_code = i;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListPreloadResponse(List list, List list2, List list3, List list4, List list5, int i, String str, int i2, C89214g gVar) {
        this(list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? new ArrayList() : list4, (i2 & 16) != 0 ? new ArrayList() : list5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str);
    }
}
