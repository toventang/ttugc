package com.p2082ss.android.ugc.aweme.setting;

import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.p4601a.C89086z;

/* renamed from: com.ss.android.ugc.aweme.setting.x */
public final class C68719x {

    /* renamed from: a */
    public static final EoyHighlightConfig f153728a = null;

    /* renamed from: b */
    public static final EoyHighlightConfig f153729b = ((EoyHighlightConfig) SettingsManager.m29616a().mo25397a("eoy_highlight_config", EoyHighlightConfig.class, f153728a));

    /* renamed from: c */
    public static final C68719x f153730c = new C68719x();

    private C68719x() {
    }

    /* renamed from: a */
    public static boolean m121152a() {
        EoyHighlightConfig eoyHighlightConfig = f153729b;
        if (eoyHighlightConfig != null) {
            return eoyHighlightConfig.isEoyCampaign();
        }
        return false;
    }

    /* renamed from: c */
    public static List<String> m121154c() {
        List<String> text;
        EoyHighlightConfig eoyHighlightConfig = f153729b;
        if (eoyHighlightConfig == null || (text = eoyHighlightConfig.getText()) == null) {
            return C89086z.INSTANCE;
        }
        return text;
    }

    /* renamed from: d */
    public static String m121155d() {
        EoyHighlightConfig eoyHighlightConfig = f153729b;
        if (eoyHighlightConfig != null) {
            return eoyHighlightConfig.getHubUrl();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(80986);
    }

    /* renamed from: b */
    public static Integer m121153b() {
        String str;
        boolean z;
        EoyHighlightConfig eoyHighlightConfig = f153729b;
        if (eoyHighlightConfig != null) {
            str = eoyHighlightConfig.getColor();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Throwable unused) {
            return null;
        }
    }
}
