package com.p2082ss.android.ugc.aweme.account.login.p2259d;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.Set;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.d.a */
public final class C31898a {

    /* renamed from: a */
    public static final Set<Integer> f76207a = C89047am.m154438a((Object[]) new Integer[]{7, 2027, 2028, 2033, 2032, 2020, 2046, 1091, 1092, 1093, 2031});

    /* renamed from: b */
    public static final C31898a f76208b = new C31898a();

    private C31898a() {
    }

    static {
        Covode.recordClassIndex(38642);
    }

    /* renamed from: a */
    public static void m66240a(AbstractC32572b bVar, String str) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.QRCODE_LOGIN.getValue());
        arguments.putString("extra_previous_page", "login_procedure_jump");
        arguments.putString("previous_page_location", str);
        C89219l.m154716b(arguments, "");
        bVar.mo58461a(arguments);
    }

    /* renamed from: a */
    public static void m66241a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C39162r.m79460a("login_procedure_jump_cancel", new C33744d().mo59983a("platform", str).mo59983a("desc", str2).f79943a);
    }
}
