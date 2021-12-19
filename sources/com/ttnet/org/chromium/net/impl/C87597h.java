package com.ttnet.org.chromium.net.impl;

import android.net.TrafficStats;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.watchlive.AudiencePingIntervalSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87533ac;
import com.ttnet.org.chromium.net.AbstractC87540d;
import com.ttnet.org.chromium.net.AbstractC87678z;
import com.ttnet.org.chromium.net.C87645j;
import com.ttnet.org.chromium.net.C87677y;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.ttnet.org.chromium.net.impl.h */
public final class C87597h extends AbstractC87640p {

    /* renamed from: a */
    public static final String f198929a = C87597h.class.getSimpleName();

    /* renamed from: b */
    public final C87614a f198930b;

    /* renamed from: c */
    public final Executor f198931c;

    /* renamed from: d */
    public final String f198932d;

    /* renamed from: e */
    public final Map<String, String> f198933e = new TreeMap(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: f */
    public final List<String> f198934f = new ArrayList();

    /* renamed from: g */
    public final AtomicReference<Integer> f198935g = new AtomicReference<>(0);

    /* renamed from: h */
    public final boolean f198936h;

    /* renamed from: i */
    public String f198937i;

    /* renamed from: j */
    public VersionSafeCallbacks.C87588e f198938j;

    /* renamed from: k */
    public Executor f198939k;

    /* renamed from: l */
    public volatile int f198940l = -1;

    /* renamed from: m */
    public String f198941m;

    /* renamed from: n */
    public ReadableByteChannel f198942n;

    /* renamed from: o */
    public C87642r f198943o;

    /* renamed from: p */
    public String f198944p;

    /* renamed from: q */
    public HttpURLConnection f198945q;

    /* renamed from: r */
    public C87624d f198946r;

    /* renamed from: t */
    private final AtomicBoolean f198947t = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.impl.h$b */
    public interface AbstractC87621b {
        static {
            Covode.recordClassIndex(103603);
        }

        /* renamed from: a */
        void mo141971a();
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141688a(long j) {
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141689a(String str, String str2) {
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: b */
    public final void mo141858b(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: c */
    public final void mo141860c(int i) {
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: d */
    public final void mo141861d(int i) {
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: e */
    public final String mo141694e() {
        return "";
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: e */
    public final void mo141862e(int i) {
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: f */
    public final void mo141695f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ttnet.org.chromium.net.impl.h$a */
    public final class C87614a {

        /* renamed from: a */
        final VersionSafeCallbacks.C87589f f198974a;

        /* renamed from: b */
        final Executor f198975b;

        /* renamed from: c */
        final Executor f198976c;

        static {
            Covode.recordClassIndex(103596);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141980a() {
            mo141981a(new AbstractC87621b() {
                /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.C876162 */

                static {
                    Covode.recordClassIndex(103598);
                }

                @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                /* renamed from: a */
                public final void mo141971a() {
                    if (C87597h.this.f198935g.compareAndSet(1, 4)) {
                        C87614a.this.f198974a.mo141707b(C87597h.this, C87597h.this.f198943o, "");
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo141981a(AbstractC87621b bVar) {
            try {
                this.f198975b.execute(new Runnable(bVar) {
                    /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC8760413 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC87621b f198961a;

                    static {
                        Covode.recordClassIndex(103586);
                    }

                    public final void run() {
                        try {
                            this.f198961a.mo141971a();
                        } catch (Throwable th) {
                            C87597h.this.mo141960a((AbstractC87540d) new C87591b("Exception received from UrlRequest.Callback", th));
                        }
                    }

                    {
                        this.f198961a = r2;
                    }
                });
            } catch (RejectedExecutionException e) {
                C87597h.this.mo141960a((AbstractC87540d) new C87593d("Exception posting task to executor", e));
            }
        }

        C87614a(AbstractC87529ab.AbstractC87531b bVar, Executor executor) {
            this.f198974a = new VersionSafeCallbacks.C87589f(bVar);
            if (C87597h.this.f198936h) {
                this.f198975b = executor;
                this.f198976c = null;
                return;
            }
            this.f198975b = new ExecutorC87622c(executor);
            this.f198976c = executor;
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.h$d */
    final class C87624d extends AbstractC87528aa {

        /* renamed from: a */
        final AtomicReference<Integer> f198996a = new AtomicReference<>(3);

        /* renamed from: b */
        final Executor f198997b;

        /* renamed from: c */
        final Executor f198998c;

        /* renamed from: d */
        final HttpURLConnection f198999d;

        /* renamed from: e */
        final AtomicBoolean f199000e = new AtomicBoolean(false);

        /* renamed from: f */
        WritableByteChannel f199001f;

        /* renamed from: g */
        OutputStream f199002g;

        /* renamed from: h */
        final VersionSafeCallbacks.C87588e f199003h;

        /* renamed from: i */
        ByteBuffer f199004i;

        /* renamed from: j */
        long f199005j;

        /* renamed from: k */
        long f199006k;

        static {
            Covode.recordClassIndex(103606);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo141990d() {
            mo141989c();
            C87597h.this.mo141963g();
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87528aa
        /* renamed from: a */
        public final void mo141683a() {
            if (this.f198996a.compareAndSet(1, 2)) {
                mo141988b();
                return;
            }
            throw new IllegalStateException("Not expecting a read result");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo141988b() {
            this.f198998c.execute(C87597h.this.mo141958a(new AbstractC87621b() {
                /* class com.ttnet.org.chromium.net.impl.C87597h.C87624d.C876283 */

                static {
                    Covode.recordClassIndex(103610);
                }

                @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                /* renamed from: a */
                public final void mo141971a() {
                    if (C87624d.this.f199001f == null) {
                        C87597h.this.f198940l = 10;
                        C87624d.this.f198999d.setDoOutput(true);
                        C87624d.this.f198999d.connect();
                        C87597h.this.f198940l = 12;
                        C87624d dVar = C87624d.this;
                        dVar.f199002g = dVar.f198999d.getOutputStream();
                        C87624d dVar2 = C87624d.this;
                        dVar2.f199001f = Channels.newChannel(dVar2.f199002g);
                    }
                    C87624d.this.f198996a.set(0);
                    C87624d.this.mo141987a(new AbstractC87621b() {
                        /* class com.ttnet.org.chromium.net.impl.C87597h.C87624d.C876283.C876291 */

                        static {
                            Covode.recordClassIndex(103611);
                        }

                        @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                        /* renamed from: a */
                        public final void mo141971a() {
                            C87624d.this.f199003h.mo141929a(C87624d.this, C87624d.this.f199004i);
                        }
                    });
                }
            }));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo141989c() {
            if (this.f199001f != null && this.f199000e.compareAndSet(false, true)) {
                this.f199001f.close();
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87528aa
        /* renamed from: a */
        public final void mo141684a(Exception exc) {
            C87597h.this.mo141961a(exc);
        }

        /* renamed from: a */
        public final void mo141987a(AbstractC87621b bVar) {
            try {
                this.f198997b.execute(C87597h.this.mo141962b(bVar));
            } catch (RejectedExecutionException e) {
                C87597h.this.mo141961a(e);
            }
        }

        @Override // com.ttnet.org.chromium.net.AbstractC87528aa
        /* renamed from: a */
        public final void mo141685a(final boolean z) {
            if (this.f198996a.compareAndSet(0, 2)) {
                this.f198998c.execute(C87597h.this.mo141958a(new AbstractC87621b() {
                    /* class com.ttnet.org.chromium.net.impl.C87597h.C87624d.C876262 */

                    static {
                        Covode.recordClassIndex(103608);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                    /* renamed from: a */
                    public final void mo141971a() {
                        C87624d.this.f199004i.flip();
                        if (C87624d.this.f199005j == -1 || C87624d.this.f199005j - C87624d.this.f199006k >= ((long) C87624d.this.f199004i.remaining())) {
                            while (C87624d.this.f199004i.hasRemaining()) {
                                C87624d.this.f199006k += (long) C87624d.this.f199001f.write(C87624d.this.f199004i);
                            }
                            C87624d.this.f199002g.flush();
                            if (C87624d.this.f199006k < C87624d.this.f199005j || (C87624d.this.f199005j == -1 && !z)) {
                                C87624d.this.f199004i.clear();
                                C87624d.this.f198996a.set(0);
                                C87624d.this.mo141987a(new AbstractC87621b() {
                                    /* class com.ttnet.org.chromium.net.impl.C87597h.C87624d.C876262.C876271 */

                                    static {
                                        Covode.recordClassIndex(103609);
                                    }

                                    @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                                    /* renamed from: a */
                                    public final void mo141971a() {
                                        C87624d.this.f199003h.mo141929a(C87624d.this, C87624d.this.f199004i);
                                    }
                                });
                            } else if (C87624d.this.f199005j == -1) {
                                C87624d.this.mo141990d();
                            } else if (C87624d.this.f199005j == C87624d.this.f199006k) {
                                C87624d.this.mo141990d();
                            } else {
                                C87597h.this.mo141961a(new IllegalArgumentException(C1764a.m5928a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(C87624d.this.f199006k), Long.valueOf(C87624d.this.f199005j)})));
                            }
                        } else {
                            C87597h.this.mo141961a(new IllegalArgumentException(C1764a.m5928a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(C87624d.this.f199006k + ((long) C87624d.this.f199004i.remaining())), Long.valueOf(C87624d.this.f199005j)})));
                        }
                    }
                }));
                return;
            }
            throw new IllegalStateException("Not expecting a read result, expecting: " + this.f198996a.get());
        }

        C87624d(final Executor executor, Executor executor2, HttpURLConnection httpURLConnection, VersionSafeCallbacks.C87588e eVar) {
            this.f198997b = new Executor(C87597h.this) {
                /* class com.ttnet.org.chromium.net.impl.C87597h.C87624d.ExecutorC876251 */

                static {
                    Covode.recordClassIndex(103607);
                }

                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RejectedExecutionException e) {
                        C87597h.this.mo141961a(e);
                    }
                }
            };
            this.f198998c = executor2;
            this.f198999d = httpURLConnection;
            this.f199003h = eVar;
        }
    }

    static {
        Covode.recordClassIndex(103579);
    }

    /* renamed from: l */
    private void m152312l() {
        this.f198931c.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876095 */

            static {
                Covode.recordClassIndex(103591);
            }

            public final void run() {
                if (C87597h.this.f198942n != null) {
                    try {
                        C87597h.this.f198942n.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    C87597h.this.f198942n = null;
                }
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141686a() {
        this.f198940l = 10;
        mo141959a(0, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876106 */

            static {
                Covode.recordClassIndex(103592);
            }

            public final void run() {
                C87597h.this.f198934f.add(C87597h.this.f198941m);
                C87597h.this.mo141965i();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: b */
    public final void mo141691b() {
        mo141959a(3, 1, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876117 */

            static {
                Covode.recordClassIndex(103593);
            }

            public final void run() {
                C87597h hVar = C87597h.this;
                hVar.f198941m = hVar.f198944p;
                C87597h.this.f198944p = null;
                C87597h.this.mo141965i();
            }
        });
    }

    /* renamed from: i */
    public final void mo141965i() {
        this.f198931c.execute(mo141958a(new AbstractC87621b() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.C8760211 */

            static {
                Covode.recordClassIndex(103584);
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x008c A[LOOP:0: B:18:0x0086->B:20:0x008c, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x00df  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x00f6  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0128  */
            @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo141971a() {
                /*
                // Method dump skipped, instructions count: 318
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.C87597h.C8760211.mo141971a():void");
            }
        }));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo141966j() {
        this.f198931c.execute(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876084 */

            static {
                Covode.recordClassIndex(103590);
            }

            public final void run() {
                if (C87597h.this.f198946r != null) {
                    try {
                        C87597h.this.f198946r.mo141989c();
                    } catch (IOException unused) {
                    }
                }
                if (C87597h.this.f198945q != null) {
                    C87597h.this.f198945q.disconnect();
                    C87597h.this.f198945q = null;
                }
            }
        });
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.h$c */
    static final class ExecutorC87622c implements Executor {

        /* renamed from: a */
        private final Executor f198992a;

        static {
            Covode.recordClassIndex(103604);
        }

        /* renamed from: com.ttnet.org.chromium.net.impl.h$c$a */
        static final class RunnableC87623a implements Runnable {

            /* renamed from: a */
            public Thread f198993a;

            /* renamed from: b */
            public C87645j f198994b;

            /* renamed from: c */
            private final Runnable f198995c;

            static {
                Covode.recordClassIndex(103605);
            }

            public final void run() {
                if (Thread.currentThread() == this.f198993a) {
                    this.f198994b = new C87645j();
                } else {
                    this.f198995c.run();
                }
            }

            private RunnableC87623a(Runnable runnable, Thread thread) {
                this.f198995c = runnable;
                this.f198993a = thread;
            }

            /* synthetic */ RunnableC87623a(Runnable runnable, Thread thread, byte b) {
                this(runnable, thread);
            }
        }

        ExecutorC87622c(Executor executor) {
            this.f198992a = executor;
        }

        public final void execute(Runnable runnable) {
            RunnableC87623a aVar = new RunnableC87623a(runnable, Thread.currentThread(), (byte) 0);
            this.f198992a.execute(aVar);
            if (aVar.f198994b == null) {
                aVar.f198993a = null;
                return;
            }
            throw aVar.f198994b;
        }
    }

    /* renamed from: k */
    private void m152311k() {
        int intValue = this.f198935g.get().intValue();
        if (intValue != 0) {
            throw new IllegalStateException("Request is already started. State is: ".concat(String.valueOf(intValue)));
        }
    }

    /* renamed from: g */
    public final void mo141963g() {
        this.f198940l = 13;
        this.f198931c.execute(mo141958a(new AbstractC87621b() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.C876128 */

            static {
                Covode.recordClassIndex(103594);
            }

            @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
            /* renamed from: a */
            public final void mo141971a() {
                ReadableByteChannel a;
                if (C87597h.this.f198945q != null) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    String str = "http/1.1";
                    while (true) {
                        String headerFieldKey = C87597h.this.f198945q.getHeaderFieldKey(i);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str = C87597h.this.f198945q.getHeaderField(i);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, C87597h.this.f198945q.getHeaderField(i)));
                        }
                        i++;
                    }
                    int responseCode = C87597h.this.f198945q.getResponseCode();
                    C87597h.this.f198943o = new C87642r(new ArrayList(C87597h.this.f198934f), responseCode, C87597h.this.f198945q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0);
                    if (responseCode < 300 || responseCode >= 400) {
                        C87597h.this.mo141964h();
                        if (responseCode >= 400) {
                            InputStream errorStream = C87597h.this.f198945q.getErrorStream();
                            C87597h hVar = C87597h.this;
                            if (errorStream == null) {
                                a = null;
                            } else {
                                a = C87596g.m152310a(errorStream);
                            }
                            hVar.f198942n = a;
                            C87597h.this.f198930b.mo141980a();
                            return;
                        }
                        C87597h hVar2 = C87597h.this;
                        hVar2.f198942n = C87596g.m152310a(hVar2.f198945q.getInputStream());
                        C87597h.this.f198930b.mo141980a();
                        return;
                    }
                    C87597h hVar3 = C87597h.this;
                    hVar3.mo141959a(1, 2, new Runnable(hVar3.f198943o.f199081a.mo142021a()) {
                        /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC8760010 */

                        /* renamed from: a */
                        final /* synthetic */ Map f198955a;

                        static {
                            Covode.recordClassIndex(103582);
                        }

                        public final void run() {
                            C87597h hVar = C87597h.this;
                            hVar.f198944p = URI.create(hVar.f198941m).resolve((String) ((List) this.f198955a.get("location")).get(0)).toString();
                            C87597h.this.f198934f.add(C87597h.this.f198944p);
                            C87597h.this.mo141959a(2, 3, new Runnable() {
                                /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC8760010.RunnableC876011 */

                                static {
                                    Covode.recordClassIndex(103583);
                                }

                                public final void run() {
                                    C87614a aVar = C87597h.this.f198930b;
                                    aVar.mo141981a(new AbstractC87621b(C87597h.this.f198943o, C87597h.this.f198944p) {
                                        /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.C876151 */

                                        /* renamed from: a */
                                        final /* synthetic */ AbstractC87533ac f198978a;

                                        /* renamed from: b */
                                        final /* synthetic */ String f198979b;

                                        static {
                                            Covode.recordClassIndex(103597);
                                        }

                                        @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                                        /* renamed from: a */
                                        public final void mo141971a() {
                                            C87614a.this.f198974a.mo141702a(C87597h.this, this.f198978a, this.f198979b);
                                        }

                                        {
                                            this.f198978a = r2;
                                            this.f198979b = r3;
                                        }
                                    });
                                }
                            });
                        }

                        {
                            this.f198955a = r2;
                        }
                    });
                }
            }
        }));
    }

    /* renamed from: h */
    public final void mo141964h() {
        if (this.f198938j != null && this.f198947t.compareAndSet(false, true)) {
            try {
                this.f198939k.execute(mo141962b(new AbstractC87621b() {
                    /* class com.ttnet.org.chromium.net.impl.C87597h.C876139 */

                    static {
                        Covode.recordClassIndex(103595);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                    /* renamed from: a */
                    public final void mo141971a() {
                        C87597h.this.f198938j.close();
                    }
                }));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: c */
    public final void mo141692c() {
        int intValue = this.f198935g.getAndSet(8).intValue();
        if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4 || intValue == 5) {
            mo141966j();
            mo141964h();
            C87614a aVar = this.f198930b;
            C87642r rVar = this.f198943o;
            C87597h.this.m152312l();
            aVar.f198975b.execute(new Runnable(rVar) {
                /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.RunnableC876184 */

                /* renamed from: a */
                final /* synthetic */ AbstractC87533ac f198985a;

                static {
                    Covode.recordClassIndex(103600);
                }

                public final void run() {
                    try {
                        C87614a.this.f198974a.mo141706b(C87597h.this, this.f198985a);
                    } catch (Exception unused) {
                    }
                }

                {
                    this.f198985a = r2;
                }
            });
        }
    }

    /* renamed from: a */
    public final Runnable mo141958a(final AbstractC87621b bVar) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC8760312 */

            static {
                Covode.recordClassIndex(103585);
            }

            public final void run() {
                try {
                    bVar.mo141971a();
                } catch (Throwable th) {
                    C87597h.this.mo141960a((AbstractC87540d) new C87593d("System error", th));
                }
            }
        };
    }

    /* renamed from: b */
    public final Runnable mo141962b(final AbstractC87621b bVar) {
        return new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876052 */

            static {
                Covode.recordClassIndex(103587);
            }

            public final void run() {
                try {
                    bVar.mo141971a();
                } catch (Throwable th) {
                    C87597h.this.mo141961a(th);
                }
            }
        };
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.h$e */
    static final class ExecutorC87631e implements Executor {

        /* renamed from: a */
        public final Executor f199018a;

        /* renamed from: b */
        public final Runnable f199019b = new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.ExecutorC87631e.RunnableC876321 */

            static {
                Covode.recordClassIndex(103614);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
                if (r3 == null) goto L_0x0070;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
                r3.run();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
                r2 = r6.f199022a.f199020c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
                monitor-enter(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                r3 = r6.f199022a.f199020c.pollFirst();
                r1 = r6.f199022a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
                if (r3 == null) goto L_0x0045;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
                r0 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
                r0 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
                r1.f199021d = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
                monitor-exit(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6467);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x004f, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
                r3 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
                monitor-enter(r6.f199022a.f199020c);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
                r6.f199022a.f199021d = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                r6.f199022a.f199018a.execute(r6.f199022a.f199019b);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6467);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0069, code lost:
                throw r3;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x006c, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6467);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
                throw r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x0070, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6467);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x0073, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 122
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.C87597h.ExecutorC87631e.RunnableC876321.run():void");
            }
        };

        /* renamed from: c */
        public final ArrayDeque<Runnable> f199020c = new ArrayDeque<>();

        /* renamed from: d */
        public boolean f199021d;

        static {
            Covode.recordClassIndex(103613);
        }

        ExecutorC87631e(Executor executor) {
            this.f199018a = executor;
        }

        public final void execute(Runnable runnable) {
            MethodCollector.m26663i(3647);
            synchronized (this.f199020c) {
                try {
                    this.f199020c.addLast(runnable);
                    try {
                        this.f199018a.execute(this.f199019b);
                    } catch (RejectedExecutionException unused) {
                        this.f199020c.removeLast();
                    }
                } finally {
                    MethodCollector.m26664o(3647);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo141960a(AbstractC87540d dVar) {
        int intValue;
        do {
            intValue = this.f198935g.get().intValue();
            if (intValue == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            } else if (intValue == 6 || intValue == 7 || intValue == 8) {
                return;
            }
        } while (!this.f198935g.compareAndSet(Integer.valueOf(intValue), 6));
        mo141966j();
        mo141964h();
        C87614a aVar = this.f198930b;
        C87642r rVar = this.f198943o;
        C87597h.this.m152312l();
        C87614a.RunnableC876206 r1 = new Runnable(rVar, dVar) {
            /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.RunnableC876206 */

            /* renamed from: a */
            final /* synthetic */ AbstractC87533ac f198989a;

            /* renamed from: b */
            final /* synthetic */ AbstractC87540d f198990b;

            static {
                Covode.recordClassIndex(103602);
            }

            public final void run() {
                try {
                    C87614a.this.f198974a.mo141701a(C87597h.this, this.f198989a, this.f198990b);
                } catch (Exception unused) {
                }
            }

            {
                this.f198989a = r2;
                this.f198990b = r3;
            }
        };
        try {
            aVar.f198975b.execute(r1);
        } catch (C87645j unused) {
            if (aVar.f198976c != null) {
                aVar.f198976c.execute(r1);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: a */
    public final void mo141856a(String str) {
        m152311k();
        Objects.requireNonNull(str, "Method is required.");
        if (C14420a.f34885e.equalsIgnoreCase(str) || "GET".equalsIgnoreCase(str) || "HEAD".equalsIgnoreCase(str) || "POST".equalsIgnoreCase(str) || C14420a.f34883c.equalsIgnoreCase(str) || C14420a.f34884d.equalsIgnoreCase(str) || "TRACE".equalsIgnoreCase(str) || "PATCH".equalsIgnoreCase(str)) {
            this.f198937i = str;
            return;
        }
        throw new IllegalArgumentException("Invalid http method ".concat(String.valueOf(str)));
    }

    /* renamed from: a */
    public final void mo141961a(Throwable th) {
        mo141960a((AbstractC87540d) new C87591b("Exception received from UploadDataProvider", th));
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141690a(final ByteBuffer byteBuffer) {
        C87635k.m152363a(byteBuffer);
        C87635k.m152364b(byteBuffer);
        mo141959a(4, 5, new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876063 */

            static {
                Covode.recordClassIndex(103588);
            }

            public final void run() {
                C87597h.this.f198931c.execute(C87597h.this.mo141958a(new AbstractC87621b() {
                    /* class com.ttnet.org.chromium.net.impl.C87597h.RunnableC876063.C876071 */

                    static {
                        Covode.recordClassIndex(103589);
                    }

                    @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                    /* renamed from: a */
                    public final void mo141971a() {
                        int read;
                        if (C87597h.this.f198942n == null) {
                            read = -1;
                        } else {
                            read = C87597h.this.f198942n.read(byteBuffer);
                        }
                        C87597h hVar = C87597h.this;
                        ByteBuffer byteBuffer = byteBuffer;
                        if (read != -1) {
                            C87614a aVar = hVar.f198930b;
                            aVar.mo141981a(new AbstractC87621b(hVar.f198943o, byteBuffer) {
                                /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.C876173 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC87533ac f198982a;

                                /* renamed from: b */
                                final /* synthetic */ ByteBuffer f198983b;

                                static {
                                    Covode.recordClassIndex(103599);
                                }

                                @Override // com.ttnet.org.chromium.net.impl.C87597h.AbstractC87621b
                                /* renamed from: a */
                                public final void mo141971a() {
                                    if (C87597h.this.f198935g.compareAndSet(5, 4)) {
                                        C87614a.this.f198974a.mo141703a(C87597h.this, this.f198982a, this.f198983b);
                                    }
                                }

                                {
                                    this.f198982a = r2;
                                    this.f198983b = r3;
                                }
                            });
                            return;
                        }
                        if (hVar.f198942n != null) {
                            hVar.f198942n.close();
                        }
                        if (hVar.f198935g.compareAndSet(5, 7)) {
                            hVar.mo141966j();
                            C87614a aVar2 = hVar.f198930b;
                            aVar2.f198975b.execute(new Runnable(hVar.f198943o) {
                                /* class com.ttnet.org.chromium.net.impl.C87597h.C87614a.RunnableC876195 */

                                /* renamed from: a */
                                final /* synthetic */ AbstractC87533ac f198987a;

                                static {
                                    Covode.recordClassIndex(103601);
                                }

                                public final void run() {
                                    try {
                                        C87614a.this.f198974a.mo141700a(C87597h.this, this.f198987a);
                                    } catch (Exception unused) {
                                    }
                                }

                                {
                                    this.f198987a = r2;
                                }
                            });
                        }
                    }
                }));
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: a */
    public final void mo141854a(AbstractC87678z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        if (this.f198933e.containsKey("Content-Type")) {
            m152311k();
            if (this.f198937i == null) {
                this.f198937i = "POST";
            }
            this.f198938j = new VersionSafeCallbacks.C87588e(zVar);
            if (this.f198936h) {
                this.f198939k = executor;
            } else {
                this.f198939k = new ExecutorC87622c(executor);
            }
        } else {
            throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: b */
    public final void mo141859b(String str, String str2) {
        m152311k();
        int i = 0;
        while (true) {
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (!(charAt == ',' || charAt == '/' || charAt == '{' || charAt == '}')) {
                    switch (charAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (charAt) {
                                case ':':
                                case ';':
                                case AudiencePingIntervalSetting.DEFAULT:
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (charAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                                                i++;
                                            }
                                    }
                            }
                    }
                }
            } else if (!str2.contains("\r\n")) {
                if (this.f198933e.containsKey(str)) {
                    this.f198933e.remove(str);
                }
                this.f198933e.put(str, str2);
                return;
            }
        }
        throw new IllegalArgumentException("Invalid header " + str + "=" + str2);
    }

    /* renamed from: a */
    public final void mo141959a(int i, int i2, Runnable runnable) {
        if (!this.f198935g.compareAndSet(Integer.valueOf(i), Integer.valueOf(i2))) {
            int intValue = this.f198935g.get().intValue();
            if (intValue != 8 && intValue != 6) {
                throw new IllegalStateException("Invalid state transition - expected " + i + " but was " + intValue);
            }
            return;
        }
        runnable.run();
    }

    C87597h(AbstractC87529ab.AbstractC87531b bVar, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2) {
        final int i3 = i;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(executor2, "userExecutor is required");
        this.f198936h = z;
        this.f198930b = new C87614a(bVar, executor2);
        i3 = !z2 ? TrafficStats.getThreadStatsTag() : i3;
        this.f198931c = new ExecutorC87631e(new Executor() {
            /* class com.ttnet.org.chromium.net.impl.C87597h.ExecutorC875981 */

            static {
                Covode.recordClassIndex(103580);
            }

            public final void execute(final Runnable runnable) {
                executor.execute(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.C87597h.ExecutorC875981.RunnableC875991 */

                    static {
                        Covode.recordClassIndex(103581);
                    }

                    public final void run() {
                        int threadStatsTag = TrafficStats.getThreadStatsTag();
                        TrafficStats.setThreadStatsTag(i3);
                        if (z3) {
                            C87677y.m152574a(i2);
                        }
                        try {
                            runnable.run();
                        } finally {
                            if (z3) {
                                C87677y.m152573a();
                            }
                            TrafficStats.setThreadStatsTag(threadStatsTag);
                        }
                    }
                });
            }
        });
        this.f198941m = str;
        this.f198932d = str2;
    }
}
