package com.bytedance.p1399im.core.internal.p1434e;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.internal.utils.HandlerC20049x;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1404a.C19499m;
import com.bytedance.p1399im.core.p1407c.C19510e;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.p1407c.C19517i;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.bytedance.im.core.internal.e.d */
public final class RunnableC19987d<T> implements HandlerC20049x.AbstractC20050a, Runnable {

    /* renamed from: b */
    public static Map<Integer, SoftReference<RunnableC19987d>> f47510b = new HashMap();

    /* renamed from: a */
    public HandlerC20049x f47511a = new HandlerC20049x(Looper.getMainLooper(), this);

    /* renamed from: c */
    private AbstractC19986c<T> f47512c;

    /* renamed from: d */
    private AbstractC19985b<T> f47513d;

    /* renamed from: e */
    private T f47514e;

    /* renamed from: f */
    private Executor f47515f;

    /* renamed from: g */
    private C19499m f47516g;

    /* renamed from: h */
    private long f47517h;

    /* renamed from: i */
    private long f47518i;

    /* renamed from: j */
    private long f47519j;

    /* renamed from: k */
    private long f47520k;

    /* renamed from: l */
    private long f47521l;

    /* renamed from: m */
    private long f47522m;

    /* renamed from: n */
    private Throwable f47523n;

    /* renamed from: o */
    private Throwable f47524o;

    static {
        Covode.recordClassIndex(22831);
    }

    /* renamed from: c */
    private String m37735c() {
        AbstractC19986c<T> cVar = this.f47512c;
        if (cVar == null) {
            return "null";
        }
        return cVar.toString();
    }

    /* renamed from: b */
    private void m37733b() {
        if (this.f47511a != null && this.f47516g.enable == 1) {
            Message obtain = Message.obtain();
            obtain.what = 100002;
            obtain.obj = this;
            this.f47511a.sendMessageDelayed(obtain, this.f47516g.timeoutDurationMs);
        }
        try {
            Executor executor = this.f47515f;
            if (!(executor instanceof ExecutorService) || !((ExecutorService) executor).isShutdown()) {
                this.f47515f.execute(this);
            }
        } catch (Exception e) {
            this.f47524o = e;
            e.printStackTrace();
            C19510e.m36439a(e);
        }
    }

    /* renamed from: a */
    public static void m37726a() {
        try {
            for (SoftReference<RunnableC19987d> softReference : f47510b.values()) {
                RunnableC19987d dVar = softReference.get();
                C19512f.m36450a("imsdk", "Task clean task ".concat(String.valueOf(dVar)), (Throwable) null);
                if (dVar != null) {
                    dVar.f47511a.removeMessages(100001);
                    dVar.f47511a.removeMessages(100003);
                }
            }
            f47510b.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            com.bytedance.im.core.internal.utils.x r1 = r6.f47511a
            r0 = 100002(0x186a2, float:1.40133E-40)
            r1.removeMessages(r0)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r6.f47517h
            long r0 = r4 - r2
            r6.f47519j = r0
            com.bytedance.im.core.internal.e.c<T> r0 = r6.f47512c
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r0.mo31187a()     // Catch:{ Exception -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r0 = move-exception
            r0.printStackTrace()
            r6.f47523n = r0
            com.bytedance.p1399im.core.p1407c.C19510e.m36439a(r0)
        L_0x0024:
            r2 = 0
        L_0x0025:
            long r0 = android.os.SystemClock.uptimeMillis()
            r6.f47518i = r0
            long r0 = r0 - r4
            r6.f47520k = r0
            r6.f47514e = r2
            com.bytedance.im.core.internal.utils.x r0 = r6.f47511a
            if (r0 == 0) goto L_0x0044
            android.os.Message r1 = android.os.Message.obtain()
            r0 = 100001(0x186a1, float:1.40131E-40)
            r1.what = r0
            r1.obj = r6
            com.bytedance.im.core.internal.utils.x r0 = r6.f47511a
            r0.sendMessage(r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.internal.p1434e.RunnableC19987d.run():void");
    }

    /* renamed from: a */
    private static String m37725a(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "unknown";
    }

    /* renamed from: a */
    private void m37730a(String str) {
        C19517i a = new C19517i().mo31179a(str);
        m37727a(a);
        m37734b(a);
        m37736c(a);
        a.mo31183d();
    }

    /* renamed from: b */
    private static String m37732b(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 2048) {
            return stackTraceString.substring(0, 2048);
        }
        return stackTraceString;
    }

    /* renamed from: b */
    private void m37734b(C19517i iVar) {
        iVar.mo31180a("wait_executor_cost", Long.valueOf(this.f47519j)).mo31180a("execute_cost", Long.valueOf(this.f47520k)).mo31180a("wait_main_thread_cost", Long.valueOf(this.f47521l)).mo31180a("execute_callback_cost", Long.valueOf(this.f47522m));
    }

    /* renamed from: c */
    private void m37736c(C19517i iVar) {
        boolean z;
        String str = "1";
        if (this.f47523n != null) {
            iVar.mo31180a("execute_error", str);
            iVar.mo31180a("error_msg", m37725a(this.f47523n));
            iVar.mo31180a("error_stack", m37732b(this.f47523n));
            z = true;
        } else {
            iVar.mo31180a("execute_error", "0");
            z = false;
        }
        if (this.f47524o != null) {
            iVar.mo31180a("execute_callback_error", str);
            iVar.mo31180a("error_msg", m37725a(this.f47524o));
            iVar.mo31180a("error_stack", m37732b(this.f47524o));
        } else {
            iVar.mo31180a("execute_callback_error", "0");
            if (!z) {
                str = "0";
            }
        }
        iVar.mo31180a("has_error", str);
    }

    /* renamed from: a */
    private void m37727a(C19517i iVar) {
        long j;
        MethodCollector.m26663i(10379);
        Executor executor = this.f47515f;
        long j2 = 0;
        if (executor instanceof ThreadPoolExecutor) {
            j2 = (long) ((ThreadPoolExecutor) executor).getQueue().size();
            j = ((ThreadPoolExecutor) this.f47515f).getTaskCount();
        } else {
            j = 0;
        }
        iVar.mo31180a("executor_name", C19983a.m37716a(this.f47515f)).mo31180a("processor_count", Integer.valueOf(Runtime.getRuntime().availableProcessors())).mo31180a("work_queue_size", Long.valueOf(j2)).mo31180a("task_count", Long.valueOf(j)).mo31180a("task_name", m37735c());
        MethodCollector.m26664o(10379);
    }

    @Override // com.bytedance.p1399im.core.internal.utils.HandlerC20049x.AbstractC20050a
    /* renamed from: a */
    public final void mo31686a(Message message) {
        if (message.obj instanceof RunnableC19987d) {
            RunnableC19987d dVar = (RunnableC19987d) message.obj;
            switch (message.what) {
                case 100001:
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f47521l = uptimeMillis - this.f47518i;
                    if (dVar.f47513d != null) {
                        f47510b.remove(Integer.valueOf(dVar.hashCode()));
                        try {
                            dVar.f47513d.mo31188a(dVar.f47514e);
                        } catch (Exception e) {
                            this.f47524o = e;
                            e.printStackTrace();
                            C19510e.m36439a(e);
                        }
                    }
                    this.f47522m = SystemClock.uptimeMillis() - uptimeMillis;
                    try {
                        if (this.f47516g.enable != 0) {
                            if (C19510e.m36440a(0.001f)) {
                                m37730a("im_sdk_task_info");
                            }
                            if (this.f47520k > this.f47516g.executeTooLongMs && C19510e.m36440a(1.0f)) {
                                m37730a("im_sdk_task_execute_too_long");
                            }
                            if (this.f47522m > this.f47516g.callbackTooLongMs && C19510e.m36440a(1.0f)) {
                                m37730a("im_sdk_task_callback_too_long");
                            }
                            if (this.f47523n != null && C19510e.m36440a(1.0f)) {
                                m37731a("im_sdk_task_execute_error", this.f47523n);
                            }
                            if (this.f47524o != null && C19510e.m36440a(1.0f)) {
                                m37731a("im_sdk_task_callback_error", this.f47524o);
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                case 100002:
                    this.f47511a.removeMessages(100002);
                    try {
                        if (this.f47516g.enable != 0 && C19510e.m36440a(1.0f)) {
                            C19517i a = new C19517i().mo31179a("im_sdk_task_wait_execute_timeout");
                            m37727a(a);
                            a.mo31183d();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                case 100003:
                    m37733b();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static <T> void m37728a(AbstractC19986c<T> cVar, AbstractC19985b<T> bVar) {
        boolean z = C19483d.m36365a().f46159d;
        if (z) {
            RunnableC19987d dVar = new RunnableC19987d(cVar, bVar, C19983a.m37717a());
            dVar.m37733b();
            f47510b.put(Integer.valueOf(dVar.hashCode()), new SoftReference<>(dVar));
            return;
        }
        C19512f.m36457b("imsdk", "Task execute not start, isLogin:".concat(String.valueOf(z)), (Throwable) null);
    }

    /* renamed from: a */
    private void m37731a(String str, Throwable th) {
        new C19517i().mo31179a(str).mo31180a("error_msg", m37725a(th)).mo31180a("error_stack", m37732b(th)).mo31180a("task_name", m37735c()).mo31183d();
    }

    public RunnableC19987d(AbstractC19986c<T> cVar, AbstractC19985b<T> bVar, Executor executor) {
        this.f47512c = cVar;
        this.f47513d = bVar;
        this.f47515f = executor;
        this.f47516g = C19483d.m36365a().mo31141b().f46251ap;
        this.f47517h = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static <T> void m37729a(AbstractC19986c<T> cVar, AbstractC19985b<T> bVar, Executor executor) {
        boolean z = C19483d.m36365a().f46159d;
        if (z) {
            new RunnableC19987d(cVar, bVar, executor).m37733b();
        } else {
            C19512f.m36457b("imsdk", "Task execute not start, isLogin:".concat(String.valueOf(z)), (Throwable) null);
        }
    }
}
