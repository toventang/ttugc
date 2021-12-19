package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.AbstractC34817bf;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.agegate.util.C31566h;
import com.p2082ss.android.ugc.aweme.account.login.C31970n;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p2082ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.C32582d;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.SignUpOrLoginActivity;
import com.p2082ss.android.ugc.aweme.account.login.recover.C32034f;
import com.p2082ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.util.C33038h;
import com.p2082ss.android.ugc.aweme.account.util.C33047p;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.p2310al.C33490e;
import com.p2082ss.android.ugc.aweme.service.IRegionMockService;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.a */
public final class C32334a {

    /* renamed from: a */
    public static final C32334a f77125a = new C32334a();

    /* renamed from: b */
    private static final boolean f77126b = false;

    private C32334a() {
    }

    static {
        Covode.recordClassIndex(39102);
    }

    /* renamed from: a */
    private static String m66706a(EnumC32594j jVar) {
        switch (C32336b.f77131c[jVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "mobile";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
                return "email";
            case 17:
                return "qr_code";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.a$a */
    public static final class C32335a extends AbstractC89220m implements AbstractC89172b<C1731i<Bundle>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f77127a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f77128b;

        static {
            Covode.recordClassIndex(39103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32335a(Activity activity, JSONObject jSONObject) {
            super(1);
            this.f77127a = activity;
            this.f77128b = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C1731i<Bundle> iVar) {
            String str;
            C89219l.m154721d(iVar, "");
            this.f77127a.finish();
            if (C36085cj.m73550d()) {
                C36085cj.m73540a(1, 1, (Object) "");
            }
            C31667a.m65983a(11);
            C31667a.m65983a(9);
            C36085cj.m73544a(C36085cj.m73552f());
            JSONObject jSONObject = this.f77128b;
            if (jSONObject != null) {
                str = jSONObject.optString("enter_from");
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) "find_account", (Object) str)) {
                AbstractC81915c.m141874a(new C33490e());
                AbstractC81915c.m141874a(new C33488c());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static String m66710b(EnumC32594j jVar) {
        switch (C32336b.f77132d[jVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "phone_sms";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "phone_password";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "email_or_username";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "reset_password_for_phone";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "qr_code_login";
            case ABRConfig.ABR_SELECT_SCENE:
                return "phone_sms_two_factor_password";
            case 15:
                return "phone_sms_two_factor_email_code";
            case 16:
                return "email_password_two_factor_email_code";
            case 17:
                return "email_password_two_factor_sms";
            default:
                return "";
        }
    }

    /* renamed from: a */
    private static void m66707a(Bundle bundle) {
        BaseLoginMethod baseLoginMethod;
        LoginMethodName loginMethodName;
        LoginMethodName loginMethodName2;
        if (bundle.getSerializable("recover_account_data") != null) {
            Serializable serializable = bundle.getSerializable("recover_account_data");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverVerifyAccountFragment.RecoverAccountModel");
            if (!((C32034f.C32036b) serializable).getNeedStoreLastMethod()) {
                C31975q.m66354b(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, 511, null));
                return;
            }
        }
        switch (C32336b.f77130b[EnumC32594j.C32595a.m67087a(bundle.getInt("current_page")).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                C31940a.C31941a b = C32582d.m67065b(bundle);
                if (b == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                    break;
                } else {
                    String b2 = C36085cj.m73548b();
                    C89219l.m154716b(b2, "");
                    baseLoginMethod = new PhoneLoginMethod(b2, LoginMethodName.PHONE_SMS, b, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                C31940a.C31941a b3 = C32582d.m67065b(bundle);
                if (b3 == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                    break;
                } else {
                    String b4 = C36085cj.m73548b();
                    C89219l.m154716b(b4, "");
                    baseLoginMethod = new PhoneLoginMethod(b4, LoginMethodName.PHONE_NUMBER_PASS, b3, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
                String a = C32582d.m67059a(bundle);
                if (C33038h.m67672a(a)) {
                    loginMethodName = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName = LoginMethodName.USER_NAME_PASS;
                }
                String b5 = C36085cj.m73548b();
                C89219l.m154716b(b5, "");
                baseLoginMethod = new AccountPassLoginMethod(b5, loginMethodName, a, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                break;
            default:
                C31940a.C31941a b6 = C32582d.m67065b(bundle);
                String a2 = C32582d.m67059a(bundle);
                if (C33038h.m67672a(a2)) {
                    loginMethodName2 = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName2 = LoginMethodName.USER_NAME_PASS;
                }
                if (b6 == null) {
                    if (!TextUtils.isEmpty(a2)) {
                        baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                        break;
                    } else {
                        String b7 = C36085cj.m73548b();
                        C89219l.m154716b(b7, "");
                        baseLoginMethod = new AccountPassLoginMethod(b7, loginMethodName2, a2, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    }
                } else {
                    String b8 = C36085cj.m73548b();
                    C89219l.m154716b(b8, "");
                    baseLoginMethod = new PhoneLoginMethod(b8, LoginMethodName.PHONE_SMS, b6, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
        }
        C31975q.m66354b(baseLoginMethod);
    }

    /* renamed from: a */
    public static void m66709a(AbstractC32572b bVar, EnumC32592i iVar, EnumC32594j jVar, C22507a aVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(aVar, "");
        C36085cj.m73542a(aVar);
        AccountRetrofitInetcept.m67474a("");
        Bundle arguments = bVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        C89219l.m154716b(arguments, "");
        m66707a(arguments);
        ActivityC0945e activity = bVar.getActivity();
        if (activity != null) {
            C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77691b;
            if (aVar.f53214e) {
                Bundle arguments2 = bVar.getArguments();
                if (arguments2 == null) {
                    C89219l.m154715b();
                }
                arguments2.putBoolean("new_user_need_set_username", true);
                if (jVar == EnumC32594j.EMAIL_SMS_SIGN_UP || jVar == EnumC32594j.CREATE_PASSWORD_FOR_EMAIL) {
                    Bundle arguments3 = bVar.getArguments();
                    if (arguments3 == null) {
                        C89219l.m154715b();
                    }
                    arguments3.putBoolean("new_user_need_get_recommend_username", true);
                    Bundle arguments4 = bVar.getArguments();
                    if (arguments4 == null) {
                        C89219l.m154715b();
                    }
                    arguments4.putString("set_username_platform", "email");
                } else {
                    Bundle arguments5 = bVar.getArguments();
                    if (arguments5 == null) {
                        C89219l.m154715b();
                    }
                    arguments5.putBoolean("new_user_need_set_pass_word", true);
                    Bundle arguments6 = bVar.getArguments();
                    if (arguments6 == null) {
                        C89219l.m154715b();
                    }
                    arguments6.putString("set_username_platform", "sms_verification");
                }
            } else if (bVar.getActivity() instanceof SignUpOrLoginActivity) {
                ActivityC0945e activity2 = bVar.getActivity();
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                ((SignUpOrLoginActivity) activity2).f77784a = null;
                Object a = C31291a.m65463a(AbstractC34817bf.class);
                C89219l.m154716b(a, "");
                if (((AbstractC34817bf) a).mo60103d() == 1) {
                    C31566h.m65848a();
                }
            }
            String a2 = m66706a(jVar);
            if (!TextUtils.isEmpty(a2)) {
                arguments.putString("platform", a2);
            }
            String b = m66710b(jVar);
            if (!TextUtils.isEmpty(b)) {
                arguments.putString("login_path", b);
            }
            rVar.postValue(arguments);
        }
        if (C33047p.m67683a()) {
            ServiceManager.get().getService(IRegionMockService.class);
        }
    }

    /* renamed from: a */
    public static void m66708a(AbstractC32572b bVar, int i, String str, EnumC32592i iVar, EnumC32594j jVar, JSONObject jSONObject) {
        boolean z;
        String optString;
        String optString2;
        C32345h hVar;
        String str2 = str;
        String str3 = "";
        C89219l.m154721d(bVar, str3);
        C89219l.m154721d(str2, str3);
        C89219l.m154721d(iVar, str3);
        C89219l.m154721d(jVar, str3);
        Bundle arguments = bVar.getArguments();
        boolean z2 = false;
        if (arguments == null || !arguments.getBoolean("from_ProAccount")) {
            z = false;
        } else {
            z = true;
        }
        if (!C31970n.f76340a.contains(Integer.valueOf(i)) && !C31970n.f76341b.contains(Integer.valueOf(i))) {
            Application application = C31291a.f74991a;
            if (bVar.mo58460Z_() == EnumC32594j.PHONE_PASSWORD_LOGIN || bVar.mo58460Z_() == EnumC32594j.PHONE_EMAIL_LOGIN) {
                z2 = true;
            }
            switch (i) {
                case 1001:
                    if (z) {
                        C39162r.m79460a("input_wrong_phone", new C31376a().mo57399a("page", "Input Phone Captcha").mo57399a("error_code", "2").f75156a);
                    }
                    hVar = new C32351l(bVar, i, str2);
                    break;
                case 1002:
                case 1003:
                    if (z) {
                        C39162r.m79460a("input_wrong_phone", new C31376a().mo57399a("page", "Input Phone Captcha").mo57399a("error_code", "1").f75156a);
                    }
                    String string = application.getString(R.string.aqb);
                    C89219l.m154716b(string, str3);
                    hVar = new C32351l(bVar, i, string);
                    break;
                case 1009:
                    if (!z2) {
                        if (bVar.mo58460Z_() != EnumC32594j.EMAIL_PASSWORD_LOGIN && bVar.mo58460Z_() != EnumC32594j.INPUT_EMAIL_LOGIN) {
                            hVar = new C32351l(bVar, i, str2);
                            break;
                        } else {
                            String string2 = application.getString(R.string.anw);
                            C89219l.m154716b(string2, str3);
                            hVar = new C32351l(bVar, i, string2);
                            break;
                        }
                    } else {
                        String string3 = application.getString(R.string.aoi);
                        C89219l.m154716b(string3, str3);
                        hVar = new C32351l(bVar, i, string3);
                        break;
                    }
                    break;
                case 1011:
                    bVar.mo58460Z_();
                    switch (C32336b.f77129a[bVar.mo58460Z_().ordinal()]) {
                        case 1:
                            if (!(jSONObject == null || (optString = jSONObject.optString("sms_code_key")) == null)) {
                                str3 = optString;
                            }
                            hVar = new C32350k(bVar, str3);
                            break;
                        case 2:
                            if (!(jSONObject == null || (optString2 = jSONObject.optString("sms_code_key")) == null)) {
                                str3 = optString2;
                            }
                            hVar = new C32347j(bVar, str3);
                            break;
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            String string4 = application.getString(R.string.anw);
                            C89219l.m154716b(string4, str3);
                            hVar = new C32351l(bVar, i, string4);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            String string5 = application.getString(R.string.aov);
                            C89219l.m154716b(string5, str3);
                            hVar = new C32351l(bVar, i, string5);
                            break;
                        default:
                            hVar = new C32351l(bVar, i, str2);
                            break;
                    }
                case 1023:
                    if (z) {
                        C39162r.m79460a("input_wrong_email", new C31376a().mo57399a("page", "Input Email Captcha").mo57399a("error_code", "2").f75156a);
                    }
                    String string6 = application.getString(R.string.blv);
                    C89219l.m154716b(string6, str3);
                    hVar = new C32351l(bVar, i, string6);
                    break;
                case 1024:
                case 1028:
                    String string7 = application.getString(R.string.aqy);
                    C89219l.m154716b(string7, str3);
                    hVar = new C32351l(bVar, i, string7);
                    break;
                case 1027:
                    String string8 = application.getString(R.string.aqz);
                    C89219l.m154716b(string8, str3);
                    hVar = new C32351l(bVar, i, string8);
                    break;
                case 1033:
                case 1034:
                    hVar = new C32351l(bVar, i, str2);
                    break;
                case 1039:
                    C31940a.C31941a b = C32582d.m67066b(bVar);
                    if (z2 && b != null) {
                        hVar = new C32352m(bVar, b, i, jSONObject, iVar, jVar);
                        break;
                    } else {
                        hVar = new C32351l(bVar, i, str2);
                        break;
                    }
                case 1051:
                    String string9 = application.getString(R.string.aq7);
                    C89219l.m154716b(string9, str3);
                    hVar = new C32351l(bVar, i, string9);
                    break;
                case 1053:
                    String string10 = application.getString(R.string.gxn);
                    C89219l.m154716b(string10, str3);
                    hVar = new C32351l(bVar, i, string10);
                    break;
                case 1054:
                    String string11 = application.getString(R.string.ap3);
                    C89219l.m154716b(string11, str3);
                    hVar = new C32351l(bVar, i, string11);
                    break;
                case 1075:
                case 2006:
                    if (iVar != EnumC32592i.RECOVER_ACCOUNT) {
                        hVar = new C32351l(bVar, i, str2);
                        break;
                    } else {
                        String string12 = application.getString(R.string.f8h);
                        C89219l.m154716b(string12, str3);
                        hVar = new C32351l(bVar, i, string12);
                        break;
                    }
                case 1092:
                    if (bVar.mo58458A() != EnumC32592i.BIND_PHONE && bVar.mo58458A() != EnumC32592i.MODIFY_PHONE) {
                        if (iVar != EnumC32592i.RECOVER_ACCOUNT) {
                            hVar = new C32351l(bVar, i, str2);
                            break;
                        } else {
                            String string13 = application.getString(R.string.f8h);
                            C89219l.m154716b(string13, str3);
                            hVar = new C32351l(bVar, i, string13);
                            break;
                        }
                    } else {
                        String string14 = application.getString(R.string.flj);
                        C89219l.m154716b(string14, str3);
                        hVar = new C32351l(bVar, i, string14);
                        break;
                    }
                    break;
                case 1202:
                    String string15 = application.getString(R.string.aqg);
                    C89219l.m154716b(string15, str3);
                    hVar = new C32351l(bVar, i, string15);
                    break;
                case 1203:
                    String string16 = application.getString(R.string.d6p);
                    C89219l.m154716b(string16, str3);
                    hVar = new C32351l(bVar, i, string16);
                    break;
                case 1320:
                    hVar = new C32338d(bVar);
                    break;
                case 1356:
                    String string17 = application.getString(R.string.gy4);
                    C89219l.m154716b(string17, str3);
                    hVar = new C32351l(bVar, i, string17);
                    break;
                case 1381:
                    C32345h hVar2 = new C32345h(bVar, jSONObject, iVar, jVar);
                    boolean z3 = hVar2.f77145b.f77140a;
                    hVar = hVar2;
                    if (!z3) {
                        String string18 = application.getString(R.string.bos);
                        C89219l.m154716b(string18, str3);
                        hVar = new C32351l(bVar, i, string18);
                        break;
                    }
                    break;
                case 1382:
                    String string19 = application.getString(R.string.aw3);
                    C89219l.m154716b(string19, str3);
                    hVar = new C32351l(bVar, i, string19);
                    break;
                case 1383:
                    String string20 = application.getString(R.string.aw4);
                    C89219l.m154716b(string20, str3);
                    hVar = new C32351l(bVar, i, string20);
                    break;
                case 1388:
                    hVar = new C32337c(bVar, str2);
                    break;
                case 1450:
                    hVar = new C32354n(bVar, jSONObject);
                    break;
                case 2003:
                case 2004:
                    if (bVar.mo58458A() != EnumC32592i.BIND_PHONE && bVar.mo58458A() != EnumC32592i.MODIFY_PHONE) {
                        hVar = new C32351l(bVar, i, str2);
                        break;
                    } else {
                        String string21 = application.getString(R.string.flj);
                        C89219l.m154716b(string21, str3);
                        hVar = new C32351l(bVar, i, string21);
                        break;
                    }
                case 2013:
                    hVar = new C32340e(bVar, jSONObject);
                    break;
                case 2015:
                    hVar = new C32346i(bVar, iVar, jVar, jSONObject);
                    break;
                case 2027:
                case 2028:
                    if (TextUtils.isEmpty(str2)) {
                        str2 = application.getString(R.string.cyx);
                    }
                    C89219l.m154716b(str2, str3);
                    hVar = new C32351l(bVar, i, str2);
                    break;
                case 2037:
                    hVar = new C32342f(bVar);
                    break;
                default:
                    hVar = new C32351l(bVar, i, str2);
                    break;
            }
            hVar.mo58399a();
        }
    }
}
