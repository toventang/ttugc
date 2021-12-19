package com.p2082ss.android.ugc.aweme.publish.p3620g.p3621a;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.settings.C68743i;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71412a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.publish.g.a.b */
public final class C65620b implements AbstractC27645k<SynthetiseResult> {

    /* renamed from: a */
    private final List<String> f147933a;

    static {
        Covode.recordClassIndex(77111);
    }

    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final void onFailure(Throwable th) {
    }

    public C65620b(List<String> list) {
        this.f147933a = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
    public final /* synthetic */ void onSuccess(SynthetiseResult synthetiseResult) {
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (synthetiseResult2.audioLength - synthetiseResult2.videoLength > 3000.0f) {
            int b = (int) C71412a.m126107b(synthetiseResult2.editPreviewInfo);
            if (C68743i.m121176a()) {
                C34611o.m70668a("aweme_synthesis_lost_video_log", new C69840ar().mo110189a("fileInfo", synthetiseResult2.toString()).mo110187a("duration", Integer.valueOf(b)).mo110191a());
            }
        }
        if (!this.f147933a.isEmpty() && C68743i.m121176a()) {
            C34611o.m70668a("aweme_synthesis_skip_frame_log", new C69840ar().mo110189a("fileInfo", this.f147933a.toString()).mo110191a());
        }
    }
}
