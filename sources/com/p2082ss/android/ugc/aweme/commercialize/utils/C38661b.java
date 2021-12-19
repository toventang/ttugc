package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b */
public final class C38661b {

    /* renamed from: a */
    public final Aweme f91341a;

    /* renamed from: b */
    public final String f91342b;

    /* renamed from: c */
    public final String f91343c;

    /* renamed from: d */
    public final String f91344d;

    /* renamed from: e */
    public final String f91345e;

    /* renamed from: f */
    public final String f91346f;

    /* renamed from: g */
    public final boolean f91347g;

    /* renamed from: h */
    public final String f91348h;

    /* renamed from: i */
    public final long f91349i;

    static {
        Covode.recordClassIndex(46202);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38661b)) {
            return false;
        }
        C38661b bVar = (C38661b) obj;
        return C89219l.m154714a(this.f91341a, bVar.f91341a) && C89219l.m154714a(this.f91342b, bVar.f91342b) && C89219l.m154714a(this.f91343c, bVar.f91343c) && C89219l.m154714a(this.f91344d, bVar.f91344d) && C89219l.m154714a(this.f91345e, bVar.f91345e) && C89219l.m154714a(this.f91346f, bVar.f91346f) && this.f91347g == bVar.f91347g && C89219l.m154714a(this.f91348h, bVar.f91348h) && this.f91349i == bVar.f91349i;
    }

    public final int hashCode() {
        Aweme aweme = this.f91341a;
        int i = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f91342b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f91343c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f91344d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f91345e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f91346f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f91347g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode6 + i2) * 31;
        String str6 = this.f91348h;
        if (str6 != null) {
            i = str6.hashCode();
        }
        long j = this.f91349i;
        return ((i5 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.b$a */
    public static final class C38662a {

        /* renamed from: a */
        private Aweme f91350a;

        /* renamed from: b */
        private String f91351b = "";

        /* renamed from: c */
        private String f91352c = "";

        /* renamed from: d */
        private String f91353d = "";

        /* renamed from: e */
        private String f91354e = "";

        /* renamed from: f */
        private String f91355f = "";

        /* renamed from: g */
        private boolean f91356g;

        /* renamed from: h */
        private String f91357h = "";

        /* renamed from: i */
        private long f91358i;

        static {
            Covode.recordClassIndex(46203);
        }

        /* renamed from: a */
        public final C38661b mo67232a() {
            return new C38661b(this.f91350a, this.f91351b, this.f91352c, this.f91353d, this.f91354e, this.f91355f, this.f91356g, this.f91357h, this.f91358i, (byte) 0);
        }

        /* renamed from: a */
        public final C38662a mo67228a(long j) {
            this.f91358i = j;
            return this;
        }

        /* renamed from: a */
        public final C38662a mo67231a(boolean z) {
            this.f91356g = z;
            return this;
        }

        /* renamed from: a */
        public final C38662a mo67229a(Aweme aweme) {
            C89219l.m154721d(aweme, "");
            this.f91350a = aweme;
            return this;
        }

        /* renamed from: b */
        public final C38662a mo67233b(String str) {
            C89219l.m154721d(str, "");
            this.f91352c = str;
            return this;
        }

        /* renamed from: c */
        public final C38662a mo67234c(String str) {
            C89219l.m154721d(str, "");
            this.f91353d = str;
            return this;
        }

        /* renamed from: d */
        public final C38662a mo67235d(String str) {
            C89219l.m154721d(str, "");
            this.f91354e = str;
            return this;
        }

        /* renamed from: e */
        public final C38662a mo67236e(String str) {
            C89219l.m154721d(str, "");
            this.f91355f = str;
            return this;
        }

        /* renamed from: f */
        public final C38662a mo67237f(String str) {
            C89219l.m154721d(str, "");
            this.f91357h = str;
            return this;
        }

        /* renamed from: a */
        public final C38662a mo67230a(String str) {
            C89219l.m154721d(str, "");
            this.f91351b = str;
            return this;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("label=" + this.f91342b + ", refer=" + this.f91343c);
        if (this.f91344d.length() > 0) {
            sb.append(", showFailReason=" + this.f91344d);
        }
        if (this.f91345e.length() > 0) {
            sb.append(", cardType=" + this.f91345e);
        }
        if (this.f91346f.length() > 0) {
            sb.append(", status=" + this.f91346f);
        }
        if (this.f91341a != null) {
            sb.append(", aweme_id=" + this.f91341a.getAid());
        }
        sb.append(", is_preload=" + this.f91347g);
        if (this.f91348h.length() > 0) {
            sb.append(", anchor_id=" + this.f91347g);
        }
        if (this.f91349i != 0) {
            sb.append(", room_id=" + this.f91347g);
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    private C38661b(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j) {
        this.f91341a = aweme;
        this.f91342b = str;
        this.f91343c = str2;
        this.f91344d = str3;
        this.f91345e = str4;
        this.f91346f = str5;
        this.f91347g = z;
        this.f91348h = str6;
        this.f91349i = j;
    }

    public /* synthetic */ C38661b(Aweme aweme, String str, String str2, String str3, String str4, String str5, boolean z, String str6, long j, byte b) {
        this(aweme, str, str2, str3, str4, str5, z, str6, j);
    }
}
