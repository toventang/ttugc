package com.p2082ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.bean.m */
public final class C61881m {
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: a */
    public final Integer f140495a = null;
    @AbstractC27891c(mo46611a = "option_msg")

    /* renamed from: b */
    public final String f140496b = null;
    @AbstractC27891c(mo46611a = "unsubscribe_desc")

    /* renamed from: c */
    public String f140497c = null;
    @AbstractC27891c(mo46611a = "subscribe_desc")

    /* renamed from: d */
    public String f140498d = null;

    static {
        Covode.recordClassIndex(72630);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61881m)) {
            return false;
        }
        C61881m mVar = (C61881m) obj;
        return C89219l.m154714a(this.f140495a, mVar.f140495a) && C89219l.m154714a(this.f140496b, mVar.f140496b) && C89219l.m154714a(this.f140497c, mVar.f140497c) && C89219l.m154714a(this.f140498d, mVar.f140498d);
    }

    public final int hashCode() {
        Integer num = this.f140495a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f140496b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f140497c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f140498d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "NotificationMarketSettingsData(status=" + this.f140495a + ", optionMsg=" + this.f140496b + ", unsubscribeDesc=" + this.f140497c + ", subscribeDesc=" + this.f140498d + ")";
    }

    private C61881m() {
    }
}
