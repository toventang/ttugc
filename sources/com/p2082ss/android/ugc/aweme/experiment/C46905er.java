package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.experiment.er */
public final class C46905er {

    /* renamed from: a */
    public static final C46922fa f109314a = new C46922fa();

    /* renamed from: b */
    public static final C46905er f109315b = new C46905er();

    private C46905er() {
    }

    static {
        Covode.recordClassIndex(55506);
    }

    /* renamed from: g */
    private static C46922fa m90209g() {
        return (C46922fa) C16048b.m29633a().mo25416a(true, "permission_popup_style_config", C46922fa.class, f109314a);
    }

    /* renamed from: a */
    public static String m90203a() {
        C46922fa g;
        String str;
        String str2;
        String str3 = null;
        if (m90209g() == null || (g = m90209g()) == null || g.f109348d == null) {
            return null;
        }
        C46922fa g2 = m90209g();
        if (g2 != null) {
            str = g2.f109348d;
        } else {
            str = null;
        }
        if (C89361p.m154872a(str, "Social_permissionPopup_main_con2", false)) {
            return C17867d.m33078a().getString(R.string.g4);
        }
        C46922fa g3 = m90209g();
        if (g3 != null) {
            str2 = g3.f109348d;
        } else {
            str2 = null;
        }
        if (m90202a(str2) == 0) {
            return null;
        }
        Context a = C17867d.m33078a();
        C46922fa g4 = m90209g();
        if (g4 != null) {
            str3 = g4.f109348d;
        }
        return a.getString(m90202a(str3));
    }

    /* renamed from: b */
    public static String m90204b() {
        C46922fa g;
        String str;
        String str2;
        String str3 = null;
        if (m90209g() == null || (g = m90209g()) == null || g.f109347c == null) {
            return null;
        }
        C46922fa g2 = m90209g();
        if (g2 != null) {
            str = g2.f109347c;
        } else {
            str = null;
        }
        if (C89361p.m154872a(str, "Social_permissionPopup_main_FB1", false)) {
            return C17867d.m33078a().getString(R.string.g3);
        }
        C46922fa g3 = m90209g();
        if (g3 != null) {
            str2 = g3.f109347c;
        } else {
            str2 = null;
        }
        if (m90202a(str2) == 0) {
            return null;
        }
        Context a = C17867d.m33078a();
        C46922fa g4 = m90209g();
        if (g4 != null) {
            str3 = g4.f109347c;
        }
        return a.getString(m90202a(str3));
    }

    /* renamed from: c */
    public static String m90205c() {
        String str;
        String str2;
        if (m90209g() != null) {
            C46922fa g = m90209g();
            String str3 = null;
            if (!(g == null || g.f109349e == null)) {
                C46922fa g2 = m90209g();
                if (g2 != null) {
                    str2 = g2.f109349e;
                } else {
                    str2 = null;
                }
                if (m90202a(str2) != 0) {
                    Context a = C17867d.m33078a();
                    C46922fa g3 = m90209g();
                    if (g3 != null) {
                        str3 = g3.f109349e;
                    }
                    str = a.getString(m90202a(str3));
                    C89219l.m154716b(str, "");
                    return str;
                }
            }
        }
        str = C17867d.m33078a().getString(R.string.mg);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: d */
    public static String m90206d() {
        String str;
        String str2;
        if (m90209g() != null) {
            C46922fa g = m90209g();
            String str3 = null;
            if (!(g == null || g.f109350f == null)) {
                C46922fa g2 = m90209g();
                if (g2 != null) {
                    str2 = g2.f109350f;
                } else {
                    str2 = null;
                }
                if (m90202a(str2) != 0) {
                    Context a = C17867d.m33078a();
                    C46922fa g3 = m90209g();
                    if (g3 != null) {
                        str3 = g3.f109350f;
                    }
                    str = a.getString(m90202a(str3));
                    C89219l.m154716b(str, "");
                    return str;
                }
            }
        }
        str = C17867d.m33078a().getString(R.string.at5);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: e */
    public static String m90207e() {
        String str;
        String str2;
        String str3;
        String str4;
        if (m90209g() != null) {
            C46922fa g = m90209g();
            String str5 = null;
            if (!(g == null || g.f109345a == null)) {
                C46922fa g2 = m90209g();
                if (g2 != null) {
                    str2 = g2.f109345a;
                } else {
                    str2 = null;
                }
                if (!C89361p.m154872a(str2, "disclosure_continue", false)) {
                    C46922fa g3 = m90209g();
                    if (g3 != null) {
                        str3 = g3.f109345a;
                    } else {
                        str3 = null;
                    }
                    if (C89361p.m154872a(str3, "OK", false)) {
                        str = C17867d.m33078a().getString(R.string.h35);
                    } else {
                        C46922fa g4 = m90209g();
                        if (g4 != null) {
                            str4 = g4.f109345a;
                        } else {
                            str4 = null;
                        }
                        if (m90202a(str4) == 0) {
                            str = C17867d.m33078a().getString(R.string.b7j);
                        } else {
                            Context a = C17867d.m33078a();
                            C46922fa g5 = m90209g();
                            if (g5 != null) {
                                str5 = g5.f109345a;
                            }
                            str = a.getString(m90202a(str5));
                        }
                    }
                    C89219l.m154716b(str, "");
                    return str;
                }
            }
        }
        str = C17867d.m33078a().getString(R.string.b7j);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: f */
    public static String m90208f() {
        String str;
        String str2;
        String str3;
        String str4;
        if (m90209g() != null) {
            C46922fa g = m90209g();
            String str5 = null;
            if (!(g == null || g.f109346b == null)) {
                C46922fa g2 = m90209g();
                if (g2 != null) {
                    str2 = g2.f109345a;
                } else {
                    str2 = null;
                }
                if (!C89361p.m154872a(str2, "none_close", false)) {
                    C46922fa g3 = m90209g();
                    if (g3 != null) {
                        str3 = g3.f109346b;
                    } else {
                        str3 = null;
                    }
                    if (C89361p.m154872a(str3, "Social_permissionPopup_disagree1", false)) {
                        str = C17867d.m33078a().getString(R.string.g2);
                    } else {
                        C46922fa g4 = m90209g();
                        if (g4 != null) {
                            str4 = g4.f109346b;
                        } else {
                            str4 = null;
                        }
                        if (m90202a(str4) == 0) {
                            str = C17867d.m33078a().getString(R.string.dh0);
                        } else {
                            Context a = C17867d.m33078a();
                            C46922fa g5 = m90209g();
                            if (g5 != null) {
                                str5 = g5.f109346b;
                            }
                            str = a.getString(m90202a(str5));
                        }
                    }
                    C89219l.m154716b(str, "");
                    return str;
                }
            }
        }
        str = C17867d.m33078a().getString(R.string.dh0);
        C89219l.m154716b(str, "");
        return str;
    }

    /* renamed from: a */
    private static int m90202a(String str) {
        return C17867d.m33078a().getResources().getIdentifier(str, "string", C17867d.m33078a().getPackageName());
    }
}
