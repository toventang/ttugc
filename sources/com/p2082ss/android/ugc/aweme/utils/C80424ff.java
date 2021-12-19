package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71924b;

/* renamed from: com.ss.android.ugc.aweme.utils.ff */
public final class C80424ff {
    static {
        Covode.recordClassIndex(93692);
    }

    /* renamed from: a */
    public static boolean m139429a(final Activity activity, boolean z, boolean z2, String str) {
        if (activity == null) {
            return false;
        }
        if (z) {
            AVExternalServiceImpl.m113114a().asyncService(activity, "notification", new SimpleServiceLoadCallback() {
                /* class com.p2082ss.android.ugc.aweme.utils.C80424ff.C804273 */

                static {
                    Covode.recordClassIndex(93695);
                }

                @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    asyncAVService.uiService().recordService().startRecord(activity, new RecordConfig.Builder().showStickerPanel(true).build());
                }
            });
            return true;
        } else if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        } else {
            new C71924b().mo113571a(str, activity, "notification");
            return true;
        }
    }
}
