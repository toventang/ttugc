package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.apm.C12255a;
import com.bytedance.apm.C12290b;
import com.bytedance.apm.config.C12419c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p998a.C14764a;
import com.bytedance.framwork.core.p998a.C14765b;
import com.p2082ss.android.ugc.aweme.base.utils.C34726l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.o */
public class C34611o {

    /* renamed from: a */
    private static final ThreadFactory f81671a;

    /* renamed from: b */
    public static final CopyOnWriteArrayList<Runnable> f81672b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public static final List<String> f81673c = new ArrayList();

    /* renamed from: d */
    public static final ExecutorService f81674d;

    static {
        Covode.recordClassIndex(41575);
        ThreadFactoryC346121 r8 = new ThreadFactory() {
            /* class com.p2082ss.android.ugc.aweme.base.C34611o.ThreadFactoryC346121 */

            static {
                Covode.recordClassIndex(41576);
            }

            public final Thread newThread(Runnable runnable) {
                MethodCollector.m26663i(11858);
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setPriority(10);
                MethodCollector.m26664o(11858);
                return newThread;
            }
        };
        f81671a = r8;
        f81674d = new ThreadPoolExecutor(1, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), r8, new ThreadPoolExecutor.DiscardOldestPolicy());
    }

    /* renamed from: a */
    private static synchronized void m70662a() {
        synchronized (C34611o.class) {
            MethodCollector.m26663i(14089);
            CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = f81672b;
            if (copyOnWriteArrayList != null) {
                Iterator<Runnable> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f81674d.submit(it.next());
                }
                f81672b.clear();
            }
            f81674d.submit(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.base.C34611o.RunnableC346143 */

                static {
                    Covode.recordClassIndex(41578);
                }

                public final void run() {
                    MethodCollector.m26663i(13939);
                    synchronized (C34611o.f81673c) {
                        try {
                            if (C34611o.f81673c.size() != 0) {
                                for (String str : C34611o.f81673c) {
                                    C34611o.f81674d.submit(C34726l.m70942a(str));
                                }
                                C34611o.f81673c.clear();
                                try {
                                    C34726l.f82015a.mo123678e();
                                } catch (Exception unused) {
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(13939);
                        }
                    }
                }
            });
            MethodCollector.m26664o(14089);
        }
    }

    /* renamed from: a */
    public static void m70664a(C12419c.C12420a aVar) {
        C12255a.C12259a.f29537a.mo19751a(aVar.mo20215a());
        m70662a();
    }

    /* renamed from: a */
    private static synchronized void m70665a(Runnable runnable) {
        synchronized (C34611o.class) {
            MethodCollector.m26663i(14060);
            if (!ApmDelegate.C12507a.f30372a.f30340h || C14764a.f35981a == null) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = f81672b;
                copyOnWriteArrayList.add(runnable);
                if (copyOnWriteArrayList.size() >= 200) {
                    f81674d.submit(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.base.C34611o.RunnableC346132 */

                        static {
                            Covode.recordClassIndex(41577);
                        }

                        /* JADX WARNING: Can't wrap try/catch for region: R(7:51|50|52|53|54|74|55) */
                        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d4, code lost:
                            r0 = th;
                         */
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00c5 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final synchronized void run() {
                            /*
                            // Method dump skipped, instructions count: 240
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.C34611o.RunnableC346132.run():void");
                        }
                    });
                    MethodCollector.m26664o(14060);
                    return;
                }
            } else {
                f81674d.submit(runnable);
            }
            MethodCollector.m26664o(14060);
        }
    }

    /* renamed from: a */
    public static void m70668a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            m70665a(new RunnableC34651u(str));
        } else {
            m70665a(new RunnableC34646p(str, jSONObject.toString()));
        }
    }

    /* renamed from: b */
    public static void m70670b(String str, String str2, float f) {
        m70665a(new RunnableC34648r(str, str2, f));
    }

    /* renamed from: a */
    public static void m70667a(String str, String str2, float f) {
        m70665a(new RunnableC34647q(str, str2, f));
    }

    /* renamed from: b */
    public static void m70671b(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            m70665a(new RunnableC34649s(str));
        } else {
            m70665a(new RunnableC34650t(jSONObject.toString(), str2, str));
        }
    }

    /* renamed from: a */
    public static void m70666a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C12290b.m22061a(str, i, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public static void m70663a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C14765b.m27093a(j, j2, str, str2, str3, i, jSONObject);
    }

    /* renamed from: b */
    public static void m70669b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        C14765b.m27095b(j, j2, str, str2, str3, i, jSONObject);
    }
}
