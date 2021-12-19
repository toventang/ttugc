package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.p4601a.C89064i;

/* renamed from: com.ss.android.ugc.aweme.property.ew */
public final class C65470ew {

    /* renamed from: a */
    public static final String[] f147664a = null;

    /* renamed from: b */
    public static final C65470ew f147665b = new C65470ew();

    private C65470ew() {
    }

    static {
        Covode.recordClassIndex(76957);
    }

    /* renamed from: a */
    public static final List<String> m117196a() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25397a("video_size_category", String[].class, f147664a);
            if (strArr != null) {
                return C89064i.m154508i(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
