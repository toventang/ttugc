package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.PanelInfoResponse */
public final class PanelInfoResponse extends AbstractC86845h<PanelInfoModel> {
    private PanelInfoModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102591);
    }

    public PanelInfoResponse() {
        this(null, null, 0, 7, null);
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoResponse copy$default(PanelInfoResponse panelInfoResponse, PanelInfoModel panelInfoModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoModel = panelInfoResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = panelInfoResponse.status_code;
        }
        return panelInfoResponse.copy(panelInfoModel, str, i);
    }

    public final PanelInfoModel component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i) {
        return new PanelInfoResponse(panelInfoModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponse)) {
            return false;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) obj;
        return C89219l.m154714a(this.data, panelInfoResponse.data) && C89219l.m154714a(this.message, panelInfoResponse.message) && this.status_code == panelInfoResponse.status_code;
    }

    public final int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int i = 0;
        int hashCode = (panelInfoModel != null ? panelInfoModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "PanelInfoResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final PanelInfoModel getResponseData() {
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
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : panelInfoModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
