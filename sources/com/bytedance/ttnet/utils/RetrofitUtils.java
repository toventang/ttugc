package com.bytedance.ttnet.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.cronet.p987c.C14665a;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14722o;
import com.bytedance.frameworks.baselib.network.http.p993e.C14743a;
import com.bytedance.frameworks.baselib.network.http.p995g.C14754d;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.C22092q;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.bytedance.ttnet.retrofit.C22959b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.p2082ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import com.p2082ss.android.ugc.aweme.utils.C80399eo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class RetrofitUtils {

    /* renamed from: a */
    private static volatile CopyOnWriteArrayList<AbstractC22021a> f54305a;

    /* renamed from: b */
    private static C14754d<String, C22092q> f54306b = new C14754d<>(10);

    /* renamed from: c */
    private static C14754d<String, C22092q> f54307c = new C14754d<>(10);

    /* renamed from: a */
    private static void m43284a(C14612a aVar, List<C22027b> list, C22944d dVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C22027b bVar : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f52037a)) {
                            str = bVar.f52038b;
                        }
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (C13627m.m24498a(str)) {
            str = dVar.f35398a;
        }
        if (C13627m.m24498a(str)) {
            str = m43282a(exc);
        }
        if (!C13627m.m24498a(str) && aVar != null) {
            aVar.f35358a = str;
            if (aVar.f35359b != null) {
                aVar.f35359b.f35398a = str;
            }
        }
    }

    /* renamed from: a */
    private static String m43282a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* renamed from: a */
    public static String m43283a(List<C22027b> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (C22027b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f52037a)) {
                return bVar.f52038b;
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v8, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v9, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v10, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v11, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v12, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v13, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0168 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0172 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0187 A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x018e A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x019d A[Catch:{ all -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01da A[Catch:{ all -> 0x01ec, all -> 0x01f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01dd A[Catch:{ all -> 0x01ec, all -> 0x01f5 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43287a(final java.lang.String r28, java.lang.String r29, java.lang.String r30) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.m43287a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static synchronized void m43285a(AbstractC22021a aVar) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(3772);
            if (aVar == null) {
                MethodCollector.m26664o(3772);
                return;
            }
            ReportTimeDecorator reportTimeDecorator = new ReportTimeDecorator(aVar);
            if (!f54305a.contains(reportTimeDecorator)) {
                f54305a.add(reportTimeDecorator);
            }
            C22970d.m43302a(f54306b, reportTimeDecorator);
            C22970d.m43302a(f54307c, reportTimeDecorator);
            MethodCollector.m26664o(3772);
        }
    }

    /* renamed from: a */
    private static boolean m43286a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(26874);
        CopyOnWriteArrayList<AbstractC22021a> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        f54305a = copyOnWriteArrayList;
        C22092q.f52133h = copyOnWriteArrayList;
    }

    static class ReportTimeDecorator extends BaseInterceptorDecorator {
        static {
            Covode.recordClassIndex(26879);
        }

        public ReportTimeDecorator(AbstractC22021a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        private C22099u m43292a(AbstractC22021a.AbstractC22022a aVar) {
            long currentTimeMillis = System.currentTimeMillis();
            String name = this.f54310a.getClass().getName();
            aVar.mo35812c().f52173P.put(name.substring(name.lastIndexOf(46) + 1, name.length()) + "Time", Long.valueOf(currentTimeMillis));
            return this.f54310a.intercept(aVar);
        }

        @Override // com.bytedance.ttnet.utils.RetrofitUtils.BaseInterceptorDecorator, com.bytedance.retrofit2.p1612c.AbstractC22021a
        public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
            if (!(aVar.mo35812c() instanceof C34932b)) {
                return m43292a(aVar);
            }
            C34932b bVar = (C34932b) aVar.mo35812c();
            if (bVar.f82415W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
                bVar.mo61814a(bVar.f82417Y, uptimeMillis);
                bVar.mo61815b(bVar.f82417Y, uptimeMillis);
            }
            bVar.mo61813a(getClass().getSimpleName());
            bVar.f82415W = SystemClock.uptimeMillis();
            C22099u a = m43292a(aVar);
            if (bVar.f82416X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
                String simpleName = getClass().getSimpleName();
                bVar.mo61814a(simpleName, uptimeMillis2);
                bVar.mo61816c(simpleName, uptimeMillis2);
            }
            bVar.f82416X = SystemClock.uptimeMillis();
            return a;
        }
    }

    static abstract class BaseInterceptorDecorator implements AbstractC22021a {

        /* renamed from: a */
        protected AbstractC22021a f54310a;

        static {
            Covode.recordClassIndex(26878);
        }

        public BaseInterceptorDecorator(AbstractC22021a aVar) {
            this.f54310a = aVar;
        }

        /* renamed from: a */
        private C22099u m43291a(AbstractC22021a.AbstractC22022a aVar) {
            return this.f54310a.intercept(aVar);
        }

        @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
        public C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
            if (!(aVar.mo35812c() instanceof C34932b)) {
                return m43291a(aVar);
            }
            C34932b bVar = (C34932b) aVar.mo35812c();
            if (bVar.f82415W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
                bVar.mo61814a(bVar.f82417Y, uptimeMillis);
                bVar.mo61815b(bVar.f82417Y, uptimeMillis);
            }
            bVar.mo61813a(getClass().getSimpleName());
            bVar.f82415W = SystemClock.uptimeMillis();
            C22099u a = m43291a(aVar);
            if (bVar.f82416X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
                String simpleName = getClass().getSimpleName();
                bVar.mo61814a(simpleName, uptimeMillis2);
                bVar.mo61816c(simpleName, uptimeMillis2);
            }
            bVar.f82416X = SystemClock.uptimeMillis();
            return a;
        }
    }

    /* renamed from: a */
    public static Pair<String, String> m43275a(String str) {
        String str2;
        String str3 = null;
        if (str == null) {
            return null;
        }
        try {
            C14743a aVar = new C14743a(str);
            str2 = aVar.getBaseType();
            try {
                str3 = aVar.getParameter("charset");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        return new Pair<>(str2, str3);
    }

    /* renamed from: b */
    public static synchronized C22092q m43288b(String str) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(3926);
            if (C13627m.m24498a(str)) {
                MethodCollector.m26664o(3926);
                return null;
            }
            C22092q a = f54306b.mo23769a(str);
            if (a != null) {
                MethodCollector.m26664o(3926);
                return a;
            }
            C22092q b = m43289b(str, null);
            f54306b.mo23770a(str, b);
            MethodCollector.m26664o(3926);
            return b;
        }
    }

    /* renamed from: a */
    private static C22092q m43276a(C22092q.C22094a aVar) {
        if (C61410h.m111181a().f139422a) {
            try {
                AbstractC22025a.AbstractC22026a aVar2 = (AbstractC22025a.AbstractC22026a) Reflect.m24529on(aVar).field("clientProvider", new Class[0]).get();
                AbstractC22025a aVar3 = aVar2.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(aVar2.getClass().getName()) || (aVar3 instanceof C14722o) || (aVar3 instanceof C14665a)) {
                    return aVar.mo35894a();
                }
            } catch (Throwable th) {
                C80399eo.m139373a(th, "error occured.");
            }
        }
        C22092q a = aVar.mo35894a();
        if (a.f52140g != null) {
            a.f52140g.add(new TTNetMonitorInterceptor());
            a.f52140g.set(0, new BeforeHandleRequestInterceptor(a.f52140g.get(0)));
        }
        return a;
    }

    /* renamed from: b */
    public static synchronized C22092q m43289b(String str, List<AbstractC22021a> list) {
        C22092q a;
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(4017);
            a = m43278a(str, list, (AbstractC22043e.AbstractC22044a) null, new AbstractC22025a.AbstractC22026a() {
                /* class com.bytedance.ttnet.utils.RetrofitUtils.C229612 */

                static {
                    Covode.recordClassIndex(26876);
                }

                @Override // com.bytedance.retrofit2.client.AbstractC22025a.AbstractC22026a
                public final AbstractC22025a get() {
                    return new C22959b();
                }
            });
            MethodCollector.m26664o(4017);
        }
        return a;
    }

    /* renamed from: a */
    public static synchronized C22092q m43277a(String str, List<AbstractC22021a> list) {
        C22092q b;
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(4011);
            b = m43289b(str, list);
            MethodCollector.m26664o(4011);
        }
        return b;
    }

    /* renamed from: a */
    public static synchronized <S> S m43280a(C22092q qVar, Class<S> cls) {
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(4090);
            if (qVar != null) {
                S s = (S) qVar.mo35884a(cls);
                MethodCollector.m26664o(4090);
                return s;
            }
            MethodCollector.m26664o(4090);
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized <S> S m43281a(String str, Class<S> cls) {
        S s;
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(4076);
            s = (S) m43280a(m43288b(str), cls);
            MethodCollector.m26664o(4076);
        }
        return s;
    }

    /* renamed from: a */
    private static synchronized C22092q m43278a(String str, List<AbstractC22021a> list, AbstractC22043e.AbstractC22044a aVar, AbstractC22025a.AbstractC22026a aVar2) {
        C22092q a;
        synchronized (RetrofitUtils.class) {
            MethodCollector.m26663i(4026);
            a = m43279a(list, null, null, aVar2, str);
            MethodCollector.m26664o(4026);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r3 == false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.bytedance.retrofit2.C22092q m43279a(java.util.List<com.bytedance.retrofit2.p1612c.AbstractC22021a> r9, java.util.List<com.bytedance.retrofit2.AbstractC22043e.AbstractC22044a> r10, java.util.List<com.bytedance.retrofit2.AbstractC22019c.AbstractC22020a> r11, com.bytedance.retrofit2.client.AbstractC22025a.AbstractC22026a r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.RetrofitUtils.m43279a(java.util.List, java.util.List, java.util.List, com.bytedance.retrofit2.client.a$a, java.lang.String):com.bytedance.retrofit2.q");
    }
}
