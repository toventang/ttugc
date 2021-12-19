package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.GifProviderEffectModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse */
public final class GifProviderEffectListResponse extends AbstractC86845h<GifProviderEffectModel> {
    private GifProviderEffectModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102585);
    }

    public GifProviderEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ GifProviderEffectListResponse copy$default(GifProviderEffectListResponse gifProviderEffectListResponse, GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gifProviderEffectModel = gifProviderEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = gifProviderEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = gifProviderEffectListResponse.status_code;
        }
        return gifProviderEffectListResponse.copy(gifProviderEffectModel, str, i);
    }

    public final GifProviderEffectModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final GifProviderEffectListResponse copy(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        return new GifProviderEffectListResponse(gifProviderEffectModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifProviderEffectListResponse)) {
            return false;
        }
        GifProviderEffectListResponse gifProviderEffectListResponse = (GifProviderEffectListResponse) obj;
        return C89219l.m154714a(this.data, gifProviderEffectListResponse.data) && C89219l.m154714a(this.message, gifProviderEffectListResponse.message) && this.status_code == gifProviderEffectListResponse.status_code;
    }

    public final int hashCode() {
        GifProviderEffectModel gifProviderEffectModel = this.data;
        int i = 0;
        int hashCode = (gifProviderEffectModel != null ? gifProviderEffectModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "GifProviderEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final GifProviderEffectModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final GifProviderEffectModel getResponseData() {
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

    public final void setData(GifProviderEffectModel gifProviderEffectModel) {
        this.data = gifProviderEffectModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i) {
        this.data = gifProviderEffectModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifProviderEffectListResponse(GifProviderEffectModel gifProviderEffectModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : gifProviderEffectModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
