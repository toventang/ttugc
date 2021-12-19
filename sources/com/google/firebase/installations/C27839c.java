package com.google.firebase.installations;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25622ac;
import com.google.android.gms.p1940d.C25632i;
import com.google.firebase.C27695b;
import com.google.firebase.installations.C27846h;
import com.google.firebase.installations.p2016a.AbstractC27825d;
import com.google.firebase.installations.p2016a.C27822b;
import com.google.firebase.installations.p2016a.C27823c;
import com.google.firebase.installations.p2017b.AbstractC27833d;
import com.google.firebase.installations.p2017b.AbstractC27836e;
import com.google.firebase.installations.p2017b.C27832c;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.installations.c */
public final class C27839c implements AbstractC27845g {

    /* renamed from: l */
    private static final Object f65399l = new Object();

    /* renamed from: m */
    private static final ThreadFactory f65400m = new ThreadFactory() {
        /* class com.google.firebase.installations.C27839c.ThreadFactoryC278401 */

        /* renamed from: a */
        private final AtomicInteger f65412a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(33429);
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, C1764a.m5928a("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f65412a.getAndIncrement())}));
        }
    };

    /* renamed from: a */
    final ExecutorService f65401a;

    /* renamed from: b */
    private final C27695b f65402b;

    /* renamed from: c */
    private final C27832c f65403c;

    /* renamed from: d */
    private final C27823c f65404d;

    /* renamed from: e */
    private final C27854n f65405e;

    /* renamed from: f */
    private final C27822b f65406f;

    /* renamed from: g */
    private final C27852l f65407g;

    /* renamed from: h */
    private final Object f65408h;

    /* renamed from: i */
    private final ExecutorService f65409i;

    /* renamed from: j */
    private String f65410j;

    /* renamed from: k */
    private final List<AbstractC27853m> f65411k;

    /* renamed from: e */
    private String m55728e() {
        return this.f65402b.mo46327c().f65184g;
    }

    /* renamed from: f */
    private String m55729f() {
        return this.f65402b.mo46327c().f65179b;
    }

    /* renamed from: g */
    private String m55730g() {
        return this.f65402b.mo46327c().f65178a;
    }

    static {
        Covode.recordClassIndex(33428);
    }

    /* renamed from: i */
    private String m55732i() {
        String str = this.f65410j;
        if (str != null) {
            return str;
        }
        AbstractC27825d c = mo46543c();
        this.f65401a.execute(RunnableC27843e.m55739a(this));
        return c.mo46484a();
    }

    @Override // com.google.firebase.installations.AbstractC27845g
    /* renamed from: a */
    public final AbstractC25631h<String> mo46539a() {
        m55727d();
        C25632i iVar = new C25632i();
        iVar.mo41896b(m55732i());
        return iVar.f60753a;
    }

    @Override // com.google.firebase.installations.AbstractC27845g
    /* renamed from: b */
    public final AbstractC25631h<AbstractC27850k> mo46542b() {
        m55727d();
        AbstractC25631h<AbstractC27850k> h = m55731h();
        this.f65409i.execute(new RunnableC27842d(this));
        return h;
    }

    /* renamed from: d */
    private void m55727d() {
        C25565r.m49316a(m55729f());
        C25565r.m49316a(m55728e());
        C25565r.m49316a(m55730g());
        C25565r.m49325b(m55729f().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C25565r.m49325b(C27854n.f65428b.matcher(m55730g()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: h */
    private AbstractC25631h<AbstractC27850k> m55731h() {
        MethodCollector.m26663i(4244);
        C25632i iVar = new C25632i();
        C27849j jVar = new C27849j(this.f65405e, iVar);
        synchronized (this.f65408h) {
            try {
                this.f65411k.add(jVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(4244);
                throw th;
            }
        }
        C25622ac<TResult> acVar = iVar.f60753a;
        MethodCollector.m26664o(4244);
        return acVar;
    }

    /* renamed from: j */
    private AbstractC27825d m55733j() {
        AbstractC27825d a;
        MethodCollector.m26663i(2665);
        synchronized (f65399l) {
            try {
                C27827b a2 = C27827b.m55671a(this.f65402b.mo46324a(), "generatefid.lock");
                try {
                    a = this.f65404d.mo46505a();
                    if (a2 != null) {
                        a2.mo46512a();
                    }
                } catch (Throwable th) {
                    if (a2 != null) {
                        a2.mo46512a();
                    }
                    MethodCollector.m26664o(2665);
                    throw th;
                }
            } finally {
                MethodCollector.m26664o(2665);
            }
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.c$2 */
    public static /* synthetic */ class C278412 {

        /* renamed from: a */
        static final /* synthetic */ int[] f65413a;

        /* renamed from: b */
        static final /* synthetic */ int[] f65414b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|7|8|9|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0023 */
        static {
            /*
                r0 = 33430(0x8296, float:4.6845E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.firebase.installations.b.e$b[] r0 = com.google.firebase.installations.p2017b.AbstractC27836e.EnumC27838b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.google.firebase.installations.C27839c.C278412.f65414b = r1
                r4 = 1
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.p2017b.AbstractC27836e.EnumC27838b.OK     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                r3 = 2
                int[] r1 = com.google.firebase.installations.C27839c.C278412.f65414b     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.p2017b.AbstractC27836e.EnumC27838b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.google.firebase.installations.C27839c.C278412.f65414b     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.firebase.installations.b.e$b r0 = com.google.firebase.installations.p2017b.AbstractC27836e.EnumC27838b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.google.firebase.installations.b.d$b[] r0 = com.google.firebase.installations.p2017b.AbstractC27833d.EnumC27835b.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.google.firebase.installations.C27839c.C278412.f65413a = r1
                com.google.firebase.installations.b.d$b r0 = com.google.firebase.installations.p2017b.AbstractC27833d.EnumC27835b.OK     // Catch:{ NoSuchFieldError -> 0x003f }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r1[r0] = r4     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r1 = com.google.firebase.installations.C27839c.C278412.f65413a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.firebase.installations.b.d$b r0 = com.google.firebase.installations.p2017b.AbstractC27833d.EnumC27835b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C27839c.C278412.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC27825d mo46543c() {
        AbstractC27825d a;
        String a2;
        MethodCollector.m26663i(2655);
        synchronized (f65399l) {
            try {
                C27827b a3 = C27827b.m55671a(this.f65402b.mo46324a(), "generatefid.lock");
                try {
                    a = this.f65404d.mo46505a();
                    if (a.mo46511l()) {
                        if ((this.f65402b.mo46326b().equals("CHIME_ANDROID_SDK") || this.f65402b.mo46330f()) && a.mo46485b() == C27823c.EnumC27824a.ATTEMPT_MIGRATION) {
                            a2 = this.f65406f.mo46504b();
                            if (TextUtils.isEmpty(a2)) {
                                a2 = C27852l.m55752a();
                            }
                        } else {
                            a2 = C27852l.m55752a();
                        }
                        a = this.f65404d.mo46506a(a.mo46492h().mo46497a(a2).mo46496a(C27823c.EnumC27824a.UNREGISTERED).mo46498a());
                    }
                    if (a3 != null) {
                        a3.mo46512a();
                    }
                } catch (Throwable th) {
                    if (a3 != null) {
                        a3.mo46512a();
                    }
                    MethodCollector.m26664o(2655);
                    throw th;
                }
            } finally {
                MethodCollector.m26664o(2655);
            }
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46540a(AbstractC27825d dVar) {
        MethodCollector.m26663i(4249);
        synchronized (this.f65408h) {
            try {
                Iterator<AbstractC27853m> it = this.f65411k.iterator();
                while (it.hasNext()) {
                    if (it.next().mo46549a(dVar)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.m26664o(4249);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo46541a(boolean z) {
        AbstractC27825d dVar;
        MethodCollector.m26663i(2626);
        AbstractC27825d j = m55733j();
        try {
            if (j.mo46509j() || j.mo46510k()) {
                dVar = m55725a(this, j);
            } else if (z || C27854n.m55758a(j)) {
                AbstractC27836e a = this.f65403c.mo46538a(m55730g(), j.mo46484a(), m55728e(), j.mo46487d());
                int i = C278412.f65414b[a.mo46529c().ordinal()];
                if (i == 1) {
                    String a2 = a.mo46527a();
                    long b = a.mo46528b();
                    dVar = j.mo46492h().mo46500b(a2).mo46495a(b).mo46499b(C27854n.m55757a()).mo46498a();
                } else if (i == 2) {
                    dVar = j.mo46507a("BAD CONFIG");
                } else if (i == 3) {
                    this.f65410j = null;
                    dVar = j.mo46492h().mo46496a(C27823c.EnumC27824a.NOT_GENERATED).mo46498a();
                } else {
                    IOException iOException = new IOException();
                    MethodCollector.m26664o(2626);
                    throw iOException;
                }
            } else {
                MethodCollector.m26664o(2626);
                return;
            }
            synchronized (f65399l) {
                try {
                    C27827b a3 = C27827b.m55671a(this.f65402b.mo46324a(), "generatefid.lock");
                    try {
                        this.f65404d.mo46506a(dVar);
                        if (a3 != null) {
                            a3.mo46512a();
                        }
                    } catch (Throwable th) {
                        if (a3 != null) {
                            a3.mo46512a();
                        }
                        throw th;
                    }
                } finally {
                    MethodCollector.m26664o(2626);
                }
            }
            if (dVar.mo46508i()) {
                this.f65410j = dVar.mo46484a();
            }
            if (dVar.mo46509j()) {
                m55726a(dVar, new C27846h(C27846h.EnumC27847a.BAD_CONFIG));
                MethodCollector.m26664o(2626);
            } else if (dVar.mo46511l()) {
                m55726a(dVar, new IOException("cleared fid due to auth error"));
                MethodCollector.m26664o(2626);
            } else {
                mo46540a(dVar);
                MethodCollector.m26664o(2626);
            }
        } catch (IOException e) {
            m55726a(j, e);
            MethodCollector.m26664o(2626);
        }
    }

    /* renamed from: a */
    private void m55726a(AbstractC27825d dVar, Exception exc) {
        MethodCollector.m26663i(4350);
        synchronized (this.f65408h) {
            try {
                Iterator<AbstractC27853m> it = this.f65411k.iterator();
                while (it.hasNext()) {
                    if (it.next().mo46550a(dVar, exc)) {
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.m26664o(4350);
            }
        }
    }

    /* renamed from: a */
    private static AbstractC27825d m55725a(C27839c cVar, AbstractC27825d dVar) {
        String str = null;
        try {
            if (dVar.mo46484a().length() == 11) {
                str = cVar.f65406f.mo46503a();
            }
            AbstractC27833d a = cVar.f65403c.mo46537a(cVar.m55730g(), dVar.mo46484a(), cVar.m55728e(), cVar.m55729f(), str);
            int i = C278412.f65413a[a.mo46517e().ordinal()];
            if (i == 1) {
                String b = a.mo46514b();
                String c = a.mo46515c();
                long a2 = C27854n.m55757a();
                String a3 = a.mo46516d().mo46527a();
                return dVar.mo46492h().mo46497a(b).mo46496a(C27823c.EnumC27824a.REGISTERED).mo46500b(a3).mo46501c(c).mo46495a(a.mo46516d().mo46528b()).mo46499b(a2).mo46498a();
            } else if (i == 2) {
                return dVar.mo46507a("BAD CONFIG");
            } else {
                throw new IOException();
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            return dVar.mo46507a("BAD CONFIG");
        }
    }

    C27839c(C27695b bVar, AbstractC27749h hVar, AbstractC27706c cVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f65400m), bVar, new C27832c(bVar.mo46324a(), hVar, cVar), new C27823c(bVar), new C27854n(), new C27822b(bVar), new C27852l());
    }

    private C27839c(ExecutorService executorService, C27695b bVar, C27832c cVar, C27823c cVar2, C27854n nVar, C27822b bVar2, C27852l lVar) {
        this.f65408h = new Object();
        this.f65410j = null;
        this.f65411k = new ArrayList();
        this.f65402b = bVar;
        this.f65403c = cVar;
        this.f65404d = cVar2;
        this.f65405e = nVar;
        this.f65406f = bVar2;
        this.f65407g = lVar;
        this.f65409i = executorService;
        this.f65401a = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f65400m);
    }
}
