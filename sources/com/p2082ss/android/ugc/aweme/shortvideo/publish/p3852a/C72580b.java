package com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a;

import androidx.core.p033d.C0646a;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69890bl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a.b */
final /* synthetic */ class C72580b implements C0646a.AbstractC0647a {

    /* renamed from: a */
    private final C72572a f162725a;

    static {
        Covode.recordClassIndex(85263);
    }

    C72580b(C72572a aVar) {
        this.f162725a = aVar;
    }

    @Override // androidx.core.p033d.C0646a.AbstractC0647a
    /* renamed from: a */
    public final void mo2678a() {
        C72572a aVar = this.f162725a;
        if (aVar.f161077c == 1 && aVar.mo114890e()) {
            C12290b.m22060a("aweme_movie_publish_error_rate_parallel", -39993, C69890bl.m123459b(aVar.f162695r).mo110187a("is_hd_video", Integer.valueOf(aVar.f162694q ? 1 : 0)).mo110191a());
            C80322d.m139251a("parallel_publish_result", C69890bl.m123458a(aVar.f162695r).mo129403a("status", -39993).mo129406a("retry_publish", aVar.f161079e ? "1" : "0").mo129406a("shoot_way", aVar.f162686i).mo129406a("publish_id", aVar.f161078d).f188764a);
            String str = aVar.f161078d;
            C89219l.m154721d(str, "");
            C80510gr.m139531a(str, BehaviorType.CANCEL, "WT", "-39993", null, 16);
        }
    }
}
