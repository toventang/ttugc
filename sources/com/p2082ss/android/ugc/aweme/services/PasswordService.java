package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.C33917aq;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService */
public class PasswordService extends BasePasswordService implements AbstractC33974au {
    static {
        Covode.recordClassIndex(79696);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BasePasswordService, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BasePasswordService, com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void setPassword(Activity activity, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        super.setPassword(activity, bundle, gVar);
        SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle).withParam("next_page", EnumC32594j.CREATE_PASSWORD_FOR_PHONE.getValue()).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BasePasswordService, com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        super.verifyPassword(activity, str, bundle, gVar);
        SmartRoute withParam = SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam("enter_from", str).withParam("next_page", EnumC32594j.VERIFY_PASSWORD.getValue());
        if (bundle != null) {
            withParam.withParam(bundle);
        }
        withParam.open();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BasePasswordService, com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        if (C36085cj.f85262b.mo57069e().isChildrenMode()) {
            super.changePassword(activity, str, str2, bundle2, gVar);
            SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle2).withParam("next_page", EnumC32594j.CHANGE_PASSWORD_FOR_CHILDREN.getValue()).open();
            return;
        }
        User f = C36085cj.m73552f();
        if (f != null) {
            bundle2.putBoolean("from_changePwd", true);
            String bindPhone = f.getBindPhone();
            if (!TextUtils.isEmpty(bindPhone)) {
                C32582d.m67067b(bundle2, bindPhone);
                CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.PHONE_SMS_CHANGE_PASSWORD, EnumC32592i.CHANGE_PASSWORD, bundle2, gVar, null, false);
                return;
            }
            String email = f.getEmail();
            if (TextUtils.isEmpty(email)) {
                C36085cj.m73554h().bindMobileOrEmail(activity, str, str2, bundle2, new PasswordService$$Lambda$1(this, bundle2, activity, str, str2, gVar));
            } else if (f.isEmailVerified()) {
                C32582d.m67061a(bundle2, email);
                CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.EMAIL_SMS_CHANGE_PASSWORD, EnumC32592i.CHANGE_PASSWORD, bundle2, gVar, null, false);
            } else {
                bundle2.putBoolean("use_phone", true);
                bundle2.putBoolean("use_email", true);
                C36085cj.m73554h().verifyEmail(activity, str, bundle2, new PasswordService$$Lambda$0(bundle2, activity, gVar));
            }
        }
    }

    static final /* synthetic */ void lambda$changePassword$0$PasswordService(Bundle bundle, Activity activity, IAccountService.AbstractC31277g gVar, int i, int i2, Object obj) {
        if (i2 == 1) {
            bundle.putAll((Bundle) obj);
            CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.CHANGE_PASSWORD, EnumC32592i.CHANGE_PASSWORD, bundle, gVar, null, false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BasePasswordService, com.p2082ss.android.ugc.aweme.AbstractC34913br
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("enter_method", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("platForm", str);
        }
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.CHANGE_PASSWORD, EnumC32592i.CHANGE_PASSWORD, bundle2, gVar, null, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$changePassword$1$PasswordService(Bundle bundle, Activity activity, String str, String str2, IAccountService.AbstractC31277g gVar, int i, int i2, Object obj) {
        String str3;
        if (i2 == 1) {
            if (obj instanceof C33917aq) {
                try {
                    C32582d.m67072d(bundle, new JSONObject(((C33917aq) obj).f80226b).optString("ticket", ""));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                bundle.putAll((Bundle) obj);
            }
            if (i == 7) {
                str3 = "phone";
            } else {
                str3 = "email";
            }
            setPasswordForMT(activity, str3, str, str2, bundle, gVar);
        }
    }
}
