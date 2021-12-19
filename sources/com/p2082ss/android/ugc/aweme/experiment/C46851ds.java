package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.experiment.ds */
public final class C46851ds {

    /* renamed from: a */
    public static int f109157a = Keva.getRepo("ab_repo_cold_boot").getInt("key_ipc_memory_cache", 0);

    /* renamed from: b */
    public static int f109158b = Keva.getRepo("ab_repo_cold_boot").getInt("key_ipc_memory_cache_timeout", 0);

    /* renamed from: c */
    public static int f109159c = Keva.getRepo("ab_repo_cold_boot").getInt("key_opt_precreate_lock", 0);

    static {
        Covode.recordClassIndex(55452);
    }
}
