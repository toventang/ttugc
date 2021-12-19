package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import okhttp3.C90198s;
import okhttp3.internal.p4657e.C90110c;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89414d;
import p4632k.C89420f;

/* renamed from: okhttp3.internal.e.i */
public final class C90138i {

    /* renamed from: m */
    static final /* synthetic */ boolean f204649m = true;

    /* renamed from: a */
    long f204650a;

    /* renamed from: b */
    long f204651b;

    /* renamed from: c */
    public final int f204652c;

    /* renamed from: d */
    public final C90118g f204653d;

    /* renamed from: e */
    public final Deque<C90198s> f204654e;

    /* renamed from: f */
    public C90110c.AbstractC90111a f204655f;

    /* renamed from: g */
    boolean f204656g;

    /* renamed from: h */
    public final C90140b f204657h;

    /* renamed from: i */
    final C90139a f204658i;

    /* renamed from: j */
    public final C90141c f204659j = new C90141c();

    /* renamed from: k */
    public final C90141c f204660k = new C90141c();

    /* renamed from: l */
    EnumC90109b f204661l = null;

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.i$a */
    public final class C90139a implements AbstractC89447y {

        /* renamed from: c */
        static final /* synthetic */ boolean f204662c = true;

        /* renamed from: a */
        boolean f204663a;

        /* renamed from: b */
        boolean f204664b;

        /* renamed from: e */
        private final C89420f f204666e = new C89420f();

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return C90138i.this.f204660k;
        }

        static {
            Covode.recordClassIndex(106311);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r13.f204665d.f204658i.f204664b != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r13.f204666e.f203091b <= 0) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            if (r13.f204666e.f203091b <= 0) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            m156582a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
            r13.f204665d.f204653d.mo144880a(r13.f204665d.f204652c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
            r1 = r13.f204665d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r13.f204663a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
            r13.f204665d.f204653d.f204590v.mo144925b();
            r13.f204665d.mo144912f();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6714);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6714);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
            throw r0;
         */
        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
            // Method dump skipped, instructions count: 121
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90138i.C90139a.close():void");
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            MethodCollector.m26663i(6568);
            if (f204662c || !Thread.holdsLock(C90138i.this)) {
                synchronized (C90138i.this) {
                    try {
                        C90138i.this.mo144913g();
                    } finally {
                        MethodCollector.m26664o(6568);
                    }
                }
                while (this.f204666e.f203091b > 0) {
                    m156582a(false);
                    C90138i.this.f204653d.f204590v.mo144925b();
                }
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(6568);
            throw assertionError;
        }

        C90139a() {
        }

        /* renamed from: a */
        private void m156582a(boolean z) {
            long min;
            boolean z2;
            MethodCollector.m26663i(6434);
            synchronized (C90138i.this) {
                try {
                    C90138i.this.f204660k.mo143791c();
                    while (C90138i.this.f204651b <= 0 && !this.f204664b && !this.f204663a && C90138i.this.f204661l == null) {
                        try {
                            C90138i.this.mo144914h();
                        } finally {
                            C90138i.this.f204660k.mo144916b();
                            MethodCollector.m26664o(6434);
                        }
                    }
                    C90138i.this.f204660k.mo144916b();
                    C90138i.this.mo144913g();
                    min = Math.min(C90138i.this.f204651b, this.f204666e.f203091b);
                    C90138i.this.f204651b -= min;
                } catch (Throwable th) {
                    MethodCollector.m26664o(6434);
                    throw th;
                }
            }
            C90138i.this.f204660k.mo143791c();
            try {
                C90118g gVar = C90138i.this.f204653d;
                int i = C90138i.this.f204652c;
                if (!z || min != this.f204666e.f203091b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gVar.mo144880a(i, z2, this.f204666e, min);
            } finally {
                C90138i.this.f204660k.mo144916b();
                MethodCollector.m26664o(6434);
            }
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (f204662c || !Thread.holdsLock(C90138i.this)) {
                this.f204666e.mo22060a(fVar, j);
                while (this.f204666e.f203091b >= 16384) {
                    m156582a(false);
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.i$b */
    public final class C90140b implements AbstractC89408aa {

        /* renamed from: c */
        static final /* synthetic */ boolean f204667c = true;

        /* renamed from: a */
        boolean f204668a;

        /* renamed from: b */
        boolean f204669b;

        /* renamed from: e */
        private final C89420f f204671e = new C89420f();

        /* renamed from: f */
        private final C89420f f204672f = new C89420f();

        /* renamed from: g */
        private final long f204673g;

        @Override // p4632k.AbstractC89408aa
        public final C89409ab timeout() {
            return C90138i.this.f204659j;
        }

        static {
            Covode.recordClassIndex(106312);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j;
            C90110c.AbstractC90111a aVar;
            ArrayList arrayList;
            MethodCollector.m26663i(9213);
            synchronized (C90138i.this) {
                try {
                    this.f204668a = true;
                    j = this.f204672f.f203091b;
                    this.f204672f.mo143854v();
                    aVar = null;
                    if (C90138i.this.f204654e.isEmpty() || C90138i.this.f204655f == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(C90138i.this.f204654e);
                        C90138i.this.f204654e.clear();
                        aVar = C90138i.this.f204655f;
                    }
                    C90138i.this.notifyAll();
                } finally {
                    MethodCollector.m26664o(9213);
                }
            }
            if (j > 0) {
                m156584a(j);
            }
            C90138i.this.mo144912f();
            if (aVar != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }

        /* renamed from: a */
        private void m156584a(long j) {
            if (f204667c || !Thread.holdsLock(C90138i.this)) {
                C90138i.this.f204653d.mo144881a(j);
                return;
            }
            throw new AssertionError();
        }

        C90140b(long j) {
            this.f204673g = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo144915a(AbstractC89426h hVar, long j) {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            MethodCollector.m26663i(8918);
            if (f204667c || !Thread.holdsLock(C90138i.this)) {
                while (j > 0) {
                    synchronized (C90138i.this) {
                        try {
                            z = this.f204669b;
                            z2 = true;
                            if (this.f204672f.f203091b + j > this.f204673g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } finally {
                            MethodCollector.m26664o(8918);
                        }
                    }
                    if (z3) {
                        hVar.mo143838l(j);
                        C90138i.this.mo144906b(EnumC90109b.FLOW_CONTROL_ERROR);
                        MethodCollector.m26664o(8918);
                        return;
                    } else if (z) {
                        hVar.mo143838l(j);
                        MethodCollector.m26664o(8918);
                        return;
                    } else {
                        long read = hVar.read(this.f204671e, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (C90138i.this) {
                                try {
                                    if (this.f204668a) {
                                        j2 = this.f204671e.f203091b;
                                        this.f204671e.mo143854v();
                                    } else {
                                        if (this.f204672f.f203091b != 0) {
                                            z2 = false;
                                        }
                                        this.f204672f.mo68845a((AbstractC89408aa) this.f204671e);
                                        if (z2) {
                                            C90138i.this.notifyAll();
                                        }
                                        j2 = 0;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (j2 > 0) {
                                m156584a(j2);
                            }
                        } else {
                            EOFException eOFException = new EOFException();
                            MethodCollector.m26664o(8918);
                            throw eOFException;
                        }
                    }
                }
                MethodCollector.m26664o(8918);
                return;
            }
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(8918);
            throw assertionError;
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            EnumC90109b bVar;
            long j2;
            C90110c.AbstractC90111a aVar;
            MethodCollector.m26663i(8170);
            long j3 = 0;
            if (j >= 0) {
                while (true) {
                    synchronized (C90138i.this) {
                        try {
                            C90138i.this.f204659j.mo143791c();
                            try {
                                C90198s sVar = null;
                                if (C90138i.this.f204661l != null) {
                                    bVar = C90138i.this.f204661l;
                                } else {
                                    bVar = null;
                                }
                                if (!this.f204668a) {
                                    if (!C90138i.this.f204654e.isEmpty() && C90138i.this.f204655f != null) {
                                        sVar = C90138i.this.f204654e.removeFirst();
                                        aVar = C90138i.this.f204655f;
                                    } else if (this.f204672f.f203091b > j3) {
                                        C89420f fVar2 = this.f204672f;
                                        j2 = fVar2.read(fVar, Math.min(j, fVar2.f203091b));
                                        C90138i.this.f204650a += j2;
                                        if (bVar == null) {
                                            if (C90138i.this.f204650a >= ((long) (C90138i.this.f204653d.f204587s.mo144933b() / 2))) {
                                                C90138i.this.f204653d.mo144878a(C90138i.this.f204652c, C90138i.this.f204650a);
                                                j3 = 0;
                                                C90138i.this.f204650a = 0;
                                            } else {
                                                j3 = 0;
                                            }
                                        }
                                        aVar = null;
                                        C90138i.this.f204659j.mo144916b();
                                        if (sVar == null || aVar == null) {
                                        }
                                    } else if (this.f204669b || bVar != null) {
                                        aVar = null;
                                    } else {
                                        C90138i.this.mo144914h();
                                        C90138i.this.f204659j.mo144916b();
                                    }
                                    j2 = -1;
                                    C90138i.this.f204659j.mo144916b();
                                    if (sVar == null) {
                                        break;
                                    }
                                    break;
                                }
                                IOException iOException = new IOException("stream closed");
                                MethodCollector.m26664o(8170);
                                throw iOException;
                            } catch (Throwable th) {
                                C90138i.this.f204659j.mo144916b();
                                MethodCollector.m26664o(8170);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(8170);
                            throw th2;
                        }
                    }
                }
                if (j2 != -1) {
                    m156584a(j2);
                    MethodCollector.m26664o(8170);
                    return j2;
                } else if (bVar == null) {
                    MethodCollector.m26664o(8170);
                    return -1;
                } else {
                    C90148n nVar = new C90148n(bVar);
                    MethodCollector.m26664o(8170);
                    throw nVar;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                MethodCollector.m26664o(8170);
                throw illegalArgumentException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.i$c */
    public class C90141c extends C89414d {
        static {
            Covode.recordClassIndex(106313);
        }

        /* renamed from: b */
        public final void mo144916b() {
            if (mo143792d()) {
                throw mo50806a((IOException) null);
            }
        }

        @Override // p4632k.C89414d
        /* renamed from: a */
        public final void mo50807a() {
            MethodCollector.m26663i(5607);
            C90138i.this.mo144906b(EnumC90109b.CANCEL);
            C90118g gVar = C90138i.this.f204653d;
            synchronized (gVar) {
                try {
                    if (gVar.f204582n >= gVar.f204581m) {
                        gVar.f204581m++;
                        gVar.f204584p = System.nanoTime() + 1000000000;
                        try {
                            gVar.f204577i.execute(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE  
                                  (wrap: java.util.concurrent.ScheduledExecutorService : 0x0030: IGET  (r5v0 java.util.concurrent.ScheduledExecutorService) = (r6v0 'gVar' okhttp3.internal.e.g) okhttp3.internal.e.g.i java.util.concurrent.ScheduledExecutorService)
                                  (wrap: okhttp3.internal.e.g$3 : 0x003e: CONSTRUCTOR  (r4v0 okhttp3.internal.e.g$3) = 
                                  (r6v0 'gVar' okhttp3.internal.e.g)
                                  ("OkHttp %s ping")
                                  (wrap: java.lang.Object[] : ?: FILLED_NEW_ARRAY  (r2v4 java.lang.Object[]) = (wrap: java.lang.String : 0x003a: IGET  (r6v0 'gVar' okhttp3.internal.e.g) okhttp3.internal.e.g.e java.lang.String) elemType: java.lang.Object)
                                 call: okhttp3.internal.e.g.3.<init>(okhttp3.internal.e.g, java.lang.String, java.lang.Object[]):void type: CONSTRUCTOR)
                                 type: INTERFACE call: java.util.concurrent.ScheduledExecutorService.execute(java.lang.Runnable):void in method: okhttp3.internal.e.i.c.a():void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: CONSTRUCTOR  (r4v0 okhttp3.internal.e.g$3) = 
                                  (r6v0 'gVar' okhttp3.internal.e.g)
                                  ("OkHttp %s ping")
                                  (wrap: java.lang.Object[] : ?: FILLED_NEW_ARRAY  (r2v4 java.lang.Object[]) = (wrap: java.lang.String : 0x003a: IGET  (r6v0 'gVar' okhttp3.internal.e.g) okhttp3.internal.e.g.e java.lang.String) elemType: java.lang.Object)
                                 call: okhttp3.internal.e.g.3.<init>(okhttp3.internal.e.g, java.lang.String, java.lang.Object[]):void type: CONSTRUCTOR in method: okhttp3.internal.e.i.c.a():void, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                	... 36 more
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: okhttp3.internal.e.g, state: GENERATED_AND_UNLOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                	... 42 more
                                */
                            /*
                                this = this;
                                r7 = 5607(0x15e7, float:7.857E-42)
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r7)
                                okhttp3.internal.e.i r1 = okhttp3.internal.p4657e.C90138i.this
                                okhttp3.internal.e.b r0 = okhttp3.internal.p4657e.EnumC90109b.CANCEL
                                r1.mo144906b(r0)
                                okhttp3.internal.e.i r0 = okhttp3.internal.p4657e.C90138i.this
                                okhttp3.internal.e.g r6 = r0.f204653d
                                monitor-enter(r6)
                                long r3 = r6.f204582n     // Catch:{ all -> 0x004c }
                                long r1 = r6.f204581m     // Catch:{ all -> 0x004c }
                                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                                if (r0 >= 0) goto L_0x001e
                                monitor-exit(r6)     // Catch:{ all -> 0x004c }
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                                return
                            L_0x001e:
                                long r2 = r6.f204581m
                                r0 = 1
                                long r2 = r2 + r0
                                r6.f204581m = r2
                                long r2 = java.lang.System.nanoTime()
                                r0 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                                long r2 = r2 + r0
                                r6.f204584p = r2
                                monitor-exit(r6)
                                java.util.concurrent.ScheduledExecutorService r5 = r6.f204577i     // Catch:{ RejectedExecutionException -> 0x0048 }
                                okhttp3.internal.e.g$3 r4 = new okhttp3.internal.e.g$3     // Catch:{ RejectedExecutionException -> 0x0048 }
                                java.lang.String r3 = "OkHttp %s ping"
                                r0 = 1
                                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x0048 }
                                r1 = 0
                                java.lang.String r0 = r6.f204573e     // Catch:{ RejectedExecutionException -> 0x0048 }
                                r2[r1] = r0     // Catch:{ RejectedExecutionException -> 0x0048 }
                                r4.<init>(r3, r2)     // Catch:{ RejectedExecutionException -> 0x0048 }
                                r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0048 }
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                                return
                            L_0x0048:
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                                return
                            L_0x004c:
                                r0 = move-exception
                                monitor-exit(r6)
                                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r7)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90138i.C90141c.mo50807a():void");
                        }

                        C90141c() {
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
                        Covode.recordClassIndex(106310);
                    }

                    /* renamed from: b */
                    public final boolean mo144907b() {
                        boolean z;
                        if ((this.f204652c & 1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.f204653d.f204570b == z) {
                            return true;
                        }
                        return false;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: h */
                    public final void mo144914h() {
                        MethodCollector.m26663i(9071);
                        try {
                            wait();
                            MethodCollector.m26664o(9071);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            InterruptedIOException interruptedIOException = new InterruptedIOException();
                            MethodCollector.m26664o(9071);
                            throw interruptedIOException;
                        }
                    }

                    /* renamed from: a */
                    public final synchronized boolean mo144905a() {
                        MethodCollector.m26663i(7876);
                        if (this.f204661l != null) {
                            MethodCollector.m26664o(7876);
                            return false;
                        } else if ((this.f204657h.f204669b || this.f204657h.f204668a) && ((this.f204658i.f204664b || this.f204658i.f204663a) && this.f204656g)) {
                            MethodCollector.m26664o(7876);
                            return false;
                        } else {
                            MethodCollector.m26664o(7876);
                            return true;
                        }
                    }

                    /* renamed from: d */
                    public final AbstractC89447y mo144910d() {
                        MethodCollector.m26663i(8026);
                        synchronized (this) {
                            try {
                                if (!this.f204656g && !mo144907b()) {
                                    IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                                    MethodCollector.m26664o(8026);
                                    throw illegalStateException;
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(8026);
                                throw th;
                            }
                        }
                        C90139a aVar = this.f204658i;
                        MethodCollector.m26664o(8026);
                        return aVar;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: e */
                    public final void mo144911e() {
                        boolean a;
                        MethodCollector.m26663i(8619);
                        if (f204649m || !Thread.holdsLock(this)) {
                            synchronized (this) {
                                try {
                                    this.f204657h.f204669b = true;
                                    a = mo144905a();
                                    notifyAll();
                                } finally {
                                    MethodCollector.m26664o(8619);
                                }
                            }
                            if (!a) {
                                this.f204653d.mo144885b(this.f204652c);
                            }
                            return;
                        }
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(8619);
                        throw assertionError;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: g */
                    public final void mo144913g() {
                        if (this.f204658i.f204663a) {
                            throw new IOException("stream closed");
                        } else if (this.f204658i.f204664b) {
                            throw new IOException("stream finished");
                        } else if (this.f204661l != null) {
                            throw new C90148n(this.f204661l);
                        }
                    }

                    /* renamed from: c */
                    public final synchronized C90198s mo144908c() {
                        C90198s removeFirst;
                        MethodCollector.m26663i(7878);
                        this.f204659j.mo143791c();
                        while (this.f204654e.isEmpty() && this.f204661l == null) {
                            try {
                                mo144914h();
                            } catch (Throwable th) {
                                this.f204659j.mo144916b();
                                MethodCollector.m26664o(7878);
                                throw th;
                            }
                        }
                        this.f204659j.mo144916b();
                        if (!this.f204654e.isEmpty()) {
                            removeFirst = this.f204654e.removeFirst();
                            MethodCollector.m26664o(7878);
                        } else {
                            C90148n nVar = new C90148n(this.f204661l);
                            MethodCollector.m26664o(7878);
                            throw nVar;
                        }
                        return removeFirst;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: f */
                    public final void mo144912f() {
                        boolean z;
                        boolean a;
                        MethodCollector.m26663i(8773);
                        if (f204649m || !Thread.holdsLock(this)) {
                            synchronized (this) {
                                try {
                                    if (this.f204657h.f204669b || !this.f204657h.f204668a || (!this.f204658i.f204664b && !this.f204658i.f204663a)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    a = mo144905a();
                                } finally {
                                    MethodCollector.m26664o(8773);
                                }
                            }
                            if (z) {
                                mo144904a(EnumC90109b.CANCEL);
                                MethodCollector.m26664o(8773);
                                return;
                            }
                            if (!a) {
                                this.f204653d.mo144885b(this.f204652c);
                            }
                            return;
                        }
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(8773);
                        throw assertionError;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: a */
                    public final void mo144903a(long j) {
                        this.f204651b += j;
                        if (j > 0) {
                            notifyAll();
                        }
                    }

                    /* renamed from: b */
                    public final void mo144906b(EnumC90109b bVar) {
                        if (m156569d(bVar)) {
                            this.f204653d.mo144879a(this.f204652c, bVar);
                        }
                    }

                    /* renamed from: a */
                    public final void mo144904a(EnumC90109b bVar) {
                        if (m156569d(bVar)) {
                            this.f204653d.mo144887b(this.f204652c, bVar);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: c */
                    public final synchronized void mo144909c(EnumC90109b bVar) {
                        MethodCollector.m26663i(8620);
                        if (this.f204661l == null) {
                            this.f204661l = bVar;
                            notifyAll();
                        }
                        MethodCollector.m26664o(8620);
                    }

                    /* renamed from: d */
                    private boolean m156569d(EnumC90109b bVar) {
                        MethodCollector.m26663i(8467);
                        if (f204649m || !Thread.holdsLock(this)) {
                            synchronized (this) {
                                try {
                                    if (this.f204661l != null) {
                                        return false;
                                    }
                                    if (!this.f204657h.f204669b || !this.f204658i.f204664b) {
                                        this.f204661l = bVar;
                                        notifyAll();
                                        this.f204653d.mo144885b(this.f204652c);
                                        MethodCollector.m26664o(8467);
                                        return true;
                                    }
                                    MethodCollector.m26664o(8467);
                                    return false;
                                } finally {
                                    MethodCollector.m26664o(8467);
                                }
                            }
                        } else {
                            AssertionError assertionError = new AssertionError();
                            MethodCollector.m26664o(8467);
                            throw assertionError;
                        }
                    }

                    C90138i(int i, C90118g gVar, boolean z, boolean z2, C90198s sVar) {
                        ArrayDeque arrayDeque = new ArrayDeque();
                        this.f204654e = arrayDeque;
                        Objects.requireNonNull(gVar, "connection == null");
                        this.f204652c = i;
                        this.f204653d = gVar;
                        this.f204651b = (long) gVar.f204588t.mo144933b();
                        C90140b bVar = new C90140b((long) gVar.f204587s.mo144933b());
                        this.f204657h = bVar;
                        C90139a aVar = new C90139a();
                        this.f204658i = aVar;
                        bVar.f204669b = z2;
                        aVar.f204664b = z;
                        if (sVar != null) {
                            arrayDeque.add(sVar);
                        }
                        if (mo144907b() && sVar != null) {
                            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
                        } else if (!mo144907b() && sVar == null) {
                            throw new IllegalStateException("remotely-initiated streams should have headers");
                        }
                    }
                }
