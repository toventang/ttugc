package com.p2082ss.android.ugc.aweme.p2719cv;

import android.os.SystemClock;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.cv.f */
final class C40774f {

    /* renamed from: a */
    static ExecutorService f95453a;

    /* renamed from: b */
    Object f95454b;

    /* renamed from: c */
    public Map<RunnableC40765b, Object> f95455c;

    /* renamed from: d */
    public ReentrantLock f95456d;

    static {
        Covode.recordClassIndex(48626);
    }

    /* renamed from: com.ss.android.ugc.aweme.cv.f$a */
    static class C40778a {

        /* renamed from: a */
        public static C40774f f95473a = new C40774f((byte) 0);

        static {
            Covode.recordClassIndex(48630);
        }
    }

    private C40774f() {
        this.f95454b = new Object();
        this.f95456d = new ReentrantLock();
        this.f95455c = new WeakHashMap();
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        a.f95504b = "TaskMonitor";
        f95453a = C40780g.m82242a(a.mo70028a());
        C1764a.m5928a("taskBlockedTimeOut=%d", new Object[]{Long.valueOf(C40780g.f95475a.f95487f)});
        ((ScheduledExecutorService) f95453a).scheduleAtFixedRate(new RunnableC40779b(), C40780g.f95475a.f95487f, C40780g.f95475a.f95487f, TimeUnit.MILLISECONDS);
    }

    /* renamed from: com.ss.android.ugc.aweme.cv.f$b */
    class RunnableC40779b implements Runnable {
        static {
            Covode.recordClassIndex(48631);
        }

        public final void run() {
            if (C40780g.f95476b.mo70009c()) {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList<RunnableC40765b> arrayList = new ArrayList();
                C40774f.this.f95456d.lock();
                try {
                    if (C40774f.this.f95455c.size() <= 0) {
                        C40774f.this.f95456d.unlock();
                        return;
                    }
                    Iterator<Map.Entry<RunnableC40765b, Object>> it = C40774f.this.f95455c.entrySet().iterator();
                    while (it.hasNext()) {
                        RunnableC40765b key = it.next().getKey();
                        if (uptimeMillis - key.f95431c >= C40780g.f95475a.f95487f) {
                            arrayList.add(key);
                            it.remove();
                        }
                    }
                    C40774f.this.f95456d.unlock();
                    arrayList.size();
                    for (RunnableC40765b bVar : arrayList) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            String a = C40794p.m82277a(bVar.f95429a);
                            if (!C40780g.m82243a(a)) {
                                jSONObject.put("task_name", a);
                                jSONObject.put("pool_type", bVar.f95430b.f95428a.name());
                                jSONObject.put("pool_size", bVar.f95430b.getPoolSize());
                                jSONObject.put("queue_size", bVar.f95430b.getQueue().size());
                                jSONObject.put("duration", uptimeMillis - bVar.f95431c);
                                if (bVar.f95432d != null) {
                                    jSONObject.put("task_stack", C40794p.m82279a(bVar.f95432d.getStackTrace()));
                                }
                                C40780g.f95476b.mo70008c(jSONObject);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    arrayList.clear();
                } catch (Exception e2) {
                    e2.printStackTrace();
                } catch (Throwable th) {
                    C40774f.this.f95456d.unlock();
                    throw th;
                }
            }
        }

        RunnableC40779b() {
        }
    }

    /* synthetic */ C40774f(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70018a(RunnableC40765b bVar) {
        if (C40780g.f95476b.mo70009c()) {
            this.f95456d.lock();
            try {
                this.f95455c.remove(bVar);
            } finally {
                this.f95456d.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70019a(final Runnable runnable, final ThreadPoolExecutor threadPoolExecutor) {
        if (C40780g.f95476b.mo70011d()) {
            final Exception exc = new Exception();
            f95453a.execute(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.p2719cv.C40774f.RunnableC407773 */

                static {
                    Covode.recordClassIndex(48629);
                }

                public final void run() {
                    MethodCollector.m26663i(5107);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        Runnable runnable = runnable;
                        if (runnable instanceof RunnableC40765b) {
                            jSONObject.put("task_name", ((RunnableC40765b) runnable).f95429a);
                        } else {
                            jSONObject.put("task_name", runnable);
                        }
                        ThreadPoolExecutor threadPoolExecutor = threadPoolExecutor;
                        if (threadPoolExecutor instanceof C40764a) {
                            jSONObject.put("pool_type", ((C40764a) threadPoolExecutor).f95428a.name());
                            jSONObject.put("pool_size", threadPoolExecutor.getPoolSize());
                            jSONObject.put("task_stack", C40794p.m82278a((Throwable) exc));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C40780g.f95476b.mo70010d(jSONObject);
                    MethodCollector.m26664o(5107);
                }
            });
        }
    }

    /* renamed from: a */
    public static JSONObject m82238a(WeakReference<Object> weakReference, String str, int i, int i2, long j) {
        Object obj = weakReference.get();
        if (obj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a = C40794p.m82277a(obj);
            if (C40780g.m82243a(a)) {
                return null;
            }
            jSONObject.put("task_name", a);
            jSONObject.put("pool_type", str);
            jSONObject.put("pool_size", i);
            jSONObject.put("queue_size", i2);
            jSONObject.put("duration", j);
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
