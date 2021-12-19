package com.bytedance.crash.runtime;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14079z;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.p2082ss.android.ugc.aweme.miniapp.C59265a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.d */
public final class C14004d {

    /* renamed from: d */
    private static JSONObject f34139d;

    /* renamed from: a */
    public final ICommonParams f34140a;

    /* renamed from: b */
    private final Context f34141b;

    /* renamed from: c */
    private final ICommonParams f34142c;

    static {
        Covode.recordClassIndex(16069);
    }

    /* renamed from: c */
    public final String mo22520c() {
        try {
            return this.f34140a.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    public final String mo22521d() {
        try {
            return this.f34140a.getSessionId();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public final long mo22522e() {
        try {
            return this.f34140a.getUserId();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private String m25379f() {
        try {
            return String.valueOf(this.f34140a.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo22518a() {
        Map<String, Object> b = mo22519b();
        if (m25376a(b, "aid") == null) {
            b.put("aid", 4444);
        }
        return b;
    }

    /* renamed from: b */
    public final Map<String, Object> mo22519b() {
        Throwable th;
        Map<String, Object> map;
        Object obj = null;
        try {
            ICommonParams iCommonParams = this.f34142c;
            if (iCommonParams != null) {
                map = iCommonParams.getCommonParams();
            } else {
                map = new HashMap<>();
            }
            try {
                map.putAll(this.f34140a.getCommonParams());
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map == null) {
            map = new HashMap<>(4);
            if (th != null) {
                try {
                    map.put("err_info", C14042ab.m25488a(th));
                    map.put("params_err", "crash while getting params");
                } catch (Throwable unused) {
                }
            } else {
                map.put("params_err", "empty params");
            }
        }
        if (m25378a(map)) {
            try {
                PackageInfo packageInfo = this.f34141b.getPackageManager().getPackageInfo(this.f34141b.getPackageName(), 128);
                map.put("version_name", packageInfo.versionName);
                map.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map.get("update_version_code") == null) {
                    if (packageInfo.applicationInfo.metaData != null) {
                        obj = m25374a(packageInfo.applicationInfo.metaData, "UPDATE_VERSION_CODE");
                    }
                    if (obj == null) {
                        obj = map.get("version_code");
                    }
                    map.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map.put("version_name", C14044b.m25521d(this.f34141b));
                map.put("version_code", Integer.valueOf(C14044b.m25522e(this.f34141b)));
                if (map.get("update_version_code") == null) {
                    map.put("update_version_code", map.get("version_code"));
                }
            }
            if (!map.containsKey("params_err")) {
                map.put("params_err", "unavailable params");
            }
        } else {
            try {
                String str = this.f34141b.getPackageManager().getPackageInfo(this.f34141b.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f34141b.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        map.putAll(C14079z.m25673a());
        JSONObject jSONObject = f34139d;
        if (jSONObject != null) {
            map.put("mp_params", jSONObject);
        }
        map.put("first_update_launch", Integer.valueOf(C14026q.m25432a().mo22537a(String.valueOf(map.get("update_version_code")))));
        return map;
    }

    /* renamed from: a */
    public static String m25375a(C14004d dVar) {
        ICommonParams iCommonParams = dVar.f34140a;
        if (iCommonParams instanceof NpthCoreInitTask.C58370a) {
            try {
                String valueOf = String.valueOf(C17867d.f42590n);
                if ("3902".equals(((NpthCoreInitTask.C58370a) iCommonParams).f132912a)) {
                    return "3902";
                }
                return valueOf;
            } catch (Throwable unused) {
                return "4444";
            }
        } else if (!(iCommonParams instanceof C59265a)) {
            return dVar.m25379f();
        } else {
            try {
                return String.valueOf(C17867d.f42590n);
            } catch (Throwable unused2) {
                return "4444";
            }
        }
    }

    /* renamed from: a */
    public static boolean m25378a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        if ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) {
            return false;
        }
        return true;
    }

    public C14004d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    /* renamed from: a */
    private static Object m25374a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m25376a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    /* renamed from: a */
    public static Map<String, String> m25377a(Map<String, Object> map, String... strArr) {
        HashMap hashMap = new HashMap();
        if (strArr.length == 0 || strArr.length % 2 != 0) {
            C13849d.m25014a("NPTH_CATCH", new IllegalArgumentException("err keysWithDefaultValue:".concat(String.valueOf(strArr))));
            return hashMap;
        }
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            Object obj = map.get(str);
            if (obj == null) {
                hashMap.put(str, strArr[i + 1]);
            } else {
                hashMap.put(str, String.valueOf(obj));
            }
        }
        return hashMap;
    }

    public C14004d(Context context, ICommonParams iCommonParams, C14004d dVar) {
        ICommonParams iCommonParams2;
        this.f34141b = context;
        this.f34140a = iCommonParams;
        if (dVar == null) {
            iCommonParams2 = null;
        } else {
            iCommonParams2 = dVar.f34140a;
        }
        this.f34142c = iCommonParams2;
    }
}
