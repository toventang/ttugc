package com.bytedance.frameworks.baselib.network.http.cronet.p987c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.retrofit2.client.AbstractC22025a;
import com.bytedance.retrofit2.client.AbstractC22029d;
import com.bytedance.retrofit2.client.Request;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.c.a */
public final class C14665a implements AbstractC22025a {

    /* renamed from: a */
    private Context f35598a;

    static {
        Covode.recordClassIndex(16760);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC22025a
    /* renamed from: a */
    public final AbstractC22029d mo11597a(Request request) {
        Context context = this.f35598a;
        request.getUrl();
        C14659h a = C14659h.m26802a(context);
        if (a != null) {
            return a.mo11597a(request);
        }
        return null;
    }
}
