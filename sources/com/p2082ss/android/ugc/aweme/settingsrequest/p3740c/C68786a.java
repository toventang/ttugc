package com.p2082ss.android.ugc.aweme.settingsrequest.p3740c;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.c.a */
public final class C68786a {

    /* renamed from: a */
    public static int f153841a = Keva.getRepo("ab_repo_cold_boot").getInt("key_preload_cache", 0);

    /* renamed from: b */
    public static int f153842b = Keva.getRepo("ab_repo_cold_boot").getInt("key_prepare_video", 0);

    /* renamed from: c */
    public static int f153843c = Keva.getRepo("ab_repo_cold_boot").getInt("key_preload_player", 0);

    /* renamed from: d */
    public static boolean f153844d = Keva.getRepo("ab_repo_cold_boot").getBoolean("feed_cache_delete_delay", false);

    static {
        Covode.recordClassIndex(81063);
    }
}
