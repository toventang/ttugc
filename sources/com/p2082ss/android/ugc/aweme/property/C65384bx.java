package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.p4601a.C89064i;

/* renamed from: com.ss.android.ugc.aweme.property.bx */
public final class C65384bx {

    /* renamed from: a */
    public static final String[] f147525a = null;

    /* renamed from: b */
    public static final C65384bx f147526b = new C65384bx();

    private C65384bx() {
    }

    static {
        Covode.recordClassIndex(76871);
    }

    /* renamed from: a */
    public static final List<String> m117081a() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25397a("upload_video_size_category", String[].class, f147525a);
            if (strArr != null) {
                return C89064i.m154508i(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
