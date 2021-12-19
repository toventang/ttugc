package com.squareup.p2075a.p2076a.p2077a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.EnumC29245u;
import com.squareup.p2075a.p2076a.AbstractRunnableC29198f;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2077a.AbstractC29101b;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.squareup.a.a.a.d */
public final class C29104d implements Closeable {

    /* renamed from: a */
    public static final ExecutorService f68798a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C29206j.m58446b("OkHttp FramedConnection"));

    /* renamed from: v */
    static final /* synthetic */ boolean f68799v = true;

    /* renamed from: b */
    public final EnumC29245u f68800b;

    /* renamed from: c */
    final boolean f68801c;

    /* renamed from: d */
    public final AbstractC29113b f68802d;

    /* renamed from: e */
    public final Map<Integer, C29119e> f68803e;

    /* renamed from: f */
    public final String f68804f;

    /* renamed from: g */
    public int f68805g;

    /* renamed from: h */
    public int f68806h;

    /* renamed from: i */
    public boolean f68807i;

    /* renamed from: j */
    final ExecutorService f68808j;

    /* renamed from: k */
    public final AbstractC29139m f68809k;

    /* renamed from: l */
    long f68810l;

    /* renamed from: m */
    long f68811m;

    /* renamed from: n */
    public C29141n f68812n;

    /* renamed from: o */
    final C29141n f68813o;

    /* renamed from: p */
    public boolean f68814p;

    /* renamed from: q */
    final AbstractC29145p f68815q;

    /* renamed from: r */
    final Socket f68816r;

    /* renamed from: s */
    public final AbstractC29103c f68817s;

    /* renamed from: t */
    final C29115c f68818t;

    /* renamed from: u */
    public final Set<Integer> f68819u;

    /* renamed from: w */
    private long f68820w;

    /* renamed from: x */
    private Map<Integer, C29138l> f68821x;

    /* renamed from: y */
    private int f68822y;

    /* renamed from: com.squareup.a.a.a.d$a */
    public static class C29112a {

        /* renamed from: a */
        public Socket f68849a;

        /* renamed from: b */
        public String f68850b;

        /* renamed from: c */
        public AbstractC89426h f68851c;

        /* renamed from: d */
        public AbstractC89425g f68852d;

        /* renamed from: e */
        public AbstractC29113b f68853e = AbstractC29113b.f68857a;

        /* renamed from: f */
        public EnumC29245u f68854f = EnumC29245u.SPDY_3;

        /* renamed from: g */
        public AbstractC29139m f68855g = AbstractC29139m.f68948a;

        /* renamed from: h */
        public boolean f68856h = true;

        static {
            Covode.recordClassIndex(35461);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r12, r0), r8.f68817s.mo50775c());
        r0 = (long) r4;
        r8.f68811m -= r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50781a(int r9, boolean r10, p4632k.C89420f r11, long r12) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2077a.C29104d.mo50781a(int, boolean, k.f, long):void");
    }

    /* renamed from: a */
    public final void mo50783a(boolean z, int i, int i2, C29138l lVar) {
        MethodCollector.m26663i(5656);
        synchronized (this.f68817s) {
            if (lVar != null) {
                try {
                    if (lVar.f68946b == -1) {
                        lVar.f68946b = System.nanoTime();
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(5656);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5656);
                    throw th;
                }
            }
            this.f68817s.mo50770a(z, i, i2);
        }
        MethodCollector.m26664o(5656);
    }

    /* renamed from: a */
    public final void mo50782a(EnumC29100a aVar, EnumC29100a aVar2) {
        IOException e;
        int i;
        C29119e[] eVarArr;
        MethodCollector.m26663i(5793);
        if (f68799v || !Thread.holdsLock(this)) {
            C29138l[] lVarArr = null;
            try {
                m58104a(aVar);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
            synchronized (this) {
                try {
                    if (!this.f68803e.isEmpty()) {
                        eVarArr = (C29119e[]) this.f68803e.values().toArray(new C29119e[this.f68803e.size()]);
                        this.f68803e.clear();
                        m58105a(false);
                    } else {
                        eVarArr = null;
                    }
                    Map<Integer, C29138l> map = this.f68821x;
                    if (map != null) {
                        C29138l[] lVarArr2 = (C29138l[]) map.values().toArray(new C29138l[this.f68821x.size()]);
                        this.f68821x = null;
                        lVarArr = lVarArr2;
                    }
                } finally {
                    MethodCollector.m26664o(5793);
                }
            }
            if (eVarArr != null) {
                for (C29119e eVar : eVarArr) {
                    try {
                        eVar.mo50793a(aVar2);
                    } catch (IOException e3) {
                        if (e != null) {
                            e = e3;
                        }
                    }
                }
            }
            if (lVarArr != null) {
                for (C29138l lVar : lVarArr) {
                    lVar.mo50827a();
                }
            }
            try {
                this.f68817s.close();
            } catch (IOException e4) {
                if (e == null) {
                    e = e4;
                }
            }
            try {
                this.f68816r.close();
                if (e == null) {
                    MethodCollector.m26664o(5793);
                    return;
                }
            } catch (IOException e5) {
                e = e5;
            }
            throw e;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(5793);
        throw assertionError;
    }

    /* renamed from: com.squareup.a.a.a.d$c */
    class C29115c extends AbstractRunnableC29198f implements AbstractC29101b.AbstractC29102a {

        /* renamed from: b */
        final AbstractC29101b f68858b;

        static {
            Covode.recordClassIndex(35464);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50762a(boolean z, int i, AbstractC89426h hVar, int i2) {
            if (C29104d.this.mo50789d(i)) {
                C29104d dVar = C29104d.this;
                C89420f fVar = new C89420f();
                long j = (long) i2;
                hVar.mo143813d(j);
                hVar.read(fVar, j);
                if (fVar.f203091b == j) {
                    dVar.f68808j.execute(new AbstractRunnableC29198f("OkHttp %s Push Data[%s]", new Object[]{dVar.f68804f, Integer.valueOf(i)}, i, fVar, i2, z) {
                        /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291106 */

                        /* renamed from: b */
                        final /* synthetic */ int f68841b;

                        /* renamed from: c */
                        final /* synthetic */ C89420f f68842c;

                        /* renamed from: d */
                        final /* synthetic */ int f68843d;

                        /* renamed from: e */
                        final /* synthetic */ boolean f68844e;

                        static {
                            Covode.recordClassIndex(35459);
                        }

                        @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                        /* renamed from: a */
                        public final void mo50790a() {
                            MethodCollector.m26663i(4451);
                            try {
                                C29104d.this.f68809k.mo50828a(this.f68842c, this.f68843d);
                                C29104d.this.f68817s.mo50767a(this.f68841b, EnumC29100a.CANCEL);
                                synchronized (C29104d.this) {
                                    try {
                                        C29104d.this.f68819u.remove(Integer.valueOf(this.f68841b));
                                    } finally {
                                        MethodCollector.m26664o(4451);
                                    }
                                }
                            } catch (IOException unused) {
                                MethodCollector.m26664o(4451);
                            }
                        }

                        {
                            this.f68841b = r4;
                            this.f68842c = r5;
                            this.f68843d = r6;
                            this.f68844e = r7;
                        }
                    });
                    return;
                }
                throw new IOException(fVar.f203091b + " != " + i2);
            }
            C29119e a = C29104d.this.mo50777a(i);
            if (a == null) {
                C29104d.this.mo50780a(i, EnumC29100a.INVALID_STREAM);
                hVar.mo143838l((long) i2);
            } else if (C29119e.f68865l || !Thread.holdsLock(a)) {
                a.f68872g.mo50804a(hVar, (long) i2);
                if (z) {
                    a.mo50800e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
            if (r25.failIfStreamPresent() == false) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
            r3.mo50795b(com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR);
            r20.f68859c.mo50784b(r23);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2472);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
            if (com.squareup.p2075a.p2076a.p2077a.C29119e.f68865l != false) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d9, code lost:
            if (java.lang.Thread.holdsLock(r3) != false) goto L_0x012c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
            if (r3.f68871f != null) goto L_0x00f5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e5, code lost:
            if (r25.failIfHeadersAbsent() == false) goto L_0x00eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
            r2 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
            r3.f68871f = r24;
            r10 = r3.mo50794a();
            r3.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
            if (r25.failIfHeadersPresent() == false) goto L_0x00fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fb, code lost:
            r2 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.STREAM_IN_USE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fe, code lost:
            r1 = new java.util.ArrayList();
            r1.addAll(r3.f68871f);
            r1.addAll(r24);
            r3.f68871f = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
            if (r2 == null) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0110, code lost:
            r3.mo50795b(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0113, code lost:
            if (r22 == false) goto L_0x0118;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0115, code lost:
            r3.mo50800e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x011c, code lost:
            if (r10 != false) goto L_0x0113;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x011e, code lost:
            r3.f68869d.mo50784b(r3.f68868c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0126, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0128, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2472);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
            r0 = new java.lang.AssertionError();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2472);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0134, code lost:
            throw r0;
         */
        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50764a(boolean r21, boolean r22, int r23, java.util.List<com.squareup.p2075a.p2076a.p2077a.C29123f> r24, com.squareup.p2075a.p2076a.p2077a.EnumC29124g r25) {
            /*
            // Method dump skipped, instructions count: 315
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2077a.C29104d.C29115c.mo50764a(boolean, boolean, int, java.util.List, com.squareup.a.a.a.g):void");
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50763a(boolean z, final C29141n nVar) {
            int i;
            C29119e[] eVarArr;
            long j;
            MethodCollector.m26663i(2490);
            synchronized (C29104d.this) {
                try {
                    int b = C29104d.this.f68813o.mo50832b();
                    if (z) {
                        C29141n nVar2 = C29104d.this.f68813o;
                        nVar2.f68951c = 0;
                        nVar2.f68950b = 0;
                        nVar2.f68949a = 0;
                        Arrays.fill(nVar2.f68952d, 0);
                    }
                    C29141n nVar3 = C29104d.this.f68813o;
                    int i2 = 0;
                    while (true) {
                        if (nVar.mo50831a(i2)) {
                            nVar3.mo50830a(i2, nVar.mo50833b(i2), nVar.f68952d[i2]);
                        }
                        i2++;
                        if (i2 >= 10) {
                            break;
                        }
                    }
                    if (C29104d.this.f68800b == EnumC29245u.HTTP_2) {
                        C29104d.f68798a.execute(new AbstractRunnableC29198f("OkHttp %s ACK Settings", new Object[]{C29104d.this.f68804f}) {
                            /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C29115c.C291183 */

                            static {
                                Covode.recordClassIndex(35467);
                            }

                            @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                            /* renamed from: a */
                            public final void mo50790a() {
                                try {
                                    C29104d.this.f68817s.mo50769a(nVar);
                                } catch (IOException unused) {
                                }
                            }
                        });
                    }
                    int b2 = C29104d.this.f68813o.mo50832b();
                    eVarArr = null;
                    if (b2 == -1 || b2 == b) {
                        j = 0;
                    } else {
                        j = (long) (b2 - b);
                        if (!C29104d.this.f68814p) {
                            C29104d dVar = C29104d.this;
                            dVar.f68811m += j;
                            if (j > 0) {
                                dVar.notifyAll();
                            }
                            C29104d.this.f68814p = true;
                        }
                        if (!C29104d.this.f68803e.isEmpty()) {
                            eVarArr = (C29119e[]) C29104d.this.f68803e.values().toArray(new C29119e[C29104d.this.f68803e.size()]);
                        }
                    }
                    C29104d.f68798a.execute(new AbstractRunnableC29198f("OkHttp %s settings", C29104d.this.f68804f) {
                        /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C29115c.C291172 */

                        static {
                            Covode.recordClassIndex(35466);
                        }

                        @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                        /* renamed from: a */
                        public final void mo50790a() {
                        }
                    });
                } finally {
                    MethodCollector.m26664o(2490);
                }
            }
            if (!(eVarArr == null || j == 0)) {
                for (C29119e eVar : eVarArr) {
                    synchronized (eVar) {
                        try {
                            eVar.mo50792a(j);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            MethodCollector.m26664o(2490);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:10|11|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r3 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR;
            r1 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r0 = r4.f68859c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r4.f68859c.mo50782a(r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            com.squareup.p2075a.p2076a.C29206j.m58438a(r4.f68858b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
        @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo50790a() {
            /*
                r4 = this;
                com.squareup.a.a.a.a r3 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.INTERNAL_ERROR
                com.squareup.a.a.a.a r2 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.INTERNAL_ERROR
                com.squareup.a.a.a.d r0 = com.squareup.p2075a.p2076a.p2077a.C29104d.this     // Catch:{ IOException -> 0x001e }
                boolean r0 = r0.f68801c     // Catch:{ IOException -> 0x001e }
                if (r0 != 0) goto L_0x000f
                com.squareup.a.a.a.b r0 = r4.f68858b     // Catch:{ IOException -> 0x001e }
                r0.mo50755a()     // Catch:{ IOException -> 0x001e }
            L_0x000f:
                com.squareup.a.a.a.b r0 = r4.f68858b     // Catch:{ IOException -> 0x001e }
                boolean r0 = r0.mo50756a(r4)     // Catch:{ IOException -> 0x001e }
                if (r0 != 0) goto L_0x000f
                com.squareup.a.a.a.a r3 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.NO_ERROR     // Catch:{ IOException -> 0x001e }
                com.squareup.a.a.a.a r1 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.CANCEL     // Catch:{ IOException -> 0x001e }
                com.squareup.a.a.a.d r0 = com.squareup.p2075a.p2076a.p2077a.C29104d.this     // Catch:{ IOException -> 0x0027 }
                goto L_0x0024
            L_0x001e:
                com.squareup.a.a.a.a r3 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR     // Catch:{ all -> 0x002d }
                com.squareup.a.a.a.a r1 = com.squareup.p2075a.p2076a.p2077a.EnumC29100a.PROTOCOL_ERROR     // Catch:{ all -> 0x002d }
                com.squareup.a.a.a.d r0 = com.squareup.p2075a.p2076a.p2077a.C29104d.this
            L_0x0024:
                r0.mo50782a(r3, r1)
            L_0x0027:
                com.squareup.a.a.a.b r0 = r4.f68858b
                com.squareup.p2075a.p2076a.C29206j.m58438a(r0)
                return
            L_0x002d:
                r1 = move-exception
                com.squareup.a.a.a.d r0 = com.squareup.p2075a.p2076a.p2077a.C29104d.this     // Catch:{ IOException -> 0x0033 }
                r0.mo50782a(r3, r2)     // Catch:{ IOException -> 0x0033 }
            L_0x0033:
                com.squareup.a.a.a.b r0 = r4.f68858b
                com.squareup.p2075a.p2076a.C29206j.m58438a(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2075a.p2076a.p2077a.C29104d.C29115c.mo50790a():void");
        }

        private C29115c(AbstractC29101b bVar) {
            super("OkHttp %s", C29104d.this.f68804f);
            this.f68858b = bVar;
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50757a(int i, long j) {
            MethodCollector.m26663i(2555);
            if (i == 0) {
                synchronized (C29104d.this) {
                    try {
                        C29104d.this.f68811m += j;
                        C29104d.this.notifyAll();
                    } finally {
                        MethodCollector.m26664o(2555);
                    }
                }
                return;
            }
            C29119e a = C29104d.this.mo50777a(i);
            if (a != null) {
                synchronized (a) {
                    try {
                        a.mo50792a(j);
                    } finally {
                        MethodCollector.m26664o(2555);
                    }
                }
                return;
            }
            MethodCollector.m26664o(2555);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50758a(int i, EnumC29100a aVar) {
            if (C29104d.this.mo50789d(i)) {
                C29104d dVar = C29104d.this;
                dVar.f68808j.execute(new AbstractRunnableC29198f("OkHttp %s Push Reset[%s]", new Object[]{dVar.f68804f, Integer.valueOf(i)}, i, aVar) {
                    /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291117 */

                    /* renamed from: b */
                    final /* synthetic */ int f68846b;

                    /* renamed from: c */
                    final /* synthetic */ EnumC29100a f68847c;

                    static {
                        Covode.recordClassIndex(35460);
                    }

                    @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                    /* renamed from: a */
                    public final void mo50790a() {
                        MethodCollector.m26663i(4436);
                        synchronized (C29104d.this) {
                            try {
                                C29104d.this.f68819u.remove(Integer.valueOf(this.f68846b));
                            } finally {
                                MethodCollector.m26664o(4436);
                            }
                        }
                    }

                    {
                        this.f68846b = r4;
                        this.f68847c = r5;
                    }
                });
                return;
            }
            C29119e b = C29104d.this.mo50784b(i);
            if (b != null) {
                b.mo50798c(aVar);
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50759a(int i, List<C29123f> list) {
            MethodCollector.m26663i(2699);
            C29104d dVar = C29104d.this;
            synchronized (dVar) {
                try {
                    if (dVar.f68819u.contains(Integer.valueOf(i))) {
                        dVar.mo50780a(i, EnumC29100a.PROTOCOL_ERROR);
                        return;
                    }
                    dVar.f68819u.add(Integer.valueOf(i));
                    dVar.f68808j.execute(new AbstractRunnableC29198f("OkHttp %s Push Request[%s]", new Object[]{dVar.f68804f, Integer.valueOf(i)}, i, list) {
                        /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291084 */

                        /* renamed from: b */
                        final /* synthetic */ int f68834b;

                        /* renamed from: c */
                        final /* synthetic */ List f68835c;

                        static {
                            Covode.recordClassIndex(35457);
                        }

                        @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                        /* renamed from: a */
                        public final void mo50790a() {
                            MethodCollector.m26663i(4502);
                            try {
                                C29104d.this.f68817s.mo50767a(this.f68834b, EnumC29100a.CANCEL);
                                synchronized (C29104d.this) {
                                    try {
                                        C29104d.this.f68819u.remove(Integer.valueOf(this.f68834b));
                                    } finally {
                                        MethodCollector.m26664o(4502);
                                    }
                                }
                            } catch (IOException unused) {
                                MethodCollector.m26664o(4502);
                            }
                        }

                        {
                            this.f68834b = r4;
                            this.f68835c = r5;
                        }
                    });
                    MethodCollector.m26664o(2699);
                } finally {
                    MethodCollector.m26664o(2699);
                }
            }
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50760a(int i, C89427i iVar) {
            C29119e[] eVarArr;
            MethodCollector.m26663i(2547);
            iVar.size();
            synchronized (C29104d.this) {
                try {
                    eVarArr = (C29119e[]) C29104d.this.f68803e.values().toArray(new C29119e[C29104d.this.f68803e.size()]);
                    C29104d.this.f68807i = true;
                } finally {
                    MethodCollector.m26664o(2547);
                }
            }
            for (C29119e eVar : eVarArr) {
                if (eVar.f68868c > i && eVar.mo50796b()) {
                    eVar.mo50798c(EnumC29100a.REFUSED_STREAM);
                    C29104d.this.mo50784b(eVar.f68868c);
                }
            }
        }

        /* synthetic */ C29115c(C29104d dVar, AbstractC29101b bVar, byte b) {
            this(bVar);
        }

        @Override // com.squareup.p2075a.p2076a.p2077a.AbstractC29101b.AbstractC29102a
        /* renamed from: a */
        public final void mo50761a(boolean z, int i, int i2) {
            if (z) {
                C29138l c = C29104d.this.mo50787c(i);
                if (c == null) {
                    return;
                }
                if (c.f68947c != -1 || c.f68946b == -1) {
                    throw new IllegalStateException();
                }
                c.f68947c = System.nanoTime();
                c.f68945a.countDown();
                return;
            }
            C29104d dVar = C29104d.this;
            C29104d.f68798a.execute(new AbstractRunnableC29198f("OkHttp %s ping %08x%08x", new Object[]{dVar.f68804f, Integer.valueOf(i), Integer.valueOf(i2)}, i, i2) {
                /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291073 */

                /* renamed from: b */
                final /* synthetic */ boolean f68829b = true;

                /* renamed from: c */
                final /* synthetic */ int f68830c;

                /* renamed from: d */
                final /* synthetic */ int f68831d;

                /* renamed from: e */
                final /* synthetic */ C29138l f68832e;

                static {
                    Covode.recordClassIndex(35456);
                }

                @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
                /* renamed from: a */
                public final void mo50790a() {
                    try {
                        C29104d.this.mo50783a(this.f68829b, this.f68830c, this.f68831d, this.f68832e);
                    } catch (IOException unused) {
                    }
                }

                {
                    this.f68830c = r5;
                    this.f68831d = r6;
                    this.f68832e = null;
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo50785b() {
        this.f68817s.mo50773b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo50782a(EnumC29100a.NO_ERROR, EnumC29100a.CANCEL);
    }

    /* renamed from: com.squareup.a.a.a.d$b */
    public static abstract class AbstractC29113b {

        /* renamed from: a */
        public static final AbstractC29113b f68857a = new AbstractC29113b() {
            /* class com.squareup.p2075a.p2076a.p2077a.C29104d.AbstractC29113b.C291141 */

            static {
                Covode.recordClassIndex(35463);
            }

            @Override // com.squareup.p2075a.p2076a.p2077a.C29104d.AbstractC29113b
            /* renamed from: a */
            public final void mo50791a(C29119e eVar) {
                eVar.mo50793a(EnumC29100a.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public abstract void mo50791a(C29119e eVar);

        static {
            Covode.recordClassIndex(35462);
        }
    }

    static {
        Covode.recordClassIndex(35453);
    }

    /* renamed from: a */
    public final synchronized int mo50776a() {
        MethodCollector.m26663i(5410);
        C29141n nVar = this.f68813o;
        if ((nVar.f68949a & 16) != 0) {
            int i = nVar.f68952d[4];
            MethodCollector.m26664o(5410);
            return i;
        }
        MethodCollector.m26664o(5410);
        return Integer.MAX_VALUE;
    }

    /* renamed from: d */
    public final boolean mo50789d(int i) {
        if (this.f68800b == EnumC29245u.HTTP_2 && i != 0 && (i & 1) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private synchronized void m58105a(boolean z) {
        long j;
        MethodCollector.m26663i(5252);
        if (z) {
            j = System.nanoTime();
        } else {
            j = Long.MAX_VALUE;
        }
        this.f68820w = j;
        MethodCollector.m26664o(5252);
    }

    /* renamed from: a */
    private void m58104a(EnumC29100a aVar) {
        MethodCollector.m26663i(5787);
        synchronized (this.f68817s) {
            try {
                synchronized (this) {
                    try {
                        if (!this.f68807i) {
                            this.f68807i = true;
                            this.f68817s.mo50768a(this.f68805g, aVar, C29206j.f69176a);
                            MethodCollector.m26664o(5787);
                        }
                    } finally {
                        MethodCollector.m26664o(5787);
                    }
                }
            } finally {
                MethodCollector.m26664o(5787);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C29119e mo50784b(int i) {
        C29119e remove;
        MethodCollector.m26663i(5247);
        remove = this.f68803e.remove(Integer.valueOf(i));
        if (remove != null && this.f68803e.isEmpty()) {
            m58105a(true);
        }
        notifyAll();
        MethodCollector.m26664o(5247);
        return remove;
    }

    /* renamed from: c */
    public final synchronized C29138l mo50787c(int i) {
        MethodCollector.m26663i(5658);
        Map<Integer, C29138l> map = this.f68821x;
        if (map != null) {
            C29138l remove = map.remove(Integer.valueOf(i));
            MethodCollector.m26664o(5658);
            return remove;
        }
        MethodCollector.m26664o(5658);
        return null;
    }

    private C29104d(C29112a aVar) {
        int i;
        this.f68803e = new HashMap();
        this.f68820w = System.nanoTime();
        this.f68810l = 0;
        this.f68812n = new C29141n();
        C29141n nVar = new C29141n();
        this.f68813o = nVar;
        this.f68814p = false;
        this.f68819u = new LinkedHashSet();
        EnumC29245u uVar = aVar.f68854f;
        this.f68800b = uVar;
        this.f68809k = aVar.f68855g;
        boolean z = aVar.f68856h;
        this.f68801c = z;
        this.f68802d = aVar.f68853e;
        int i2 = 2;
        if (aVar.f68856h) {
            i = 1;
        } else {
            i = 2;
        }
        this.f68806h = i;
        if (aVar.f68856h && uVar == EnumC29245u.HTTP_2) {
            this.f68806h += 2;
        }
        this.f68822y = aVar.f68856h ? 1 : i2;
        if (aVar.f68856h) {
            this.f68812n.mo50830a(7, 0, 16777216);
        }
        String str = aVar.f68850b;
        this.f68804f = str;
        if (uVar == EnumC29245u.HTTP_2) {
            this.f68815q = new C29128i();
            this.f68808j = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C29206j.m58446b(C1764a.m5928a("OkHttp %s Push Observer", new Object[]{str})));
            nVar.mo50830a(7, 0, 65535);
            nVar.mo50830a(5, 0, 16384);
        } else if (uVar == EnumC29245u.SPDY_3) {
            this.f68815q = new C29142o();
            this.f68808j = null;
        } else {
            throw new AssertionError(uVar);
        }
        this.f68811m = (long) nVar.mo50832b();
        this.f68816r = aVar.f68849a;
        this.f68817s = this.f68815q.mo50821a(aVar.f68852d, z);
        C29115c cVar = new C29115c(this, this.f68815q.mo50820a(aVar.f68851c, z), (byte) 0);
        this.f68818t = cVar;
        new Thread(cVar).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C29119e mo50777a(int i) {
        C29119e eVar;
        MethodCollector.m26663i(5245);
        eVar = this.f68803e.get(Integer.valueOf(i));
        MethodCollector.m26664o(5245);
        return eVar;
    }

    public /* synthetic */ C29104d(C29112a aVar, byte b) {
        this(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo50786b(int i, EnumC29100a aVar) {
        this.f68817s.mo50767a(i, aVar);
    }

    /* renamed from: a */
    public final C29119e mo50778a(List<C29123f> list, boolean z) {
        int i;
        C29119e eVar;
        MethodCollector.m26663i(5532);
        boolean z2 = !z;
        synchronized (this.f68817s) {
            try {
                synchronized (this) {
                    try {
                        if (!this.f68807i) {
                            i = this.f68806h;
                            this.f68806h = i + 2;
                            eVar = new C29119e(i, this, z2, false, list);
                            if (eVar.mo50794a()) {
                                this.f68803e.put(Integer.valueOf(i), eVar);
                                m58105a(false);
                            }
                        } else {
                            IOException iOException = new IOException("shutdown");
                            MethodCollector.m26664o(5532);
                            throw iOException;
                        }
                    } finally {
                        MethodCollector.m26664o(5532);
                    }
                }
                this.f68817s.mo50772a(z2, false, i, list);
            } finally {
                MethodCollector.m26664o(5532);
            }
        }
        if (!z) {
            this.f68817s.mo50773b();
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50779a(final int i, final long j) {
        f68798a.execute(new AbstractRunnableC29198f("OkHttp Window Update %s stream %d", new Object[]{this.f68804f, Integer.valueOf(i)}) {
            /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291062 */

            static {
                Covode.recordClassIndex(35455);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
            /* renamed from: a */
            public final void mo50790a() {
                try {
                    C29104d.this.f68817s.mo50766a(i, j);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50780a(final int i, final EnumC29100a aVar) {
        f68798a.submit(new AbstractRunnableC29198f("OkHttp %s stream %d", new Object[]{this.f68804f, Integer.valueOf(i)}) {
            /* class com.squareup.p2075a.p2076a.p2077a.C29104d.C291051 */

            static {
                Covode.recordClassIndex(35454);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractRunnableC29198f
            /* renamed from: a */
            public final void mo50790a() {
                try {
                    C29104d.this.mo50786b(i, aVar);
                } catch (IOException unused) {
                }
            }
        });
    }
}
