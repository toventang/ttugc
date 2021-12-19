package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.n */
public final class C61882n {
    @AbstractC27891c(mo46611a = "title_msg")

    /* renamed from: a */
    public final String f140499a = null;
    @AbstractC27891c(mo46611a = "marketing_setting")

    /* renamed from: b */
    public final C61881m f140500b = null;

    static {
        Covode.recordClassIndex(72631);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61882n)) {
            return false;
        }
        C61882n nVar = (C61882n) obj;
        return C89219l.m154714a(this.f140499a, nVar.f140499a) && C89219l.m154714a(this.f140500b, nVar.f140500b);
    }

    public final int hashCode() {
        String str = this.f140499a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C61881m mVar = this.f140500b;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NotificationSubscribeData(titleMsg=" + this.f140499a + ", marketSetting=" + this.f140500b + ")";
    }

    private C61882n() {
    }
}
