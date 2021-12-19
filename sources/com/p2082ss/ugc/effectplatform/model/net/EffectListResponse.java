package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.EffectListResponse */
public class EffectListResponse extends AbstractC86845h<List<? extends Effect>> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private List<? extends Effect> data;
    private String message;
    private int status_code;
    private List<String> url_prefix;

    static {
        Covode.recordClassIndex(102577);
    }

    public EffectListResponse() {
        this(null, null, null, 0, null, null, 63, null);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public int getStatusCode() {
        return getStatus_code();
    }

    /* Return type fixed from 'java.util.List<com.ss.ugc.effectplatform.model.Effect>' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public List<? extends Effect> getResponseData() {
        return getEffect_list();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setBind_effects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.collection = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        this.data = list;
    }

    public void setUrl_prefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_prefix = list;
    }

    public EffectListResponse(List<String> list, List<? extends Effect> list2, List<? extends Effect> list3, int i, String str, List<? extends Effect> list4) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        C89219l.m154719c(list4, "");
        this.url_prefix = list;
        this.bind_effects = list2;
        this.collection = list3;
        this.status_code = i;
        this.message = str;
        this.data = list4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponse(List list, List list2, List list3, int i, String str, List list4, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? new ArrayList() : list4);
    }
}
