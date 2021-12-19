package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.d */
public class C89414d extends C89409ab {

    /* renamed from: d */
    public static final long f203077d;

    /* renamed from: e */
    public static final long f203078e;

    /* renamed from: f */
    public static C89414d f203079f;

    /* renamed from: g */
    public static final C89415a f203080g = new C89415a((byte) 0);

    /* renamed from: a */
    private boolean f203081a;

    /* renamed from: b */
    public C89414d f203082b;

    /* renamed from: c */
    public long f203083c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo50807a() {
    }

    /* renamed from: k.d$a */
    public static final class C89415a {
        static {
            Covode.recordClassIndex(105499);
        }

        private C89415a() {
        }

        public /* synthetic */ C89415a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m155011a(C89414d dVar) {
            MethodCollector.m26663i(5332);
            synchronized (C89414d.class) {
                try {
                    for (C89414d dVar2 = C89414d.f203079f; dVar2 != null; dVar2 = dVar2.f203082b) {
                        if (dVar2.f203082b == dVar) {
                            dVar2.f203082b = dVar.f203082b;
                            dVar.f203082b = null;
                            MethodCollector.m26664o(5332);
                            return false;
                        }
                    }
                    MethodCollector.m26664o(5332);
                    return true;
                } catch (Throwable th) {
                    MethodCollector.m26664o(5332);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public static void m155010a(C89414d dVar, long j, boolean z) {
            MethodCollector.m26663i(5330);
            synchronized (C89414d.class) {
                try {
                    if (C89414d.f203079f == null) {
                        C89414d.f203079f = new C89414d();
                        new C89416b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j != 0 && z) {
                        dVar.f203083c = Math.min(j, dVar.mo143781R_() - nanoTime) + nanoTime;
                    } else if (j != 0) {
                        dVar.f203083c = j + nanoTime;
                    } else if (z) {
                        dVar.f203083c = dVar.mo143781R_();
                    } else {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(5330);
                        throw assertionError;
                    }
                    long j2 = dVar.f203083c - nanoTime;
                    C89414d dVar2 = C89414d.f203079f;
                    if (dVar2 == null) {
                        C89219l.m154707a();
                    }
                    while (dVar2.f203082b != null) {
                        C89414d dVar3 = dVar2.f203082b;
                        if (dVar3 == null) {
                            C89219l.m154707a();
                        }
                        if (j2 < dVar3.f203083c - nanoTime) {
                            break;
                        }
                        dVar2 = dVar2.f203082b;
                        if (dVar2 == null) {
                            C89219l.m154707a();
                        }
                    }
                    dVar.f203082b = dVar2.f203082b;
                    dVar2.f203082b = dVar;
                    if (dVar2 == C89414d.f203079f) {
                        C89414d.class.notify();
                    }
                } finally {
                    MethodCollector.m26664o(5330);
                }
            }
        }
    }

    /* renamed from: k.d$c */
    public static final class C89417c implements AbstractC89447y {

        /* renamed from: a */
        public final /* synthetic */ C89414d f203084a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89447y f203085b;

        static {
            Covode.recordClassIndex(105501);
        }

        @Override // p4632k.AbstractC89447y
        public final /* bridge */ /* synthetic */ C89409ab timeout() {
            return this.f203084a;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f203085b + ')';
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f203084a.mo143791c();
            try {
                this.f203085b.close();
                this.f203084a.mo143789a(true);
            } catch (IOException e) {
                throw this.f203084a.mo143790b(e);
            } catch (Throwable th) {
                this.f203084a.mo143789a(false);
                throw th;
            }
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            this.f203084a.mo143791c();
            try {
                this.f203085b.flush();
                this.f203084a.mo143789a(true);
            } catch (IOException e) {
                throw this.f203084a.mo143790b(e);
            } catch (Throwable th) {
                this.f203084a.mo143789a(false);
                throw th;
            }
        }

        C89417c(C89414d dVar, AbstractC89447y yVar) {
            this.f203084a = dVar;
            this.f203085b = yVar;
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            long j2 = j;
            C89219l.m154719c(fVar, "");
            C89413c.m155000a(fVar.f203091b, 0, j2);
            while (true) {
                long j3 = 0;
                if (j2 > 0) {
                    C89443v vVar = fVar.f203090a;
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    while (true) {
                        j3 += (long) (vVar.f203133c - vVar.f203132b);
                        if (j3 < j2) {
                            vVar = vVar.f203136f;
                            if (vVar == null) {
                                C89219l.m154707a();
                            }
                            if (j3 >= 65536) {
                                break;
                            }
                        } else {
                            j3 = j2;
                            break;
                        }
                    }
                    this.f203084a.mo143791c();
                    try {
                        this.f203085b.mo22060a(fVar, j3);
                        j2 -= j3;
                        this.f203084a.mo143789a(true);
                    } catch (IOException e) {
                        throw this.f203084a.mo143790b(e);
                    } catch (Throwable th) {
                        this.f203084a.mo143789a(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k.d$d */
    public static final class C89418d implements AbstractC89408aa {

        /* renamed from: a */
        public final /* synthetic */ C89414d f203086a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89408aa f203087b;

        static {
            Covode.recordClassIndex(105502);
        }

        @Override // p4632k.AbstractC89408aa
        public final /* bridge */ /* synthetic */ C89409ab timeout() {
            return this.f203086a;
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f203087b.close();
                this.f203086a.mo143789a(true);
            } catch (IOException e) {
                throw this.f203086a.mo143790b(e);
            } catch (Throwable th) {
                this.f203086a.mo143789a(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f203087b + ')';
        }

        C89418d(C89414d dVar, AbstractC89408aa aaVar) {
            this.f203086a = dVar;
            this.f203087b = aaVar;
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            C89219l.m154719c(fVar, "");
            this.f203086a.mo143791c();
            try {
                long read = this.f203087b.read(fVar, j);
                this.f203086a.mo143789a(true);
                return read;
            } catch (IOException e) {
                throw this.f203086a.mo143790b(e);
            } catch (Throwable th) {
                this.f203086a.mo143789a(false);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k.d$b */
    public static final class C89416b extends Thread {
        static {
            Covode.recordClassIndex(105500);
        }

        public C89416b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0071, code lost:
            if (r3 == null) goto L_0x0005;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
            r3.mo50807a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: p4632k.C89414d.C89416b.run():void");
        }
    }

    /* renamed from: d */
    public final boolean mo143792d() {
        if (!this.f203081a) {
            return false;
        }
        this.f203081a = false;
        return C89415a.m155011a(this);
    }

    static {
        Covode.recordClassIndex(105498);
        long millis = TimeUnit.SECONDS.toMillis(60);
        f203077d = millis;
        f203078e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: c */
    public final void mo143791c() {
        if (!this.f203081a) {
            long P_ = mo143779P_();
            boolean Q_ = mo143780Q_();
            if (P_ != 0 || Q_) {
                this.f203081a = true;
                C89415a.m155010a(this, P_, Q_);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IOException mo50806a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public final AbstractC89408aa mo143787a(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        return new C89418d(this, aaVar);
    }

    /* renamed from: b */
    public final IOException mo143790b(IOException iOException) {
        C89219l.m154719c(iOException, "");
        if (!mo143792d()) {
            return iOException;
        }
        return mo50806a(iOException);
    }

    /* renamed from: a */
    public final AbstractC89447y mo143788a(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        return new C89417c(this, yVar);
    }

    /* renamed from: a */
    public final void mo143789a(boolean z) {
        if (mo143792d() && z) {
            throw mo50806a((IOException) null);
        }
    }
}
