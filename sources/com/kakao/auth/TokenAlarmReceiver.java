package com.kakao.auth;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.util.helper.log.Logger;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

public class TokenAlarmReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(33837);
    }

    private boolean isApplicationActive(Context context) {
        try {
            PowerManager powerManager = (PowerManager) m56165xfa4f71fc(context, "power");
            if (Build.VERSION.SDK_INT <= 19) {
                return powerManager.isScreenOn();
            }
            return powerManager.isInteractive();
        } catch (Exception unused) {
            return true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (isApplicationActive(context)) {
            try {
                Session.getCurrentSession().checkAccessTokenInfo();
            } catch (IllegalStateException e) {
                Logger.m56205e(e.toString());
            }
        }
    }

    /* renamed from: com_kakao_auth_TokenAlarmReceiver_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m56165xfa4f71fc(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8725);
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
                    MethodCollector.m26664o(8725);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
