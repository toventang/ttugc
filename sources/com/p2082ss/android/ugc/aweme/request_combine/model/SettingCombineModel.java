package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel */
public final class SettingCombineModel extends BaseResponse {
    @AbstractC27891c(mo46611a = "data")
    private SettingCombineDataModel data;

    static {
        Covode.recordClassIndex(78725);
    }

    public final SettingCombineDataModel getData() {
        return this.data;
    }

    public final void setData(SettingCombineDataModel settingCombineDataModel) {
        C89219l.m154721d(settingCombineDataModel, "");
        this.data = settingCombineDataModel;
    }

    public SettingCombineModel(SettingCombineDataModel settingCombineDataModel) {
        C89219l.m154721d(settingCombineDataModel, "");
        this.data = settingCombineDataModel;
    }
}
