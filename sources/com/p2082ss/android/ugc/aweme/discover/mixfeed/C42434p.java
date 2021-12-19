package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.p */
public final class C42434p {

    /* renamed from: a */
    static int f98890a;

    /* renamed from: b */
    static int f98891b;

    /* renamed from: c */
    public static final int f98892c;

    static {
        Covode.recordClassIndex(50380);
        int i = 10;
        Integer valueOf = Integer.valueOf(SettingsManager.m29616a().mo25394a("general_search_refresh_count", 10));
        if (!(valueOf.intValue() == 0 || valueOf == null)) {
            i = valueOf.intValue();
        }
        f98892c = i;
    }
}
