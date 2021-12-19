package com.facebook.internal.p1894a;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.b */
public final class C24673b {

    /* renamed from: a */
    public Long f58601a;

    /* renamed from: b */
    private String f58602b;

    /* renamed from: c */
    private EnumC24676b f58603c;

    /* renamed from: d */
    private JSONArray f58604d;

    /* renamed from: e */
    private String f58605e;

    /* renamed from: f */
    private String f58606f;

    /* renamed from: g */
    private String f58607g;

    static {
        Covode.recordClassIndex(28826);
    }

    /* renamed from: c */
    public final void mo40504c() {
        C24686d.m47222b(this.f58602b);
    }

    /* renamed from: d */
    private JSONObject m47201d() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f58604d;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l = this.f58601a;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo40503b() {
        if (mo40502a()) {
            C24686d.m47219a(this.f58602b, toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.a.b$1 */
    public static /* synthetic */ class C246741 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58608a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 28827(0x709b, float:4.0395E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.internal.a.b$b[] r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.internal.p1894a.C24673b.C246741.f58608a = r2
                com.facebook.internal.a.b$b r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.Analysis     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.internal.p1894a.C24673b.C246741.f58608a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.CrashReport     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.internal.p1894a.C24673b.C246741.f58608a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.CrashShield     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.facebook.internal.p1894a.C24673b.C246741.f58608a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.facebook.internal.a.b$b r0 = com.facebook.internal.p1894a.C24673b.EnumC24676b.ThreadCheck     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p1894a.C24673b.C246741.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.a.b$b */
    public enum EnumC24676b {
        Unknown,
        Analysis,
        CrashReport,
        CrashShield,
        ThreadCheck;

        public final String getLogPrefix() {
            int i = C246741.f58608a[ordinal()];
            if (i == 1) {
                return "analysis_log_";
            }
            if (i == 2) {
                return "crash_log_";
            }
            if (i == 3) {
                return "shield_log_";
            }
            if (i != 4) {
                return "Unknown";
            }
            return "thread_check_log_";
        }

        public final String toString() {
            int i = C246741.f58608a[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "CrashReport";
            }
            if (i == 3) {
                return "CrashShield";
            }
            if (i != 4) {
                return "Unknown";
            }
            return "ThreadCheck";
        }

        static {
            Covode.recordClassIndex(28829);
        }
    }

    /* renamed from: a */
    public final boolean mo40502a() {
        int i = C246741.f58608a[this.f58603c.ordinal()];
        if (i != 1) {
            if ((i != 2 && i != 3 && i != 4) || this.f58607g == null || this.f58601a == null) {
                return false;
            }
            return true;
        } else if (this.f58604d == null || this.f58601a == null) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r3 = this;
            int[] r1 = com.facebook.internal.p1894a.C24673b.C246741.f58608a
            com.facebook.internal.a.b$b r0 = r3.f58603c
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L_0x001d
            r0 = 2
            if (r2 == r0) goto L_0x0018
            r0 = 3
            if (r2 == r0) goto L_0x0018
            r0 = 4
            if (r2 == r0) goto L_0x0018
        L_0x0017:
            return r1
        L_0x0018:
            org.json.JSONObject r0 = r3.m47202e()
            goto L_0x0021
        L_0x001d:
            org.json.JSONObject r0 = r3.m47201d()
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0017
        L_0x0024:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.p1894a.C24673b.toString():java.lang.String");
    }

    /* renamed from: e */
    private JSONObject m47202e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.f58605e;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l = this.f58601a;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            String str2 = this.f58606f;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.f58607g;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            EnumC24676b bVar = this.f58603c;
            if (bVar != null) {
                jSONObject.put(StringSet.type, bVar);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: com.facebook.internal.a.b$a */
    public static class C24675a {
        static {
            Covode.recordClassIndex(28828);
        }

        /* renamed from: a */
        public static C24673b m47206a(File file) {
            return new C24673b(file, (byte) 0);
        }

        /* renamed from: a */
        public static C24673b m47207a(Throwable th, EnumC24676b bVar) {
            return new C24673b(th, bVar, (byte) 0);
        }
    }

    private C24673b(JSONArray jSONArray) {
        this.f58603c = EnumC24676b.Analysis;
        this.f58601a = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f58604d = jSONArray;
        this.f58602b = new StringBuffer("analysis_log_").append(this.f58601a.toString()).append(".json").toString();
    }

    private C24673b(File file) {
        EnumC24676b bVar;
        String name = file.getName();
        this.f58602b = name;
        if (name.startsWith("crash_log_")) {
            bVar = EnumC24676b.CrashReport;
        } else if (name.startsWith("shield_log_")) {
            bVar = EnumC24676b.CrashShield;
        } else if (name.startsWith("thread_check_log_")) {
            bVar = EnumC24676b.ThreadCheck;
        } else if (name.startsWith("analysis_log_")) {
            bVar = EnumC24676b.Analysis;
        } else {
            bVar = EnumC24676b.Unknown;
        }
        this.f58603c = bVar;
        JSONObject a = C24686d.m47218a(this.f58602b);
        if (a != null) {
            this.f58601a = Long.valueOf(a.optLong("timestamp", 0));
            this.f58605e = a.optString("app_version", null);
            this.f58606f = a.optString("reason", null);
            this.f58607g = a.optString("callstack", null);
            this.f58604d = a.optJSONArray("feature_names");
        }
    }

    /* synthetic */ C24673b(File file, byte b) {
        this(file);
    }

    /* synthetic */ C24673b(JSONArray jSONArray, byte b) {
        this(jSONArray);
    }

    private C24673b(Throwable th, EnumC24676b bVar) {
        String th2;
        this.f58603c = bVar;
        this.f58605e = C24693ad.m47232a();
        if (th == null) {
            th2 = null;
        } else if (th.getCause() == null) {
            th2 = th.toString();
        } else {
            th2 = th.getCause().toString();
        }
        this.f58606f = th2;
        this.f58607g = C24686d.m47217a(th);
        this.f58601a = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f58602b = new StringBuffer().append(bVar.getLogPrefix()).append(this.f58601a.toString()).append(".json").toString();
    }

    /* synthetic */ C24673b(Throwable th, EnumC24676b bVar, byte b) {
        this(th, bVar);
    }
}
