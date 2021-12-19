package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.AbstractC34886bm;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.util.Collections;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BaseInterceptorService */
public class BaseInterceptorService implements AbstractC34886bm {
    static {
        Covode.recordClassIndex(79590);
    }

    public boolean shouldIntercept(Request request) {
        C89219l.m154721d(request, "");
        return false;
    }

    public Map<String, String> interceptAndGetNewParams(int i, Request request, C22099u<Object> uVar) {
        return Collections.emptyMap();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34886bm
    public void promptIfNeededOrToast(Context context, String str, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        new C79459a(context).mo123052a(str).mo123053a();
    }

    public Map<String, String> interceptAndGetNewParams(int i, String str, Request request, String str2) {
        return Collections.emptyMap();
    }
}
