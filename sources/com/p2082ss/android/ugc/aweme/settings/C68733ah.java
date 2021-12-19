package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.ss.android.ugc.aweme.settings.ah */
public final class C68733ah {

    /* renamed from: a */
    public static final C68733ah f153754a = new C68733ah();

    private C68733ah() {
    }

    static {
        Covode.recordClassIndex(81002);
    }

    /* renamed from: a */
    public static final String[] m121167a() {
        Object obj;
        try {
            obj = C89379q.m157068constructorimpl((String[]) SettingsManager.m29616a().mo25396a("ttnet_intercept_webview_block_list", String[].class));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        return (String[]) obj;
    }
}
