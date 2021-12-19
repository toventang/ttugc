package com.p2082ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.publish.core.upload.a */
public final class C65516a {

    /* renamed from: a */
    public static final SmartSliceModel f147747a = null;

    /* renamed from: b */
    public static final C65516a f147748b = new C65516a();

    private C65516a() {
    }

    static {
        Covode.recordClassIndex(77006);
    }

    /* renamed from: a */
    public static SmartSliceModel m117246a() {
        try {
            return (SmartSliceModel) SettingsManager.m29616a().mo25397a("network_smart_slice_model", SmartSliceModel.class, f147747a);
        } catch (Throwable unused) {
            return null;
        }
    }
}
