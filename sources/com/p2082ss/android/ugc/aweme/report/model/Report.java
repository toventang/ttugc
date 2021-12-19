package com.p2082ss.android.ugc.aweme.report.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.report.model.Report */
public class Report extends BaseResponse {
    static {
        Covode.recordClassIndex(78698);
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatusMessage(String str) {
        this.message = str;
    }
}
