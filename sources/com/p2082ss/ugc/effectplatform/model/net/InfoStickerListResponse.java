package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.InfoStickerListResponse */
public final class InfoStickerListResponse extends AbstractC86845h<InfoStickerListResponse> {
    private InfoStickerListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102588);
    }

    public InfoStickerListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ InfoStickerListResponse copy$default(InfoStickerListResponse infoStickerListResponse, InfoStickerListModel infoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            infoStickerListModel = infoStickerListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = infoStickerListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = infoStickerListResponse.status_code;
        }
        return infoStickerListResponse.copy(infoStickerListModel, str, i);
    }

    public final InfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final InfoStickerListResponse copy(InfoStickerListModel infoStickerListModel, String str, int i) {
        return new InfoStickerListResponse(infoStickerListModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoStickerListResponse)) {
            return false;
        }
        InfoStickerListResponse infoStickerListResponse = (InfoStickerListResponse) obj;
        return C89219l.m154714a(this.data, infoStickerListResponse.data) && C89219l.m154714a(this.message, infoStickerListResponse.message) && this.status_code == infoStickerListResponse.status_code;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final InfoStickerListResponse getResponseData() {
        return this;
    }

    public final int hashCode() {
        InfoStickerListModel infoStickerListModel = this.data;
        int i = 0;
        int hashCode = (infoStickerListModel != null ? infoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "InfoStickerListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final InfoStickerListModel getData() {
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

    public final void setData(InfoStickerListModel infoStickerListModel) {
        this.data = infoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i) {
        this.data = infoStickerListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoStickerListResponse(InfoStickerListModel infoStickerListModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : infoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
