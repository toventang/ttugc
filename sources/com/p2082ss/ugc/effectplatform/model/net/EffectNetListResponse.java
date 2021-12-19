package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.EffectChannelModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.EffectNetListResponse */
public final class EffectNetListResponse extends AbstractC86845h<EffectChannelModel> {
    private EffectChannelModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102579);
    }

    public EffectNetListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ EffectNetListResponse copy$default(EffectNetListResponse effectNetListResponse, EffectChannelModel effectChannelModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            effectChannelModel = effectNetListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = effectNetListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectNetListResponse.status_code;
        }
        return effectNetListResponse.copy(effectChannelModel, str, i);
    }

    public final EffectChannelModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectNetListResponse copy(EffectChannelModel effectChannelModel, String str, int i) {
        return new EffectNetListResponse(effectChannelModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectNetListResponse)) {
            return false;
        }
        EffectNetListResponse effectNetListResponse = (EffectNetListResponse) obj;
        return C89219l.m154714a(this.data, effectNetListResponse.data) && C89219l.m154714a(this.message, effectNetListResponse.message) && this.status_code == effectNetListResponse.status_code;
    }

    public final int hashCode() {
        EffectChannelModel effectChannelModel = this.data;
        int i = 0;
        int hashCode = (effectChannelModel != null ? effectChannelModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "EffectNetListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final EffectChannelModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final EffectChannelModel getResponseData() {
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

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final boolean checkValue() {
        EffectChannelModel effectChannelModel = this.data;
        if (effectChannelModel == null) {
            return false;
        }
        return effectChannelModel.checkValued();
    }

    public final void setData(EffectChannelModel effectChannelModel) {
        this.data = effectChannelModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i) {
        this.data = effectChannelModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectNetListResponse(EffectChannelModel effectChannelModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : effectChannelModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
