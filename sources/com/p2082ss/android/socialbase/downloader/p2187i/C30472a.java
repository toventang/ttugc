package com.p2082ss.android.socialbase.downloader.p2187i;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.socialbase.downloader.p2189k.C30580i;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.i.a */
public final class C30472a {

    /* renamed from: a */
    public static final C30472a f72639a = new C30472a(null);

    /* renamed from: b */
    public static JSONObject f72640b;

    /* renamed from: c */
    private static final C30580i<Integer, C30472a> f72641c = new C30580i<>(16, 16);

    /* renamed from: d */
    private static JSONObject f72642d;

    /* renamed from: e */
    private static Boolean f72643e;

    /* renamed from: f */
    private static boolean f72644f;

    /* renamed from: g */
    private static C30472a f72645g;

    /* renamed from: h */
    private final JSONObject f72646h;

    /* renamed from: i */
    private final JSONObject f72647i;

    /* renamed from: j */
    private final Boolean f72648j;

    /* renamed from: k */
    private int f72649k;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final boolean mo54262a(String str, boolean z) {
        if (this.f72647i != null && !m62091b(str)) {
            if (this.f72647i.has(str)) {
                return this.f72647i.optInt(str, z) == 1;
            }
            Boolean bool = this.f72648j;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = f72640b;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return f72640b.optInt(str, z ? 1 : 0) == 1;
            }
            Boolean bool2 = f72643e;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z;
    }

    /* renamed from: a */
    public final JSONObject mo54261a(String str) {
        JSONObject jSONObject = this.f72646h;
        if (jSONObject == null || !jSONObject.has(str) || m62091b(str)) {
            return C30399c.m61738v().optJSONObject(str);
        }
        return this.f72646h.optJSONObject(str);
    }

    static {
        Covode.recordClassIndex(36999);
        m62089a();
    }

    /* renamed from: a */
    public static void m62089a() {
        boolean z;
        JSONObject v = C30399c.m61738v();
        boolean z2 = false;
        if (v.optInt("disable_task_setting", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f72644f = z;
        f72642d = v.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = v.optJSONObject("bugfix");
        Boolean bool = null;
        if (optJSONObject != null && optJSONObject.has("default")) {
            if (optJSONObject.optInt("default", 0) == 1) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        f72640b = optJSONObject;
        f72643e = bool;
    }

    /* renamed from: b */
    private static boolean m62091b(String str) {
        JSONObject jSONObject = f72642d;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C30472a m62088a(DownloadInfo downloadInfo) {
        if (f72644f) {
            return f72639a;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new C30472a(new JSONObject(downloadSettingString));
            }
        } catch (Throwable unused) {
        }
        return f72639a;
    }

    private C30472a(JSONObject jSONObject) {
        Boolean bool;
        this.f72646h = jSONObject;
        JSONObject jSONObject2 = null;
        r2 = null;
        r2 = null;
        Boolean bool2 = null;
        if (jSONObject == null || m62091b("bugfix")) {
            bool = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !m62091b("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            bool = bool2;
            jSONObject2 = optJSONObject;
        }
        this.f72647i = jSONObject2;
        this.f72648j = bool;
    }

    /* renamed from: a */
    public static void m62090a(int i) {
        MethodCollector.m26663i(9474);
        C30472a aVar = f72645g;
        if (aVar != null && aVar.f72649k == i) {
            f72645g = null;
        }
        C30580i<Integer, C30472a> iVar = f72641c;
        synchronized (iVar) {
            try {
                iVar.remove(Integer.valueOf(i));
            } finally {
                MethodCollector.m26664o(9474);
            }
        }
    }

    /* renamed from: a */
    public static C30472a m62087a(int i, DownloadInfo downloadInfo) {
        C30472a aVar;
        Context B;
        MethodCollector.m26663i(9313);
        C30472a aVar2 = f72645g;
        if (aVar2 == null || aVar2.f72649k != i) {
            C30580i<Integer, C30472a> iVar = f72641c;
            synchronized (iVar) {
                try {
                    aVar = (C30472a) iVar.get(Integer.valueOf(i));
                } finally {
                    MethodCollector.m26664o(9313);
                }
            }
            if (aVar == null) {
                if (downloadInfo == null && (f72644f || (B = C30399c.m61674B()) == null || (downloadInfo = Downloader.getInstance(B).getDownloadInfo(i)) == null)) {
                    aVar = f72639a;
                } else {
                    aVar = m62088a(downloadInfo);
                }
                synchronized (iVar) {
                    try {
                        iVar.put(Integer.valueOf(i), aVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            aVar.f72649k = i;
            f72645g = aVar;
            MethodCollector.m26664o(9313);
            return aVar;
        }
        MethodCollector.m26664o(9313);
        return aVar2;
    }

    /* renamed from: a */
    public final int mo54258a(String str, int i) {
        JSONObject jSONObject = this.f72646h;
        if (jSONObject == null || !jSONObject.has(str) || m62091b(str)) {
            return C30399c.m61738v().optInt(str, i);
        }
        return this.f72646h.optInt(str, i);
    }

    /* renamed from: a */
    public final long mo54259a(String str, long j) {
        JSONObject jSONObject = this.f72646h;
        if (jSONObject == null || !jSONObject.has(str) || m62091b(str)) {
            return C30399c.m61738v().optLong(str, j);
        }
        return this.f72646h.optLong(str, j);
    }

    /* renamed from: a */
    public final String mo54260a(String str, String str2) {
        JSONObject jSONObject = this.f72646h;
        if (jSONObject == null || !jSONObject.has(str) || m62091b(str)) {
            return C30399c.m61738v().optString(str, str2);
        }
        return this.f72646h.optString(str, str2);
    }
}
