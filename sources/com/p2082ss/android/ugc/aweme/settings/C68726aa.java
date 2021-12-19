package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.C89379q;
import p4600h.C89382r;

/* renamed from: com.ss.android.ugc.aweme.settings.aa */
public final class C68726aa {

    /* renamed from: a */
    public static final C68726aa f153742a = new C68726aa();

    private C68726aa() {
    }

    static {
        Covode.recordClassIndex(80995);
    }

    /* renamed from: a */
    public static C68762z m121163a() {
        Object obj;
        try {
            obj = C89379q.m157068constructorimpl((C68762z) SettingsManager.m29616a().mo25396a("popup_block_list", C68762z.class));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        return (C68762z) obj;
    }
}
