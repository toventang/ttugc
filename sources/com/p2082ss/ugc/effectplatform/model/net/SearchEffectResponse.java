package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.SearchEffectResponse */
public class SearchEffectResponse extends AbstractC86845h<SearchEffectResponse> {
    private List<? extends Effect> bind_effects;
    private List<? extends Effect> collection;
    private int cursor;
    private List<? extends Effect> effects;
    private boolean has_more;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102603);
    }

    public SearchEffectResponse() {
        this(false, 0, null, null, null, 0, null, 127, null);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public SearchEffectResponse getResponseData() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public int getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public boolean checkValue() {
        if (!getEffect_list().isEmpty()) {
            return true;
        }
        return false;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
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
        this.effects = list;
    }

    public SearchEffectResponse(boolean z, int i, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, int i2, String str) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        this.has_more = z;
        this.cursor = i;
        this.effects = list;
        this.collection = list2;
        this.bind_effects = list3;
        this.status_code = i2;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponse(boolean z, int i, List list, List list2, List list3, int i2, String str, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) != 0 ? new ArrayList() : list2, (i3 & 16) != 0 ? new ArrayList() : list3, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str);
    }
}
