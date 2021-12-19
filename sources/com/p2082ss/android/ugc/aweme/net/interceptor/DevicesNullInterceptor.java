package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.IReleaseInterceptor;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor */
public class DevicesNullInterceptor implements IReleaseInterceptor {
    static {
        Covode.recordClassIndex(72039);
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        if (TextUtils.equals("", a.url().mo145048c("device_id"))) {
            a = a.newBuilder().mo144697a(a.url().mo145060j().mo145072e("device_id").mo145068b()).mo144698a();
        }
        return aVar.mo144857a(a);
    }
}
