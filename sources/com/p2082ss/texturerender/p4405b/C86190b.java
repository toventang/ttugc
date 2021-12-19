package com.p2082ss.texturerender.p4405b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.texturerender.C86203l;

/* renamed from: com.ss.texturerender.b.b */
public final class C86190b {

    /* renamed from: a */
    private long f192277a;

    /* renamed from: b */
    private long f192278b;

    /* renamed from: c */
    private int f192279c = 3;

    /* renamed from: d */
    private boolean f192280d;

    static {
        Covode.recordClassIndex(101333);
    }

    /* renamed from: a */
    public final synchronized void mo136499a() {
        MethodCollector.m26663i(5265);
        this.f192279c = 1;
        MethodCollector.m26664o(5265);
    }

    /* renamed from: b */
    public final synchronized void mo136501b() {
        MethodCollector.m26663i(5269);
        this.f192279c = 2;
        this.f192278b = 0;
        MethodCollector.m26664o(5269);
    }

    /* renamed from: c */
    public final synchronized void mo136502c() {
        MethodCollector.m26663i(5271);
        this.f192279c = 3;
        this.f192278b = 0;
        this.f192280d = false;
        this.f192277a = 0;
        MethodCollector.m26664o(5271);
    }

    /* renamed from: d */
    public final synchronized long mo136503d() {
        long j;
        MethodCollector.m26663i(5484);
        long j2 = this.f192277a;
        long j3 = 0;
        if (this.f192278b > 0 && this.f192279c == 1) {
            j3 = SystemClock.elapsedRealtime() - this.f192278b;
        }
        j = j2 + j3;
        MethodCollector.m26664o(5484);
        return j;
    }

    /* renamed from: a */
    public final synchronized void mo136500a(long j) {
        MethodCollector.m26663i(5368);
        C86203l.m148116a("NormalClock", "updateClock masetr:" + j + " mIsUpdated:" + this.f192280d + " mStatus:" + this.f192279c);
        if (!this.f192280d) {
            this.f192280d = true;
            this.f192279c = 1;
        }
        if (this.f192279c == 1) {
            this.f192277a = j;
            this.f192278b = SystemClock.elapsedRealtime();
        }
        MethodCollector.m26664o(5368);
    }
}
