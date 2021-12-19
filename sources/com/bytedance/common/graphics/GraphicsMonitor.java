package com.bytedance.common.graphics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.p802b.p834j.C13104c;
import com.bytedance.p802b.p834j.p838d.AbstractC13106a;
import com.bytedance.p802b.p834j.p838d.AbstractC13108c;
import com.bytedance.p802b.p841k.C13113a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GraphicsMonitor {
    private static ScheduledFuture<?> gpuFuture;
    public static double gpuLoadDataOnce = -1.0d;
    private static ScheduledExecutorService gpuScheduleService;
    private static boolean isInit;
    private static boolean isInitGraphicsLoad;
    public static volatile boolean isPause;
    private static AbstractC13106a lifecycleService;
    private static long sCollectInterval;
    public static long sCollectWindow;
    private static int startTime;

    public static native void closeStatistical();

    public static native double getStatisticOnceData();

    public static native void openStatistical();

    private static native boolean startHook();

    static {
        Covode.recordClassIndex(15518);
    }

    public static synchronized double getByteGpu() {
        double d;
        synchronized (GraphicsMonitor.class) {
            MethodCollector.m26663i(8302);
            d = gpuLoadDataOnce;
            MethodCollector.m26664o(8302);
        }
        return d;
    }

    public static synchronized boolean isStart() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.m26663i(8304);
            if (startTime > 0) {
                MethodCollector.m26664o(8304);
                return true;
            }
            MethodCollector.m26664o(8304);
            return false;
        }
    }

    private static void initGraphicsLoad() {
        MethodCollector.m26663i(8898);
        isInitGraphicsLoad = true;
        try {
            C21501k.m40385a(C13113a.f31955g);
            startHook();
            gpuScheduleService = m24295xdad6e70f(0);
            MethodCollector.m26664o(8898);
        } catch (Throwable unused) {
            isInitGraphicsLoad = false;
            MethodCollector.m26664o(8898);
        }
    }

    public static synchronized void stop() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.m26663i(8760);
            if (!isInit) {
                MethodCollector.m26664o(8760);
                return;
            }
            int i = startTime - 1;
            startTime = i;
            if (i > 0) {
                MethodCollector.m26664o(8760);
                return;
            }
            gpuFuture.cancel(true);
            gpuLoadDataOnce = -1.0d;
            MethodCollector.m26664o(8760);
        }
    }

    public static synchronized void init() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.m26663i(8456);
            if (isInit) {
                MethodCollector.m26664o(8456);
                return;
            }
            isInit = true;
            sCollectInterval = 15000;
            sCollectWindow = 100;
            AbstractC13106a aVar = (AbstractC13106a) C13104c.m23566a(AbstractC13106a.class);
            lifecycleService = aVar;
            aVar.mo20900a(new AbstractC13108c() {
                /* class com.bytedance.common.graphics.GraphicsMonitor.C135101 */

                static {
                    Covode.recordClassIndex(15519);
                }

                @Override // com.bytedance.p802b.p834j.p838d.AbstractC13108c
                /* renamed from: a */
                public final void mo20838a() {
                    GraphicsMonitor.isPause = false;
                }

                @Override // com.bytedance.p802b.p834j.p838d.AbstractC13108c
                /* renamed from: b */
                public final void mo20839b() {
                    GraphicsMonitor.isPause = true;
                }
            });
            if (lifecycleService.mo20901a()) {
                isPause = false;
            }
            MethodCollector.m26664o(8456);
        }
    }

    public static synchronized void start() {
        synchronized (GraphicsMonitor.class) {
            MethodCollector.m26663i(8609);
            if (!isInit) {
                MethodCollector.m26664o(8609);
                return;
            }
            if (!isInitGraphicsLoad) {
                initGraphicsLoad();
            }
            ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
            if (scheduledExecutorService == null) {
                MethodCollector.m26664o(8609);
                return;
            }
            int i = startTime + 1;
            startTime = i;
            if (i > 1) {
                MethodCollector.m26664o(8609);
                return;
            }
            RunnableC135112 r5 = new Runnable() {
                /* class com.bytedance.common.graphics.GraphicsMonitor.RunnableC135112 */

                static {
                    Covode.recordClassIndex(15520);
                }

                public final void run() {
                    MethodCollector.m26663i(8290);
                    try {
                        if (!GraphicsMonitor.isPause) {
                            GraphicsMonitor.openStatistical();
                            Thread.sleep(GraphicsMonitor.sCollectWindow);
                            GraphicsMonitor.closeStatistical();
                            GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
                            MethodCollector.m26664o(8290);
                            return;
                        }
                        GraphicsMonitor.gpuLoadDataOnce = -1.0d;
                        MethodCollector.m26664o(8290);
                    } catch (Throwable unused) {
                        MethodCollector.m26664o(8290);
                    }
                }
            };
            long j = sCollectInterval;
            gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(r5, j, j, TimeUnit.MILLISECONDS);
            MethodCollector.m26664o(8609);
        }
    }

    /* renamed from: com_bytedance_common_graphics_GraphicsMonitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool */
    public static ScheduledExecutorService m24295xdad6e70f(int i) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = i;
        return (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }
}
