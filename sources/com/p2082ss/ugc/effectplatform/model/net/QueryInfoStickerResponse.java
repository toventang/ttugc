package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.QueryInfoStickerResponse */
public final class QueryInfoStickerResponse extends AbstractC86845h<QueryInfoStickerResponse> {
    private QueryInfoStickerListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102596);
    }

    public QueryInfoStickerResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ QueryInfoStickerResponse copy$default(QueryInfoStickerResponse queryInfoStickerResponse, QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            queryInfoStickerListModel = queryInfoStickerResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = queryInfoStickerResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = queryInfoStickerResponse.status_code;
        }
        return queryInfoStickerResponse.copy(queryInfoStickerListModel, str, i);
    }

    public final QueryInfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerResponse)) {
            return false;
        }
        QueryInfoStickerResponse queryInfoStickerResponse = (QueryInfoStickerResponse) obj;
        return C89219l.m154714a(this.data, queryInfoStickerResponse.data) && C89219l.m154714a(this.message, queryInfoStickerResponse.message) && this.status_code == queryInfoStickerResponse.status_code;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final QueryInfoStickerResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        QueryInfoStickerListModel queryInfoStickerListModel = this.data;
        int i = 0;
        int hashCode = (queryInfoStickerListModel != null ? queryInfoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "QueryInfoStickerResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final QueryInfoStickerListModel getData() {
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

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : queryInfoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
