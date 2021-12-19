package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC35421cc;
import com.p2082ss.android.ugc.aweme.AbstractC40759ct;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.p2280ui.BindOrModifyPhoneActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.BindService */
public class BindService extends BaseBindService implements AbstractC33974au {
    private AbstractC35421cc mVerificationService;

    static {
        Covode.recordClassIndex(79597);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public void setAuthorzieBindResult(AbstractC40759ct ctVar) {
    }

    public void showThirdPartyAccountManagerActivity(Activity activity) {
    }

    public AbstractC35421cc getVerificationService() {
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    /* renamed from: com_ss_android_ugc_aweme_services_BindService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120109xf1418c3c(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void changeUnverifiedEmail(Activity activity, String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        super.changeUnverifiedEmail(activity, str, bundle2);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.INPUT_EMAIL_CHANGE, EnumC32592i.CHANGE_EMAIL, bundle2, null, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void unbindPhone(Activity activity, ArrayList<String> arrayList, String str) {
        super.unbindPhone(activity, arrayList, str);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(str, "");
        SmartRouter.buildRoute(activity, "//account/phone_or_email/unbind").withParam("enter_from", str).withParam("current_scene", EnumC32592i.UNBIND_PHONE.getValue()).withParam("next_page", EnumC32594j.UNBIND_PHONE_CONFIRM.getValue()).withParam("extra_eligible_login_methods", arrayList).open();
    }

    static final /* synthetic */ void lambda$null$0$BindService(IAccountService.AbstractC31277g gVar, int i, int i2, Object obj) {
        if (gVar != null) {
            gVar.onResult(i, 1, obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void bindMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        bindMobile(activity, str, "", bundle, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void modifyMobile(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        modifyMobileInner(activity, str, bundle, 0, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void modifyMobileVerifyByEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        modifyMobileInner(activity, str, bundle, 1, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj
    public void modifyMobileVerifyByPassword(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        modifyMobileInner(activity, str, bundle, 2, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void changeEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.changeEmail(activity, str, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        C32582d.m67061a(bundle2, C36085cj.m73552f().getEmail());
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.VERIFY_EMAIL_BEFORE_CHANGE, EnumC32592i.CHANGE_EMAIL, bundle2, gVar, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmail(Activity activity, String str, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmail(activity, str, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        C32582d.m67061a(bundle2, C36085cj.m73552f().getEmail());
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.CONFIRM_EMAIL_BEFORE_VERIFY, EnumC32592i.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void unbindEmail(Activity activity, boolean z, ArrayList<String> arrayList, String str) {
        super.unbindEmail(activity, z, arrayList, str);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(str, "");
        SmartRouter.buildRoute(activity, "//account/phone_or_email/unbind").withParam("enter_from", str).withParam("current_scene", EnumC32592i.UNBIND_EMAIL.getValue()).withParam("next_page", EnumC32594j.UNBIND_EMAIL_CONFIRM.getValue()).withParam("is_email_verified", z).withParam("extra_eligible_login_methods", arrayList).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void bindMobileOrEmailAndSetPwd(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        bindMobileOrEmail(activity, str, str2, bundle, new BindService$$Lambda$0(gVar, activity, str, str2));
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void bindMobileOrEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putBoolean("use_phone", true);
        bundle2.putBoolean("use_email", true);
        bindMobile(activity, str, str2, bundle2, gVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void bindEmail(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.bindEmail(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.putString("enter_from", str);
        if (str2 != null) {
            bundle2.putString("enter_method", str2);
        }
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.INPUT_EMAIL_BIND, EnumC32592i.BIND_EMAIL, bundle2, gVar, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        C32582d.m67061a(bundle2, C36085cj.m73552f().getEmail());
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.VERIFY_EMAIL_FOR_TICKET, EnumC32592i.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileForTicket(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        C32582d.m67067b(bundle2, C36085cj.m73552f().getBindPhone());
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.VERIFY_PHONE_FOR_TICKET, EnumC32592i.VERIFY, bundle2, gVar, null, false);
    }

    private void modifyMobileInner(Activity activity, String str, Bundle bundle, int i, IAccountService.AbstractC31277g gVar) {
        EnumC32594j jVar;
        super.modifyMobile(activity, str, bundle, gVar);
        C89219l.m154721d(activity, "");
        if (i == 1) {
            jVar = EnumC32594j.EMAIL_SMS_VERIFY;
        } else if (i != 2) {
            jVar = EnumC32594j.PHONE_SMS_VERIFY;
        } else {
            jVar = EnumC32594j.VERIFY_PASSWORD;
        }
        Intent putExtra = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC32592i.MODIFY_PHONE.getValue()).putExtra("next_page", jVar.getValue()).putExtra("enter_method", "change_bind_phone_click");
        C89219l.m154716b(putExtra, "");
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (bundle != null) {
            putExtra.putExtras(bundle);
        }
        m120109xf1418c3c(activity, putExtra);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34877bj, com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void bindMobile(Activity activity, String str, String str2, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        super.bindMobile(activity, str, str2, bundle, gVar);
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_scene", -1);
        if (i != -1) {
            bundle.putInt("last_scene", i);
            bundle.remove("current_scene");
            bundle.remove("next_page");
            bundle.remove("current_page");
        }
        C89219l.m154721d(activity, "");
        Intent putExtra = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", EnumC32592i.BIND_PHONE.getValue()).putExtra("next_page", EnumC32594j.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
        C89219l.m154716b(putExtra, "");
        putExtra.putExtras(bundle);
        if (!TextUtils.isEmpty(str)) {
            putExtra.putExtra("ENTER_REASON", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            putExtra.putExtra("enter_method", str2);
        }
        m120109xf1418c3c(activity, putExtra);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void verifyEmailWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.verifyEmailForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        C32582d.m67061a(bundle2, str3);
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.VERIFY_EMAIL_FOR_TICKET, EnumC32592i.VERIFY, bundle2, gVar, null, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseBindService
    public void verifyMobileWithWorkflowTokenForTicket(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.AbstractC31277g gVar) {
        Bundle bundle2 = bundle;
        super.verifyMobileForTicket(activity, str, str2, bundle2, gVar);
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        C32582d.m67067b(bundle2, str3);
        CommonFlowActivity.C32560a.m67023a(activity, EnumC32594j.VERIFY_PHONE_FOR_TICKET, EnumC32592i.VERIFY, bundle2, gVar, null, false);
    }

    static final /* synthetic */ void lambda$bindMobileOrEmailAndSetPwd$1$BindService(IAccountService.AbstractC31277g gVar, Activity activity, String str, String str2, int i, int i2, Object obj) {
        if (i2 == 1) {
            if (i != 7) {
                if (0 == 0) {
                    C36085cj.f85262b.mo57073i().setPasswordForMT(activity, "email", str, str2, null, new BindService$$Lambda$1(gVar));
                    return;
                }
            }
            if (gVar != null) {
                gVar.onResult(i, i2, obj);
            }
        } else if (gVar != null) {
            gVar.onResult(i, i2, obj);
        }
    }
}
