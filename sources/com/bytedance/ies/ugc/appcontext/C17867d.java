package com.bytedance.ies.ugc.appcontext;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.appcontext.d */
public final class C17867d {

    /* renamed from: a */
    public static volatile boolean f42577a;

    /* renamed from: b */
    public static volatile Application f42578b;

    /* renamed from: c */
    public static volatile String f42579c;

    /* renamed from: d */
    public static volatile Integer f42580d;

    /* renamed from: e */
    public static volatile String f42581e;

    /* renamed from: f */
    public static volatile C17870c f42582f;

    /* renamed from: g */
    public static volatile String f42583g;

    /* renamed from: h */
    public static volatile C17868a f42584h;

    /* renamed from: i */
    public static volatile String f42585i;

    /* renamed from: j */
    public static volatile String f42586j;

    /* renamed from: k */
    public static volatile C17861a f42587k = new C17861a();

    /* renamed from: l */
    public static volatile int f42588l = 2;

    /* renamed from: m */
    public static volatile boolean f42589m;

    /* renamed from: n */
    public static volatile int f42590n = -1;

    /* renamed from: o */
    public static volatile String f42591o = "";

    /* renamed from: p */
    public static volatile String f42592p = "";

    /* renamed from: q */
    public static volatile String f42593q = "";

    /* renamed from: r */
    public static volatile String f42594r = "";

    /* renamed from: s */
    public static volatile String f42595s = "unknown";

    /* renamed from: t */
    public static volatile boolean f42596t;

    /* renamed from: u */
    public static volatile String f42597u;

    /* renamed from: v */
    public static String f42598v;

    /* renamed from: w */
    public static boolean f42599w;

    /* renamed from: x */
    public static final C17867d f42600x = new C17867d();

    /* renamed from: y */
    private static final AbstractC89244h f42601y = C89250i.m154773a((AbstractC89171a) C17869b.f42605a);

    private C17867d() {
    }

    /* renamed from: g */
    public static int m33086g() {
        return f42590n;
    }

    /* renamed from: j */
    public static String m33089j() {
        return f42595s;
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$c */
    public static final class C17870c {

        /* renamed from: a */
        public volatile long f42606a;

        /* renamed from: b */
        public volatile String f42607b;

        static {
            Covode.recordClassIndex(20471);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17870c)) {
                return false;
            }
            C17870c cVar = (C17870c) obj;
            return this.f42606a == cVar.f42606a && C89219l.m154714a(this.f42607b, cVar.f42607b);
        }

        public final String toString() {
            return "VersionInfo(versionCode=" + this.f42606a + ", versionName=" + this.f42607b + ")";
        }

        private /* synthetic */ C17870c() {
            this(-1, "");
        }

        public final int hashCode() {
            int i;
            long j = this.f42606a;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f42607b;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public C17870c(long j, String str) {
            C89219l.m154721d(str, "");
            this.f42606a = j;
            this.f42607b = str;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$a */
    public static final class C17868a {

        /* renamed from: a */
        public volatile long f42602a;

        /* renamed from: b */
        public volatile String f42603b;

        /* renamed from: c */
        public volatile long f42604c;

        static {
            Covode.recordClassIndex(20469);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17868a)) {
                return false;
            }
            C17868a aVar = (C17868a) obj;
            return this.f42602a == aVar.f42602a && C89219l.m154714a(this.f42603b, aVar.f42603b) && this.f42604c == aVar.f42604c;
        }

        public final String toString() {
            return "BussinessVersionInfo(versionCode=" + this.f42602a + ", versionName=" + this.f42603b + ", updateVersionCode=" + this.f42604c + ")";
        }

        private /* synthetic */ C17868a() {
            this(-1, "", -1);
        }

        public final int hashCode() {
            int i;
            long j = this.f42602a;
            int i2 = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.f42603b;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            long j2 = this.f42604c;
            return ((i2 + i) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public C17868a(long j, String str, long j2) {
            C89219l.m154721d(str, "");
            this.f42602a = j;
            this.f42603b = str;
            this.f42604c = j2;
        }
    }

    /* renamed from: a */
    public static Context m33078a() {
        Application application = f42578b;
        if (application == null) {
            C89219l.m154710a("context");
        }
        return application;
    }

    /* renamed from: b */
    public static String m33081b() {
        String str = f42581e;
        if (str == null) {
            C89219l.m154710a("appName");
        }
        return str;
    }

    /* renamed from: c */
    public static String m33082c() {
        String str = f42586j;
        if (str == null) {
            C89219l.m154710a("releaseBuild");
        }
        return str;
    }

    /* renamed from: d */
    public static long m33083d() {
        C17868a aVar = f42584h;
        if (aVar == null) {
            C89219l.m154710a("bussinessVersionInfo");
        }
        return aVar.f42604c;
    }

    /* renamed from: e */
    public static long m33084e() {
        C17868a aVar = f42584h;
        if (aVar == null) {
            C89219l.m154710a("bussinessVersionInfo");
        }
        return aVar.f42602a;
    }

    /* renamed from: f */
    public static String m33085f() {
        C17868a aVar = f42584h;
        if (aVar == null) {
            C89219l.m154710a("bussinessVersionInfo");
        }
        return aVar.f42603b;
    }

    /* renamed from: h */
    public static long m33087h() {
        C17870c cVar = f42582f;
        if (cVar == null) {
            C89219l.m154710a("versionInfo");
        }
        return cVar.f42606a;
    }

    /* renamed from: i */
    public static String m33088i() {
        C17870c cVar = f42582f;
        if (cVar == null) {
            C89219l.m154710a("versionInfo");
        }
        return cVar.f42607b;
    }

    /* renamed from: k */
    public static boolean m33090k() {
        if (f42588l == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.d$b */
    static final class C17869b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C17869b f42605a = new C17869b();

        static {
            Covode.recordClassIndex(20470);
        }

        C17869b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a;
            Integer num = C17867d.f42580d;
            if (num != null && (a = C17867d.m33079a(num.intValue())) != null) {
                return a;
            }
            String str = C17867d.f42579c;
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    static {
        Covode.recordClassIndex(20468);
    }

    /* renamed from: a */
    public static String m33079a(int i) {
        try {
            Application application = f42578b;
            if (application == null) {
                C89219l.m154710a("context");
            }
            String string = application.getString(i);
            C89219l.m154716b(string, "");
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static final void m33080a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C17861a aVar = f42587k;
        aVar.f42569a = str;
        aVar.f42571c = str2;
        aVar.f42570b = str3;
    }
}
