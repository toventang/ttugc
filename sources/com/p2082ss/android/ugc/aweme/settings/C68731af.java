package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.ss.android.ugc.aweme.settings.af */
public final class C68731af {

    /* renamed from: a */
    public static final C68731af f153752a = new C68731af();

    private C68731af() {
    }

    static {
        Covode.recordClassIndex(81000);
    }

    /* renamed from: a */
    public static final String[] m121165a() {
        Object obj;
        try {
            obj = C89379q.m157068constructorimpl((String[]) SettingsManager.m29616a().mo25396a("share_h5_url_allowlist", String[].class));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        return (String[]) obj;
    }
}
