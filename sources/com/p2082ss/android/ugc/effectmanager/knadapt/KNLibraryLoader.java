package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportLibraryLoader;
import com.p2082ss.ugc.effectplatform.algorithm.AbstractC86713g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNLibraryLoader */
public final class KNLibraryLoader implements AbstractC86713g {
    private final DownloadableModelSupportLibraryLoader oldLibraryLoader;

    static {
        Covode.recordClassIndex(95726);
    }

    public KNLibraryLoader(DownloadableModelSupportLibraryLoader downloadableModelSupportLibraryLoader) {
        C89219l.m154719c(downloadableModelSupportLibraryLoader, "");
        this.oldLibraryLoader = downloadableModelSupportLibraryLoader;
    }

    @Override // com.p2082ss.ugc.effectplatform.algorithm.AbstractC86713g
    public final void loadLibrary(String str) {
        C89219l.m154719c(str, "");
        this.oldLibraryLoader.loadLibrary(str);
    }
}
