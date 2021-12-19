package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.account.network.C32884c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.InterceptorService */
public final class InterceptorService extends BaseInterceptorService {
    static {
        Covode.recordClassIndex(79652);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseInterceptorService
    public final boolean shouldIntercept(Request request) {
        C89219l.m154721d(request, "");
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseInterceptorService
    public final Map<String, String> interceptAndGetNewParams(int i, Request request, C22099u<Object> uVar) {
        String str;
        T t = null;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        if (uVar != null) {
            t = uVar.f52262b;
        }
        return interceptAndGetNewParams(i, str, request, String.valueOf(t));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseInterceptorService
    public final Map<String, String> interceptAndGetNewParams(int i, String str, Request request, String str2) {
        Map<String, String> a = C32884c.m67515a(i, str, str2, null);
        C89219l.m154716b(a, "");
        return a;
    }
}
