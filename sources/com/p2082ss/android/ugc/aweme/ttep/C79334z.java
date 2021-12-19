package com.p2082ss.android.ugc.aweme.ttep;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72454b;

/* renamed from: com.ss.android.ugc.aweme.ttep.z */
final /* synthetic */ class C79334z implements AbstractC1214u {

    /* renamed from: a */
    private final TTEPEffectPreviewActivity f178242a;

    static {
        Covode.recordClassIndex(92527);
    }

    C79334z(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f178242a = tTEPEffectPreviewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f178242a;
        C35324a aVar = (C35324a) obj;
        if (aVar != null && aVar.f83351b == C35324a.EnumC35325a.SUCCESS && aVar.f83350a != null) {
            int intValue = ((Integer) aVar.f83350a.getSecond()).intValue();
            if (tTEPEffectPreviewActivity.f177942s != null && tTEPEffectPreviewActivity.f177928e.getValue().mo7015b(AbstractC72453a.class) != null) {
                ((AbstractC72453a) tTEPEffectPreviewActivity.f177928e.getValue().mo7015b(AbstractC72453a.class)).mo114726a(C72454b.f162433c.f162435a, intValue);
            }
        }
    }
}
