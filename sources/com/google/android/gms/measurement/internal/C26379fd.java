package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.fd */
public final class C26379fd<V> extends FutureTask<V> implements Comparable<C26379fd<V>> {

    /* renamed from: a */
    final boolean f61984a;

    /* renamed from: b */
    private final long f61985b;

    /* renamed from: c */
    private final String f61986c;

    /* renamed from: d */
    private final /* synthetic */ C26372ex f61987d;

    static {
        Covode.recordClassIndex(31801);
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f61987d.mo43016q().f61827c.mo43170a(this.f61986c, th);
        if (th instanceof C26376fa) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        C26379fd fdVar = (C26379fd) obj;
        boolean z = this.f61984a;
        if (z == fdVar.f61984a) {
            long j = this.f61985b;
            long j2 = fdVar.f61985b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            this.f61987d.mo43016q().f61828d.mo43170a("Two tasks share the same index. index", Long.valueOf(this.f61985b));
            return 0;
        } else if (z) {
            return -1;
        } else {
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26379fd(C26372ex exVar, Runnable runnable, String str) {
        super(runnable, null);
        this.f61987d = exVar;
        C25565r.m49314a((Object) str);
        long andIncrement = C26372ex.f61958f.getAndIncrement();
        this.f61985b = andIncrement;
        this.f61986c = str;
        this.f61984a = false;
        if (andIncrement == Long.MAX_VALUE) {
            exVar.mo43016q().f61827c.mo43169a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26379fd(C26372ex exVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f61987d = exVar;
        C25565r.m49314a((Object) str);
        long andIncrement = C26372ex.f61958f.getAndIncrement();
        this.f61985b = andIncrement;
        this.f61986c = str;
        this.f61984a = z;
        if (andIncrement == Long.MAX_VALUE) {
            exVar.mo43016q().f61827c.mo43169a("Tasks index overflow");
        }
    }
}
