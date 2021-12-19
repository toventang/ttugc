package com.p2082ss.android.ugc.aweme.userservice.api;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.api.a */
public final class C80103a {

    /* renamed from: a */
    public final String f179486a;

    /* renamed from: b */
    public final String f179487b;

    /* renamed from: c */
    public final int f179488c;

    /* renamed from: d */
    public final int f179489d;

    /* renamed from: e */
    public final int f179490e;

    /* renamed from: f */
    public final String f179491f;

    /* renamed from: g */
    public final int f179492g;

    /* renamed from: h */
    public final String f179493h;

    /* renamed from: i */
    public final String f179494i;

    /* renamed from: j */
    public final Integer f179495j;

    static {
        Covode.recordClassIndex(93343);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80103a)) {
            return false;
        }
        C80103a aVar = (C80103a) obj;
        return C89219l.m154714a(this.f179486a, aVar.f179486a) && C89219l.m154714a(this.f179487b, aVar.f179487b) && this.f179488c == aVar.f179488c && this.f179489d == aVar.f179489d && this.f179490e == aVar.f179490e && C89219l.m154714a(this.f179491f, aVar.f179491f) && this.f179492g == aVar.f179492g && C89219l.m154714a(this.f179493h, aVar.f179493h) && C89219l.m154714a(this.f179494i, aVar.f179494i) && C89219l.m154714a(this.f179495j, aVar.f179495j);
    }

    public final int hashCode() {
        String str = this.f179486a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f179487b;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f179488c) * 31) + this.f179489d) * 31) + this.f179490e) * 31;
        String str3 = this.f179491f;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f179492g) * 31;
        String str4 = this.f179493h;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f179494i;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.f179495j;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "FollowRequestParam(userId=" + this.f179486a + ", secUserId=" + this.f179487b + ", type=" + this.f179488c + ", channelId=" + this.f179489d + ", from=" + this.f179490e + ", itemId=" + this.f179491f + ", fromPreviousPage=" + this.f179492g + ", videoLinkId=" + this.f179493h + ", videoItemId=" + this.f179494i + ", linkSharer=" + this.f179495j + ")";
    }

    public /* synthetic */ C80103a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        this(str, str2, i, i2, i3, str3, i4, null, null, null);
    }

    public C80103a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4, String str5, Integer num) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f179486a = str;
        this.f179487b = str2;
        this.f179488c = i;
        this.f179489d = i2;
        this.f179490e = i3;
        this.f179491f = str3;
        this.f179492g = i4;
        this.f179493h = str4;
        this.f179494i = str5;
        this.f179495j = num;
    }
}
