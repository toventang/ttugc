package com.appsflyer.internal;

import com.C1764a;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.ai */
public final class C2306ai {

    /* renamed from: ɩ */
    public static C2306ai f6989;

    /* renamed from: ı */
    private boolean f6990 = true;

    /* renamed from: Ɩ */
    private String f6991 = "-1";

    /* renamed from: ǃ */
    private JSONObject f6992;

    /* renamed from: Ι */
    private JSONArray f6993;

    /* renamed from: ι */
    public boolean f6994;

    /* renamed from: І */
    private boolean f6995;

    /* renamed from: і */
    private int f6996;

    /* renamed from: Ӏ */
    private boolean f6997;

    static {
        Covode.recordClassIndex(2558);
    }

    /* renamed from: І */
    public final boolean mo6452() {
        return this.f6995;
    }

    /* renamed from: і */
    private boolean m7075() {
        if (!this.f6994) {
            return false;
        }
        if (this.f6990 || this.f6995) {
            return true;
        }
        return false;
    }

    /* renamed from: Ӏ */
    private synchronized void m7076() {
        MethodCollector.m26663i(2042);
        this.f6993 = null;
        this.f6993 = new JSONArray();
        this.f6996 = 0;
        MethodCollector.m26664o(2042);
    }

    /* renamed from: ı */
    public final synchronized void mo6444() {
        MethodCollector.m26663i(2047);
        this.f6990 = false;
        m7076();
        MethodCollector.m26664o(2047);
    }

    /* renamed from: ɩ */
    public final synchronized void mo6447() {
        MethodCollector.m26663i(1877);
        this.f6992 = null;
        this.f6993 = null;
        f6989 = null;
        MethodCollector.m26664o(1877);
    }

    public C2306ai() {
        boolean z = AppsFlyerProperties.getInstance().getBoolean("disableProxy", false);
        this.f6997 = z;
        this.f6994 = true ^ z;
        this.f6993 = new JSONArray();
        this.f6996 = 0;
        this.f6995 = false;
    }

    /* renamed from: ǃ */
    public final synchronized void mo6446() {
        MethodCollector.m26663i(1870);
        this.f6995 = true;
        mo6445("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        MethodCollector.m26664o(1870);
    }

    /* renamed from: Ι */
    public final synchronized String mo6449() {
        String jSONObject;
        MethodCollector.m26663i(1930);
        try {
            this.f6992.put("data", this.f6993);
            jSONObject = this.f6992.toString();
            m7076();
        } catch (JSONException unused) {
        }
        MethodCollector.m26664o(1930);
        return jSONObject;
    }

    /* renamed from: ι */
    public final synchronized void mo6451() {
        MethodCollector.m26663i(1876);
        mo6445("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f6995 = false;
        this.f6990 = false;
        MethodCollector.m26664o(1876);
    }

    /* renamed from: ɩ */
    public final synchronized void mo6448(String str) {
        MethodCollector.m26663i(1759);
        this.f6991 = str;
        MethodCollector.m26664o(1759);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0084 */
    /* renamed from: Ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo6450(java.lang.String r14, android.content.pm.PackageManager r15) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2306ai.mo6450(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* renamed from: ı */
    public final synchronized void mo6445(String str, String str2, String... strArr) {
        String a;
        MethodCollector.m26663i(1922);
        if (!m7075() || this.f6996 >= 98304) {
            MethodCollector.m26664o(1922);
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "";
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (int length = strArr.length - 1; length > 0; length--) {
                    sb.append(strArr[length]).append(", ");
                }
                sb.append(strArr[0]);
                str3 = sb.toString();
            }
            String format = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(currentTimeMillis));
            if (str != null) {
                a = C1764a.m5928a("%18s %5s _/%s [%s] %s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), "AppsFlyer_5.4.1", str, str2, str3});
            } else {
                a = C1764a.m5928a("%18s %5s %s/%s %s", new Object[]{format, Long.valueOf(Thread.currentThread().getId()), str2, "AppsFlyer_5.4.1", str3});
            }
            this.f6993.put(a);
            this.f6996 += a.getBytes().length;
            MethodCollector.m26664o(1922);
        } catch (Throwable unused) {
            MethodCollector.m26664o(1922);
        }
    }

    /* renamed from: Ι */
    private synchronized void m7073(String str, String str2, String str3, String str4) {
        MethodCollector.m26663i(1898);
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f6992.put("app_id", str);
                }
            } catch (Throwable unused) {
                MethodCollector.m26664o(1898);
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f6992.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f6992.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f6992.put("preInstall", str4);
        }
        MethodCollector.m26664o(1898);
    }

    /* renamed from: ι */
    private synchronized void m7074(String str, String str2, String str3, String str4) {
        MethodCollector.m26663i(1890);
        try {
            this.f6992.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f6992.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f6992.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f6992.put("uid", str4);
            }
            MethodCollector.m26664o(1890);
        } catch (Throwable unused) {
            MethodCollector.m26664o(1890);
        }
    }

    /* renamed from: ǃ */
    private synchronized void m7072(String str, String str2, String str3, String str4, String str5, String str6) {
        MethodCollector.m26663i(1885);
        try {
            this.f6992.put("brand", str);
            this.f6992.put("model", str2);
            this.f6992.put("platform", "Android");
            this.f6992.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f6992.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f6992.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f6992.put("android_id", str6);
            }
            MethodCollector.m26664o(1885);
        } catch (Throwable unused) {
            MethodCollector.m26664o(1885);
        }
    }
}
