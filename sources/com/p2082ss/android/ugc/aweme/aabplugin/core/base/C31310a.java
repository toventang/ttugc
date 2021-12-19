package com.p2082ss.android.ugc.aweme.aabplugin.core.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.plugin.p1267c.AbstractC18126b;
import com.bytedance.keva.Keva;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.p1543a.C21399b;
import com.bytedance.p1542m.p1543a.C21407e;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.play.core.p1966e.AbstractC27030c;
import com.google.android.play.core.p1966e.C27032e;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31316c;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31318e;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a.C31319f;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31308d;
import com.p2082ss.android.ugc.aweme.aabplugin.core.p2229b.C31309e;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import p077b.C1731i;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a */
public class C31310a implements Handler.Callback {

    /* renamed from: a */
    static volatile boolean f75025a;

    /* renamed from: b */
    static volatile boolean f75026b;

    /* renamed from: c */
    static volatile C31346r f75027c;

    /* renamed from: d */
    static volatile AbstractC88412b f75028d;

    /* renamed from: h */
    private static volatile C31310a f75029h;

    /* renamed from: e */
    final ConcurrentLinkedDeque<AbstractC31339n> f75030e = new ConcurrentLinkedDeque<>();

    /* renamed from: f */
    final Handler f75031f;

    /* renamed from: g */
    volatile AbstractC31339n f75032g;

    /* renamed from: i */
    private final ConcurrentLinkedQueue<AbstractC31339n> f75033i = new ConcurrentLinkedQueue<>();

    /* renamed from: j */
    private final ConcurrentHashMap<String, AbstractC31333m> f75034j = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(38010);
    }

    /* renamed from: b */
    public final void mo57318b() {
        C1731i.m5640b(new CallableC31323c(this), C1731i.f5562a);
    }

    /* renamed from: c */
    public final synchronized void mo57319c() {
        MethodCollector.m26663i(5406);
        this.f75032g = null;
        MethodCollector.m26664o(5406);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a$1 */
    public static /* synthetic */ class C313111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f75035a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 38011(0x947b, float:5.3265E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.ies.ugc.aweme.plugin.b.b[] r0 = com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a.C313111.f75035a = r2
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b.APPEND     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a.C313111.f75035a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b.REPLACE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a.C313111.f75035a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.ies.ugc.aweme.plugin.b.b r0 = com.bytedance.ies.ugc.aweme.plugin.p1266b.EnumC18124b.KEEP     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a.C313111.<clinit>():void");
        }
    }

    private C31310a() {
        HandlerThread handlerThread = new HandlerThread("df_download_thread");
        handlerThread.start();
        this.f75031f = new Handler(handlerThread.getLooper(), this);
        C17873f.m33101i().mo143289d(new C31330j(this));
    }

    /* renamed from: a */
    public static C31310a m65494a() {
        MethodCollector.m26663i(4941);
        if (f75029h == null) {
            synchronized (C31310a.class) {
                try {
                    if (f75029h == null) {
                        f75029h = new C31310a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4941);
                    throw th;
                }
            }
        }
        C31310a aVar = f75029h;
        MethodCollector.m26664o(4941);
        return aVar;
    }

    /* renamed from: d */
    private void m65499d() {
        MethodCollector.m26663i(5525);
        if (!f75025a) {
            synchronized (C31310a.class) {
                try {
                    if (!f75025a) {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        f75027c = new C31346r();
                        m65497b(C17867d.m33078a(), f75027c, intentFilter);
                        f75025a = true;
                        C17873f.m33101i().mo143289d(new C31328h(this));
                    }
                } finally {
                    MethodCollector.m26664o(5525);
                }
            }
            return;
        }
        MethodCollector.m26664o(5525);
    }

    /* renamed from: a */
    public final void mo57313a(AbstractC31339n nVar) {
        C1731i.m5640b(new CallableC31322b(this, nVar), C1731i.f5562a);
    }

    /* renamed from: b */
    public final AbstractC31333m<?> mo57317b(String str) {
        return this.f75034j.get(str);
    }

    /* renamed from: f */
    private void m65500f(AbstractC31339n nVar) {
        if (nVar != null) {
            m65496a(nVar, this.f75033i);
            if (nVar.f75078b.f43118e) {
                m65499d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo57320c(AbstractC31339n nVar) {
        if (nVar != null) {
            nVar.mo57338a();
            C31316c.m65517a(nVar, 2, "retry immediately");
            m65496a(nVar, this.f75030e);
        }
    }

    /* renamed from: b */
    public static void m65498b(AbstractC31339n nVar) {
        int a;
        if (nVar != null) {
            if (nVar instanceof C31308d) {
                Integer num = C31309e.f75024b.get(((C31308d) nVar).mo57312e());
                if (num != null) {
                    a = num.intValue();
                } else {
                    return;
                }
            } else {
                a = C21407e.m40182a().mo35011a(nVar.f75089m);
            }
            if (a != -1) {
                C31316c.m65517a(nVar, 4, "sessionId:".concat(String.valueOf(a)));
                C21399b.m40170b().f50774c.mo44703a(a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ Boolean mo57322e(AbstractC31339n nVar) {
        if (nVar == null) {
            return false;
        }
        C31316c.m65517a(nVar, 0, null);
        Keva repo = Keva.getRepo("dynamic_task_triggered", 0);
        if (repo != null) {
            if (nVar instanceof C31308d) {
                repo.storeString(((C31308d) nVar).mo57312e(), nVar.f75089m);
            } else {
                repo.storeString(nVar.f75088l, nVar.f75089m);
            }
        }
        if (nVar.f75080d == 2) {
            return Boolean.valueOf(mo57321d(nVar));
        }
        m65496a(nVar, this.f75030e);
        mo57318b();
        return false;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1024) {
            Iterator<AbstractC31339n> it = this.f75033i.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC31339n next = it.next();
                if (next.f75085i <= System.currentTimeMillis() && (!next.f75078b.f43118e || NetworkUtils.isWifi(C17867d.m33078a()))) {
                    m65496a(next, this.f75030e);
                    this.f75033i.remove(next);
                    z = true;
                }
            }
            if (z) {
                mo57318b();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo57315a(String str) {
        MethodCollector.m26663i(4986);
        AbstractC31333m<?> b = mo57317b(str);
        if (b != null) {
            b.mo57306c();
            this.f75034j.remove(str);
        }
        MethodCollector.m26664o(4986);
    }

    /* renamed from: d */
    public final synchronized boolean mo57321d(AbstractC31339n nVar) {
        String str;
        MethodCollector.m26663i(5291);
        AbstractC31339n nVar2 = this.f75032g;
        AbstractC31333m<?> b = mo57317b(nVar.f75088l);
        if (b == null) {
            MethodCollector.m26664o(5291);
            return false;
        }
        boolean z = nVar.f75077a;
        int i = 5;
        if (this.f75032g == null || this.f75032g.f75081e == AbstractC31339n.EnumC31342b.UNKNOWN) {
            b.mo57302a(nVar);
            if (!nVar.f75078b.f43118e || NetworkUtils.isWifi(C17867d.m33078a())) {
                C17867d.m33078a();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = C31318e.m65520a();
                }
                if (!C58029j.f132256h) {
                    str = "failed because no network";
                    if (!z) {
                        if (nVar.f75079c == null || nVar.f75079c.f43166i == null) {
                            C31319f.m65521a((int) R.string.dck);
                        } else {
                            C31319f.m65522a(nVar.f75079c.f43166i);
                        }
                    }
                    if (nVar.f75078b.f43115b) {
                        m65499d();
                        mo57320c(nVar);
                    }
                } else if (C17873f.f42636l) {
                    str = "failed because app is background";
                    i = 6;
                    synchronized (C31310a.class) {
                        try {
                            if (!f75026b) {
                                f75028d = C17873f.m33099g().mo143289d(new C31329i(this));
                                f75026b = true;
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(5291);
                            throw th;
                        }
                    }
                    mo57320c(nVar);
                } else {
                    if (this.f75032g != null && nVar.f75080d == 2) {
                        m65498b(this.f75032g);
                    }
                    C31316c.m65517a(nVar, 1, "start to execute");
                    this.f75032g = nVar;
                    C31316c.m65517a(nVar, 5, null);
                    String str2 = nVar.f75089m;
                    AbstractC27030c cVar = C21399b.m40170b().f50774c;
                    if (nVar instanceof C31308d) {
                        Locale locale = ((C31308d) nVar).f75022q;
                        C27032e.C27033a a = C27032e.m53718a();
                        a.f63987b.add(locale);
                        cVar.mo44704a(a.mo44733a()).mo44770a(new C31324d(locale)).mo44769a(new C31325e(this, nVar, str2));
                    } else if (!nVar.mo57311b()) {
                        C27032e.C27033a a2 = C27032e.m53718a().mo44732a(nVar.f75088l);
                        List<String> list = nVar.f75078b.f43122i;
                        if (list != null) {
                            for (String str3 : list) {
                                a2.mo44732a(str3);
                            }
                        }
                        cVar.mo44704a(a2.mo44733a()).mo44770a(new C31326f(str2)).mo44769a(new C31327g(str2));
                    } else if (C21411c.f50800d) {
                        C21411c.f50797a.mo35002a(str2);
                    }
                    MethodCollector.m26664o(5291);
                    return true;
                }
            } else {
                str = "failed because required wifi";
                i = 4;
                if (!z) {
                    if (nVar.f75079c == null || nVar.f75079c.f43165h == null) {
                        C31319f.m65521a((int) R.string.bbq);
                    } else {
                        C31319f.m65522a(nVar.f75079c.f43165h);
                    }
                }
                if (nVar.f75078b.f43115b) {
                    mo57314a(nVar, 0);
                }
            }
        } else {
            str = "Failed because other module is currently executing:" + this.f75032g.f75088l;
            i = 7;
            if (nVar.f75080d == 2) {
                if (nVar.equals(this.f75030e.peek())) {
                    this.f75030e.poll();
                }
                this.f75030e.addFirst(nVar);
                C31316c.m65517a(nVar, 1, str);
                m65498b(this.f75032g);
                MethodCollector.m26664o(5291);
                return true;
            }
            mo57320c(nVar);
        }
        nVar.mo57339a((AbstractC31339n) i, (int) nVar.f75077a);
        C31316c.m65517a(nVar, 1, str);
        MethodCollector.m26664o(5291);
        return false;
    }

    /* renamed from: a */
    private static void m65496a(AbstractC31339n nVar, AbstractCollection<AbstractC31339n> abstractCollection) {
        if (abstractCollection.contains(nVar)) {
            int i = C313111.f75035a[nVar.f75078b.f43120g.ordinal()];
            if (i == 2) {
                abstractCollection.remove(nVar);
            } else if (i == 3) {
                return;
            }
        }
        abstractCollection.add(nVar);
    }

    /* renamed from: a */
    public final void mo57314a(AbstractC31339n nVar, long j) {
        if (nVar != null) {
            nVar.mo57338a();
            if (j == 0) {
                nVar.mo57340a(j);
                m65500f(nVar);
                C31316c.m65517a(nVar, 2, "delay:".concat(String.valueOf(j)));
                return;
            }
            long j2 = nVar.f75084h + j;
            C31316c.m65517a(nVar, 2, "delay:".concat(String.valueOf(j2)));
            if (j2 / j <= 5) {
                nVar.mo57340a(j2);
                m65500f(nVar);
                this.f75031f.sendEmptyMessageDelayed(1024, j2);
                return;
            }
            AbstractC18126b bVar = nVar.f75087k;
            if (bVar != null) {
                bVar.mo28881a();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo57316a(String str, AbstractC31333m mVar) {
        MethodCollector.m26663i(4983);
        if (this.f75034j.get(str) == null) {
            this.f75034j.put(str, mVar);
            mVar.mo57303b();
        }
        MethodCollector.m26664o(4983);
    }

    /* renamed from: a */
    private static Intent m65493a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
    private static android.content.Intent m65497b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m65493a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.aabplugin.core.base.C31310a.m65497b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
