package com.p2082ss.android.deviceregister.p2135b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.C29734b;
import com.p2082ss.android.deviceregister.AbstractC29900f;
import com.p2082ss.android.deviceregister.AbstractC29901g;
import com.p2082ss.android.deviceregister.C29889c;
import com.p2082ss.android.deviceregister.C29892d;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.deviceregister.p2134a.AbstractC29867b;
import com.p2082ss.android.deviceregister.p2134a.AbstractC29868c;
import com.p2082ss.android.deviceregister.p2134a.C29866a;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.deviceregister.p2135b.p2136a.AbstractC29873a;
import com.p2082ss.android.deviceregister.p2139d.C29893a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33719a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.ss.android.deviceregister.b.d */
public abstract class AbstractC29885d {

    /* renamed from: A */
    public static boolean f71287A = false;

    /* renamed from: a */
    public static AbstractC29867b f71288a;

    /* renamed from: b */
    public static final Object f71289b = new Object();

    /* renamed from: c */
    public static AbstractC29868c f71290c;

    /* renamed from: d */
    public static volatile AbstractC29901g f71291d;

    /* renamed from: f */
    public static final Bundle f71292f = new Bundle();

    /* renamed from: g */
    public static volatile boolean f71293g = false;

    /* renamed from: h */
    public static volatile boolean f71294h = false;

    /* renamed from: i */
    public static volatile boolean f71295i = false;

    /* renamed from: p */
    public static long f71296p = 0;

    /* renamed from: u */
    public static volatile boolean f71297u = false;

    /* renamed from: y */
    public static List<WeakReference<DeviceRegisterManager.AbstractC29864a>> f71298y = Collections.synchronizedList(new ArrayList());

    /* renamed from: z */
    public static final ThreadLocal<Boolean> f71299z = new ThreadLocal<>();

    /* renamed from: e */
    public final Object f71300e = new Object();

    /* renamed from: j */
    public volatile boolean f71301j;

    /* renamed from: k */
    public int f71302k;

    /* renamed from: l */
    protected final AbstractC29873a f71303l;

    /* renamed from: m */
    public final Context f71304m;

    /* renamed from: n */
    public final SharedPreferences f71305n;

    /* renamed from: o */
    public JSONObject f71306o;

    /* renamed from: q */
    public long f71307q = 0;

    /* renamed from: r */
    public long f71308r = 0;

    /* renamed from: s */
    public long f71309s = 0;

    /* renamed from: t */
    public String f71310t;

    /* renamed from: v */
    public String f71311v;

    /* renamed from: w */
    public C29887a f71312w;

    /* renamed from: x */
    public volatile AbstractC29900f f71313x;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo52172a(String str, String str2);

    /* renamed from: c */
    public final String mo52177c() {
        return this.f71303l.mo52156b();
    }

    /* renamed from: com.ss.android.deviceregister.b.d$a */
    public class C29887a extends Thread {

        /* renamed from: a */
        int f71315a;

        static {
            Covode.recordClassIndex(36297);
        }

        /* renamed from: b */
        private static boolean m60248b() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: c */
        private static boolean m60249c() {
            if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132253e;
            }
            boolean b = m60248b();
            C58029j.f132253e = b;
            return b;
        }

        /* renamed from: a */
        public final void mo52181a() {
            Pair<String, Boolean> a;
            boolean z;
            int i;
            MethodCollector.m26663i(2367);
            if (AbstractC29885d.f71294h) {
                MethodCollector.m26664o(2367);
                return;
            }
            try {
                AbstractC29885d.this.f71308r = System.currentTimeMillis();
                if (!m60249c()) {
                    MethodCollector.m26664o(2367);
                    return;
                }
                String b = C29869d.m60196b(AbstractC29885d.this.f71304m);
                if (!C13627m.m24498a(b)) {
                    AbstractC29885d.this.f71306o.put("user_agent", b);
                }
                if (!C13627m.m24498a(AbstractC29885d.this.f71311v)) {
                    AbstractC29885d.this.f71306o.put("app_track", AbstractC29885d.this.f71311v);
                }
                JSONObject jSONObject = new JSONObject(new JSONTokener(AbstractC29885d.this.f71306o.toString()));
                jSONObject.put("req_id", DeviceRegisterManager.getRequestId());
                if (AbstractC29885d.this.f71301j) {
                    jSONObject.put("scene", 2);
                }
                try {
                    Bundle bundle = new Bundle();
                    synchronized (AbstractC29885d.f71292f) {
                        try {
                            bundle.putAll(AbstractC29885d.f71292f);
                        } catch (Throwable th) {
                            MethodCollector.m26664o(2367);
                            throw th;
                        }
                    }
                    if (bundle.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : bundle.keySet()) {
                            jSONObject2.put(str, m60245a(bundle, str));
                        }
                        jSONObject.put("custom", jSONObject2);
                    }
                    String str2 = C29734b.f70908b;
                    String str3 = C29734b.f70909c;
                    if (!AbstractC29885d.this.f71301j && !DeviceRegisterManager.isNewUserMode(AbstractC29885d.this.f71304m) && (a = C29892d.m60259a(AbstractC29885d.this.f71304m)) != null) {
                        if (a.second == null || !((Boolean) a.second).booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("gaid_limited", i);
                        jSONObject.put("google_aid", a.first);
                    }
                    if (!C13627m.m24498a(str2)) {
                        jSONObject.put("app_language", str2);
                    }
                    if (!C13627m.m24498a(str3)) {
                        jSONObject.put("app_region", str3);
                    }
                } catch (Throwable unused) {
                }
                AbstractC29885d.this.mo52174a(jSONObject);
                jSONObject.put("sdk_version", "2.12.1-rc.30-delay");
                jSONObject.put("sdk_flavor", "global");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("magic_tag", "ss_app_log");
                jSONObject3.put("header", jSONObject);
                jSONObject3.put("_gen_time", System.currentTimeMillis());
                AbstractC29885d.f71294h = true;
                AbstractC29885d.f71299z.set(Boolean.TRUE);
                boolean a2 = m60246a(this, jSONObject3.toString());
                synchronized (AbstractC29885d.f71289b) {
                    try {
                        AbstractC29885d.f71294h = false;
                        try {
                            AbstractC29885d.f71289b.notifyAll();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } finally {
                        MethodCollector.m26664o(2367);
                    }
                }
                AbstractC29885d.f71293g = true;
                AbstractC29885d.f71299z.remove();
                if (!a2) {
                    AbstractC29885d.m60236a(false, C13627m.m24498a(AbstractC29885d.this.f71303l.mo52158c()));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(2367);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f3, code lost:
            if (r1 != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0110, code lost:
            monitor-enter(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            mo52181a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0114, code lost:
            monitor-exit(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x011f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0121, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(2287);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0124, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 306
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.p2135b.AbstractC29885d.C29887a.run():void");
        }

        public C29887a() {
            super("DeviceRegisterThread");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0160, code lost:
            if (r0 == false) goto L_0x0174;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
            if (r11 != false) goto L_0x01b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x00f5, code lost:
            continue;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x00f5, code lost:
            continue;
         */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01a1  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m60247a(java.lang.String r16) {
            /*
            // Method dump skipped, instructions count: 515
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.deviceregister.p2135b.AbstractC29885d.C29887a.m60247a(java.lang.String):boolean");
        }

        /* renamed from: a */
        private static Object m60245a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        /* renamed from: a */
        private static boolean m60246a(C29887a aVar, String str) {
            Boolean bool = false;
            if (bool.booleanValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("header");
                    if (optJSONObject != null) {
                        optJSONObject.put("version_code", C33719a.f79882b);
                        jSONObject.put("header", optJSONObject);
                    }
                    str = jSONObject.toString();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return aVar.m60247a(str);
        }
    }

    /* renamed from: b */
    public final String mo52176b() {
        if (this.f71301j) {
            return "";
        }
        return this.f71303l.mo52153a();
    }

    /* renamed from: d */
    public final void mo52178d() {
        synchronized (this.f71300e) {
            this.f71300e.notifyAll();
        }
    }

    /* renamed from: a */
    public final String mo52173a() {
        return this.f71303l.mo52158c();
    }

    static {
        Covode.recordClassIndex(36295);
    }

    /* renamed from: e */
    public final void mo52179e() {
        DeviceRegisterManager.AbstractC29864a aVar;
        String c = this.f71303l.mo52158c();
        String str = this.f71310t;
        synchronized (C29869d.f71256j) {
            if (C29869d.f71254h != null) {
                try {
                    C29869d.f71254h.put("device_id", c);
                    C29869d.f71254h.put("install_id", str);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        int size = f71298y.size();
        for (int i = 0; i < size; i++) {
            WeakReference<DeviceRegisterManager.AbstractC29864a> weakReference = f71298y.get(i);
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                try {
                    aVar.mo29064a(this.f71303l.mo52158c(), this.f71310t);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static String m60234a(Context context) {
        try {
            return C29889c.m60251a(context).mo52158c();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo52174a(JSONObject jSONObject) {
        boolean z;
        if (f71291d != null) {
            jSONObject.put("pre_installed_channel", f71291d.mo52188a());
        }
        try {
            int i = 0;
            PackageInfo packageInfo = this.f71304m.getPackageManager().getPackageInfo(this.f71304m.getPackageName(), 0);
            if (packageInfo != null) {
                jSONObject.put("apk_first_install_time", packageInfo.firstInstallTime);
                if ((packageInfo.applicationInfo.flags & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = 1;
                }
                jSONObject.put("is_system_app", i);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo52175a(boolean z) {
        this.f71310t = null;
        this.f71301j = z;
        this.f71303l.mo52157b("device_id");
        this.f71303l.mo52157b("install_id");
        this.f71303l.mo52157b("clientudid");
        C29866a.m60186a(this.f71304m).edit().remove("install_id").apply();
        C34822d.m71158a(this.f71304m, "com.ss.android.deviceregister.utils.Cdid", 0).edit().putString("cdid", null).apply();
        C29893a.f71331a = new C29893a.C29894a((byte) 0);
        JSONObject jSONObject = new JSONObject();
        C29869d.f71254h = null;
        C29869d.m60195a(this.f71304m, jSONObject, z);
        this.f71306o = jSONObject;
    }

    /* renamed from: a */
    protected static void m60235a(String str, JSONObject jSONObject) {
        AbstractC29868c cVar = f71290c;
        if (cVar != null) {
            cVar.mo52023a(str, jSONObject);
        }
    }

    public AbstractC29885d(Context context, boolean z) {
        this.f71304m = context;
        this.f71303l = C29889c.m60251a(context);
        this.f71305n = C29866a.m60186a(context);
        this.f71301j = z;
    }

    /* renamed from: a */
    public static void m60236a(boolean z, boolean z2) {
        DeviceRegisterManager.AbstractC29864a aVar;
        int size = f71298y.size();
        for (int i = 0; i < size; i++) {
            WeakReference<DeviceRegisterManager.AbstractC29864a> weakReference = f71298y.get(i);
            if (!(weakReference == null || (aVar = weakReference.get()) == null)) {
                try {
                    aVar.mo29066a(z, z2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
