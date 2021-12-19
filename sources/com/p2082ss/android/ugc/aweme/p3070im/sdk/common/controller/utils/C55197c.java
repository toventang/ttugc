package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55095h;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c */
public final class C55197c {
    static {
        Covode.recordClassIndex(64942);
    }

    /* renamed from: e */
    public static long m100923e() {
        return Long.parseLong(m100919b().toString());
    }

    /* renamed from: a */
    public static boolean m100917a() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null || !e.isLogin()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static CharSequence m100919b() {
        String uid;
        User d = m100922d();
        if (d == null || (uid = d.getUid()) == null) {
            return "-1";
        }
        return uid;
    }

    /* renamed from: c */
    public static String m100921c() {
        User d = m100922d();
        if (d == null) {
            return "";
        }
        if (d.getSecUid() != null) {
            return d.getSecUid();
        }
        C55095h.m100767a(d.getUid(), d.getSecUid());
        return "";
    }

    /* renamed from: d */
    public static User m100922d() {
        IAccountUserService e;
        IAccountService a = AccountService.m65215a();
        if (a == null || (e = a.mo57069e()) == null) {
            return null;
        }
        return e.getCurUser();
    }

    /* renamed from: f */
    public static String m100924f() {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) m100913a(C17867d.m33078a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            str = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
    }

    /* renamed from: g */
    public static String m100925g() {
        String str;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) m100913a(C17867d.m33078a(), "phone");
            if (telephonyManager == null) {
                return "";
            }
            str = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            str = "";
        }
    }

    /* renamed from: a */
    public static boolean m100918a(IMUser iMUser) {
        if (iMUser == null || !m100919b().equals(iMUser.getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m100920b(String str, Map<String, Object> map) {
        m100915a(str, null, map, "im_error_event");
    }

    /* renamed from: a */
    public static void m100916a(String str, Map<String, Object> map) {
        m100914a(str, null, map);
    }

    /* renamed from: a */
    private static Object m100913a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4419);
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
                    MethodCollector.m26664o(4419);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m100914a(String str, String str2, Map<String, Object> map) {
        m100915a(str, str2, map, "im_event");
    }

    /* renamed from: a */
    private static void m100915a(String str, String str2, Map<String, Object> map, String str3) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str);
                } else {
                    jSONObject.put("service", str + "_" + str2);
                }
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                C12290b.m22064a(str3, jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
