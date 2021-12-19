package com.bytedance.common.wschannel.channel.p916a.p917a.p919b;

import com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import okhttp3.AbstractC90049e;
import okhttp3.C90029ac;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4662j.C90167a;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a */
public class C13696a implements AbstractC13703b, C13706e.AbstractC13707a {

    /* renamed from: i */
    static final /* synthetic */ boolean f33267i = true;

    /* renamed from: j */
    private static final List<EnumC90211z> f33268j = Collections.singletonList(EnumC90211z.HTTP_1_1);

    /* renamed from: a */
    public AbstractC13704c f33269a;

    /* renamed from: b */
    public final Request f33270b;

    /* renamed from: c */
    public final String f33271c;

    /* renamed from: d */
    public AbstractC90049e f33272d;

    /* renamed from: e */
    C13708f f33273e;

    /* renamed from: f */
    boolean f33274f;

    /* renamed from: g */
    int f33275g;

    /* renamed from: h */
    boolean f33276h;

    /* renamed from: k */
    private final Random f33277k;

    /* renamed from: l */
    private final Runnable f33278l;

    /* renamed from: m */
    private final ArrayDeque<C89427i> f33279m = new ArrayDeque<>();

    /* renamed from: n */
    private final ArrayDeque<Object> f33280n = new ArrayDeque<>();

    /* renamed from: o */
    private final long f33281o;

    /* renamed from: p */
    private C13706e f33282p;

    /* renamed from: q */
    private ScheduledExecutorService f33283q;

    /* renamed from: r */
    private C90167a.AbstractC90174e f33284r;

    /* renamed from: s */
    private long f33285s;

    /* renamed from: t */
    private boolean f33286t;

    /* renamed from: u */
    private ScheduledFuture<?> f33287u;

    /* renamed from: v */
    private int f33288v = -1;

    /* renamed from: w */
    private String f33289w;

    /* renamed from: x */
    private int f33290x;

    /* renamed from: y */
    private int f33291y;

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: a */
    public final Request mo22032a() {
        return this.f33270b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$a */
    public final class RunnableC13699a implements Runnable {
        static {
            Covode.recordClassIndex(15733);
        }

        public final void run() {
            C13696a.this.mo22038b();
        }

        RunnableC13699a() {
        }
    }

    /* renamed from: b */
    public final void mo22038b() {
        this.f33272d.mo144710c();
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.AbstractC13703b
    /* renamed from: f */
    public final void mo22048f() {
        ScheduledExecutorService scheduledExecutorService = this.f33283q;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(new RunnableC13702d());
        }
    }

    static {
        Covode.recordClassIndex(15730);
    }

    /* renamed from: g */
    private void m24661g() {
        if (f33267i || Thread.holdsLock(this)) {
            ScheduledExecutorService scheduledExecutorService = this.f33283q;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(this.f33278l);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e.AbstractC13707a
    /* renamed from: d */
    public final synchronized void mo22046d() {
        MethodCollector.m26663i(11392);
        this.f33291y++;
        this.f33276h = false;
        AbstractC13704c cVar = this.f33269a;
        if (cVar != null) {
            cVar.mo22012a(this);
        }
        MethodCollector.m26664o(11392);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$d */
    public final class RunnableC13702d implements Runnable {
        static {
            Covode.recordClassIndex(15736);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r3 == -1) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
            r7.mo22034a(new java.net.SocketTimeoutException("sent ping but didn't receive pong"), (okhttp3.C90029ac) null);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10296);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            if (r5 == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r5.mo22059a(9, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10296);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
            r7.mo22034a(r0, (okhttp3.C90029ac) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(10296);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                r8 = 10296(0x2838, float:1.4428E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r8)
                com.bytedance.common.wschannel.channel.a.a.b.a r7 = com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.this
                k.i r6 = p4632k.C89427i.EMPTY
                monitor-enter(r7)
                boolean r0 = r7.f33274f     // Catch:{ all -> 0x004c }
                if (r0 == 0) goto L_0x0013
                monitor-exit(r7)     // Catch:{ all -> 0x004c }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                return
            L_0x0013:
                com.bytedance.common.wschannel.channel.a.a.b.f r5 = r7.f33273e
                boolean r0 = r7.f33276h
                r4 = -1
                if (r0 == 0) goto L_0x0026
                int r3 = r7.f33275g
            L_0x001c:
                int r1 = r7.f33275g
                r0 = 1
                int r1 = r1 + r0
                r7.f33275g = r1
                r7.f33276h = r0
                monitor-exit(r7)
                goto L_0x0028
            L_0x0026:
                r3 = -1
                goto L_0x001c
            L_0x0028:
                r2 = 0
                if (r3 == r4) goto L_0x0039
                java.net.SocketTimeoutException r1 = new java.net.SocketTimeoutException
                java.lang.String r0 = "sent ping but didn't receive pong"
                r1.<init>(r0)
                r7.mo22034a(r1, r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                return
            L_0x0039:
                if (r5 == 0) goto L_0x0048
                r0 = 9
                r5.mo22059a(r0, r6)     // Catch:{ IOException -> 0x0044 }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                return
            L_0x0044:
                r0 = move-exception
                r7.mo22034a(r0, r2)
            L_0x0048:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                return
            L_0x004c:
                r0 = move-exception
                monitor-exit(r7)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.RunnableC13702d.run():void");
        }

        RunnableC13702d() {
        }
    }

    /* renamed from: c */
    public final void mo22042c() {
        while (this.f33288v == -1) {
            C13706e eVar = this.f33282p;
            eVar.mo22054a();
            if (eVar.f33308g > eVar.f33302a) {
                eVar.mo22055a(eVar.f33308g);
            } else if (eVar.f33310i) {
                eVar.mo22056b();
            } else {
                int i = eVar.f33307f;
                if (i == 1 || i == 2) {
                    eVar.mo22057c();
                    if (i == 1) {
                        eVar.f33305d.mo22035a(eVar.f33311j.mo143848r());
                    } else {
                        eVar.f33305d.mo22037a(eVar.f33311j.mo143847q());
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
        r6.mo22059a(10, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if ((r2 instanceof com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.C13701c) == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r7 = r2.f33300b;
        r3 = r2.f33299a;
        r1 = (long) r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r6.f33322h != false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        r6.f33322h = true;
        r6.f33321g.f33325a = r3;
        r6.f33321g.f33326b = r1;
        r6.f33321g.f33327c = true;
        r6.f33321g.f33328d = false;
        r0 = p4632k.C89436q.m155159a(r6.f33321g);
        r0.mo68850a(r7);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r13.f33285s -= (long) r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00af, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        r1 = new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if ((r2 instanceof com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.C13700b) == false) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        r2 = (com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.C13700b) r2;
        r3 = r2.f33296a;
        r2 = r2.f33297b;
        r1 = p4632k.C89427i.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        if (r3 != 0) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c9, code lost:
        if (r2 == null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13705d.m24689b(r3);
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
        r6.mo22059a(8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e5, code lost:
        r6.f33319e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e7, code lost:
        if (r4 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e9, code lost:
        r0 = r13.f33269a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00eb, code lost:
        if (r0 == null) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ed, code lost:
        r0.mo22018b(r13, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        okhttp3.internal.C90084c.m156415a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f8, code lost:
        r6.f33319e = true;
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00fe, code lost:
        r0 = new java.lang.AssertionError();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0106, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0108, code lost:
        okhttp3.internal.C90084c.m156415a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12037);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010e, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22047e() {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.mo22047e():boolean");
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e.AbstractC13707a
    /* renamed from: a */
    public final void mo22035a(String str) {
        AbstractC13704c cVar = this.f33269a;
        if (cVar != null) {
            cVar.mo22016a(str);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e.AbstractC13707a
    /* renamed from: a */
    public final void mo22037a(C89427i iVar) {
        AbstractC13704c cVar = this.f33269a;
        if (cVar != null) {
            cVar.mo22017a(iVar);
        }
    }

    /* renamed from: c */
    public final void mo22043c(String str) {
        this.f33269a = null;
        try {
            mo22044c(1000, str);
        } catch (Throwable unused) {
        }
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: b */
    public final boolean mo22041b(String str) {
        Objects.requireNonNull(str, "text == null");
        return m24660a(C89427i.encodeUtf8(str), 1);
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: c */
    public final boolean mo22045c(C89427i iVar) {
        Objects.requireNonNull(iVar, "bytes == null");
        return m24660a(iVar, 2);
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e.AbstractC13707a
    /* renamed from: b */
    public final synchronized void mo22039b(C89427i iVar) {
        MethodCollector.m26663i(11244);
        if (this.f33274f || (this.f33286t && this.f33280n.isEmpty())) {
            MethodCollector.m26664o(11244);
            return;
        }
        this.f33279m.add(iVar);
        m24661g();
        this.f33290x++;
        MethodCollector.m26664o(11244);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$c */
    public static final class C13701c {

        /* renamed from: a */
        final int f33299a;

        /* renamed from: b */
        final C89427i f33300b;

        static {
            Covode.recordClassIndex(15735);
        }

        C13701c(int i, C89427i iVar) {
            this.f33299a = i;
            this.f33300b = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$b */
    public static final class C13700b {

        /* renamed from: a */
        final int f33296a;

        /* renamed from: b */
        final C89427i f33297b;

        /* renamed from: c */
        final long f33298c = 60000;

        static {
            Covode.recordClassIndex(15734);
        }

        C13700b(int i, C89427i iVar) {
            this.f33296a = i;
            this.f33297b = iVar;
        }
    }

    @Override // okhttp3.AbstractC90036ag
    /* renamed from: b */
    public final boolean mo22040b(int i, String str) {
        return mo22044c(i, str);
    }

    /* renamed from: a */
    private synchronized boolean m24660a(C89427i iVar, int i) {
        MethodCollector.m26663i(11723);
        if (this.f33274f || this.f33286t) {
            MethodCollector.m26664o(11723);
            return false;
        } else if (this.f33285s + ((long) iVar.size()) > 16777216) {
            mo22044c(1001, null);
            MethodCollector.m26664o(11723);
            return false;
        } else {
            this.f33285s += (long) iVar.size();
            this.f33280n.add(new C13701c(i, iVar));
            m24661g();
            MethodCollector.m26664o(11723);
            return true;
        }
    }

    @Override // com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13706e.AbstractC13707a
    /* renamed from: a */
    public final void mo22033a(int i, String str) {
        C90167a.AbstractC90174e eVar;
        MethodCollector.m26663i(11394);
        if (i != -1) {
            synchronized (this) {
                try {
                    if (this.f33288v == -1) {
                        this.f33288v = i;
                        this.f33289w = str;
                        eVar = null;
                        if (this.f33286t && this.f33280n.isEmpty()) {
                            C90167a.AbstractC90174e eVar2 = this.f33284r;
                            this.f33284r = eVar;
                            ScheduledFuture<?> scheduledFuture = this.f33287u;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.f33283q.shutdown();
                            eVar = eVar2;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("already closed");
                        MethodCollector.m26664o(11394);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11394);
                    throw th;
                }
            }
            try {
                AbstractC13704c cVar = this.f33269a;
                if (cVar != null) {
                    cVar.mo22013a(this, i, str);
                    if (eVar != null) {
                        this.f33269a.mo22018b(this, i, str);
                    }
                }
            } finally {
                C90084c.m156415a(eVar);
                MethodCollector.m26664o(11394);
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            MethodCollector.m26664o(11394);
            throw illegalArgumentException;
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo22044c(int i, String str) {
        MethodCollector.m26663i(11894);
        C13705d.m24689b(i);
        C89427i iVar = null;
        if (str != null) {
            iVar = C89427i.encodeUtf8(str);
            if (((long) iVar.size()) > 123) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("reason.size() > 123: ".concat(String.valueOf(str)));
                MethodCollector.m26664o(11894);
                throw illegalArgumentException;
            }
        }
        if (!this.f33274f) {
            if (!this.f33286t) {
                this.f33286t = true;
                this.f33280n.add(new C13700b(i, iVar));
                m24661g();
                MethodCollector.m26664o(11894);
                return true;
            }
        }
        MethodCollector.m26664o(11894);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0 = r4.f33269a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r0 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r0.mo22014a(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        okhttp3.internal.C90084c.m156415a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(12169);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22034a(java.lang.Exception r5, okhttp3.C90029ac r6) {
        /*
            r4 = this;
            r3 = 12169(0x2f89, float:1.7052E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            monitor-enter(r4)
            boolean r0 = r4.f33274f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x000f:
            r0 = 1
            r4.f33274f = r0
            okhttp3.internal.j.a$e r2 = r4.f33284r
            r0 = 0
            r4.f33284r = r0
            java.util.concurrent.ScheduledFuture<?> r1 = r4.f33287u
            if (r1 == 0) goto L_0x001f
            r0 = 0
            r1.cancel(r0)
        L_0x001f:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f33283q
            if (r0 == 0) goto L_0x0026
            r0.shutdown()
        L_0x0026:
            monitor-exit(r4)
            com.bytedance.common.wschannel.channel.a.a.b.c r0 = r4.f33269a     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            r0.mo22014a(r4, r5, r6)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            okhttp3.internal.C90084c.m156415a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0035:
            r0 = move-exception
            okhttp3.internal.C90084c.m156415a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x003d:
            r0 = move-exception
            monitor-exit(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.mo22034a(java.lang.Exception, okhttp3.ac):void");
    }

    /* renamed from: a */
    public final void mo22036a(String str, C90167a.AbstractC90174e eVar) {
        MethodCollector.m26663i(11093);
        synchronized (this) {
            try {
                this.f33284r = eVar;
                this.f33273e = new C13708f(eVar.f204759c, eVar.f204761e, this.f33277k);
                this.f33283q = new ScheduledThreadPoolExecutor(1, C90084c.m156412a(str, false));
                if (!this.f33280n.isEmpty()) {
                    m24661g();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(11093);
                throw th;
            }
        }
        this.f33282p = new C13706e(eVar.f204759c, eVar.f204760d, this, this.f33281o);
        MethodCollector.m26664o(11093);
    }

    public C13696a(Request request, long j, AbstractC13704c cVar, Random random) {
        if ("GET".equals(request.method())) {
            this.f33270b = request;
            this.f33269a = cVar;
            this.f33277k = random;
            this.f33281o = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f33271c = C89427i.m155136of(bArr).base64();
            this.f33278l = new Runnable() {
                /* class com.bytedance.common.wschannel.channel.p916a.p917a.p919b.C13696a.RunnableC136971 */

                static {
                    Covode.recordClassIndex(15731);
                }

                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            C13696a.this.mo22034a(e, (C90029ac) null);
                            return;
                        }
                    } while (C13696a.this.mo22047e());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
