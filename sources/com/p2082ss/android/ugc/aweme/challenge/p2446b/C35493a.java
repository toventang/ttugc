package com.p2082ss.android.ugc.aweme.challenge.p2446b;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.b.a */
public final class C35493a {

    /* renamed from: a */
    public static int f83715a = 15000;

    /* renamed from: b */
    public static final C0490e<String, C35495b> f83716b = new C0490e<>(16);

    /* renamed from: c */
    public static final C0490e<String, C35494a> f83717c = new C0490e<>(16);

    /* renamed from: d */
    public static final C35493a f83718d = new C35493a();

    private C35493a() {
    }

    static {
        Covode.recordClassIndex(42685);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.b.a$a */
    public static final class C35494a {

        /* renamed from: a */
        public final ChallengeAwemeList f83719a;

        /* renamed from: b */
        public final long f83720b;

        static {
            Covode.recordClassIndex(42686);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35494a)) {
                return false;
            }
            C35494a aVar = (C35494a) obj;
            return C89219l.m154714a(this.f83719a, aVar.f83719a) && this.f83720b == aVar.f83720b;
        }

        public final int hashCode() {
            ChallengeAwemeList challengeAwemeList = this.f83719a;
            int hashCode = challengeAwemeList != null ? challengeAwemeList.hashCode() : 0;
            long j = this.f83720b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "ChallengeAwemeListNode(challengeAwemeList=" + this.f83719a + ", timestamp=" + this.f83720b + ")";
        }

        public C35494a(ChallengeAwemeList challengeAwemeList, long j) {
            C89219l.m154721d(challengeAwemeList, "");
            this.f83719a = challengeAwemeList;
            this.f83720b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.b.a$b */
    public static final class C35495b {

        /* renamed from: a */
        public final ChallengeDetail f83721a;

        /* renamed from: b */
        public final long f83722b;

        static {
            Covode.recordClassIndex(42687);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35495b)) {
                return false;
            }
            C35495b bVar = (C35495b) obj;
            return C89219l.m154714a(this.f83721a, bVar.f83721a) && this.f83722b == bVar.f83722b;
        }

        public final int hashCode() {
            ChallengeDetail challengeDetail = this.f83721a;
            int hashCode = challengeDetail != null ? challengeDetail.hashCode() : 0;
            long j = this.f83722b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "ChallengeDetailNode(challengeDetail=" + this.f83721a + ", timestamp=" + this.f83722b + ")";
        }

        public C35495b(ChallengeDetail challengeDetail, long j) {
            C89219l.m154721d(challengeDetail, "");
            this.f83721a = challengeDetail;
            this.f83722b = j;
        }
    }

    /* renamed from: a */
    public static ChallengeAwemeList m72584a(String str, long j, int i, int i2, boolean z, String str2, String str3, String str4) {
        C35494a a;
        if (j != 0 || (a = f83717c.mo2091a(str + '&' + j + '&' + 20 + '&' + i2 + '&' + z + '&' + str2 + '&' + str3 + '&' + str4)) == null || System.currentTimeMillis() - a.f83720b >= ((long) f83715a)) {
            return null;
        }
        return a.f83719a;
    }

    /* renamed from: b */
    public static long m72585b(String str, long j, int i, int i2, boolean z, String str2, String str3, String str4) {
        C35494a a = f83717c.mo2091a(str + '&' + j + '&' + 20 + '&' + i2 + '&' + z + '&' + str2 + '&' + str3 + '&' + str4);
        if (a != null) {
            return a.f83720b;
        }
        return -1;
    }
}
