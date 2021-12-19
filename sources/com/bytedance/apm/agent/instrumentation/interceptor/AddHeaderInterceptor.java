package com.bytedance.apm.agent.instrumentation.interceptor;

import android.text.TextUtils;
import com.bytedance.apm.p767c.p768a.C12404d;
import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

public class AddHeaderInterceptor implements AbstractC90202u {
    static {
        Covode.recordClassIndex(14036);
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        Request.C90016a newBuilder = a.newBuilder();
        if (TextUtils.isEmpty(a.header("x-tt-trace-log")) && C12404d.C12405a.f29983a.f29970e) {
            if (C12404d.C12405a.f29983a.mo20187b() && C12404d.C12405a.f29983a.f29969d) {
                newBuilder.mo144700b("x-tt-trace-log", "01");
            } else if (C12404d.C12405a.f29983a.f29968c == 1 && C12404d.C12405a.f29983a.f29969d) {
                newBuilder.mo144700b("x-tt-trace-log", "02");
            }
        }
        return aVar.mo144857a(newBuilder.mo144698a());
    }
}
