package com.p2082ss.android.ugc.aweme.settingsrequest.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.setting.C67967a;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.api.d */
public final /* synthetic */ class C68773d implements AbstractC88983w {

    /* renamed from: a */
    private final AbstractC28019l f153826a;

    static {
        Covode.recordClassIndex(81050);
    }

    public C68773d(AbstractC28019l lVar) {
        this.f153826a = lVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        AbstractC28019l lVar = this.f153826a;
        try {
            C68769a.m121239a(lVar.mo46789j());
            C28022o f = lVar.mo46789j().mo46807f("data");
            if (f != null) {
                C58945a.C58947b.f134185a.mo96425a("method_save_abtest_keva", false);
                C16048b.m29633a().mo25419a(f);
                C58945a.C58947b.f134185a.mo96429b("method_save_abtest_keva", false);
                C67967a.f152285a.mo108584a();
            }
            vVar.mo143031a((Object) true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
