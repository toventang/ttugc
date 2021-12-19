package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.api.model.a */
public final class C10347a {

    /* renamed from: a */
    public final User f24998a;

    /* renamed from: b */
    public final long f24999b;

    /* renamed from: c */
    public final int f25000c;

    static {
        Covode.recordClassIndex(11915);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10347a)) {
            return false;
        }
        C10347a aVar = (C10347a) obj;
        return C89219l.m154714a(this.f24998a, aVar.f24998a) && this.f24999b == aVar.f24999b && this.f25000c == aVar.f25000c;
    }

    public final String toString() {
        return "AudienceInProfileListItem(user=" + this.f24998a + ", score=" + this.f24999b + ", rank=" + this.f25000c + ")";
    }

    public final int hashCode() {
        int i;
        User user = this.f24998a;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        long j = this.f24999b;
        return (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f25000c;
    }

    public C10347a(User user, long j, int i) {
        C89219l.m154721d(user, "");
        this.f24998a = user;
        this.f24999b = j;
        this.f25000c = i;
    }
}
