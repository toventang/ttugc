package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.e */
public final class C66381e extends AbstractC66376a {
    static {
        Covode.recordClassIndex(77913);
    }

    public C66381e(AbstractC66376a.AbstractC66377a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        Activity j;
        if (TextUtils.isEmpty(str) || (j = C17873f.m33102j()) == null) {
            return false;
        }
        IMiniAppService a = C59320c.C59324a.f135560a.mo96989a();
        C59315a.C59316a aVar = new C59315a.C59316a();
        aVar.f135536b = "scan";
        aVar.f135537c = "021002";
        C59315a a2 = aVar.mo96936a();
        if (!C59308d.m109008c(str)) {
            return false;
        }
        a.openMiniApp(j, str, a2);
        C39162r.m79460a("enter_microapp", new C33744d().mo59983a("enter_from", "scan").mo59983a("enter_method", "scan_cam").mo59983a("microapp_id", C36132v.m73608b(str, "app_id")).f79943a);
        return true;
    }
}
