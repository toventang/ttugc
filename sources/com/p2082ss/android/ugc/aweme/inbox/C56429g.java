package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.inbox.g */
public final class C56429g {
    @AbstractC27891c(mo46611a = "trigger_times")

    /* renamed from: a */
    public final int f128696a;
    @AbstractC27891c(mo46611a = "limit_days")

    /* renamed from: b */
    public final int f128697b;
    @AbstractC27891c(mo46611a = "max_limit_times")

    /* renamed from: c */
    public final int f128698c;

    static {
        Covode.recordClassIndex(66249);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56429g)) {
            return false;
        }
        C56429g gVar = (C56429g) obj;
        return this.f128696a == gVar.f128696a && this.f128697b == gVar.f128697b && this.f128698c == gVar.f128698c;
    }

    public final int hashCode() {
        return (((this.f128696a * 31) + this.f128697b) * 31) + this.f128698c;
    }

    public final String toString() {
        return "InboxCollapseMeta(triggerTimes=" + this.f128696a + ", limitDays=" + this.f128697b + ", limitTimes=" + this.f128698c + ")";
    }

    private C56429g() {
        this.f128696a = 3;
        this.f128697b = 14;
        this.f128698c = 3;
    }

    public /* synthetic */ C56429g(byte b) {
        this();
    }
}
