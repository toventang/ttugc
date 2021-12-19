package com.p2082ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.EnumC16723b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod */
public class LoginMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C35026a f82628b = new C35026a((byte) 0);

    /* renamed from: c */
    private final String f82629c = "login";

    static {
        Covode.recordClassIndex(42120);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$a */
    public static final class C35026a {
        static {
            Covode.recordClassIndex(42121);
        }

        private C35026a() {
        }

        public /* synthetic */ C35026a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public String mo25752d() {
        return this.f82629c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public final void mo61890a(BaseBridgeMethod.AbstractC34965a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            C63770ai.m115326a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (mo61868i() == EnumC16723b.LYNX) {
            aVar.mo61872a((Object) jSONObject);
        } else {
            aVar.mo61874a(jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo61891b(BaseBridgeMethod.AbstractC34965a aVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", false);
        jSONObject.put("code", 1);
        if (mo61868i() == EnumC16723b.LYNX) {
            aVar.mo61872a((Object) jSONObject);
        } else {
            aVar.mo61874a(jSONObject);
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
        mo61865a("H5_nativeEvent", jSONObject2);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        Activity a = C34729o.m70950a(mo26893e());
        if (a != null) {
            String optString = jSONObject.optString("enter_from", "h5");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                String optString2 = jSONObject.optString("platform", "");
                C89219l.m154716b(optString2, "");
                if (!TextUtils.isEmpty(optString2)) {
                    AbstractC34892bo b = C31575b.m65860b();
                    C89219l.m154716b(b, "");
                    for (C31597d dVar : b.getAllSupportedLoginPlatform()) {
                        if (TextUtils.equals(optString2, dVar.f75560c)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("setting_page", "feedback_faq_list_page");
                            bundle.putBoolean("is_login", TextUtils.equals(mo25752d(), "loginWithPlatform"));
                            bundle.putString("jsb_parmas", jSONObject.toString());
                            AbstractC34892bo b2 = C31575b.m65860b();
                            IAccountService.C31274d dVar2 = new IAccountService.C31274d();
                            dVar2.f74960a = a;
                            dVar2.f74961b = optString;
                            dVar2.f74963d = bundle;
                            dVar2.f74964e = new C35027b(this, aVar);
                            b2.loginByPlatform(dVar2.mo57084a(), dVar);
                            return;
                        }
                    }
                }
                AbstractC34892bo b3 = C31575b.m65860b();
                IAccountService.C31274d dVar3 = new IAccountService.C31274d();
                dVar3.f74960a = a;
                dVar3.f74961b = optString;
                dVar3.f74964e = new C35028c(this, aVar);
                b3.showLoginAndRegisterView(dVar3.mo57084a());
                return;
            }
            mo61890a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$b */
    static final class C35027b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f82630a;

        /* renamed from: b */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82631b;

        static {
            Covode.recordClassIndex(42122);
        }

        C35027b(LoginMethod loginMethod, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82630a = loginMethod;
            this.f82631b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i != 1) {
                return;
            }
            if (i2 == 1) {
                this.f82630a.mo61890a(this.f82631b);
            } else {
                this.f82630a.mo61891b(this.f82631b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod$c */
    static final class C35028c implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ LoginMethod f82632a;

        /* renamed from: b */
        final /* synthetic */ BaseBridgeMethod.AbstractC34965a f82633b;

        static {
            Covode.recordClassIndex(42123);
        }

        C35028c(LoginMethod loginMethod, BaseBridgeMethod.AbstractC34965a aVar) {
            this.f82632a = loginMethod;
            this.f82633b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i != 1) {
                return;
            }
            if (i2 == 1) {
                this.f82632a.mo61890a(this.f82633b);
            } else {
                this.f82632a.mo61891b(this.f82633b);
            }
        }
    }
}
