package com.p2082ss.android.ugc.aweme.property;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.ar */
public final class C65348ar {

    /* renamed from: a */
    public static final int f147478a = 24;

    /* renamed from: b */
    public static final C65348ar f147479b = new C65348ar();

    private C65348ar() {
    }

    static {
        Covode.recordClassIndex(76835);
    }

    /* renamed from: a */
    public static final boolean m117034a() {
        if (Build.VERSION.SDK_INT >= SettingsManager.m29616a().mo25394a("enable_media_uri", 24)) {
            return true;
        }
        return false;
    }
}
