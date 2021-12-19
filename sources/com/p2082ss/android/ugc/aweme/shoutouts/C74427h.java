package com.p2082ss.android.ugc.aweme.shoutouts;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.h */
public final class C74427h {

    /* renamed from: a */
    public static final C74428i f167373a = null;

    /* renamed from: b */
    public static final C74427h f167374b = new C74427h();

    private C74427h() {
    }

    static {
        Covode.recordClassIndex(87205);
    }

    /* renamed from: a */
    public static C74428i m130883a() {
        if (m130884b() == null) {
            return new C74428i();
        }
        C74428i b = m130884b();
        if (b == null) {
            C89219l.m154715b();
        }
        return b;
    }

    /* renamed from: b */
    private static C74428i m130884b() {
        return (C74428i) SettingsManager.m29616a().mo25397a("shoutouts_config_collection", C74428i.class, f167373a);
    }
}
