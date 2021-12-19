package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.api.model.b */
public final class C10348b {

    /* renamed from: a */
    public final User f25001a;

    /* renamed from: b */
    public final int f25002b;

    /* renamed from: c */
    public final long f25003c;

    /* renamed from: d */
    public final int f25004d;

    /* renamed from: e */
    public final String f25005e;

    static {
        Covode.recordClassIndex(11916);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10348b)) {
            return false;
        }
        C10348b bVar = (C10348b) obj;
        return C89219l.m154714a(this.f25001a, bVar.f25001a) && this.f25002b == bVar.f25002b && this.f25003c == bVar.f25003c && this.f25004d == bVar.f25004d && C89219l.m154714a(this.f25005e, bVar.f25005e);
    }

    public final String toString() {
        return "AudienceInRankDialogItem(user=" + this.f25001a + ", rank=" + this.f25002b + ", score=" + this.f25003c + ", userRestrictionLevel=" + this.f25004d + ", gapDescription=" + this.f25005e + ")";
    }

    public final int hashCode() {
        int i;
        User user = this.f25001a;
        int i2 = 0;
        if (user != null) {
            i = user.hashCode();
        } else {
            i = 0;
        }
        long j = this.f25003c;
        int i3 = ((((((i * 31) + this.f25002b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f25004d) * 31;
        String str = this.f25005e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public C10348b(User user, int i, long j, int i2, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        this.f25001a = user;
        this.f25002b = i;
        this.f25003c = j;
        this.f25004d = i2;
        this.f25005e = str;
    }
}
