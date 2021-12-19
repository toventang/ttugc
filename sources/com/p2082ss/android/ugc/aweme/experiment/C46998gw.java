package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.gw */
public final class C46998gw {

    /* renamed from: a */
    public static final C46998gw f109510a = new C46998gw();

    private C46998gw() {
    }

    static {
        Covode.recordClassIndex(55599);
    }

    /* renamed from: c */
    private static int m90277c() {
        return C16048b.m29633a().mo25411a("topic_interest_selection_style", ClientExpManager.topic_interest_selection_style());
    }

    /* renamed from: a */
    public static boolean m90275a() {
        if (!m90278d() || m90277c() == 0 || m90277c() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m90276b() {
        if (!m90278d() || m90277c() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m90278d() {
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.US;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        return C89219l.m154714a((Object) upperCase, (Object) "US");
    }
}
