package com.p2082ss.android.ugc.aweme.qainvitation.p3641f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.C65849f;

/* renamed from: com.ss.android.ugc.aweme.qainvitation.f.a */
public final class C65854a {

    /* renamed from: a */
    public static final C65854a f148403a = new C65854a();

    private C65854a() {
    }

    static {
        Covode.recordClassIndex(77355);
    }

    /* renamed from: a */
    public static final C65849f m117765a() {
        C65849f fVar = new C65849f(30);
        try {
            C65849f fVar2 = (C65849f) SettingsManager.m29616a().mo25396a("qa_invitation_settings", C65849f.class);
            return fVar2 == null ? fVar : fVar2;
        } catch (Exception unused) {
            return fVar;
        }
    }
}
