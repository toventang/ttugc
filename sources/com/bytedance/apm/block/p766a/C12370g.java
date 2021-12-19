package com.bytedance.apm.block.p766a;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.apm.block.p766a.C12378i;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.collector.AbstractC21470a;
import com.bytedance.monitor.collector.C21495h;
import com.bytedance.monitor.collector.C21501k;
import com.bytedance.p1562p.p1563a.C21608a;
import com.bytedance.p1562p.p1564b.C21614c;
import java.util.LinkedList;

/* renamed from: com.bytedance.apm.block.a.g */
public final class C12370g {

    /* renamed from: a */
    public static C12370g f29814a = new C12370g();

    /* renamed from: b */
    public static volatile int f29815b;

    /* renamed from: c */
    public static volatile boolean f29816c;

    /* renamed from: d */
    public static final Object f29817d;

    /* renamed from: e */
    public static long[] f29818e = new long[600000];

    /* renamed from: f */
    public static volatile long f29819f;

    /* renamed from: g */
    public static volatile long f29820g;

    /* renamed from: h */
    public static volatile Runnable f29821h = null;

    /* renamed from: i */
    public static HandlerThread f29822i;

    /* renamed from: j */
    public static Handler f29823j = new Handler(f29822i.getLooper());

    /* renamed from: k */
    public static final C12383l[] f29824k = new C12383l[50];

    /* renamed from: l */
    public static int f29825l = 0;

    /* renamed from: m */
    public static Object f29826m = new Object();

    /* renamed from: n */
    public static boolean f29827n = false;

    /* renamed from: o */
    public static AbstractC21470a f29828o = new AbstractC21470a() {
        /* class com.bytedance.apm.block.p766a.C12370g.C123711 */

        static {
            Covode.recordClassIndex(14177);
        }

        @Override // com.bytedance.monitor.collector.AbstractC21470a
        /* renamed from: a */
        public final boolean mo20124a() {
            if (C12370g.f29821h != null) {
                C12370g.f29821h.run();
                C12370g.f29821h = null;
            }
            if (C12370g.f29815b > 0) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.monitor.collector.AbstractC21470a
        /* renamed from: b */
        public final void mo20125b(String str) {
            super.mo20125b(str);
            C12370g.f29827n = true;
        }

        @Override // com.bytedance.monitor.collector.AbstractC21470a
        /* renamed from: a */
        public final void mo20123a(String str) {
            super.mo20123a(str);
            C12370g.f29819f = AbstractC21470a.f50893b - C12370g.f29820g;
            C12370g.f29827n = false;
            synchronized (C12370g.f29826m) {
                C12370g.f29826m.notify();
            }
        }
    };

    /* renamed from: p */
    private static int f29829p = 0;

    /* renamed from: q */
    private static int f29830q = -1;

    /* renamed from: r */
    private static boolean f29831r = false;

    /* renamed from: s */
    private static Thread f29832s = Looper.getMainLooper().getThread();

    /* renamed from: t */
    private static long f29833t;

    /* renamed from: u */
    private static long f29834u;

    /* renamed from: v */
    private static int f29835v = 50;

    /* renamed from: w */
    private static Runnable f29836w;

    /* renamed from: x */
    private static Runnable f29837x = new Runnable() {
        /* class com.bytedance.apm.block.p766a.C12370g.RunnableC123722 */

        static {
            Covode.recordClassIndex(14178);
        }

        public final void run() {
            while (true) {
                try {
                    if (C12370g.f29827n || C12370g.f29815b < 0) {
                        synchronized (C12370g.f29826m) {
                            C12370g.f29826m.wait();
                        }
                    } else {
                        long uptimeMillis = SystemClock.uptimeMillis() - C12370g.f29820g;
                        C12370g.f29819f = uptimeMillis;
                        C12370g.f29819f = uptimeMillis & 8796093022207L;
                        SystemClock.sleep(5);
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    };

    /* renamed from: y */
    private static C12376a f29838y;

    /* renamed from: z */
    private static C12376a f29839z;

    /* renamed from: com.bytedance.apm.block.a.g$a */
    public static final class C12376a {

        /* renamed from: a */
        public int f29840a;

        /* renamed from: b */
        int f29841b;

        /* renamed from: c */
        public C12376a f29842c;

        /* renamed from: d */
        public C12376a f29843d;

        /* renamed from: e */
        boolean f29844e = true;

        /* renamed from: f */
        public String f29845f;

        /* renamed from: g */
        public long f29846g;

        static {
            Covode.recordClassIndex(14182);
        }

        public final String toString() {
            return "index:" + this.f29840a + ",\tisValid:" + this.f29844e + " source:" + this.f29845f;
        }

        public C12376a(int i) {
            this.f29840a = i;
        }
    }

    /* renamed from: b */
    public static long[] m22231b() {
        C12376a aVar;
        int i;
        try {
            C12376a aVar2 = f29838y;
            if (aVar2 == null || (aVar = f29839z) == null || aVar2 == aVar) {
                return null;
            }
            if (aVar2.f29841b == 0) {
                i = f29829p - 1;
            } else {
                i = f29838y.f29841b;
            }
            return m22227a(f29839z.f29840a, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(14176);
        f29815b = Integer.MAX_VALUE;
        f29816c = false;
        Object obj = new Object();
        f29817d = obj;
        long uptimeMillis = SystemClock.uptimeMillis();
        f29819f = uptimeMillis;
        f29820g = uptimeMillis;
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        f29822i = handlerThread;
        f29836w = null;
        if (Build.VERSION.SDK_INT < 24) {
            f29815b = -4;
            f29816c = true;
        } else {
            if (f29815b == Integer.MAX_VALUE) {
                synchronized (obj) {
                    if (f29815b == Integer.MAX_VALUE) {
                        f29819f = SystemClock.uptimeMillis() - f29820g;
                        f29823j.removeCallbacksAndMessages(null);
                        f29823j.postDelayed(f29837x, 5);
                        Handler handler = f29823j;
                        RunnableC123755 r0 = new Runnable() {
                            /* class com.bytedance.apm.block.p766a.C12370g.RunnableC123755 */

                            static {
                                Covode.recordClassIndex(14181);
                            }

                            public final void run() {
                                synchronized (C12370g.f29817d) {
                                    if (C12370g.f29815b == Integer.MAX_VALUE || C12370g.f29815b == 1) {
                                        C12370g.f29815b = -2;
                                        C12370g.f29816c = true;
                                    }
                                }
                            }
                        };
                        f29836w = r0;
                        handler.postDelayed(r0, 15000);
                        C21495h.m40378a(f29828o);
                        f29815b = 1;
                    }
                }
            }
            m22226a(1048574, 0L);
            m22222a("EvilMethodTracer#message_0", AbstractC21470a.f50893b);
        }
        f29823j.postDelayed(new Runnable() {
            /* class com.bytedance.apm.block.p766a.C12370g.RunnableC123733 */

            static {
                Covode.recordClassIndex(14179);
            }

            public final void run() {
                synchronized (C12370g.f29817d) {
                    if (C12370g.f29815b == Integer.MAX_VALUE || C12370g.f29815b == -4) {
                        C12370g.f29815b = -3;
                        C12370g.f29816c = true;
                        C12370g.f29821h = new Runnable() {
                            /* class com.bytedance.apm.block.p766a.C12370g.RunnableC123744 */

                            static {
                                Covode.recordClassIndex(14180);
                            }

                            public final void run() {
                                C12370g.f29823j.removeCallbacksAndMessages(null);
                                AbstractC21470a aVar = C12370g.f29828o;
                                if (aVar != null) {
                                    synchronized (C21495h.f50995a) {
                                        C21495h.f50995a.remove(aVar);
                                    }
                                }
                                C12370g.f29822i.quit();
                                C12370g.f29818e = null;
                            }
                        };
                    }
                }
            }
        }, 15000);
    }

    /* renamed from: a */
    public static void m22225a() {
        synchronized (f29817d) {
            if (f29815b < 2 && f29815b >= -2) {
                f29823j.removeCallbacks(f29836w);
                if (f29818e != null) {
                    f29815b = 2;
                    f29816c = false;
                } else {
                    throw new RuntimeException("MethodCollector sBuffer == null");
                }
            }
        }
    }

    /* renamed from: a */
    public static long[] m22228a(C12376a aVar) {
        return m22229a(aVar, new C12376a(f29829p - 1));
    }

    /* renamed from: a */
    public static String m22224a(long[] jArr, long j) {
        if (jArr == null) {
            return "";
        }
        LinkedList linkedList = new LinkedList();
        C21608a.m40549a(jArr, linkedList, j);
        C21608a.m40547a(linkedList);
        StringBuilder sb = new StringBuilder();
        C21608a.m40545a(linkedList, sb);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m22223a(long j, long j2) {
        long[] jArr;
        C12376a aVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        C12376a aVar2 = f29838y;
        if (aVar2 == null || (aVar = f29839z) == null) {
            jArr = null;
        } else {
            while (aVar2 != aVar) {
                if (aVar2.f29842c.f29846g <= j2) {
                    if (aVar.f29843d.f29846g >= j) {
                        break;
                    }
                    aVar = aVar.f29843d;
                } else {
                    aVar2 = aVar2.f29842c;
                }
            }
            if (aVar2.f29841b == 0) {
                i = f29829p - 1;
            } else {
                i = aVar2.f29841b;
            }
            jArr = m22227a(aVar.f29840a, i);
        }
        return m22224a(jArr, uptimeMillis);
    }

    /* renamed from: a */
    public static C12376a m22222a(String str, long j) {
        if (f29838y == null) {
            C12376a aVar = new C12376a(f29829p);
            f29838y = aVar;
            if (j <= 0) {
                j = SystemClock.uptimeMillis();
            }
            aVar.f29846g = j;
            f29838y.f29845f = str;
            C12376a aVar2 = f29838y;
            f29839z = aVar2;
            return aVar2;
        }
        C12376a aVar3 = new C12376a(f29829p);
        if (j <= 0) {
            j = SystemClock.uptimeMillis();
        }
        aVar3.f29846g = j;
        aVar3.f29845f = str;
        aVar3.f29842c = f29838y;
        f29838y.f29841b = aVar3.f29840a - 1;
        f29838y.f29843d = aVar3;
        f29838y = aVar3;
        return aVar3;
    }

    /* renamed from: b */
    public static void m22230b(int i, long j) {
        int i2;
        if (!f29816c && C21614c.f51258e && i < 1048575 && Thread.currentThread() == f29832s) {
            if (j != 0) {
                long j2 = j - f29820g;
                f29819f = j2;
                f29819f = j2 & 8796093022207L;
            }
            long j3 = (long) i;
            if (j3 == f29834u) {
                if (f29819f - f29833t > 16 && (i2 = f29825l) < f29835v - 1) {
                    f29824k[i2] = new C12383l(f29832s.getStackTrace());
                    f29825l++;
                }
                f29834u = 0;
                C21501k.m40384a().mo35100a(false);
            }
            f29833t = 0;
            long j4 = (j3 << 43) | 0 | f29819f;
            long[] jArr = f29818e;
            int i3 = f29829p;
            jArr[i3] = j4;
            int i4 = i3 + 1;
            f29829p = i4;
            if (i4 == 600000) {
                f29829p = 0;
            }
            C12376a aVar = f29839z;
            if (aVar != null && aVar.f29840a == f29829p) {
                C12376a aVar2 = f29839z.f29843d;
                f29839z = aVar2;
                if (aVar2 != null) {
                    aVar2.f29842c = null;
                } else {
                    f29838y = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m22226a(int i, long j) {
        if (!f29816c && C21614c.f51258e && i < 1048575 && Thread.currentThread() == f29832s && !f29831r) {
            f29831r = true;
            if (j != 0) {
                long j2 = j - f29820g;
                f29819f = j2;
                f29819f = j2 & 8796093022207L;
            }
            f29833t = f29819f;
            if (C12378i.C12380a.f29863a.f29854a.contains(Integer.valueOf(i))) {
                f29834u = (long) i;
                C21501k.m40384a().mo35100a(true);
            }
            long j3 = Long.MIN_VALUE | (((long) i) << 43) | f29819f;
            long[] jArr = f29818e;
            int i2 = f29829p;
            jArr[i2] = j3;
            int i3 = i2 + 1;
            f29829p = i3;
            if (i3 == 600000) {
                f29829p = 0;
            }
            f29831r = false;
            C12376a aVar = f29839z;
            if (aVar != null && aVar.f29840a == f29829p) {
                C12376a aVar2 = f29839z.f29843d;
                f29839z = aVar2;
                if (aVar2 != null) {
                    aVar2.f29842c = null;
                } else {
                    f29838y = null;
                }
            }
        }
    }

    /* renamed from: a */
    private static long[] m22227a(int i, int i2) {
        long[] jArr = new long[0];
        int max = Math.max(0, i);
        int max2 = Math.max(0, i2);
        if (max2 > max) {
            int i3 = (max2 - max) + 1;
            long[] jArr2 = new long[i3];
            System.arraycopy(f29818e, max, jArr2, 0, i3);
            return jArr2;
        } else if (max2 >= max) {
            return jArr;
        } else {
            int i4 = max2 + 1;
            long[] jArr3 = f29818e;
            long[] jArr4 = new long[((jArr3.length - max) + i4)];
            System.arraycopy(jArr3, max, jArr4, 0, jArr3.length - max);
            long[] jArr5 = f29818e;
            System.arraycopy(jArr5, 0, jArr4, jArr5.length - max, i4);
            return jArr4;
        }
    }

    /* renamed from: a */
    private static long[] m22229a(C12376a aVar, C12376a aVar2) {
        if (f29815b == -3) {
            return null;
        }
        long[] jArr = new long[0];
        try {
            if (aVar.f29844e && aVar2.f29844e) {
                return m22227a(aVar.f29840a - 1, aVar2.f29840a);
            }
        } catch (OutOfMemoryError unused) {
        }
        return jArr;
    }
}
