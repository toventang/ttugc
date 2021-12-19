package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.net.AbstractC87540d;
import com.ttnet.org.chromium.net.AbstractC87542f;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.impl.C87642r;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public class CronetBidirectionalStream extends AbstractC87542f {

    /* renamed from: h */
    static final /* synthetic */ boolean f198621h = true;

    /* renamed from: a */
    public final String f198622a;

    /* renamed from: b */
    public final Object f198623b;

    /* renamed from: c */
    public boolean f198624c;

    /* renamed from: d */
    public int f198625d;

    /* renamed from: e */
    public int f198626e;

    /* renamed from: f */
    public C87642r f198627f;

    /* renamed from: g */
    public Runnable f198628g;

    /* renamed from: i */
    private final CronetUrlRequestContext f198629i;

    /* renamed from: j */
    private final Executor f198630j;

    /* renamed from: k */
    private final String f198631k;

    /* renamed from: l */
    private final Collection<Object> f198632l;

    /* renamed from: m */
    private AbstractC87540d f198633m;

    /* renamed from: n */
    private LinkedList<ByteBuffer> f198634n;

    /* renamed from: o */
    private LinkedList<ByteBuffer> f198635o;

    /* renamed from: p */
    private boolean f198636p;

    /* renamed from: q */
    private AbstractC87655t.AbstractC87657b f198637q;

    /* renamed from: r */
    private long f198638r;

    /* renamed from: s */
    private RunnableC87553a f198639s;

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    private native void nativeDestroy(long j, boolean z);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeSendRequestHeaders(long j);

    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    static {
        Covode.recordClassIndex(103513);
    }

    private void onCanceled() {
        m152113a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC875514 */

            static {
                Covode.recordClassIndex(103517);
            }

            public final void run() {
            }
        });
    }

    /* renamed from: a */
    public final boolean mo141830a() {
        if (this.f198625d == 0 || this.f198638r != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo141831b() {
        MethodCollector.m26663i(3885);
        synchronized (this.f198623b) {
            try {
                if (!mo141830a()) {
                    if (this.f198626e == 10 && this.f198625d == 4) {
                        this.f198626e = 7;
                        this.f198625d = 7;
                        m152116d();
                        MethodCollector.m26664o(3885);
                        return;
                    }
                    MethodCollector.m26664o(3885);
                }
            } finally {
                MethodCollector.m26664o(3885);
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$a */
    final class RunnableC87553a implements Runnable {

        /* renamed from: a */
        ByteBuffer f198648a;

        /* renamed from: b */
        boolean f198649b;

        /* renamed from: c */
        final /* synthetic */ CronetBidirectionalStream f198650c;

        static {
            Covode.recordClassIndex(103519);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r2 == false) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            r5.f198650c.mo141831b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8306);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                r4 = 8306(0x2072, float:1.1639E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
                r0 = 0
                r5.f198648a = r0     // Catch:{ Exception -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f198650c     // Catch:{ Exception -> 0x0046 }
                java.lang.Object r3 = r0.f198623b     // Catch:{ Exception -> 0x0046 }
                monitor-enter(r3)     // Catch:{ Exception -> 0x0046 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f198650c     // Catch:{ all -> 0x0040 }
                boolean r0 = r0.mo141830a()     // Catch:{ all -> 0x0040 }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r3)     // Catch:{ all -> 0x0040 }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x001a:
                boolean r0 = r5.f198649b
                r2 = 0
                if (r0 == 0) goto L_0x002f
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = r5.f198650c
                r0 = 4
                r1.f198625d = r0
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f198650c
                int r1 = r0.f198626e
                r0 = 10
                if (r1 != r0) goto L_0x0034
                r0 = 1
                r2 = 1
                goto L_0x0034
            L_0x002f:
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = r5.f198650c
                r0 = 2
                r1.f198625d = r0
            L_0x0034:
                monitor-exit(r3)
                if (r2 == 0) goto L_0x003c
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f198650c
                r0.mo141831b()
            L_0x003c:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x0040:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                throw r0
            L_0x0046:
                r1 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = r5.f198650c
                r0.mo141829a(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC87553a.run():void");
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream$b */
    final class RunnableC87554b implements Runnable {

        /* renamed from: b */
        private ByteBuffer f198652b;

        /* renamed from: c */
        private final boolean f198653c;

        static {
            Covode.recordClassIndex(103520);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
            if (r2 == false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
            r5.f198651a.mo141831b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(8305);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                r4 = 8305(0x2071, float:1.1638E-41)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
                r0 = 0
                r5.f198652b = r0     // Catch:{ Exception -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ Exception -> 0x0040 }
                java.lang.Object r3 = r0.f198623b     // Catch:{ Exception -> 0x0040 }
                monitor-enter(r3)     // Catch:{ Exception -> 0x0040 }
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this     // Catch:{ all -> 0x003a }
                boolean r0 = r0.mo141830a()     // Catch:{ all -> 0x003a }
                if (r0 == 0) goto L_0x001a
                monitor-exit(r3)     // Catch:{ all -> 0x003a }
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x001a:
                boolean r0 = r5.f198653c
                r2 = 0
                if (r0 == 0) goto L_0x002e
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r1 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0 = 10
                r1.f198626e = r0
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                int r1 = r0.f198625d
                r0 = 4
                if (r1 != r0) goto L_0x002e
                r0 = 1
                r2 = 1
            L_0x002e:
                monitor-exit(r3)
                if (r2 == 0) goto L_0x0036
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.mo141831b()
            L_0x0036:
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            L_0x003a:
                r0 = move-exception
                monitor-exit(r3)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                throw r0
            L_0x0040:
                r1 = move-exception
                com.ttnet.org.chromium.net.impl.CronetBidirectionalStream r0 = com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.this
                r0.mo141829a(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC87554b.run():void");
        }

        RunnableC87554b(ByteBuffer byteBuffer, boolean z) {
            this.f198652b = byteBuffer;
            this.f198653c = z;
        }
    }

    /* renamed from: d */
    private void m152116d() {
        MethodCollector.m26663i(3978);
        C87457f.m151787a(CronetUrlRequestContext.f198783b, "destroyNativeStreamLocked " + toString(), new Object[0]);
        long j = this.f198638r;
        if (j == 0) {
            MethodCollector.m26664o(3978);
            return;
        }
        nativeDestroy(j, false);
        this.f198629i.mo141886i();
        this.f198638r = 0;
        Runnable runnable = this.f198628g;
        if (runnable != null) {
            runnable.run();
        }
        MethodCollector.m26664o(3978);
    }

    /* renamed from: c */
    private void m152115c() {
        boolean z;
        MethodCollector.m26663i(3882);
        if (f198621h || this.f198626e == 8) {
            int size = this.f198635o.size();
            ByteBuffer[] byteBufferArr = new ByteBuffer[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                ByteBuffer poll = this.f198635o.poll();
                byteBufferArr[i] = poll;
                iArr[i] = poll.position();
                iArr2[i] = poll.limit();
            }
            if (!f198621h) {
                if (!this.f198635o.isEmpty()) {
                    AssertionError assertionError = new AssertionError();
                    MethodCollector.m26664o(3882);
                    throw assertionError;
                } else if (size <= 0) {
                    AssertionError assertionError2 = new AssertionError();
                    MethodCollector.m26664o(3882);
                    throw assertionError2;
                }
            }
            this.f198626e = 9;
            this.f198624c = true;
            long j = this.f198638r;
            if (!this.f198636p || !this.f198634n.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (nativeWritevData(j, byteBufferArr, iArr, iArr2, z)) {
                MethodCollector.m26664o(3882);
                return;
            }
            this.f198626e = 8;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to call native writev.");
            MethodCollector.m26664o(3882);
            throw illegalArgumentException;
        }
        AssertionError assertionError3 = new AssertionError();
        MethodCollector.m26664o(3882);
        throw assertionError3;
    }

    /* renamed from: b */
    private void m152114b(final AbstractC87540d dVar) {
        m152113a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC875525 */

            static {
                Covode.recordClassIndex(103518);
            }

            public final void run() {
                CronetBidirectionalStream.this.mo141828a(dVar);
            }
        });
    }

    private void onStreamReady(final boolean z) {
        m152113a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC875481 */

            static {
                Covode.recordClassIndex(103514);
            }

            public final void run() {
                MethodCollector.m26663i(8461);
                synchronized (CronetBidirectionalStream.this.f198623b) {
                    try {
                        if (!CronetBidirectionalStream.this.mo141830a()) {
                            CronetBidirectionalStream.this.f198624c = z;
                            CronetBidirectionalStream.this.f198625d = 2;
                            String str = CronetBidirectionalStream.this.f198622a;
                            if ((str.equals("GET") || str.equals("HEAD")) && CronetBidirectionalStream.this.f198624c) {
                                CronetBidirectionalStream.this.f198626e = 10;
                            } else {
                                CronetBidirectionalStream.this.f198626e = 8;
                            }
                            MethodCollector.m26664o(8461);
                        }
                    } finally {
                        MethodCollector.m26664o(8461);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private static ArrayList<Map.Entry<String, String>> m152112a(String[] strArr) {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<>(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new AbstractMap.SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }

    private void onResponseTrailersReceived(String[] strArr) {
        final C87642r.C87643a aVar = new C87642r.C87643a(m152112a(strArr));
        m152113a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC875503 */

            static {
                Covode.recordClassIndex(103516);
            }

            public final void run() {
                MethodCollector.m26663i(5837);
                synchronized (CronetBidirectionalStream.this.f198623b) {
                    try {
                        if (!CronetBidirectionalStream.this.mo141830a()) {
                            MethodCollector.m26664o(5837);
                        }
                    } finally {
                        MethodCollector.m26664o(5837);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m152113a(Runnable runnable) {
        MethodCollector.m26663i(3967);
        try {
            this.f198630j.execute(runnable);
            MethodCollector.m26664o(3967);
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception posting task to executor", e);
            synchronized (this.f198623b) {
                this.f198626e = 6;
                this.f198625d = 6;
                m152116d();
                MethodCollector.m26664o(3967);
            }
        } catch (Throwable th) {
            MethodCollector.m26664o(3967);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo141828a(AbstractC87540d dVar) {
        MethodCollector.m26663i(3980);
        this.f198633m = dVar;
        synchronized (this.f198623b) {
            try {
                if (!mo141830a()) {
                    this.f198626e = 6;
                    this.f198625d = 6;
                    m152116d();
                    MethodCollector.m26664o(3980);
                }
            } finally {
                MethodCollector.m26664o(3980);
            }
        }
    }

    /* renamed from: a */
    public final void mo141829a(Exception exc) {
        C87591b bVar = new C87591b("CalledByNative method has thrown an exception", exc);
        C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in CalledByNative method", exc);
        mo141828a((AbstractC87540d) bVar);
    }

    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            this.f198627f = new C87642r(Arrays.asList(this.f198631k), i, "", m152112a(strArr), false, str, null, j);
            m152113a(new Runnable() {
                /* class com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC875492 */

                static {
                    Covode.recordClassIndex(103515);
                }

                public final void run() {
                    MethodCollector.m26663i(5839);
                    synchronized (CronetBidirectionalStream.this.f198623b) {
                        try {
                            if (!CronetBidirectionalStream.this.mo141830a()) {
                                CronetBidirectionalStream.this.f198625d = 2;
                                MethodCollector.m26664o(5839);
                            }
                        } finally {
                            MethodCollector.m26664o(5839);
                        }
                    }
                }
            });
        } catch (Exception unused) {
            m152114b(new C87593d("Cannot prepare ResponseInfo", null));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        if (r4 >= r7.length) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r3 = r7[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r3.position() != r8[r4]) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r3.limit() == r9[r4]) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        m152114b(new com.ttnet.org.chromium.net.impl.C87593d("ByteBuffer modified externally during write", null));
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3935);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r3.position(r3.limit());
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r10 == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r4 != (r7.length - 1)) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        m152113a(new com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.RunnableC87554b(r6, r3, r1));
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(3935);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onWritevCompleted(java.nio.ByteBuffer[] r7, int[] r8, int[] r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetBidirectionalStream.onWritevCompleted(java.nio.ByteBuffer[], int[], int[], boolean):void");
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C87642r rVar = this.f198627f;
        if (rVar != null) {
            rVar.mo142019a(j);
        }
        if (i == 10 || i == 3) {
            m152114b(new C87636l("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2, i3));
        } else {
            m152114b(new C87590a("Exception in BidirectionalStream: ".concat(String.valueOf(str)), i, i2));
        }
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        int i4;
        boolean z;
        this.f198627f.mo142019a(j);
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            m152114b(new C87593d("ByteBuffer modified externally during read", null));
        } else if (i < 0 || (i4 = i2 + i) > i3) {
            m152114b(new C87593d("Invalid number of bytes read", null));
        } else {
            byteBuffer.position(i4);
            if (f198621h || this.f198639s.f198648a == null) {
                this.f198639s.f198648a = byteBuffer;
                RunnableC87553a aVar = this.f198639s;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f198649b = z;
                m152113a(this.f198639s);
                return;
            }
            throw new AssertionError();
        }
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        int i;
        int i2;
        MethodCollector.m26663i(3959);
        synchronized (this.f198623b) {
            try {
                if (this.f198637q == null) {
                    this.f198637q = new C87594e(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, -1, str, j16, 0, "", "");
                    boolean z2 = f198621h;
                    if (!z2) {
                        if (this.f198625d != this.f198626e) {
                            AssertionError assertionError = new AssertionError();
                            MethodCollector.m26664o(3959);
                            throw assertionError;
                        }
                    }
                    if (!(z2 || (i2 = this.f198625d) == 7 || i2 == 6)) {
                        if (i2 != 5) {
                            AssertionError assertionError2 = new AssertionError();
                            MethodCollector.m26664o(3959);
                            throw assertionError2;
                        }
                    }
                    int i3 = this.f198625d;
                    if (i3 == 7) {
                        i = 0;
                    } else if (i3 == 5) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.f198629i.mo141883a(new C87637m(this.f198631k, this.f198632l, this.f198637q, i, this.f198627f, this.f198633m));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Metrics collection should only happen once.");
                    MethodCollector.m26664o(3959);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(3959);
            }
        }
    }
}
