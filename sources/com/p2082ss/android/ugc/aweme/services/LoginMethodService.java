package com.p2082ss.android.ugc.aweme.services;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34889bn;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C40948dc;
import com.p2082ss.android.ugc.aweme.account.login.AbstractC32080t;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32104g;
import com.p2082ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.services.LoginMethodService */
public final class LoginMethodService implements AbstractC34889bn {
    public final String TAG = "LoginMethodService";

    static {
        Covode.recordClassIndex(79675);
    }

    public final String getCurSecUserId() {
        return C80061e.f179403k.mo123517e();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final boolean isTrustedEnvLoginFreshInstallEnable() {
        return C32104g.m66487a();
    }

    public final int getCurrentLoginHistoryState() {
        return C80036a.m138775a(getCurSecUserId());
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final boolean isOneKeyLoginExprimentEnable() {
        if (!C89361p.m154872a("JP", C58071d.m104907a(), true)) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final String getLatestLoginMethodName() {
        BaseLoginMethod d = C31975q.m66359d();
        if (d instanceof TPLoginMethod) {
            return ((TPLoginMethod) d).getPlatform();
        }
        return d.getLoginMethodName().name();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final boolean isCurrentMethodAvaliable() {
        String b = C36085cj.m73548b();
        C89219l.m154716b(b, "");
        if (!C13603b.m24435a((Collection) C31975q.m66353b(b))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final boolean getSaveLoginStatus() {
        Boolean allowOneKeyLogin;
        List<BaseLoginMethod> list = C31975q.f76367b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (C89219l.m154714a((Object) t.getUid(), (Object) C36085cj.m73548b())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!C13603b.m24435a((Collection) arrayList2) && (allowOneKeyLogin = ((BaseLoginMethod) C89070n.m154579f((List) arrayList2)).getAllowOneKeyLogin()) != null) {
            return allowOneKeyLogin.booleanValue();
        }
        if (isOneKeyLoginExprimentEnable()) {
            return false;
        }
        return ((AbstractC32080t) C40948dc.m82454a(C31291a.f74991a, AbstractC32080t.class)).mo58040b(false);
    }

    public final void removeLoginMethod(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C89219l.m154715b();
            }
            C31975q.m66346a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final void fetchLoginHistoryState(AbstractC1204m mVar, AbstractC89172b<? super Integer, C89391z> bVar) {
        LoginMethodService$fetchLoginHistoryState$1 loginMethodService$fetchLoginHistoryState$1 = new LoginMethodService$fetchLoginHistoryState$1(this, bVar);
        C89219l.m154721d(loginMethodService$fetchLoginHistoryState$1, "");
        TrustedEnvApi.f76563a.getLoginHistoryFeatureState().mo5534a(new TrustedEnvApi.C32084d(mVar, loginMethodService$fetchLoginHistoryState$1), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final void updateLoginHistoryState(int i, AbstractC89172b<? super Integer, C89391z> bVar) {
        LoginMethodService$updateLoginHistoryState$1 loginMethodService$updateLoginHistoryState$1 = new LoginMethodService$updateLoginHistoryState$1(this, i, bVar);
        C89219l.m154721d(loginMethodService$updateLoginHistoryState$1, "");
        TrustedEnvApi.f76563a.setLoginHistoryFeatureState(i).mo5534a(new TrustedEnvApi.C32086e(loginMethodService$updateLoginHistoryState$1), C1731i.f5564c, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34889bn
    public final void updateMethodInfo(String str, Object... objArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(objArr, "");
        C80053c cVar = null;
        int i = 2;
        switch (str.hashCode()) {
            case -1854071945:
                if (str.equals("update_expire_time") && objArr.length >= 2) {
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[1];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Long");
                    C31975q.m66348a((String) obj, ((Long) obj2).longValue(), false);
                    return;
                }
                return;
            case -573632447:
                if (str.equals("update_name") && objArr.length != 0) {
                    String b = C36085cj.m73548b();
                    C89219l.m154716b(b, "");
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    C31975q.m66350a(b, (String) obj3);
                    return;
                }
                return;
            case 58019962:
                if (str.equals("allow_one_key_login") && objArr.length != 0) {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean booleanValue = ((Boolean) obj4).booleanValue();
                    if (isOneKeyLoginExprimentEnable()) {
                        C31975q.m66351a(booleanValue);
                    } else {
                        ((AbstractC32080t) C40948dc.m82454a(C31291a.f74991a, AbstractC32080t.class)).mo58038a(booleanValue);
                    }
                    if (objArr.length >= 2) {
                        Object obj5 = objArr[1];
                        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        if (!((Boolean) obj5).booleanValue()) {
                            return;
                        }
                    }
                    if (booleanValue) {
                        i = 1;
                    }
                    updateLoginHistoryState(i, null);
                    return;
                }
                return;
            case 2043348218:
                if (str.equals("update_significan_user_info") && objArr.length != 0) {
                    Object obj6 = objArr[1];
                    if (obj6 instanceof C80053c) {
                        cVar = obj6;
                    }
                    C31975q.m66345a(cVar);
                    return;
                }
                return;
            case 2096788723:
                if (str.equals("update_last_active_time") && objArr.length >= 2) {
                    Object obj7 = objArr[0];
                    Objects.requireNonNull(obj7, "null cannot be cast to non-null type kotlin.String");
                    Object obj8 = objArr[1];
                    Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.Long");
                    C31975q.m66355b((String) obj7, ((Long) obj8).longValue());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
