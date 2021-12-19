package com.bytedance.crash.p929g;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.runtime.C14026q;
import com.bytedance.crash.util.C14056j;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.UUID;

/* renamed from: com.bytedance.crash.g.a */
public class C13876a {

    /* renamed from: a */
    private static volatile UUID f33789a;

    /* renamed from: b */
    private static String f33790b = "";

    static {
        Covode.recordClassIndex(15935);
    }

    /* renamed from: a */
    public static synchronized String m25101a(Context context) {
        String str;
        synchronized (C13876a.class) {
            MethodCollector.m26663i(4535);
            if (TextUtils.isEmpty(f33790b)) {
                new C13876a(context);
                UUID uuid = f33789a;
                if (uuid != null) {
                    f33790b = uuid.toString();
                }
            }
            str = f33790b;
            MethodCollector.m26664o(4535);
        }
        return str;
    }

    private C13876a(Context context) {
        String string;
        MethodCollector.m26663i(4546);
        if (f33789a == null) {
            synchronized (C13876a.class) {
                try {
                    if (f33789a == null) {
                        String c = C14026q.m25432a().mo22543c();
                        if (!TextUtils.isEmpty(c)) {
                            try {
                                f33789a = UUID.fromString(c);
                            } catch (Throwable unused) {
                                f33789a = UUID.randomUUID();
                            }
                        } else {
                            try {
                                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            } catch (Throwable unused2) {
                            }
                            if (string != null) {
                                try {
                                    f33789a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                                } catch (Throwable unused3) {
                                    f33789a = UUID.randomUUID();
                                }
                            } else {
                                f33789a = UUID.randomUUID();
                            }
                            C14026q a = C14026q.m25432a();
                            try {
                                C14056j.m25566a(a.f34178c, String.valueOf(f33789a), false);
                            } catch (Throwable unused4) {
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(4546);
                }
            }
            return;
        }
        MethodCollector.m26664o(4546);
    }
}
