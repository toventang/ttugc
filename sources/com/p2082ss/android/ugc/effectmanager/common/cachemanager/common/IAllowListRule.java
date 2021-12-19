package com.p2082ss.android.ugc.effectmanager.common.cachemanager.common;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.common.cachemanager.common.IAllowListRule */
public interface IAllowListRule {
    static {
        Covode.recordClassIndex(95459);
    }

    boolean isAllowed(String str);
}
