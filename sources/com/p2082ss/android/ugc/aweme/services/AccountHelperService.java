package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.newmedia.C30144g;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UgLoginBanner;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.ProfileServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.AccountHelperService */
public final class AccountHelperService implements IAccountHelperService {
    static {
        Covode.recordClassIndex(79572);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final void recommendAppUponAuth(Context context, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final String getUserApi() {
        return ProfileServiceImpl.m114884g().mo101952a();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final UrlModel getLoginViewBanner() {
        com.p2082ss.android.ugc.aweme.global.config.settings.pojo.UrlModel urlModel;
        try {
            UgLoginBanner g = C60180e.f137181g.mo97862g();
            if (g != null) {
                urlModel = g.getResourceUrl();
            } else {
                urlModel = null;
            }
            return C60180e.m109670a(urlModel);
        } catch (C16041a unused) {
            return new UrlModel();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final String getLoginViewTitleForMoneyGrowth() {
        try {
            UgLoginBanner g = C60180e.f137181g.mo97862g();
            if (!(g == null || g.getText() == null)) {
                String text = g.getText();
                C89219l.m154716b(text, "");
                return text;
            }
        } catch (C16041a unused) {
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final String selfUserApi() {
        return C29736b.f70924e + ProfileServiceImpl.m114884g().mo101954a(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final String userPermissionApi() {
        return C29736b.f70924e + ProfileServiceImpl.m114884g().mo101961b();
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final void AppsFlyerUtilsTrackLoginSuccess(String str) {
        UgCommonServiceImpl.m138290j().mo123092a().mo123112a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final void appendCommonParams(StringBuilder sb) {
        C89219l.m154721d(sb, "");
        AppLog.appendCommonParams(sb, false);
    }

    public static IAccountHelperService createIAccountHelperServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(9758);
        Object a = C81908b.m141854a(IAccountHelperService.class, z);
        if (a != null) {
            IAccountHelperService iAccountHelperService = (IAccountHelperService) a;
            MethodCollector.m26664o(9758);
            return iAccountHelperService;
        }
        if (C81908b.f183340dk == null) {
            synchronized (IAccountHelperService.class) {
                try {
                    if (C81908b.f183340dk == null) {
                        C81908b.f183340dk = new AccountHelperService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9758);
                    throw th;
                }
            }
        }
        AccountHelperService accountHelperService = (AccountHelperService) C81908b.f183340dk;
        MethodCollector.m26664o(9758);
        return accountHelperService;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final void loadWebViewUrl(String str, WebView webView) {
        if (webView != null && !C13627m.m24498a(str)) {
            C30144g.m60968a(webView, str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IAccountHelperService
    public final void friendUploadToken(String str, String str2, String str3) {
        FriendsServiceImpl.m96115u();
    }
}
