package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.ProviderEffectListResponse */
public final class ProviderEffectListResponse extends AbstractC86845h<ProviderEffectModel> {
    private ProviderEffectModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102594);
    }

    public ProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ProviderEffectListResponse copy$default(ProviderEffectListResponse providerEffectListResponse, ProviderEffectModel providerEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            providerEffectModel = providerEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = providerEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = providerEffectListResponse.status_code;
        }
        return providerEffectListResponse.copy(providerEffectModel, str, i);
    }

    public final ProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ProviderEffectListResponse copy(ProviderEffectModel providerEffectModel, String str, int i) {
        return new ProviderEffectListResponse(providerEffectModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProviderEffectListResponse)) {
            return false;
        }
        ProviderEffectListResponse providerEffectListResponse = (ProviderEffectListResponse) obj;
        return C89219l.m154714a(this.data, providerEffectListResponse.data) && C89219l.m154714a(this.message, providerEffectListResponse.message) && this.status_code == providerEffectListResponse.status_code;
    }

    public final int hashCode() {
        ProviderEffectModel providerEffectModel = this.data;
        int i = 0;
        int hashCode = (providerEffectModel != null ? providerEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "ProviderEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final ProviderEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final ProviderEffectModel getResponseData() {
        return this.data;
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

    public final void setData(ProviderEffectModel providerEffectModel) {
        this.data = providerEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i) {
        this.data = providerEffectModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectListResponse(ProviderEffectModel providerEffectModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : providerEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
