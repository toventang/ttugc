package com.p2082ss.android.ugc.aweme.ttep;

import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.ttep.x */
final /* synthetic */ class C79332x implements AbstractC2565m {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178240a;

    static {
        Covode.recordClassIndex(92525);
    }

    C79332x(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178240a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178240a;
        EnumC78601i H = tTEPEffectPreviewActivity.f177914C.mo22754H();
        if (tTEPEffectPreviewActivity.f177930g != null) {
            C39162r.m79460a("choose_speed_mode", new C84425b().mo129406a("creation_id", tTEPEffectPreviewActivity.f177930g.f155830o).mo129406a("shoot_way", tTEPEffectPreviewActivity.f177930g.f155831p).mo129403a("draft_id", tTEPEffectPreviewActivity.f177930g.f155740A).mo129406a("speed_mode", H.description()).f188764a);
        }
    }
}
