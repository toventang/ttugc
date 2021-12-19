package com.p2082ss.android.ugc.aweme.setting;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.setting.TiktokSkinHelper */
public class TiktokSkinHelper {

    /* renamed from: a */
    public static boolean f152283a;

    static {
        Covode.recordClassIndex(80144);
    }

    /* renamed from: a */
    public static void m120292a(Resources resources) {
        if (f152283a) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.uiMode & 48) != 16) {
                configuration.uiMode = (configuration.uiMode & -49) | 16;
                resources.updateConfiguration(configuration, null);
                m120293b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m120293b(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 26) {
            try {
                Method declaredMethod = Class.forName("androidx.appcompat.app.ResourcesFlusher").getDeclaredMethod("flush", Resources.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, resources);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
