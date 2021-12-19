package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.p033d.C0655h;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C25417c;
import com.google.android.gms.common.internal.C25560p;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.C25571t;
import com.google.android.gms.common.util.C25601c;
import com.google.android.gms.common.util.C25610l;
import com.google.firebase.components.AbstractC27719h;
import com.google.firebase.components.C27710b;
import com.google.firebase.components.C27715f;
import com.google.firebase.components.C27720i;
import com.google.firebase.components.C27727n;
import com.google.firebase.components.C27732s;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2011c.C27705b;
import com.google.firebase.p2013e.C27741a;
import com.google.firebase.p2014f.AbstractC27747f;
import com.google.firebase.p2014f.AbstractC27749h;
import com.google.firebase.p2014f.C27744c;
import com.google.firebase.p2014f.C27746e;
import com.google.firebase.p2014f.C27748g;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.firebase.b */
public class C27695b {

    /* renamed from: a */
    public static final Object f65100a = new Object();

    /* renamed from: b */
    static final Map<String, C27695b> f65101b = new C0484a();

    /* renamed from: e */
    private static final Executor f65102e = new ExecutorC27697b((byte) 0);

    /* renamed from: c */
    final C27720i f65103c;

    /* renamed from: d */
    public final AtomicBoolean f65104d = new AtomicBoolean(false);

    /* renamed from: f */
    private final Context f65105f;

    /* renamed from: g */
    private final String f65106g;

    /* renamed from: h */
    private final C27740e f65107h;

    /* renamed from: i */
    private final AtomicBoolean f65108i = new AtomicBoolean();

    /* renamed from: j */
    private final C27732s<C27741a> f65109j;

    /* renamed from: k */
    private final List<Object> f65110k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private final List<Object> f65111l = new CopyOnWriteArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.b$a */
    public static class C27696a implements ComponentCallbacks2C25417c.AbstractC25418a {

        /* renamed from: a */
        static AtomicReference<C27696a> f65112a = new AtomicReference<>();

        C27696a() {
        }

        static {
            Covode.recordClassIndex(33278);
        }

        /* renamed from: a */
        public static Context m55387a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C25417c.AbstractC25418a
        /* renamed from: a */
        public final void mo41610a(boolean z) {
            MethodCollector.m26663i(8063);
            synchronized (C27695b.f65100a) {
                try {
                    Iterator it = new ArrayList(C27695b.f65101b.values()).iterator();
                    while (it.hasNext()) {
                        C27695b bVar = (C27695b) it.next();
                        if (bVar.f65104d.get()) {
                            bVar.mo46331g();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8063);
                }
            }
        }
    }

    /* renamed from: com.google.firebase.b$b */
    static class ExecutorC27697b implements Executor {

        /* renamed from: a */
        private static final Handler f65113a = new Handler(Looper.getMainLooper());

        private ExecutorC27697b() {
        }

        static {
            Covode.recordClassIndex(33279);
        }

        /* synthetic */ ExecutorC27697b(byte b) {
            this();
        }

        public final void execute(Runnable runnable) {
            f65113a.post(runnable);
        }
    }

    /* renamed from: a */
    public final Context mo46324a() {
        m55377j();
        return this.f65105f;
    }

    /* renamed from: b */
    public final String mo46326b() {
        m55377j();
        return this.f65106g;
    }

    /* renamed from: c */
    public final C27740e mo46327c() {
        m55377j();
        return this.f65107h;
    }

    public int hashCode() {
        return this.f65106g.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.b$c */
    public static class C27698c extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C27698c> f65114a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f65115b;

        static {
            Covode.recordClassIndex(33280);
        }

        private C27698c(Context context) {
            this.f65115b = context;
        }

        /* renamed from: a */
        public static void m55390a(Context context) {
            if (f65114a.get() == null) {
                C27698c cVar = new C27698c(context);
                if (f65114a.compareAndSet(null, cVar)) {
                    m55391b(context, cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public final void onReceive(Context context, Intent intent) {
            MethodCollector.m26663i(10509);
            synchronized (C27695b.f65100a) {
                try {
                    for (C27695b bVar : C27695b.f65101b.values()) {
                        bVar.mo46334i();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10509);
                    throw th;
                }
            }
            this.f65115b.unregisterReceiver(this);
            MethodCollector.m26664o(10509);
        }

        /* renamed from: a */
        private static Intent m55389a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
        private static android.content.Intent m55391b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m55389a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.C27695b.C27698c.m55391b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    }

    /* renamed from: j */
    private void m55377j() {
        C25565r.m49321a(!this.f65108i.get(), "FirebaseApp was deleted");
    }

    /* renamed from: f */
    public final boolean mo46330f() {
        return "[DEFAULT]".equals(mo46326b());
    }

    static {
        Covode.recordClassIndex(33277);
    }

    /* renamed from: e */
    public final boolean mo46328e() {
        m55377j();
        return this.f65109j.mo46341a().f65185a.get();
    }

    /* renamed from: g */
    public final void mo46331g() {
        Iterator<Object> it = this.f65110k.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: i */
    public final void mo46334i() {
        if (!C0655h.m2392a(this.f65105f)) {
            C27698c.m55390a(this.f65105f);
        } else {
            this.f65103c.mo46361a(mo46330f());
        }
    }

    public String toString() {
        return C25560p.m49307a(this).mo41827a(StringSet.name, this.f65106g).mo41827a("options", this.f65107h).toString();
    }

    /* renamed from: h */
    public final String mo46332h() {
        return C25601c.m49405a(mo46326b().getBytes(Charset.defaultCharset())) + "+" + C25601c.m49405a(mo46327c().f65179b.getBytes(Charset.defaultCharset()));
    }

    /* renamed from: d */
    public static C27695b m55376d() {
        C27695b bVar;
        MethodCollector.m26663i(9421);
        synchronized (f65100a) {
            try {
                bVar = f65101b.get("[DEFAULT]");
                if (bVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Default FirebaseApp is not initialized in this process " + C25610l.m49426a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    MethodCollector.m26664o(9421);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(9421);
            }
        }
        return bVar;
    }

    /* renamed from: b */
    private static Context m55375b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final <T> T mo46325a(Class<T> cls) {
        m55377j();
        return (T) this.f65103c.mo46348a(cls);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C27695b)) {
            return false;
        }
        return this.f65106g.equals(((C27695b) obj).mo46326b());
    }

    /* renamed from: a */
    public static C27695b m55373a(Context context) {
        MethodCollector.m26663i(9575);
        synchronized (f65100a) {
            try {
                if (f65101b.containsKey("[DEFAULT]")) {
                    return m55376d();
                }
                C25571t tVar = new C25571t(context);
                String a = tVar.mo41831a("google_app_id");
                if (TextUtils.isEmpty(a)) {
                    MethodCollector.m26664o(9575);
                    return null;
                }
                C27695b a2 = m55374a(context, new C27740e(a, tVar.mo41831a("google_api_key"), tVar.mo41831a("firebase_database_url"), tVar.mo41831a("ga_trackingId"), tVar.mo41831a("gcm_defaultSenderId"), tVar.mo41831a("google_storage_bucket"), tVar.mo41831a("project_id")), "[DEFAULT]");
                MethodCollector.m26664o(9575);
                return a2;
            } finally {
                MethodCollector.m26664o(9575);
            }
        }
    }

    private C27695b(Context context, String str, C27740e eVar) {
        C27710b<?> bVar;
        this.f65105f = (Context) C25565r.m49314a(context);
        this.f65106g = C25565r.m49316a(str);
        this.f65107h = (C27740e) C25565r.m49314a(eVar);
        C27715f fVar = new C27715f(context, new C27715f.C27716a(ComponentDiscoveryService.class, (byte) 0));
        List<AbstractC27719h> a = C27715f.m55423a(fVar.f65141b.mo46360a(fVar.f65140a));
        String a2 = C27746e.m55469a();
        Executor executor = f65102e;
        C27710b[] bVarArr = new C27710b[8];
        bVarArr[0] = C27710b.m55407a(context, Context.class, new Class[0]);
        bVarArr[1] = C27710b.m55407a(this, C27695b.class, new Class[0]);
        bVarArr[2] = C27710b.m55407a(eVar, C27740e.class, new Class[0]);
        bVarArr[3] = C27748g.m55473a("fire-android", "");
        bVarArr[4] = C27748g.m55473a("fire-core", "19.3.0");
        if (a2 != null) {
            bVar = C27748g.m55473a("kotlin", a2);
        } else {
            bVar = null;
        }
        bVarArr[5] = bVar;
        bVarArr[6] = C27710b.m55404a(AbstractC27749h.class).mo46356a(new C27727n(AbstractC27747f.class, 2)).mo46355a(C27744c.f65193a).mo46357a();
        bVarArr[7] = C27710b.m55404a(AbstractC27706c.class).mo46356a(C27727n.m55442a(Context.class)).mo46355a(C27705b.f65121a).mo46357a();
        this.f65103c = new C27720i(executor, a, bVarArr);
        this.f65109j = new C27732s<>(new C27703c(this, context));
    }

    /* renamed from: a */
    private static C27695b m55374a(Context context, C27740e eVar, String str) {
        boolean z;
        C27695b bVar;
        MethodCollector.m26663i(9720);
        if (C27696a.m55387a(context) instanceof Application) {
            Application application = (Application) C27696a.m55387a(context);
            if (C27696a.f65112a.get() == null) {
                C27696a aVar = new C27696a();
                if (C27696a.f65112a.compareAndSet(null, aVar)) {
                    ComponentCallbacks2C25417c.m48960a(application);
                    ComponentCallbacks2C25417c.m48959a().mo41639a(aVar);
                }
            }
        }
        String trim = str.trim();
        if (m55375b(context) != null) {
            context = m55375b(context);
        }
        synchronized (f65100a) {
            try {
                Map<String, C27695b> map = f65101b;
                if (!map.containsKey(trim)) {
                    z = true;
                } else {
                    z = false;
                }
                C25565r.m49321a(z, "FirebaseApp name " + trim + " already exists!");
                C25565r.m49315a(context, "Application context cannot be null.");
                bVar = new C27695b(context, trim, eVar);
                map.put(trim, bVar);
            } catch (Throwable th) {
                MethodCollector.m26664o(9720);
                throw th;
            }
        }
        bVar.mo46334i();
        MethodCollector.m26664o(9720);
        return bVar;
    }
}
