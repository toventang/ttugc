package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.IPreloadVESo */
public interface IPreloadVESo {
    static {
        Covode.recordClassIndex(79635);
    }

    long getPreLoadVESoCostTime();

    PreloadVESoStatus getPreLoadVESoStatus();

    void preLoadVESo();
}
