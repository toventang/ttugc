package com.p2082ss.android.ugc.aweme.ecommerce.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.router.interceptor.IInterceptor;
import com.p2082ss.android.sdk.webview.C30248e;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductBaseEpt;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.service.IECommerceService */
public interface IECommerceService {
    static {
        Covode.recordClassIndex(53837);
    }

    void addJSMethods(C30248e eVar, WeakReference<Context> weakReference);

    List<IInterceptor> getEComPipeRouterInterceptors();

    List<IInterceptor> getECommerceRouterInterceptors();

    List<AbstractC16183k> getJSMethods(C16248b bVar);

    AbstractC45377b getOrderCenterEntry();

    void postEvent(String str, JSONObject jSONObject);

    void prefetchPdp(String str, Context context);

    void prefetchPdp(String str, Context context, int i, AbstractC89172b<? super ProductBaseEpt, C89391z> bVar);

    void prefetchSchema(String str, Context context);

    void showThirdpartyDisclaimerTips(Context context, String str);
}
