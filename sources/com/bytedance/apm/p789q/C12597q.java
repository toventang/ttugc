package com.bytedance.apm.p789q;

import android.content.Context;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Properties;

/* renamed from: com.bytedance.apm.q.q */
public final class C12597q {

    /* renamed from: a */
    private static Properties f30653a;

    static {
        Covode.recordClassIndex(14414);
    }

    /* renamed from: a */
    public static String m22719a() {
        return String.valueOf(m22718a("release_build"));
    }

    /* renamed from: a */
    private static Object m22718a(String str) {
        Context context = C12397c.f29931a;
        if (f30653a == null) {
            Properties properties = new Properties();
            f30653a = properties;
            try {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                properties.load(applicationContext.getAssets().open("slardar.properties"));
            } catch (Throwable unused) {
            }
        }
        try {
            if (f30653a.containsKey(str)) {
                return f30653a.get(str);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
