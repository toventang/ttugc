package com.p2082ss.android.ugc.aweme.net.p3491d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.d.b */
public final class C61334b {

    /* renamed from: a */
    public static final C61335a f139294a;

    /* renamed from: b */
    public static C61335a f139295b;

    /* renamed from: c */
    public static final C61334b f139296c = new C61334b();

    /* renamed from: d */
    private static final C61335a f139297d = new C61335a(C89047am.m154436a("/aweme/v2/feed/"), 30000, 30000, 0, 0, 24);

    private C61334b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.net.d.b$a */
    public static final class C61335a {
        @AbstractC27891c(mo46611a = "path")

        /* renamed from: a */
        public final Set<String> f139298a;
        @AbstractC27891c(mo46611a = "socket_connect_timeout")

        /* renamed from: b */
        public final long f139299b;
        @AbstractC27891c(mo46611a = "socket_read_timeout")

        /* renamed from: c */
        public final long f139300c;
        @AbstractC27891c(mo46611a = "socket_write_timeout")

        /* renamed from: d */
        public final long f139301d;
        @AbstractC27891c(mo46611a = "protect_timeout")

        /* renamed from: e */
        public final long f139302e;

        static {
            Covode.recordClassIndex(71968);
        }

        public C61335a() {
            this(null, 0, 0, 0, 0, 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61335a)) {
                return false;
            }
            C61335a aVar = (C61335a) obj;
            return C89219l.m154714a(this.f139298a, aVar.f139298a) && this.f139299b == aVar.f139299b && this.f139300c == aVar.f139300c && this.f139301d == aVar.f139301d && this.f139302e == aVar.f139302e;
        }

        public final String toString() {
            return "NetTimeOutConfig(pathList=" + this.f139298a + ", connectLimit=" + this.f139299b + ", readLimit=" + this.f139300c + ", writeLimit=" + this.f139301d + ", protectLimit=" + this.f139302e + ")";
        }

        public final int hashCode() {
            int i;
            Set<String> set = this.f139298a;
            if (set != null) {
                i = set.hashCode();
            } else {
                i = 0;
            }
            long j = this.f139299b;
            long j2 = this.f139300c;
            long j3 = this.f139301d;
            long j4 = this.f139302e;
            return (((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }

        private C61335a(Set<String> set, long j, long j2, long j3, long j4) {
            C89219l.m154721d(set, "");
            this.f139298a = set;
            this.f139299b = j;
            this.f139300c = j2;
            this.f139301d = j3;
            this.f139302e = j4;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C61335a(java.util.Set r11, long r12, long r14, long r16, long r18, int r20) {
            /*
                r10 = this;
                r8 = r18
                r4 = r14
                r2 = r12
                r1 = r11
                r0 = r20 & 1
                if (r0 == 0) goto L_0x000b
                h.a.ab r1 = p4600h.p4601a.C89036ab.INSTANCE
            L_0x000b:
                r0 = r20 & 2
                r6 = 15000(0x3a98, double:7.411E-320)
                if (r0 == 0) goto L_0x0013
                r2 = 15000(0x3a98, double:7.411E-320)
            L_0x0013:
                r0 = r20 & 4
                if (r0 == 0) goto L_0x0019
                r4 = 15000(0x3a98, double:7.411E-320)
            L_0x0019:
                r0 = r20 & 8
                if (r0 == 0) goto L_0x0029
            L_0x001d:
                r0 = r20 & 16
                if (r0 == 0) goto L_0x0024
                long r8 = r2 + r4
                long r8 = r8 + r6
            L_0x0024:
                r0 = r10
                r0.<init>(r1, r2, r4, r6, r8)
                return
            L_0x0029:
                r6 = r16
                goto L_0x001d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.net.p3491d.C61334b.C61335a.<init>(java.util.Set, long, long, long, long, int):void");
        }
    }

    static {
        Covode.recordClassIndex(71967);
        C61335a aVar = new C61335a(null, 0, 0, 0, 0, 31);
        f139294a = aVar;
        C61335a aVar2 = (C61335a) C16048b.m29633a().mo25416a(true, "net_common_time_out", C61335a.class, aVar);
        if (aVar2 != null) {
            aVar = aVar2;
        }
        f139295b = aVar;
    }
}
