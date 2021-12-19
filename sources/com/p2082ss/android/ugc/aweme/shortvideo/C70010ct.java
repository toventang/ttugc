package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34486b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ct */
public final class C70010ct extends BaseResponse implements Serializable {
    @AbstractC34486b
    @AbstractC27891c(mo46611a = "is_passed")

    /* renamed from: a */
    private Boolean f156524a;
    @AbstractC27891c(mo46611a = "reason_title")

    /* renamed from: b */
    private String f156525b;
    @AbstractC27891c(mo46611a = "reason_body")

    /* renamed from: c */
    private String f156526c;

    static {
        Covode.recordClassIndex(82424);
    }

    public final String getReasonBody() {
        return this.f156526c;
    }

    public final String getReasonTitle() {
        return this.f156525b;
    }

    public final Boolean isPassed() {
        return this.f156524a;
    }

    public final void setPassed(Boolean bool) {
        this.f156524a = bool;
    }

    public final void setReasonBody(String str) {
        this.f156526c = str;
    }

    public final void setReasonTitle(String str) {
        this.f156525b = str;
    }
}
