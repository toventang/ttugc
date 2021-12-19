package com.p2082ss.android.ugc.aweme.net.p3493f;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.p1121b.p1124c.C16109c;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.common.p2130b.AbstractC29811a;
import com.p2082ss.android.ugc.aweme.net.C61402j;
import com.p2082ss.android.ugc.aweme.net.C61449n;
import com.p2082ss.android.ugc.aweme.net.interceptor.ApiCheckInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet;
import com.p2082ss.android.ugc.aweme.utils.InterceptorHolder;
import com.p2082ss.android.ugc.aweme.utils.SecUidInterceptorTTNet;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.net.f.f */
public final class C61350f extends AbstractC61344b {

    /* renamed from: c */
    private static String f139331c;

    static {
        Covode.recordClassIndex(71983);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.p3493f.AbstractC61344b
    /* renamed from: a */
    public final synchronized AbstractC29811a mo98953a() {
        MethodCollector.m26663i(4391);
        C61402j.m111178a().mo28818a();
        if (Build.VERSION.SDK_INT == 18) {
            f139331c = "SsOkhttp3Client";
            C16109c cVar = new C16109c(new C61449n());
            MethodCollector.m26664o(4391);
            return cVar;
        }
        f139331c = "CronetClient";
        C61343a aVar = new C61343a();
        if (aVar.f139323a == null) {
            aVar.f139323a = new C22944d();
        }
        aVar.f139323a.f35400c = 60000;
        if (aVar.f139323a == null) {
            aVar.f139323a = new C22944d();
        }
        aVar.f139323a.f35401d = 60000;
        if (aVar.f139323a == null) {
            aVar.f139323a = new C22944d();
        }
        aVar.f139323a.f35402e = 60000;
        aVar.mo98956a(C61402j.m111178a().mo28822c());
        aVar.mo98956a(new ApiCheckInterceptorTTNet());
        aVar.mo98956a(new DevicesNullInterceptorTTNet());
        aVar.mo98956a(new UrlTransformInterceptorTTNet());
        aVar.mo98956a(new SecUidInterceptorTTNet());
        List<AbstractC22021a> b = InterceptorHolder.m138948e().mo98923b();
        if (!C13603b.m24435a((Collection) b)) {
            for (AbstractC22021a aVar2 : b) {
                aVar.mo98956a(aVar2);
            }
        }
        aVar.f139324b = new C61345c();
        if (SettingsManager.m29616a().mo25394a("change_network_client", 1) == 0) {
            MethodCollector.m26664o(4391);
            return aVar;
        }
        C61351g gVar = new C61351g(aVar);
        MethodCollector.m26664o(4391);
        return gVar;
    }

    public C61350f(Context context) {
        super(context);
    }
}
