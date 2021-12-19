package com.p2082ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.effectplatform.algorithm.C86705b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.util.EffectUtilKt */
public final class EffectUtilKt {
    static {
        Covode.recordClassIndex(102745);
    }

    public static final native boolean nativeCheckEffectChildrenFile(String str);

    /* renamed from: a */
    public static final boolean m150630a(String str) {
        MethodCollector.m26663i(111);
        C89219l.m154719c(str, "");
        C86705b.f195527b.mo139942a();
        boolean nativeCheckEffectChildrenFile = nativeCheckEffectChildrenFile(str);
        MethodCollector.m26664o(111);
        return nativeCheckEffectChildrenFile;
    }
}
