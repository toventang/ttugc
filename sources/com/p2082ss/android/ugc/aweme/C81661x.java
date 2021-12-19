package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32097d;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32103f;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32104g;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.x */
final /* synthetic */ class C81661x implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f182596a;

    static {
        Covode.recordClassIndex(95065);
    }

    C81661x(Bundle bundle) {
        this.f182596a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f182596a;
        if (bundle == null) {
            bundle = bundle2;
        }
        C57059k kVar = new C57059k(bundle);
        C57999l lVar = new C57999l(bundle);
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(lVar, "");
        if (!C32104g.m66488b()) {
            lVar.invoke();
            return;
        }
        if (System.currentTimeMillis() - Keva.getRepo("repo_new_version_journey").getLong("key_first_launch_time", 0) < C32103f.m66486a().f76597b) {
            lVar.invoke();
        } else if (System.currentTimeMillis() - Keva.getRepo("save_info_keva_repo").getLong("key_last_show_time", 0) < C32103f.m66486a().f76596a) {
            lVar.invoke();
        } else {
            Activity j = C17873f.m33102j();
            if (j == null || j.isFinishing()) {
                lVar.invoke();
            } else if (C36085cj.f85262b.mo57075k().getSaveLoginStatus() || !C36085cj.f85262b.mo57075k().isOneKeyLoginExprimentEnable()) {
                lVar.invoke();
            } else {
                C17205a aVar = C17205a.C17206a.f41116a;
                DialogContext.C17204a aVar2 = new DialogContext.C17204a((AbstractC1204m) j);
                aVar2.f41106a = AbstractC17207b.EnumC17208a.SAVE_LOGIN_INFO;
                aVar.mo27209a(aVar2.mo27208a(new C32097d.C32101d(j, kVar), true));
            }
        }
    }
}
