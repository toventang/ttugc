package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;

public final class TTSettingDataBean {
    private TTSettingDataAppBean app;

    /* renamed from: default  reason: not valid java name */
    private TTSettingDataDefaultBean f205069default;

    static {
        Covode.recordClassIndex(20825);
    }

    public final TTSettingDataAppBean getApp() {
        return this.app;
    }

    public final TTSettingDataDefaultBean getDefault() {
        return this.f205069default;
    }

    public final void setApp(TTSettingDataAppBean tTSettingDataAppBean) {
        this.app = tTSettingDataAppBean;
    }

    public final void setDefault(TTSettingDataDefaultBean tTSettingDataDefaultBean) {
        this.f205069default = tTSettingDataDefaultBean;
    }
}
