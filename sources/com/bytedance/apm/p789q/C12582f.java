package com.bytedance.apm.p789q;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.services.apm.api.AbstractC22711d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.apm.q.f */
public final class C12582f {

    /* renamed from: a */
    public static float f30616a;

    /* renamed from: b */
    public static int f30617b;

    /* renamed from: c */
    public static int f30618c;

    /* renamed from: d */
    public static boolean f30619d;

    static {
        Covode.recordClassIndex(14399);
        Context context = C12397c.f29931a;
        boolean z = true;
        if (!C12397c.f29945o || Build.VERSION.SDK_INT < 23 || context == null) {
            f30618c = 60;
            f30617b = 60;
            f30619d = true;
            f30616a = 1000.0f / ((float) 60);
            return;
        }
        Display defaultDisplay = ((WindowManager) m22667a(context, "window")).getDefaultDisplay();
        float refreshRate = defaultDisplay.getRefreshRate();
        float f = 0.0f;
        for (Display.Mode mode : defaultDisplay.getSupportedModes()) {
            float refreshRate2 = mode.getRefreshRate();
            if (refreshRate2 > f) {
                f = refreshRate2;
            }
        }
        f30617b = m22666a(refreshRate);
        int a = m22666a(f);
        f30618c = a;
        int i = f30617b;
        if (i != a) {
            z = false;
        }
        f30619d = z;
        f30616a = 1000.0f / ((float) i);
        ActivityLifeObserver.getInstance().register(new AbstractC22711d() {
            /* class com.bytedance.apm.p789q.C12582f.C125831 */

            static {
                Covode.recordClassIndex(14400);
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: a */
            public final void mo20033a(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: a */
            public final void mo20108a(Activity activity, Bundle bundle) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: c */
            public final void mo20109c(Activity activity) {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: l_ */
            public final void mo20110l_() {
            }

            @Override // com.bytedance.services.apm.api.AbstractC22711d
            /* renamed from: b */
            public final void mo20035b(Activity activity) {
                boolean z;
                int a = C12582f.m22666a(activity.getWindowManager().getDefaultDisplay().getRefreshRate());
                C12582f.f30617b = a;
                if (a == C12582f.f30618c) {
                    z = true;
                } else {
                    z = false;
                }
                C12582f.f30619d = z;
                C12582f.f30616a = 1000.0f / ((float) C12582f.f30617b);
            }
        });
    }

    /* renamed from: a */
    static int m22666a(float f) {
        if (Math.abs(f - 60.0f) < 5.1f) {
            return 60;
        }
        if (Math.abs(f - 90.0f) < 5.1f) {
            return 90;
        }
        if (Math.abs(f - 120.0f) < 5.1f) {
            return 120;
        }
        return (int) f;
    }

    /* renamed from: a */
    private static Object m22667a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }
}
