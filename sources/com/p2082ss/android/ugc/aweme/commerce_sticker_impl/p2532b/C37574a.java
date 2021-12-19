package com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2532b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.b.a */
public final class C37574a {

    /* renamed from: a */
    public static C37575a f88794a;

    /* renamed from: b */
    public static String f88795b;

    /* renamed from: c */
    public static final C37574a f88796c = new C37574a();

    private C37574a() {
    }

    static {
        Covode.recordClassIndex(44976);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m75787a() {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.commerce_sticker_impl.p2532b.C37574a.m75787a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_sticker_impl.b.a$a */
    public static final class C37575a {

        /* renamed from: a */
        public final String f88797a;

        /* renamed from: b */
        public final String f88798b;

        /* renamed from: c */
        public final String f88799c;

        /* renamed from: d */
        public final long f88800d;

        static {
            Covode.recordClassIndex(44977);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37575a)) {
                return false;
            }
            C37575a aVar = (C37575a) obj;
            return C89219l.m154714a(this.f88797a, aVar.f88797a) && C89219l.m154714a(this.f88798b, aVar.f88798b) && C89219l.m154714a(this.f88799c, aVar.f88799c) && this.f88800d == aVar.f88800d;
        }

        public final int hashCode() {
            String str = this.f88797a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f88798b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f88799c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            long j = this.f88800d;
            return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "EffectData(creationId=" + this.f88797a + ", shootWay=" + this.f88798b + ", propId=" + this.f88799c + ", startUseTime=" + this.f88800d + ")";
        }

        public C37575a(String str, String str2, String str3, long j) {
            this.f88797a = str;
            this.f88798b = str2;
            this.f88799c = str3;
            this.f88800d = j;
        }
    }
}
