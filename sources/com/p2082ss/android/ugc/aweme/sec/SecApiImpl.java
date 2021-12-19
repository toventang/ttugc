package com.p2082ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdturing.C13241a;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.ttnet.C13305a;
import com.bytedance.bdturing.verify.p867a.C13331j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.mobsec.metasec.p1545ov.C21421a;
import com.bytedance.mobsec.metasec.p1545ov.C21423b;
import com.bytedance.mobsec.metasec.p1545ov.C21424c;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.sec.C67810a;
import com.p2082ss.android.ugc.aweme.sec.captcha.C67822a;
import com.p2082ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.p2082ss.android.ugc.aweme.sec.p3707a.C67812a;
import com.p2082ss.android.ugc.aweme.sec.p3708b.C67814a;
import com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import com.p2082ss.android.ugc.aweme.secapi.ISecApi;
import com.p2082ss.android.ugc.aweme.secapi.p3710a.EnumC67838a;
import java.lang.ref.WeakReference;
import p077b.C1731i;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.sec.SecApiImpl */
public final class SecApiImpl implements ISecApi {

    /* renamed from: a */
    public static final C67809a f151970a = new C67809a((byte) 0);

    static {
        Covode.recordClassIndex(79467);
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void loadSo() {
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final String onEvent() {
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.sec.SecApiImpl$a */
    public static final class C67809a {
        static {
            Covode.recordClassIndex(79468);
        }

        private C67809a() {
        }

        public /* synthetic */ C67809a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void initTask() {
        C13305a.m23925a();
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void dismissCaptcha() {
        C51423a.m95784a(4, "Sec", "dismissCaptcha");
        if (C67810a.f151971a) {
            SecCaptcha secCaptcha = C67810a.f151973c;
            if (secCaptcha == null) {
                C89219l.m154710a("captcha");
            }
            C13241a aVar = secCaptcha.f151996a;
            if (aVar != null) {
                aVar.mo21397b();
            }
        }
    }

    /* renamed from: a */
    public static ISecApi m119993a() {
        MethodCollector.m26663i(12622);
        Object a = C81908b.m141854a(ISecApi.class, false);
        if (a != null) {
            ISecApi iSecApi = (ISecApi) a;
            MethodCollector.m26664o(12622);
            return iSecApi;
        }
        if (C81908b.f183337dh == null) {
            synchronized (ISecApi.class) {
                try {
                    if (C81908b.f183337dh == null) {
                        C81908b.f183337dh = new SecApiImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12622);
                    throw th;
                }
            }
        }
        SecApiImpl secApiImpl = (SecApiImpl) C81908b.f183337dh;
        MethodCollector.m26664o(12622);
        return secApiImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void setParams() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (AppLog.getServerDeviceId() != null) {
            str = AppLog.getServerDeviceId();
        } else {
            str = str2;
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C51423a.m95791b(4, "Sec", "setParams:did = " + str + "  iid = " + str2);
        C21423b bVar = C67810a.f151972b;
        if (bVar != null) {
            bVar.mo35026b(str);
        }
        C21423b bVar2 = C67810a.f151972b;
        if (bVar2 != null) {
            bVar2.mo35027c(str2);
        }
        C67814a.m120000a("DmtSec", "init setParamsTime = " + (currentTimeMillis2 - currentTimeMillis));
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void updateCollectMode(EnumC67838a aVar) {
        C67810a.m119994a();
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void reportData(String str) {
        C89219l.m154721d(str, "");
        C67810a.m119996a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final boolean needVerifyImage(int i) {
        if (!C67810a.f151971a) {
            return false;
        }
        if (C67810a.f151973c == null) {
            C89219l.m154710a("captcha");
        }
        if (i != 3058 && i != 3059 && i != 1104 && i != 1105) {
            return false;
        }
        C51423a.m95784a(4, "Sec", "needVerifyImage: ".concat(String.valueOf(i)));
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final boolean isCaptchaUrl(String str) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str, "");
        if (C67810a.f151971a) {
            if (C67810a.f151973c == null) {
                C89219l.m154710a("captcha");
            }
            C89219l.m154721d(str, "");
            C89219l.m154721d(str, "");
            if (str.length() != 0 && (C89361p.m154908a((CharSequence) str, (CharSequence) "/passport/", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/login/", false))) {
                C51423a.m95784a(4, "Sec", "isCaptchaUrl: ".concat(String.valueOf(str)));
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void updateDeviceIdAndInstallId(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C51423a.m95791b(4, "Sec", "updateDeviceIdAndInstallId:did = " + str + "  iid = " + str2);
        C67810a.m119997a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptcha(Activity activity, int i, C67837a aVar) {
        String str = "";
        C89219l.m154721d(activity, str);
        C89219l.m154721d(aVar, str);
        C51423a.m95784a(4, "Sec", "popCaptcha - errorcode = ".concat(String.valueOf(i)));
        C89219l.m154721d(activity, str);
        C89219l.m154721d(aVar, str);
        if (C67810a.f151971a) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = C67810a.f151973c;
            if (secCaptcha == null) {
                C89219l.m154710a("captcha");
            }
            C89219l.m154721d(activity, str);
            C89219l.m154721d(aVar, str);
            if (TextUtils.isEmpty(secCaptcha.f152002g.f152015d) && AppLog.getInstallId() != null) {
                C67822a aVar2 = secCaptcha.f152002g;
                String installId = AppLog.getInstallId();
                C89219l.m154716b(installId, str);
                aVar2.mo106924a(installId);
                secCaptcha.mo106920a(secCaptcha.f152002g.f152016e, secCaptcha.f152002g.f152015d);
            }
            if (TextUtils.isEmpty(secCaptcha.f152002g.f152016e) && AppLog.getServerDeviceId() != null) {
                C67822a aVar3 = secCaptcha.f152002g;
                String serverDeviceId = AppLog.getServerDeviceId();
                C89219l.m154716b(serverDeviceId, str);
                aVar3.mo106925b(serverDeviceId);
                secCaptcha.mo106920a(secCaptcha.f152002g.f152016e, secCaptcha.f152002g.f152015d);
            }
            if (activity.isFinishing()) {
                C51423a.m95784a(4, "Sec", "popCaptcha-activity-finishing");
            } else {
                secCaptcha.f151997b = new WeakReference<>(activity);
                secCaptcha.f151998c = aVar;
                activity.runOnUiThread(new SecCaptcha.RunnableC67820c(secCaptcha, activity));
                secCaptcha.mo106919a().f32367B = i;
                String str2 = secCaptcha.f152000e;
                String b = secCaptcha.f152003h.mo98927b();
                if (b == null) {
                    b = str;
                }
                if (!C89219l.m154714a((Object) str2, (Object) b)) {
                    String b2 = secCaptcha.f152003h.mo98927b();
                    if (b2 == null) {
                        b2 = str;
                    }
                    secCaptcha.f152000e = b2;
                    String a = secCaptcha.f152003h.mo98926a();
                    if (a != null) {
                        str = a;
                    }
                    secCaptcha.f151999d = str;
                }
                secCaptcha.mo106919a().f32385l = secCaptcha.f152002g.f152016e;
                secCaptcha.mo106919a().f32381h = secCaptcha.f152002g.f152015d;
                secCaptcha.mo106919a().f32370E = secCaptcha.f151999d;
                String c = secCaptcha.f152003h.mo98928c();
                if (c != null) {
                    secCaptcha.mo106919a().f32376c = c;
                }
                if (secCaptcha.f151996a != null) {
                    C13285g.f32486a = 1;
                }
                C13241a aVar4 = secCaptcha.f151996a;
                if (aVar4 != null) {
                    aVar4.mo21395a(activity, secCaptcha);
                }
            }
            C67814a.m120000a("DmtSec", "popCaptcha time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void popCaptchaV2(Activity activity, String str, C67837a aVar) {
        String str2 = "";
        C89219l.m154721d(activity, str2);
        C89219l.m154721d(str, str2);
        C89219l.m154721d(aVar, str2);
        C51423a.m95784a(4, "Sec", "popCaptchaV2 - riskInfo = ".concat(String.valueOf(str)));
        C89219l.m154721d(str, str2);
        C89219l.m154721d(activity, str2);
        C89219l.m154721d(aVar, str2);
        if (C67810a.f151971a) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = C67810a.f151973c;
            if (secCaptcha == null) {
                C89219l.m154710a("captcha");
            }
            C89219l.m154721d(str, str2);
            C89219l.m154721d(activity, str2);
            C89219l.m154721d(aVar, str2);
            if (TextUtils.isEmpty(secCaptcha.f152002g.f152015d) && AppLog.getInstallId() != null) {
                C67822a aVar2 = secCaptcha.f152002g;
                String installId = AppLog.getInstallId();
                C89219l.m154716b(installId, str2);
                aVar2.mo106924a(installId);
                secCaptcha.mo106920a(secCaptcha.f152002g.f152016e, secCaptcha.f152002g.f152015d);
            }
            if (TextUtils.isEmpty(secCaptcha.f152002g.f152016e) && AppLog.getServerDeviceId() != null) {
                C67822a aVar3 = secCaptcha.f152002g;
                String serverDeviceId = AppLog.getServerDeviceId();
                C89219l.m154716b(serverDeviceId, str2);
                aVar3.mo106925b(serverDeviceId);
                secCaptcha.mo106920a(secCaptcha.f152002g.f152016e, secCaptcha.f152002g.f152015d);
            }
            if (activity.isFinishing()) {
                C51423a.m95784a(4, "Sec", "popCaptchaV2-activity-finishing");
            } else {
                secCaptcha.f151997b = new WeakReference<>(activity);
                secCaptcha.f151998c = aVar;
                activity.runOnUiThread(new SecCaptcha.RunnableC67821d(secCaptcha, activity));
                String str3 = secCaptcha.f152000e;
                String b = secCaptcha.f152003h.mo98927b();
                if (b == null) {
                    b = str2;
                }
                if (!C89219l.m154714a((Object) str3, (Object) b)) {
                    String b2 = secCaptcha.f152003h.mo98927b();
                    if (b2 == null) {
                        b2 = str2;
                    }
                    secCaptcha.f152000e = b2;
                    String a = secCaptcha.f152003h.mo98926a();
                    if (a != null) {
                        str2 = a;
                    }
                    secCaptcha.f151999d = str2;
                }
                secCaptcha.mo106919a().f32385l = secCaptcha.f152002g.f152016e;
                secCaptcha.mo106919a().f32381h = secCaptcha.f152002g.f152015d;
                secCaptcha.mo106919a().f32370E = secCaptcha.f151999d;
                secCaptcha.mo106919a().f32389p = C53438a.m98623b();
                String c = secCaptcha.f152003h.mo98928c();
                if (c != null) {
                    secCaptcha.mo106919a().f32376c = c;
                }
                if (secCaptcha.f151996a != null) {
                    C13285g.f32486a = 1;
                }
                C13241a aVar4 = secCaptcha.f151996a;
                if (aVar4 != null) {
                    aVar4.mo21396a(activity, new C13331j(str, (byte) 0), secCaptcha);
                }
            }
            C67814a.m120000a("DmtSec", "popCaptchaV2 time = " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.secapi.ISecApi
    public final void initSec(Context context, String str, int i, String str2, String str3, boolean z, AbstractC67839b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(bVar, "");
        C51423a.m95784a(4, "Sec", "initSec");
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(bVar, "");
        C67814a.m120000a("DmtSec", "init language = " + str + ", aid = " + i + ", appName = " + str2 + ", channel= " + str3);
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        GlobalContext.setContext(context);
        C21421a.C21422a aVar = new C21421a.C21422a(String.valueOf(i), "xSFlZQHv0CAGuLvBdg9Dmf3mPzkyLfcylfjoyuHQrnFwNil5zVp6O7hqiGV3ULZJFKspLUhgx0/l006qiRzlr65mwrwRDVujNsctCSnK+7jzeTttpik2QwGJzPyAXkxpWjKBB388szFpVxx2g0dMfnYyOfDLimWkvFr0/NUpN6VWy75HYJMI8QG3O9Kgxy7YB9woQQ++MWwUsY9UGezZ1T8mx3TihdfUKrDU4gkZrxrlUMRJ7mqUfCoIneRFDmkwJKbGeejOMvW2FcKtQROBoST9Ys6g/kBycHRyuiuI34LRA95NmefRHenYro8xfJVdtqz5tg==");
        aVar.mo144452b();
        aVar.mo144451a(str3);
        int i2 = 0;
        if (C89219l.m154714a((Object) false, (Object) true)) {
            i2 = 1;
        } else if (!C89219l.m154714a((Object) false, (Object) false)) {
            throw new C89376n();
        }
        aVar.f203777l = i2;
        if (aVar.f203777l == -1 || aVar.f203778m == 0) {
            throw new IllegalArgumentException("MSConfig init error!");
        }
        C21424c.m40223a(context, new C21421a(aVar.mo144453c()));
        C67810a.f151972b = C21424c.m40222a(String.valueOf(i));
        C67814a.m120000a("DmtSec", "init getSdkTime = " + (System.currentTimeMillis() - currentTimeMillis2));
        C67810a.f151974d = new C67812a(C67810a.f151972b);
        C1731i.m5631a(1000).mo5534a(new C67810a.C67811a(bVar, z, str, i, str2, str3, context), C1731i.f5562a, null);
        C67814a.m120000a("DmtSec", "init Time = " + (System.currentTimeMillis() - currentTimeMillis));
    }
}
