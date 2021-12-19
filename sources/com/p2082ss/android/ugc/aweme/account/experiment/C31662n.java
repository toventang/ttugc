package com.p2082ss.android.ugc.aweme.account.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.ClientExpManager;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.experiment.n */
public final class C31662n {

    /* renamed from: a */
    public static final C31662n f75731a = new C31662n();

    private C31662n() {
    }

    static {
        Covode.recordClassIndex(38393);
    }

    /* renamed from: a */
    public static boolean m65971a() {
        if (!m65974d() || m65973c() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static int m65973c() {
        return C16048b.m29633a().mo25411a("onboarding_email_consent", ClientExpManager.onboarding_email_consent());
    }

    /* renamed from: b */
    public static boolean m65972b() {
        if (!m65974d() || m65973c() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m65974d() {
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.US;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        return C89064i.m154489a(new String[]{"GB", "JP", "ID", "KR"}, upperCase);
    }
}
