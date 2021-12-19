package com.p2082ss.android.ugc.aweme.account.network;

import android.text.TextUtils;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.C31970n;
import com.p2082ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.network.c */
public final class C32884c {
    static {
        Covode.recordClassIndex(39672);
    }

    /* renamed from: a */
    public static boolean m67516a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/passport/")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m67515a(int i, String str, String str2, Map<String, String> map) {
        TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor;
        if (!C31970n.f76340a.contains(Integer.valueOf(i)) || (twoStepAuthenticationInterceptor = new TwoStepAuthenticationInterceptor()) == null) {
            return new C0484a();
        }
        return twoStepAuthenticationInterceptor.tryToIntercept(str, null, str2, i, map);
    }
}
