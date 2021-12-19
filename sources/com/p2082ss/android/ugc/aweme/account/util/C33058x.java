package com.p2082ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31686a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.account.util.x */
public final /* synthetic */ class C33058x implements AbstractC1729g {

    /* renamed from: a */
    private final Bundle f78609a;

    static {
        Covode.recordClassIndex(39865);
    }

    C33058x(Bundle bundle) {
        this.f78609a = bundle;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        String message;
        String str;
        Bundle bundle = this.f78609a;
        if (iVar.mo5544c()) {
            if (iVar.mo5546e() instanceof C34485a) {
                C34485a aVar = (C34485a) iVar.mo5546e();
                str = String.valueOf(aVar.getErrorCode());
                message = aVar.getErrorMsg();
            } else {
                message = iVar.mo5546e().getMessage();
                str = "";
            }
            C31686a.m66010a(str, message, C31686a.EnumC31687a.REFRESH_AWEME_USER, "");
        } else if (iVar.mo5545d() != null) {
            C31686a.m66008a(C31686a.EnumC31687a.REFRESH_AWEME_USER, ((User) iVar.mo5545d()).getUid());
        } else {
            C31686a.m66010a("", "user == null", C31686a.EnumC31687a.REFRESH_AWEME_USER, "");
        }
        if (!iVar.mo5544c()) {
            if (iVar.mo5545d() != null) {
                C36085cj.f85262b.mo57069e().queryUserSync((User) iVar.mo5545d());
            }
            return bundle;
        }
        throw iVar.mo5546e();
    }
}
