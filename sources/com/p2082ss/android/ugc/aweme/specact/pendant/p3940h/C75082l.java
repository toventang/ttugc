package com.p2082ss.android.ugc.aweme.specact.pendant.p3940h;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.pendant.h.l */
public final class C75082l {

    /* renamed from: a */
    public static final C75082l f168743a = new C75082l();

    private C75082l() {
    }

    static {
        Covode.recordClassIndex(87954);
    }

    /* renamed from: a */
    public static boolean m131847a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (C75062c.m131824a(aweme) || aweme.getAwemeType() == 101 || C39223a.m79601o().mo68703a() || !C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            return false;
        }
        if (C75063d.m131826a() || C75063d.m131827b()) {
            return true;
        }
        return false;
    }
}
