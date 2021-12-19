package com.facebook.imagepipeline.p1889n;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.n.v */
public final class C24618v {

    /* renamed from: a */
    final Executor f58507a;

    /* renamed from: b */
    final AbstractC24622a f58508b;

    /* renamed from: c */
    final Runnable f58509c = new Runnable() {
        /* class com.facebook.imagepipeline.p1889n.C24618v.RunnableC246191 */

        static {
            Covode.recordClassIndex(28763);
        }

        public final void run() {
            C24456e eVar;
            int i;
            MethodCollector.m26663i(4095);
            C24618v vVar = C24618v.this;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (vVar) {
                try {
                    eVar = vVar.f58510d;
                    i = vVar.f58511e;
                    vVar.f58510d = null;
                    vVar.f58511e = 0;
                    vVar.f58512f = EnumC24624c.RUNNING;
                    vVar.f58514h = uptimeMillis;
                } catch (Throwable th) {
                    MethodCollector.m26664o(4095);
                    throw th;
                }
            }
            try {
                if (C24618v.m47117b(eVar, i)) {
                    vVar.f58508b.mo40422a(eVar, i);
                }
            } finally {
                C24456e.m46681d(eVar);
                vVar.mo40459c();
                MethodCollector.m26664o(4095);
            }
        }
    };

    /* renamed from: d */
    C24456e f58510d = null;

    /* renamed from: e */
    int f58511e = 0;

    /* renamed from: f */
    EnumC24624c f58512f = EnumC24624c.IDLE;

    /* renamed from: g */
    long f58513g = 0;

    /* renamed from: h */
    long f58514h = 0;

    /* renamed from: i */
    private final Runnable f58515i = new Runnable() {
        /* class com.facebook.imagepipeline.p1889n.C24618v.RunnableC246202 */

        static {
            Covode.recordClassIndex(28764);
        }

        public final void run() {
            C24618v vVar = C24618v.this;
            vVar.f58507a.execute(vVar.f58509c);
        }
    };

    /* renamed from: j */
    private final int f58516j;

    /* renamed from: com.facebook.imagepipeline.n.v$a */
    public interface AbstractC24622a {
        static {
            Covode.recordClassIndex(28766);
        }

        /* renamed from: a */
        void mo40422a(C24456e eVar, int i);
    }

    static {
        Covode.recordClassIndex(28762);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.v$b */
    public static class C24623b {

        /* renamed from: a */
        private static ScheduledExecutorService f58520a;

        static {
            Covode.recordClassIndex(28767);
        }

        /* renamed from: a */
        static ScheduledExecutorService m47124a() {
            if (f58520a == null) {
                f58520a = m47125b();
            }
            return f58520a;
        }

        /* renamed from: b */
        private static ScheduledExecutorService m47125b() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
            a.f95505c = 1;
            return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: d */
    public final synchronized long mo40460d() {
        long j;
        MethodCollector.m26663i(4443);
        j = this.f58514h - this.f58513g;
        MethodCollector.m26664o(4443);
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.v$3 */
    public static /* synthetic */ class C246213 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58519a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28765(0x705d, float:4.0308E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.imagepipeline.n.v$c[] r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.imagepipeline.p1889n.C24618v.C246213.f58519a = r2
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.IDLE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.imagepipeline.p1889n.C24618v.C246213.f58519a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.QUEUED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.imagepipeline.p1889n.C24618v.C246213.f58519a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.RUNNING     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.imagepipeline.p1889n.C24618v.C246213.f58519a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24618v.C246213.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.n.v$c */
    public enum EnumC24624c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING;

        static {
            Covode.recordClassIndex(28768);
        }
    }

    /* renamed from: a */
    public final void mo40456a() {
        C24456e eVar;
        MethodCollector.m26663i(4435);
        synchronized (this) {
            try {
                eVar = this.f58510d;
                this.f58510d = null;
                this.f58511e = 0;
            } catch (Throwable th) {
                MethodCollector.m26664o(4435);
                throw th;
            }
        }
        C24456e.m46681d(eVar);
        MethodCollector.m26664o(4435);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo40459c() {
        long j;
        boolean z;
        MethodCollector.m26663i(4442);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (this.f58512f == EnumC24624c.RUNNING_AND_PENDING) {
                    j = Math.max(this.f58514h + ((long) this.f58516j), uptimeMillis);
                    z = true;
                    this.f58513g = uptimeMillis;
                    this.f58512f = EnumC24624c.QUEUED;
                } else {
                    this.f58512f = EnumC24624c.IDLE;
                    j = 0;
                    z = false;
                }
            } finally {
                MethodCollector.m26664o(4442);
            }
        }
        if (z) {
            m47116a(j - uptimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r7 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        m47116a(r4 - r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4438);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40458b() {
        /*
            r9 = this;
            r8 = 4438(0x1156, float:6.219E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r9)
            com.facebook.imagepipeline.j.e r1 = r9.f58510d     // Catch:{ all -> 0x004e }
            int r0 = r9.f58511e     // Catch:{ all -> 0x004e }
            boolean r0 = m47117b(r1, r0)     // Catch:{ all -> 0x004e }
            r7 = 0
            if (r0 != 0) goto L_0x001a
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r7
        L_0x001a:
            int[] r1 = com.facebook.imagepipeline.p1889n.C24618v.C246213.f58519a
            com.facebook.imagepipeline.n.v$c r0 = r9.f58512f
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r6 = 1
            if (r1 == r6) goto L_0x0032
            r0 = 3
            if (r1 == r0) goto L_0x002d
        L_0x002a:
            r4 = 0
            goto L_0x0043
        L_0x002d:
            com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.RUNNING_AND_PENDING
            r9.f58512f = r0
            goto L_0x002a
        L_0x0032:
            long r4 = r9.f58514h
            int r0 = r9.f58516j
            long r0 = (long) r0
            long r4 = r4 + r0
            long r4 = java.lang.Math.max(r4, r2)
            r9.f58513g = r2
            com.facebook.imagepipeline.n.v$c r0 = com.facebook.imagepipeline.p1889n.C24618v.EnumC24624c.QUEUED
            r9.f58512f = r0
            r7 = 1
        L_0x0043:
            monitor-exit(r9)
            if (r7 == 0) goto L_0x004a
            long r4 = r4 - r2
            r9.m47116a(r4)
        L_0x004a:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            return r6
        L_0x004e:
            r0 = move-exception
            monitor-exit(r9)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p1889n.C24618v.mo40458b():boolean");
    }

    /* renamed from: a */
    private void m47116a(long j) {
        if (j > 0) {
            C24623b.m47124a().schedule(this.f58515i, j, TimeUnit.MILLISECONDS);
        } else {
            this.f58515i.run();
        }
    }

    /* renamed from: b */
    static boolean m47117b(C24456e eVar, int i) {
        if (AbstractC24574b.m46992a(i) || AbstractC24574b.m46993a(i, 4) || C24456e.m46682e(eVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo40457a(C24456e eVar, int i) {
        C24456e eVar2;
        MethodCollector.m26663i(4437);
        if (!m47117b(eVar, i)) {
            MethodCollector.m26664o(4437);
            return false;
        }
        synchronized (this) {
            try {
                eVar2 = this.f58510d;
                this.f58510d = C24456e.m46679a(eVar);
                this.f58511e = i;
            } catch (Throwable th) {
                MethodCollector.m26664o(4437);
                throw th;
            }
        }
        C24456e.m46681d(eVar2);
        MethodCollector.m26664o(4437);
        return true;
    }

    public C24618v(Executor executor, AbstractC24622a aVar, int i) {
        this.f58507a = executor;
        this.f58508b = aVar;
        this.f58516j = i;
    }
}
