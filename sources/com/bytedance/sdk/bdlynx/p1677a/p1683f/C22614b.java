package com.bytedance.sdk.bdlynx.p1677a.p1683f;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22599d;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.bdlynx.a.f.b */
public final class C22614b {

    /* renamed from: a */
    private AtomicLong f53425a = new AtomicLong(0);

    /* renamed from: b */
    private AtomicLong f53426b;

    /* renamed from: c */
    private volatile long f53427c;

    static {
        Covode.recordClassIndex(26430);
    }

    /* renamed from: b */
    public static long m42648b() {
        return SystemClock.uptimeMillis();
    }

    public C22614b() {
        AtomicLong atomicLong = new AtomicLong(-1);
        this.f53426b = atomicLong;
        this.f53427c = atomicLong.get();
    }

    /* renamed from: a */
    public static C22614b m42647a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        C22614b bVar = new C22614b();
        if (bVar.f53426b.compareAndSet(-1, uptimeMillis)) {
            bVar.f53425a.set(0);
            bVar.f53427c = bVar.f53426b.get();
            C22599d.m42634b("TimeMeter", "start: success " + bVar.f53426b);
        } else {
            C22599d.m42634b("TimeMeter", "start: fail " + bVar.f53426b);
        }
        bVar.f53426b.get();
        return bVar;
    }

    /* renamed from: a */
    public static long m42645a(long j) {
        return SystemClock.uptimeMillis() - j;
    }

    /* renamed from: a */
    public static long m42646a(C22614b bVar) {
        long j;
        if (bVar == null) {
            return 0;
        }
        long j2 = bVar.f53426b.get();
        if (-1 != j2) {
            j = SystemClock.uptimeMillis() - j2;
        } else {
            j = 0;
        }
        if (bVar.f53425a.compareAndSet(0, j)) {
            bVar.f53426b.set(-1);
            C22599d.m42634b("TimeMeter", "stop: success " + bVar.f53425a);
        } else {
            C22599d.m42634b("TimeMeter", "stop: fail " + bVar.f53425a);
        }
        return bVar.f53425a.get();
    }
}
