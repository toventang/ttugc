package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89414d;
import p4632k.C89420f;

/* renamed from: com.squareup.a.a.a.e */
public final class C29119e {

    /* renamed from: l */
    static final /* synthetic */ boolean f68865l = true;

    /* renamed from: a */
    long f68866a;

    /* renamed from: b */
    long f68867b;

    /* renamed from: c */
    public final int f68868c;

    /* renamed from: d */
    public final C29104d f68869d;

    /* renamed from: e */
    public final List<C29123f> f68870e;

    /* renamed from: f */
    List<C29123f> f68871f;

    /* renamed from: g */
    public final C29121b f68872g;

    /* renamed from: h */
    final C29120a f68873h;

    /* renamed from: i */
    public final C29122c f68874i = new C29122c();

    /* renamed from: j */
    public final C29122c f68875j = new C29122c();

    /* renamed from: k */
    public EnumC29100a f68876k = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.a.e$a */
    public final class C29120a implements AbstractC89447y {

        /* renamed from: c */
        static final /* synthetic */ boolean f68877c = true;

        /* renamed from: a */
        public boolean f68878a;

        /* renamed from: b */
        public boolean f68879b;

        /* renamed from: e */
        private final C89420f f68881e = new C89420f();

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return C29119e.this.f68875j;
        }

        static {
            Covode.recordClassIndex(35469);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r13.f68880d.f68873h.f68879b != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r13.f68881e.f203091b <= 0) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r13.f68881e.f203091b <= 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            m58153a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            r13.f68880d.f68869d.mo50781a(r13.f68880d.f68868c, true, (p4632k.C89420f) null, 0L);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
            r1 = r13.f68880d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r13.f68878a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            r13.f68880d.f68869d.mo50785b();
            r13.f68880d.mo50801f();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4462);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4462);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
            throw r0;
         */
        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2077a.C29119e.C29120a.close():void");
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            MethodCollector.m26663i(4460);
            if (f68877c || !Thread.holdsLock(C29119e.this)) {
                synchronized (C29119e.this) {
                    try {
                        C29119e.this.mo50802g();
                    } finally {
                        MethodCollector.m26664o(4460);
                    }
                }
                while (this.f68881e.f203091b > 0) {
                    m58153a(false);
                    C29119e.this.f68869d.mo50785b();
                }
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(4460);
            throw assertionError;
        }

        C29120a() {
        }

        /* renamed from: a */
        private void m58153a(boolean z) {
            long min;
            boolean z2;
            MethodCollector.m26663i(4455);
            synchronized (C29119e.this) {
                try {
                    C29119e.this.f68875j.mo143791c();
                    while (C29119e.this.f68867b <= 0 && !this.f68879b && !this.f68878a && C29119e.this.f68876k == null) {
                        try {
                            C29119e.this.mo50803h();
                        } finally {
                            C29119e.this.f68875j.mo50808b();
                            MethodCollector.m26664o(4455);
                        }
                    }
                    C29119e.this.f68875j.mo50808b();
                    C29119e.this.mo50802g();
                    min = Math.min(C29119e.this.f68867b, this.f68881e.f203091b);
                    C29119e.this.f68867b -= min;
                } catch (Throwable th) {
                    MethodCollector.m26664o(4455);
                    throw th;
                }
            }
            C29119e.this.f68875j.mo143791c();
            try {
                C29104d dVar = C29119e.this.f68869d;
                int i = C29119e.this.f68868c;
                if (!z || min != this.f68881e.f203091b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dVar.mo50781a(i, z2, this.f68881e, min);
            } finally {
                C29119e.this.f68875j.mo50808b();
                MethodCollector.m26664o(4455);
            }
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (f68877c || !Thread.holdsLock(C29119e.this)) {
                this.f68881e.mo22060a(fVar, j);
                while (this.f68881e.f203091b >= 16384) {
                    m58153a(false);
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.a.e$b */
    public final class C29121b implements AbstractC89408aa {

        /* renamed from: c */
        static final /* synthetic */ boolean f68882c = true;

        /* renamed from: a */
        public boolean f68883a;

        /* renamed from: b */
        public boolean f68884b;

        /* renamed from: e */
        private final C89420f f68886e;

        /* renamed from: f */
        private final C89420f f68887f;

        /* renamed from: g */
        private final long f68888g;

        @Override // p4632k.AbstractC89408aa
        public final C89409ab timeout() {
            return C29119e.this.f68874i;
        }

        static {
            Covode.recordClassIndex(35470);
        }

        /* renamed from: a */
        private void m58155a() {
            C29119e.this.f68874i.mo143791c();
            while (this.f68887f.f203091b == 0 && !this.f68884b && !this.f68883a && C29119e.this.f68876k == null) {
                try {
                    C29119e.this.mo50803h();
                } finally {
                    C29119e.this.f68874i.mo50808b();
                }
            }
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MethodCollector.m26663i(4686);
            synchronized (C29119e.this) {
                try {
                    this.f68883a = true;
                    this.f68887f.mo143854v();
                    C29119e.this.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.m26664o(4686);
                    throw th;
                }
            }
            C29119e.this.mo50801f();
            MethodCollector.m26664o(4686);
        }

        private C29121b(long j) {
            this.f68886e = new C89420f();
            this.f68887f = new C89420f();
            this.f68888g = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo50804a(AbstractC89426h hVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            MethodCollector.m26663i(4656);
            if (f68882c || !Thread.holdsLock(C29119e.this)) {
                while (j > 0) {
                    synchronized (C29119e.this) {
                        try {
                            z = this.f68884b;
                            z2 = true;
                            if (this.f68887f.f203091b + j > this.f68888g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } finally {
                            MethodCollector.m26664o(4656);
                        }
                    }
                    if (z3) {
                        hVar.mo143838l(j);
                        C29119e.this.mo50795b(EnumC29100a.FLOW_CONTROL_ERROR);
                        MethodCollector.m26664o(4656);
                        return;
                    } else if (z) {
                        hVar.mo143838l(j);
                        MethodCollector.m26664o(4656);
                        return;
                    } else {
                        long read = hVar.read(this.f68886e, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (C29119e.this) {
                                try {
                                    if (this.f68887f.f203091b != 0) {
                                        z2 = false;
                                    }
                                    this.f68887f.mo68845a((AbstractC89408aa) this.f68886e);
                                    if (z2) {
                                        C29119e.this.notifyAll();
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            EOFException eOFException = new EOFException();
                            MethodCollector.m26664o(4656);
                            throw eOFException;
                        }
                    }
                }
                MethodCollector.m26664o(4656);
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(4656);
            throw assertionError;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            r6 = r12.f68885d.f68869d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r12.f68885d.f68869d.f68810l += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
            if (r12.f68885d.f68869d.f68810l < ((long) (r12.f68885d.f68869d.f68812n.mo50832b() / 2))) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
            r12.f68885d.f68869d.mo50779a(0, r12.f68885d.f68869d.f68810l);
            r12.f68885d.f68869d.f68810l = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4645);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
            throw r0;
         */
        @Override // p4632k.AbstractC89408aa
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(p4632k.C89420f r13, long r14) {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2077a.C29119e.C29121b.read(k.f, long):long");
        }

        /* synthetic */ C29121b(C29119e eVar, long j, byte b) {
            this(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.a.e$c */
    public class C29122c extends C89414d {
        static {
            Covode.recordClassIndex(35471);
        }

        @Override // p4632k.C89414d
        /* renamed from: a */
        public final void mo50807a() {
            C29119e.this.mo50795b(EnumC29100a.CANCEL);
        }

        /* renamed from: b */
        public final void mo50808b() {
            if (mo143792d()) {
                throw mo50806a((IOException) null);
            }
        }

        C29122c() {
        }

        @Override // p4632k.C89414d
        /* renamed from: a */
        public final IOException mo50806a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    static {
        Covode.recordClassIndex(35468);
    }

    /* renamed from: b */
    public final boolean mo50796b() {
        boolean z;
        if ((this.f68868c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f68869d.f68801c == z) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo50803h() {
        MethodCollector.m26663i(1988);
        try {
            wait();
            MethodCollector.m26664o(1988);
        } catch (InterruptedException unused) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            MethodCollector.m26664o(1988);
            throw interruptedIOException;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo50794a() {
        MethodCollector.m26663i(1830);
        if (this.f68876k != null) {
            MethodCollector.m26664o(1830);
            return false;
        } else if ((this.f68872g.f68884b || this.f68872g.f68883a) && ((this.f68873h.f68879b || this.f68873h.f68878a) && this.f68871f != null)) {
            MethodCollector.m26664o(1830);
            return false;
        } else {
            MethodCollector.m26664o(1830);
            return true;
        }
    }

    /* renamed from: d */
    public final AbstractC89447y mo50799d() {
        MethodCollector.m26663i(1938);
        synchronized (this) {
            try {
                if (this.f68871f == null && !mo50796b()) {
                    IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                    MethodCollector.m26664o(1938);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1938);
                throw th;
            }
        }
        C29120a aVar = this.f68873h;
        MethodCollector.m26664o(1938);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo50800e() {
        boolean a;
        MethodCollector.m26663i(1964);
        if (f68865l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    this.f68872g.f68884b = true;
                    a = mo50794a();
                    notifyAll();
                } finally {
                    MethodCollector.m26664o(1964);
                }
            }
            if (!a) {
                this.f68869d.mo50784b(this.f68868c);
            }
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(1964);
        throw assertionError;
    }

    /* renamed from: g */
    public final void mo50802g() {
        if (this.f68873h.f68878a) {
            throw new IOException("stream closed");
        } else if (this.f68873h.f68879b) {
            throw new IOException("stream finished");
        } else if (this.f68876k != null) {
            throw new IOException("stream was reset: " + this.f68876k);
        }
    }

    /* renamed from: c */
    public final synchronized List<C29123f> mo50797c() {
        List<C29123f> list;
        MethodCollector.m26663i(1853);
        this.f68874i.mo143791c();
        while (this.f68871f == null && this.f68876k == null) {
            try {
                mo50803h();
            } catch (Throwable th) {
                this.f68874i.mo50808b();
                MethodCollector.m26664o(1853);
                throw th;
            }
        }
        this.f68874i.mo50808b();
        list = this.f68871f;
        if (list != null) {
            MethodCollector.m26664o(1853);
        } else {
            IOException iOException = new IOException("stream was reset: " + this.f68876k);
            MethodCollector.m26664o(1853);
            throw iOException;
        }
        return list;
    }

    /* renamed from: f */
    public final void mo50801f() {
        boolean z;
        boolean a;
        MethodCollector.m26663i(1976);
        if (f68865l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (this.f68872g.f68884b || !this.f68872g.f68883a || (!this.f68873h.f68879b && !this.f68873h.f68878a)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    a = mo50794a();
                } finally {
                    MethodCollector.m26664o(1976);
                }
            }
            if (z) {
                mo50793a(EnumC29100a.CANCEL);
                MethodCollector.m26664o(1976);
                return;
            }
            if (!a) {
                this.f68869d.mo50784b(this.f68868c);
            }
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(1976);
        throw assertionError;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50792a(long j) {
        this.f68867b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo50795b(EnumC29100a aVar) {
        if (m58140d(aVar)) {
            this.f68869d.mo50780a(this.f68868c, aVar);
        }
    }

    /* renamed from: a */
    public final void mo50793a(EnumC29100a aVar) {
        if (m58140d(aVar)) {
            this.f68869d.mo50786b(this.f68868c, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo50798c(EnumC29100a aVar) {
        MethodCollector.m26663i(1968);
        if (this.f68876k == null) {
            this.f68876k = aVar;
            notifyAll();
        }
        MethodCollector.m26664o(1968);
    }

    /* renamed from: d */
    private boolean m58140d(EnumC29100a aVar) {
        MethodCollector.m26663i(1960);
        if (f68865l || !Thread.holdsLock(this)) {
            synchronized (this) {
                try {
                    if (this.f68876k != null) {
                        return false;
                    }
                    if (!this.f68872g.f68884b || !this.f68873h.f68879b) {
                        this.f68876k = aVar;
                        notifyAll();
                        this.f68869d.mo50784b(this.f68868c);
                        MethodCollector.m26664o(1960);
                        return true;
                    }
                    MethodCollector.m26664o(1960);
                    return false;
                } finally {
                    MethodCollector.m26664o(1960);
                }
            }
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(1960);
            throw assertionError;
        }
    }

    C29119e(int i, C29104d dVar, boolean z, boolean z2, List<C29123f> list) {
        Objects.requireNonNull(dVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f68868c = i;
        this.f68869d = dVar;
        this.f68867b = (long) dVar.f68813o.mo50832b();
        C29121b bVar = new C29121b(this, (long) dVar.f68812n.mo50832b(), (byte) 0);
        this.f68872g = bVar;
        C29120a aVar = new C29120a();
        this.f68873h = aVar;
        bVar.f68884b = z2;
        aVar.f68879b = z;
        this.f68870e = list;
    }
}
