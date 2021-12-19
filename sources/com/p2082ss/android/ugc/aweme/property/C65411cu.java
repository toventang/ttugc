package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.p4601a.C89064i;

/* renamed from: com.ss.android.ugc.aweme.property.cu */
public final class C65411cu {

    /* renamed from: a */
    public static final String[] f147559a = null;

    /* renamed from: b */
    public static final C65411cu f147560b = new C65411cu();

    private C65411cu() {
    }

    static {
        Covode.recordClassIndex(76898);
    }

    /* renamed from: a */
    public static final List<String> m117126a() {
        try {
            String[] strArr = (String[]) SettingsManager.m29616a().mo25397a("qa_sticker_regular", String[].class, f147559a);
            if (strArr != null) {
                return C89064i.m154508i(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
