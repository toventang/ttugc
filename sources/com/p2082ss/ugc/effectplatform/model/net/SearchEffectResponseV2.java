package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.ugc.effectplatform.model.net.SearchEffectResponseV2 */
public class SearchEffectResponseV2 extends AbstractC86845h<SearchEffectResponseV2> {
    private SearchEffectModel data;
    private String message;
    private SearchNilInfo search_nil_info;
    private int status_code;

    static {
        Covode.recordClassIndex(102604);
    }

    public SearchEffectResponseV2() {
        this(null, null, 0, null, 15, null);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public SearchEffectResponseV2 getResponseData() {
        return this;
    }

    public final SearchEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public String getResponseMessage() {
        return this.message;
    }

    public final SearchNilInfo getSearch_nil_info() {
        return this.search_nil_info;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(SearchEffectModel searchEffectModel) {
        this.data = searchEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setSearch_nil_info(SearchNilInfo searchNilInfo) {
        this.search_nil_info = searchNilInfo;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i, String str) {
        this.data = searchEffectModel;
        this.search_nil_info = searchNilInfo;
        this.status_code = i;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponseV2(SearchEffectModel searchEffectModel, SearchNilInfo searchNilInfo, int i, String str, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : searchEffectModel, (i2 & 2) != 0 ? null : searchNilInfo, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str);
    }
}
