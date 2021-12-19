package com.p2082ss.android.ugc.aweme.login;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29803q;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.login.b */
public final class C58955b {
    static {
        Covode.recordClassIndex(69282);
    }

    /* renamed from: a */
    static void m108312a() {
        Bundle bundle = new Bundle();
        bundle.putInt("user_mode", 0);
        bundle.putInt("user_period", 0);
        AppLog.setCustomerHeader(bundle);
        m108313b();
    }

    /* renamed from: b */
    static void m108313b() {
        try {
            Field declaredField = C29803q.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            ((ConcurrentHashMap) declaredField.get(null)).remove("account_region");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
