package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.inbox.p */
public final class C56500p {
    @AbstractC27891c(mo46611a = "hide_days")

    /* renamed from: a */
    public final int f128820a;
    @AbstractC27891c(mo46611a = "max_delete_times")

    /* renamed from: b */
    public final int f128821b;
    @AbstractC27891c(mo46611a = "max_no_action_times")

    /* renamed from: c */
    public final int f128822c;

    static {
        Covode.recordClassIndex(66320);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56500p)) {
            return false;
        }
        C56500p pVar = (C56500p) obj;
        return this.f128820a == pVar.f128820a && this.f128821b == pVar.f128821b && this.f128822c == pVar.f128822c;
    }

    public final int hashCode() {
        return (((this.f128820a * 31) + this.f128821b) * 31) + this.f128822c;
    }

    public final String toString() {
        return "InboxInvitationCellMeta(hideDays=" + this.f128820a + ", maxDeleteTimes=" + this.f128821b + ", maxNoActionTimes=" + this.f128822c + ")";
    }

    private C56500p() {
        this.f128820a = 14;
        this.f128821b = 3;
        this.f128822c = 3;
    }

    public /* synthetic */ C56500p(byte b) {
        this();
    }
}
