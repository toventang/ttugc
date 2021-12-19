package com.p2082ss.ttvideoengine.p4430s;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttvideoengine.s.d */
public final class C86634d {

    /* renamed from: a */
    private int f195256a = 2;

    /* renamed from: b */
    private int f195257b;

    /* renamed from: c */
    private long f195258c;

    static {
        Covode.recordClassIndex(101862);
    }

    /* renamed from: a */
    public final void mo137903a() {
        if (this.f195256a == 2) {
            this.f195256a = 1;
            this.f195258c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: d */
    public final void mo137906d() {
        this.f195257b = 0;
        if (this.f195256a == 1) {
            this.f195258c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public final void mo137907e() {
        this.f195256a = 2;
        this.f195257b = 0;
        this.f195258c = 0;
    }

    /* renamed from: b */
    public final void mo137904b() {
        if (this.f195256a == 1) {
            this.f195256a = 2;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f195258c);
            if (elapsedRealtime >= 0) {
                this.f195257b += elapsedRealtime;
            }
        }
    }

    /* renamed from: c */
    public final int mo137905c() {
        if (this.f195256a == 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.f195258c);
            if (i >= 0) {
                this.f195257b += i;
            }
            this.f195258c = elapsedRealtime;
        }
        return this.f195257b;
    }
}
