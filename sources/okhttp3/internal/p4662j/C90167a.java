package okhttp3.internal.p4662j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90036ag;
import okhttp3.AbstractC90037ah;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90051f;
import okhttp3.AbstractC90191p;
import okhttp3.C90029ac;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4662j.C90176c;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.j.a */
public final class C90167a implements AbstractC90036ag, C90176c.AbstractC90177a {

    /* renamed from: i */
    static final /* synthetic */ boolean f204724i = true;

    /* renamed from: j */
    private static final List<EnumC90211z> f204725j = Collections.singletonList(EnumC90211z.HTTP_1_1);

    /* renamed from: a */
    final AbstractC90037ah f204726a;

    /* renamed from: b */
    final long f204727b;

    /* renamed from: c */
    final String f204728c;

    /* renamed from: d */
    AbstractC90049e f204729d;

    /* renamed from: e */
    C90178d f204730e;

    /* renamed from: f */
    boolean f204731f;

    /* renamed from: g */
    int f204732g;

    /* renamed from: h */
    boolean f204733h;

    /* renamed from: k */
    private final Request f204734k;

    /* renamed from: l */
    private final Random f204735l;

    /* renamed from: m */
    private final Runnable f204736m;

    /* renamed from: n */
    private C90176c f204737n;

    /* renamed from: o */
    private ScheduledExecutorService f204738o;

    /* renamed from: p */
    private AbstractC90174e f204739p;

    /* renamed from: q */
    private final ArrayDeque<C89427i> f204740q = new ArrayDeque<>();

    /* renamed from: r */
    private final ArrayDeque<Object> f204741r = new ArrayDeque<>();

    /* renamed from: s */
    private long f204742s;

    /* renamed from: t */
    private boolean f204743t;

    /* renamed from: u */
    private ScheduledFuture<?> f204744u;

    /* renamed from: v */
    private int f204745v = -1;

    /* renamed from: w */
    private String f204746w;

    /* renamed from: x */
    private int f204747x;

    /* renamed from: y */
    private int f204748y;

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: a */
    public final Request mo22032a() {
        return this.f204734k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.j.a$a */
    public final class RunnableC90170a implements Runnable {
        static {
            Covode.recordClassIndex(106342);
        }

        public final void run() {
            C90167a.this.f204729d.mo144710c();
        }

        RunnableC90170a() {
        }
    }

    static {
        Covode.recordClassIndex(106339);
    }

    /* renamed from: e */
    private void m156704e() {
        if (f204724i || Thread.holdsLock(this)) {
            ScheduledExecutorService scheduledExecutorService = this.f204738o;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(this.f204736m);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // okhttp3.internal.p4662j.C90176c.AbstractC90177a
    /* renamed from: c */
    public final synchronized void mo144984c() {
        MethodCollector.m26663i(6350);
        this.f204748y++;
        this.f204733h = false;
        MethodCollector.m26664o(6350);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.j.a$d */
    public final class RunnableC90173d implements Runnable {
        static {
            Covode.recordClassIndex(106345);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            if (r7 == -1) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
            r2.mo144977a(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r2.f204727b + "ms (after " + (r7 - 1) + " successful ping/pongs)"), (okhttp3.C90029ac) null);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11198);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r4.mo144993a(9, p4632k.C89427i.EMPTY);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11198);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
            r2.mo144977a(r0, (okhttp3.C90029ac) null);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(11198);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4662j.C90167a.RunnableC90173d.run():void");
        }

        RunnableC90173d() {
        }
    }

    /* renamed from: b */
    public final void mo144982b() {
        while (this.f204745v == -1) {
            C90176c cVar = this.f204737n;
            cVar.mo144989a();
            if (cVar.f204769h) {
                cVar.mo144990b();
            } else {
                int i = cVar.f204766e;
                if (i == 1 || i == 2) {
                    cVar.mo144991c();
                    if (i == 1) {
                        cVar.f204764c.mo144978a(cVar.f204770i.mo143848r());
                    } else {
                        cVar.f204764c.mo144980a(cVar.f204770i.mo143847q());
                    }
                } else {
                    throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r10 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r6.mo144993a(10, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if ((r2 instanceof okhttp3.internal.p4662j.C90167a.C90172c) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r7 = r2.f204757b;
        r3 = r2.f204756a;
        r1 = (long) r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r6.f204781h != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r6.f204781h = true;
        r6.f204780g.f204784a = r3;
        r6.f204780g.f204785b = r1;
        r6.f204780g.f204786c = true;
        r6.f204780g.f204787d = false;
        r0 = p4632k.C89436q.m155159a(r6.f204780g);
        r0.mo68850a(r7);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r13.f204742s -= (long) r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r1 = new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if ((r2 instanceof okhttp3.internal.p4662j.C90167a.C90171b) == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        r2 = (okhttp3.internal.p4662j.C90167a.C90171b) r2;
        r3 = r2.f204753a;
        r2 = r2.f204754b;
        r1 = p4632k.C89427i.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        if (r3 != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r2 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        okhttp3.internal.p4662j.C90175b.m156721b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00cf, code lost:
        r0 = new p4632k.C89420f();
        r0.mo68854b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d7, code lost:
        if (r2 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d9, code lost:
        r0.mo68850a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        r1 = r0.mo143847q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r6.mo144993a(8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e5, code lost:
        r6.f204778e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e7, code lost:
        if (r4 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        r13.f204726a.onClosed(r13, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ee, code lost:
        okhttp3.internal.C90084c.m156415a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f6, code lost:
        r6.f204778e = true;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fc, code lost:
        r0 = new java.lang.AssertionError();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0104, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0105, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0106, code lost:
        okhttp3.internal.C90084c.m156415a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6502);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010c, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo144985d() {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p4662j.C90167a.mo144985d():boolean");
    }

    @Override // okhttp3.internal.p4662j.C90176c.AbstractC90177a
    /* renamed from: a */
    public final void mo144978a(String str) {
        this.f204726a.onMessage(this, str);
    }

    @Override // okhttp3.internal.p4662j.C90176c.AbstractC90177a
    /* renamed from: a */
    public final void mo144980a(C89427i iVar) {
        this.f204726a.onMessage(this, iVar);
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: b */
    public final boolean mo22041b(String str) {
        Objects.requireNonNull(str, "text == null");
        return m156702a(C89427i.encodeUtf8(str), 1);
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: c */
    public final boolean mo22045c(C89427i iVar) {
        Objects.requireNonNull(iVar, "bytes == null");
        return m156702a(iVar, 2);
    }

    @Override // okhttp3.internal.p4662j.C90176c.AbstractC90177a
    /* renamed from: b */
    public final synchronized void mo144983b(C89427i iVar) {
        MethodCollector.m26663i(6349);
        if (this.f204731f || (this.f204743t && this.f204741r.isEmpty())) {
            MethodCollector.m26664o(6349);
            return;
        }
        this.f204740q.add(iVar);
        m156704e();
        this.f204747x++;
        MethodCollector.m26664o(6349);
    }

    /* renamed from: a */
    public final void mo144981a(C90208y yVar) {
        C90208y d = yVar.mo145086b().mo145095a(AbstractC90191p.NONE).mo145089a(f204725j).mo145103d();
        final Request a = this.f204734k.newBuilder().mo144692a("Upgrade", "websocket").mo144692a("Connection", "Upgrade").mo144692a("Sec-WebSocket-Key", this.f204728c).mo144692a("Sec-WebSocket-Version", "13").mo144698a();
        AbstractC90049e a2 = AbstractC90058a.f204330a.mo144784a(d, a);
        this.f204729d = a2;
        a2.mo144713e().mo143782S_();
        this.f204729d.mo144708a(new AbstractC90051f() {
            /* class okhttp3.internal.p4662j.C90167a.C901692 */

            static {
                Covode.recordClassIndex(106341);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onFailure(AbstractC90049e eVar, IOException iOException) {
                C90167a.this.mo144977a(iOException, (C90029ac) null);
            }

            @Override // okhttp3.AbstractC90051f
            public final void onResponse(AbstractC90049e eVar, C90029ac acVar) {
                try {
                    C90167a aVar = C90167a.this;
                    if (acVar.f204107c == 101) {
                        String b = acVar.mo144721b("Connection");
                        if ("Upgrade".equalsIgnoreCase(b)) {
                            String b2 = acVar.mo144721b("Upgrade");
                            if ("websocket".equalsIgnoreCase(b2)) {
                                String b3 = acVar.mo144721b("Sec-WebSocket-Accept");
                                String base64 = C89427i.encodeUtf8(aVar.f204728c + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                                if (base64.equals(b3)) {
                                    C90082g a = AbstractC90058a.f204330a.mo144787a(eVar);
                                    a.mo144843d();
                                    AbstractC90174e a2 = a.mo144841b().mo144816a(a);
                                    try {
                                        C90167a.this.f204726a.onOpen(C90167a.this, acVar);
                                        C90167a.this.mo144979a("OkHttp WebSocket " + a.url().mo145059i(), a2);
                                        a.mo144841b().f204403c.setSoTimeout(0);
                                        C90167a.this.mo144982b();
                                    } catch (Exception e) {
                                        C90167a.this.mo144977a(e, (C90029ac) null);
                                    }
                                } else {
                                    throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + b3 + "'");
                                }
                            } else {
                                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + b2 + "'");
                            }
                        } else {
                            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + b + "'");
                        }
                    } else {
                        throw new ProtocolException("Expected HTTP 101 response but was '" + acVar.f204107c + " " + acVar.f204108d + "'");
                    }
                } catch (ProtocolException e2) {
                    C90167a.this.mo144977a(e2, acVar);
                    C90084c.m156415a(acVar);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.j.a$c */
    public static final class C90172c {

        /* renamed from: a */
        final int f204756a;

        /* renamed from: b */
        final C89427i f204757b;

        static {
            Covode.recordClassIndex(106344);
        }

        C90172c(int i, C89427i iVar) {
            this.f204756a = i;
            this.f204757b = iVar;
        }
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: b */
    public final boolean mo22040b(int i, String str) {
        return m156703c(i, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.j.a$b */
    public static final class C90171b {

        /* renamed from: a */
        final int f204753a;

        /* renamed from: b */
        final C89427i f204754b;

        /* renamed from: c */
        final long f204755c = 60000;

        static {
            Covode.recordClassIndex(106343);
        }

        C90171b(int i, C89427i iVar) {
            this.f204753a = i;
            this.f204754b = iVar;
        }
    }

    /* renamed from: okhttp3.internal.j.a$e */
    public static abstract class AbstractC90174e implements Closeable {

        /* renamed from: c */
        public final boolean f204759c = true;

        /* renamed from: d */
        public final AbstractC89426h f204760d;

        /* renamed from: e */
        public final AbstractC89425g f204761e;

        static {
            Covode.recordClassIndex(106346);
        }

        public AbstractC90174e(AbstractC89426h hVar, AbstractC89425g gVar) {
            this.f204760d = hVar;
            this.f204761e = gVar;
        }
    }

    /* renamed from: a */
    private synchronized boolean m156702a(C89427i iVar, int i) {
        MethodCollector.m26663i(6498);
        if (this.f204731f || this.f204743t) {
            MethodCollector.m26664o(6498);
            return false;
        } else if (this.f204742s + ((long) iVar.size()) > 16777216) {
            m156703c(1001, null);
            MethodCollector.m26664o(6498);
            return false;
        } else {
            this.f204742s += (long) iVar.size();
            this.f204741r.add(new C90172c(i, iVar));
            m156704e();
            MethodCollector.m26664o(6498);
            return true;
        }
    }

    /* renamed from: c */
    private synchronized boolean m156703c(int i, String str) {
        MethodCollector.m26663i(6500);
        C90175b.m156721b(i);
        C89427i iVar = null;
        if (str != null) {
            iVar = C89427i.encodeUtf8(str);
            if (((long) iVar.size()) > 123) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("reason.size() > 123: ".concat(String.valueOf(str)));
                MethodCollector.m26664o(6500);
                throw illegalArgumentException;
            }
        }
        if (!this.f204731f) {
            if (!this.f204743t) {
                this.f204743t = true;
                this.f204741r.add(new C90171b(i, iVar));
                m156704e();
                MethodCollector.m26664o(6500);
                return true;
            }
        }
        MethodCollector.m26664o(6500);
        return false;
    }

    @Override // okhttp3.internal.p4662j.C90176c.AbstractC90177a
    /* renamed from: a */
    public final void mo144976a(int i, String str) {
        AbstractC90174e eVar;
        MethodCollector.m26663i(6352);
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.f204745v == -1) {
                        this.f204745v = i;
                        this.f204746w = str;
                        eVar = null;
                        if (this.f204743t && this.f204741r.isEmpty()) {
                            AbstractC90174e eVar2 = this.f204739p;
                            this.f204739p = eVar;
                            ScheduledFuture<?> scheduledFuture = this.f204744u;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.f204738o.shutdown();
                            eVar = eVar2;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("already closed");
                        MethodCollector.m26664o(6352);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6352);
                    throw th;
                }
            }
            try {
                this.f204726a.onClosing(this, i, str);
                if (eVar != null) {
                    this.f204726a.onClosed(this, i, str);
                }
            } finally {
                C90084c.m156415a(eVar);
                MethodCollector.m26664o(6352);
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            MethodCollector.m26664o(6352);
            throw illegalArgumentException;
        }
    }

    /* renamed from: a */
    public final void mo144977a(Exception exc, C90029ac acVar) {
        MethodCollector.m26663i(6655);
        synchronized (this) {
            try {
                if (!this.f204731f) {
                    this.f204731f = true;
                    AbstractC90174e eVar = this.f204739p;
                    this.f204739p = null;
                    ScheduledFuture<?> scheduledFuture = this.f204744u;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledExecutorService scheduledExecutorService = this.f204738o;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdown();
                    }
                    try {
                        this.f204726a.onFailure(this, exc, acVar);
                    } finally {
                        C90084c.m156415a(eVar);
                        MethodCollector.m26664o(6655);
                    }
                }
            } finally {
                MethodCollector.m26664o(6655);
            }
        }
    }

    /* renamed from: a */
    public final void mo144979a(String str, AbstractC90174e eVar) {
        MethodCollector.m26663i(6347);
        synchronized (this) {
            try {
                this.f204739p = eVar;
                this.f204730e = new C90178d(eVar.f204759c, eVar.f204761e, this.f204735l);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C90084c.m156412a(str, false));
                this.f204738o = scheduledThreadPoolExecutor;
                if (this.f204727b != 0) {
                    RunnableC90173d dVar = new RunnableC90173d();
                    long j = this.f204727b;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar, j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.f204741r.isEmpty()) {
                    m156704e();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(6347);
                throw th;
            }
        }
        this.f204737n = new C90176c(eVar.f204759c, eVar.f204760d, this);
        MethodCollector.m26664o(6347);
    }

    public C90167a(Request request, AbstractC90037ah ahVar, Random random, long j) {
        if ("GET".equals(request.method())) {
            this.f204734k = request;
            this.f204726a = ahVar;
            this.f204735l = random;
            this.f204727b = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f204728c = C89427i.m155136of(bArr).base64();
            this.f204736m = new Runnable() {
                /* class okhttp3.internal.p4662j.C90167a.RunnableC901681 */

                static {
                    Covode.recordClassIndex(106340);
                }

                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            C90167a.this.mo144977a(e, (C90029ac) null);
                            return;
                        }
                    } while (C90167a.this.mo144985d());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
