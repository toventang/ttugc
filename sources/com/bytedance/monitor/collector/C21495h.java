package com.bytedance.monitor.collector;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.common.utility.C13618i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.monitor.collector.h */
public final class C21495h {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<AbstractC21470a> f50995a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public static AbstractC21470a f50996b;

    /* renamed from: c */
    public static volatile AbstractC21497a f50997c;

    /* renamed from: d */
    public static volatile boolean f50998d = false;

    /* renamed from: e */
    private static volatile boolean f50999e;

    /* renamed from: f */
    private static Printer f51000f;

    /* renamed from: g */
    private static long f51001g = 0;

    /* renamed from: h */
    private static int f51002h = 0;

    /* renamed from: com.bytedance.monitor.collector.h$a */
    public interface AbstractC21497a {
        static {
            Covode.recordClassIndex(25124);
        }

        /* renamed from: a */
        void mo20230a(long j);
    }

    static {
        Covode.recordClassIndex(25122);
    }

    /* renamed from: a */
    public static void m40377a() {
        if (!C21512o.f51059a && !f50999e) {
            f50999e = true;
            f51000f = new Printer() {
                /* class com.bytedance.monitor.collector.C21495h.C214961 */

                static {
                    Covode.recordClassIndex(25123);
                }

                public final void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.charAt(0) == '>') {
                            C21495h.m40379a(true, str);
                        } else if (str.charAt(0) == '<') {
                            C21495h.m40379a(false, str);
                        }
                    }
                }
            };
            C13618i.m24467a();
            C13618i.m24468a(f51000f);
        }
    }

    /* renamed from: a */
    public static void m40378a(AbstractC21470a aVar) {
        CopyOnWriteArrayList<AbstractC21470a> copyOnWriteArrayList = f50995a;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(aVar);
        }
    }

    /* renamed from: a */
    public static void m40379a(boolean z, String str) {
        AbstractC21470a aVar;
        AbstractC21470a aVar2;
        long nanoTime = System.nanoTime();
        AbstractC21470a.f50893b = nanoTime / 1000000;
        AbstractC21470a.f50894c = SystemClock.currentThreadTimeMillis();
        if (z && (aVar2 = f50996b) != null && aVar2.mo20124a()) {
            f50996b.mo20123a(str);
        }
        CopyOnWriteArrayList<AbstractC21470a> copyOnWriteArrayList = f50995a;
        for (int i = 0; i < copyOnWriteArrayList.size(); i++) {
            AbstractC21470a aVar3 = copyOnWriteArrayList.get(i);
            if (aVar3 == null || !aVar3.mo20124a()) {
                if (!z && aVar3.f50895d) {
                    aVar3.mo20125b("");
                }
            } else if (z) {
                if (!aVar3.f50895d) {
                    aVar3.mo20123a(str);
                }
            } else if (aVar3.f50895d) {
                aVar3.mo20125b(str);
            }
        }
        if (!z && (aVar = f50996b) != null && aVar.mo20124a()) {
            f50996b.mo20125b("");
        }
        if (f50998d) {
            f51001g += System.nanoTime() - nanoTime;
            int i2 = f51002h;
            f51002h = i2 + 1;
            if (i2 >= 1000) {
                if (f50997c != null) {
                    f50997c.mo20230a(f51001g);
                }
                f51002h = 0;
                f51001g = 0;
                f50998d = false;
            }
        }
    }
}
