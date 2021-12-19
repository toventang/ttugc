package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.p1939a.ThreadFactoryC25597b;
import com.google.android.gms.p1940d.AbstractC25631h;
import com.google.android.gms.p1940d.C25635k;
import com.google.firebase.C27672a;
import com.google.firebase.C27695b;
import com.google.firebase.iid.C27774aq;
import com.google.firebase.installations.AbstractC27845g;
import com.google.firebase.p2010b.AbstractC27700b;
import com.google.firebase.p2010b.AbstractC27702d;
import com.google.firebase.p2011c.AbstractC27706c;
import com.google.firebase.p2014f.AbstractC27749h;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class FirebaseInstanceId {

    /* renamed from: a */
    static C27774aq f65198a;

    /* renamed from: b */
    static ScheduledExecutorService f65199b;

    /* renamed from: i */
    private static final long f65200i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static final Pattern f65201j = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: c */
    final Executor f65202c;

    /* renamed from: d */
    public final C27695b f65203d;

    /* renamed from: e */
    final C27760ae f65204e;

    /* renamed from: f */
    final C27801q f65205f;

    /* renamed from: g */
    final C27763ah f65206g;

    /* renamed from: h */
    public final C27752a f65207h;

    /* renamed from: k */
    private final AbstractC27845g f65208k;

    /* renamed from: l */
    private boolean f65209l;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo46396a(C27774aq.C27775a aVar) {
        return aVar == null || aVar.mo46432b(this.f65204e.mo46413c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C27774aq.C27775a mo46401e() {
        return mo46397b(C27760ae.m55503a(this.f65203d), "*");
    }

    static {
        Covode.recordClassIndex(33337);
    }

    /* renamed from: f */
    static boolean m55481f() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final AbstractC25631h<AbstractC27807v> mo46400d() {
        m55477a(this.f65203d);
        return mo46391a(C27760ae.m55503a(this.f65203d), "*");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo46402g() {
        MethodCollector.m26663i(10937);
        f65198a.mo46429a();
        if (this.f65207h.mo46404a()) {
            mo46398b();
        }
        MethodCollector.m26664o(10937);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final String mo46403h() {
        if ("[DEFAULT]".equals(this.f65203d.mo46326b())) {
            return "";
        }
        return this.f65203d.mo46332h();
    }

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    public class C27752a {

        /* renamed from: b */
        private boolean f65211b;

        /* renamed from: c */
        private final AbstractC27702d f65212c;

        /* renamed from: d */
        private boolean f65213d;

        /* renamed from: e */
        private AbstractC27700b<C27672a> f65214e;

        /* renamed from: f */
        private Boolean f65215f;

        static {
            Covode.recordClassIndex(33338);
        }

        /* renamed from: b */
        private synchronized void m55495b() {
            MethodCollector.m26663i(12556);
            if (this.f65213d) {
                MethodCollector.m26664o(12556);
                return;
            }
            this.f65211b = m55497d();
            Boolean c = m55496c();
            this.f65215f = c;
            if (c == null && this.f65211b) {
                C27799o oVar = new C27799o(this);
                this.f65214e = oVar;
                this.f65212c.mo46339a(C27672a.class, oVar);
            }
            this.f65213d = true;
            MethodCollector.m26664o(12556);
        }

        /* renamed from: d */
        private boolean m55497d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f65203d.mo46324a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: a */
        public final synchronized boolean mo46404a() {
            MethodCollector.m26663i(12661);
            m55495b();
            Boolean bool = this.f65215f;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                MethodCollector.m26664o(12661);
                return booleanValue;
            } else if (!this.f65211b || !FirebaseInstanceId.this.f65203d.mo46328e()) {
                MethodCollector.m26664o(12661);
                return false;
            } else {
                MethodCollector.m26664o(12661);
                return true;
            }
        }

        /* renamed from: c */
        private Boolean m55496c() {
            ApplicationInfo applicationInfo;
            Context a = FirebaseInstanceId.this.f65203d.mo46324a();
            SharedPreferences a2 = C34822d.m71158a(a, "com.google.firebase.messaging", 0);
            if (a2.contains("auto_init")) {
                return Boolean.valueOf(a2.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                String packageName = a.getPackageName();
                if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                    if (C58014b.f132218a == null) {
                        C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = C58014b.f132218a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        C27752a(AbstractC27702d dVar) {
            this.f65212c = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo46398b() {
        MethodCollector.m26663i(10786);
        if (!this.f65209l) {
            mo46394a(0);
        }
        MethodCollector.m26664o(10786);
    }

    /* renamed from: c */
    public final String mo46399c() {
        try {
            f65198a.mo46427a(this.f65203d.mo46332h());
            AbstractC25631h<String> a = this.f65208k.mo46539a();
            C25565r.m49315a(a, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a.mo41873a(ExecutorC27795k.f65300a, new C27796l(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (a.mo41882b()) {
                return a.mo41886d();
            }
            if (a.mo41885c()) {
                throw new CancellationException("Task is already canceled");
            } else if (a.mo41880a()) {
                throw new IllegalStateException(a.mo41887e());
            } else {
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public final void mo46393a() {
        if (mo46396a(mo46401e())) {
            mo46398b();
        }
    }

    /* renamed from: a */
    private static boolean m55479a(String str) {
        return f65201j.matcher(str).matches();
    }

    public static FirebaseInstanceId getInstance(C27695b bVar) {
        m55477a(bVar);
        return (FirebaseInstanceId) bVar.mo46325a(FirebaseInstanceId.class);
    }

    /* renamed from: b */
    private static String m55480b(String str) {
        if (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) {
            return "*";
        }
        return str;
    }

    /* renamed from: a */
    public static void m55477a(C27695b bVar) {
        C25565r.m49317a(bVar.mo46327c().f65184g, (Object) "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C25565r.m49317a(bVar.mo46327c().f65179b, (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C25565r.m49317a(bVar.mo46327c().f65178a, (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C25565r.m49325b(bVar.mo46327c().f65179b.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C25565r.m49325b(m55479a(bVar.mo46327c().f65178a), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> T mo46392a(AbstractC25631h<T> hVar) {
        try {
            return (T) C25635k.m49515a(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo46402g();
                }
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo46394a(long j) {
        MethodCollector.m26663i(10787);
        m55478a(new RunnableC27776ar(this, Math.min(Math.max(30L, j << 1), f65200i)), j);
        this.f65209l = true;
        MethodCollector.m26664o(10787);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo46395a(boolean z) {
        MethodCollector.m26663i(10785);
        this.f65209l = z;
        MethodCollector.m26664o(10785);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C27774aq.C27775a mo46397b(String str, String str2) {
        return f65198a.mo46428a(mo46403h(), str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC25631h<AbstractC27807v> mo46391a(String str, String str2) {
        return C25635k.m49512a((Object) null).mo41881b(this.f65202c, new C27794j(this, str, m55480b(str2)));
    }

    /* renamed from: a */
    static void m55478a(Runnable runnable, long j) {
        MethodCollector.m26663i(10934);
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f65199b == null) {
                    f65199b = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC25597b("FirebaseInstanceId"));
                }
                f65199b.schedule(runnable, j, TimeUnit.SECONDS);
            } finally {
                MethodCollector.m26664o(10934);
            }
        }
    }

    FirebaseInstanceId(C27695b bVar, AbstractC27702d dVar, AbstractC27749h hVar, AbstractC27706c cVar, AbstractC27845g gVar) {
        this(bVar, new C27760ae(bVar.mo46324a()), C27791g.m55574a(), C27791g.m55574a(), dVar, hVar, cVar, gVar);
    }

    private FirebaseInstanceId(C27695b bVar, C27760ae aeVar, Executor executor, Executor executor2, AbstractC27702d dVar, AbstractC27749h hVar, AbstractC27706c cVar, AbstractC27845g gVar) {
        MethodCollector.m26663i(10784);
        if (C27760ae.m55503a(bVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f65198a == null) {
                        f65198a = new C27774aq(bVar.mo46324a());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10784);
                    throw th;
                }
            }
            this.f65203d = bVar;
            this.f65204e = aeVar;
            this.f65205f = new C27801q(bVar, aeVar, hVar, cVar, gVar);
            this.f65202c = executor2;
            this.f65207h = new C27752a(dVar);
            this.f65206g = new C27763ah(executor);
            this.f65208k = gVar;
            executor2.execute(new RunnableC27793i(this));
            MethodCollector.m26664o(10784);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        MethodCollector.m26664o(10784);
        throw illegalStateException;
    }
}
