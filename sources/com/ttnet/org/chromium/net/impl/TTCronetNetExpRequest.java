package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.net.AbstractC87671w;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class TTCronetNetExpRequest extends AbstractC87671w {

    /* renamed from: a */
    public static final String f198873a = TTCronetNetExpRequest.class.getSimpleName();

    /* renamed from: b */
    public final AbstractC87671w.AbstractC87673b f198874b;

    /* renamed from: c */
    public final Object f198875c = new Object();

    /* renamed from: d */
    private CronetUrlRequestContext f198876d;

    /* renamed from: e */
    private int f198877e;

    /* renamed from: f */
    private List<String> f198878f;

    /* renamed from: g */
    private int f198879g;

    /* renamed from: h */
    private int f198880h;

    /* renamed from: i */
    private Executor f198881i;

    /* renamed from: j */
    private long f198882j;

    /* renamed from: k */
    private boolean f198883k;

    private native long nativeCreateRequestAdapter(long j, int i, String[] strArr, int i2, int i3);

    private native void nativeDestroy(long j);

    private native void nativeDoExtraCommand(long j, String str, String str2);

    private native void nativeStart(long j);

    static {
        Covode.recordClassIndex(103561);
    }

    /* renamed from: d */
    public final boolean mo141917d() {
        if (!this.f198883k || this.f198882j != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo141916c() {
        MethodCollector.m26663i(6756);
        long j = this.f198882j;
        if (j == 0) {
            MethodCollector.m26664o(6756);
            return;
        }
        nativeDestroy(j);
        this.f198882j = 0;
        MethodCollector.m26664o(6756);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w
    /* renamed from: b */
    public final void mo141915b() {
        MethodCollector.m26663i(6614);
        synchronized (this.f198875c) {
            try {
                if (!mo141917d() && this.f198883k) {
                    mo141916c();
                    MethodCollector.m26664o(6614);
                }
            } finally {
                MethodCollector.m26664o(6614);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w
    /* renamed from: a */
    public final void mo141913a() {
        MethodCollector.m26663i(6469);
        synchronized (this.f198875c) {
            try {
                if (!this.f198883k) {
                    long j = this.f198876d.mo141887j();
                    int i = this.f198877e;
                    List<String> list = this.f198878f;
                    long nativeCreateRequestAdapter = nativeCreateRequestAdapter(j, i, (String[]) list.toArray(new String[list.size()]), this.f198879g, this.f198880h);
                    this.f198882j = nativeCreateRequestAdapter;
                    if (nativeCreateRequestAdapter != 0) {
                        this.f198883k = true;
                        nativeStart(nativeCreateRequestAdapter);
                        MethodCollector.m26664o(6469);
                        return;
                    }
                    NullPointerException nullPointerException = new NullPointerException("Create native net exp request adapter failed.");
                    MethodCollector.m26664o(6469);
                    throw nullPointerException;
                }
            } finally {
                MethodCollector.m26664o(6469);
            }
        }
    }

    private void onNetExpRequestComplete(final String str, final boolean z) {
        RunnableC875831 r2 = new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.TTCronetNetExpRequest.RunnableC875831 */

            static {
                Covode.recordClassIndex(103562);
            }

            public final void run() {
                MethodCollector.m26663i(3586);
                if (!z) {
                    synchronized (TTCronetNetExpRequest.this.f198875c) {
                        try {
                            if (!TTCronetNetExpRequest.this.mo141917d()) {
                                TTCronetNetExpRequest.this.mo141916c();
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(3586);
                            throw th;
                        }
                    }
                }
                try {
                    TTCronetNetExpRequest.this.f198874b.mo142095a(str);
                    MethodCollector.m26664o(3586);
                } catch (Exception e) {
                    C87457f.m151789c(TTCronetNetExpRequest.f198873a, "Exception in callback: ", e);
                    MethodCollector.m26664o(3586);
                }
            }
        };
        try {
            Executor executor = this.f198881i;
            if (executor != null) {
                executor.execute(r2);
            } else {
                new Thread(r2, "NetExpCallback").start();
            }
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(f198873a, "Exception posting task to executor", e);
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w
    /* renamed from: a */
    public final void mo141914a(String str, String str2) {
        MethodCollector.m26663i(6616);
        synchronized (this.f198875c) {
            try {
                if (!mo141917d() && this.f198883k) {
                    nativeDoExtraCommand(this.f198882j, str, str2);
                    MethodCollector.m26664o(6616);
                }
            } finally {
                MethodCollector.m26664o(6616);
            }
        }
    }

    public TTCronetNetExpRequest(CronetUrlRequestContext cronetUrlRequestContext, AbstractC87671w.AbstractC87673b bVar, Executor executor, int i, List<String> list, int i2, int i3) {
        this.f198876d = cronetUrlRequestContext;
        this.f198874b = bVar;
        this.f198881i = executor;
        this.f198877e = i;
        this.f198878f = list;
        this.f198879g = i2;
        this.f198880h = i3;
    }
}
