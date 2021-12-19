package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18288a;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod */
public final class LoginMethod extends BaseCommonJavaMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C47849a f110846b = new C47849a((byte) 0);

    /* renamed from: a */
    public boolean f110847a;

    static {
        Covode.recordClassIndex(56506);
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$a */
    public static final class C47849a {
        static {
            Covode.recordClassIndex(56507);
        }

        private C47849a() {
        }

        public /* synthetic */ C47849a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static void m90863a(BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            C63770ai.m115326a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (aVar != null) {
            aVar.mo79888a(jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo79910b(BaseCommonJavaMethod.AbstractC47813a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (aVar != null) {
            aVar.mo79888a(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(StringSet.type, "loginCanceled");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            jSONObject2.put("args", jSONObject3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        sendEvent("H5_nativeEvent", jSONObject2, 3);
    }

    public LoginMethod(C18288a aVar, boolean z) {
        super(aVar);
        this.f110847a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2929fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.AbstractC47813a aVar) {
        Context actContext = getActContext();
        if (!(actContext instanceof Activity)) {
            actContext = null;
        }
        Activity activity = (Activity) actContext;
        if (!(activity == null || jSONObject == null)) {
            String optString = jSONObject.optString("enter_from", "h5");
            String optString2 = jSONObject.optString("enter_method", "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin() || C89219l.m154714a((Object) "find_account", (Object) optString)) {
                String optString3 = jSONObject.optString("platform", "");
                C89219l.m154716b(optString3, "");
                if (!TextUtils.isEmpty(optString3)) {
                    AbstractC34892bo b = C31575b.m65860b();
                    C89219l.m154716b(b, "");
                    for (C31597d dVar : b.getAllSupportedLoginPlatform()) {
                        if (TextUtils.equals(optString3, dVar.f75560c)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("setting_page", "feedback_faq_list_page");
                            bundle.putBoolean("is_login", this.f110847a);
                            bundle.putString("jsb_parmas", jSONObject.toString());
                            AbstractC34892bo b2 = C31575b.m65860b();
                            IAccountService.C31274d dVar2 = new IAccountService.C31274d();
                            dVar2.f74960a = activity;
                            dVar2.f74961b = optString;
                            dVar2.f74962c = optString2;
                            dVar2.f74963d = bundle;
                            dVar2.f74964e = new C47850b(this, aVar);
                            b2.loginByPlatform(dVar2.mo57084a(), dVar);
                            return;
                        }
                    }
                }
                AbstractC34892bo b3 = C31575b.m65860b();
                IAccountService.C31274d dVar3 = new IAccountService.C31274d();
                dVar3.f74960a = activity;
                dVar3.f74961b = optString;
                dVar3.f74964e = new C47851c(this, aVar);
                b3.showLoginAndRegisterView(dVar3.mo57084a());
                return;
            }
            m90863a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$b */
    static final class C47850b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f110848a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110849b;

        static {
            Covode.recordClassIndex(56508);
        }

        C47850b(LoginMethod loginMethod, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110848a = loginMethod;
            this.f110849b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i != 1) {
                return;
            }
            if (i2 == 1) {
                LoginMethod.m90863a(this.f110849b);
            } else {
                this.f110848a.mo79910b(this.f110849b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoginMethod$c */
    static final class C47851c implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f110850a;

        /* renamed from: b */
        final /* synthetic */ BaseCommonJavaMethod.AbstractC47813a f110851b;

        static {
            Covode.recordClassIndex(56509);
        }

        C47851c(LoginMethod loginMethod, BaseCommonJavaMethod.AbstractC47813a aVar) {
            this.f110850a = loginMethod;
            this.f110851b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i != 1) {
                return;
            }
            if (i2 == 1) {
                LoginMethod.m90863a(this.f110851b);
            } else {
                this.f110850a.mo79910b(this.f110851b);
            }
        }
    }
}
