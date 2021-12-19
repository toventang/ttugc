package com.p2082ss.android.ugc.aweme.question.p3659a;

import androidx.p025c.C0490e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.question.C66504c;
import com.p2082ss.android.ugc.aweme.question.api.C66500a;
import com.p2082ss.android.ugc.aweme.question.api.C66501b;
import com.p2082ss.android.ugc.aweme.question.p3663e.C66520a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.a.a */
public final class C66497a {

    /* renamed from: a */
    public static int f149484a = 15000;

    /* renamed from: b */
    public static final C0490e<String, C66498a> f149485b = new C0490e<>(32);

    /* renamed from: c */
    public static final C66497a f149486c = new C66497a();

    /* renamed from: d */
    private static final C0490e<String, C66499b> f149487d = new C0490e<>(32);

    private C66497a() {
    }

    static {
        Covode.recordClassIndex(78038);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.a.a$a */
    public static final class C66498a {

        /* renamed from: a */
        public final C66500a f149488a;

        /* renamed from: b */
        public final long f149489b;

        static {
            Covode.recordClassIndex(78039);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66498a)) {
                return false;
            }
            C66498a aVar = (C66498a) obj;
            return C89219l.m154714a(this.f149488a, aVar.f149488a) && this.f149489b == aVar.f149489b;
        }

        public final int hashCode() {
            C66500a aVar = this.f149488a;
            int hashCode = aVar != null ? aVar.hashCode() : 0;
            long j = this.f149489b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "QuestionDetailNode(questionDetail=" + this.f149488a + ", timestamp=" + this.f149489b + ")";
        }

        public C66498a(C66500a aVar, long j) {
            C89219l.m154721d(aVar, "");
            this.f149488a = aVar;
            this.f149489b = j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.a.a$b */
    public static final class C66499b {

        /* renamed from: a */
        public final C66501b f149490a;

        /* renamed from: b */
        public final long f149491b;

        static {
            Covode.recordClassIndex(78040);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C66499b)) {
                return false;
            }
            C66499b bVar = (C66499b) obj;
            return C89219l.m154714a(this.f149490a, bVar.f149490a) && this.f149491b == bVar.f149491b;
        }

        public final int hashCode() {
            C66501b bVar = this.f149490a;
            int hashCode = bVar != null ? bVar.hashCode() : 0;
            long j = this.f149491b;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "QuestionVideosNode(questionVideos=" + this.f149490a + ", timestamp=" + this.f149491b + ")";
        }

        public C66499b(C66501b bVar, long j) {
            C89219l.m154721d(bVar, "");
            this.f149490a = bVar;
            this.f149491b = j;
        }
    }

    /* renamed from: a */
    public static void m118248a(C66520a.C66522a aVar, C66501b bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        m118247a(aVar.f149578c, aVar.f149577b, aVar.f149576a, bVar, aVar.f149579d);
    }

    /* renamed from: a */
    public static C66501b m118246a(long j, int i, int i2, C66504c cVar) {
        int i3;
        Integer videosCount;
        if (i != 0) {
            return null;
        }
        C0490e<String, C66499b> eVar = f149487d;
        StringBuilder append = new StringBuilder().append(j).append('&').append(i).append('&').append(20).append('&');
        if (cVar == null || (videosCount = cVar.getVideosCount()) == null) {
            i3 = -1;
        } else {
            i3 = videosCount.intValue();
        }
        C66499b a = eVar.mo2091a(append.append(i3).toString());
        if (a == null || System.currentTimeMillis() - a.f149491b >= ((long) f149484a)) {
            return null;
        }
        return a.f149490a;
    }

    /* renamed from: a */
    private static void m118247a(long j, int i, int i2, C66501b bVar, C66504c cVar) {
        int i3;
        Integer videosCount;
        if (i == 0) {
            C0490e<String, C66499b> eVar = f149487d;
            StringBuilder append = new StringBuilder().append(j).append('&').append(i).append('&').append(i2).append('&');
            if (cVar == null || (videosCount = cVar.getVideosCount()) == null) {
                i3 = -1;
            } else {
                i3 = videosCount.intValue();
            }
            eVar.mo2092a(append.append(i3).toString(), new C66499b(bVar, System.currentTimeMillis()));
        }
    }
}
