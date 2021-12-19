package com.bytedance.ttnet.retrofit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.AbstractC14625c;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.C22932c;

/* renamed from: com.bytedance.ttnet.retrofit.b */
public final class C22959b implements AbstractC22025a {
    static {
        Covode.recordClassIndex(26873);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a
    /* renamed from: a */
    public final AbstractC22029d mo11597a(Request request) {
        AbstractC14625c a;
        request.getUrl();
        if (C22932c.m43218a()) {
            a = C22932c.f54201c.mo37253a();
        } else {
            a = C22932c.f54200b.mo37253a();
        }
        if (a != null) {
            return a.mo11597a(request);
        }
        return null;
    }
}
