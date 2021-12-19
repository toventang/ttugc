package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24710b;
import com.facebook.internal.C24768q;
import com.facebook.internal.C24770r;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ab */
public final class C24006ab {

    /* renamed from: a */
    private static final String f56835a = C24006ab.class.getName();

    /* renamed from: b */
    private static AtomicBoolean f56836b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f56837c = new AtomicBoolean(false);

    /* renamed from: d */
    private static C24008a f56838d = new C24008a(true, "com.facebook.sdk.AutoInitEnabled");

    /* renamed from: e */
    private static C24008a f56839e = new C24008a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* renamed from: f */
    private static C24008a f56840f = new C24008a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* renamed from: g */
    private static C24008a f56841g = new C24008a(false, "auto_event_setup_enabled");

    /* renamed from: h */
    private static C24008a f56842h = new C24008a(true, "com.facebook.sdk.MonitorEnabled");

    /* renamed from: i */
    private static SharedPreferences f56843i;

    C24006ab() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.ab$a */
    public static class C24008a {

        /* renamed from: a */
        String f56845a;

        /* renamed from: b */
        Boolean f56846b;

        /* renamed from: c */
        boolean f56847c;

        /* renamed from: d */
        long f56848d;

        static {
            Covode.recordClassIndex(28129);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo39492a() {
            Boolean bool = this.f56846b;
            if (bool == null) {
                return this.f56847c;
            }
            return bool.booleanValue();
        }

        C24008a(boolean z, String str) {
            this.f56847c = z;
            this.f56845a = str;
        }
    }

    /* renamed from: a */
    public static boolean m45405a() {
        if (C24677a.m47209a(C24006ab.class)) {
            return false;
        }
        try {
            m45414i();
            return f56838d.mo39492a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m45407b() {
        if (C24677a.m47209a(C24006ab.class)) {
            return false;
        }
        try {
            m45414i();
            return f56839e.mo39492a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m45408c() {
        if (C24677a.m47209a(C24006ab.class)) {
            return false;
        }
        try {
            m45414i();
            return f56840f.mo39492a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m45409d() {
        if (C24677a.m47209a(C24006ab.class)) {
            return false;
        }
        try {
            m45414i();
            return f56841g.mo39492a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m45410e() {
        if (C24677a.m47209a(C24006ab.class)) {
            return false;
        }
        try {
            m45414i();
            return f56842h.mo39492a();
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return false;
        }
    }

    /* renamed from: f */
    static /* synthetic */ C24008a m45411f() {
        if (C24677a.m47209a(C24006ab.class)) {
            return null;
        }
        try {
            return f56840f;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ C24008a m45412g() {
        if (C24677a.m47209a(C24006ab.class)) {
            return null;
        }
        try {
            return f56841g;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return null;
        }
    }

    /* renamed from: h */
    static /* synthetic */ AtomicBoolean m45413h() {
        if (C24677a.m47209a(C24006ab.class)) {
            return null;
        }
        try {
            return f56837c;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24006ab.class);
            return null;
        }
    }

    /* renamed from: l */
    private static void m45417l() {
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                if (!f56836b.get()) {
                    throw new C24889n("The UserSettingManager has not been initialized successfully");
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24006ab.class);
            }
        }
    }

    static {
        Covode.recordClassIndex(28127);
    }

    /* renamed from: j */
    private static void m45415j() {
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                m45406b(f56841g);
                final long currentTimeMillis = System.currentTimeMillis();
                if (f56841g.f56846b == null || currentTimeMillis - f56841g.f56848d >= 604800000) {
                    f56841g.f56846b = null;
                    f56841g.f56848d = 0;
                    if (f56837c.compareAndSet(false, true)) {
                        C24872m.m47689c().execute(new Runnable() {
                            /* class com.facebook.C24006ab.RunnableC240071 */

                            static {
                                Covode.recordClassIndex(28128);
                            }

                            public final void run() {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        if (C24006ab.m45411f().mo39492a()) {
                                            C24699ae.m47299a();
                                            C24768q a = C24770r.m47427a(C24872m.f59041a, false);
                                            if (a != null && a.f58764l) {
                                                C24699ae.m47299a();
                                                C24710b a2 = C24710b.m47327a(C24872m.f59047g);
                                                if (!(a2 == null || a2.mo40546a() == null || a2.mo40546a() == null)) {
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("advertiser_id", a2.mo40546a());
                                                    bundle.putString("fields", "auto_event_setup_enabled");
                                                    C24699ae.m47299a();
                                                    GraphRequest a3 = GraphRequest.m45068a(C24872m.f59041a);
                                                    a3.f56463n = true;
                                                    a3.f56459j = bundle;
                                                    JSONObject jSONObject = GraphRequest.m45069a(a3).f59153b;
                                                    if (jSONObject != null) {
                                                        C24006ab.m45412g().f56846b = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                                                        C24006ab.m45412g().f56848d = currentTimeMillis;
                                                        C24008a g = C24006ab.m45412g();
                                                        if (!C24677a.m47209a(C24006ab.class)) {
                                                            try {
                                                                C24006ab.m45404a(g);
                                                            } catch (Throwable th) {
                                                                C24677a.m47208a(th, C24006ab.class);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        C24006ab.m45413h().set(false);
                                    } catch (Throwable th2) {
                                        C24677a.m47208a(th2, this);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24006ab.class);
            }
        }
    }

    /* renamed from: i */
    private static void m45414i() {
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                if (C24872m.m47685a()) {
                    int i = 0;
                    if (f56836b.compareAndSet(false, true)) {
                        C24699ae.m47299a();
                        f56843i = C34822d.m71158a(C24872m.f59047g, "com.facebook.sdk.USER_SETTINGS", 0);
                        C24008a[] aVarArr = {f56839e, f56840f, f56838d};
                        if (!C24677a.m47209a(C24006ab.class)) {
                            do {
                                try {
                                    C24008a aVar = aVarArr[i];
                                    if (aVar == f56841g) {
                                        m45415j();
                                    } else if (aVar.f56846b == null) {
                                        m45406b(aVar);
                                        if (aVar.f56846b == null && !C24677a.m47209a(C24006ab.class)) {
                                            try {
                                                m45417l();
                                                try {
                                                    C24699ae.m47299a();
                                                    Context context = C24872m.f59047g;
                                                    ApplicationInfo a = m45403a(context.getPackageManager(), context.getPackageName());
                                                    if (!(a == null || a.metaData == null || !a.metaData.containsKey(aVar.f56845a))) {
                                                        aVar.f56846b = Boolean.valueOf(a.metaData.getBoolean(aVar.f56845a, aVar.f56847c));
                                                    }
                                                } catch (PackageManager.NameNotFoundException e) {
                                                    C24693ad.m47255a(f56835a, (Exception) e);
                                                }
                                            } catch (Throwable th) {
                                                C24677a.m47208a(th, C24006ab.class);
                                            }
                                        }
                                    } else {
                                        m45404a(aVar);
                                    }
                                    i++;
                                } catch (Throwable th2) {
                                    C24677a.m47208a(th2, C24006ab.class);
                                }
                            } while (i < 3);
                        }
                        m45415j();
                        if (!C24677a.m47209a(C24006ab.class)) {
                            try {
                                C24699ae.m47299a();
                                Context context2 = C24872m.f59047g;
                                ApplicationInfo a2 = m45403a(context2.getPackageManager(), context2.getPackageName());
                                if (!(a2 == null || a2.metaData == null)) {
                                    a2.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                                    a2.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                                    m45408c();
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            } catch (Throwable th3) {
                                C24677a.m47208a(th3, C24006ab.class);
                            }
                        }
                        m45416k();
                    }
                }
            } catch (Throwable th4) {
                C24677a.m47208a(th4, C24006ab.class);
            }
        }
    }

    /* renamed from: k */
    private static void m45416k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                if (f56836b.get() && C24872m.m47685a()) {
                    C24699ae.m47299a();
                    Context context = C24872m.f59047g;
                    int i7 = 0;
                    if (f56838d.mo39492a()) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    int i8 = (i << 0) | 0;
                    if (f56839e.mo39492a()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    int i9 = i8 | (i2 << 1);
                    if (f56840f.mo39492a()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i10 = i9 | (i3 << 2);
                    if (f56842h.mo39492a()) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i11 = i10 | (i4 << 3);
                    int i12 = f56843i.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                    if (i12 != i11) {
                        f56843i.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i11).commit();
                        try {
                            ApplicationInfo a = m45403a(context.getPackageManager(), context.getPackageName());
                            if (!(a == null || a.metaData == null)) {
                                String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                                boolean[] zArr = {true, true, true, true};
                                int i13 = 0;
                                i5 = 0;
                                i7 = 0;
                                while (true) {
                                    try {
                                        if (a.metaData.containsKey(strArr[i13])) {
                                            i6 = 1;
                                        } else {
                                            i6 = 0;
                                        }
                                        i7 |= i6 << i13;
                                        i5 |= (a.metaData.getBoolean(strArr[i13], zArr[i13]) ? 1 : 0) << i13;
                                        i13++;
                                        if (i13 >= 4) {
                                            break;
                                        }
                                    } catch (PackageManager.NameNotFoundException unused) {
                                    }
                                }
                                C23998m mVar = new C23998m(context);
                                Bundle bundle = new Bundle();
                                bundle.putInt("usage", i7);
                                bundle.putInt("initial", i5);
                                bundle.putInt("previous", i12);
                                bundle.putInt("current", i11);
                                mVar.mo39475a(bundle);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                        i5 = 0;
                        C23998m mVar2 = new C23998m(context);
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("usage", i7);
                        bundle2.putInt("initial", i5);
                        bundle2.putInt("previous", i12);
                        bundle2.putInt("current", i11);
                        mVar2.mo39475a(bundle2);
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24006ab.class);
            }
        }
    }

    /* renamed from: a */
    static void m45404a(C24008a aVar) {
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                m45417l();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("value", aVar.f56846b);
                    jSONObject.put("last_timestamp", aVar.f56848d);
                    f56843i.edit().putString(aVar.f56845a, jSONObject.toString()).commit();
                    m45416k();
                } catch (Exception e) {
                    C24693ad.m47255a(f56835a, e);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24006ab.class);
            }
        }
    }

    /* renamed from: b */
    private static void m45406b(C24008a aVar) {
        if (!C24677a.m47209a(C24006ab.class)) {
            try {
                m45417l();
                try {
                    String string = f56843i.getString(aVar.f56845a, "");
                    if (!string.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(string);
                        aVar.f56846b = Boolean.valueOf(jSONObject.getBoolean("value"));
                        aVar.f56848d = jSONObject.getLong("last_timestamp");
                    }
                } catch (JSONException e) {
                    C24693ad.m47255a(f56835a, (Exception) e);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C24006ab.class);
            }
        }
    }

    /* renamed from: a */
    public static ApplicationInfo m45403a(PackageManager packageManager, String str) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName())) {
            return packageManager.getApplicationInfo(str, 128);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, 128);
        }
        return C58014b.f132218a;
    }
}
