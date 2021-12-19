package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.e */
public final class C65595e {

    /* renamed from: a */
    public static final C65595e f147834a = new C65595e();

    private C65595e() {
    }

    static {
        Covode.recordClassIndex(77086);
    }

    /* renamed from: a */
    public static ClientUploadRouterModel m117385a() {
        try {
            return (ClientUploadRouterModel) SettingsManager.m29616a().mo25396a("creative_client_upload_router_setting", ClientUploadRouterModel.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
