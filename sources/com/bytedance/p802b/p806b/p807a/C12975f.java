package com.bytedance.p802b.p806b.p807a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13113a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Properties;

/* renamed from: com.bytedance.b.b.a.f */
public final class C12975f {

    /* renamed from: a */
    private static Properties f31605a;

    static {
        Covode.recordClassIndex(14811);
    }

    /* renamed from: a */
    static Object m23299a(String str) {
        Application application = C13113a.f31955g;
        if (f31605a == null) {
            Properties properties = new Properties();
            f31605a = properties;
            try {
                Context applicationContext = application.getApplicationContext();
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
            if (f31605a.containsKey(str)) {
                return f31605a.get(str);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
