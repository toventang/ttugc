package com.p2082ss.android.ugc.aweme.p3070im.service;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.b */
public interface AbstractC56190b {

    /* renamed from: com.ss.android.ugc.aweme.im.service.b$a */
    public interface AbstractC56191a {
        static {
            Covode.recordClassIndex(66000);
        }

        /* renamed from: a */
        void mo70583a(C56193c cVar);

        /* renamed from: b */
        void mo70584b(C56193c cVar);

        /* renamed from: c */
        void mo70585c(C56193c cVar);
    }

    static {
        Covode.recordClassIndex(65999);
    }

    /* renamed from: a */
    void mo90213a();

    /* renamed from: a */
    void mo90214a(long j);

    /* renamed from: a */
    void mo90215a(AbstractC56191a aVar);

    /* renamed from: a */
    void mo90216a(String str);

    /* renamed from: b */
    void mo90217b();

    /* renamed from: b */
    void mo90218b(long j);

    /* renamed from: c */
    C56193c mo90219c();

    /* renamed from: com.ss.android.ugc.aweme.im.service.b$b */
    public static final class C56192b {

        /* renamed from: a */
        public final String f128188a;

        /* renamed from: b */
        public final long f128189b;

        static {
            Covode.recordClassIndex(66001);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56192b)) {
                return false;
            }
            C56192b bVar = (C56192b) obj;
            return C89219l.m154714a(this.f128188a, bVar.f128188a) && this.f128189b == bVar.f128189b;
        }

        public final int hashCode() {
            String str = this.f128188a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f128189b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "IMAweme(aid=" + this.f128188a + ", index=" + this.f128189b + ")";
        }

        public C56192b(String str, long j) {
            C89219l.m154721d(str, "");
            this.f128188a = str;
            this.f128189b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.service.b$c */
    public static final class C56193c {

        /* renamed from: a */
        public final List<C56192b> f128190a;

        /* renamed from: b */
        public final boolean f128191b;

        static {
            Covode.recordClassIndex(66002);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56193c)) {
                return false;
            }
            C56193c cVar = (C56193c) obj;
            return C89219l.m154714a(this.f128190a, cVar.f128190a) && this.f128191b == cVar.f128191b;
        }

        public final int hashCode() {
            List<C56192b> list = this.f128190a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            boolean z = this.f128191b;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            return hashCode + i;
        }

        public final String toString() {
            return "IMResponse(data=" + this.f128190a + ", hasMore=" + this.f128191b + ")";
        }

        public C56193c(List<C56192b> list, boolean z) {
            C89219l.m154721d(list, "");
            this.f128190a = list;
            this.f128191b = z;
        }
    }
}
