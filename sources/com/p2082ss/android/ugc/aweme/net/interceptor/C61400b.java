package com.p2082ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.token.C30627c;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.net.INetReleaseInterceptor;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.b */
public final class C61400b implements INetReleaseInterceptor {
    static {
        Covode.recordClassIndex(72050);
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        ArrayList arrayList;
        Request a = aVar.mo144856a();
        Map a2 = C30628d.m62921a(a.url().toString());
        C90198s headers = a.headers();
        if (a2 != null && !a2.isEmpty()) {
            if (headers == null) {
                headers = C90198s.m156770a(a2);
            } else {
                C90198s.C90199a c = headers.mo145033c();
                for (Map.Entry entry : a2.entrySet()) {
                    c.mo145039a((String) entry.getKey(), (String) entry.getValue());
                }
                headers = c.mo145040a();
            }
        }
        Request.C90016a newBuilder = a.newBuilder();
        if (headers == null) {
            headers = a.headers();
        }
        C90029ac a3 = aVar.mo144857a(newBuilder.mo144696a(headers).mo144698a());
        C90198s sVar = a3.f204110f;
        if (sVar != null) {
            arrayList = new ArrayList();
            for (String str : sVar.mo145029a()) {
                arrayList.add(new C30627c(str, sVar.mo145028a(str)));
            }
        } else {
            arrayList = null;
        }
        C30628d.m62922a(a.url().toString(), arrayList);
        return a3;
    }
}
