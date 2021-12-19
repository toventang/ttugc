package com.p2082ss.android.ugc.aweme.music.p3474i;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.p2082ss.android.ugc.aweme.music.model.MusicDetail;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.i.d */
public final class C60808d {

    /* renamed from: a */
    public static final C0490e<String, C60810b> f138187a = new C0490e<>(16);

    /* renamed from: b */
    public static final C0490e<String, C60809a> f138188b = new C0490e<>(16);

    /* renamed from: c */
    public static final C60808d f138189c = new C60808d();

    /* renamed from: d */
    private static int f138190d = 15000;

    private C60808d() {
    }

    static {
        Covode.recordClassIndex(71365);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.d$a */
    public static final class C60809a {

        /* renamed from: a */
        public final MusicAwemeList f138191a;

        /* renamed from: b */
        public final long f138192b;

        static {
            Covode.recordClassIndex(71366);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60809a)) {
                return false;
            }
            C60809a aVar = (C60809a) obj;
            return C89219l.m154714a(this.f138191a, aVar.f138191a) && this.f138192b == aVar.f138192b;
        }

        public final int hashCode() {
            MusicAwemeList musicAwemeList = this.f138191a;
            int hashCode = musicAwemeList != null ? musicAwemeList.hashCode() : 0;
            long j = this.f138192b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "MusicAwemeListNode(musicAwemeList=" + this.f138191a + ", timeStamp=" + this.f138192b + ")";
        }

        public C60809a(MusicAwemeList musicAwemeList, long j) {
            C89219l.m154721d(musicAwemeList, "");
            this.f138191a = musicAwemeList;
            this.f138192b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.d$b */
    public static final class C60810b {

        /* renamed from: a */
        public final MusicDetail f138193a;

        /* renamed from: b */
        public final long f138194b;

        static {
            Covode.recordClassIndex(71367);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60810b)) {
                return false;
            }
            C60810b bVar = (C60810b) obj;
            return C89219l.m154714a(this.f138193a, bVar.f138193a) && this.f138194b == bVar.f138194b;
        }

        public final int hashCode() {
            MusicDetail musicDetail = this.f138193a;
            int hashCode = musicDetail != null ? musicDetail.hashCode() : 0;
            long j = this.f138194b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "MusicDetailNode(musicDetail=" + this.f138193a + ", timeStamp=" + this.f138194b + ")";
        }

        public C60810b(MusicDetail musicDetail, long j) {
            C89219l.m154721d(musicDetail, "");
            this.f138193a = musicDetail;
            this.f138194b = j;
        }
    }

    /* renamed from: a */
    public static MusicDetail m110396a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C60810b a = f138187a.mo2091a(str + '&' + str2);
        if (a == null || System.currentTimeMillis() - a.f138194b >= ((long) f138190d)) {
            return null;
        }
        return a.f138193a;
    }

    /* renamed from: b */
    public static long m110397b(String str, long j, int i, int i2) {
        C89219l.m154721d(str, "");
        C60809a a = f138188b.mo2091a(str + '&' + j + '&' + 20 + '&' + i2);
        if (a != null) {
            return a.f138192b;
        }
        return -1;
    }

    /* renamed from: a */
    public static MusicAwemeList m110395a(String str, long j, int i, int i2) {
        C60809a a;
        C89219l.m154721d(str, "");
        if (j == 0 && (a = f138188b.mo2091a(str + '&' + j + '&' + 20 + '&' + i2)) != null && System.currentTimeMillis() - a.f138192b < ((long) f138190d)) {
            return a.f138191a;
        }
        return null;
    }
}
