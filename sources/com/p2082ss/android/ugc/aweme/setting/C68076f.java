package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.f */
public final class C68076f {

    /* renamed from: a */
    public static final CaptionConfig f152467a = null;

    /* renamed from: b */
    public static final C68076f f152468b = new C68076f();

    private C68076f() {
    }

    static {
        Covode.recordClassIndex(80272);
    }

    /* renamed from: a */
    public static final CaptionConfig m120375a() {
        return (CaptionConfig) SettingsManager.m29616a().mo25397a("tool_caption_config", CaptionConfig.class, f152467a);
    }
}
