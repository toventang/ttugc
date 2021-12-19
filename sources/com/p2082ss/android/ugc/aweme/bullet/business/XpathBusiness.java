package com.p2082ss.android.ugc.aweme.bullet.business;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16721b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16725d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16732j;
import com.p2082ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.p2082ss.android.ugc.aweme.bullet.module.p2419ad.C35196j;
import com.p2082ss.android.ugc.aweme.p2282ad.utils.C33391a;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.XpathBusiness */
public final class XpathBusiness extends BulletBusinessService.Business {
    static {
        Covode.recordClassIndex(42277);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XpathBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    public final void xpathDirect(WebView webView) {
        long j;
        AbstractC16725d<String> dVar;
        C16732j jVar;
        Long l;
        MethodCollector.m26663i(6792);
        C16721b bVar = this.f82870k.f82900a;
        String str = null;
        if (!(bVar instanceof C35196j)) {
            bVar = null;
        }
        C35196j jVar2 = (C35196j) bVar;
        if (jVar2 == null || (jVar = jVar2.f83076Y) == null || (l = (Long) jVar.mo26550b()) == null) {
            j = 0;
        } else {
            j = l.longValue();
        }
        C16721b bVar2 = this.f82870k.f82900a;
        if (!(bVar2 instanceof C35196j)) {
            bVar2 = null;
        }
        C35196j jVar3 = (C35196j) bVar2;
        if (!(jVar3 == null || (dVar = jVar3.f83101ap) == null)) {
            str = dVar.mo26550b();
        }
        if (j > 0 && !TextUtils.isEmpty(str)) {
            String a = C33391a.m68474a(str, j);
            if (a == null) {
                a = "";
            }
            if (!TextUtils.isEmpty(a) && webView != null) {
                String a2 = C84357h.f188595a.mo129370a(webView, a);
                if (!TextUtils.isEmpty(a2)) {
                    a = a2;
                }
                webView.loadUrl(a);
                MethodCollector.m26664o(6792);
                return;
            }
        }
        MethodCollector.m26664o(6792);
    }
}
