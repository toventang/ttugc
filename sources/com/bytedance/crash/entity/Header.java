package com.bytedance.crash.entity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C14026q;
import com.bytedance.crash.util.C14062n;
import com.bytedance.crash.util.C14073u;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class Header {

    /* renamed from: b */
    private static final String[] f33749b = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d */
    private static String f33750d;

    /* renamed from: e */
    private static int f33751e = -1;

    /* renamed from: f */
    private static int f33752f = -1;

    /* renamed from: a */
    public final JSONObject f33753a = new JSONObject();

    /* renamed from: c */
    private final Context f33754c;

    /* renamed from: c */
    public final JSONObject mo22332c() {
        return mo22330a(C13933m.m25221a().mo22518a());
    }

    static {
        Covode.recordClassIndex(15920);
    }

    /* renamed from: e */
    public final void mo22334e() {
        try {
            long e = C13933m.m25221a().mo22522e();
            if (e > 0) {
                this.f33753a.put("user_id", e);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m25040a() {
        if (f33751e == -1) {
            f33751e = m25046f().contains("64") ? 1 : 0;
        }
        if (f33751e == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m25042b() {
        if (f33752f == -1) {
            f33752f = m25046f().contains("86") ? 1 : 0;
        }
        if (f33752f == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo22333d() {
        try {
            this.f33753a.put("device_id", C13933m.m25226b().mo22549a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private static String m25046f() {
        if (f33750d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                        sb.append(Build.SUPPORTED_ABIS[i]);
                        if (i != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f33750d = "unknown";
                }
                f33750d = sb.toString();
            } catch (Exception unused) {
                C13933m.f33942g.isDebugMode();
                f33750d = "unknown";
            }
        }
        return f33750d;
    }

    public Header(Context context) {
        this.f33754c = context;
    }

    /* renamed from: a */
    public static Header m25037a(Context context) {
        Header header = new Header(context);
        m25045d(header.f33753a);
        return header;
    }

    /* renamed from: a */
    public static void m25039a(Header header) {
        if (header != null) {
            addOtherHeader(header.f33753a);
        }
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", C14073u.m25648a(C14073u.m25646a(C13933m.f33936a)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static Header m25041b(Context context) {
        Header a = m25037a(context);
        addRuntimeHeader(a.f33753a);
        m25039a(a);
        a.mo22332c();
        a.mo22333d();
        a.mo22334e();
        return a;
    }

    /* renamed from: c */
    public static boolean m25044c(JSONObject jSONObject) {
        if (C14062n.m25597a(jSONObject)) {
            return true;
        }
        String optString = jSONObject.optString("aid");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        try {
            if (Integer.parseInt(optString) <= 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: d */
    private static void m25045d(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 3010663);
            jSONObject.put("sdk_version_name", "3.1.6-rc.13-ttp");
            jSONObject.put("bytrace_id", C13933m.m25231g());
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static boolean m25043b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        if ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final JSONObject mo22330a(Map<String, Object> map) {
        if (map == null) {
            try {
                return this.f33753a;
            } catch (Throwable unused) {
            }
        } else {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f33753a.has(entry.getKey())) {
                    this.f33753a.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f33749b;
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    try {
                        this.f33753a.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused2) {
                        this.f33753a.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f33753a.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused3) {
                }
            }
            if (map.containsKey("version_name")) {
                this.f33753a.put("app_version", map.get("version_name"));
                this.f33753a.remove("version_name");
            }
            this.f33753a.put("version_get_time", 0);
            return this.f33753a;
        }
    }

    /* renamed from: a */
    public final void mo22331a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C14062n.m25593a(this.f33753a, next, jSONObject.opt(next));
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(32:3|4|5|6|(1:8)(2:9|(1:11)(6:16|(1:18)(1:29)|19|(1:23)|24|(1:26)))|12|(1:14)|15|30|(2:32|(1:34))(2:35|(2:37|(1:41))(2:42|(2:44|(1:46))(4:48|(1:55)(1:52)|53|(1:56)(2:57|(2:62|(6:67|(2:69|(1:73))|74|(1:76)|77|(1:79))(1:66))(1:61)))))|47|80|81|(2:83|(2:85|(1:87)(1:90))(1:88))(1:89)|91|92|93|(1:95)(2:96|(1:98))|99|100|102|103|(1:105)(1:112)|106|(1:111)|108|(2:110|113)(1:(1:117))|118|(1:122)|123|124|126) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x039c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x025c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x02a9 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02da A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0308 A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0309 A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031d A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0322 A[ADDED_TO_REGION, Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026c A[Catch:{ Exception -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027a A[Catch:{ Exception -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b9 A[Catch:{ Exception -> 0x02c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02bc A[Catch:{ Exception -> 0x02c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void addOtherHeader(org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 928
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.entity.Header.addOtherHeader(org.json.JSONObject):void");
    }

    /* renamed from: a */
    public static C13864b m25038a(String str, Context context, long j, long j2) {
        C13864b bVar;
        Header header;
        long j3 = j2;
        C14026q a = C14026q.m25432a();
        if (j3 == 0) {
            j3 = System.currentTimeMillis();
        }
        JSONObject a2 = a.mo22539a(str, j, j3);
        if (a2 == null || a2.length() == 0) {
            bVar = new C13864b();
            header = m25037a(context);
            header.mo22332c();
            try {
                header.f33753a.put("version_get_time", System.currentTimeMillis());
            } catch (Throwable unused) {
            }
        } else {
            bVar = new C13864b(a2);
            header = new Header(C13933m.f33936a);
            header.mo22331a(a2.optJSONObject("header"));
        }
        header.mo22333d();
        m25039a(header);
        bVar.mo22338a(header);
        return bVar;
    }
}
