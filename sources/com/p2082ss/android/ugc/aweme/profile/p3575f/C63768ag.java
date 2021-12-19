package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ag */
public final class C63768ag {

    /* renamed from: a */
    public static final C63768ag f144543a = new C63768ag();

    /* renamed from: b */
    private static final int f144544b = 1;

    /* renamed from: c */
    private static final int f144545c = 2;

    private C63768ag() {
    }

    static {
        Covode.recordClassIndex(75096);
    }

    /* renamed from: a */
    public static boolean m115321a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = iESSettingsProxy.getProAccountEnableDetailInfo();
            C89219l.m154716b(proAccountEnableDetailInfo, "");
            Integer isProaccountDisplay = proAccountEnableDetailInfo.getIsProaccountDisplay();
            int i = f144545c;
            if (isProaccountDisplay == null) {
                return false;
            }
            if (isProaccountDisplay.intValue() == i) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
