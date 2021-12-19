package com.p2082ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.facebook.p1902j.p1903a.C24804d;
import com.p2082ss.android.ugc.aweme.net.INetReleaseInterceptor;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor */
public class NetWorkSpeedInterceptor implements INetReleaseInterceptor {
    static {
        Covode.recordClassIndex(72045);
    }

    @Override // okhttp3.AbstractC90202u
    public C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        Request a = aVar.mo144856a();
        C24804d.C24805a.f58857a.mo40617a();
        C90029ac a2 = aVar.mo144857a(a);
        C24804d.C24805a.f58857a.mo40618b();
        return a2;
    }
}
