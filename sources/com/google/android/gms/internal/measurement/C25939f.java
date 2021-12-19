package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.common.util.C25605g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.AbstractC26411gi;
import com.google.android.gms.measurement.internal.C26444ho;
import com.google.android.gms.measurement.p1950a.C26237a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.measurement.f */
public class C25939f {

    /* renamed from: e */
    static Boolean f61093e;

    /* renamed from: i */
    private static volatile C25939f f61094i;

    /* renamed from: l */
    private static String f61095l = "allow_remote_dynamite";

    /* renamed from: a */
    final String f61096a = "FA";

    /* renamed from: b */
    protected final AbstractC25603e f61097b = C25605g.f60716a;

    /* renamed from: c */
    public final C26237a f61098c = new C26237a(this);

    /* renamed from: d */
    List<Pair<AbstractC26411gi, Object>> f61099d;

    /* renamed from: f */
    boolean f61100f;

    /* renamed from: g */
    public String f61101g;

    /* renamed from: h */
    AbstractC26220ox f61102h;

    /* renamed from: j */
    private final ExecutorService f61103j = C25979gh.f61235a.mo42668a(new ThreadFactoryC26196o());

    /* renamed from: k */
    private int f61104k;

    /* renamed from: a */
    public final void mo42394a(String str, String str2, Bundle bundle) {
        mo42395a(str, str2, bundle, true);
    }

    /* renamed from: a */
    public final void mo42395a(String str, String str2, Bundle bundle, boolean z) {
        mo42391a(new C25764ad(this, str, str2, bundle, z));
    }

    /* renamed from: a */
    public final void mo42393a(String str, Object obj) {
        mo42391a(new C26233x(this, str, obj));
    }

    static {
        Covode.recordClassIndex(31354);
    }

    /* renamed from: b */
    private static boolean m50216b() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.f$a */
    public abstract class AbstractRunnableC25940a implements Runnable {

        /* renamed from: a */
        final long f61105a;

        /* renamed from: b */
        final long f61106b;

        /* renamed from: c */
        private final boolean f61107c;

        static {
            Covode.recordClassIndex(31355);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo42003a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo42004b();

        public void run() {
            if (C25939f.this.f61100f) {
                mo42003a();
                return;
            }
            try {
                mo42004b();
            } catch (Exception e) {
                C25939f.this.mo42392a(e, false, this.f61107c);
                mo42003a();
            }
        }

        AbstractRunnableC25940a(C25939f fVar) {
            this(true);
        }

        AbstractRunnableC25940a(boolean z) {
            this.f61105a = C25939f.this.f61097b.mo41857a();
            this.f61106b = C25939f.this.f61097b.mo41858b();
            this.f61107c = z;
        }
    }

    /* renamed from: a */
    public final long mo42389a() {
        BinderC26218ov ovVar = new BinderC26218ov();
        mo42391a(new C26228s(this, ovVar));
        Long l = (Long) BinderC26218ov.m51336a(ovVar.mo42913b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f61097b.mo41857a()).nextLong();
        int i = this.f61104k + 1;
        this.f61104k = i;
        return nextLong + ((long) i);
    }

    /* renamed from: com.google.android.gms.internal.measurement.f$b */
    class C25941b implements Application.ActivityLifecycleCallbacks {
        static {
            Covode.recordClassIndex(31356);
        }

        C25941b() {
        }

        public final void onActivityDestroyed(Activity activity) {
            C25939f.this.mo42391a(new C25771ak(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C25939f.this.mo42391a(new C25767ag(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C25939f.this.mo42391a(new C25768ah(this, activity));
        }

        public final void onActivityStarted(Activity activity) {
            C25939f.this.mo42391a(new C25765ae(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C25939f.this.mo42391a(new C25770aj(this, activity));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C25939f.this.mo42391a(new C25766af(this, activity, bundle));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            BinderC26218ov ovVar = new BinderC26218ov();
            C25939f.this.mo42391a(new C25769ai(this, activity, ovVar));
            Bundle b = ovVar.mo42913b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }
    }

    /* renamed from: b */
    private static boolean m50217b(Context context) {
        try {
            if (C26444ho.m52081a(context, "google_app_id") != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m50213a(Context context) {
        MethodCollector.m26663i(13170);
        synchronized (C25939f.class) {
            try {
                if (f61093e != null) {
                    try {
                        MethodCollector.m26664o(13170);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(13170);
                        throw th;
                    }
                } else if (m50214a(context, "app_measurement_internal_disable_startup_flags")) {
                    f61093e = false;
                    MethodCollector.m26664o(13170);
                } else {
                    SharedPreferences a = C34822d.m71158a(context, "com.google.android.gms.measurement.prefs", 0);
                    f61093e = Boolean.valueOf(a.getBoolean(f61095l, false));
                    SharedPreferences.Editor edit = a.edit();
                    edit.remove(f61095l);
                    edit.apply();
                    MethodCollector.m26664o(13170);
                }
            } catch (Exception unused) {
                f61093e = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo42391a(AbstractRunnableC25940a aVar) {
        this.f61103j.execute(aVar);
    }

    /* renamed from: a */
    public static Object m50212a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m50215a(String str, String str2) {
        if (str2 == null || str == null || m50216b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final AbstractC26220ox mo42390a(Context context, boolean z) {
        DynamiteModule.AbstractC25654b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f60796e;
            } catch (DynamiteModule.C25653a e) {
                mo42392a((Exception) e, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f60793b;
        }
        return AbstractBinderC26219ow.asInterface(DynamiteModule.m49545a(context, bVar, ModuleDescriptor.MODULE_ID).mo41907a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* renamed from: a */
    public static C25939f m50211a(Context context, Bundle bundle) {
        MethodCollector.m26663i(13011);
        C25565r.m49314a(context);
        if (f61094i == null) {
            synchronized (C25939f.class) {
                try {
                    if (f61094i == null) {
                        f61094i = new C25939f(context, bundle);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13011);
                    throw th;
                }
            }
        }
        C25939f fVar = f61094i;
        MethodCollector.m26664o(13011);
        return fVar;
    }

    private C25939f(Context context, Bundle bundle) {
        boolean z;
        if (!m50217b(context) || m50216b()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f61101g = null;
            this.f61100f = true;
            return;
        }
        if (!m50215a((String) null, (String) null)) {
            this.f61101g = "fa";
        } else {
            this.f61101g = null;
        }
        mo42391a(new C26030i(this, null, null, context, bundle));
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        Application application = (Application) applicationContext;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C25941b());
        }
    }

    /* renamed from: a */
    private static boolean m50214a(Context context, String str) {
        C25565r.m49316a(str);
        try {
            ApplicationInfo a = C25500c.f60481a.mo41741a(context).mo41737a(context.getPackageName(), 128);
            if (a != null) {
                if (a.metaData != null) {
                    return a.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42392a(Exception exc, boolean z, boolean z2) {
        this.f61100f |= z;
        if (!z && z2) {
            mo42393a("Error with data collection. Data lost.", exc);
        }
    }
}
