package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.t */
public final class C68435t {

    /* renamed from: a */
    public static final boolean f153194a = true;

    /* renamed from: b */
    public static final C68435t f153195b = new C68435t();

    /* renamed from: c */
    private static final boolean f153196c = SettingsManager.m29616a().mo25400a("enable_eoy_prop", true);

    private C68435t() {
    }

    static {
        Covode.recordClassIndex(80680);
    }

    /* renamed from: a */
    public static boolean m120865a(String str) {
        EoyHighlightConfig eoyHighlightConfig;
        List<String> text;
        if (!f153196c || str == null || str.length() == 0 || (eoyHighlightConfig = C68719x.f153729b) == null || (text = eoyHighlightConfig.getText()) == null || ((text instanceof Collection) && text.isEmpty())) {
            return false;
        }
        Iterator<T> it = text.iterator();
        while (it.hasNext()) {
            if (C89361p.m154908a((CharSequence) str, (CharSequence) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
