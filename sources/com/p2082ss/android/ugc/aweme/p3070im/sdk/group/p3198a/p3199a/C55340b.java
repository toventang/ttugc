package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3202b.C55370a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a.b */
public final class C55340b {

    /* renamed from: a */
    public static final C55340b f126554a = new C55340b();

    private C55340b() {
    }

    static {
        Covode.recordClassIndex(65105);
    }

    /* renamed from: a */
    private static void m101157a(Context context) {
        C89219l.m154721d(context, "");
        new C79459a(context).mo123050a(R.string.bon).mo123053a();
    }

    /* renamed from: a */
    public static final void m101158a(Context context, C19672u uVar) {
        String str;
        String statusMsg;
        C89219l.m154721d(context, "");
        if (uVar == null || (str = uVar.f46732e) == null || str.length() == 0) {
            m101157a(context);
            return;
        }
        C55370a aVar = (C55370a) C55214j.m100957a(uVar.f46732e, C55370a.class);
        if (aVar == null || (statusMsg = aVar.getStatusMsg()) == null || statusMsg.length() == 0) {
            m101157a(context);
            return;
        }
        String statusMsg2 = aVar.getStatusMsg();
        if (statusMsg2 != null) {
            new C79459a(context).mo123052a(statusMsg2).mo123053a();
        }
    }
}
