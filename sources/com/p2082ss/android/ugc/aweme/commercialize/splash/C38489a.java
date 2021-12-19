package com.p2082ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17933a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29505b;
import com.p2082ss.android.p2133d.C29858f;
import com.p2082ss.android.p2133d.C29862h;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.AwemeAppData;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33799a;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38166ak;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38203x;
import com.p2082ss.android.ugc.aweme.commercialize.p2534ad.C37592c;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38531f;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38580b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38695bp;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38764t;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38673e;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.crossplatform.business.p2708a.C40584a;
import com.p2082ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.p2082ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49815a;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80373ed;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.openauthorize.AuthorizeCommonService;
import com.p2082ss.android.ugc.trill.p4375d.C85081a;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.a */
public final class C38489a implements AbstractC17934b {
    static {
        Covode.recordClassIndex(46014);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final boolean mo28623a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final boolean mo28624a(Context context, String str, String str2, String str3) {
        C89219l.m154721d(context, "");
        Context a = C17867d.m33078a();
        C89219l.m154721d(a, "");
        C89219l.m154721d(a, "");
        List<C29862h> extractImageUrlList = C29858f.extractImageUrlList(str, null);
        C89219l.m154716b(extractImageUrlList, "");
        return C80373ed.m139352a(a, -1, extractImageUrlList, str2, "", str3, str3);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: f */
    public final boolean mo28636f() {
        return C80580in.m139687c();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: i */
    public final void mo28639i() {
        C58945a.C58947b.f134185a.f134176c = false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: l */
    public final long mo28642l() {
        return C38493d.m78021b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: n */
    public final String mo28644n() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: c */
    public final String mo28630c() {
        String b = C85081a.m146287b();
        if (b == null) {
            return "";
        }
        return b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: d */
    public final AbstractC29505b mo28632d() {
        if (C38531f.m78151a()) {
            return C38166ak.f90146a;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: e */
    public final String mo28634e() {
        return C39223a.m79590d().mo68621f();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: g */
    public final boolean mo28637g() {
        if (C39223a.m79593g().mo68663b() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: j */
    public final void mo28640j() {
        C89219l.m154721d("splash", "");
        C37592c.f88852a = "splash";
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: k */
    public final void mo28641k() {
        if (MainLooperOptService.m105334b((MainLooperOptService.EnumC58297a) null) != null) {
            MainLooperOptService.f132758h = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: m */
    public final String mo28643m() {
        String installId = AppLog.getInstallId();
        C89219l.m154716b(installId, "");
        return installId;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: p */
    public final IDownloadService mo28646p() {
        IDownloadService b = DownloadServiceImpl.m86121b();
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: q */
    public final boolean mo28647q() {
        AwemeAppData a = AwemeAppData.m60956a();
        C89219l.m154716b(a, "");
        return a.f79681h;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: r */
    public final boolean mo28648r() {
        AwemeAppData a = AwemeAppData.m60956a();
        C89219l.m154716b(a, "");
        return a.f79679f;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: s */
    public final boolean mo28649s() {
        AwemeAppData a = AwemeAppData.m60956a();
        C89219l.m154716b(a, "");
        return a.f79680g;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: t */
    public final int mo28650t() {
        return C33403c.m68511d(C17867d.m33078a());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: u */
    public final boolean mo28651u() {
        C33836o a = C33836o.m69201a();
        C89219l.m154716b(a, "");
        return a.f80094a.f121705b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: v */
    public final long mo28652v() {
        C33836o a = C33836o.m69201a();
        C89219l.m154716b(a, "");
        return a.f80094a.f121706c;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: b */
    public final String mo28626b() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        return g.getCurUserId();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: o */
    public final String mo28645o() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final HashMap<String, String> mo28615a() {
        int i;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        if (curUser != null) {
            int b = C39223a.m79593g().mo68663b();
            if (curUser.getUserMode() != -1) {
                i = curUser.getUserMode();
            } else {
                i = 0;
            }
            if (b == 2 || b == 0) {
                str = String.valueOf(i | 4);
            } else {
                str = String.valueOf(i);
            }
            hashMap.put("user_mode", str);
            hashMap.put("user_period", String.valueOf(curUser.getUserPeriod()));
        }
        return hashMap;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: h */
    public final boolean mo28638h() {
        if (C89361p.m154872a("startupTest", C33799a.f80046a, true) || C89361p.m154872a("MTraceStartupDiff", C33799a.f80046a, true) || C89361p.m154872a("manuallyMTrace", C33799a.f80046a, true) || C89361p.m154872a("MTraceStartup", C33799a.f80046a, true) || C89361p.m154872a("systrace", C33799a.f80046a, true) || C89361p.m154872a("manuallyATrace", C33799a.f80046a, true) || C89361p.m154872a("dominoMode", C33799a.f80046a, true)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final AbstractC29503a mo28614a(Context context) {
        return new C38490b(context);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: b */
    public final boolean mo28629b(Aweme aweme) {
        C17867d.m33078a();
        return AbstractC49815a.m93312l(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: c */
    public final boolean mo28631c(Aweme aweme) {
        return C37699a.m76199B(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: d */
    public final boolean mo28633d(Aweme aweme) {
        return C37699a.m76198A(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28619a(Aweme aweme) {
        C38703bs.m78522a(aweme, (Executor) null, false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: b */
    public final Intent mo28625b(Context context) {
        C89219l.m154721d(context, "");
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28618a(AbstractC17933a aVar) {
        C89219l.m154721d(aVar, "");
        C58221f.m105153e().mo95704a(new SplashAdDependImpl$setPreloadDelay$1(aVar));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: e */
    public final void mo28635e(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        C81079v.m140776O().mo123944b(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28620a(String str) {
        C89219l.m154721d(str, "");
        TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, str, null, 0, 6, null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: b */
    public final void mo28628b(String str) {
        C89219l.m154721d(str, "");
        C40584a.m81930a(str, null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final boolean mo28622a(Activity activity) {
        C89219l.m154721d(activity, "");
        return AuthorizeCommonService.m146329a().isActivityAwemeAuthorize(activity);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: b */
    public final void mo28627b(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C38673e.m78470a(str);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        objArr[1] = str2;
        objArr[2] = URLEncoder.encode("trigger_by");
        objArr[3] = URLEncoder.encode("splash");
        C33722d.C33723a.m69045a(context, C1764a.m5928a("%s%s%s=%s", objArr), (String) null, true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28616a(Context context, Aweme aweme) {
        C89219l.m154721d(context, "");
        if (C37699a.m76199B(aweme) && C38493d.f90921a != 0) {
            int i = 1;
            if (!C38493d.f90924d) {
                i = 2;
            }
            long currentTimeMillis = System.currentTimeMillis() - C38493d.f90921a;
            C38493d.f90921a = 0;
            HashMap hashMap = new HashMap();
            hashMap.put("feedduration", String.valueOf(currentTimeMillis));
            hashMap.put("awemelaunch", String.valueOf(i));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", new C27910f().mo46674b(hashMap));
            C38189j.m77510b(context, "feed_show", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) hashMap2));
            C18129a.m33746a("draw_ad", "feed_show", aweme.getAwemeRawAd()).mo28897a("feedduration", Long.valueOf(currentTimeMillis)).mo28897a("awemelaunch", Integer.valueOf(i)).mo28902c();
            C38580b.m78285a(System.currentTimeMillis(), "finish");
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28621a(boolean z, String str) {
        C89219l.m154721d(str, "");
        if (z) {
            C58945a.C58947b.f134185a.mo96425a(str, false);
        } else {
            C58945a.C58947b.f134185a.mo96429b(str, false);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b
    /* renamed from: a */
    public final void mo28617a(Context context, Aweme aweme, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(map, "");
        if (!(context == null || aweme == null || !C37699a.m76199B(aweme))) {
            if (C37699a.m76318w(aweme) || !TextUtils.isEmpty(C37699a.m76281b(aweme))) {
                C38189j.m77510b(context, "splash_click", aweme, C38189j.m77468a(context, aweme, false, map));
                C18129a.C18130a a = C18129a.m33746a("draw_ad", "splash_click", aweme.getAwemeRawAd());
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a.f43182a.put(entry.getKey(), entry.getValue());
                    }
                }
                a.mo28902c();
                C40584a.m81930a("splash_ad", null);
                C38189j.m77510b(context, "click", aweme, C38189j.m77468a(context, aweme, true, map));
                if (C37699a.m76314s(aweme)) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C38203x(awemeRawAd));
                }
                if (!C38695bp.m78506a(context, aweme, 42, new C38764t(context, aweme))) {
                    AbstractC38757n.m78655c(context, aweme);
                }
            }
        }
    }
}
