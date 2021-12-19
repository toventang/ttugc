package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNResourceFinder */
public final class KNResourceFinder extends DownloadableModelSupportResourceFinder {
    private final ResourceFinder resourceFinder;

    static {
        Covode.recordClassIndex(95731);
    }

    @Override // com.bef.effectsdk.ResourceFinder, com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public final long createNativeResourceFinder(long j) {
        return this.resourceFinder.createNativeResourceFinder(j);
    }

    @Override // com.bef.effectsdk.ResourceFinder, com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder
    public final void release(long j) {
        this.resourceFinder.release(j);
    }

    public KNResourceFinder(ResourceFinder resourceFinder2) {
        C89219l.m154719c(resourceFinder2, "");
        this.resourceFinder = resourceFinder2;
    }
}
