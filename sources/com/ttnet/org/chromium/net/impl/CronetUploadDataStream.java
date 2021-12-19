package com.ttnet.org.chromium.net.impl;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.net.AbstractC87528aa;
import com.ttnet.org.chromium.net.AbstractC87678z;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

public final class CronetUploadDataStream extends AbstractC87528aa {

    /* renamed from: a */
    public static final String f198704a = CronetUploadDataStream.class.getSimpleName();

    /* renamed from: b */
    public final VersionSafeCallbacks.C87588e f198705b;

    /* renamed from: c */
    final CronetUrlRequest f198706c;

    /* renamed from: d */
    long f198707d;

    /* renamed from: e */
    long f198708e;

    /* renamed from: f */
    public volatile boolean f198709f;

    /* renamed from: g */
    public ByteBuffer f198710g;

    /* renamed from: h */
    public final Object f198711h = new Object();

    /* renamed from: i */
    public long f198712i;

    /* renamed from: j */
    public int f198713j = 3;

    /* renamed from: k */
    public Runnable f198714k;

    /* renamed from: l */
    private final Executor f198715l;

    /* renamed from: m */
    private long f198716m;

    /* renamed from: n */
    private final Runnable f198717n = new Runnable() {
        /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC875581 */

        /* renamed from: a */
        static final /* synthetic */ boolean f198719a = true;

        static {
            Covode.recordClassIndex(103527);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r7.f198720b.f198706c.mo141866i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            if (com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC875581.f198719a != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            if (r7.f198720b.f198710g.position() != 0) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            r2 = r7.f198720b.f198705b;
            r1 = r7.f198720b;
            r2.mo141929a(r1, r1.f198710g);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5832);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
            r0 = new java.lang.AssertionError();
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5832);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            r7.f198720b.mo141845a((java.lang.Throwable) r1);
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5832);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC875581.run():void");
        }
    };

    /* renamed from: o */
    private boolean f198718o;

    private native long nativeCreateAdapterForTesting();

    private native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private native void nativeOnReadSucceeded(long j, int i, boolean z);

    private native void nativeOnRewindSucceeded(long j);

    /* access modifiers changed from: package-private */
    public final native long nativeAttachUploadDataToRequest(long j, long j2);

    /* access modifiers changed from: package-private */
    public final void onUploadDataStreamDestroyed() {
        m152154b();
    }

    static {
        Covode.recordClassIndex(103526);
    }

    /* access modifiers changed from: package-private */
    public final void rewind() {
        mo141844a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC875592 */

            static {
                Covode.recordClassIndex(103528);
            }

            public final void run() {
                MethodCollector.m26663i(7537);
                synchronized (CronetUploadDataStream.this.f198711h) {
                    try {
                        if (CronetUploadDataStream.this.f198712i != 0) {
                            CronetUploadDataStream.this.mo141843a(3);
                            CronetUploadDataStream.this.f198713j = 1;
                            try {
                                CronetUploadDataStream.this.f198706c.mo141866i();
                                CronetUploadDataStream.this.f198705b.mo141928a(CronetUploadDataStream.this);
                                MethodCollector.m26664o(7537);
                            } catch (Exception e) {
                                CronetUploadDataStream.this.mo141845a((Throwable) e);
                                MethodCollector.m26664o(7537);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(7537);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m152154b() {
        MethodCollector.m26663i(6448);
        synchronized (this.f198711h) {
            try {
                if (this.f198713j == 0) {
                    this.f198718o = true;
                    return;
                }
                long j = this.f198712i;
                if (j == 0) {
                    MethodCollector.m26664o(6448);
                    return;
                }
                nativeDestroy(j);
                this.f198712i = 0;
                Runnable runnable = this.f198714k;
                if (runnable != null) {
                    runnable.run();
                }
                mo141844a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUploadDataStream.RunnableC875603 */

                    static {
                        Covode.recordClassIndex(103529);
                    }

                    public final void run() {
                        try {
                            CronetUploadDataStream.this.f198706c.mo141866i();
                            if (!CronetUploadDataStream.this.f198709f) {
                                CronetUploadDataStream.this.f198705b.close();
                            }
                        } catch (Exception e) {
                            C87457f.m151789c(CronetUploadDataStream.f198704a, "Exception thrown when closing", e);
                        }
                    }
                });
                MethodCollector.m26664o(6448);
            } finally {
                MethodCollector.m26664o(6448);
            }
        }
    }

    /* renamed from: c */
    private void m152155c() {
        MethodCollector.m26663i(6449);
        synchronized (this.f198711h) {
            try {
                if (this.f198713j == 0) {
                    IllegalStateException illegalStateException = new IllegalStateException("Method should not be called when read has not completed.");
                    MethodCollector.m26664o(6449);
                    throw illegalStateException;
                } else if (this.f198718o) {
                    m152154b();
                }
            } finally {
                MethodCollector.m26664o(6449);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87528aa
    /* renamed from: a */
    public final void mo141683a() {
        MethodCollector.m26663i(6284);
        synchronized (this.f198711h) {
            try {
                mo141843a(1);
                this.f198713j = 3;
                this.f198708e = this.f198707d;
                long j = this.f198712i;
                if (j != 0) {
                    nativeOnRewindSucceeded(j);
                    MethodCollector.m26664o(6284);
                }
            } finally {
                MethodCollector.m26664o(6284);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void readData(ByteBuffer byteBuffer) {
        this.f198710g = byteBuffer;
        this.f198716m = (long) byteBuffer.limit();
        mo141844a(this.f198717n);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87528aa
    /* renamed from: a */
    public final void mo141684a(Exception exc) {
        MethodCollector.m26663i(6285);
        synchronized (this.f198711h) {
            try {
                mo141843a(1);
                mo141845a((Throwable) exc);
            } finally {
                MethodCollector.m26664o(6285);
            }
        }
    }

    /* renamed from: a */
    public final void mo141843a(int i) {
        if (this.f198713j != i) {
            throw new IllegalStateException("Expected " + i + ", but was " + this.f198713j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141844a(Runnable runnable) {
        try {
            this.f198715l.execute(runnable);
        } catch (Throwable th) {
            CronetUrlRequest cronetUrlRequest = this.f198706c;
            if (cronetUrlRequest != null) {
                cronetUrlRequest.mo141857a(th);
                return;
            }
            throw new IllegalStateException("Unexpected request usage, caught in CronetUploadDataStream, caused by ".concat(String.valueOf(th)));
        }
    }

    /* renamed from: a */
    public final void mo141845a(Throwable th) {
        boolean z;
        MethodCollector.m26663i(5988);
        synchronized (this.f198711h) {
            try {
                int i = this.f198713j;
                if (i != 3) {
                    if (i == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f198713j = 3;
                    this.f198710g = null;
                    m152155c();
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("There is no read or rewind or length check in progress.");
                    MethodCollector.m26664o(5988);
                    throw illegalStateException;
                }
            } catch (Throwable th2) {
                MethodCollector.m26664o(5988);
                throw th2;
            }
        }
        if (z) {
            try {
                this.f198705b.close();
                this.f198709f = true;
            } catch (Exception e) {
                C87457f.m151789c(f198704a, "Failure closing data provider", e);
            }
        }
        this.f198706c.mo141857a(th);
        MethodCollector.m26664o(5988);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87528aa
    /* renamed from: a */
    public final void mo141685a(boolean z) {
        MethodCollector.m26663i(6140);
        synchronized (this.f198711h) {
            try {
                mo141843a(0);
                if (this.f198716m != ((long) this.f198710g.limit())) {
                    IllegalStateException illegalStateException = new IllegalStateException("ByteBuffer limit changed");
                    MethodCollector.m26664o(6140);
                    throw illegalStateException;
                } else if (!z || this.f198707d < 0) {
                    int position = this.f198710g.position();
                    long j = this.f198708e - ((long) position);
                    this.f198708e = j;
                    if (j >= 0 || this.f198707d < 0) {
                        this.f198710g.position(0);
                        this.f198710g = null;
                        this.f198713j = 3;
                        m152155c();
                        long j2 = this.f198712i;
                        if (j2 != 0) {
                            nativeOnReadSucceeded(j2, position, z);
                            MethodCollector.m26664o(6140);
                            return;
                        }
                        return;
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C1764a.m5928a("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f198707d - this.f198708e), Long.valueOf(this.f198707d)}));
                    MethodCollector.m26664o(6140);
                    throw illegalArgumentException;
                } else {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Non-chunked upload can't have last chunk");
                    MethodCollector.m26664o(6140);
                    throw illegalArgumentException2;
                }
            } finally {
                MethodCollector.m26664o(6140);
            }
        }
    }

    public CronetUploadDataStream(AbstractC87678z zVar, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.f198715l = executor;
        this.f198705b = new VersionSafeCallbacks.C87588e(zVar);
        this.f198706c = cronetUrlRequest;
        this.f198709f = false;
    }
}
