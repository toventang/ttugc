package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.AbstractRunnableC90073b;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4657e.C90135h;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.e.g */
public final class C90118g implements Closeable {

    /* renamed from: a */
    public static final ExecutorService f204567a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C90084c.m156412a("OkHttp Http2Connection", true));

    /* renamed from: y */
    static final /* synthetic */ boolean f204568y = true;

    /* renamed from: A */
    private long f204569A = 0;

    /* renamed from: b */
    final boolean f204570b;

    /* renamed from: c */
    final AbstractC90128c f204571c;

    /* renamed from: d */
    final Map<Integer, C90138i> f204572d = new LinkedHashMap();

    /* renamed from: e */
    final String f204573e;

    /* renamed from: f */
    int f204574f;

    /* renamed from: g */
    int f204575g;

    /* renamed from: h */
    public boolean f204576h;

    /* renamed from: i */
    public final ScheduledExecutorService f204577i;

    /* renamed from: j */
    final AbstractC90145l f204578j;

    /* renamed from: k */
    public long f204579k = 0;

    /* renamed from: l */
    public long f204580l = 0;

    /* renamed from: m */
    long f204581m = 0;

    /* renamed from: n */
    public long f204582n = 0;

    /* renamed from: o */
    public long f204583o = 0;

    /* renamed from: p */
    long f204584p = 0;

    /* renamed from: q */
    long f204585q = 0;

    /* renamed from: r */
    long f204586r;

    /* renamed from: s */
    C90147m f204587s = new C90147m();

    /* renamed from: t */
    final C90147m f204588t;

    /* renamed from: u */
    final Socket f204589u;

    /* renamed from: v */
    final C90142j f204590v;

    /* renamed from: w */
    final C90131e f204591w;

    /* renamed from: x */
    final Set<Integer> f204592x;

    /* renamed from: z */
    private final ExecutorService f204593z;

    /* renamed from: c */
    static boolean m156514c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144881a(long j) {
        MethodCollector.m26663i(9522);
        long j2 = this.f204585q + j;
        this.f204585q = j2;
        if (j2 >= ((long) (this.f204587s.mo144933b() / 2))) {
            mo144878a(0, this.f204585q);
            this.f204585q = 0;
        }
        MethodCollector.m26664o(9522);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144883a(EnumC90109b bVar, EnumC90109b bVar2) {
        IOException e;
        MethodCollector.m26663i(10120);
        if (f204568y || !Thread.holdsLock(this)) {
            C90138i[] iVarArr = null;
            try {
                m156513a(bVar);
                e = null;
            } catch (IOException e2) {
                e = e2;
            }
            synchronized (this) {
                try {
                    if (!this.f204572d.isEmpty()) {
                        iVarArr = (C90138i[]) this.f204572d.values().toArray(new C90138i[this.f204572d.size()]);
                        this.f204572d.clear();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10120);
                    throw th;
                }
            }
            if (iVarArr != null) {
                for (C90138i iVar : iVarArr) {
                    try {
                        iVar.mo144904a(bVar2);
                    } catch (IOException e3) {
                        if (e != null) {
                            e = e3;
                        }
                    }
                }
            }
            try {
                this.f204590v.close();
            } catch (IOException e4) {
                if (e == null) {
                    e = e4;
                }
            }
            try {
                this.f204589u.close();
            } catch (IOException e5) {
                e = e5;
            }
            this.f204577i.shutdown();
            this.f204593z.shutdown();
            if (e == null) {
                MethodCollector.m26664o(10120);
            } else {
                MethodCollector.m26664o(10120);
                throw e;
            }
        } else {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(10120);
            throw assertionError;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.e.g$e */
    public class C90131e extends AbstractRunnableC90073b implements C90135h.AbstractC90137b {

        /* renamed from: a */
        final C90135h f204630a;

        static {
            Covode.recordClassIndex(106303);
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144900a(boolean z, int i, AbstractC89426h hVar, int i2) {
            if (C90118g.m156514c(i)) {
                C90118g gVar = C90118g.this;
                C89420f fVar = new C89420f();
                long j = (long) i2;
                hVar.mo143813d(j);
                hVar.read(fVar, j);
                if (fVar.f203091b == j) {
                    gVar.mo144882a(new AbstractRunnableC90073b("OkHttp %s Push Data[%s]", new Object[]{gVar.f204573e, Integer.valueOf(i)}, i, fVar, i2, z) {
                        /* class okhttp3.internal.p4657e.C90118g.C901246 */

                        /* renamed from: a */
                        final /* synthetic */ int f204608a;

                        /* renamed from: b */
                        final /* synthetic */ C89420f f204609b;

                        /* renamed from: c */
                        final /* synthetic */ int f204610c;

                        /* renamed from: e */
                        final /* synthetic */ boolean f204611e;

                        static {
                            Covode.recordClassIndex(106296);
                        }

                        @Override // okhttp3.internal.AbstractRunnableC90073b
                        /* renamed from: b */
                        public final void mo144717b() {
                            MethodCollector.m26663i(5430);
                            try {
                                C90118g.this.f204578j.mo144929a(this.f204609b, this.f204610c);
                                C90118g.this.f204590v.mo144919a(this.f204608a, EnumC90109b.CANCEL);
                                synchronized (C90118g.this) {
                                    try {
                                        C90118g.this.f204592x.remove(Integer.valueOf(this.f204608a));
                                    } finally {
                                        MethodCollector.m26664o(5430);
                                    }
                                }
                            } catch (IOException unused) {
                                MethodCollector.m26664o(5430);
                            }
                        }

                        {
                            this.f204608a = r4;
                            this.f204609b = r5;
                            this.f204610c = r6;
                            this.f204611e = r7;
                        }
                    });
                    return;
                }
                throw new IOException(fVar.f203091b + " != " + i2);
            }
            C90138i a = C90118g.this.mo144876a(i);
            if (a == null) {
                C90118g.this.mo144879a(i, EnumC90109b.PROTOCOL_ERROR);
                long j2 = (long) i2;
                C90118g.this.mo144881a(j2);
                hVar.mo143838l(j2);
            } else if (C90138i.f204649m || !Thread.holdsLock(a)) {
                a.f204657h.mo144915a(hVar, (long) i2);
                if (z) {
                    a.mo144911e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|23) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r3 = okhttp3.internal.p4657e.EnumC90109b.PROTOCOL_ERROR;
            r1 = okhttp3.internal.p4657e.EnumC90109b.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
            r0 = r9.f204631b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r9.f204631b.mo144883a(r3, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
            okhttp3.internal.C90084c.m156415a(r9.f204630a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
            throw r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006d */
        @Override // okhttp3.internal.AbstractRunnableC90073b
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo144717b() {
            /*
            // Method dump skipped, instructions count: 136
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90118g.C90131e.mo144717b():void");
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144897a(final C90147m mVar) {
            try {
                C90118g.this.f204577i.execute(new AbstractRunnableC90073b("OkHttp %s ACK Settings", new Object[]{C90118g.this.f204573e}) {
                    /* class okhttp3.internal.p4657e.C90118g.C90131e.C901332 */

                    /* renamed from: a */
                    final /* synthetic */ boolean f204634a = false;

                    static {
                        Covode.recordClassIndex(106305);
                    }

                    @Override // okhttp3.internal.AbstractRunnableC90073b
                    /* renamed from: b */
                    public final void mo144717b() {
                        C90138i[] iVarArr;
                        long j;
                        MethodCollector.m26663i(6801);
                        C90131e eVar = C90131e.this;
                        boolean z = this.f204634a;
                        C90147m mVar = mVar;
                        synchronized (C90118g.this.f204590v) {
                            try {
                                synchronized (C90118g.this) {
                                    try {
                                        int b = C90118g.this.f204588t.mo144933b();
                                        if (z) {
                                            C90147m mVar2 = C90118g.this.f204588t;
                                            mVar2.f204690a = 0;
                                            Arrays.fill(mVar2.f204691b, 0);
                                        }
                                        C90147m mVar3 = C90118g.this.f204588t;
                                        int i = 0;
                                        while (true) {
                                            if (mVar.mo144932a(i)) {
                                                mVar3.mo144931a(i, mVar.f204691b[i]);
                                            }
                                            i++;
                                            if (i >= 10) {
                                                break;
                                            }
                                        }
                                        int b2 = C90118g.this.f204588t.mo144933b();
                                        iVarArr = null;
                                        if (b2 == -1 || b2 == b) {
                                            j = 0;
                                        } else {
                                            j = (long) (b2 - b);
                                            if (!C90118g.this.f204572d.isEmpty()) {
                                                iVarArr = (C90138i[]) C90118g.this.f204572d.values().toArray(new C90138i[C90118g.this.f204572d.size()]);
                                            }
                                        }
                                    } finally {
                                        MethodCollector.m26664o(6801);
                                    }
                                }
                                try {
                                    C90118g.this.f204590v.mo144921a(C90118g.this.f204588t);
                                } catch (IOException unused) {
                                    C90118g.this.mo144886b();
                                }
                            } finally {
                                MethodCollector.m26664o(6801);
                            }
                        }
                        if (iVarArr != null) {
                            for (C90138i iVar : iVarArr) {
                                synchronized (iVar) {
                                    try {
                                        iVar.mo144903a(j);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                        C90118g.f204567a.execute(new AbstractRunnableC90073b("OkHttp %s settings", C90118g.this.f204573e) {
                            /* class okhttp3.internal.p4657e.C90118g.C90131e.C901343 */

                            static {
                                Covode.recordClassIndex(106306);
                            }

                            @Override // okhttp3.internal.AbstractRunnableC90073b
                            /* renamed from: b */
                            public final void mo144717b() {
                                C90118g.this.f204571c.mo144818a(C90118g.this);
                            }
                        });
                        MethodCollector.m26664o(6801);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        C90131e(C90135h hVar) {
            super("OkHttp %s", C90118g.this.f204573e);
            this.f204630a = hVar;
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144893a(int i, long j) {
            MethodCollector.m26663i(9284);
            if (i == 0) {
                synchronized (C90118g.this) {
                    try {
                        C90118g.this.f204586r += j;
                        C90118g.this.notifyAll();
                    } finally {
                        MethodCollector.m26664o(9284);
                    }
                }
                return;
            }
            C90138i a = C90118g.this.mo144876a(i);
            if (a != null) {
                synchronized (a) {
                    try {
                        a.mo144903a(j);
                    } finally {
                        MethodCollector.m26664o(9284);
                    }
                }
                return;
            }
            MethodCollector.m26664o(9284);
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144894a(int i, List<C90110c> list) {
            MethodCollector.m26663i(9286);
            C90118g gVar = C90118g.this;
            synchronized (gVar) {
                try {
                    if (gVar.f204592x.contains(Integer.valueOf(i))) {
                        gVar.mo144879a(i, EnumC90109b.PROTOCOL_ERROR);
                        return;
                    }
                    gVar.f204592x.add(Integer.valueOf(i));
                    try {
                        gVar.mo144882a(new AbstractRunnableC90073b("OkHttp %s Push Request[%s]", new Object[]{gVar.f204573e, Integer.valueOf(i)}, i, list) {
                            /* class okhttp3.internal.p4657e.C90118g.C901224 */

                            /* renamed from: a */
                            final /* synthetic */ int f204601a;

                            /* renamed from: b */
                            final /* synthetic */ List f204602b;

                            static {
                                Covode.recordClassIndex(106294);
                            }

                            @Override // okhttp3.internal.AbstractRunnableC90073b
                            /* renamed from: b */
                            public final void mo144717b() {
                                MethodCollector.m26663i(8168);
                                try {
                                    C90118g.this.f204590v.mo144919a(this.f204601a, EnumC90109b.CANCEL);
                                    synchronized (C90118g.this) {
                                        try {
                                            C90118g.this.f204592x.remove(Integer.valueOf(this.f204601a));
                                        } finally {
                                            MethodCollector.m26664o(8168);
                                        }
                                    }
                                } catch (IOException unused) {
                                    MethodCollector.m26664o(8168);
                                }
                            }

                            {
                                this.f204601a = r4;
                                this.f204602b = r5;
                            }
                        });
                        MethodCollector.m26664o(9286);
                    } catch (RejectedExecutionException unused) {
                        MethodCollector.m26664o(9286);
                    }
                } finally {
                    MethodCollector.m26664o(9286);
                }
            }
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144895a(int i, C89427i iVar) {
            C90138i[] iVarArr;
            MethodCollector.m26663i(9132);
            iVar.size();
            synchronized (C90118g.this) {
                try {
                    iVarArr = (C90138i[]) C90118g.this.f204572d.values().toArray(new C90138i[C90118g.this.f204572d.size()]);
                    C90118g.this.f204576h = true;
                } finally {
                    MethodCollector.m26664o(9132);
                }
            }
            for (C90138i iVar2 : iVarArr) {
                if (iVar2.f204652c > i && iVar2.mo144907b()) {
                    iVar2.mo144909c(EnumC90109b.REFUSED_STREAM);
                    C90118g.this.mo144885b(iVar2.f204652c);
                }
            }
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144896a(int i, EnumC90109b bVar) {
            if (C90118g.m156514c(i)) {
                C90118g gVar = C90118g.this;
                gVar.mo144882a(new AbstractRunnableC90073b("OkHttp %s Push Reset[%s]", new Object[]{gVar.f204573e, Integer.valueOf(i)}, i, bVar) {
                    /* class okhttp3.internal.p4657e.C90118g.C901257 */

                    /* renamed from: a */
                    final /* synthetic */ int f204613a;

                    /* renamed from: b */
                    final /* synthetic */ EnumC90109b f204614b;

                    static {
                        Covode.recordClassIndex(106297);
                    }

                    @Override // okhttp3.internal.AbstractRunnableC90073b
                    /* renamed from: b */
                    public final void mo144717b() {
                        MethodCollector.m26663i(6864);
                        synchronized (C90118g.this) {
                            try {
                                C90118g.this.f204592x.remove(Integer.valueOf(this.f204613a));
                            } finally {
                                MethodCollector.m26664o(6864);
                            }
                        }
                    }

                    {
                        this.f204613a = r4;
                        this.f204614b = r5;
                    }
                });
                return;
            }
            C90138i b = C90118g.this.mo144885b(i);
            if (b != null) {
                b.mo144909c(bVar);
            }
        }

        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        public final void mo144898a(boolean z, int i, int i2) {
            MethodCollector.m26663i(9131);
            if (z) {
                synchronized (C90118g.this) {
                    if (i == 1) {
                        try {
                            C90118g.this.f204580l++;
                        } catch (Throwable th) {
                            MethodCollector.m26664o(9131);
                            throw th;
                        }
                    } else if (i == 2) {
                        C90118g.this.f204582n++;
                    } else if (i == 3) {
                        C90118g.this.f204583o++;
                        C90118g.this.notifyAll();
                    }
                }
                MethodCollector.m26664o(9131);
                return;
            }
            try {
                C90118g.this.f204577i.execute(new C90130d(i, i2));
                MethodCollector.m26664o(9131);
            } catch (RejectedExecutionException unused) {
                MethodCollector.m26664o(9131);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
            if (okhttp3.internal.p4657e.C90138i.f204649m != false) goto L_0x00b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b2, code lost:
            if (java.lang.Thread.holdsLock(r2) != false) goto L_0x00e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            r2.f204656g = true;
            r2.f204654e.add(okhttp3.internal.C90084c.m156424b(r27));
            r0 = r2.mo144905a();
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c7, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
            if (r0 != false) goto L_0x00d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ca, code lost:
            r2.f204653d.mo144885b(r2.f204652c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
            if (r25 == false) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
            r2.mo144911e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00da, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dc, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8977);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
            r0 = new java.lang.AssertionError();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8977);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e8, code lost:
            throw r0;
         */
        @Override // okhttp3.internal.p4657e.C90135h.AbstractC90137b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo144899a(boolean r25, int r26, java.util.List<okhttp3.internal.p4657e.C90110c> r27) {
            /*
            // Method dump skipped, instructions count: 239
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90118g.C90131e.mo144899a(boolean, int, java.util.List):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144882a(AbstractRunnableC90073b bVar) {
        MethodCollector.m26663i(10286);
        if (!this.f204576h) {
            this.f204593z.execute(bVar);
        }
        MethodCollector.m26664o(10286);
    }

    /* renamed from: okhttp3.internal.e.g$a */
    public static class C90126a {

        /* renamed from: a */
        Socket f204616a;

        /* renamed from: b */
        String f204617b;

        /* renamed from: c */
        AbstractC89426h f204618c;

        /* renamed from: d */
        AbstractC89425g f204619d;

        /* renamed from: e */
        public AbstractC90128c f204620e = AbstractC90128c.f204625m;

        /* renamed from: f */
        AbstractC90145l f204621f = AbstractC90145l.f204689a;

        /* renamed from: g */
        boolean f204622g = true;

        /* renamed from: h */
        public int f204623h;

        static {
            Covode.recordClassIndex(106298);
        }

        /* renamed from: a */
        public final C90118g mo144892a() {
            return new C90118g(this);
        }

        /* renamed from: a */
        public final C90126a mo144891a(Socket socket, String str, AbstractC89426h hVar, AbstractC89425g gVar) {
            this.f204616a = socket;
            this.f204617b = str;
            this.f204618c = hVar;
            this.f204619d = gVar;
            return this;
        }
    }

    /* renamed from: b */
    public final void mo144886b() {
        try {
            EnumC90109b bVar = EnumC90109b.PROTOCOL_ERROR;
            mo144883a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo144883a(EnumC90109b.NO_ERROR, EnumC90109b.CANCEL);
    }

    /* renamed from: okhttp3.internal.e.g$c */
    public static abstract class AbstractC90128c {

        /* renamed from: m */
        public static final AbstractC90128c f204625m = new AbstractC90128c() {
            /* class okhttp3.internal.p4657e.C90118g.AbstractC90128c.C901291 */

            static {
                Covode.recordClassIndex(106301);
            }

            @Override // okhttp3.internal.p4657e.C90118g.AbstractC90128c
            /* renamed from: a */
            public final void mo144819a(C90138i iVar) {
                iVar.mo144904a(EnumC90109b.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public void mo144818a(C90118g gVar) {
        }

        /* renamed from: a */
        public abstract void mo144819a(C90138i iVar);

        static {
            Covode.recordClassIndex(106300);
        }
    }

    /* renamed from: okhttp3.internal.e.g$d */
    final class C90130d extends AbstractRunnableC90073b {

        /* renamed from: a */
        final boolean f204626a = true;

        /* renamed from: b */
        final int f204627b;

        /* renamed from: c */
        final int f204628c;

        static {
            Covode.recordClassIndex(106302);
        }

        @Override // okhttp3.internal.AbstractRunnableC90073b
        /* renamed from: b */
        public final void mo144717b() {
            C90118g.this.mo144884a(this.f204626a, this.f204627b, this.f204628c);
        }

        C90130d(int i, int i2) {
            super("OkHttp %s ping %08x%08x", C90118g.this.f204573e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f204627b = i;
            this.f204628c = i2;
        }
    }

    /* renamed from: okhttp3.internal.e.g$b */
    final class C90127b extends AbstractRunnableC90073b {
        static {
            Covode.recordClassIndex(106299);
        }

        @Override // okhttp3.internal.AbstractRunnableC90073b
        /* renamed from: b */
        public final void mo144717b() {
            boolean z;
            MethodCollector.m26663i(9361);
            synchronized (C90118g.this) {
                try {
                    if (C90118g.this.f204580l < C90118g.this.f204579k) {
                        z = true;
                    } else {
                        C90118g.this.f204579k++;
                        z = false;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9361);
                    throw th;
                }
            }
            if (z) {
                C90118g.this.mo144886b();
                MethodCollector.m26664o(9361);
                return;
            }
            C90118g.this.mo144884a(false, 1, 0);
            MethodCollector.m26664o(9361);
        }

        C90127b() {
            super("OkHttp %s ping", C90118g.this.f204573e);
        }
    }

    static {
        Covode.recordClassIndex(106290);
    }

    /* renamed from: c */
    public final void mo144889c() {
        this.f204590v.mo144917a();
        this.f204590v.mo144926b(this.f204587s);
        int b = this.f204587s.mo144933b();
        if (b != 65535) {
            this.f204590v.mo144918a(0, (long) (b - 65535));
        }
        new Thread(this.f204591w).start();
    }

    /* renamed from: a */
    public final synchronized int mo144875a() {
        MethodCollector.m26663i(9521);
        C90147m mVar = this.f204588t;
        if ((mVar.f204690a & 16) != 0) {
            int i = mVar.f204691b[4];
            MethodCollector.m26664o(9521);
            return i;
        }
        MethodCollector.m26664o(9521);
        return Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C90138i mo144876a(int i) {
        C90138i iVar;
        MethodCollector.m26663i(9519);
        iVar = this.f204572d.get(Integer.valueOf(i));
        MethodCollector.m26664o(9519);
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C90138i mo144885b(int i) {
        C90138i remove;
        MethodCollector.m26663i(9520);
        remove = this.f204572d.remove(Integer.valueOf(i));
        notifyAll();
        MethodCollector.m26664o(9520);
        return remove;
    }

    /* renamed from: a */
    private void m156513a(EnumC90109b bVar) {
        MethodCollector.m26663i(9968);
        synchronized (this.f204590v) {
            try {
                synchronized (this) {
                    try {
                        if (!this.f204576h) {
                            this.f204576h = true;
                            this.f204590v.mo144920a(this.f204574f, bVar, C90084c.f204446a);
                            MethodCollector.m26664o(9968);
                        }
                    } finally {
                        MethodCollector.m26664o(9968);
                    }
                }
            } finally {
                MethodCollector.m26664o(9968);
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo144888b(long j) {
        MethodCollector.m26663i(10285);
        if (this.f204576h) {
            MethodCollector.m26664o(10285);
            return false;
        } else if (this.f204582n >= this.f204581m || j < this.f204584p) {
            MethodCollector.m26664o(10285);
            return true;
        } else {
            MethodCollector.m26664o(10285);
            return false;
        }
    }

    C90118g(C90126a aVar) {
        int i;
        C90147m mVar = new C90147m();
        this.f204588t = mVar;
        this.f204592x = new LinkedHashSet();
        this.f204578j = aVar.f204621f;
        boolean z = aVar.f204622g;
        this.f204570b = z;
        this.f204571c = aVar.f204620e;
        if (aVar.f204622g) {
            i = 1;
        } else {
            i = 2;
        }
        this.f204575g = i;
        if (aVar.f204622g) {
            this.f204575g += 2;
        }
        if (aVar.f204622g) {
            this.f204587s.mo144931a(7, 16777216);
        }
        String str = aVar.f204617b;
        this.f204573e = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C90084c.m156412a(C90084c.m156407a("OkHttp %s Writer", str), false));
        this.f204577i = scheduledThreadPoolExecutor;
        if (aVar.f204623h != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new C90127b(), (long) aVar.f204623h, (long) aVar.f204623h, TimeUnit.MILLISECONDS);
        }
        this.f204593z = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C90084c.m156412a(C90084c.m156407a("OkHttp %s Push Observer", str), true));
        mVar.mo144931a(7, 65535);
        mVar.mo144931a(5, 16384);
        this.f204586r = (long) mVar.mo144933b();
        this.f204589u = aVar.f204616a;
        this.f204590v = new C90142j(aVar.f204619d, z);
        this.f204591w = new C90131e(new C90135h(aVar.f204618c, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo144887b(int i, EnumC90109b bVar) {
        this.f204590v.mo144919a(i, bVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[Catch:{ all -> 0x0067 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.p4657e.C90138i mo144877a(java.util.List<okhttp3.internal.p4657e.C90110c> r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90118g.mo144877a(java.util.List, boolean):okhttp3.internal.e.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144878a(final int i, final long j) {
        try {
            this.f204577i.execute(new AbstractRunnableC90073b("OkHttp Window Update %s stream %d", new Object[]{this.f204573e, Integer.valueOf(i)}) {
                /* class okhttp3.internal.p4657e.C90118g.C901202 */

                static {
                    Covode.recordClassIndex(106292);
                }

                @Override // okhttp3.internal.AbstractRunnableC90073b
                /* renamed from: b */
                public final void mo144717b() {
                    try {
                        C90118g.this.f204590v.mo144918a(i, j);
                    } catch (IOException unused) {
                        C90118g.this.mo144886b();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144879a(final int i, final EnumC90109b bVar) {
        try {
            this.f204577i.execute(new AbstractRunnableC90073b("OkHttp %s stream %d", new Object[]{this.f204573e, Integer.valueOf(i)}) {
                /* class okhttp3.internal.p4657e.C90118g.C901191 */

                static {
                    Covode.recordClassIndex(106291);
                }

                @Override // okhttp3.internal.AbstractRunnableC90073b
                /* renamed from: b */
                public final void mo144717b() {
                    try {
                        C90118g.this.mo144887b(i, bVar);
                    } catch (IOException unused) {
                        C90118g.this.mo144886b();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144884a(boolean z, int i, int i2) {
        try {
            this.f204590v.mo144922a(z, i, i2);
        } catch (IOException unused) {
            mo144886b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r12, r0), r8.f204590v.f204676a);
        r0 = (long) r4;
        r8.f204586r -= r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo144880a(int r9, boolean r10, p4632k.C89420f r11, long r12) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4657e.C90118g.mo144880a(int, boolean, k.f, long):void");
    }
}
