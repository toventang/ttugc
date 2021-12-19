package com.p2082ss.android.p2143g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.settings.LikoAnalysisConfig;
import java.io.File;

/* renamed from: com.ss.android.g.a */
public final class C29911a {
    static {
        Covode.recordClassIndex(36322);
    }

    /* renamed from: c */
    public static boolean m60289c() {
        try {
            if (C52912c.f121688a.f121689b.getMtLocalAnalysisHprof().intValue() == 1) {
                return true;
            }
            return false;
        } catch (C16041a e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: d */
    public static LikoAnalysisConfig m60290d() {
        try {
            LikoAnalysisConfig likoAnalysisConfig = (LikoAnalysisConfig) SettingsManager.m29616a().mo25396a("dmt_liko_analysis_config", LikoAnalysisConfig.class);
            if (likoAnalysisConfig == null) {
                return new LikoAnalysisConfig();
            }
            return likoAnalysisConfig;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static File m60287a() {
        Context a = C17867d.m33078a();
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = a.getFilesDir();
        }
        File file = new File(C58016d.f132222c.getAbsolutePath() + "/aweme_monitor");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: b */
    public static File m60288b() {
        File file;
        Context a = C17867d.m33078a();
        if (!TextUtils.isEmpty(null)) {
            file = a.getExternalFilesDir(null);
        } else {
            if (C58016d.f132223d == null || !C58016d.f132224e) {
                C58016d.f132223d = a.getExternalFilesDir(null);
            }
            file = C58016d.f132223d;
        }
        File file2 = new File(file.getPath() + "/aweme_monitor");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
