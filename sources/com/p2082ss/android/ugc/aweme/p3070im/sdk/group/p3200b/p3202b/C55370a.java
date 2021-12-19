package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3202b;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.b.b.a */
public final class C55370a implements Serializable {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    private Integer f126595a;
    @AbstractC27891c(mo46611a = "status_msg")

    /* renamed from: b */
    private String f126596b;
    @AbstractC27891c(mo46611a = "invalid_members")

    /* renamed from: c */
    private List<? extends IMUser> f126597c;

    static {
        Covode.recordClassIndex(65135);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>, java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    public final List<IMUser> getInvalidMembers() {
        return this.f126597c;
    }

    public final Integer getStatusCode() {
        return this.f126595a;
    }

    public final String getStatusMsg() {
        return this.f126596b;
    }

    public final String toString() {
        return "GroupCheckMsg(statusCode=" + this.f126595a + ", statusMsg=" + this.f126596b + ", invalidMembers=" + this.f126597c + ')';
    }

    public final void setInvalidMembers(List<? extends IMUser> list) {
        this.f126597c = list;
    }

    public final void setStatusCode(Integer num) {
        this.f126595a = num;
    }

    public final void setStatusMsg(String str) {
        this.f126596b = str;
    }
}
