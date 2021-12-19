package com.bytedance.ies.abmock.p1115a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.abmock.a.c */
public final class C16047c {

    /* renamed from: a */
    public String f38659a;

    /* renamed from: b */
    public String f38660b;

    /* renamed from: c */
    public long f38661c;

    static {
        Covode.recordClassIndex(18318);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16047c) {
                C16047c cVar = (C16047c) obj;
                if (!C89219l.m154714a((Object) this.f38659a, (Object) cVar.f38659a) || !C89219l.m154714a((Object) this.f38660b, (Object) cVar.f38660b) || this.f38661c != cVar.f38661c) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f38659a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f38660b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f38661c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PullSyncEntity(taskId=" + this.f38659a + ", proxyItemIds=" + this.f38660b + ", timeStamp=" + this.f38661c + ")";
    }
}
