package com.p2082ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32789g;
import java.util.ArrayList;
import java.util.Collection;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4601a.C89070n;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.d */
public final /* synthetic */ class C40908d implements AbstractC1729g {

    /* renamed from: a */
    private final Bundle f95719a;

    static {
        Covode.recordClassIndex(48760);
    }

    C40908d(Bundle bundle) {
        this.f95719a = bundle;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Bundle bundle = this.f95719a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C56812j(bundle));
        boolean z = bundle.getBoolean("new_user_need_set_username", false);
        boolean z2 = bundle.getBoolean("new_user_need_set_pass_word", false);
        IAccountUserService g = C31575b.m65865g();
        boolean z3 = g.getCurUser().notifyPrivatePolicy && g.isNewUser() && !bundle.getBoolean("is_from_new_user_journey", false);
        EnumC32594j jVar = EnumC32594j.FINISH;
        if (z2) {
            jVar = EnumC32594j.CREATE_PASSWORD_FOR_PHONE;
            bundle.putBoolean("show_skip", true);
        } else if (z) {
            jVar = EnumC32594j.CREATE_USERNAME;
        } else if (z3) {
            jVar = EnumC32594j.PRIVATE_ACCOUNT_TIPS;
        }
        if (jVar != EnumC32594j.FINISH) {
            C32789g gVar = new C32789g();
            gVar.setNeedCreatePwdForPhone(z2);
            gVar.setNeedSetUserName(z);
            gVar.setNeedShowPrivateAccountTips(z3);
            bundle.putSerializable("LoginActionContext", gVar);
            arrayList.add(new C65726q(bundle, jVar));
        }
        C53427i.m98592a(bundle, arrayList);
        arrayList.add(new C67213s(bundle));
        boolean z4 = bundle.getBoolean("is_from_new_user_journey", false);
        boolean z5 = bundle.getBoolean("need_restart", false);
        if (!z4) {
            arrayList.add(new C77714t(bundle, z5));
        }
        C53427i.m98594c(bundle, arrayList);
        C53427i.m98595d(bundle, arrayList);
        C53427i.m98593b(bundle, arrayList);
        arrayList.add(new C81661x(bundle));
        C31373a.C31374a.m65593a(C89070n.m154585g((Collection) arrayList));
        C31373a.C31374a.m65590a();
        C31373a.C31374a.m65591a(bundle);
        return iVar.mo5545d();
    }
}
