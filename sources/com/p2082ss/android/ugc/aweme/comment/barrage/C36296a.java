package com.p2082ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.a */
public final class C36296a {

    /* renamed from: a */
    public final Aweme f85808a;

    /* renamed from: b */
    public final String f85809b;

    /* renamed from: c */
    public final String f85810c;

    /* renamed from: d */
    public final int f85811d;

    /* renamed from: e */
    public final String f85812e;

    /* renamed from: f */
    public final Integer f85813f;

    /* renamed from: g */
    public final Set<String> f85814g;

    static {
        Covode.recordClassIndex(43573);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36296a)) {
            return false;
        }
        C36296a aVar = (C36296a) obj;
        return C89219l.m154714a(this.f85808a, aVar.f85808a) && C89219l.m154714a(this.f85809b, aVar.f85809b) && C89219l.m154714a(this.f85810c, aVar.f85810c) && this.f85811d == aVar.f85811d && C89219l.m154714a(this.f85812e, aVar.f85812e) && C89219l.m154714a(this.f85813f, aVar.f85813f) && C89219l.m154714a(this.f85814g, aVar.f85814g);
    }

    public final int hashCode() {
        Aweme aweme = this.f85808a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f85809b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f85810c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f85811d) * 31;
        String str3 = this.f85812e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f85813f;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Set<String> set = this.f85814g;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "CommentAndLikeBubbleMobEventParam(aweme=" + this.f85808a + ", enterFrom=" + this.f85809b + ", groupId=" + this.f85810c + ", followStatus=" + this.f85811d + ", storyType=" + this.f85812e + ", pageType=" + this.f85813f + ", reportShowSet=" + this.f85814g + ")";
    }

    public C36296a(Aweme aweme, String str, String str2, int i, String str3, Integer num, Set<String> set) {
        this.f85808a = aweme;
        this.f85809b = str;
        this.f85810c = str2;
        this.f85811d = i;
        this.f85812e = str3;
        this.f85813f = num;
        this.f85814g = set;
    }
}
