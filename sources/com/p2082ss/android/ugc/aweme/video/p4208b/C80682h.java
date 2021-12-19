package com.p2082ss.android.ugc.aweme.video.p4208b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.player.C62890a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.b.h */
public final class C80682h {

    /* renamed from: a */
    public static final boolean f180382a = true;

    /* renamed from: b */
    public static Boolean f180383b;

    /* renamed from: c */
    public static final C80682h f180384c = new C80682h();

    private C80682h() {
    }

    static {
        Covode.recordClassIndex(93963);
    }

    /* renamed from: a */
    public static boolean m139907a() {
        if (!C62890a.f142627a) {
            return C16048b.m29633a().mo25421a(true, "enable_ies_route", true);
        }
        if (f180383b == null) {
            f180383b = Boolean.valueOf(C16048b.m29633a().mo25421a(true, "enable_ies_route", true));
        }
        Boolean bool = f180383b;
        if (bool == null) {
            C89219l.m154715b();
        }
        return bool.booleanValue();
    }
}
