package com.p2082ss.android.ugc.aweme.story.base.p4020a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.story.base.a.d */
public final class C76610d {

    /* renamed from: a */
    public static final C76609c f171942a = new C76609c((byte) 0);

    /* renamed from: b */
    public static final C76610d f171943b = new C76610d();

    private C76610d() {
    }

    static {
        Covode.recordClassIndex(89596);
    }

    /* renamed from: a */
    public static final C76609c m134195a() {
        SettingsManager a = SettingsManager.m29616a();
        C76609c cVar = f171942a;
        C76609c cVar2 = (C76609c) a.mo25397a("studio_tt_story_settings", C76609c.class, cVar);
        return cVar2 == null ? cVar : cVar2;
    }
}
