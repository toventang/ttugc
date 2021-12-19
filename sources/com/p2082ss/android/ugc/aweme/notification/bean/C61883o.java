package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.o */
public final class C61883o extends BaseResponse {
    @AbstractC27891c(mo46611a = "inbox")

    /* renamed from: a */
    public final C61882n f140501a = null;

    static {
        Covode.recordClassIndex(72632);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C61883o) && C89219l.m154714a(this.f140501a, ((C61883o) obj).f140501a);
        }
        return true;
    }

    public final int hashCode() {
        C61882n nVar = this.f140501a;
        if (nVar != null) {
            return nVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NotificationSubscribeSettings(subscribeData=" + this.f140501a + ")";
    }

    private C61883o() {
    }
}
