package com.p2082ss.android.ugc.aweme.framework.p3006a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.framework.a.a */
public class C51423a {

    /* renamed from: a */
    public static volatile boolean f118496a;

    /* renamed from: b */
    private static CopyOnWriteArrayList<AbstractC51424b> f118497b;

    /* renamed from: c */
    private static Context f118498c;

    /* renamed from: d */
    private static boolean f118499d;

    static {
        Covode.recordClassIndex(60646);
    }

    /* renamed from: b */
    public static void m95791b(int i, String str, String str2) {
        m95784a(i, str, str2);
    }

    /* renamed from: a */
    public static void m95783a() {
        CopyOnWriteArrayList<AbstractC51424b> copyOnWriteArrayList;
        if (f118496a && (copyOnWriteArrayList = f118497b) != null) {
            Iterator<AbstractC51424b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC51424b next = it.next();
                if (next != null && next.mo59593a()) {
                    next.mo59594b();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m95786a(Exception exc) {
        m95788a("", exc);
    }

    /* renamed from: a */
    public static void m95787a(String str) {
        m95784a(3, null, str);
    }

    /* renamed from: a */
    public static void m95790a(Throwable th) {
        CopyOnWriteArrayList<AbstractC51424b> copyOnWriteArrayList;
        if (f118496a && (copyOnWriteArrayList = f118497b) != null) {
            Iterator<AbstractC51424b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC51424b next = it.next();
                if (next != null && next.mo59593a()) {
                    next.mo59592a(next.mo59594b(), th);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m95792b(String str, String str2) {
        m95784a(2, str, str2);
    }

    /* renamed from: a */
    public static void m95789a(String str, String str2) {
        m95793c(2, str, str2);
    }

    /* renamed from: a */
    public static synchronized void m95785a(Context context, List<AbstractC51424b> list) {
        synchronized (C51423a.class) {
            MethodCollector.m26663i(11209);
            if (f118496a) {
                IllegalStateException illegalStateException = new IllegalStateException("CrashlyticsWrapper already inited!");
                MethodCollector.m26664o(11209);
                throw illegalStateException;
            } else if (context != null) {
                f118499d = true;
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f118498c = applicationContext;
                if (!list.isEmpty()) {
                    f118497b = new CopyOnWriteArrayList<>(list);
                }
                CopyOnWriteArrayList<AbstractC51424b> copyOnWriteArrayList = f118497b;
                if (copyOnWriteArrayList != null) {
                    Iterator<AbstractC51424b> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC51424b next = it.next();
                        if (next != null && next.mo59593a()) {
                            next.mo59590a(f118498c);
                        }
                    }
                }
                f118496a = true;
                MethodCollector.m26664o(11209);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Context can't be null!");
                MethodCollector.m26664o(11209);
                throw illegalArgumentException;
            }
        }
    }

    /* renamed from: a */
    public static void m95788a(String str, Exception exc) {
        CopyOnWriteArrayList<AbstractC51424b> copyOnWriteArrayList;
        if (f118496a && (copyOnWriteArrayList = f118497b) != null) {
            Iterator<AbstractC51424b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC51424b next = it.next();
                if (next != null && next.mo59593a()) {
                    next.mo59591a(next.mo59594b(), str, exc);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m95793c(int i, String str, String str2) {
        if (!C62845i.m113257a()) {
            m95784a(i, str, str2);
        }
    }

    /* renamed from: a */
    public static void m95784a(int i, String str, String str2) {
        CopyOnWriteArrayList<AbstractC51424b> copyOnWriteArrayList;
        String str3;
        if (f118496a && (copyOnWriteArrayList = f118497b) != null) {
            Iterator<AbstractC51424b> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AbstractC51424b next = it.next();
                if (next != null && next.mo59593a()) {
                    if (str == null) {
                        str3 = next.mo59594b();
                    } else {
                        str3 = str;
                    }
                    next.mo59589a(i, str3, str2);
                }
            }
        }
    }
}
