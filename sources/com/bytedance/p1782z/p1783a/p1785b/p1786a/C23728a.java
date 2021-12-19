package com.bytedance.p1782z.p1783a.p1785b.p1786a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;

/* renamed from: com.bytedance.z.a.b.a.a */
public final class C23728a {

    /* renamed from: a */
    public AbstractC23724c f56154a;

    /* renamed from: b */
    private boolean f56155b;

    /* renamed from: c */
    private long f56156c;

    static {
        Covode.recordClassIndex(27833);
    }

    /* renamed from: a */
    public final boolean mo39175a() {
        m44856b();
        return this.f56155b;
    }

    /* renamed from: b */
    private void m44856b() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f56156c;
        if (j == 0 || elapsedRealtime - j >= 5000) {
            this.f56156c = elapsedRealtime;
            float f = this.f56154a.mo39169f();
            int e = this.f56154a.mo39168e();
            int d = this.f56154a.mo39167d();
            boolean z2 = false;
            if (f > ((float) this.f56154a.mo39163a().f56116d)) {
                z = false;
            } else {
                z = true;
            }
            if (e < this.f56154a.mo39163a().f56117e) {
                z = false;
            }
            if (d != 1) {
                z2 = z;
            }
            this.f56155b = z2;
        }
    }

    public C23728a(AbstractC23724c cVar) {
        this.f56154a = cVar;
    }
}
