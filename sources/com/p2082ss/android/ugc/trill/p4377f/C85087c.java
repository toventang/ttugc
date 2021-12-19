package com.p2082ss.android.ugc.trill.p4377f;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.trill.f.c */
public final class C85087c extends AbstractC85085a<String> {
    static {
        Covode.recordClassIndex(99110);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.trill.p4377f.AbstractC85085a
    /* renamed from: a */
    public final /* synthetic */ String mo130028a() {
        return m146300c();
    }

    /* renamed from: c */
    private static String m146300c() {
        try {
            if (((TelephonyManager) m146299a(C17867d.m33078a(), "phone")).getPhoneType() == 2) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return ((String) cls.getMethod("get", String.class).invoke(cls, "ro.cdma.home.operator.numeric")).substring(0, 3);
            }
            int i = C17867d.m33078a().getResources().getConfiguration().mcc;
            if (i == 0) {
                return "";
            }
            return String.valueOf(i);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    private static Object m146299a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5110);
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
                    MethodCollector.m26664o(5110);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
