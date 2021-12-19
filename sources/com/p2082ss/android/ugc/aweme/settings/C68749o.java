package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.o */
public final class C68749o {

    /* renamed from: a */
    public static final C68749o f153785a = new C68749o();

    private C68749o() {
    }

    static {
        Covode.recordClassIndex(81018);
    }

    /* renamed from: a */
    public static final boolean m121186a() {
        if (SettingsManager.m29616a().mo25400a("tool_enable_recover_publish_after_app_destroy", false) || C68747m.m121180a()) {
            return true;
        }
        return false;
    }
}
