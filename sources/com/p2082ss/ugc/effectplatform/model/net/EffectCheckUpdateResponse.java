package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.EffectCheckUpdateResponse */
public final class EffectCheckUpdateResponse extends AbstractC86845h<Boolean> {
    private String message;
    private int status_code;
    private boolean updated;

    static {
        Covode.recordClassIndex(102575);
    }

    public EffectCheckUpdateResponse() {
        this(false, null, 0, 7, null);
    }

    public static /* synthetic */ EffectCheckUpdateResponse copy$default(EffectCheckUpdateResponse effectCheckUpdateResponse, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = effectCheckUpdateResponse.updated;
        }
        if ((i2 & 2) != 0) {
            str = effectCheckUpdateResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectCheckUpdateResponse.status_code;
        }
        return effectCheckUpdateResponse.copy(z, str, i);
    }

    public final boolean component1() {
        return this.updated;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i) {
        return new EffectCheckUpdateResponse(z, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCheckUpdateResponse)) {
            return false;
        }
        EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) obj;
        return this.updated == effectCheckUpdateResponse.updated && C89219l.m154714a(this.message, effectCheckUpdateResponse.message) && this.status_code == effectCheckUpdateResponse.status_code;
    }

    public final int hashCode() {
        boolean z = this.updated;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.message;
        return ((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final String toString() {
        return "EffectCheckUpdateResponse(updated=" + this.updated + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final String getMessage() {
        return this.message;
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

    public final boolean getUpdated() {
        return this.updated;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i) {
        this.updated = z;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCheckUpdateResponse(boolean z, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
