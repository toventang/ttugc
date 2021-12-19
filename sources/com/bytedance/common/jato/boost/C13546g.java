package com.bytedance.common.jato.boost;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.common.jato.boost.g */
public final class C13546g {

    /* renamed from: a */
    public static volatile int f32960a = -1;

    /* renamed from: b */
    public static volatile boolean f32961b;

    /* renamed from: c */
    public static Map<Integer, Integer> f32962c = new ConcurrentHashMap();

    /* renamed from: d */
    private static boolean f32963d;

    static {
        Covode.recordClassIndex(15559);
    }

    /* renamed from: a */
    public static synchronized void m24337a() {
        synchronized (C13546g.class) {
            MethodCollector.m26663i(8805);
            if (!f32961b || f32960a == -1) {
                MethodCollector.m26664o(8805);
                return;
            }
            Jato.resetCoreBind(f32960a);
            Jato.resetPriority(f32960a);
            f32961b = false;
            MethodCollector.m26664o(8805);
        }
    }

    /* renamed from: a */
    public static void m24338a(int i, int i2) {
        try {
            int i3 = 0;
            if (f32962c.get(Integer.valueOf(i)) == null) {
                if (i != -1) {
                    i3 = Process.getThreadPriority(i);
                } else {
                    i3 = Process.getThreadPriority(0);
                }
                f32962c.put(Integer.valueOf(i), Integer.valueOf(i3));
            }
            if (i3 == i2) {
                return;
            }
            if (i != -1) {
                Process.setThreadPriority(i, i2);
            } else {
                Process.setThreadPriority(i2);
            }
        } catch (Throwable th) {
            Jato.getListener().mo21786a("error when set priority", th);
        }
    }

    /* renamed from: a */
    public static synchronized void m24339a(final Application application, final ExecutorService executorService, final int i) {
        synchronized (C13546g.class) {
            MethodCollector.m26663i(8948);
            if (!f32961b && f32960a != -1) {
                f32961b = true;
                Jato.bindBigCore(f32960a);
                m24338a(f32960a, i);
                MethodCollector.m26664o(8948);
            } else if (f32963d) {
                MethodCollector.m26664o(8948);
            } else {
                f32963d = true;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.common.jato.boost.C13546g.C135471 */

                    static {
                        Covode.recordClassIndex(15560);
                    }

                    public final void onActivityDestroyed(Activity activity) {
                    }

                    public final void onActivityPaused(Activity activity) {
                    }

                    public final void onActivityResumed(Activity activity) {
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                    }

                    public final void onActivityStopped(Activity activity) {
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        executorService.execute(new Runnable() {
                            /* class com.bytedance.common.jato.boost.C13546g.C135471.RunnableC135481 */

                            static {
                                Covode.recordClassIndex(15561);
                            }

                            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
                                if (0 == 0) goto L_0x0064;
                             */
                            /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[Catch:{ all -> 0x00d5 }] */
                            /* JADX WARNING: Removed duplicated region for block: B:47:0x0097 A[SYNTHETIC] */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void run() {
                                /*
                                // Method dump skipped, instructions count: 221
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.boost.C13546g.C135471.RunnableC135481.run():void");
                            }
                        });
                    }
                });
                MethodCollector.m26664o(8948);
            }
        }
    }
}
