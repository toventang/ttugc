package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse */
public class PanelInfoResponse extends BaseNetResponse {
    private PanelInfoModel data;

    static {
        Covode.recordClassIndex(95609);
    }

    public PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public String getRecId() {
        PanelInfoModel panelInfoModel = this.data;
        if (panelInfoModel == null) {
            return null;
        }
        return panelInfoModel.getRecID();
    }

    public void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }
}
