package com.p2082ss.android.ugc.aweme.compliance.api.services.depend;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.services.depend.a */
public final class C39275a {

    /* renamed from: a */
    private static volatile IComplianceDependService f92763a;

    static {
        Covode.recordClassIndex(46941);
    }

    /* renamed from: a */
    public static IComplianceDependService m79779a() {
        if (f92763a == null) {
            f92763a = ComplianceDependServiceImpl.m79583d();
        }
        return f92763a;
    }
}
