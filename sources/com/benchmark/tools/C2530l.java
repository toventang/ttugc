package com.benchmark.tools;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.benchmark.tools.l */
public final class C2530l<TResult> {

    /* renamed from: a */
    public static final Executor f7652a;

    /* renamed from: b */
    public static final Executor f7653b = new ExecutorC2535b((byte) 0);

    /* renamed from: c */
    private TResult f7654c;

    /* renamed from: d */
    private Exception f7655d;

    /* renamed from: e */
    private boolean f7656e;

    /* renamed from: f */
    private final Object f7657f = new Object();

    /* renamed from: g */
    private List<AbstractC2534a<TResult, Void>> f7658g = new ArrayList();

    /* renamed from: com.benchmark.tools.l$a */
    public interface AbstractC2534a<TTaskResult, TContinuationResult> {
        static {
            Covode.recordClassIndex(2905);
        }

        /* renamed from: a */
        TContinuationResult mo6821a(C2530l<TTaskResult> lVar);
    }

    /* renamed from: com.benchmark.tools.l$b */
    static class ExecutorC2535b implements Executor {
        static {
            Covode.recordClassIndex(2906);
        }

        private ExecutorC2535b() {
        }

        /* synthetic */ ExecutorC2535b(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: b */
    public final boolean mo6991b() {
        boolean z;
        MethodCollector.m26663i(6818);
        synchronized (this.f7657f) {
            try {
                z = this.f7656e;
            } finally {
                MethodCollector.m26664o(6818);
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(2901);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        f7652a = C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: c */
    private void m7416c() {
        MethodCollector.m26663i(6817);
        synchronized (this.f7657f) {
            try {
                for (AbstractC2534a<TResult, Void> aVar : this.f7658g) {
                    try {
                        aVar.mo6821a(this);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        RuntimeException runtimeException = new RuntimeException(e2);
                        MethodCollector.m26664o(6817);
                        throw runtimeException;
                    }
                }
                this.f7658g = null;
            } finally {
                MethodCollector.m26664o(6817);
            }
        }
        MethodCollector.m26664o(6817);
    }

    /* renamed from: a */
    public final TResult mo6987a() {
        TResult tresult;
        MethodCollector.m26663i(6816);
        synchronized (this.f7657f) {
            try {
                tresult = this.f7654c;
            } finally {
                MethodCollector.m26664o(6816);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final void mo6989a(Exception exc) {
        MethodCollector.m26663i(6676);
        synchronized (this.f7657f) {
            try {
                if (!this.f7656e) {
                    this.f7656e = true;
                    this.f7655d = exc;
                    this.f7657f.notifyAll();
                    m7416c();
                    MethodCollector.m26664o(6676);
                }
            } finally {
                MethodCollector.m26664o(6676);
            }
        }
    }

    /* renamed from: a */
    public final void mo6990a(TResult tresult) {
        MethodCollector.m26663i(6674);
        synchronized (this.f7657f) {
            try {
                if (!this.f7656e) {
                    this.f7656e = true;
                    this.f7654c = tresult;
                    this.f7657f.notifyAll();
                    m7416c();
                    MethodCollector.m26664o(6674);
                }
            } finally {
                MethodCollector.m26664o(6674);
            }
        }
    }

    /* renamed from: a */
    public static <TResult> C2530l<TResult> m7415a(final Callable<TResult> callable, Executor executor) {
        C2530l<TResult> lVar = new C2530l<>();
        try {
            executor.execute(new Runnable(lVar) {
                /* class com.benchmark.tools.C2530l.RunnableC25311 */

                /* renamed from: a */
                final /* synthetic */ C2530l f7659a;

                static {
                    Covode.recordClassIndex(2902);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.benchmark.tools.l */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        this.f7659a.mo6990a(callable.call());
                    } catch (Exception e) {
                        this.f7659a.mo6989a(e);
                    }
                }

                {
                    this.f7659a = r1;
                }
            });
        } catch (Exception e) {
            lVar.mo6989a(e);
        }
        return lVar;
    }

    /* renamed from: a */
    public final <TContinuationResult> C2530l<TContinuationResult> mo6986a(final AbstractC2534a<TResult, TContinuationResult> aVar, final Executor executor) {
        boolean b;
        MethodCollector.m26663i(6965);
        final C2530l<TContinuationResult> lVar = new C2530l<>();
        synchronized (this.f7657f) {
            try {
                b = mo6991b();
                if (!b) {
                    this.f7658g.add(new AbstractC2534a<TResult, Void>() {
                        /* class com.benchmark.tools.C2530l.C25322 */

                        static {
                            Covode.recordClassIndex(2903);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public Void mo6821a(C2530l<TResult> lVar) {
                            C2530l.this.mo6988a(lVar, aVar, lVar, executor);
                            return null;
                        }
                    });
                }
            } finally {
                MethodCollector.m26664o(6965);
            }
        }
        if (b) {
            mo6988a(lVar, aVar, this, executor);
        }
        return lVar;
    }

    /* renamed from: a */
    public final <TContinuationResult, TResult> void mo6988a(final C2530l<TContinuationResult> lVar, final AbstractC2534a<TResult, TContinuationResult> aVar, final C2530l<TResult> lVar2, Executor executor) {
        try {
            executor.execute(new Runnable() {
                /* class com.benchmark.tools.C2530l.RunnableC25333 */

                static {
                    Covode.recordClassIndex(2904);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.benchmark.tools.l */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        lVar.mo6990a(aVar.mo6821a(lVar2));
                    } catch (Exception e) {
                        lVar.mo6989a(e);
                    }
                }
            });
        } catch (Exception e) {
            lVar.mo6989a(e);
        }
    }
}
