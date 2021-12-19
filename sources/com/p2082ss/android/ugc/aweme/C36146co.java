package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.co */
final /* synthetic */ class C36146co implements AbstractC88433f {

    /* renamed from: a */
    private final ActivityC36140cm f85381a;

    /* renamed from: b */
    private final boolean f85382b;

    static {
        Covode.recordClassIndex(43399);
    }

    C36146co(ActivityC36140cm cmVar, boolean z) {
        this.f85381a = cmVar;
        this.f85382b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        ActivityC36140cm cmVar = this.f85381a;
        boolean z = this.f85382b;
        C58945a.C58947b.f134185a.mo96429b("app_start_to_get_did", false);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_first_request_to_get_did", false);
        if (z) {
            new C58221f.C58223b().mo95701b(C40313cq.f94478a.mo60095d()).mo95706a();
        } else {
            new C58221f.C58223b().mo95701b(C40313cq.f94478a.mo60096e()).mo95706a();
        }
        if (cmVar.f85371d != null) {
            cmVar.f85371d.dispose();
        }
        cmVar.f85371d = null;
    }
}
