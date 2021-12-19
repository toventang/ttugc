package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3682s.C67274g;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.experiment.hm */
public final class C47018hm {
    static {
        Covode.recordClassIndex(55619);
    }

    /* renamed from: a */
    public static void m90286a(List<Aweme> list) {
        if (C84892d.m145850a(list)) {
            return;
        }
        if (C67274g.m119193a() && !NetworkUtils.isWifi(C17879g.m33104a())) {
            return;
        }
        if (((Boolean) C67274g.f150755b.getValue()).booleanValue()) {
            for (Aweme aweme : list) {
                if (aweme != null) {
                    C80662ac.m139882a(aweme, 819200);
                }
            }
            return;
        }
        Aweme aweme2 = list.get(0);
        if (aweme2 != null) {
            C80662ac.m139882a(aweme2, 819200);
        }
    }
}
