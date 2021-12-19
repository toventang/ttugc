package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24739e;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.login.LoginClient;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.login.f */
public class C24868f {

    /* renamed from: d */
    private static final ScheduledExecutorService f59032d;

    /* renamed from: a */
    final C23998m f59033a;

    /* renamed from: b */
    private String f59034b;

    /* renamed from: c */
    private String f59035c;

    /* renamed from: a */
    public final String mo40764a() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f59034b;
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(29057);
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        f59032d = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
    }

    /* renamed from: a */
    static /* synthetic */ C23998m m47674a(C24868f fVar) {
        if (C24677a.m47209a(C24868f.class)) {
            return null;
        }
        try {
            return fVar.f59033a;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24868f.class);
            return null;
        }
    }

    /* renamed from: a */
    static Bundle m47673a(String str) {
        if (C24677a.m47209a(C24868f.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24868f.class);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40765a(LoginClient.Request request) {
        if (!C24677a.m47209a(this)) {
            try {
                Bundle a = m47673a(request.f58935e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", request.f58931a.toString());
                    jSONObject.put("request_code", C24739e.EnumC24741b.Login.toRequestCode());
                    jSONObject.put("permissions", TextUtils.join(",", request.f58932b));
                    jSONObject.put("default_audience", request.f58933c.toString());
                    jSONObject.put("isReauthorize", request.f58936f);
                    String str = this.f59035c;
                    if (str != null) {
                        jSONObject.put("facebookVersion", str);
                    }
                    a.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                this.f59033a.mo39477c();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    C24868f(Context context, String str) {
        PackageInfo packageInfo;
        this.f59034b = str;
        this.f59033a = new C23998m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f59035c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo40766a(String str, String str2) {
        if (!C24677a.m47209a(this)) {
            try {
                mo40767a(str, str2, "");
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo40767a(String str, String str2, String str3) {
        if (!C24677a.m47209a(this)) {
            try {
                Bundle a = m47673a("");
                a.putString("2_result", LoginClient.Result.EnumC24834a.ERROR.f58951d);
                a.putString("5_error_message", str2);
                a.putString("3_method", str3);
                this.f59033a.mo39478d();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r3 != null) goto L_0x005e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40769a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, com.facebook.login.LoginClient.Result.EnumC24834a r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.Exception r10) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.C24868f.mo40769a(java.lang.String, java.util.Map, com.facebook.login.LoginClient$Result$a, java.util.Map, java.lang.Exception):void");
    }

    /* renamed from: a */
    public final void mo40768a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (!C24677a.m47209a(this)) {
            try {
                Bundle a = m47673a(str);
                if (str3 != null) {
                    a.putString("2_result", str3);
                }
                if (str4 != null) {
                    a.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    a.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    a.putString("6_extras", new JSONObject(map).toString());
                }
                a.putString("3_method", str2);
                this.f59033a.mo39478d();
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }
}
