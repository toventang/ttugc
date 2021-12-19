package com.p2082ss.android.ugc.aweme.notice.repo.list.p3517a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.a.e */
public final class C61623e {
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: a */
    public final int f139861a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    public final String f139862b;
    @AbstractC27891c(mo46611a = "schema_url")

    /* renamed from: c */
    public final String f139863c;
    @AbstractC27891c(mo46611a = "schema_type")

    /* renamed from: d */
    public final int f139864d;
    @AbstractC27891c(mo46611a = "need_track")

    /* renamed from: e */
    public final boolean f139865e;

    static {
        Covode.recordClassIndex(72319);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61623e)) {
            return false;
        }
        C61623e eVar = (C61623e) obj;
        return this.f139861a == eVar.f139861a && C89219l.m154714a(this.f139862b, eVar.f139862b) && C89219l.m154714a(this.f139863c, eVar.f139863c) && this.f139864d == eVar.f139864d && this.f139865e == eVar.f139865e;
    }

    public final int hashCode() {
        int i = this.f139861a * 31;
        String str = this.f139862b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f139863c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (((hashCode + i2) * 31) + this.f139864d) * 31;
        boolean z = this.f139865e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "TextLinkConfig(type=" + this.f139861a + ", text=" + this.f139862b + ", schemaUrl=" + this.f139863c + ", schemaType=" + this.f139864d + ", needTrack=" + this.f139865e + ")";
    }
}
