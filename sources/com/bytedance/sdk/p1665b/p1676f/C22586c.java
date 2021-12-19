package com.bytedance.sdk.p1665b.p1676f;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.sdk.b.f.c */
public final class C22586c {

    /* renamed from: a */
    private static String f53364a;

    /* renamed from: b */
    private static String f53365b;

    /* renamed from: c */
    private static int f53366c;

    static {
        Covode.recordClassIndex(26402);
    }

    /* renamed from: b */
    private static Context m42623b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static String m42621a(Context context) {
        SubscriptionManager subscriptionManager;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        String str;
        String str2 = "";
        try {
            if (C22584a.m42609a(context, "android.permission.READ_PHONE_STATE") && Build.VERSION.SDK_INT >= 22 && (subscriptionManager = (SubscriptionManager) m42620a(m42623b(context), "telephony_subscription_service")) != null && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null) {
                for (int i = 0; i < activeSubscriptionInfoList.size(); i++) {
                    int mcc = activeSubscriptionInfoList.get(i).getMcc();
                    C22539a.m42533a("mcc is ".concat(String.valueOf(mcc)));
                    int mnc = activeSubscriptionInfoList.get(i).getMnc();
                    C22539a.m42533a("mnc is ".concat(String.valueOf(mnc)));
                    if (mnc < 10) {
                        str = "0".concat(String.valueOf(mnc));
                    } else {
                        str = String.valueOf(mnc);
                    }
                    str2 = str2 + (String.valueOf(mcc) + str);
                    if (i != activeSubscriptionInfoList.size() - 1) {
                        str2 = str2 + ",";
                    }
                }
            }
        } catch (Exception e) {
            C22539a.m42536d(e.getMessage());
        }
        if (str2.isEmpty()) {
            str2 = m42622a(context, false);
        }
        C22539a.m42533a("getAllMccMnc is ".concat(String.valueOf(str2)));
        return str2;
    }

    /* renamed from: a */
    private static Object m42620a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(1659);
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
                    MethodCollector.m26664o(1659);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: b */
    public static String m42624b(Context context, boolean z) {
        if (context == null) {
            C22539a.m42536d("getSimOperatorName(Context context):context == null");
            return "";
        } else if (!z && !TextUtils.isEmpty(f53365b)) {
            return f53365b;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) m42620a(context, "phone");
                if (telephonyManager != null) {
                    C22539a.m42533a("getSimOperator   " + telephonyManager.getSimOperator());
                    String simOperatorName = telephonyManager.getSimOperatorName();
                    f53365b = simOperatorName;
                    return simOperatorName;
                }
            } catch (Exception e) {
                C22539a.m42536d(e.getMessage());
            }
            return "";
        }
    }

    /* renamed from: c */
    public static int m42625c(Context context, boolean z) {
        Method method;
        int i;
        if (context == null) {
            C22539a.m42536d("getSimSubscriptionId(Context context):context == null");
            return -1;
        } else if (!z && (i = f53366c) != -1) {
            return i;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) m42620a(m42623b(context), "phone");
                if (telephonyManager == null || telephonyManager.getSimState() == 0 || telephonyManager.getSimState() == 1) {
                    C22539a.m42536d("getSimSubscriptionId no sim card -1");
                    return -1;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    f53366c = SubscriptionManager.getDefaultDataSubscriptionId();
                    C22539a.m42536d("getSimSubscriptionId version >= 24, it is " + f53366c);
                    return f53366c;
                } else if (Build.VERSION.SDK_INT >= 22) {
                    SubscriptionManager subscriptionManager = (SubscriptionManager) m42620a(m42623b(context), "telephony_subscription_service");
                    if (!(subscriptionManager == null || (method = subscriptionManager.getClass().getMethod("getDefaultSubId", new Class[0])) == null)) {
                        f53366c = ((Integer) method.invoke(subscriptionManager, new Object[0])).intValue();
                        C22539a.m42536d("getSimSubscriptionId version >= 22, it is " + f53366c);
                        return f53366c;
                    }
                    C22539a.m42536d("getSimSubscriptionId return default error -1");
                    return -1;
                } else {
                    C22539a.m42536d("getSimSubscriptionId version < 22, no multi sim card");
                    f53366c = -2;
                    return -2;
                }
            } catch (Exception e) {
                C22539a.m42536d(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static String m42622a(Context context, boolean z) {
        if (context == null) {
            C22539a.m42536d("getSimOperator(Context context):context == null");
            return "";
        } else if (!z && !TextUtils.isEmpty(f53364a)) {
            return f53364a;
        } else {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) m42620a(context, "phone");
                if (telephonyManager != null) {
                    C22539a.m42533a("getSimOperator   " + telephonyManager.getSimOperator());
                    String simOperator = telephonyManager.getSimOperator();
                    f53364a = simOperator;
                    return simOperator;
                }
            } catch (Exception e) {
                C22539a.m42536d(e.getMessage());
            }
            return "";
        }
    }
}
