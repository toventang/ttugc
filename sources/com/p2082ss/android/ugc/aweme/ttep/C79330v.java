package com.p2082ss.android.ugc.aweme.ttep;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84911q;

/* renamed from: com.ss.android.ugc.aweme.ttep.v */
final /* synthetic */ class C79330v implements AbstractC2565m {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178238a;

    static {
        Covode.recordClassIndex(92523);
    }

    C79330v(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178238a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178238a;
        if (((Boolean) obj).booleanValue() && tTEPEffectPreviewActivity.f177946w) {
            tTEPEffectPreviewActivity.f177946w = false;
            C84911q.m145921a("TTEPEffectPreviewActivity => addFragment by getFrameAvailableEvent");
            tTEPEffectPreviewActivity.f177931h.post(new RunnableC79329u(tTEPEffectPreviewActivity));
        }
    }
}
