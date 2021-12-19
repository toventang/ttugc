package com.p2082ss.android.ugc.aweme.specact.popup.p3943b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.specact.pendant.p3940h.C75083m;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75116a;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75124i;
import com.p2082ss.android.ugc.aweme.specact.popup.p3942a.C75125j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.b.a */
public final class C75142a {

    /* renamed from: a */
    public static final C75142a f168960a = new C75142a();

    private C75142a() {
    }

    static {
        Covode.recordClassIndex(88018);
    }

    /* renamed from: a */
    private static String m131892a(C75124i iVar) {
        String str = null;
        if (C89219l.m154714a((Object) iVar.f168883c, (Object) "task_progress_list") && (!iVar.f168891k.isEmpty())) {
            for (C75116a aVar : iVar.f168891k) {
                for (C75125j jVar : aVar.f168857c) {
                    if (str == null) {
                        str = "";
                    }
                    str = str + jVar.f168902c + ',';
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m131893a(C75124i iVar, String str) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("referral_dialog_pop_click", m131894b(iVar, str).f79943a);
    }

    /* renamed from: b */
    static C33744d m131894b(C75124i iVar, String str) {
        C33744d dVar = new C33744d();
        dVar.mo59983a("pop_name", iVar.f168883c);
        dVar.mo59983a("position", "feed");
        dVar.mo59980a("is_login", C75083m.m131849a() ? 1 : 0);
        dVar.mo59983a("region", C58071d.m104907a());
        String a = m131892a(iVar);
        if (a != null) {
            dVar.mo59983a("task_ids", a);
        }
        if (str != null) {
            dVar.mo59983a("button_name", str);
        }
        C89219l.m154716b(dVar, "");
        return dVar;
    }
}
