package com.bytedance.platform.godzilla.p1575b.p1584c;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1574a.C21689g;
import com.bytedance.platform.godzilla.p1585c.AbstractC21721e;
import java.util.Locale;

/* renamed from: com.bytedance.platform.godzilla.b.c.b */
public final class C21716b extends AbstractC21721e {
    static {
        Covode.recordClassIndex(25357);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "OppoMessageNPEPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21721e
    /* renamed from: c */
    public final boolean mo35373c() {
        int i = Build.VERSION.SDK_INT;
        if (i == 22 || i == 21) {
            try {
                String str = Build.MANUFACTURER;
                if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).contains("oppo")) {
                    return false;
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.platform.godzilla.p1574a.AbstractC21692h
    /* renamed from: a */
    public final boolean mo35345a(Thread thread, Throwable th) {
        if (th instanceof NullPointerException) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                if ("android.os.Message".equals(stackTraceElement.getClassName()) && "toString".equals(stackTraceElement.getMethodName())) {
                    C21689g.m40635a(C21689g.EnumC21691a.ERROR);
                    return true;
                }
            }
        }
        return false;
    }
}
