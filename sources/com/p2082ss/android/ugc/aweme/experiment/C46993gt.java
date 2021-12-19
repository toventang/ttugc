package com.p2082ss.android.ugc.aweme.experiment;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34598e;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.experiment.gt */
public final class C46993gt {

    /* renamed from: a */
    public static final C34598e f109502a = new C34598e(C17867d.m33078a(), "change_username");

    /* renamed from: b */
    public static final C46993gt f109503b = new C46993gt();

    private C46993gt() {
    }

    static {
        Covode.recordClassIndex(55594);
    }

    /* renamed from: a */
    public static final boolean m90271a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String b = C80580in.m139684b(g.getCurUser());
        C89219l.m154716b(b, "");
        return m90272a(b);
    }

    /* renamed from: a */
    public static final boolean m90272a(String str) {
        C89219l.m154721d(str, "");
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        C89350l lVar = new C89350l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        try {
            Object a = SettingsManager.m29616a().mo25396a("handle_settings", C46957fv.class);
            C89219l.m154716b(a, "");
            String str2 = ((C46957fv) a).f109436a;
            if (str2 != null) {
                lVar = new C89350l(str2);
            }
        } catch (Throwable unused) {
            lVar = new C89350l("^(?![0-9]+$)[a-z0-9_.]{1,23}[a-z0-9_]$");
        }
        return lVar.matches(str);
    }
}
