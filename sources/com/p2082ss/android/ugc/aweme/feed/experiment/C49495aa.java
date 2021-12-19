package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.aa */
public final class C49495aa {

    /* renamed from: a */
    public static final int f113854a = SettingsManager.m29616a().mo25394a("feed_find_bug_setting", 1);

    /* renamed from: a */
    public static boolean m92734a() {
        if (f113854a >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m92735b() {
        if (f113854a >= 2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(58309);
    }
}
