package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.d */
public final class C32582d {

    /* renamed from: a */
    public static final C32582d f77734a = new C32582d();

    private C32582d() {
    }

    static {
        Covode.recordClassIndex(39354);
    }

    /* renamed from: a */
    public static String m67059a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        String string = bundle.getString("args_email");
        if (string == null) {
            return "";
        }
        return string;
    }

    /* renamed from: b */
    public static C31940a.C31941a m67065b(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        return (C31940a.C31941a) bundle.getSerializable("args_phone_number");
    }

    /* renamed from: c */
    public static void m67070c(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        bundle.putBoolean("login_with_2sv", true);
    }

    /* renamed from: a */
    public static String m67060a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(arguments, "");
        return m67059a(arguments);
    }

    /* renamed from: b */
    public static C31940a.C31941a m67066b(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(arguments, "");
        return m67065b(arguments);
    }

    /* renamed from: c */
    public static String m67069c(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        String string = arguments.getString("args_string_phone_number", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: d */
    public static boolean m67073d(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        return arguments.getBoolean("code_sent", false);
    }

    /* renamed from: e */
    public static String m67074e(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        String string = arguments.getString("ticket", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: f */
    public static String m67076f(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        String string = arguments.getString("not_login_ticket", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: g */
    public static String m67077g(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        String string = arguments.getString("verify_ticket", "");
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: h */
    public static boolean m67078h(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        return arguments.getBoolean("use_legacy_check_code", false);
    }

    /* renamed from: i */
    public static boolean m67079i(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        return arguments.getBoolean("login_with_2sv", false);
    }

    /* renamed from: d */
    public static void m67072d(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        bundle.putString("ticket", str);
    }

    /* renamed from: e */
    public static void m67075e(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        bundle.putString("verify_ticket", str);
    }

    /* renamed from: a */
    public static void m67061a(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        bundle.putString("args_email", str);
    }

    /* renamed from: b */
    public static void m67067b(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        bundle.putString("args_string_phone_number", str);
    }

    /* renamed from: a */
    public static void m67062a(Fragment fragment, C31940a.C31941a aVar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aVar, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putSerializable("args_phone_number", aVar);
    }

    /* renamed from: b */
    public static void m67068b(Fragment fragment, String str) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(arguments, "");
        m67072d(arguments, str);
    }

    /* renamed from: c */
    public static void m67071c(Bundle bundle, String str) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(str, "");
        try {
            List<String> b = C89361p.m154915b(str, new String[]{" "});
            if (b != null && b.size() == 2) {
                bundle.putSerializable("args_phone_number", C31940a.C31941a.create(Integer.parseInt(b.get(0)), Long.parseLong(b.get(1))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bundle.putString("args_string_phone_number", str);
    }

    /* renamed from: a */
    public static void m67063a(Fragment fragment, String str) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putString("args_email", str);
    }

    /* renamed from: a */
    public static void m67064a(Fragment fragment, boolean z) {
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        arguments.putBoolean("code_sent", z);
    }
}
