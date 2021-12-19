package com.p2082ss.android.ugc.aweme.ttep;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.ttep.n */
final /* synthetic */ class RunnableC79268n implements Runnable {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178091a;

    static {
        Covode.recordClassIndex(92457);
    }

    RunnableC79268n(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178091a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178091a;
        if (tTEPEffectPreviewActivity.f177946w) {
            tTEPEffectPreviewActivity.f177946w = false;
            C84911q.m145921a("TTEPEffectPreviewActivity => addFragment by postDelay");
            tTEPEffectPreviewActivity.mo122951o();
            tTEPEffectPreviewActivity.mo122950n();
        }
    }
}
