package com.bytedance.android.livesdk.performance;

import com.bytedance.android.livesdk.livesetting.performance.LiveDegradeThresholdSettingSetting;
import com.bytedance.android.livesdk.model.C9524aj;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.performance.f */
public class C10093f {

    /* renamed from: a */
    C10094a f24522a = new C10094a(1);

    /* renamed from: b */
    C10094a f24523b = new C10094a(2);

    static {
        Covode.recordClassIndex(11656);
    }

    /* renamed from: com.bytedance.android.livesdk.performance.f$a */
    public static class C10094a {

        /* renamed from: a */
        private int f24524a;

        /* renamed from: b */
        private long f24525b = -1;

        /* renamed from: c */
        private long f24526c = -1;

        static {
            Covode.recordClassIndex(11657);
        }

        /* renamed from: a */
        public final void mo16958a() {
            this.f24526c = -1;
            this.f24525b = -1;
        }

        /* renamed from: c */
        private int m18625c() {
            int i;
            C9524aj.C9525a f = m18628f();
            if (f != null && (i = f.f23114b) >= 0 && i <= 1) {
                return i;
            }
            return 0;
        }

        /* renamed from: d */
        private long m18626d() {
            C9524aj.C9525a f = m18628f();
            if (f == null) {
                return 60000;
            }
            long j = f.f23113a;
            if (j > 0) {
                return j;
            }
            return 60000;
        }

        /* renamed from: e */
        private float m18627e() {
            C9524aj.C9525a f = m18628f();
            if (f == null) {
                return 40.0f;
            }
            float f2 = f.f23116d;
            if (LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f23110b) {
                return Math.max(f2, 40.0f);
            }
            return f2;
        }

        /* renamed from: f */
        private C9524aj.C9525a m18628f() {
            int i = this.f24524a;
            if (i == 1) {
                return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f23111c;
            }
            if (i == 2) {
                return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f23112d;
            }
            return null;
        }

        /* renamed from: b */
        private boolean m18624b() {
            boolean z;
            boolean z2;
            if (this.f24525b <= 0 || System.currentTimeMillis() - this.f24525b < m18626d()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f24526c <= 0 || System.currentTimeMillis() - this.f24526c < m18626d()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (m18625c() == 1) {
                if (z || z2) {
                    return true;
                }
            } else if (!z || !z2) {
                return false;
            } else {
                return true;
            }
            return false;
        }

        public C10094a(int i) {
            this.f24524a = i;
        }

        /* renamed from: a */
        public final boolean mo16960a(float f) {
            if (f <= m18627e()) {
                this.f24525b = -1;
            } else if (this.f24525b <= 0) {
                this.f24525b = System.currentTimeMillis();
            }
            return m18624b();
        }

        /* renamed from: a */
        public final boolean mo16959a(double d) {
            C9524aj.C9525a f = m18628f();
            float f2 = 47.0f;
            if (f != null) {
                float f3 = f.f23115c;
                if (LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f23110b) {
                    f3 = Math.min(f3, 47.0f);
                }
                f2 = f3;
            }
            if (d >= ((double) f2)) {
                this.f24526c = -1;
            } else if (this.f24526c <= 0) {
                this.f24526c = System.currentTimeMillis();
            }
            return m18624b();
        }
    }

    /* renamed from: a */
    static boolean m18622a() {
        return LiveDegradeThresholdSettingSetting.INSTANCE.getValue().f23109a;
    }

    /* renamed from: a */
    static void m18621a(int i) {
        C6779a.m14563a().mo13053a(new C10092e(i));
    }

    /* renamed from: a */
    public final void mo16957a(float f) {
        if (m18622a()) {
            boolean a = this.f24522a.mo16960a(f);
            if (this.f24523b.mo16960a(f)) {
                m18621a(2);
                this.f24523b.mo16958a();
                this.f24522a.mo16958a();
            } else if (a) {
                m18621a(1);
                this.f24522a.mo16958a();
            }
        }
    }
}
