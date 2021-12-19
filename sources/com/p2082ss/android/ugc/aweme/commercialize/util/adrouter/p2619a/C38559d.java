package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.d */
public final class C38559d extends AbstractC38555a {
    static {
        Covode.recordClassIndex(46091);
    }

    /* renamed from: e */
    private final String m78198e() {
        if (!TextUtils.isEmpty(mo67076d().f91096d.f91123a)) {
            return mo67076d().f91096d.f91123a;
        }
        return mo67076d().f91095c.f91126a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public final boolean mo65690a() {
        if (TextUtils.isEmpty(m78198e())) {
            return false;
        }
        return C59308d.m109008c(m78198e());
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        C59320c cVar = C59320c.C59324a.f135560a;
        C89219l.m154716b(cVar, "");
        IMiniAppService a = cVar.mo96989a();
        if (a == null || !a.openMiniApp(mo67075c(), m78198e(), new C59315a())) {
            return false;
        }
        return true;
    }
}
