package com.p2082ss.android.ugc.aweme.profile.p3575f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.ProAccountEnableDetailInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.f.ae */
public final class C63766ae {

    /* renamed from: a */
    public static final C63766ae f144539a = new C63766ae();

    /* renamed from: b */
    private static final int f144540b = 1;

    /* renamed from: c */
    private static final int f144541c = 2;

    private C63766ae() {
    }

    static {
        Covode.recordClassIndex(75094);
    }

    /* renamed from: a */
    public static boolean m115318a() {
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            ProAccountEnableDetailInfo proAccountEnableDetailInfo = iESSettingsProxy.getProAccountEnableDetailInfo();
            C89219l.m154716b(proAccountEnableDetailInfo, "");
            Integer isProaccountDisplay = proAccountEnableDetailInfo.getIsProaccountDisplay();
            int i = f144541c;
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
