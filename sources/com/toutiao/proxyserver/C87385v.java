package com.toutiao.proxyserver;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.C87291ae;
import com.toutiao.proxyserver.C87393w;
import com.toutiao.proxyserver.p4491c.C87299a;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4493e.C87312c;
import com.toutiao.proxyserver.p4495g.C87327a;
import com.toutiao.proxyserver.p4495g.C87328b;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ProxySelector;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.toutiao.proxyserver.v */
public class C87385v {

    /* renamed from: m */
    private static volatile C87385v f198107m;

    /* renamed from: a */
    public volatile ServerSocket f198108a;

    /* renamed from: b */
    public volatile int f198109b;

    /* renamed from: c */
    public final AtomicInteger f198110c = new AtomicInteger(0);

    /* renamed from: d */
    public final ExecutorService f198111d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
        /* class com.toutiao.proxyserver.C87385v.ThreadFactoryC873861 */

        static {
            Covode.recordClassIndex(103283);
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("video-proxyserver-" + thread.getId());
            return thread;
        }
    });

    /* renamed from: e */
    public volatile C87301c f198112e;

    /* renamed from: f */
    public volatile C87331h f198113f;

    /* renamed from: g */
    public volatile C87369r f198114g;

    /* renamed from: h */
    public final SparseArray<Set<C87393w>> f198115h;

    /* renamed from: i */
    public final C87393w.AbstractC87400c f198116i;

    /* renamed from: j */
    volatile long f198117j;

    /* renamed from: k */
    volatile long f198118k;

    /* renamed from: l */
    volatile long f198119l;

    /* renamed from: n */
    private final Runnable f198120n;

    /* renamed from: o */
    private final AtomicBoolean f198121o;

    static {
        Covode.recordClassIndex(103282);
    }

    /* renamed from: b */
    public final void mo141435b() {
        if (this.f198121o.compareAndSet(false, true)) {
            new Thread(this.f198120n).start();
        }
    }

    /* renamed from: a */
    public static C87385v m151666a() {
        MethodCollector.m26663i(13269);
        if (f198107m == null) {
            synchronized (C87385v.class) {
                try {
                    if (f198107m == null) {
                        f198107m = new C87385v();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13269);
                    throw th;
                }
            }
        }
        C87385v vVar = f198107m;
        MethodCollector.m26664o(13269);
        return vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.toutiao.proxyserver.v$a */
    public static final class CallableC87392a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f198136a;

        /* renamed from: b */
        private final int f198137b;

        static {
            Covode.recordClassIndex(103289);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            MethodCollector.m26663i(12959);
            try {
                socket = new Socket(this.f198136a, this.f198137b);
                try {
                    socket.setSoTimeout(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C87328b.f197937a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        C87328b.m151555a(socket);
                        MethodCollector.m26664o(12959);
                        return true;
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                socket = null;
            }
            C87328b.m151555a(socket);
            MethodCollector.m26664o(12959);
            return false;
        }

        CallableC87392a(String str, int i) {
            this.f198136a = str;
            this.f198137b = i;
        }
    }

    private C87385v() {
        SparseArray<Set<C87393w>> sparseArray = new SparseArray<>(2);
        this.f198115h = sparseArray;
        this.f198116i = new C87393w.AbstractC87400c() {
            /* class com.toutiao.proxyserver.C87385v.C873872 */

            static {
                Covode.recordClassIndex(103284);
            }

            @Override // com.toutiao.proxyserver.C87393w.AbstractC87400c
            /* renamed from: a */
            public final void mo141439a(C87393w wVar) {
                MethodCollector.m26663i(10000);
                C87312c.m151523a("TAG_PROXY_ProxyServer", "startExecute, ProxyTask: ".concat(String.valueOf(wVar)), null);
                synchronized (C87385v.this.f198115h) {
                    try {
                        Set<C87393w> set = C87385v.this.f198115h.get(wVar.mo141307g());
                        if (set != null) {
                            set.add(wVar);
                        }
                    } finally {
                        MethodCollector.m26664o(10000);
                    }
                }
            }

            @Override // com.toutiao.proxyserver.C87393w.AbstractC87400c
            /* renamed from: b */
            public final void mo141440b(final C87393w wVar) {
                MethodCollector.m26663i(10002);
                C87312c.m151523a("TAG_PROXY_ProxyServer", "afterExecute, ProxyTask: ".concat(String.valueOf(wVar)), null);
                final int g = wVar.mo141307g();
                synchronized (C87385v.this.f198115h) {
                    try {
                        Set<C87393w> set = C87385v.this.f198115h.get(g);
                        if (set != null) {
                            set.remove(wVar);
                        }
                    } finally {
                        MethodCollector.m26664o(10002);
                    }
                }
                final AbstractC87366o oVar = C87383u.f198087g;
                if (oVar != null) {
                    C87328b.m151562b(new Runnable() {
                        /* class com.toutiao.proxyserver.C87385v.C873872.RunnableC873881 */

                        static {
                            Covode.recordClassIndex(103285);
                        }

                        public final void run() {
                            oVar.mo124034a(wVar.f197789c.get(), 0, wVar.f197790d.get());
                        }
                    });
                }
            }
        };
        this.f198117j = 10000;
        this.f198118k = 10000;
        this.f198119l = 10000;
        this.f198120n = new Runnable() {
            /* class com.toutiao.proxyserver.C87385v.RunnableC873904 */

            static {
                Covode.recordClassIndex(103287);
            }

            public final void run() {
                try {
                    int i = 0;
                    C87385v.this.f198108a = new ServerSocket(0, 50, InetAddress.getByName("127.0.0.1"));
                    C87385v vVar = C87385v.this;
                    vVar.f198109b = vVar.f198108a.getLocalPort();
                    if (C87385v.this.f198109b == -1) {
                        C87385v.this.mo141436c();
                        return;
                    }
                    ProxySelector.setDefault(new C87286aa("127.0.0.1", C87385v.this.f198109b));
                    if (C87385v.this.mo141437d() && C87385v.this.f198110c.compareAndSet(0, 1)) {
                        C87312c.m151524b("TAG_PROXY_ProxyServer", "proxy server start!", null);
                        while (C87385v.this.f198110c.get() == 1) {
                            try {
                                try {
                                    Socket accept = C87385v.this.f198108a.accept();
                                    C87312c.m151524b("TAG_PROXY_ProxyServer", "proxy server new task!", null);
                                    C87301c cVar = C87385v.this.f198112e;
                                    if (cVar != null) {
                                        C87393w.C87398a aVar = new C87393w.C87398a();
                                        aVar.f198156b = cVar;
                                        ExecutorService executorService = C87385v.this.f198111d;
                                        if (executorService != null) {
                                            aVar.f198157c = executorService;
                                            if (accept != null) {
                                                aVar.f198158d = accept;
                                                aVar.f198159e = C87385v.this.f198116i;
                                                if (aVar.f198156b == null || aVar.f198157c == null || aVar.f198158d == null) {
                                                    throw new IllegalArgumentException();
                                                }
                                                C87385v.this.f198111d.execute(new C87393w(aVar));
                                            } else {
                                                throw new IllegalArgumentException("socket == null");
                                            }
                                        } else {
                                            throw new IllegalArgumentException("executor == null");
                                        }
                                    } else {
                                        C87328b.m151555a(accept);
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                    i++;
                                    if (i > 3) {
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                C87312c.m151526d("TAG_PROXY_ProxyServer", "proxy server crashed!  " + C87312c.m151522a(th), null);
                            }
                        }
                        C87312c.m151524b("TAG_PROXY_ProxyServer", "proxy server closed!", null);
                        C87385v.this.mo141436c();
                    }
                } catch (IOException e2) {
                    C87312c.m151526d("TAG_PROXY_ProxyServer", "create ServerSocket error!  " + C87312c.m151522a(e2), null);
                    C87385v.this.mo141436c();
                }
            }
        };
        this.f198121o = new AtomicBoolean();
        sparseArray.put(0, new HashSet());
        sparseArray.put(1, new HashSet());
    }

    /* renamed from: c */
    public final void mo141436c() {
        MethodCollector.m26663i(13272);
        if (this.f198110c.compareAndSet(1, 2) || this.f198110c.compareAndSet(0, 2)) {
            ServerSocket serverSocket = this.f198108a;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (Throwable unused) {
                }
            }
            this.f198111d.shutdownNow();
            ArrayList arrayList = new ArrayList();
            synchronized (this.f198115h) {
                try {
                    int size = this.f198115h.size();
                    for (int i = 0; i < size; i++) {
                        SparseArray<Set<C87393w>> sparseArray = this.f198115h;
                        Set<C87393w> set = sparseArray.get(sparseArray.keyAt(i));
                        if (set != null) {
                            arrayList.addAll(set);
                            set.clear();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(13272);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C87393w) it.next()).mo141290a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[Catch:{ all -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141437d() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C87385v.mo141437d():boolean");
    }

    /* renamed from: a */
    public final void mo141433a(long j) {
        this.f198117j = j;
        this.f198118k = 10000;
        this.f198119l = 10000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo141434a(int i, String str) {
        MethodCollector.m26663i(13268);
        if (str == null) {
            MethodCollector.m26664o(13268);
            return false;
        }
        synchronized (this.f198115h) {
            try {
                Set<C87393w> set = this.f198115h.get(i);
                if (set != null) {
                    for (C87393w wVar : set) {
                        if (wVar != null && str.equals(wVar.f197794h)) {
                            return true;
                        }
                    }
                }
                MethodCollector.m26664o(13268);
                return false;
            } finally {
                MethodCollector.m26664o(13268);
            }
        }
    }

    /* renamed from: a */
    public final String mo141432a(String str, boolean z, String... strArr) {
        AbstractC87294b bVar;
        String a;
        C87299a a2;
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return null;
        }
        if (z) {
            bVar = this.f198114g;
        } else {
            bVar = this.f198113f;
        }
        if (bVar == null || this.f198112e == null) {
            return strArr[0];
        }
        String a3 = C87327a.m151540a(str);
        C87291ae.C87293b.f197857a.mo141327a(str, a3);
        if (C87383u.f198097q) {
            File a4 = bVar.mo98175a(a3);
            if (a4.exists() && a4.isFile() && (a2 = this.f198112e.mo141334a(a3, 0)) != null && a4.length() >= ((long) a2.f197882c)) {
                if (C87383u.f198087g != null) {
                    C87328b.m151562b(new Runnable(str, a2, false) {
                        /* class com.toutiao.proxyserver.C87385v.RunnableC873893 */

                        /* renamed from: a */
                        final /* synthetic */ String f198128a;

                        /* renamed from: b */
                        final /* synthetic */ C87299a f198129b;

                        /* renamed from: c */
                        final /* synthetic */ boolean f198130c = false;

                        static {
                            Covode.recordClassIndex(103286);
                        }

                        public final void run() {
                            C87383u.f198087g.mo124033a();
                            C87383u.f198087g.mo124038a(this.f198128a, this.f198129b.f197882c, this.f198129b.f197882c);
                            C87291ae.C87293b.f197857a.mo141326a(this.f198128a, (long) this.f198129b.f197882c);
                        }

                        {
                            this.f198128a = r3;
                            this.f198129b = r4;
                        }
                    });
                }
                return a4.getAbsolutePath();
            }
        }
        List<String> a5 = C87328b.m151549a(strArr);
        if (this.f198110c.get() != 1 || a5 == null) {
            return strArr[0];
        }
        if (z) {
            a = C87403y.m151696a(str, a3, a5, "music");
        } else {
            a = C87403y.m151696a(str, a3, a5, "");
        }
        if (a == null) {
            return strArr[0];
        }
        return "http://127.0.0.1:" + this.f198109b + "?" + a;
    }
}
