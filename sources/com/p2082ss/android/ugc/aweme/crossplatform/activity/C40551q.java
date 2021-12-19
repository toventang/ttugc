package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.MixActivityContainer;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.q */
public final /* synthetic */ class C40551q implements AbstractC88433f {

    /* renamed from: a */
    private final MixActivityContainer f94878a;

    static {
        Covode.recordClassIndex(48372);
    }

    C40551q(MixActivityContainer mixActivityContainer) {
        this.f94878a = mixActivityContainer;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MixActivityContainer mixActivityContainer = this.f94878a;
        MixActivityContainer.C40532a aVar = (MixActivityContainer.C40532a) obj;
        if (aVar.f94844b && C17873f.f42636l) {
            aVar.f94843a.mo68645h();
        }
        Activity activity = aVar.f94845c.get();
        if (mixActivityContainer.f94825p && activity != null && (activity instanceof CrossPlatformActivity)) {
            if (C17873f.f42636l) {
                C39162r.m79460a("exit_referral_new_user_guide", new C33744d().mo59981a("stay_time", mixActivityContainer.f94817h).mo59983a("exit_method", "background").f79943a);
            } else {
                C39162r.m79460a("exit_referral_new_user_guide", new C33744d().mo59981a("stay_time", mixActivityContainer.f94817h).mo59983a("exit_method", "dismiss").f79943a);
            }
        }
        if (mixActivityContainer.f94818i != null) {
            mixActivityContainer.f94818i.dispose();
        }
    }
}
