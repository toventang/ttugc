package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.ResourceListResponse */
public class ResourceListResponse extends BaseNetResponse {
    private ResourceListModel data;

    static {
        Covode.recordClassIndex(95611);
    }

    public ResourceListModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResourceList() == null) {
            return false;
        }
        return true;
    }

    public void setData(ResourceListModel resourceListModel) {
        this.data = resourceListModel;
    }
}
