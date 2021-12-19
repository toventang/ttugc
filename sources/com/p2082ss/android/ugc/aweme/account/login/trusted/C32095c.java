package com.p2082ss.android.ugc.aweme.account.login.trusted;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.c */
public final class C32095c {
    @AbstractC27891c(mo46611a = "login_type")

    /* renamed from: a */
    public final Integer f76581a;
    @AbstractC27891c(mo46611a = "mobile")

    /* renamed from: b */
    public final String f76582b;
    @AbstractC27891c(mo46611a = "login_name")

    /* renamed from: c */
    public final String f76583c;
    @AbstractC27891c(mo46611a = "email")

    /* renamed from: d */
    public final String f76584d;
    @AbstractC27891c(mo46611a = "connect")

    /* renamed from: e */
    public final C32096a f76585e;
    @AbstractC27891c(mo46611a = "screen_name")

    /* renamed from: f */
    public final String f76586f;

    static {
        Covode.recordClassIndex(38854);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32095c)) {
            return false;
        }
        C32095c cVar = (C32095c) obj;
        return C89219l.m154714a(this.f76581a, cVar.f76581a) && C89219l.m154714a(this.f76582b, cVar.f76582b) && C89219l.m154714a(this.f76583c, cVar.f76583c) && C89219l.m154714a(this.f76584d, cVar.f76584d) && C89219l.m154714a(this.f76585e, cVar.f76585e) && C89219l.m154714a(this.f76586f, cVar.f76586f);
    }

    public final int hashCode() {
        Integer num = this.f76581a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f76582b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f76583c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f76584d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C32096a aVar = this.f76585e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str4 = this.f76586f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "LoginInfo(login_type=" + this.f76581a + ", mobile=" + this.f76582b + ", login_name=" + this.f76583c + ", email=" + this.f76584d + ", connect=" + this.f76585e + ", screen_name=" + this.f76586f + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.c$a */
    public static final class C32096a {
        @AbstractC27891c(mo46611a = "platform")

        /* renamed from: a */
        public final String f76587a = null;
        @AbstractC27891c(mo46611a = "platform_screen_name")

        /* renamed from: b */
        public final String f76588b = null;
        @AbstractC27891c(mo46611a = "profile_image_url")

        /* renamed from: c */
        public final String f76589c = null;

        static {
            Covode.recordClassIndex(38855);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32096a)) {
                return false;
            }
            C32096a aVar = (C32096a) obj;
            return C89219l.m154714a(this.f76587a, aVar.f76587a) && C89219l.m154714a(this.f76588b, aVar.f76588b) && C89219l.m154714a(this.f76589c, aVar.f76589c);
        }

        public final int hashCode() {
            String str = this.f76587a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f76588b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f76589c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "Connect(platform=" + this.f76587a + ", platform_screen_name=" + this.f76588b + ", profile_image_url=" + this.f76589c + ")";
        }

        private C32096a() {
        }
    }

    private /* synthetic */ C32095c() {
        this(-1);
    }

    private C32095c(Integer num) {
        this.f76581a = num;
        this.f76582b = null;
        this.f76583c = null;
        this.f76584d = null;
        this.f76585e = null;
        this.f76586f = null;
    }
}
