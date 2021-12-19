package com.p2082ss.android.ugc.aweme;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22313d;
import com.bytedance.sdk.p1625a.p1643f.C22375e;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.google.gson.C27910f;
import com.p2082ss.android.account.C29346c;
import com.p2082ss.android.account.p2089b.C29345a;
import com.p2082ss.android.account.share.data.p2091a.C29357a;
import com.p2082ss.android.account.share.data.write.C29363b;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.sdk.p2174a.C30223b;
import com.p2082ss.android.sdk.p2174a.C30224c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31686a;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32835a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80036a;
import com.p2082ss.android.ugc.aweme.user.C80053c;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import com.p2082ss.android.ugc.aweme.user.C80064f;
import com.p2082ss.android.ugc.aweme.user.p4194a.C80039c;
import com.p2082ss.android.ugc.aweme.user.p4197d.C80060c;
import com.p2082ss.android.ugc.aweme.utils.C80630u;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.dn */
public final class C43107dn {

    /* renamed from: a */
    public boolean f100450a;

    static {
        Covode.recordClassIndex(51274);
    }

    /* renamed from: c */
    static /* synthetic */ Object m86007c() {
        C80060c.m138798a("");
        m86006b();
        return null;
    }

    public C43107dn() {
        if (!C80064f.m138815a(C80061e.f179403k.mo123508a())) {
            C32835a.f78203b = "not login";
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            C1731i.m5640b(CallableC43108do.f100451a, C40780g.m82241a());
        } else {
            C80064f.f179418d.mo123520d();
        }
    }

    /* renamed from: b */
    public static void m86006b() {
        try {
            Context a = C17867d.m33078a();
            C17867d.m33078a().getPackageName();
            C29363b.m58796a(a, "key_account_info", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m86004a() {
        String str;
        try {
            AbstractC22313d a = C22375e.m42171a(C17867d.m33078a());
            if (!a.mo36622b()) {
                Context a2 = C17867d.m33078a();
                C17867d.m33078a().getPackageName();
                C29363b.m58796a(a2, "key_account_info", "");
                return;
            }
            C29357a aVar = new C29357a();
            aVar.f69677a = a.mo36623c();
            aVar.f69684h = AppLog.getInstallId();
            boolean z = true;
            aVar.f69683g = 1;
            aVar.f69682f = C17867d.f42590n;
            User curUser = AccountService.m65215a().mo57069e().getCurUser();
            aVar.f69678b = curUser.getNickname();
            UrlModel a3 = C80630u.m139797a(curUser);
            if (a3 != null) {
                List<String> urlList = a3.getUrlList();
                if (urlList == null || urlList.isEmpty()) {
                    str = "";
                } else {
                    str = urlList.get(0);
                }
                aVar.f69679c = str;
            }
            aVar.f69681e = curUser.getAccountType();
            String a4 = a.mo36612a();
            if (!TextUtils.isEmpty(a4)) {
                if (a4 == null) {
                    C89219l.m154707a();
                }
                Charset charset = C89338d.f202990a;
                if (a4 != null) {
                    byte[] bytes = a4.getBytes(charset);
                    C89219l.m154709a((Object) bytes, "");
                    byte[] bytes2 = a4.getBytes(C89338d.f202990a);
                    C89219l.m154709a((Object) bytes2, "");
                    aVar.f69680d = Base64.encodeToString(EncryptorUtil.m27092a(bytes, bytes2.length), 2);
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            if (!a.mo36625d().f53221l && curUser.getUserMode() != 2) {
                z = false;
            }
            aVar.f69687k = Boolean.valueOf(z);
            Context a5 = C17867d.m33078a();
            C89219l.m154719c(a5, "");
            C89219l.m154719c(aVar, "");
            String b = ((C27910f) C29363b.f69712e.getValue()).mo46674b(aVar);
            C89219l.m154709a((Object) b, "");
            C29363b.m58796a(a5, "key_account_info", b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    static /* synthetic */ Object m86005b(C22507a aVar) {
        C31686a.m66009a("begin to update sp");
        C80060c.m138798a(aVar.f53223n.toString());
        C31686a.m66009a("asynchronous_check");
        m86004a();
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo73336a(C22507a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String string;
        C29345a aVar2;
        MethodCollector.m26663i(12563);
        if (!(aVar == null || aVar.f53210a == 0)) {
            boolean z4 = aVar.f53214e;
            this.f100450a = z4;
            boolean z5 = false;
            if (z4 && GuestModeServiceImpl.m65990d().mo57219c()) {
                AgeGateServiceImpl.m80208e().mo68582a(false);
            }
            C29346c cVar = (C29346c) aVar;
            C30223b bVar = C30223b.f72086a;
            Application application = C31291a.f74991a;
            C30224c[] cVarArr = bVar.f72087b;
            int length = cVarArr.length;
            int i = 0;
            while (i < length) {
                C30224c cVar2 = cVarArr[i];
                cVar2.f72104o = z5;
                if (cVar != null) {
                    if (cVar2.f72102m == null || cVar2.f72102m.length == 0) {
                        aVar2 = cVar.f53211b.get(cVar2.f72101l);
                        if (aVar2 == null) {
                        }
                    } else {
                        String[] strArr = cVar2.f72102m;
                        int length2 = strArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            aVar2 = cVar.f53211b.get(strArr[i2]);
                            if (aVar2 != null) {
                                break;
                            }
                            i2++;
                        }
                    }
                    cVar2.f72104o = true;
                    cVar2.f72108s = aVar2.f69634j;
                    cVar2.f72109t = aVar2.f69635k;
                    cVar2.f72105p = aVar2.f69628d;
                    cVar2.f72106q = aVar2.f69629e;
                    cVar2.f72107r = aVar2.f69630f;
                    cVar2.f72110u = -1;
                }
                i++;
                z5 = false;
            }
            bVar.mo53666a(application);
            try {
                string = aVar.f53222m.getString("country_code");
            } catch (JSONException unused) {
            }
            C80061e.f179403k.mo123515d(String.valueOf(aVar.f53210a));
            if (!TextUtils.isEmpty(aVar.f53222m.optString("mandatory_2sv_nudge_period"))) {
                z = true;
            } else {
                z = false;
            }
            C80064f.m138816b().edit().putBoolean("mandatory_2sv", z).apply();
            String optString = aVar.f53222m.optString("mandatory_2sv_nudge_period");
            C89219l.m154721d(optString, "");
            C80064f.m138816b().edit().putString("mandatory_2sv_nudge_period", optString).apply();
            C80061e eVar = C80061e.f179403k;
            C80064f.C80065a a = C80064f.C80065a.C80066a.m138837a(cVar.f53210a, cVar.f53215f, cVar.f69616p, cVar.f69650N, string, cVar.f53212c, cVar.f53221l);
            C89219l.m154721d(a, "");
            if (C89219l.m154714a((Object) a.f179426a, (Object) eVar.mo123517e())) {
                eVar.f179411g = null;
            }
            C89219l.m154721d(a, "");
            AbstractC88979t a2 = AbstractC88979t.m154314c(new C80064f.CallableC80083l(a)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
            if (a2 != null) {
                a2.mo143300g();
            }
            C89219l.m154721d(cVar, "");
            String valueOf = String.valueOf(cVar.f53210a);
            String str = cVar.f69616p;
            C89219l.m154716b(str, "");
            String str2 = cVar.f69618r;
            C89219l.m154716b(str2, "");
            String str3 = cVar.f53212c;
            if (str3 == null) {
                str3 = "";
            }
            C80053c cVar3 = new C80053c(valueOf, "", "", str, str2, str3, (long) cVar.f69658V);
            C89219l.m154721d(cVar3, "");
            C89219l.m154721d(cVar3, "");
            AbstractC88979t a3 = AbstractC88979t.m154314c(new C80064f.CallableC80085n(cVar3)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
            if (a3 != null) {
                a3.mo143300g();
            }
            C31686a.m66009a("synchronous_check");
            if (aVar.f53222m.has("user_device_record_status")) {
                int optInt = aVar.f53222m.optInt("user_device_record_status");
                int i3 = 2;
                if (optInt == 0) {
                    C31575b.m65859a();
                    boolean saveLoginStatus = C31575b.f75524a.mo57075k().getSaveLoginStatus();
                    C31575b.m65859a();
                    AbstractC34889bn k = C31575b.f75524a.mo57075k();
                    if (saveLoginStatus) {
                        i3 = 1;
                    }
                    k.updateLoginHistoryState(i3, null);
                } else {
                    String str4 = aVar.f53212c;
                    if (optInt == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C80036a.m138778a(str4, z2);
                    C31575b.m65859a();
                    AbstractC34889bn k2 = C31575b.f75524a.mo57075k();
                    Object[] objArr = new Object[2];
                    if (optInt == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objArr[0] = Boolean.valueOf(z3);
                    objArr[1] = false;
                    k2.updateMethodInfo("allow_one_key_login", objArr);
                }
            }
            C1731i.m5640b(new CallableC43198dp(this, aVar), C40780g.m82241a());
            C80039c.m138780a(cVar.f69657U);
            if (aVar.f53222m.optInt("need_device_create") == 1) {
                boolean isChildMode = DeviceRegisterManager.isChildMode();
                DeviceRegisterManager.clearWhenSwitchChildMode(isChildMode);
                DeviceRegisterManager.resetDidWhenSwitchChildMode(isChildMode, 5000, null);
            }
        }
        MethodCollector.m26664o(12563);
    }
}
