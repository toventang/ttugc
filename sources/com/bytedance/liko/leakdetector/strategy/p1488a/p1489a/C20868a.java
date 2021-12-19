package com.bytedance.liko.leakdetector.strategy.p1488a.p1489a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.liko.leakdetector.strategy.a.a.a */
public final class C20868a {
    @AbstractC27891c(mo46611a = "event_type")

    /* renamed from: a */
    public final String f49335a;
    @AbstractC27891c(mo46611a = "timestamp")

    /* renamed from: b */
    public final long f49336b;

    static {
        Covode.recordClassIndex(24447);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C20868a) {
                C20868a aVar = (C20868a) obj;
                if (!C89219l.m154714a((Object) this.f49335a, (Object) aVar.f49335a) || this.f49336b != aVar.f49336b) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f49335a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f49336b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "DataBean(eventType=" + this.f49335a + ", timestamp=" + this.f49336b + ")";
    }

    public C20868a(String str, long j) {
        C89219l.m154719c(str, "");
        this.f49335a = str;
        this.f49336b = j;
    }
}
