package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.p2082ss.ugc.effectplatform.AbstractC86780f;
import com.p2082ss.ugc.effectplatform.util.C86990h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNEPDecryptor */
public final class KNEPDecryptor implements AbstractC86780f {
    public static final KNEPDecryptor INSTANCE = new KNEPDecryptor();

    private KNEPDecryptor() {
    }

    static {
        Covode.recordClassIndex(95720);
    }

    @Override // com.p2082ss.ugc.effectplatform.AbstractC86780f
    public final String decrypt(String str) {
        C86990h.f196146a = EPUtils.getPlatformSDKVersion();
        return C86990h.m150652a(C86990h.f196148c, str);
    }

    @Override // com.p2082ss.ugc.effectplatform.AbstractC86780f
    public final String decrypt(String str, String str2) {
        C89219l.m154719c(str2, "");
        return C86990h.f196148c.mo140619a(str, str2);
    }
}
