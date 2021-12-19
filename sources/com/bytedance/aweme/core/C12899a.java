package com.bytedance.aweme.core;

import android.os.Looper;
import android.util.Pair;
import android.view.Choreographer;
import com.bytedance.aweme.p799a.AbstractC12893a;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.aweme.p800b.p801a.EnumC12898a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.aweme.core.a */
public final class C12899a {

    /* renamed from: a */
    public static int f31394a = 4;

    /* renamed from: b */
    public static Choreographer f31395b = null;

    /* renamed from: c */
    public static boolean f31396c = false;

    /* renamed from: d */
    public static C12904b f31397d = null;

    /* renamed from: e */
    static final ConcurrentHashMap<Long, ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>>> f31398e = new ConcurrentHashMap<>();

    /* renamed from: f */
    static final LinkedBlockingQueue<AbstractC12893a> f31399f = new LinkedBlockingQueue<>();

    /* renamed from: g */
    public static Method f31400g = null;

    /* renamed from: h */
    public static final RunnableC12901b f31401h;

    /* renamed from: i */
    static long f31402i = 0;

    /* renamed from: j */
    public static final C12899a f31403j;

    /* renamed from: k */
    private static final long f31404k = f31404k;

    /* renamed from: l */
    private static final long f31405l = f31405l;

    /* renamed from: m */
    private static final long f31406m = f31406m;

    /* renamed from: n */
    private static final long f31407n = f31407n;

    /* renamed from: o */
    private static final long f31408o = f31408o;

    /* renamed from: p */
    private static boolean f31409p;

    /* renamed from: q */
    private static boolean f31410q;

    /* renamed from: r */
    private static boolean f31411r;

    /* renamed from: s */
    private static boolean f31412s;

    /* renamed from: t */
    private static final AtomicLong f31413t = new AtomicLong(1);

    /* renamed from: u */
    private static final AtomicLong f31414u = new AtomicLong(0);

    /* renamed from: v */
    private static final Choreographer$FrameCallbackC12900a f31415v;

    /* renamed from: w */
    private static final Choreographer$FrameCallbackC12902c f31416w;

    /* renamed from: a */
    public static Object m23144a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_aweme_core_RealVsyncWorker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_bytedance_aweme_core_RealVsyncWorker_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private C12899a() {
    }

    /* renamed from: com.bytedance.aweme.core.a$b */
    public static final class RunnableC12901b implements Runnable {

        /* renamed from: a */
        public final C12899a f31418a;

        static {
            Covode.recordClassIndex(14735);
        }

        public final void run() {
            C12899a.m23147a(true, C12899a.f31402i);
        }

        public RunnableC12901b(C12899a aVar) {
            C89219l.m154719c(aVar, "");
            this.f31418a = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.aweme.core.a$d */
    public static final class RunnableC12903d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f31420a;

        static {
            Covode.recordClassIndex(14737);
        }

        RunnableC12903d(boolean z) {
            this.f31420a = z;
        }

        public final void run() {
            C12899a.m23146a(this.f31420a);
        }
    }

    static {
        Covode.recordClassIndex(14733);
        C12899a aVar = new C12899a();
        f31403j = aVar;
        C12904b a = C12904b.m23149a();
        C89219l.m154709a((Object) a, "");
        f31397d = a;
        f31415v = new Choreographer$FrameCallbackC12900a(aVar);
        f31416w = new Choreographer$FrameCallbackC12902c(aVar);
        f31401h = new RunnableC12901b(aVar);
    }

    /* renamed from: a */
    public static Method m23145a() {
        try {
            Class<?> cls = Class.forName("android.view.Choreographer");
            C89219l.m154709a((Object) cls, "");
            Method declaredMethod = cls.getDeclaredMethod("postCallbackDelayed", Integer.TYPE, Runnable.class, Object.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.aweme.core.a$c */
    public static final class Choreographer$FrameCallbackC12902c implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final C12899a f31419a;

        static {
            Covode.recordClassIndex(14736);
        }

        public final void doFrame(long j) {
            C12899a.f31402i = j;
        }

        public Choreographer$FrameCallbackC12902c(C12899a aVar) {
            C89219l.m154719c(aVar, "");
            this.f31419a = aVar;
        }
    }

    /* renamed from: com.bytedance.aweme.core.a$a */
    public static final class Choreographer$FrameCallbackC12900a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final C12899a f31417a;

        static {
            Covode.recordClassIndex(14734);
        }

        public final void doFrame(long j) {
            C12899a.m23147a(false, j);
        }

        public Choreographer$FrameCallbackC12900a(C12899a aVar) {
            C89219l.m154719c(aVar, "");
            this.f31417a = aVar;
        }
    }

    /* renamed from: b */
    private static void m23148b(boolean z) {
        if (C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper())) {
            m23146a(z);
        } else {
            C12895a.f31387b.f31389a.post(new RunnableC12903d(z));
        }
    }

    /* renamed from: a */
    private static long m23142a(AbstractC12893a aVar) {
        long nanoTime = System.nanoTime() - System.nanoTime();
        if (AbstractC12893a.f31383b.get(aVar.f31385a) == null) {
            AbstractC12893a.f31383b.put(aVar.f31385a, new C89378p<>(1L, Long.valueOf(nanoTime)));
        } else {
            C89378p<Long, Long> pVar = AbstractC12893a.f31383b.get(aVar.f31385a);
            if (pVar == null) {
                C89219l.m154707a();
            }
            C89219l.m154709a((Object) pVar, "");
            C89378p<Long, Long> pVar2 = pVar;
            AbstractC12893a.f31383b.put(aVar.f31385a, new C89378p<>(Long.valueOf(pVar2.getFirst().longValue() + 1), Long.valueOf(((pVar2.getSecond().longValue() * pVar2.getFirst().longValue()) + nanoTime) / (pVar2.getFirst().longValue() + 1))));
        }
        return nanoTime;
    }

    /* renamed from: a */
    public static void m23146a(boolean z) {
        if (z) {
            Choreographer choreographer = f31395b;
            if (choreographer != null) {
                choreographer.postFrameCallback(f31416w);
            }
            Method method = f31400g;
            if (method == null) {
                C89219l.m154707a();
            }
            m23144a(method, f31395b, new Object[]{Integer.valueOf(f31394a), f31401h, null, 0});
            return;
        }
        Choreographer.getInstance().postFrameCallback(f31415v);
    }

    /* renamed from: a */
    public static void m23147a(boolean z, long j) {
        boolean z2 = false;
        f31410q = false;
        long nanoTime = System.nanoTime();
        long j2 = f31404k;
        long j3 = (j2 - (nanoTime - j)) - f31405l;
        if (!z) {
            j3 -= f31406m;
        }
        if (j3 > j2 || j3 < 0) {
            j3 = f31407n;
        }
        if (f31398e.size() > f31397d.f31422b || f31412s) {
            j3 = Long.MAX_VALUE;
        }
        LinkedBlockingQueue<AbstractC12893a> linkedBlockingQueue = f31399f;
        while (true) {
            if (!linkedBlockingQueue.isEmpty()) {
                if (f31411r) {
                    f31411r = false;
                    j3 = f31408o;
                    break;
                }
                AbstractC12893a peek = linkedBlockingQueue.peek();
                AbstractC12893a poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    C89219l.m154707a();
                }
                j3 -= m23142a(poll);
                C89378p<Long, Long> pVar = AbstractC12893a.f31383b.get(peek.f31385a);
                if (pVar != null) {
                    pVar.getSecond();
                }
            } else if (j3 < 0) {
                j3 = f31407n;
            }
        }
        if (j3 == f31408o) {
            m23148b(z);
            return;
        }
        f31413t.get();
        while (true) {
            AtomicLong atomicLong = f31413t;
            if (atomicLong.get() > f31414u.get()) {
                break;
            }
            ConcurrentHashMap<Long, ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>>> concurrentHashMap = f31398e;
            ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>> concurrentHashMap2 = concurrentHashMap.get(Long.valueOf(atomicLong.get()));
            if (concurrentHashMap2 != null) {
                j3 = m23143a(EnumC12898a.NORMAL, j3, concurrentHashMap2);
                ArrayList<AbstractC12893a> arrayList = concurrentHashMap2.get(EnumC12898a.NORMAL);
                if (arrayList == null) {
                    C89219l.m154707a();
                }
                if (arrayList.size() == 0) {
                    concurrentHashMap.remove(Long.valueOf(atomicLong.getAndAdd(1)));
                }
                if (j3 <= 0) {
                    break;
                }
            } else {
                concurrentHashMap.remove(Long.valueOf(atomicLong.getAndAdd(1)));
            }
        }
        ConcurrentHashMap<Long, ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>>> concurrentHashMap3 = f31398e;
        if (concurrentHashMap3.size() > 0 || f31399f.size() > 0) {
            m23148b(z);
            if (concurrentHashMap3.size() == 1) {
                for (Map.Entry<Long, ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>>> entry : concurrentHashMap3.entrySet()) {
                    if (entry.getKey().longValue() < f31413t.get()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    f31398e.clear();
                }
            }
            f31398e.size();
            return;
        }
        concurrentHashMap3.size();
        f31409p = false;
    }

    /* renamed from: a */
    private static long m23143a(EnumC12898a aVar, long j, ConcurrentHashMap<EnumC12898a, ArrayList<AbstractC12893a>> concurrentHashMap) {
        boolean z;
        long j2;
        Long second;
        MethodCollector.m26663i(1274);
        long j3 = j;
        do {
            if (j3 <= 0 && j3 != f31407n) {
                break;
            }
            if (concurrentHashMap == null) {
                C89219l.m154707a();
            }
            ArrayList<AbstractC12893a> arrayList = concurrentHashMap.get(aVar);
            if (arrayList == null) {
                C89219l.m154707a();
            }
            C89219l.m154709a((Object) arrayList, "");
            synchronized (arrayList) {
                try {
                    ArrayList<AbstractC12893a> arrayList2 = concurrentHashMap.get(aVar);
                    if (arrayList2 == null) {
                        C89219l.m154707a();
                    }
                    C89219l.m154709a((Object) arrayList2, "");
                    z = true;
                    if (!arrayList2.isEmpty()) {
                        if (f31411r) {
                            f31411r = false;
                            j3 = f31408o;
                        } else {
                            ArrayList<AbstractC12893a> arrayList3 = concurrentHashMap.get(aVar);
                            if (arrayList3 == null) {
                                C89219l.m154707a();
                            }
                            AbstractC12893a aVar2 = arrayList3.get(0);
                            C89219l.m154709a((Object) aVar2, "");
                            AbstractC12893a aVar3 = aVar2;
                            C89378p<Long, Long> pVar = AbstractC12893a.f31383b.get(aVar3.f31385a);
                            if (pVar == null || (second = pVar.getSecond()) == null) {
                                j2 = 0;
                            } else {
                                j2 = second.longValue();
                            }
                            if (j3 - j2 >= 0 || j3 == f31407n || !f31410q) {
                                ArrayList<AbstractC12893a> arrayList4 = concurrentHashMap.get(aVar);
                                if (arrayList4 == null) {
                                    C89219l.m154707a();
                                }
                                AbstractC12893a remove = arrayList4.remove(0);
                                C89219l.m154709a((Object) remove, "");
                                long a = m23142a(remove);
                                C89378p<Long, Long> pVar2 = AbstractC12893a.f31383b.get(aVar3.f31385a);
                                if (pVar2 != null) {
                                    pVar2.getSecond();
                                }
                                f31410q = true;
                                if (j != f31407n) {
                                    j3 -= a;
                                } else {
                                    j3 = f31408o;
                                }
                            } else {
                                j3 = f31408o;
                            }
                        }
                    }
                    z = false;
                } finally {
                    MethodCollector.m26664o(1274);
                }
            }
        } while (z);
        return j3;
    }
}
