package com.p2082ss.android.ugc.aweme.notification.redpoint;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.notification.redpoint.c */
public class C62218c {

    /* renamed from: b */
    private static C62218c f141232b;

    /* renamed from: a */
    HashMap<Long, Integer> f141233a = new HashMap<>();

    static {
        Covode.recordClassIndex(72985);
    }

    /* renamed from: a */
    public static C62218c m112516a() {
        MethodCollector.m26663i(206);
        if (f141232b == null) {
            synchronized (C62218c.class) {
                try {
                    if (f141232b == null) {
                        f141232b = new C62218c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(206);
                    throw th;
                }
            }
        }
        C62218c cVar = f141232b;
        MethodCollector.m26664o(206);
        return cVar;
    }

    /* renamed from: a */
    public final int mo100228a(String str) {
        try {
            Integer num = this.f141233a.get(Long.valueOf(Long.parseLong(str)));
            if (num == null) {
                return 0;
            }
            return num.intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo100229a(List<String> list, String str) {
        if (!C80580in.m139687c() && !C13603b.m24435a((Collection) list)) {
            MultiUserNoticeApi.f141222a.getMultiUserNoticeCount(TextUtils.join(",", list)).mo5534a(new C62219d(this, str), C1731i.f5562a, null);
        }
    }
}
