package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.k */
public final class C45570k {

    /* renamed from: a */
    public static final C45570k f106125a = new C45570k();

    private C45570k() {
    }

    static {
        Covode.recordClassIndex(54063);
    }

    /* renamed from: a */
    public static Integer m88114a(Throwable th) {
        int i;
        Integer num;
        C89219l.m154721d(th, "");
        try {
            if (th instanceof C14620c) {
                return Integer.valueOf(((C14620c) th).getStatusCode());
            }
            if (!(th instanceof C14652c)) {
                return null;
            }
            String requestLog = ((C14652c) th).getRequestLog();
            if (requestLog != null) {
                JSONObject optJSONObject = new JSONObject(requestLog).optJSONObject("base");
                if (optJSONObject != null) {
                    num = Integer.valueOf(optJSONObject.optInt("net_error"));
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                    return Integer.valueOf(i);
                }
            }
            i = ((C14652c) th).getStatusCode();
            return Integer.valueOf(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
