package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.ej */
public final class C46882ej {

    /* renamed from: a */
    public static final String[] f109253a;

    /* renamed from: b */
    public static String[] f109254b;

    /* renamed from: c */
    public static final C46882ej f109255c = new C46882ej();

    private C46882ej() {
    }

    static {
        String[] strArr;
        Covode.recordClassIndex(55483);
        String[] strArr2 = {"surl", "fallback_url"};
        f109253a = strArr2;
        try {
            strArr = (String[]) SettingsManager.m29616a().mo25397a("lynxview_command_blacklist", String[].class, strArr2);
        } catch (Exception unused) {
            strArr = f109253a;
        }
        f109254b = strArr;
    }
}
