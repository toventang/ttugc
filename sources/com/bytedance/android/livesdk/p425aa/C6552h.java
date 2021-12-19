package com.bytedance.android.livesdk.p425aa;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.p425aa.ExecutorC6547g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.android.livesdk.aa.h */
public class C6552h {

    /* renamed from: a */
    public static final String f16362a;

    /* renamed from: b */
    public static volatile ExecutorC6547g.AbstractC6550c f16363b;

    /* renamed from: c */
    private static final String f16364c;

    /* renamed from: d */
    private static final ExecutorC6547g.AbstractC6550c f16365d = new ExecutorC6547g.AbstractC6550c() {
        /* class com.bytedance.android.livesdk.p425aa.C6552h.C65531 */

        static {
            Covode.recordClassIndex(7289);
        }

        @Override // com.bytedance.android.livesdk.p425aa.ExecutorC6547g.AbstractC6550c
        /* renamed from: a */
        public final void mo12685a() {
            C3854a.m9453a(6, C6552h.f16362a, "Task count exceeded, rejection triggered. ");
            if (C6552h.f16363b != null) {
                C6552h.f16363b.mo12685a();
            }
        }
    };

    /* renamed from: e */
    private static volatile C6552h f16366e;

    /* renamed from: f */
    private boolean f16367f;

    /* renamed from: g */
    private Executor f16368g;

    /* renamed from: h */
    private Handler f16369h;

    private C6552h() {
    }

    /* renamed from: b */
    private synchronized void m14015b() {
        MethodCollector.m26663i(11429);
        m14016c();
        MethodCollector.m26664o(11429);
    }

    /* renamed from: c */
    private synchronized void m14016c() {
        MethodCollector.m26663i(11595);
        m14013a(f16364c);
        MethodCollector.m26664o(11595);
    }

    static {
        Covode.recordClassIndex(7288);
        String simpleName = C6552h.class.getSimpleName();
        f16362a = simpleName;
        f16364c = simpleName + "-Thread";
    }

    /* renamed from: a */
    public static C6552h m14010a() {
        MethodCollector.m26663i(11273);
        if (f16366e == null) {
            synchronized (C6552h.class) {
                try {
                    if (f16366e == null) {
                        C6552h hVar = new C6552h();
                        f16366e = hVar;
                        hVar.m14015b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11273);
                    throw th;
                }
            }
        }
        C6552h hVar2 = f16366e;
        MethodCollector.m26664o(11273);
        return hVar2;
    }

    /* renamed from: a */
    private static void m14012a(C6552h hVar) {
        if (!hVar.f16367f) {
            throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
        }
    }

    /* renamed from: a */
    private synchronized void m14013a(String str) {
        MethodCollector.m26663i(11596);
        m14011a(64, str, f16365d);
        MethodCollector.m26664o(11596);
    }

    /* renamed from: a */
    private synchronized void m14014a(Executor executor) {
        MethodCollector.m26663i(11276);
        this.f16368g = executor;
        this.f16369h = new Handler(Looper.getMainLooper());
        this.f16367f = true;
        MethodCollector.m26664o(11276);
    }

    /* renamed from: a */
    public final synchronized void mo12687a(ExecutorC6547g.AbstractC6550c cVar) {
        MethodCollector.m26663i(11918);
        f16363b = cVar;
        MethodCollector.m26664o(11918);
    }

    /* renamed from: a */
    public final void mo12688a(Runnable runnable) {
        m14012a(this);
        Handler handler = this.f16369h;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo12689a(final Callable callable) {
        m14012a(this);
        this.f16368g.execute(new Runnable() {
            /* class com.bytedance.android.livesdk.p425aa.C6552h.RunnableC65542 */

            /* renamed from: a */
            final /* synthetic */ Handler f16370a = null;

            /* renamed from: c */
            final /* synthetic */ int f16372c;

            static {
                Covode.recordClassIndex(7290);
            }

            public final void run() {
                Handler handler = this.f16370a;
                if (handler == null) {
                    try {
                        callable.call();
                    } catch (Exception e) {
                        C3854a.m9453a(6, C6552h.f16362a, e.getMessage());
                    }
                } else {
                    Message obtainMessage = handler.obtainMessage(this.f16372c);
                    try {
                        obtainMessage.obj = callable.call();
                    } catch (Exception e2) {
                        obtainMessage.obj = e2;
                    }
                    this.f16370a.sendMessage(obtainMessage);
                }
            }

            {
                this.f16372c = 0;
            }
        });
    }

    /* renamed from: a */
    private synchronized void m14011a(int i, String str, ExecutorC6547g.AbstractC6550c cVar) {
        MethodCollector.m26663i(11749);
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            m14014a(C40780g.m82241a());
            MethodCollector.m26664o(11749);
            return;
        }
        ExecutorC6547g.C6548a aVar = new ExecutorC6547g.C6548a();
        aVar.f16355a = 64;
        aVar.f16357c = str;
        aVar.f16356b = cVar;
        m14014a(new ExecutorC6547g(aVar.f16355a, new ExecutorC6547g.ThreadFactoryC6551d(aVar.f16357c, (byte) 0), aVar.f16356b, (byte) 0));
        MethodCollector.m26664o(11749);
    }
}
