package com.p2082ss.android.ugc.aweme.promote;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramResponse */
public class PromoteProgramResponse extends BaseResponse {
    @AbstractC34486b
    public Boolean confirmed = false;

    static {
        Covode.recordClassIndex(76701);
    }

    public boolean isConfirmedSuccess() {
        Boolean bool = this.confirmed;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
