package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import p4519d.p4520a.p4532e.AbstractC88059a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNLogger */
public final class KNLogger implements AbstractC88059a {
    public static final KNLogger INSTANCE = new KNLogger();

    public final void setEnabled(boolean z) {
    }

    private KNLogger() {
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final boolean getEnabled() {
        return EPLog.INSTANCE.getSEnableLog();
    }

    static {
        Covode.recordClassIndex(95727);
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logDebug(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        EPLog.m141898d(str, str2);
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logError(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        EPLog.m141899e(str, str2);
    }

    @Override // p4519d.p4520a.p4532e.AbstractC88059a
    public final void logError(String str, String str2, Throwable th) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(th, "");
        EPLog.m141900e(str, str2, th);
    }
}
