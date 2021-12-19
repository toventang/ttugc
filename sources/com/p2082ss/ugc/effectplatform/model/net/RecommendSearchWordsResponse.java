package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse */
public final class RecommendSearchWordsResponse extends AbstractC86845h<RecommendSearchWordsResponse> {
    private RecommendSearchWordsModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102598);
    }

    public RecommendSearchWordsResponse() {
        this(null, 0, null, 7, null);
    }

    public static /* synthetic */ RecommendSearchWordsResponse copy$default(RecommendSearchWordsResponse recommendSearchWordsResponse, RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            recommendSearchWordsModel = recommendSearchWordsResponse.data;
        }
        if ((i2 & 2) != 0) {
            i = recommendSearchWordsResponse.status_code;
        }
        if ((i2 & 4) != 0) {
            str = recommendSearchWordsResponse.message;
        }
        return recommendSearchWordsResponse.copy(recommendSearchWordsModel, i, str);
    }

    public final RecommendSearchWordsModel component1() {
        return this.data;
    }

    public final int component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.message;
    }

    public final RecommendSearchWordsResponse copy(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        return new RecommendSearchWordsResponse(recommendSearchWordsModel, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendSearchWordsResponse)) {
            return false;
        }
        RecommendSearchWordsResponse recommendSearchWordsResponse = (RecommendSearchWordsResponse) obj;
        return C89219l.m154714a(this.data, recommendSearchWordsResponse.data) && this.status_code == recommendSearchWordsResponse.status_code && C89219l.m154714a(this.message, recommendSearchWordsResponse.message);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final RecommendSearchWordsResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        RecommendSearchWordsModel recommendSearchWordsModel = this.data;
        int i = 0;
        int hashCode = (((recommendSearchWordsModel != null ? recommendSearchWordsModel.hashCode() : 0) * 31) + this.status_code) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RecommendSearchWordsResponse(data=" + this.data + ", status_code=" + this.status_code + ", message=" + this.message + ")";
    }

    public final RecommendSearchWordsModel getData() {
        return this.data;
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

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(RecommendSearchWordsModel recommendSearchWordsModel) {
        this.data = recommendSearchWordsModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str) {
        this.data = recommendSearchWordsModel;
        this.status_code = i;
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendSearchWordsResponse(RecommendSearchWordsModel recommendSearchWordsModel, int i, String str, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : recommendSearchWordsModel, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
