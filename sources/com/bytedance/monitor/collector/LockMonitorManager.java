package com.bytedance.monitor.collector;

import android.os.Looper;
import android.os.Process;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class LockMonitorManager {
    private static C21466a[] buffer = new C21466a[100];
    private static int bufferSize = 100;
    public static volatile String lastJavaStack;
    public static volatile boolean openFetchStack;
    private static int position;
    private static ExecutorService sLockHandler = m40324xa5f88c93(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.ThreadFactoryC214621 */

        static {
            Covode.recordClassIndex(25088);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("lock_handler_time");
            return thread;
        }
    });
    public static BlockingQueue<String> sStackBlockingQueue = new LinkedBlockingQueue();
    private static ExecutorService sStackFetcher = m40324xa5f88c93(new ThreadFactory() {
        /* class com.bytedance.monitor.collector.LockMonitorManager.ThreadFactoryC214632 */

        static {
            Covode.recordClassIndex(25089);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            Process.setThreadPriority(-20);
            thread.setName("lock_stack_fetch");
            return thread;
        }
    });

    private static void nativeGetJavaStack() {
        if (openFetchStack) {
            sStackFetcher.execute(new Runnable() {
                /* class com.bytedance.monitor.collector.LockMonitorManager.RunnableC214654 */

                static {
                    Covode.recordClassIndex(25091);
                }

                public final void run() {
                    try {
                        String a = C21512o.m40409a(Looper.getMainLooper().getThread().getStackTrace());
                        synchronized (LockMonitorManager.sStackBlockingQueue) {
                            if (LockMonitorManager.sStackBlockingQueue.size() != 0) {
                                LockMonitorManager.sStackBlockingQueue.clear();
                            }
                            LockMonitorManager.sStackBlockingQueue.put(a);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(25087);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.monitor.collector.LockMonitorManager$a */
    public static class C21466a {

        /* renamed from: a */
        public long f50886a;

        /* renamed from: b */
        public long f50887b;

        /* renamed from: c */
        public String f50888c;

        /* renamed from: d */
        public String f50889d;

        static {
            Covode.recordClassIndex(25092);
        }

        public String toString() {
            String str;
            StringBuilder append = new StringBuilder("{\"timestamp\":").append(this.f50886a).append(",\"duration\":").append(this.f50887b).append(",\"msg:\":").append(this.f50889d).append(",\"javaStack\":\"");
            String str2 = this.f50888c;
            if (str2 == null || str2.isEmpty()) {
                str = "null";
            } else {
                str = this.f50888c;
            }
            return append.append(str).append("\"}").toString();
        }

        /* renamed from: a */
        static void m40325a(String str) {
            String poll;
            if (str != null && !str.isEmpty()) {
                try {
                    String[] split = str.split("&#&");
                    if (split.length == 3) {
                        if (LockMonitorManager.openFetchStack) {
                            synchronized (LockMonitorManager.sStackBlockingQueue) {
                                poll = LockMonitorManager.sStackBlockingQueue.poll(200, TimeUnit.MILLISECONDS);
                                if (poll != null || LockMonitorManager.lastJavaStack == null) {
                                    LockMonitorManager.lastJavaStack = poll;
                                } else {
                                    poll = LockMonitorManager.lastJavaStack;
                                }
                                if (!LockMonitorManager.sStackBlockingQueue.isEmpty()) {
                                    LockMonitorManager.sStackBlockingQueue.clear();
                                }
                            }
                            if (poll != null) {
                                C12560b.C12564a.f30567a.mo20387a(new Runnable(new C21466a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], poll)) {
                                    /* class com.bytedance.monitor.collector.LockMonitorManager.C21466a.RunnableC214671 */

                                    /* renamed from: a */
                                    final /* synthetic */ C21466a f50890a;

                                    static {
                                        Covode.recordClassIndex(25093);
                                    }

                                    public final void run() {
                                        LockMonitorManager.put(this.f50890a);
                                    }

                                    {
                                        this.f50890a = r1;
                                    }
                                });
                                return;
                            }
                            C12560b.C12564a.f30567a.mo20387a(new Runnable(new C21466a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], "")) {
                                /* class com.bytedance.monitor.collector.LockMonitorManager.C21466a.RunnableC214682 */

                                /* renamed from: a */
                                final /* synthetic */ C21466a f50891a;

                                static {
                                    Covode.recordClassIndex(25094);
                                }

                                public final void run() {
                                    LockMonitorManager.put(this.f50891a);
                                }

                                {
                                    this.f50891a = r1;
                                }
                            });
                            return;
                        }
                        C12560b.C12564a.f30567a.mo20387a(new Runnable(new C21466a(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2], "")) {
                            /* class com.bytedance.monitor.collector.LockMonitorManager.C21466a.RunnableC214693 */

                            /* renamed from: a */
                            final /* synthetic */ C21466a f50892a;

                            static {
                                Covode.recordClassIndex(25095);
                            }

                            public final void run() {
                                LockMonitorManager.put(this.f50892a);
                            }

                            {
                                this.f50892a = r1;
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        }

        private C21466a(long j, long j2, String str, String str2) {
            this.f50886a = j;
            this.f50887b = j2;
            this.f50888c = str2;
            this.f50889d = str;
        }
    }

    public static List<String> dumpLockInfo() {
        C21466a aVar;
        LinkedList linkedList = new LinkedList();
        int i = 0;
        while (true) {
            int i2 = bufferSize;
            if (i >= i2 || (aVar = buffer[(((position + i2) - i) - 1) % i2]) == null) {
                return linkedList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f50886a).append("&#&").append(aVar.f50887b).append("&#&").append(aVar.f50889d).append("&#&").append(aVar.f50888c).append("&#&");
            linkedList.add(sb.toString());
            i++;
        }
        return linkedList;
    }

    public static void setOpenFetchStack(boolean z) {
        openFetchStack = z;
        if (!z) {
            lastJavaStack = null;
        }
    }

    private static void nativePut(final String str) {
        sLockHandler.execute(new Runnable() {
            /* class com.bytedance.monitor.collector.LockMonitorManager.RunnableC214643 */

            static {
                Covode.recordClassIndex(25090);
            }

            public final void run() {
                try {
                    C21466a.m40325a(str);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: com_bytedance_monitor_collector_LockMonitorManager_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor */
    public static ExecutorService m40324xa5f88c93(ThreadFactory threadFactory) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        a.f95509g = threadFactory;
        return C40780g.m82242a(a.mo70028a());
    }

    public static void put(C21466a aVar) {
        if (aVar != null) {
            C21466a[] aVarArr = buffer;
            int i = position;
            aVarArr[i] = aVar;
            position = (i + 1) % bufferSize;
        }
    }

    public static String dumpLockInfo(long j, long j2) {
        C21466a[] aVarArr = new C21466a[100];
        int i = 0;
        System.arraycopy(buffer, 0, aVarArr, 0, 100);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i2 = bufferSize;
            if (i >= i2) {
                break;
            }
            C21466a aVar = aVarArr[((position + i) + 1) % i2];
            if (aVar != null) {
                if (aVar.f50886a < j2 || aVar.f50886a + aVar.f50887b > j) {
                    arrayList.add(aVar);
                }
                if (aVar.f50886a + aVar.f50887b < j) {
                    break;
                }
            }
            i++;
        }
        return arrayList.toString();
    }
}
