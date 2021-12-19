package com.p2082ss.android.ugc.aweme.following.p3002a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.a.g */
public final class C51108g {

    /* renamed from: a */
    public final int f117933a;

    /* renamed from: b */
    public final User f117934b;

    /* renamed from: c */
    public final int f117935c;

    /* renamed from: d */
    public final String f117936d;

    static {
        Covode.recordClassIndex(60305);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51108g)) {
            return false;
        }
        C51108g gVar = (C51108g) obj;
        return this.f117933a == gVar.f117933a && C89219l.m154714a(this.f117934b, gVar.f117934b) && this.f117935c == gVar.f117935c && C89219l.m154714a(this.f117936d, gVar.f117936d);
    }

    public final int hashCode() {
        int i = this.f117933a * 31;
        User user = this.f117934b;
        int i2 = 0;
        int hashCode = (((i + (user != null ? user.hashCode() : 0)) * 31) + this.f117935c) * 31;
        String str = this.f117936d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RelationUser(type=" + this.f117933a + ", user=" + this.f117934b + ", order=" + this.f117935c + ", requestId=" + this.f117936d + ")";
    }

    public /* synthetic */ C51108g(int i, User user) {
        this(i, user, 0, "");
    }

    /* renamed from: a */
    public static /* synthetic */ C51108g m95538a(C51108g gVar, int i) {
        int i2 = gVar.f117933a;
        User user = gVar.f117934b;
        String str = gVar.f117936d;
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        return new C51108g(i2, user, i, str);
    }

    public C51108g(int i, User user, int i2, String str) {
        C89219l.m154721d(user, "");
        C89219l.m154721d(str, "");
        this.f117933a = i;
        this.f117934b = user;
        this.f117935c = i2;
        this.f117936d = str;
    }
}
