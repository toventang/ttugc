package com.bytedance.android.live.liveinteract.cohost.p271d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.d.a */
public final class C4618a {
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: a */
    public final int f12264a;

    static {
        Covode.recordClassIndex(5194);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C4618a) && this.f12264a == ((C4618a) obj).f12264a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12264a;
    }

    public final String toString() {
        return "CoHostReplyRtcMessage(status=" + this.f12264a + ")";
    }

    public C4618a(int i) {
        this.f12264a = i;
    }
}
