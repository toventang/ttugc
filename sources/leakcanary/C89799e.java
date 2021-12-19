package leakcanary;

import com.bytedance.covode.number.Covode;
import leakcanary.internal.C89843j;
import leakcanary.internal.InternalLeakCanary;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: leakcanary.e */
public final class C89799e {

    /* renamed from: a */
    public static volatile C89800a f203635a;

    /* renamed from: b */
    public static final C89799e f203636b = new C89799e();

    private C89799e() {
    }

    static {
        C89800a noInstallConfig;
        Covode.recordClassIndex(105894);
        if (C89843j.m155924a()) {
            noInstallConfig = new C89800a(false, 0, false, 0, 127);
        } else {
            noInstallConfig = InternalLeakCanary.INSTANCE.getNoInstallConfig();
        }
        f203635a = noInstallConfig;
    }

    /* renamed from: a */
    public static void m155893a(C89800a aVar) {
        C89219l.m154719c(aVar, "");
        f203635a = aVar;
    }

    /* renamed from: leakcanary.e$a */
    public static final class C89800a {

        /* renamed from: a */
        public final boolean f203637a;

        /* renamed from: b */
        public final boolean f203638b;

        /* renamed from: c */
        public final int f203639c;

        /* renamed from: d */
        public final boolean f203640d;

        /* renamed from: e */
        public final int f203641e;

        /* renamed from: f */
        public final boolean f203642f;

        /* renamed from: g */
        public final boolean f203643g;

        static {
            Covode.recordClassIndex(105895);
        }

        public C89800a() {
            this(false, 0, false, 0, 127);
        }

        /* renamed from: a */
        public static /* synthetic */ C89800a m155894a(C89800a aVar, boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5, int i3) {
            boolean z6 = z5;
            boolean z7 = z4;
            int i4 = i2;
            boolean z8 = z;
            boolean z9 = z2;
            int i5 = i;
            boolean z10 = z3;
            if ((i3 & 1) != 0) {
                z8 = aVar.f203637a;
            }
            if ((i3 & 2) != 0) {
                z9 = aVar.f203638b;
            }
            if ((i3 & 4) != 0) {
                i5 = aVar.f203639c;
            }
            if ((i3 & 8) != 0) {
                z10 = aVar.f203640d;
            }
            if ((i3 & 16) != 0) {
                i4 = aVar.f203641e;
            }
            if ((i3 & 32) != 0) {
                z7 = aVar.f203642f;
            }
            if ((i3 & 64) != 0) {
                z6 = aVar.f203643g;
            }
            return m155895a(z8, z9, i5, z10, i4, z7, z6);
        }

        /* renamed from: a */
        private static C89800a m155895a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5) {
            return new C89800a(z, z2, i, z3, i2, z4, z5);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C89800a) {
                    C89800a aVar = (C89800a) obj;
                    if (!(this.f203637a == aVar.f203637a && this.f203638b == aVar.f203638b && this.f203639c == aVar.f203639c && this.f203640d == aVar.f203640d && this.f203641e == aVar.f203641e && this.f203642f == aVar.f203642f && this.f203643g == aVar.f203643g)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.f203637a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f203638b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (((i5 + i6) * 31) + this.f203639c) * 31;
            boolean z3 = this.f203640d;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (((i9 + i10) * 31) + this.f203641e) * 31;
            boolean z4 = this.f203642f;
            if (z4) {
                z4 = true;
            }
            int i14 = z4 ? 1 : 0;
            int i15 = z4 ? 1 : 0;
            int i16 = z4 ? 1 : 0;
            int i17 = (i13 + i14) * 31;
            if (!this.f203643g) {
                i = 0;
            }
            return i17 + i;
        }

        public final String toString() {
            return "Config(dumpHeap=" + this.f203637a + ", dumpHeapWhenDebugging=" + this.f203638b + ", retainedVisibleThreshold=" + this.f203639c + ", computeRetainedHeapSize=" + this.f203640d + ", maxStoredHeapDumps=" + this.f203641e + ", requestWriteExternalStoragePermission=" + this.f203642f + ", useExperimentalLeakFinders=" + this.f203643g + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C89800a(boolean z, int i, boolean z2, int i2, int i3) {
            this((i3 & 1) != 0 ? true : z, false, (i3 & 4) != 0 ? 5 : i, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? 7 : i2, false, false);
        }

        private C89800a(boolean z, boolean z2, int i, boolean z3, int i2, boolean z4, boolean z5) {
            this.f203637a = z;
            this.f203638b = z2;
            this.f203639c = i;
            this.f203640d = z3;
            this.f203641e = i2;
            this.f203642f = z4;
            this.f203643g = z5;
        }
    }
}
