package androidx.core.p033d;

import android.os.Build;
import android.os.CancellationSignal;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.d.a */
public final class C0646a {

    /* renamed from: a */
    public boolean f2644a;

    /* renamed from: b */
    public AbstractC0647a f2645b;

    /* renamed from: c */
    public boolean f2646c;

    /* renamed from: d */
    private Object f2647d;

    /* renamed from: androidx.core.d.a$a */
    public interface AbstractC0647a {
        static {
            Covode.recordClassIndex(726);
        }

        /* renamed from: a */
        void mo2678a();
    }

    static {
        Covode.recordClassIndex(725);
    }

    /* renamed from: a */
    public final boolean mo2675a() {
        boolean z;
        synchronized (this) {
            z = this.f2644a;
        }
        return z;
    }

    /* renamed from: c */
    public final Object mo2677c() {
        Object obj;
        int i = Build.VERSION.SDK_INT;
        synchronized (this) {
            if (this.f2647d == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f2647d = cancellationSignal;
                if (this.f2644a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f2647d;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.mo2678a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
        ((android.os.CancellationSignal) r2).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.f2646c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.f2646c = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2676b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2644a     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            return
        L_0x0007:
            r0 = 1
            r3.f2644a = r0     // Catch:{ all -> 0x003a }
            r3.f2646c = r0     // Catch:{ all -> 0x003a }
            androidx.core.d.a$a r0 = r3.f2645b     // Catch:{ all -> 0x003a }
            java.lang.Object r2 = r3.f2647d     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            r0.mo2678a()     // Catch:{ all -> 0x0023 }
        L_0x0017:
            if (r2 == 0) goto L_0x002f
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0023 }
            r0 = 16
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2     // Catch:{ all -> 0x0023 }
            r2.cancel()     // Catch:{ all -> 0x0023 }
            goto L_0x002f
        L_0x0023:
            r0 = move-exception
            monitor-enter(r3)
            r3.f2646c = r1     // Catch:{ all -> 0x002c }
            r3.notifyAll()     // Catch:{ all -> 0x002c }
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002f:
            monitor-enter(r3)
            r3.f2646c = r1     // Catch:{ all -> 0x0037 }
            r3.notifyAll()     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p033d.C0646a.mo2676b():void");
    }
}
