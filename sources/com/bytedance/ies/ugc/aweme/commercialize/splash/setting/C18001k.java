package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.k */
public final class C18001k {

    /* renamed from: a */
    public static final String[] f42860a = null;

    /* renamed from: b */
    public static final C18001k f42861b = new C18001k();

    private C18001k() {
    }

    static {
        Covode.recordClassIndex(20622);
    }

    /* renamed from: a */
    public static final List<String> m33512a() {
        Object obj;
        List<String> a;
        try {
            obj = C89379q.m157068constructorimpl((String[]) SettingsManager.m29616a().mo25397a("splash_switch_server_list", String[].class, f42860a));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr == null || (a = C89064i.m154463a(objArr)) == null) {
            return C89086z.INSTANCE;
        }
        return a;
    }
}
