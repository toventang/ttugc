package leakcanary;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import leakcanary.internal.C89843j;
import p4600h.p4611f.p4613b.C89219l;
import p4645m.C89863a;

/* renamed from: leakcanary.a */
public final class C89792a {

    /* renamed from: a */
    public static volatile C89793a f203624a;

    /* renamed from: b */
    public static final C89792a f203625b = new C89792a();

    private C89792a() {
    }

    static {
        C89793a aVar;
        Covode.recordClassIndex(105887);
        if (C89843j.m155924a()) {
            aVar = new C89793a(false, false, false, false, 0, 31);
        } else {
            aVar = new C89793a(false, false, false, false, 0, 30);
        }
        f203624a = aVar;
    }

    /* renamed from: a */
    public static void m155885a(C89793a aVar) {
        C89219l.m154719c(aVar, "");
        f203624a = aVar;
        C89863a.AbstractC89864a aVar2 = C89863a.f203762a;
        if (aVar2 != null) {
            aVar2.mo144406a("Updated AppWatcher.config to ".concat(String.valueOf(aVar)));
        }
    }

    /* renamed from: leakcanary.a$a */
    public static final class C89793a {

        /* renamed from: a */
        public final boolean f203626a;

        /* renamed from: b */
        public final boolean f203627b;

        /* renamed from: c */
        public final boolean f203628c;

        /* renamed from: d */
        public final boolean f203629d;

        /* renamed from: e */
        public final long f203630e;

        static {
            Covode.recordClassIndex(105888);
        }

        public C89793a() {
            this(false, false, false, false, 0, 31);
        }

        /* renamed from: a */
        public static /* synthetic */ C89793a m155886a(C89793a aVar, boolean z, boolean z2, boolean z3, boolean z4, long j, int i) {
            long j2 = j;
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z3;
            boolean z8 = z4;
            if ((i & 1) != 0) {
                z5 = aVar.f203626a;
            }
            if ((i & 2) != 0) {
                z6 = aVar.f203627b;
            }
            if ((i & 4) != 0) {
                z7 = aVar.f203628c;
            }
            if ((i & 8) != 0) {
                z8 = aVar.f203629d;
            }
            if ((i & 16) != 0) {
                j2 = aVar.f203630e;
            }
            return m155887a(z5, z6, z7, z8, j2);
        }

        /* renamed from: a */
        private static C89793a m155887a(boolean z, boolean z2, boolean z3, boolean z4, long j) {
            return new C89793a(z, z2, z3, z4, j);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C89793a) {
                    C89793a aVar = (C89793a) obj;
                    if (!(this.f203626a == aVar.f203626a && this.f203627b == aVar.f203627b && this.f203628c == aVar.f203628c && this.f203629d == aVar.f203629d && this.f203630e == aVar.f203630e)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f203626a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f203627b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.f203628c;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            if (!this.f203629d) {
                i = 0;
            }
            long j = this.f203630e;
            return ((i13 + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            return "Config(enabled=" + this.f203626a + ", watchActivities=" + this.f203627b + ", watchFragments=" + this.f203628c + ", watchFragmentViews=" + this.f203629d + ", watchDurationMillis=" + this.f203630e + ")";
        }

        private C89793a(boolean z, boolean z2, boolean z3, boolean z4, long j) {
            this.f203626a = z;
            this.f203627b = z2;
            this.f203628c = z3;
            this.f203629d = z4;
            this.f203630e = j;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C89793a(boolean z, boolean z2, boolean z3, boolean z4, long j, int i) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) == 0 ? z4 : true, (i & 16) != 0 ? TimeUnit.SECONDS.toMillis(5) : j);
        }
    }
}
