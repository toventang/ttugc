package com.bytedance.android.live.liveinteract.cohost.p271d;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.d.b */
public final class C4619b {
    @AbstractC27891c(mo46611a = "method")

    /* renamed from: a */
    public String f12265a;
    @AbstractC27891c(mo46611a = "channel_id")

    /* renamed from: b */
    public long f12266b;
    @AbstractC27891c(mo46611a = "params")

    /* renamed from: c */
    public String f12267c;

    static {
        Covode.recordClassIndex(5195);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4619b)) {
            return false;
        }
        C4619b bVar = (C4619b) obj;
        return C89219l.m154714a(this.f12265a, bVar.f12265a) && this.f12266b == bVar.f12266b && C89219l.m154714a(this.f12267c, bVar.f12267c);
    }

    public final String toString() {
        return "RtcMessage(method=" + this.f12265a + ", channelId=" + this.f12266b + ", content=" + this.f12267c + ")";
    }

    public final int hashCode() {
        int i;
        String str = this.f12265a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        long j = this.f12266b;
        int i3 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f12267c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public C4619b(String str, long j, String str2) {
        C89219l.m154721d(str, "");
        this.f12265a = str;
        this.f12266b = j;
        this.f12267c = str2;
    }
}
