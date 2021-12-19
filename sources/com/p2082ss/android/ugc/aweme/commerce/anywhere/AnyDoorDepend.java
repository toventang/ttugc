package com.p2082ss.android.ugc.aweme.commerce.anywhere;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.keva.Keva;
import com.bytedance.news.common.service.manager.C21520c;
import com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend;
import com.p2082ss.android.anywheredoor_api.depend.IAnyDoorRouterDepend;
import com.p2082ss.android.anywheredoor_api.p2120a.EnumC29730a;
import com.p2082ss.android.anywheredoor_api.p2122c.C29732a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.application.C33657b;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import java.net.URLEncoder;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.AnyDoorDepend */
public final class AnyDoorDepend implements IAnyDoorDepend {
    static {
        Covode.recordClassIndex(44864);
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend
    public final EnumC29730a getAppType() {
        return EnumC29730a.US;
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend
    public final Context getContext() {
        return C17867d.m33078a();
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend
    public final IAnyDoorRouterDepend getRouter() {
        return new C37479a();
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend
    public final void cleanExtraMockCacheIfNeed() {
        ISplashAdService iSplashAdService = (ISplashAdService) C21520c.m40424a(ISplashAdService.class);
        if (iSplashAdService != null) {
            iSplashAdService.mo28717c();
        }
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorDepend
    public final C29732a getAppInfo() {
        String str;
        String valueOf = String.valueOf(C33657b.f79853a);
        String serverDeviceId = AppLog.getServerDeviceId();
        C31575b.m65859a();
        if (C31575b.f75524a.mo57080p()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            str = g.getCurUserId();
        } else {
            str = "0";
        }
        String encode = URLEncoder.encode(Build.MODEL, "UTF-8");
        boolean enableBoe = C58939a.C58940a.f134171a.f134170a.enableBoe();
        String str2 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        String str3 = Build.VERSION.RELEASE;
        String string = Keva.getRepo("aweme_network").getString("lastInputEmailPrefix", "");
        C89219l.m154716b(str2, "");
        C89219l.m154716b(encode, "");
        return new C29732a(valueOf, str, serverDeviceId, str2, encode, str3, string, enableBoe);
    }
}
