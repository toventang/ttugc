package com.p2082ss.android.ugc.aweme.application;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.task.C58420ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p3682s.C67214a;
import com.p2082ss.android.ugc.aweme.utils.C80229aw;

/* renamed from: com.ss.android.ugc.aweme.application.d */
public final class C33899d {
    static {
        Covode.recordClassIndex(40817);
    }

    public static void handleAttachBaseContext(AwemeApplicationImpl awemeApplicationImpl) {
        awemeApplicationImpl.attachBaseContextAfterMultiDex();
        if (C67214a.m119159i()) {
            C58221f.m105147a(C58420ae.m106846n());
        }
        if (C67214a.m119162l()) {
            C58221f.m105147a(C58420ae.m106851s());
        }
        if (C29843f.m60129a(awemeApplicationImpl.f80184c)) {
            C58945a.C58947b.f134185a.mo96429b("cold_boot_application_attach_duration", true);
            C80229aw.m139065b("cold_boot_application_attach_duration");
            C58945a.C58947b.f134185a.mo96425a("cold_boot_application_attach_to_create", true);
            C80229aw.m139064a("cold_boot_application_attach_to_create");
        }
    }
}
