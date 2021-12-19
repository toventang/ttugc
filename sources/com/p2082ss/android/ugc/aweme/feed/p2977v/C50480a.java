package com.p2082ss.android.ugc.aweme.feed.p2977v;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.feed.v.a */
public final class C50480a {

    /* renamed from: a */
    public static final boolean f116594a = false;

    /* renamed from: b */
    public static final C50480a f116595b = new C50480a();

    private C50480a() {
    }

    static {
        Covode.recordClassIndex(59617);
    }

    /* renamed from: a */
    public static final boolean m94644a() {
        try {
            return SettingsManager.m29616a().mo25400a("expand_the_character_limit_of_video_caption_enable_for_consumers", false);
        } catch (Throwable unused) {
            return f116594a;
        }
    }
}
