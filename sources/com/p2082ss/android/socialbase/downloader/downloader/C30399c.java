package com.p2082ss.android.socialbase.downloader.downloader;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30337ac;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30345ag;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30365i;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30369k;
import com.p2082ss.android.socialbase.downloader.depend.AbstractC30394z;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30431w;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.impls.AbstractC30474a;
import com.p2082ss.android.socialbase.downloader.impls.C30481b;
import com.p2082ss.android.socialbase.downloader.impls.C30482c;
import com.p2082ss.android.socialbase.downloader.impls.C30483d;
import com.p2082ss.android.socialbase.downloader.impls.C30488e;
import com.p2082ss.android.socialbase.downloader.impls.C30489f;
import com.p2082ss.android.socialbase.downloader.impls.C30491g;
import com.p2082ss.android.socialbase.downloader.impls.C30494h;
import com.p2082ss.android.socialbase.downloader.impls.C30496i;
import com.p2082ss.android.socialbase.downloader.impls.C30497j;
import com.p2082ss.android.socialbase.downloader.impls.C30499l;
import com.p2082ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.model.HttpHeader;
import com.p2082ss.android.socialbase.downloader.p2178a.C30283a;
import com.p2082ss.android.socialbase.downloader.p2179b.C30291e;
import com.p2082ss.android.socialbase.downloader.p2179b.EnumC30290d;
import com.p2082ss.android.socialbase.downloader.p2182e.C30434a;
import com.p2082ss.android.socialbase.downloader.p2183f.AbstractC30440b;
import com.p2082ss.android.socialbase.downloader.p2183f.AbstractC30441c;
import com.p2082ss.android.socialbase.downloader.p2183f.C30439a;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30459f;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30460g;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30461h;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30462i;
import com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30463j;
import com.p2082ss.android.socialbase.downloader.p2187i.C30472a;
import com.p2082ss.android.socialbase.downloader.p2188j.ThreadFactoryC30513a;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90189o;
import okhttp3.C90188n;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.downloader.c */
public class C30399c {

    /* renamed from: A */
    private static volatile ExecutorService f72404A;

    /* renamed from: B */
    private static volatile ExecutorService f72405B;

    /* renamed from: C */
    private static volatile ExecutorService f72406C;

    /* renamed from: D */
    private static volatile ExecutorService f72407D;

    /* renamed from: E */
    private static volatile ExecutorService f72408E;

    /* renamed from: F */
    private static volatile AbstractC30415i f72409F;

    /* renamed from: G */
    private static volatile C30407e f72410G;

    /* renamed from: H */
    private static volatile AbstractC30429u f72411H;

    /* renamed from: I */
    private static volatile AbstractC30427s f72412I;

    /* renamed from: J */
    private static volatile AbstractC30394z f72413J;

    /* renamed from: K */
    private static volatile boolean f72414K = false;

    /* renamed from: L */
    private static volatile C90208y f72415L = null;

    /* renamed from: M */
    private static volatile AbstractC30459f f72416M;

    /* renamed from: N */
    private static volatile AbstractC30431w f72417N;

    /* renamed from: O */
    private static final List<AbstractC30369k> f72418O = new ArrayList();

    /* renamed from: P */
    private static boolean f72419P = false;

    /* renamed from: Q */
    private static int f72420Q;

    /* renamed from: R */
    private static final int f72421R;

    /* renamed from: S */
    private static final int f72422S = ((Runtime.getRuntime().availableProcessors() * 2) + 1);

    /* renamed from: T */
    private static final int f72423T;

    /* renamed from: U */
    private static final int f72424U;

    /* renamed from: V */
    private static int f72425V = 8192;

    /* renamed from: W */
    private static boolean f72426W;

    /* renamed from: X */
    private static boolean f72427X = false;

    /* renamed from: Y */
    private static AbstractC30441c f72428Y;

    /* renamed from: a */
    public static volatile AbstractC30337ac f72429a;

    /* renamed from: b */
    public static volatile AbstractC30403a f72430b;

    /* renamed from: c */
    public static volatile AbstractC30440b f72431c;

    /* renamed from: d */
    public static volatile List<AbstractC30345ag> f72432d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public static volatile AbstractC30459f f72433e;

    /* renamed from: f */
    static final List<AbstractC30365i> f72434f = new ArrayList();

    /* renamed from: g */
    public static final List<Object> f72435g = new ArrayList();

    /* renamed from: h */
    public static int f72436h;

    /* renamed from: i */
    static boolean f72437i = true;

    /* renamed from: j */
    static AbstractC30428t f72438j;

    /* renamed from: k */
    static volatile boolean f72439k = false;

    /* renamed from: l */
    private static volatile Context f72440l;

    /* renamed from: m */
    private static volatile AbstractC30420l f72441m;

    /* renamed from: n */
    private static volatile AbstractC30421m f72442n;

    /* renamed from: o */
    private static volatile AbstractC30416j f72443o;

    /* renamed from: p */
    private static volatile AbstractC30474a f72444p;

    /* renamed from: q */
    private static volatile AbstractC30425q f72445q;

    /* renamed from: r */
    private static volatile AbstractC30425q f72446r;

    /* renamed from: s */
    private static volatile AbstractC30463j f72447s;

    /* renamed from: t */
    private static volatile AbstractC30461h f72448t;

    /* renamed from: u */
    private static volatile AbstractC30463j f72449u;

    /* renamed from: v */
    private static volatile AbstractC30461h f72450v;

    /* renamed from: w */
    private static volatile AbstractC30422n f72451w;

    /* renamed from: x */
    private static volatile ExecutorService f72452x;

    /* renamed from: y */
    private static volatile ExecutorService f72453y;

    /* renamed from: z */
    private static volatile ExecutorService f72454z;

    /* renamed from: com.ss.android.socialbase.downloader.downloader.c$a */
    public interface AbstractC30403a {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.c$a$a */
        public interface AbstractC30404a {
            static {
                Covode.recordClassIndex(36923);
            }

            /* renamed from: a */
            void mo54048a();
        }

        static {
            Covode.recordClassIndex(36922);
        }

        /* renamed from: a */
        AbstractC30425q mo54045a();

        /* renamed from: a */
        AbstractC30430v mo54046a(AbstractC30404a aVar);

        /* renamed from: b */
        AbstractC30423o mo54047b();
    }

    private C30399c() {
    }

    /* renamed from: a */
    static synchronized void m61692a(C30414h hVar) {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(9909);
            if (f72439k) {
                C30434a.m62030e("DownloadComponentManager", "component has init");
                MethodCollector.m26664o(9909);
                return;
            }
            boolean z = f72414K;
            m61712c(hVar);
            if (f72441m == null) {
                f72441m = new C30483d();
            }
            if (f72445q == null) {
                f72445q = new C30494h();
            }
            if (f72446r == null && f72430b != null) {
                f72446r = f72430b.mo54045a();
            }
            if (f72442n == null) {
                f72442n = new C30496i();
            }
            if (f72444p == null) {
                f72444p = new C30488e();
            }
            if (f72443o == null) {
                f72443o = new C30482c();
            }
            if (f72409F == null) {
                f72409F = new C30481b();
            }
            if (f72411H == null) {
                f72411H = new C30497j();
            }
            int i = f72420Q;
            if (i <= 0 || i > f72421R) {
                f72420Q = f72421R;
            }
            if (f72410G == null) {
                f72410G = new C30407e();
            }
            if (!f72419P) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    m61705b(f72440l, f72410G, intentFilter);
                    f72419P = true;
                } catch (Throwable unused) {
                }
            }
            if (f72414K && !z && !C30535g.m62594c()) {
                C30499l.m62246a(true).mo54184e();
            } else if (C30535g.m62599d()) {
                ExecutorService g = f72453y != null ? f72453y : m61721g();
                if (g != null) {
                    g.execute(new Runnable() {
                        /* class com.p2082ss.android.socialbase.downloader.downloader.C30399c.RunnableC304001 */

                        static {
                            Covode.recordClassIndex(36919);
                        }

                        public final void run() {
                            Context B = C30399c.m61674B();
                            if (B != null) {
                                C30535g.m62589c(B);
                            }
                        }
                    });
                }
            } else {
                Context B = m61674B();
                if (B != null) {
                    C30535g.m62589c(B);
                }
            }
            if (TextUtils.isEmpty(C30291e.f72263c)) {
                C30291e.f72263c = "oppo";
                C30291e.f72262b = "oppo".toUpperCase();
            }
            f72439k = true;
            MethodCollector.m26664o(9909);
        }
    }

    /* renamed from: a */
    public static void m61689a(EnumC30290d dVar) {
        MethodCollector.m26663i(6626);
        List<AbstractC30365i> list = f72434f;
        synchronized (list) {
            try {
                Iterator<AbstractC30365i> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (dVar == EnumC30290d.SYNC_SUCCESS) {
                    f72434f.clear();
                }
            } finally {
                MethodCollector.m26664o(6626);
            }
        }
    }

    /* renamed from: a */
    private static int[] m61704a(int i) {
        if (i == 1) {
            return new int[]{0};
        } else if (i != 2) {
            return i != 3 ? new int[]{1, 0} : new int[]{0, 1};
        } else {
            return new int[]{1};
        }
    }

    /* renamed from: a */
    private static synchronized void m61697a(AbstractC30422n nVar) {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(6919);
            if (nVar != null) {
                f72451w = nVar;
                if (f72441m instanceof C30483d) {
                    ((C30483d) f72441m).mo54308a();
                }
            }
            MethodCollector.m26664o(6919);
        }
    }

    /* renamed from: a */
    private static void m61703a(ExecutorService executorService) {
        if (executorService != null) {
            f72452x = executorService;
        }
    }

    /* renamed from: a */
    private static void m61702a(List<AbstractC30369k> list) {
        MethodCollector.m26663i(7361);
        List<AbstractC30369k> list2 = f72418O;
        if (list2.isEmpty()) {
            synchronized (list2) {
                try {
                    list2.addAll(list);
                } finally {
                    MethodCollector.m26664o(7361);
                }
            }
            return;
        }
        MethodCollector.m26664o(7361);
    }

    /* renamed from: a */
    public static void m61701a(Runnable runnable) {
        m61721g().execute(runnable);
    }

    /* renamed from: a */
    private static void m61700a(AbstractC30463j jVar) {
        if (jVar != null) {
            f72447s = jVar;
        }
        f72426W = f72447s != null;
    }

    /* renamed from: a */
    private static void m61699a(AbstractC30461h hVar) {
        if (hVar != null) {
            f72448t = hVar;
        }
    }

    /* renamed from: a */
    private static void m61695a(AbstractC30420l lVar) {
        if (lVar != null) {
            f72441m = lVar;
        }
    }

    /* renamed from: a */
    private static void m61696a(AbstractC30421m mVar) {
        if (mVar != null) {
            f72442n = mVar;
        }
    }

    /* renamed from: a */
    private static void m61698a(AbstractC30440b bVar) {
        if (bVar != null) {
            f72431c = bVar;
        }
    }

    /* renamed from: a */
    private static void m61694a(AbstractC30416j jVar) {
        if (jVar != null) {
            f72443o = jVar;
        }
    }

    /* renamed from: a */
    private static void m61693a(AbstractC30415i iVar) {
        if (iVar != null) {
            f72409F = iVar;
        }
    }

    /* renamed from: a */
    public static synchronized void m61688a(Context context) {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(10719);
            if (context != null && f72440l == null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f72440l = applicationContext;
                C30283a aVar = C30283a.C30286b.f72251a;
                Context context2 = f72440l;
                if (aVar.f72243a == null && (context2 instanceof Application)) {
                    synchronized (aVar) {
                        try {
                            if (aVar.f72243a == null) {
                                aVar.f72243a = (Application) context2;
                                aVar.f72243a.registerActivityLifecycleCallbacks(aVar.f72249g);
                            }
                        } finally {
                            MethodCollector.m26664o(10719);
                        }
                    }
                    return;
                }
            }
            MethodCollector.m26664o(10719);
        }
    }

    /* renamed from: a */
    public static void m61691a(AbstractC30403a aVar) {
        C30434a.m62024a("wjd", "setIndependentServiceCreator::creator=".concat(String.valueOf(aVar)));
        f72430b = aVar;
    }

    /* renamed from: D */
    public static AbstractC30441c m61676D() {
        if (f72428Y == null) {
            f72428Y = new AbstractC30441c() {
                /* class com.p2082ss.android.socialbase.downloader.downloader.C30399c.C304023 */

                static {
                    Covode.recordClassIndex(36921);
                }
            };
        }
        return f72428Y;
    }

    /* renamed from: e */
    public static boolean m61718e() {
        if (C30472a.f72639a.mo54258a("switch_not_auto_boot_service", f72427X ? 1 : 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static ExecutorService m61723h() {
        if (f72404A != null) {
            return f72404A;
        }
        return m61726j();
    }

    /* renamed from: i */
    public static ExecutorService m61725i() {
        if (f72405B != null) {
            return f72405B;
        }
        return m61726j();
    }

    /* renamed from: B */
    public static synchronized Context m61674B() {
        Context context;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(10579);
            context = f72440l;
            MethodCollector.m26664o(10579);
        }
        return context;
    }

    /* renamed from: C */
    public static synchronized boolean m61675C() {
        boolean z;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(10873);
            z = f72426W;
            MethodCollector.m26664o(10873);
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized boolean m61714c() {
        boolean z;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(6624);
            z = f72414K;
            MethodCollector.m26664o(6624);
        }
        return z;
    }

    /* renamed from: f */
    public static synchronized AbstractC30427s m61719f() {
        AbstractC30427s sVar;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(7376);
            sVar = f72412I;
            MethodCollector.m26664o(7376);
        }
        return sVar;
    }

    /* renamed from: p */
    public static synchronized AbstractC30422n m61732p() {
        AbstractC30422n nVar;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(9208);
            nVar = f72451w;
            MethodCollector.m26664o(9208);
        }
        return nVar;
    }

    /* renamed from: v */
    public static JSONObject m61738v() {
        if (f72413J == null || f72413J.mo53958a() == null) {
            return C30291e.f72269i;
        }
        return f72413J.mo53958a();
    }

    /* renamed from: w */
    public static synchronized int m61739w() {
        int i;
        synchronized (C30399c.class) {
            MethodCollector.m26663i(9944);
            i = f72425V;
            MethodCollector.m26664o(9944);
        }
        return i;
    }

    /* renamed from: A */
    public static AbstractC30431w m61673A() {
        MethodCollector.m26663i(10413);
        if (f72417N == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72417N == null) {
                        f72417N = new AbstractC30431w.C30432a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10413);
                    throw th;
                }
            }
        }
        AbstractC30431w wVar = f72417N;
        MethodCollector.m26664o(10413);
        return wVar;
    }

    /* renamed from: E */
    public static boolean m61677E() {
        boolean z;
        StringBuilder sb = new StringBuilder("supportMultiProc::=");
        if (f72430b != null) {
            z = true;
        } else {
            z = false;
        }
        C30434a.m62024a("wjd", sb.append(z).toString());
        if (f72430b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private static AbstractC30463j m61678F() {
        MethodCollector.m26663i(6636);
        if (f72449u == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72449u == null) {
                        f72449u = new C30491g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6636);
                    throw th;
                }
            }
        }
        AbstractC30463j jVar = f72449u;
        MethodCollector.m26664o(6636);
        return jVar;
    }

    /* renamed from: G */
    private static AbstractC30461h m61679G() {
        MethodCollector.m26663i(6767);
        if (f72450v == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72450v == null) {
                        f72450v = new C30489f();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6767);
                    throw th;
                }
            }
        }
        AbstractC30461h hVar = f72450v;
        MethodCollector.m26664o(6767);
        return hVar;
    }

    /* renamed from: d */
    public static void m61715d() {
        MethodCollector.m26663i(6628);
        List<Object> list = f72435g;
        synchronized (list) {
            try {
                Iterator<Object> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                MethodCollector.m26664o(6628);
            }
        }
    }

    /* renamed from: g */
    public static ExecutorService m61721g() {
        MethodCollector.m26663i(7711);
        if (f72452x == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72452x == null) {
                        int i = f72421R;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("DownloadThreadPool-cpu-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        f72452x = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7711);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f72452x;
        MethodCollector.m26664o(7711);
        return executorService;
    }

    /* renamed from: j */
    public static ExecutorService m61726j() {
        MethodCollector.m26663i(8596);
        if (f72454z == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72454z == null) {
                        int i = f72423T;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("DownloadThreadPool-mix-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        f72454z = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8596);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f72454z;
        MethodCollector.m26664o(8596);
        return executorService;
    }

    /* renamed from: k */
    public static ExecutorService m61727k() {
        MethodCollector.m26663i(8748);
        if (f72407D == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72407D == null) {
                        int i = f72422S;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("DownloadThreadPool-chunk-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        f72407D = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8748);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f72407D;
        MethodCollector.m26664o(8748);
        return executorService;
    }

    /* renamed from: l */
    public static ExecutorService m61728l() {
        MethodCollector.m26663i(8749);
        if (f72406C == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72406C == null) {
                        int i = f72424U;
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC30513a("DownloadThreadPool-db-fixed", true));
                        try {
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                        } catch (Throwable unused) {
                        }
                        f72406C = threadPoolExecutor;
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8749);
                    throw th;
                }
            }
        }
        ExecutorService executorService = f72406C;
        MethodCollector.m26664o(8749);
        return executorService;
    }

    /* renamed from: m */
    public static C90208y m61729m() {
        MethodCollector.m26663i(8890);
        if (f72415L == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72415L == null) {
                        f72415L = m61730n().mo145103d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8890);
                    throw th;
                }
            }
        }
        C90208y yVar = f72415L;
        MethodCollector.m26664o(8890);
        return yVar;
    }

    /* renamed from: n */
    public static C90208y.C90210a m61730n() {
        C90208y.C90210a aVar = new C90208y.C90210a();
        C90208y.C90210a c = aVar.mo145088a(30000, TimeUnit.MILLISECONDS).mo145098b(30000, TimeUnit.MILLISECONDS).mo145102c(30000, TimeUnit.MILLISECONDS);
        c.f204953w = true;
        c.f204952v = true;
        c.mo145089a(Collections.singletonList(EnumC90211z.HTTP_1_1));
        if (f72408E != null) {
            aVar.f204931a = new C90188n(f72408E);
        }
        return aVar;
    }

    /* renamed from: o */
    public static AbstractC30459f m61731o() {
        MethodCollector.m26663i(9054);
        if (f72416M == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72416M == null) {
                        f72416M = new AbstractC30459f() {
                            /* class com.p2082ss.android.socialbase.downloader.downloader.C30399c.C304012 */

                            static {
                                Covode.recordClassIndex(36920);
                            }

                            @Override // com.p2082ss.android.socialbase.downloader.p2184g.AbstractC30459f
                            /* renamed from: a */
                            public final List<InetAddress> mo54044a(String str) {
                                return AbstractC90189o.f204843d.mo23717a(str);
                            }
                        };
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9054);
                    throw th;
                }
            }
        }
        AbstractC30459f fVar = f72416M;
        MethodCollector.m26664o(9054);
        return fVar;
    }

    /* renamed from: q */
    public static AbstractC30420l m61733q() {
        MethodCollector.m26663i(9209);
        if (f72441m == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72441m == null) {
                        f72441m = new C30483d();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9209);
                    throw th;
                }
            }
        }
        AbstractC30420l lVar = f72441m;
        MethodCollector.m26664o(9209);
        return lVar;
    }

    /* renamed from: r */
    public static AbstractC30425q m61734r() {
        MethodCollector.m26663i(9356);
        if (f72445q == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72445q == null) {
                        f72445q = new C30494h();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9356);
                    throw th;
                }
            }
        }
        AbstractC30425q qVar = f72445q;
        MethodCollector.m26664o(9356);
        return qVar;
    }

    /* renamed from: s */
    public static AbstractC30425q m61735s() {
        MethodCollector.m26663i(9502);
        if (f72446r == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72446r == null) {
                        f72446r = f72430b.mo54045a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9502);
                    throw th;
                }
            }
        }
        AbstractC30425q qVar = f72446r;
        MethodCollector.m26664o(9502);
        return qVar;
    }

    /* renamed from: t */
    public static AbstractC30421m m61736t() {
        MethodCollector.m26663i(9653);
        if (f72442n == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72442n == null) {
                        f72442n = new C30496i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9653);
                    throw th;
                }
            }
        }
        AbstractC30421m mVar = f72442n;
        MethodCollector.m26664o(9653);
        return mVar;
    }

    /* renamed from: u */
    public static AbstractC30474a m61737u() {
        MethodCollector.m26663i(9800);
        if (f72444p == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72444p == null) {
                        f72444p = new C30488e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9800);
                    throw th;
                }
            }
        }
        AbstractC30474a aVar = f72444p;
        MethodCollector.m26664o(9800);
        return aVar;
    }

    /* renamed from: x */
    public static AbstractC30416j m61740x() {
        MethodCollector.m26663i(10099);
        if (f72443o == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72443o == null) {
                        f72443o = new C30482c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10099);
                    throw th;
                }
            }
        }
        AbstractC30416j jVar = f72443o;
        MethodCollector.m26664o(10099);
        return jVar;
    }

    /* renamed from: y */
    public static AbstractC30415i m61741y() {
        MethodCollector.m26663i(10257);
        if (f72409F == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72409F == null) {
                        f72409F = new C30481b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10257);
                    throw th;
                }
            }
        }
        AbstractC30415i iVar = f72409F;
        MethodCollector.m26664o(10257);
        return iVar;
    }

    /* renamed from: z */
    public static AbstractC30429u m61742z() {
        MethodCollector.m26663i(10259);
        if (f72411H == null) {
            synchronized (C30399c.class) {
                try {
                    if (f72411H == null) {
                        f72411H = new C30497j();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10259);
                    throw th;
                }
            }
        }
        AbstractC30429u uVar = f72411H;
        MethodCollector.m26664o(10259);
        return uVar;
    }

    static {
        Covode.recordClassIndex(36918);
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        f72421R = availableProcessors;
        f72423T = availableProcessors;
        f72424U = availableProcessors;
    }

    /* renamed from: b */
    public static synchronized void m61707b() {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(6322);
            if (f72414K) {
                MethodCollector.m26664o(6322);
                return;
            }
            f72414K = true;
            try {
                Intent intent = new Intent(m61674B(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                m61682a(m61674B(), intent);
                if (!C30535g.m62594c()) {
                    C30499l.m62246a(true).mo54184e();
                }
                MethodCollector.m26664o(6322);
            } catch (Throwable unused) {
                f72414K = false;
                MethodCollector.m26664o(6322);
            }
        }
    }

    /* renamed from: a */
    static synchronized void m61687a() {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(6009);
            try {
                if (!(!f72419P || f72410G == null || f72440l == null)) {
                    f72440l.unregisterReceiver(f72410G);
                    f72419P = false;
                }
                MethodCollector.m26664o(6009);
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(6009);
            }
        }
    }

    /* renamed from: a */
    private static void m61690a(AbstractC30337ac acVar) {
        if (acVar != null) {
            f72429a = acVar;
        }
    }

    /* renamed from: b */
    private static void m61708b(int i) {
        if (i > 0) {
            f72420Q = i;
        }
    }

    /* renamed from: c */
    private static void m61713c(ExecutorService executorService) {
        if (executorService != null) {
            f72454z = executorService;
        }
    }

    /* renamed from: d */
    private static void m61716d(ExecutorService executorService) {
        if (executorService != null) {
            f72404A = executorService;
        }
    }

    /* renamed from: e */
    private static void m61717e(ExecutorService executorService) {
        if (executorService != null) {
            f72405B = executorService;
        }
    }

    /* renamed from: f */
    private static void m61720f(ExecutorService executorService) {
        if (executorService != null) {
            f72406C = executorService;
        }
    }

    /* renamed from: g */
    private static void m61722g(ExecutorService executorService) {
        if (executorService != null) {
            f72407D = executorService;
        }
    }

    /* renamed from: h */
    private static void m61724h(ExecutorService executorService) {
        if (executorService != null) {
            f72408E = executorService;
        }
    }

    /* renamed from: b */
    private static void m61711b(ExecutorService executorService) {
        if (executorService != null) {
            f72453y = executorService;
        }
    }

    /* renamed from: a */
    public static int m61680a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return m61681a(taskKey, downloadInfo.getSavePath());
    }

    /* renamed from: b */
    static synchronized void m61709b(C30414h hVar) {
        synchronized (C30399c.class) {
            MethodCollector.m26663i(10233);
            m61712c(hVar);
            MethodCollector.m26664o(10233);
        }
    }

    /* renamed from: b */
    public static void m61710b(Runnable runnable) {
        if (!C30535g.m62599d()) {
            runnable.run();
        } else {
            m61728l().execute(runnable);
        }
    }

    /* renamed from: c */
    private static void m61712c(C30414h hVar) {
        if (hVar != null) {
            if (hVar.f72519a != null) {
                m61688a(hVar.f72519a);
            }
            if (hVar.f72520b != null) {
                m61695a(hVar.f72520b);
            }
            if (hVar.f72521c != null) {
                m61696a(hVar.f72521c);
            }
            if (hVar.f72522d != null) {
                m61694a(hVar.f72522d);
            }
            if (hVar.f72523e != null) {
                m61690a(hVar.f72523e);
            }
            if (hVar.f72542x != 0) {
                m61708b(hVar.f72542x);
            }
            if (hVar.f72524f != null) {
                m61700a(hVar.f72524f);
            }
            if (hVar.f72525g != null) {
                m61699a(hVar.f72525g);
            }
            if (hVar.f72527i != null) {
                m61697a(hVar.f72527i);
            }
            if (hVar.f72533o != null) {
                m61703a(hVar.f72533o);
            }
            if (hVar.f72534p != null) {
                m61711b(hVar.f72534p);
            }
            if (hVar.f72535q != null) {
                m61713c(hVar.f72535q);
            }
            if (hVar.f72536r != null) {
                m61716d(hVar.f72536r);
            }
            if (hVar.f72537s != null) {
                m61717e(hVar.f72537s);
            }
            if (hVar.f72538t != null) {
                m61720f(hVar.f72538t);
            }
            if (hVar.f72539u != null) {
                m61722g(hVar.f72539u);
            }
            if (hVar.f72540v != null) {
                m61724h(hVar.f72540v);
            }
            if (!hVar.f72531m.isEmpty()) {
                m61702a(hVar.f72531m);
            }
            if (hVar.f72529k != null) {
                f72412I = hVar.f72529k;
            }
            if (hVar.f72543y > 1024) {
                f72425V = hVar.f72543y;
            }
            if (hVar.f72528j != null) {
                m61693a(hVar.f72528j);
            }
            if (hVar.f72544z) {
                f72414K = true;
            }
            if (hVar.f72518B != 0) {
                f72436h = hVar.f72518B;
            }
            if (hVar.f72532n != null) {
                f72413J = hVar.f72532n;
                C30472a.m62089a();
            }
            if (hVar.f72526h != null) {
                f72433e = hVar.f72526h;
            }
            if (hVar.f72541w != null) {
                f72417N = hVar.f72541w;
                m61700a(m61678F());
                m61699a(m61679G());
            }
            f72437i = hVar.f72517A;
            if (hVar.f72530l != null) {
                m61698a(hVar.f72530l);
            }
        }
    }

    /* renamed from: a */
    public static int m61681a(String str, String str2) {
        AbstractC30421m t = m61736t();
        if (t == null) {
            return 0;
        }
        return t.mo54141a(str, str2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName m61682a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61682a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* renamed from: a */
    private static Intent m61683a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m61705b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m61683a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.socialbase.downloader.downloader.C30399c.m61705b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    /* renamed from: b */
    private static AbstractC30460g m61706b(String str, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) {
        AbstractC30461h G;
        Throwable th;
        if (i == 1) {
            G = f72448t;
        } else {
            G = m61679G();
        }
        if (G != null) {
            IOException e = null;
            long j = 0;
            if (z) {
                try {
                    j = System.currentTimeMillis();
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        C30439a.m62036a(null, str, null, System.currentTimeMillis() - j, "head", i, e, downloadInfo);
                    }
                    throw th;
                }
            }
            try {
                AbstractC30460g a = G.mo54249a(str, list);
                if (z) {
                    C30439a.m62036a(a, str, null, System.currentTimeMillis() - j, "head", i, null, downloadInfo);
                }
                return a;
            } catch (IOException e3) {
                e = e3;
                try {
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } else {
            throw new BaseException(1022, new IOException("httpService not exist, netLib = ".concat(String.valueOf(i))));
        }
    }

    /* renamed from: a */
    public static AbstractC30460g m61684a(String str, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) {
        Exception e = null;
        for (int i2 : m61704a(i)) {
            try {
                AbstractC30460g b = m61706b(str, list, i2, z, downloadInfo);
                if (b != null) {
                    return b;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }

    /* renamed from: a */
    private static AbstractC30462i m61685a(String str, String str2, List<HttpHeader> list, int i, boolean z, DownloadInfo downloadInfo) {
        AbstractC30463j F;
        Throwable th;
        if (i == 1) {
            F = f72447s;
        } else {
            F = m61678F();
        }
        if (F != null) {
            IOException e = null;
            long j = 0;
            if (z) {
                try {
                    j = System.currentTimeMillis();
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    if (z) {
                        C30439a.m62036a(null, str, str2, System.currentTimeMillis() - j, "get", i, e, downloadInfo);
                    }
                    throw th;
                }
            }
            try {
                AbstractC30462i a = F.mo54250a(str, list);
                if (z) {
                    C30439a.m62036a(a, str, str2, System.currentTimeMillis() - j, "get", i, null, downloadInfo);
                }
                return a;
            } catch (IOException e3) {
                e = e3;
                try {
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } else {
            throw new BaseException(1022, new IOException("httpService not exist, netLib = ".concat(String.valueOf(i))));
        }
    }

    /* renamed from: a */
    public static AbstractC30462i m61686a(boolean z, String str, String str2, List<HttpHeader> list, int i, boolean z2, DownloadInfo downloadInfo) {
        if (!TextUtils.isEmpty(str2)) {
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(new HttpHeader("ss_d_request_host_ip_114", str2));
            i = 1;
        } else if (!z) {
            i = 2;
        }
        Exception e = null;
        for (int i2 : m61704a(i)) {
            try {
                AbstractC30462i a = m61685a(str, str2, list, i2, z2, downloadInfo);
                if (a != null) {
                    return a;
                }
            } catch (Exception e2) {
                e = e2;
                if (downloadInfo.isExpiredRedownload()) {
                    m61673A();
                }
            }
        }
        if (e == null) {
            return null;
        }
        throw e;
    }
}
