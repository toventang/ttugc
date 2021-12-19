package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.LoginActionFlowActivity;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;

/* renamed from: com.ss.android.ugc.aweme.q */
final /* synthetic */ class C65726q implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f148113a;

    /* renamed from: b */
    private final EnumC32594j f148114b;

    static {
        Covode.recordClassIndex(77225);
    }

    C65726q(Bundle bundle, EnumC32594j jVar) {
        this.f148113a = bundle;
        this.f148114b = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f148113a;
        EnumC32594j jVar = this.f148114b;
        if (bundle != null) {
            bundle2 = bundle;
        }
        Activity j = C17873f.m33102j();
        if (j != null) {
            CommonFlowActivity.m67015a(j, jVar, EnumC32592i.LOGIN_FLOW, bundle2, new C62751p(bundle2), LoginActionFlowActivity.class, true);
        } else {
            C31373a.C31374a.m65591a(bundle2);
        }
    }
}
