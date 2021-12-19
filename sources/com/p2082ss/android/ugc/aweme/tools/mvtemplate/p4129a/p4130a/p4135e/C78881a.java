package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4135e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.vesdk.VEUtils;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.e.a */
public final class C78881a {
    static {
        Covode.recordClassIndex(92030);
    }

    /* renamed from: a */
    public static final boolean m137681a(Effect effect) {
        if (!(effect == null || effect.getUnzipPath() == null)) {
            String unzipPath = effect.getUnzipPath();
            if (C80720e.m139927b(unzipPath) && VEUtils.checkMVResourceIntegrity(unzipPath) == 0) {
                return true;
            }
        }
        return false;
    }
}
