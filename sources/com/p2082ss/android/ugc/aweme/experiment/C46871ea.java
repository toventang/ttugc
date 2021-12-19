package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.ea */
public final class C46871ea {

    /* renamed from: a */
    public static final C46871ea f109216a = new C46871ea();

    private C46871ea() {
    }

    static {
        Covode.recordClassIndex(55472);
    }

    /* renamed from: a */
    public static final boolean m90184a() {
        int a = C16048b.m29633a().mo25412a(false, "landing_page_optimization_experiment", 0);
        if (a == 0 || a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m90185a(Aweme aweme) {
        AwemeStatus status;
        C89219l.m154721d(aweme, "");
        int a = C16048b.m29633a().mo25412a(false, "landing_page_optimization_experiment", 0);
        if (a == 3 || ((a == 1 || a == 2) && (status = aweme.getStatus()) != null && status.getPrivateStatus() == 0)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m90186b(Aweme aweme) {
        AwemeStatus status;
        C89219l.m154721d(aweme, "");
        int a = C16048b.m29633a().mo25412a(false, "landing_page_optimization_experiment", 0);
        if (a == 0 || ((a == 1 || a == 2) && ((status = aweme.getStatus()) == null || status.getPrivateStatus() != 0))) {
            return true;
        }
        return false;
    }
}
