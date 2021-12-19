package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.kit.web.p1159a.C16481e;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c;
import com.bytedance.ies.web.p1285a.C18288a;
import com.p2082ss.android.newmedia.C30126c;
import com.p2082ss.android.newmedia.p2163a.C30123b;
import com.p2082ss.android.newmedia.p2164b.C30125a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.sdk.p2174a.C30222a;
import com.p2082ss.android.sdk.webview.C30265i;
import com.p2082ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.application.C33657b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b;
import com.p2082ss.android.ugc.aweme.bullet.module.base.C35227f;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35300b;
import com.p2082ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import com.p2082ss.android.ugc.aweme.commercialize.feed.C37866av;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38223aj;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38618ac;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38654au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38703bs;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38739d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38747h;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38663a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.C40544k;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40520b;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.C40660a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.lancet.p3385b.C58007a;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.C33369f;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.report.C67105b;
import com.p2082ss.android.ugc.aweme.share.ShareH5Service;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.android.ugc.aweme.utils.C80416ez;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.web.C81523a;
import com.p2082ss.android.ugc.aweme.web.C81631k;
import com.p2082ss.android.ugc.aweme.web.C81632l;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81570a;
import com.p2082ss.android.ugc.aweme.web.jsbridge.C81600b;
import com.p2082ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.p2082ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.c */
public final class C37667c implements AbstractC33115c {

    /* renamed from: a */
    private C40544k f89037a;

    static {
        Covode.recordClassIndex(45100);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: h */
    public final String mo58961h() {
        return "snssdk";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58949c() {
        C37866av.m76518a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: f */
    public final void mo58959f() {
        C40544k kVar = this.f89037a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: i */
    public final CardStruct mo58962i() {
        return C81570a.f182404d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: j */
    public final CardStruct mo58963j() {
        return C81570a.f182405e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: k */
    public final CardStruct mo58964k() {
        return C81570a.f182403c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: l */
    public final Aweme mo58965l() {
        return C81570a.f182407g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: m */
    public final Map<String, String> mo58966m() {
        return C81570a.f182408h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58926a(String str, List<String> list, Long l, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C38164aj.m77370a(str, list, l, str2, new C37669b(str4, str3));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58933a(Aweme aweme) {
        return C38703bs.m78530b(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final boolean mo58946b(Aweme aweme) {
        return C38703bs.m78532c(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58923a(String str) {
        C38747h.m78589a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58925a(String str, String str2, int i, int i2, String str3, String str4) {
        C33369f.f79310b.mo59409a(str, str2, i, i2, str3, str4, -1);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58930a(Context context, String str) {
        return C38767w.m78670c(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58932a(Uri uri, String str, Context context, String str2, Aweme aweme, boolean z) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        if (context == null) {
            return false;
        }
        if (C89219l.m154714a((Object) uri.getScheme(), (Object) "market")) {
            if (!C38669b.m78459a(context)) {
                C38663a.m78441a(context, aweme, str2);
            } else if (C38669b.m78460a(context, uri)) {
                C38663a.m78444b(context, aweme, str2);
            }
            return true;
        } else if (C38669b.m78463a(uri)) {
            if (!C38669b.m78459a(context)) {
                return false;
            }
            if (C38669b.m78464b(context, uri)) {
                C38663a.m78444b(context, aweme, str2);
            }
            return true;
        } else if (C38767w.m78644a(uri)) {
            if ((!C38703bs.m78530b(aweme) && !C38703bs.m78532c(aweme)) || !C38663a.m78448c(context, uri)) {
                return false;
            }
            if (!z) {
                C38663a.m78447c(context, aweme, str2);
                return false;
            }
            if (C38663a.m78443a(context, uri)) {
                C38663a.m78444b(context, aweme, str2);
            }
            return true;
        } else if (!C38703bs.m78530b(aweme) && !C38703bs.m78532c(aweme)) {
            return false;
        } else {
            if (C38663a.m78449d(context, uri)) {
                if (!z) {
                    C38663a.m78447c(context, aweme, str2);
                    return false;
                }
                if (C38663a.m78446b(context, uri)) {
                    C38663a.m78444b(context, aweme, str2);
                }
                return true;
            } else if (!(!C89219l.m154714a((Object) "sslocal", (Object) str)) || !(!C89219l.m154714a((Object) "localsdk", (Object) str))) {
                return false;
            } else {
                C38663a.m78441a(context, aweme, str2);
                return true;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58919a(C16481e eVar, String str) {
        ShareH5Service.C68827a.m121397a().mo109377a(((C35227f) eVar).f83231b, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58921a(AbstractC17019c cVar, String str) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109377a(((AbstractC35203a) cVar).f83165z, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58920a(AbstractC17019c cVar, SSWebView sSWebView) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109376a(((AbstractC35203a) cVar).f83165z, sSWebView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58922a(AbstractC17019c cVar, boolean z) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109378a(((AbstractC35203a) cVar).f83165z, z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58924a(String str, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(awemeRawAd, "");
        new C38223aj.C38224a().mo66651a(str).mo66649a(System.currentTimeMillis() - 5000).mo66650a(awemeRawAd).mo66652a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58927a(String str, boolean z) {
        C40660a.m82031a(str, z, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58934a(String str, String str2, List<String> list) {
        return C30126c.m60939a(str, str2, list);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58928a(Activity activity) {
        return CrossPlatformLegacyServiceImpl.m65225f().mo57039a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58918a(ActivityC0945e eVar, String str, String str2) {
        String str3;
        AwemeRawAd awemeRawAd;
        String str4;
        View findViewById;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        String str5 = "";
        C89219l.m154721d(eVar, str5);
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        C89219l.m154721d(eVar, str5);
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        AdPopUpWebPageHelper adPopUpWebPageHelper = AdPopUpWebPageHelper.f91197g.get(Integer.valueOf(eVar.hashCode()));
        if (adPopUpWebPageHelper == null) {
            adPopUpWebPageHelper = new AdPopUpWebPageHelper(eVar);
            AdPopUpWebPageHelper.f91197g.put(Integer.valueOf(eVar.hashCode()), adPopUpWebPageHelper);
        }
        C89219l.m154721d(str, str5);
        C89219l.m154721d(str2, str5);
        ActivityC0945e b = adPopUpWebPageHelper.mo67174b();
        if (b != null) {
            ActivityC0945e b2 = adPopUpWebPageHelper.mo67174b();
            if (b2 != null) {
                Aweme a = AdPopUpWebPageHelper.m78316a();
                AwemeRawAd awemeRawAd5 = null;
                if (!TextUtils.isEmpty((a == null || (awemeRawAd4 = a.getAwemeRawAd()) == null) ? null : awemeRawAd4.getSource())) {
                    Aweme a2 = AdPopUpWebPageHelper.m78316a();
                    str3 = (a2 == null || (awemeRawAd3 = a2.getAwemeRawAd()) == null) ? null : awemeRawAd3.getSource();
                } else {
                    Aweme a3 = AdPopUpWebPageHelper.m78316a();
                    if (a3 == null || (awemeRawAd = a3.getAwemeRawAd()) == null || (str3 = awemeRawAd.getWebTitle()) == null) {
                        str3 = str5;
                    }
                }
                AdPopUpWebPageWidget.C39024b bVar = AdPopUpWebPageWidget.f92172n;
                C38618ac.C38619a aVar = new C38618ac.C38619a();
                Aweme a4 = AdPopUpWebPageHelper.m78316a();
                if (a4 == null || (awemeRawAd2 = a4.getAwemeRawAd()) == null || (str4 = awemeRawAd2.getWebUrl()) == null) {
                    str4 = str5;
                }
                C38618ac.C38619a a5 = aVar.mo67199a(str4).mo67197a(b2);
                int b3 = C80534hh.m139609b();
                C89219l.m154721d(b2, str5);
                FrameLayout b4 = AdPopUpWebPageWidget.C39024b.m79197b(b2);
                if (b4 != null && b4.getId() == R.id.dl && (findViewById = b2.findViewById(R.id.zs)) != null && findViewById.getPaddingTop() > 0) {
                    b3 = 0;
                }
                C38618ac.C38619a a6 = a5.mo67195a(b3);
                if (str3 != null) {
                    str5 = str3;
                }
                C38618ac.C38619a b5 = a6.mo67201b(str5);
                Bundle bundle = new Bundle();
                Aweme a7 = AdPopUpWebPageHelper.m78316a();
                if (!(a7 == null || a7.getAwemeRawAd() == null)) {
                    C38739d.m78570a(bundle, AdPopUpWebPageHelper.m78316a(), b2);
                    C38739d.m78573b(bundle, AdPopUpWebPageHelper.m78316a(), b2);
                    C38739d.m78575c(bundle, AdPopUpWebPageHelper.m78316a(), b2);
                    AdPopUpWebPageHelper.m78316a();
                    C38739d.m78569a(bundle, b2);
                }
                C38618ac.C38619a a8 = b5.mo67196a(bundle);
                Aweme a9 = AdPopUpWebPageHelper.m78316a();
                if (a9 != null) {
                    awemeRawAd5 = a9.getAwemeRawAd();
                }
                C38618ac.C38619a a10 = a8.mo67198a(awemeRawAd5);
                a10.f91273g = true;
                adPopUpWebPageHelper.f91201c = bVar.mo67714a(b2, a10.mo67200a(), adPopUpWebPageHelper.f91202d, adPopUpWebPageHelper.f91203e);
                AdPopUpWebPageView adPopUpWebPageView = adPopUpWebPageHelper.f91201c;
                if (adPopUpWebPageView != null) {
                    adPopUpWebPageView.setTitleBarCallback(adPopUpWebPageHelper.f91204f);
                }
            }
            AdPopUpWebPageView adPopUpWebPageView2 = adPopUpWebPageHelper.f91201c;
            if (adPopUpWebPageView2 != null) {
                adPopUpWebPageView2.mo66106a(new AdPopUpWebPageHelper.C38601c(adPopUpWebPageHelper, adPopUpWebPageView2, b, str, str2, null));
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58931a(Context context, String str, boolean z) {
        Aweme aweme;
        C89219l.m154721d(context, "");
        if (!z) {
            C38751k a = C38654au.m78417a();
            if (a != null) {
                aweme = a.f91522m;
            } else {
                aweme = null;
            }
            if (AbstractC38757n.m78633a(context, aweme) || C59286a.m108996a(context, aweme)) {
                return true;
            }
        }
        return C38669b.m78462a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final boolean mo58929a(Context context, Aweme aweme) {
        return AbstractC38757n.m78633a(context, aweme);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.c$a */
    static final class C37668a extends AbstractC89220m implements AbstractC89171a<C30265i> {

        /* renamed from: a */
        public static final C37668a f89038a = new C37668a();

        static {
            Covode.recordClassIndex(45101);
        }

        C37668a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C30265i invoke() {
            return C30265i.m61248a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final String mo58935b() {
        String str = C29736b.f70924e;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: g */
    public final void mo58960g() {
        C40544k kVar = this.f89037a;
        if (kVar != null) {
            kVar.mo69668a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final String mo58908a() {
        return String.valueOf(C33657b.f79853a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: d */
    public final boolean mo58957d() {
        C89219l.m154716b(C81631k.f182525a, "");
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: e */
    public final List<Pattern> mo58958e() {
        List<Pattern> b = C81632l.m141482b();
        C89219l.m154716b(b, "");
        return C89070n.m154585g((Collection) b);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: n */
    public final int mo58967n() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        return curUser.getAccountType();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58942b(String str) {
        C58007a.m104833b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final CardStruct mo58947c(Aweme aweme) {
        return C37699a.m76209L(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58938b(Activity activity) {
        C89219l.m154721d(activity, "");
        AdPopUpWebPageHelper.C38599a.m78320a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58950c(Activity activity) {
        C89219l.m154721d(activity, "");
        C80416ez.m139401a(activity, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58951c(AbstractC17019c cVar) {
        DownloadBusiness downloadBusiness;
        if ((cVar instanceof C35222b) && (downloadBusiness = (DownloadBusiness) ((AbstractC35203a) cVar).f83165z.mo61972a(DownloadBusiness.class)) != null) {
            downloadBusiness.mo65531a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final Map<String, Object> mo58911a(AbstractC17019c cVar) {
        if (cVar instanceof C35222b) {
            return ShareH5Service.C68827a.m121397a().mo109375a(((AbstractC35203a) cVar).f83165z);
        }
        return C89041ag.m154415a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final List<AbstractC16183k> mo58937b(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        C18288a aVar = (C18288a) bVar.mo25832c(C18288a.class);
        if (aVar != null) {
            C81600b bVar2 = new C81600b(aVar);
            arrayList.add(C35300b.m72242a(bVar, "openPanel", bVar2));
            arrayList.add(C35300b.m72242a(bVar, "openLightLandingPage", bVar2));
            arrayList.add(C35300b.m72242a(bVar, "closeLightLandingPage", bVar2));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final List<AbstractC16183k> mo58948c(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        C18288a aVar = (C18288a) bVar.mo25832c(C18288a.class);
        arrayList.add(C35300b.m72242a(bVar, "closeLoading", new CloseWebViewLoadingMethod(aVar)));
        arrayList.add(C35300b.m72242a(bVar, "closeJuStickerWindow", new CloseJuStickerWindowMethod(aVar)));
        arrayList.add(C35300b.m72242a(bVar, "didFinishLoad", new DidLoadFinishMethod(aVar)));
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58939b(AbstractC17019c cVar) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109386b(((AbstractC35203a) cVar).f83165z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final List<AbstractC16183k> mo58910a(C16248b bVar) {
        C89219l.m154721d(bVar, "");
        ArrayList arrayList = new ArrayList();
        C18288a aVar = (C18288a) bVar.mo25832c(C18288a.class);
        Object c = bVar.mo25832c(Context.class);
        if (!(aVar == null || c == null)) {
            C81570a aVar2 = new C81570a(new WeakReference(c));
            C89219l.m154721d(aVar, "");
            aVar2.f182410a = aVar.f43654d.hashCode();
            arrayList.add(C35300b.m72242a(bVar, "cardClick", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "cardStatus", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "closeCardDialog", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "openHalfScreenForm", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "callNativePhone", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "download_click", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "setCard", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "closeAdModal", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "modalInteractionURL", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "showModalPage", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "setModalSize", aVar2));
            arrayList.add(C35300b.m72242a(bVar, "cardInteriorShow", aVar2));
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final boolean mo58955c(String str) {
        return C37699a.m76288c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58917a(WebView webView) {
        C30123b.m60933a(webView);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58916a(Context context, WebView webView) {
        C30123b.m60932a(context, webView);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final int mo58907a(String str, String str2) {
        return C33369f.f79310b.mo59403a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final String mo58909a(String str, int i) {
        return C40520b.m81728a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final String mo58936b(String str, String str2) {
        IAdLandPagePreloadService f;
        if (TextUtils.isEmpty(str) || (f = AdLandPagePreloadServiceImpl.m68380f()) == null) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return C80333dc.m139277b(f.mo59391g(str2), str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: d */
    public final String mo58956d(String str, String str2) {
        if (C89219l.m154714a((Object) "sslocal", (Object) str) || C89219l.m154714a((Object) "localsdk", (Object) str)) {
            return C30125a.m60935a(str2);
        }
        return str2;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.c$b */
    static final class C37669b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ String f89039a;

        /* renamed from: b */
        final /* synthetic */ String f89040b;

        static {
            Covode.recordClassIndex(45102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37669b(String str, String str2) {
            super(2);
            this.f89039a = str;
            this.f89040b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            Long l;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                bVar2.f90214d = this.f89039a;
                return bVar2;
            }
            String str = this.f89040b;
            if (str != null) {
                l = C89361p.m154865g(str);
            } else {
                l = null;
            }
            return bVar2.mo66503c(l);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58952c(AbstractC17019c cVar, SSWebView sSWebView) {
        DownloadBusiness downloadBusiness;
        if ((cVar instanceof C35222b) && (downloadBusiness = (DownloadBusiness) ((AbstractC35203a) cVar).f83165z.mo61972a(DownloadBusiness.class)) != null) {
            downloadBusiness.mo65532a(sSWebView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58940b(AbstractC17019c cVar, SSWebView sSWebView) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109387b(((AbstractC35203a) cVar).f83165z, sSWebView);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58953c(String str, String str2) {
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C37668a.f89038a);
        C30265i iVar = (C30265i) a.getValue();
        if (iVar != null) {
            iVar.mo53721b();
        }
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (f != null) {
            if (!TextUtils.isEmpty(str)) {
                String g = f.mo59391g("feed");
                if (!TextUtils.isEmpty(g)) {
                    String a2 = C81631k.f182525a.mo53731a(g);
                    C89219l.m154716b(a2, "");
                    ((C30265i) a.getValue()).mo53720a(new C81523a(a2, str, "feed"));
                }
                String g2 = f.mo59391g("splash");
                if (!TextUtils.isEmpty(g2)) {
                    String a3 = C81631k.f182525a.mo53731a(g2);
                    C89219l.m154716b(a3, "");
                    ((C30265i) a.getValue()).mo53720a(new C81523a(a3, str, "splash"));
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                String g3 = f.mo59391g("lynx_feed");
                if (!TextUtils.isEmpty(g3)) {
                    String a4 = C81631k.f182525a.mo53731a(g3);
                    C89219l.m154716b(a4, "");
                    ((C30265i) a.getValue()).mo53720a(new C81523a(a4, str2, "lynx_feed"));
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58913a(Activity activity, String str) {
        Aweme d = AwemeService.m70060b().mo60690d(str);
        IReportService a = C39223a.m79587a();
        C89219l.m154716b(d, "");
        a.mo68693a(C67105b.m118761a(d, "homepage_hot"));
        C39223a.m79587a().mo68694b(activity, C67105b.m118760a(d, "landing_page", "ad"));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58941b(AbstractC17019c cVar, String str) {
        if (cVar instanceof C35222b) {
            ShareH5Service.C68827a.m121397a().mo109388b(((AbstractC35203a) cVar).f83165z, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: c */
    public final void mo58954c(String str, boolean z) {
        C40660a.m82033c(str, z, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final void mo58943b(String str, boolean z) {
        C40660a.m82032b(str, z, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final boolean mo58944b(Activity activity, String str) {
        return CrossPlatformLegacyServiceImpl.m65225f().mo57041a((Context) activity, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: b */
    public final boolean mo58945b(Context context, String str) {
        return C30125a.m60938b(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58912a(int i, int i2, Intent intent) {
        C30222a aVar = new C30222a();
        aVar.f72083a = i;
        aVar.f72084b = i2;
        aVar.f72085c = intent;
        AbstractC81915c.m141874a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58914a(Activity activity, String str, long j) {
        Aweme d = AwemeService.m70060b().mo60690d(str);
        if (d != null) {
            C39223a.m79587a().mo68694b(activity, C67105b.m118759a(d, "live_ad", j, "ad"));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c
    /* renamed from: a */
    public final void mo58915a(Context context, View view, C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(context, view, jVar);
        }
    }
}
