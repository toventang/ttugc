package com.p2082ss.android.ugc.aweme.account.login.authorize;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.i */
final /* synthetic */ class C31882i implements AbstractC89172b {

    /* renamed from: a */
    private final AuthorizeActivity f76181a;

    static {
        Covode.recordClassIndex(38626);
    }

    C31882i(AuthorizeActivity authorizeActivity) {
        this.f76181a = authorizeActivity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        AuthorizeActivity authorizeActivity = this.f76181a;
        authorizeActivity.finish();
        C31667a.m65983a(11);
        C31667a.m65983a(9);
        User f = C36085cj.m73552f();
        C36085cj.m73540a(1, 1, (Object) "");
        C36085cj.m73544a(C36085cj.m73552f());
        if (f == null || f.getUid() == null || TextUtils.isEmpty(f.getUid()) || !authorizeActivity.getIntent().getBooleanExtra("need_remember_login_method", true)) {
            return null;
        }
        C31975q.m66354b(new TPLoginMethod(f.getUid(), authorizeActivity.f76134j, TPUserInfo.from(f), false, CommonUserInfo.defaultCommonUserInfo(), Long.valueOf(System.currentTimeMillis())));
        return null;
    }
}
