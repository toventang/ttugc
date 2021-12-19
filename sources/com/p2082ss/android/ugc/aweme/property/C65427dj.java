package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.dj */
public final class C65427dj {

    /* renamed from: a */
    public static final C65428dk f147584a = null;

    /* renamed from: b */
    public static final C65427dj f147585b = new C65427dj();

    private C65427dj() {
    }

    static {
        Covode.recordClassIndex(76914);
    }

    /* renamed from: a */
    public static C65428dk m117145a() {
        try {
            C65428dk dkVar = (C65428dk) SettingsManager.m29616a().mo25397a("share_post", C65428dk.class, f147584a);
            if (dkVar == null) {
                return new C65428dk();
            }
            return dkVar;
        } catch (Throwable unused) {
            return new C65428dk();
        }
    }
}
