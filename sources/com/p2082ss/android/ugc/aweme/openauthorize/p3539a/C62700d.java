package com.p2082ss.android.ugc.aweme.openauthorize.p3539a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.a.d */
public final class C62700d implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private Integer f142140a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private String f142141b;
    @AbstractC27891c(mo46611a = "page_detail")

    /* renamed from: c */
    private C62701e f142142c;
    @AbstractC27891c(mo46611a = "check_result")

    /* renamed from: d */
    private C62698b f142143d;
    @AbstractC27891c(mo46611a = "is_lite")

    /* renamed from: e */
    private Boolean f142144e;
    @AbstractC27891c(mo46611a = "app_icon")

    /* renamed from: f */
    private String f142145f;

    static {
        Covode.recordClassIndex(73506);
    }

    public final String getAppIcon() {
        return this.f142145f;
    }

    public final C62698b getCheckResult() {
        return this.f142143d;
    }

    public final C62701e getPageDetail() {
        return this.f142142c;
    }

    public final Integer getStatusCode() {
        return this.f142140a;
    }

    public final String getStatusMsg() {
        return this.f142141b;
    }

    public final Boolean isLite() {
        return this.f142144e;
    }

    public final void setAppIcon(String str) {
        this.f142145f = str;
    }

    public final void setCheckResult(C62698b bVar) {
        this.f142143d = bVar;
    }

    public final void setLite(Boolean bool) {
        this.f142144e = bool;
    }

    public final void setPageDetail(C62701e eVar) {
        this.f142142c = eVar;
    }

    public final void setStatusCode(Integer num) {
        this.f142140a = num;
    }

    public final void setStatusMsg(String str) {
        this.f142141b = str;
    }
}
