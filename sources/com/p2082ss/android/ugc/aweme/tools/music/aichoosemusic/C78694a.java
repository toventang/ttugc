package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.a */
public final class C78694a {

    /* renamed from: a */
    public static SharedPreferences f176838a = C34822d.m71158a(AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getApplicationService().mo93774c(), "ai_music", 0);

    /* renamed from: a */
    public static long m137345a() {
        return f176838a.getLong("ai_music_time", 0);
    }

    /* renamed from: b */
    public static String m137346b() {
        return f176838a.getString("ai_music_url", "");
    }

    static {
        Covode.recordClassIndex(91837);
    }
}
