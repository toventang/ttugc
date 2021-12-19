package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.legacy.AbstractC58082a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.g */
final /* synthetic */ class C32994g implements AbstractC58082a {

    /* renamed from: a */
    private final RecoverDeletedAccountActivity f78522a;

    static {
        Covode.recordClassIndex(39798);
    }

    C32994g(RecoverDeletedAccountActivity recoverDeletedAccountActivity) {
        this.f78522a = recoverDeletedAccountActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.legacy.AbstractC58082a
    /* renamed from: a */
    public final void mo58814a() {
        RecoverDeletedAccountActivity recoverDeletedAccountActivity = this.f78522a;
        C29339a.m58753a(new RunnableC32995h(recoverDeletedAccountActivity), 5000);
        User curUser = recoverDeletedAccountActivity.f78509j.getCurUser();
        curUser.setUserCancelled(false);
        recoverDeletedAccountActivity.f78509j.updateCurUser(curUser);
        if (TextUtils.equals(recoverDeletedAccountActivity.f78506g, "enter_from_login_ui_routine")) {
            C31373a.C31374a.m65591a((Bundle) null);
        }
        if (C39223a.m79601o().mo68709f()) {
            C39223a.m79601o().mo68710g();
            C39223a.m79601o().mo68712i();
        }
        Context applicationContext = recoverDeletedAccountActivity.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        new C79459a(applicationContext).mo123050a(R.string.f8t).mo123053a();
        recoverDeletedAccountActivity.finish();
    }
}
