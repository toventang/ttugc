package com.facebook.p1814a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.C24012b;
import com.facebook.C24872m;
import com.facebook.EnumC25029u;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24770r;
import com.facebook.internal.C24777t;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23964g;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.a.h */
public class C23973h {

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor f56747a;

    /* renamed from: b */
    private static final String f56748b = C23973h.class.getCanonicalName();

    /* renamed from: e */
    private static C23964g.EnumC23965a f56749e = C23964g.EnumC23965a.AUTO;

    /* renamed from: f */
    private static final Object f56750f = new Object();

    /* renamed from: g */
    private static String f56751g;

    /* renamed from: h */
    private static String f56752h;

    /* renamed from: c */
    private final String f56753c;

    /* renamed from: d */
    private final C23866a f56754d;

    /* renamed from: b */
    public final void mo39460b() {
        C24677a.m47209a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo39462f() {
        C24677a.m47209a(this);
    }

    static {
        Covode.recordClassIndex(28094);
    }

    /* renamed from: g */
    public static Executor m45331g() {
        if (C24677a.m47209a(C23973h.class)) {
            return null;
        }
        try {
            if (f56747a == null) {
                m45332h();
            }
            return f56747a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23973h.class);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo39461c() {
        if (!C24677a.m47209a(this)) {
            try {
                C23916e.m45231a(EnumC23995j.EXPLICIT);
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    public static C23964g.EnumC23965a m45326a() {
        C23964g.EnumC23965a aVar;
        MethodCollector.m26663i(10299);
        if (C24677a.m47209a(C23973h.class)) {
            MethodCollector.m26664o(10299);
            return null;
        }
        try {
            synchronized (f56750f) {
                try {
                    aVar = f56749e;
                } finally {
                    MethodCollector.m26664o(10299);
                }
            }
            return aVar;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23973h.class);
            MethodCollector.m26664o(10299);
            return null;
        }
    }

    /* renamed from: d */
    static String m45329d() {
        String str;
        MethodCollector.m26663i(10447);
        if (C24677a.m47209a(C23973h.class)) {
            MethodCollector.m26664o(10447);
            return null;
        }
        try {
            synchronized (f56750f) {
                try {
                    str = f56752h;
                } finally {
                    MethodCollector.m26664o(10447);
                }
            }
            return str;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23973h.class);
            MethodCollector.m26664o(10447);
            return null;
        }
    }

    /* renamed from: e */
    static String m45330e() {
        if (C24677a.m47209a(C23973h.class)) {
            return null;
        }
        try {
            C239752 r2 = new C24777t.AbstractC24779a() {
                /* class com.facebook.p1814a.C23973h.C239752 */

                static {
                    Covode.recordClassIndex(28096);
                }

                @Override // com.facebook.internal.C24777t.AbstractC24779a
                /* renamed from: a */
                public final void mo39464a(String str) {
                    if (!C24677a.m47209a(C23973h.class)) {
                        try {
                            C24699ae.m47299a();
                            SharedPreferences a = C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.appEventPreferences", 0);
                            if (str != null) {
                                a.edit().putString("install_referrer", str).apply();
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C23973h.class);
                        }
                    }
                }
            };
            if (!C24677a.m47209a(C24777t.class)) {
                try {
                    if (!C24777t.m47435a() && !C24677a.m47209a(C24777t.class)) {
                        try {
                            C24699ae.m47299a();
                            InstallReferrerClient a = InstallReferrerClient.m6882a(C24872m.f59047g).mo6233a();
                            try {
                                a.mo6229a(new InstallReferrerStateListener(a, r2) {
                                    /* class com.facebook.internal.C24777t.C247781 */

                                    /* renamed from: a */
                                    final /* synthetic */ InstallReferrerClient f58797a;

                                    /* renamed from: b */
                                    final /* synthetic */ AbstractC24779a f58798b;

                                    static {
                                        Covode.recordClassIndex(28931);
                                    }

                                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                                    public final void onInstallReferrerServiceDisconnected() {
                                    }

                                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                                    public final void onInstallReferrerSetupFinished(int i) {
                                        if (!C24677a.m47209a(this)) {
                                            if (i == 0) {
                                                try {
                                                    String a = this.f58797a.mo6232c().mo6236a();
                                                    if (a != null && (a.contains("fb") || a.contains("facebook"))) {
                                                        this.f58798b.mo39464a(a);
                                                    }
                                                    C24777t.m47436b();
                                                } catch (RemoteException unused) {
                                                }
                                            } else if (i == 2) {
                                                try {
                                                    C24777t.m47436b();
                                                } catch (Throwable th) {
                                                    C24677a.m47208a(th, this);
                                                }
                                            }
                                        }
                                    }

                                    {
                                        this.f58797a = r1;
                                        this.f58798b = r2;
                                    }
                                });
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th) {
                            C24677a.m47208a(th, C24777t.class);
                        }
                    }
                } catch (Throwable th2) {
                    C24677a.m47208a(th2, C24777t.class);
                }
            }
            C24699ae.m47299a();
            return C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        } catch (Throwable th3) {
            C24677a.m47208a(th3, C23973h.class);
            return null;
        }
    }

    /* renamed from: h */
    private static void m45332h() {
        MethodCollector.m26663i(10613);
        if (C24677a.m47209a(C23973h.class)) {
            MethodCollector.m26664o(10613);
            return;
        }
        try {
            synchronized (f56750f) {
                try {
                    if (f56747a == null) {
                        f56747a = new ScheduledThreadPoolExecutor(1);
                        f56747a.scheduleAtFixedRate(new Runnable() {
                            /* class com.facebook.p1814a.C23973h.RunnableC239763 */

                            static {
                                Covode.recordClassIndex(28097);
                            }

                            public final void run() {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        HashSet<String> hashSet = new HashSet();
                                        for (C23866a aVar : C23916e.m45230a()) {
                                            hashSet.add(aVar.getApplicationId());
                                        }
                                        for (String str : hashSet) {
                                            C24770r.m47427a(str, true);
                                        }
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, this);
                                    }
                                }
                            }
                        }, 0, 86400, TimeUnit.SECONDS);
                        MethodCollector.m26664o(10613);
                    }
                } finally {
                    MethodCollector.m26664o(10613);
                }
            }
        } catch (Throwable th) {
            C24677a.m47208a(th, C23973h.class);
            MethodCollector.m26664o(10613);
        }
    }

    /* renamed from: a */
    public static void m45328a(String str) {
        if (!C24677a.m47209a(C23973h.class)) {
            try {
                C24783w.m47440a(EnumC25029u.DEVELOPER_ERRORS, "AppEvents", str);
            } catch (Throwable th) {
                C24677a.m47208a(th, C23973h.class);
            }
        }
    }

    /* renamed from: a */
    public static String m45327a(Context context) {
        MethodCollector.m26663i(10751);
        if (C24677a.m47209a(C23973h.class)) {
            MethodCollector.m26664o(10751);
            return null;
        }
        try {
            if (f56751g == null) {
                synchronized (f56750f) {
                    try {
                        if (f56751g == null) {
                            String string = C34822d.m71158a(context, "com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                            f56751g = string;
                            if (string == null) {
                                f56751g = "XZ" + UUID.randomUUID().toString();
                                C34822d.m71158a(context, "com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f56751g).apply();
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(10751);
                        throw th;
                    }
                }
            }
            String str = f56751g;
            MethodCollector.m26664o(10751);
            return str;
        } catch (Throwable th2) {
            C24677a.m47208a(th2, C23973h.class);
            MethodCollector.m26664o(10751);
            return null;
        }
    }

    public C23973h(Context context, String str) {
        this(C24693ad.m47272c(context), str, null);
    }

    C23973h(String str, String str2, AccessToken accessToken) {
        C24699ae.m47299a();
        this.f56753c = str;
        AccessToken accessToken2 = C24012b.m45437a().f56861b;
        if (accessToken2 == null || accessToken2.mo39308b()) {
            if (str2 == null) {
                C24699ae.m47299a();
                str2 = C24693ad.m47233a(C24872m.f59047g);
            }
            this.f56754d = new C23866a(null, str2);
        } else {
            if (str2 == null || str2.equals(accessToken2.f56407h)) {
                this.f56754d = new C23866a(accessToken2);
            }
            this.f56754d = new C23866a(null, str2);
        }
        m45332h();
    }
}
