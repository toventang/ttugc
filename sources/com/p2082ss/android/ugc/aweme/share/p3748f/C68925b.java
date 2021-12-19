package com.p2082ss.android.ugc.aweme.share.p3748f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.f.b */
public final class C68925b {

    /* renamed from: a */
    public static final C68925b f154185a = new C68925b();

    private C68925b() {
    }

    static {
        Covode.recordClassIndex(81234);
    }

    /* renamed from: a */
    public static boolean m121619a() {
        if (!m121625g() || m121624f() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static int m121624f() {
        return C16048b.m29633a().mo25412a(true, "put_whatsapp_and_whatsappstatus_in_front", 0);
    }

    /* renamed from: b */
    public static boolean m121620b() {
        if (!m121625g() || m121624f() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m121621c() {
        if (!m121625g() || m121624f() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m121622d() {
        if (!m121625g() || m121624f() != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m121623e() {
        if (m121619a() || m121620b() || m121621c() || m121622d()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m121625g() {
        String a = C58071d.m104907a();
        C89219l.m154716b(a, "");
        Locale locale = Locale.US;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
        String upperCase = a.toUpperCase(locale);
        C89219l.m154716b(upperCase, "");
        return C89064i.m154489a(new String[]{"ID", "BR"}, upperCase);
    }
}
