package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public final class CronetWebsocketConnection extends AbstractC87674x {

    /* renamed from: b */
    public static final String f198830b = CronetWebsocketConnection.class.getSimpleName();

    /* renamed from: a */
    public final AbstractC87674x.AbstractC87676b f198831a;

    /* renamed from: c */
    private long f198832c;

    /* renamed from: d */
    private final Executor f198833d;

    /* renamed from: e */
    private List<String> f198834e;

    /* renamed from: f */
    private int f198835f;

    /* renamed from: g */
    private String f198836g;

    /* renamed from: h */
    private long f198837h;

    /* renamed from: i */
    private int f198838i;

    /* renamed from: j */
    private long f198839j;

    /* renamed from: k */
    private String f198840k;

    /* renamed from: l */
    private int f198841l;

    /* renamed from: m */
    private String f198842m;

    /* renamed from: n */
    private Map<String, String> f198843n;

    /* renamed from: o */
    private Map<String, String> f198844o;

    /* renamed from: p */
    private boolean f198845p;

    /* renamed from: q */
    private boolean f198846q = true;

    /* renamed from: r */
    private final CronetUrlRequestContext f198847r;

    /* renamed from: s */
    private final Object f198848s = new Object();

    /* renamed from: t */
    private AtomicInteger f198849t = new AtomicInteger(-1);

    private native void nativeAddGetParam(long j, String str, String str2);

    private native void nativeAddHeader(long j, String str, String str2);

    private native void nativeAddUrl(long j, String str);

    private native long nativeCreateWebsocketConnectionAdapter(long j);

    private native void nativeDestroy(long j);

    private native void nativeSendBinary(long j, ByteBuffer byteBuffer);

    private native void nativeSendText(long j, String str);

    private native void nativeStartWithFrontier(long j, int i, String str, long j2, int i2, long j3, String str2, int i3, String str3, boolean z);

    private native void nativeStartWithWSChannel(long j, boolean z);

    private native void nativeStop(long j);

    static {
        Covode.recordClassIndex(103550);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: c */
    public final boolean mo141900c() {
        if (this.f198849t.get() == 4) {
            return true;
        }
        return false;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: b */
    public final void mo141899b() {
        MethodCollector.m26663i(8634);
        synchronized (this.f198848s) {
            try {
                long j = this.f198832c;
                if (j != 0) {
                    nativeStop(j);
                    MethodCollector.m26664o(8634);
                }
            } finally {
                MethodCollector.m26664o(8634);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: d */
    public final void mo141901d() {
        MethodCollector.m26663i(9099);
        synchronized (this.f198848s) {
            try {
                long j = this.f198832c;
                if (j != 0) {
                    nativeDestroy(j);
                    this.f198832c = 0;
                    MethodCollector.m26664o(9099);
                }
            } finally {
                MethodCollector.m26664o(9099);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: a */
    public final void mo141896a() {
        Throwable th;
        MethodCollector.m26663i(8484);
        synchronized (this.f198848s) {
            try {
                if (this.f198832c == 0) {
                    this.f198832c = nativeCreateWebsocketConnectionAdapter(this.f198847r.mo141887j());
                }
                for (String str : this.f198834e) {
                    nativeAddUrl(this.f198832c, str);
                }
                Map<String, String> map = this.f198843n;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        nativeAddGetParam(this.f198832c, entry.getKey(), entry.getValue());
                    }
                }
                Map<String, String> map2 = this.f198844o;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        nativeAddHeader(this.f198832c, entry2.getKey(), entry2.getValue());
                    }
                }
                if (this.f198846q) {
                    try {
                        nativeStartWithFrontier(this.f198832c, this.f198835f, this.f198836g, this.f198837h, this.f198838i, this.f198839j, this.f198840k, this.f198841l, this.f198842m, this.f198845p);
                    } catch (Throwable th2) {
                        th = th2;
                        MethodCollector.m26664o(8484);
                        throw th;
                    }
                } else {
                    nativeStartWithWSChannel(this.f198832c, this.f198845p);
                }
                MethodCollector.m26664o(8484);
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.m26664o(8484);
                throw th;
            }
        }
    }

    private void onFeedbackLog(final String str) {
        m152236a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC875814 */

            static {
                Covode.recordClassIndex(103554);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f198831a.mo142098a(str);
                } catch (Exception e) {
                    C87457f.m151789c(CronetWebsocketConnection.f198830b, "Exception in callback: ", e);
                }
            }
        });
    }

    /* renamed from: a */
    private void m152236a(Runnable runnable) {
        try {
            this.f198833d.execute(runnable);
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(f198830b, "Exception posting task to executor", e);
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: a */
    public final void mo141897a(String str) {
        MethodCollector.m26663i(8790);
        synchronized (this.f198848s) {
            try {
                long j = this.f198832c;
                if (j != 0) {
                    nativeSendText(j, str);
                    MethodCollector.m26664o(8790);
                }
            } finally {
                MethodCollector.m26664o(8790);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x
    /* renamed from: a */
    public final void mo141898a(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(8933);
        synchronized (this.f198848s) {
            try {
                long j = this.f198832c;
                if (j != 0) {
                    nativeSendBinary(j, byteBuffer);
                    MethodCollector.m26664o(8933);
                }
            } finally {
                MethodCollector.m26664o(8933);
            }
        }
    }

    private void onConnectionStateChanged(final int i, final String str) {
        this.f198849t.set(i);
        m152236a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC875781 */

            static {
                Covode.recordClassIndex(103551);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f198831a.mo142096a(i, str);
                } catch (Exception e) {
                    C87457f.m151789c(CronetWebsocketConnection.f198830b, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onMessageReceived(ByteBuffer byteBuffer, final int i) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        m152236a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC875803 */

            static {
                Covode.recordClassIndex(103553);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f198831a.mo142100a(allocate, i);
                } catch (Exception e) {
                    C87457f.m151789c(CronetWebsocketConnection.f198830b, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onConnectionError(final int i, final String str, final String str2) {
        C87457f.m151789c(f198830b, "onConnectionError: ".concat(String.valueOf(str2)), new Object[0]);
        this.f198849t.set(i);
        m152236a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC875792 */

            static {
                Covode.recordClassIndex(103552);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f198831a.mo142097a(i, str, str2);
                } catch (Exception e) {
                    C87457f.m151789c(CronetWebsocketConnection.f198830b, "Exception in callback: ", e);
                }
            }
        });
    }

    private void onTrafficChanged(final String str, final long j, final long j2, final boolean z) {
        m152236a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetWebsocketConnection.RunnableC875825 */

            static {
                Covode.recordClassIndex(103555);
            }

            public final void run() {
                try {
                    CronetWebsocketConnection.this.f198831a.mo142099a(str, j, j2, z);
                } catch (Exception e) {
                    C87457f.m151789c(CronetWebsocketConnection.f198830b, "Exception in callback: ", e);
                }
            }
        });
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.f198847r = cronetUrlRequestContext;
        this.f198831a = bVar;
        this.f198833d = executor;
        this.f198834e = list;
        this.f198843n = map;
        this.f198844o = map2;
        this.f198845p = z;
        this.f198846q = false;
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.f198847r = cronetUrlRequestContext;
        this.f198831a = bVar;
        this.f198833d = executor;
        this.f198834e = list;
        this.f198835f = i;
        this.f198836g = str;
        this.f198837h = j;
        this.f198838i = i2;
        this.f198839j = j2;
        this.f198840k = str2;
        this.f198841l = i3;
        this.f198842m = str3;
        this.f198843n = map;
        this.f198844o = map2;
        this.f198845p = z;
    }
}
