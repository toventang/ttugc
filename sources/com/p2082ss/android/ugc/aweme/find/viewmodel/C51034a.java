package com.p2082ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewmodel.a */
public final class C51034a {

    /* renamed from: a */
    public final User f117717a;

    /* renamed from: b */
    public final int f117718b;

    static {
        Covode.recordClassIndex(60218);
    }

    public C51034a() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51034a)) {
            return false;
        }
        C51034a aVar = (C51034a) obj;
        return C89219l.m154714a(this.f117717a, aVar.f117717a) && this.f117718b == aVar.f117718b;
    }

    public final int hashCode() {
        User user = this.f117717a;
        return ((user != null ? user.hashCode() : 0) * 31) + this.f117718b;
    }

    public final String toString() {
        return "FindFriendsData(user=" + this.f117717a + ", type=" + this.f117718b + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C51034a(int i, int i2) {
        this((User) null, (i2 & 2) != 0 ? 2 : i);
    }

    public C51034a(User user, int i) {
        this.f117717a = user;
        this.f117718b = i;
    }
}
