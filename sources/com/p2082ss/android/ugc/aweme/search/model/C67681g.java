package com.p2082ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.model.g */
public final class C67681g {

    /* renamed from: g */
    public static final C67682a f151681g = new C67682a((byte) 0);

    /* renamed from: a */
    public final long f151682a;

    /* renamed from: b */
    public final Long f151683b;

    /* renamed from: c */
    public final String f151684c;

    /* renamed from: d */
    public final String f151685d;

    /* renamed from: e */
    public final long f151686e;

    /* renamed from: f */
    public final List<String> f151687f;

    static {
        Covode.recordClassIndex(79326);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67681g)) {
            return false;
        }
        C67681g gVar = (C67681g) obj;
        return this.f151682a == gVar.f151682a && C89219l.m154714a(this.f151683b, gVar.f151683b) && C89219l.m154714a(this.f151684c, gVar.f151684c) && C89219l.m154714a(this.f151685d, gVar.f151685d) && this.f151686e == gVar.f151686e && C89219l.m154714a(this.f151687f, gVar.f151687f);
    }

    public final String toString() {
        return "SearchUserSugRequest(mentionType=" + this.f151682a + ", awemeID=" + this.f151683b + ", keyword=" + this.f151684c + ", source=" + this.f151685d + ", count=" + this.f151686e + ", uidFilterList=" + this.f151687f + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.search.model.g$a */
    public static final class C67682a {
        static {
            Covode.recordClassIndex(79327);
        }

        private C67682a() {
        }

        public /* synthetic */ C67682a(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        long j = this.f151682a;
        int i4 = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.f151683b;
        int i5 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        String str = this.f151684c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.f151685d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f151686e;
        int i8 = (((i7 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<String> list = this.f151687f;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i8 + i5;
    }

    public C67681g(long j, Long l, String str, String str2, long j2, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f151682a = j;
        this.f151683b = l;
        this.f151684c = str;
        this.f151685d = str2;
        this.f151686e = j2;
        this.f151687f = list;
    }
}
