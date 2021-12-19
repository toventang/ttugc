package com.facebook.p1814a.p1816b;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.AccessToken;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24710b;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.b */
public final class C23889b {

    /* renamed from: a */
    public static final C23907f f56557a = new C23907f();

    /* renamed from: b */
    public static SensorManager f56558b;

    /* renamed from: c */
    public static C23901e f56559c;

    /* renamed from: d */
    public static final AtomicBoolean f56560d = new AtomicBoolean(true);

    /* renamed from: e */
    static final AtomicBoolean f56561e = new AtomicBoolean(false);

    /* renamed from: f */
    static volatile Boolean f56562f = false;

    /* renamed from: g */
    private static String f56563g;

    /* renamed from: h */
    private static AbstractC23893a f56564h = new AbstractC23893a() {
        /* class com.facebook.p1814a.p1816b.C23889b.C238901 */

        static {
            Covode.recordClassIndex(28011);
        }

        @Override // com.facebook.p1814a.p1816b.C23889b.AbstractC23893a
        /* renamed from: a */
        public final void mo39386a(String str) {
            if (!C24677a.m47209a(C23889b.class)) {
                try {
                    if (!C23889b.f56562f.booleanValue()) {
                        C23889b.f56562f = true;
                        C24872m.m47689c().execute(new Runnable(str) {
                            /* class com.facebook.p1814a.p1816b.C23889b.RunnableC238923 */

                            /* renamed from: a */
                            final /* synthetic */ String f56567a;

                            static {
                                Covode.recordClassIndex(28013);
                            }

                            public final void run() {
                                String str;
                                String str2 = "0";
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        boolean z = true;
                                        GraphRequest a = GraphRequest.m45067a((AccessToken) null, C1764a.m5929a(Locale.US, "%s/app_indexing_session", new Object[]{this.f56567a}), (JSONObject) null, (GraphRequest.AbstractC23858b) null);
                                        Bundle bundle = a.f56459j;
                                        if (bundle == null) {
                                            bundle = new Bundle();
                                        }
                                        C24699ae.m47299a();
                                        C24710b a2 = C24710b.m47327a(C24872m.f59047g);
                                        JSONArray jSONArray = new JSONArray();
                                        if (Build.MODEL != null) {
                                            str = Build.MODEL;
                                        } else {
                                            str = "";
                                        }
                                        jSONArray.put(str);
                                        if (a2 == null || a2.mo40546a() == null) {
                                            jSONArray.put("");
                                        } else {
                                            jSONArray.put(a2.mo40546a());
                                        }
                                        jSONArray.put(str2);
                                        if (Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || ((Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT))) {
                                            str2 = "1";
                                        }
                                        jSONArray.put(str2);
                                        Locale d = C24693ad.m47276d();
                                        jSONArray.put(d.getLanguage() + "_" + d.getCountry());
                                        String jSONArray2 = jSONArray.toString();
                                        bundle.putString("device_session_id", C23889b.m45175b());
                                        bundle.putString("extinfo", jSONArray2);
                                        a.f56459j = bundle;
                                        JSONObject jSONObject = GraphRequest.m45069a(a).f59153b;
                                        AtomicBoolean e = C23889b.m45178e();
                                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                                            z = false;
                                        }
                                        e.set(z);
                                        if (!C23889b.m45178e().get()) {
                                            C23889b.m45179f();
                                        } else if (C23889b.m45180g() != null) {
                                            C23889b.m45180g().mo39397a();
                                        }
                                        C23889b.m45172a(false);
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, this);
                                    }
                                }
                            }

                            {
                                this.f56567a = r1;
                            }
                        });
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, C23889b.class);
                }
            }
        }
    };

    /* renamed from: com.facebook.a.b.b$a */
    public interface AbstractC23893a {
        static {
            Covode.recordClassIndex(28014);
        }

        /* renamed from: a */
        void mo39386a(String str);
    }

    /* renamed from: a */
    public static boolean m45174a() {
        C24677a.m47209a(C23889b.class);
        return false;
    }

    /* renamed from: b */
    static String m45175b() {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            if (f56563g == null) {
                f56563g = UUID.randomUUID().toString();
            }
            return f56563g;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    /* renamed from: c */
    static boolean m45176c() {
        if (C24677a.m47209a(C23889b.class)) {
            return false;
        }
        try {
            return f56561e.get();
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return false;
        }
    }

    /* renamed from: d */
    static /* synthetic */ AbstractC23893a m45177d() {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            return f56564h;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    /* renamed from: e */
    static /* synthetic */ AtomicBoolean m45178e() {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            return f56561e;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ String m45179f() {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            f56563g = null;
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    /* renamed from: g */
    static /* synthetic */ C23901e m45180g() {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            return f56559c;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28010);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m45172a(Boolean bool) {
        if (C24677a.m47209a(C23889b.class)) {
            return null;
        }
        try {
            f56562f = bool;
            return bool;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23889b.class);
            return null;
        }
    }

    /* renamed from: a */
    public static Object m45173a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9205);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9205);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
