package com.bytedance.bpea.core.checker;

import com.bytedance.bpea.basics.AbstractC13344e;
import com.bytedance.covode.number.Covode;

public final class CertCheckerProvider {
    private static final AbstractC13344e CHECKER = new C13381e();
    public static final CertCheckerProvider INSTANCE = new CertCheckerProvider();

    private CertCheckerProvider() {
    }

    public final AbstractC13344e getCHECKER() {
        return CHECKER;
    }

    static {
        Covode.recordClassIndex(15365);
    }
}
