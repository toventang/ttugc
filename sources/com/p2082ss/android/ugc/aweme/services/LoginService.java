package com.p2082ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34292ax;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.AbstractC35326bx;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C52817g;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.apiguard.ApiGuardService;
import com.p2082ss.android.ugc.aweme.account.base.p2243a.DialogC31590a;
import com.p2082ss.android.ugc.aweme.account.bean.C31597d;
import com.p2082ss.android.ugc.aweme.account.login.C31858ab;
import com.p2082ss.android.ugc.aweme.account.login.C31959k;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.C32079s;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31809a;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31852aa;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.p2082ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p2082ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.MusCountryListActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32585g;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.SignUpOrLoginActivity;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2251j.C31692a;
import com.p2082ss.android.ugc.aweme.account.p2252k.C31717c;
import com.p2082ss.android.ugc.aweme.account.p2252k.C31718d;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32858h;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32861j;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.aweme.account.p2280ui.RecoverDeletedAccountActivity;
import com.p2082ss.android.ugc.aweme.app.PushLoginActivity;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.LoginService */
public class LoginService extends BaseLoginService implements AbstractC33974au {
    private Dialog mLoginDialog;

    static {
        Covode.recordClassIndex(79678);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public Class<? extends Activity> getPushLoginActivityClass() {
        return PushLoginActivity.class;
    }

    public void retryLogin() {
        retryLogin(false);
    }

    static final /* synthetic */ void lambda$null$0$LoginService() {
        C36085cj.m73540a(1, 3, (Object) "");
        C36085cj.m73555i();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public boolean isEnableMultiAccountLogin() {
        if (!C16048b.m29633a().mo25421a(true, "enable_multi_account_login", true) || C31575b.m65865g().isChildrenMode()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.mLoginDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mLoginDialog = null;
        }
        Dialog dialog2 = this.mLoginDialog;
        if (dialog2 != null && dialog2.isShowing()) {
            this.mLoginDialog.dismiss();
            this.mLoginDialog = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService, com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public List<C31597d> getAllSupportedLoginPlatform() {
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new C31597d("Email", 2131231095, "email"));
        linkedList.addAll(C32858h.m67460a(EnumC32330v.values()));
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.services.LoginService$1 */
    public static /* synthetic */ class C678711 {

        /* renamed from: $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName */
        static final /* synthetic */ int[] f152051x974b3082;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 79683(0x13743, float:1.1166E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName[] r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.services.LoginService.C678711.f152051x974b3082 = r2
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.THIRD_PARTY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.services.LoginService.C678711.f152051x974b3082     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_NUMBER_PASS     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.services.LoginService.C678711.f152051x974b3082     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.android.ugc.aweme.services.LoginService.C678711.f152051x974b3082     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.EMAIL_PASS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.android.ugc.aweme.services.LoginService.C678711.f152051x974b3082     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName.USER_NAME_PASS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.services.LoginService.C678711.<clinit>():void");
        }
    }

    public boolean isLoginActivity(Activity activity) {
        return activity instanceof SignUpOrLoginActivity;
    }

    public void openPrivacyPolicy(Activity activity) {
        C80273bt.m139145a(DialogC31590a.m65890b(activity));
    }

    /* renamed from: com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo */
    public static boolean m120112xc216117(Context context) {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void retryLogin(boolean z) {
        new Handler().postDelayed(new LoginService$$Lambda$2(this, z), 300);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1 */
    public static boolean m120113xae505bbf(Context context) {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = m120112xc216117(context);
        C58029j.f132256h = com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
        return com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$retryLogin$3$LoginService(boolean z) {
        C31975q.m66354b(new BaseLoginMethod());
        if (getLoginParam() != null) {
            getLoginParam().f74956d.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(getLoginParam());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public boolean toRecoverDeletedAccount(String str) {
        if (!C36085cj.m73552f().isUserCancelled()) {
            return false;
        }
        ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60105f().mo60106a();
        Context a = C17867d.m33078a();
        Intent intent = new Intent(a, RecoverDeletedAccountActivity.class);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        C84349a.m145093a(intent, a);
        a.startActivity(intent);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService, com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void showLoginAndRegisterView(IAccountService.C31273c cVar) {
        super.showLoginAndRegisterView(cVar);
        if (cVar.f74953a != null && !cVar.f74953a.isFinishing()) {
            ApiGuardService.createIApiGuardServicebyMonsterPlugin(false).initializeApiGuard();
            boolean z = cVar.f74956d.getBoolean("is_fullscreen_dialog");
            C32079s.f76561a = cVar.f74956d.getString("enter_method", "");
            C32079s.f76562b = cVar.f74956d.getString("enter_from", "");
            if (!C39223a.m79594h().mo68584c() || z) {
                showLoginAndRegisterViewInner(cVar);
                return;
            }
            Activity activity = cVar.f74953a;
            Bundle bundle = cVar.f74956d;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            DialogC31809a aVar = new DialogC31809a(activity, bundle);
            Window window = aVar.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.flags |= 2;
                window.setAttributes(attributes);
                window.setWindowAnimations(R.style.uf);
            }
            aVar.show();
            this.mLoginDialog = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService, com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void showLoginView(IAccountService.C31273c cVar) {
        super.showLoginView(cVar);
        C39162r.m79460a("click_login", new C31376a().mo57399a("enter_method", C32079s.f76561a).f75156a);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C31291a.m65463a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.mo60082a("click_login");
            iFeed0VVManagerService.mo60083b("LOGIN");
        }
        SmartRoute c = C32867m.m67468c(cVar.f74953a);
        if (TextUtils.isEmpty(cVar.f74956d.getString("enter_type"))) {
            cVar.f74956d.putString("enter_type", "click_login");
        }
        ApiGuardService.createIApiGuardServicebyMonsterPlugin(false).initializeApiGuard();
        c.withParam(cVar.f74956d);
        c.open();
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void uploadAccountNum(boolean z) {
        LoginService g = C36085cj.m73553g();
        C89219l.m154716b(g, "");
        if (g.isEnableMultiAccountLogin()) {
            if (C32861j.f78242e == 0) {
                SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), C32861j.f78238a, 0);
                C32861j.f78241d = a.getInt(C32861j.f78239b, 0);
                C32861j.f78242e = a.getLong(C32861j.f78240c, 0);
            }
            if (!C36085cj.m73550d()) {
                return;
            }
            if (!C80257bo.m139107a(C32861j.f78242e) || C32861j.f78241d != C31575b.m65865g().allUidList().size()) {
                C32861j.f78241d = C31575b.m65865g().allUidList().size();
                Calendar instance = Calendar.getInstance();
                C89219l.m154716b(instance, "");
                Date time = instance.getTime();
                C89219l.m154716b(time, "");
                C32861j.f78242e = time.getTime();
                C34822d.m71158a(C17867d.m33078a(), C32861j.f78238a, 0).edit().putInt(C32861j.f78239b, C32861j.f78241d).putLong(C32861j.f78240c, C32861j.f78242e).apply();
                C33744d a2 = new C33744d().mo59980a("account_num", C32861j.f78241d);
                IAccountUserService e = C36085cj.f85262b.mo57069e();
                List<String> allUidList = e.allUidList();
                C89219l.m154716b(allUidList, "");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = allUidList.iterator();
                while (it.hasNext()) {
                    C80053c findSignificanUserInfo = e.findSignificanUserInfo(it.next());
                    if (findSignificanUserInfo != null) {
                        arrayList.add(findSignificanUserInfo);
                    }
                }
                C39162r.m79460a("multi_account_status", a2.mo59983a("user_ids", C89070n.m154551a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C32861j.C32862a.C32863a.f78244a, 30)).f79943a);
            }
        }
    }

    public void showLoginAndRegisterViewInner(IAccountService.C31273c cVar) {
        boolean z;
        boolean z2;
        BaseLoginMethod d;
        int i;
        boolean z3 = cVar.f74956d.getBoolean("is_fullscreen_dialog");
        if (cVar.f74956d.getBoolean("force_use_default_login_method", false) || z3) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = cVar.f74956d.getBoolean("show_login_page_first", MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowLoginTabFirst());
        boolean z5 = cVar.f74956d.getBoolean("is_disable_animation", false);
        List<BaseLoginMethod> a = C31975q.m66343a(C36085cj.f85262b.mo57069e().allUidList());
        if (!C36085cj.f85262b.mo57075k().isOneKeyLoginExprimentEnable() || C13603b.m24435a((Collection) a) || z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        Serializable serializable = cVar.f74956d.getSerializable("extra_param");
        if (serializable == null) {
            serializable = new HashMap();
            cVar.f74956d.putSerializable("extra_param", serializable);
        }
        Map map = (Map) serializable;
        map.put("params_for_special", "uc_login");
        if (!cVar.f74956d.getBoolean("from_third_party_login") && !z2) {
            BaseLoginMethod d2 = C31975q.m66359d();
            LoginMethodName loginMethodName = d2.getLoginMethodName();
            if (loginMethodName == LoginMethodName.DEFAULT || z) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("login_last_time", Integer.valueOf(i ^ 1));
            if (i == 0) {
                C31376a a2 = I18nSignUpActivity.C31771a.m66130a(C32079s.f76562b, C32079s.f76561a, "click_login", map);
                if (loginMethodName == LoginMethodName.THIRD_PARTY) {
                    a2.mo57397a(((TPLoginMethod) d2).getPlatform() + "_is_show", 1);
                } else {
                    a2.mo57397a("phone_email_show", 1);
                }
                C39162r.m79460a("login_notify", a2.f75156a);
            }
        }
        if (z2) {
            if (C31975q.m66358c() && !C31975q.m66357b()) {
                cVar.f74956d.putString("enter_method", "reinstall");
            }
            cVar.f74956d.putString("enter_type", "click_login");
            LoginMethodListActivity.C32045a.m66442a(cVar.f74953a, cVar.f74956d, a, LoginService$$Lambda$0.$instance);
            C34727m.m70944a(LoginService$$Lambda$1.$instance);
            return;
        }
        if (z) {
            d = new BaseLoginMethod();
        } else {
            d = C31975q.m66359d();
        }
        if (d.getLoginMethodName() == LoginMethodName.THIRD_PARTY) {
            if (C31975q.m66358c() && !C31975q.m66357b()) {
                cVar.f74956d.putString("enter_method", "reinstall");
            }
            TPLoginMethod tPLoginMethod = (TPLoginMethod) d;
            if (C31858ab.m66185a(tPLoginMethod.getPlatform(), false, cVar.f74954b) == null) {
                if (TextUtils.isEmpty(cVar.f74956d.getString("enter_type"))) {
                    cVar.f74956d.putString("enter_type", "click_login");
                }
                Activity activity = cVar.f74953a;
                Bundle bundle = cVar.f74956d;
                C89219l.m154721d(activity, "");
                C89219l.m154721d(bundle, "");
                C89219l.m154721d(tPLoginMethod, "");
                DialogC31852aa aaVar = new DialogC31852aa(activity, bundle, tPLoginMethod);
                Window window = aaVar.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    attributes.flags |= 2;
                    window.setAttributes(attributes);
                    window.setWindowAnimations(R.style.uf);
                }
                aaVar.show();
                this.mLoginDialog = aaVar;
                return;
            }
        } else {
            cVar.f74956d.putBoolean("has_callBack", false);
            if (loginByMethod(cVar.f74953a, cVar.f74956d, d)) {
                return;
            }
        }
        I18nSignUpActivity.C31771a.m66132a(cVar.f74953a, cVar.f74956d, z4, cVar.f74956d.getBoolean("need_callback", false), z5);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m120114x2917afe4(Activity activity, Intent intent) {
        C84349a.m145093a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void openCountryListActivity(Activity activity, AbstractC34292ax axVar) {
        Intent intent = new Intent(activity, MusCountryListActivity.class);
        MusCountryListActivity.f77050g = axVar;
        m120114x2917afe4(activity, intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void saveDTicket(String str, String str2) {
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str2, "");
        C89219l.m154721d("d_ticket", "");
        C89219l.m154721d(str, "");
        if (!TextUtils.isEmpty(str2)) {
            Keva.getRepo("aweme_user_config__".concat(String.valueOf(str2))).storeString("d_ticket", str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.BaseLoginService, com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void loginByPlatform(IAccountService.C31273c cVar, C31597d dVar) {
        EnumC32594j jVar;
        LoginMethodName loginMethodName;
        super.loginByPlatform(cVar, dVar);
        if (cVar.f74954b.equals("find_account")) {
            try {
                JSONObject jSONObject = new JSONObject(cVar.f74956d.getString("jsb_parmas"));
                jSONObject.optString("uid", "");
                String optString = jSONObject.optString("nickname", "");
                String optString2 = jSONObject.optString("email", "");
                String optString3 = jSONObject.optString("mobile", "");
                String optString4 = jSONObject.optString("not_login_ticket", "");
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("is_safe", false));
                String str = dVar.f75560c;
                C32034f.C32036b bVar = new C32034f.C32036b("", optString, optString2, optString3, null, optString4, valueOf.booleanValue(), valueOf.booleanValue());
                cVar.f74956d.putString("args_email", optString2);
                cVar.f74956d.putString("enter_from", "find_account");
                cVar.f74956d.putString("enter_method", "find_account");
                cVar.f74956d.putSerializable("recover_account_data", bVar);
                cVar.f74956d.putInt("current_scene", EnumC32592i.RECOVER_ACCOUNT.getValue());
                cVar.f74956d.putString("previous_uid", new C52817g().getCurUserId());
                if (valueOf.booleanValue() && !optString4.isEmpty() && "mobile".equals(str)) {
                    cVar.f74956d.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
                    cVar.f74956d.putInt("current_scene", EnumC32592i.RECOVER_ACCOUNT.getValue());
                    cVar.f74956d.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
                    cVar.f74956d.putBoolean("email_should_add_email", true);
                } else if ("mobile".equals(str)) {
                    cVar.f74956d.putInt("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue());
                    cVar.f74956d.putInt("child_page", EnumC32594j.INPUT_PHONE_LOGIN.getValue());
                } else if ("email".equals(str)) {
                    cVar.f74956d.putInt("next_page", EnumC32594j.PHONE_EMAIL_LOGIN.getValue());
                    cVar.f74956d.putInt("child_page", EnumC32594j.INPUT_EMAIL_LOGIN.getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (cVar.f74956d.getBoolean("is_login", true)) {
            if (TextUtils.equals(dVar.f75560c, "mobile")) {
                loginMethodName = LoginMethodName.PHONE_SMS;
            } else if (TextUtils.equals(dVar.f75560c, "email")) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            }
            if (loginMethodName != null) {
                loginByMethodName(cVar.f74953a, cVar.f74956d, loginMethodName, null);
                return;
            }
        }
        String str2 = dVar.f75560c;
        str2.hashCode();
        if (str2.equals("mobile") || str2.equals("email")) {
            SmartRoute b = C32867m.m67467b(cVar.f74953a);
            if (TextUtils.equals(dVar.f75560c, "mobile")) {
                jVar = EnumC32594j.INPUT_PHONE_SIGN_UP;
            } else {
                jVar = EnumC32594j.INPUT_EMAIL_SIGN_UP;
            }
            SmartRoute withParam = b.withParam("child_page", jVar.getValue());
            if (TextUtils.isEmpty(cVar.f74956d.getString("enter_type"))) {
                cVar.f74956d.putString("enter_type", "click_login");
            }
            withParam.withParam(cVar.f74956d);
            withParam.open();
            return;
        }
        if (TextUtils.isEmpty(cVar.f74956d.getString("enter_type"))) {
            cVar.f74956d.putString("enter_type", "click_login");
        }
        C31858ab.m66187a(cVar.f74953a, dVar.f75560c, new C32585g(cVar.f74956d.getString("enter_from", ""), cVar.f74956d.getString("enter_method", ""), "click_login", cVar.f74956d));
    }

    public void openFeedback(Activity activity, String str, String str2) {
        C32857g.m67458a(activity, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34892bo
    public void switchAccount(C80053c cVar, Bundle bundle, AbstractC35326bx bxVar) {
        C31692a.m66024a(cVar.f179384a, bundle, false, false, bxVar);
    }

    static final /* synthetic */ void lambda$showLoginAndRegisterViewInner$1$LoginService(int i, int i2, Object obj) {
        C36085cj.m73541a(10, 4, "");
        if (i2 != 1) {
            C34727m.m70945a(LoginService$$Lambda$3.$instance, 200);
        } else if (i == EnumC32592i.ONE_KEY_LOGIN.getValue()) {
            C36085cj.m73540a(1, 1, (Object) "");
            C36085cj.m73544a(C36085cj.m73552f());
        }
    }

    public boolean loginByMethod(Activity activity, Bundle bundle, BaseLoginMethod baseLoginMethod) {
        String platform;
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        int i = C678711.f152051x974b3082[loginMethodName.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                bundle.putSerializable("auto_fill_phone_number", ((PhoneLoginMethod) baseLoginMethod).getPhoneNumber());
            } else if (i == 4 || i == 5) {
                bundle.putSerializable("auto_fill_account_name", ((AccountPassLoginMethod) baseLoginMethod).getName());
            }
            platform = "";
        } else {
            platform = ((TPLoginMethod) baseLoginMethod).getPlatform();
        }
        return loginByMethodName(activity, bundle, loginMethodName, platform);
    }

    private boolean loginByMethodName(Activity activity, Bundle bundle, LoginMethodName loginMethodName, String str) {
        int i = C678711.f152051x974b3082[loginMethodName.ordinal()];
        if (i == 1) {
            C31858ab.m66187a(activity, str, new C32585g(bundle.getString("enter_from", ""), bundle.getString("enter_method", ""), "click_login", bundle));
            return true;
        } else if (i == 2 || i == 3) {
            SmartRoute withParam = C32867m.m67468c(activity).withParam("child_page", EnumC32594j.INPUT_PHONE_LOGIN.getValue());
            if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                bundle.putString("enter_type", "click_login");
            }
            withParam.withParam(bundle);
            withParam.open();
            return true;
        } else if (i != 4 && i != 5) {
            return false;
        } else {
            SmartRoute withParam2 = C32867m.m67468c(activity).withParam("child_page", EnumC32594j.INPUT_EMAIL_LOGIN.getValue());
            if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                bundle.putString("enter_type", "click_login");
            }
            withParam2.withParam(bundle);
            withParam2.open();
            return true;
        }
    }

    private void onThirdPartyLoginClick(Context context, String str, Bundle bundle, String str2, String str3) {
        if (!m120113xae505bbf(context)) {
            new C79459a(context).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        C31376a a = new C31376a().mo57399a("enter_method", str2).mo57399a("enter_from", str3).mo57399a("platform", str).mo57399a("enter_type", "click_login");
        String str4 = "";
        if (bundle != null) {
            String string = bundle.getString("group_id");
            if (!TextUtils.isEmpty(string)) {
                str4 = string;
            }
        }
        C39162r.m79460a("login_submit", a.mo57399a("group_id", str4).mo57399a("log_pb", C31717c.m66045a(bundle)).f75156a);
        if (str != null) {
            C31718d dVar = new C31718d();
            dVar.f75860b = str2;
            dVar.f75861c = str;
            dVar.mo57683a();
            Intent intent = new Intent(context, AuthorizeActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("platform", str);
            intent.putExtra("enter_from", str3);
            intent.putExtra("enter_method", str2);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 1001);
            }
            C31959k.m66326a(str, str3, str2);
        }
    }
}
