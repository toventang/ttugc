package com.bytedance.android.livesdk.rank.impl.p610c;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.c.a */
public final class C10384a {

    /* renamed from: a */
    public static int f25066a = -1;

    /* renamed from: b */
    public static int f25067b = -1;

    /* renamed from: c */
    public static final C10384a f25068c = new C10384a();

    private C10384a() {
    }

    static {
        Covode.recordClassIndex(11958);
    }

    /* renamed from: a */
    public static void m18891a(int i) {
        C3854a.m9453a(3, "RankDataHolder", "curRoomHourlyRank = ".concat(String.valueOf(i)));
        f25066a = i;
    }

    /* renamed from: b */
    public static void m18892b(int i) {
        C3854a.m9453a(3, "RankDataHolder", "curRoomAudienceNum = ".concat(String.valueOf(i)));
        f25067b = i;
    }
}
