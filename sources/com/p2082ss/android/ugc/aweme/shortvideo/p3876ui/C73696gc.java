package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72454b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.gc */
final /* synthetic */ class C73696gc implements AbstractC1214u {

    /* renamed from: a */
    private final VideoRecordNewActivity f165535a;

    static {
        Covode.recordClassIndex(86434);
    }

    C73696gc(VideoRecordNewActivity videoRecordNewActivity) {
        this.f165535a = videoRecordNewActivity;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f165535a;
        C35324a aVar = (C35324a) obj;
        if (aVar != null && aVar.f83351b == C35324a.EnumC35325a.SUCCESS && aVar.f83350a != null) {
            int intValue = ((Integer) aVar.f83350a.getSecond()).intValue();
            if (videoRecordNewActivity.f164826u != null && videoRecordNewActivity.f164810e.getValue().mo7015b(AbstractC72453a.class) != null) {
                ((AbstractC72453a) videoRecordNewActivity.f164810e.getValue().mo7015b(AbstractC72453a.class)).mo114726a(C72454b.f162433c.f162435a, intValue);
            }
        }
    }
}
