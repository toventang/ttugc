package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18337f;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.NetworkUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f */
public final class C7171f extends AbstractC18337f<Object, C7172a> {
    static {
        Covode.recordClassIndex(7917);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.f$a */
    public static class C7172a {
        @AbstractC27891c(mo46611a = "appName")

        /* renamed from: a */
        String f17861a;
        @AbstractC27891c(mo46611a = "aid")

        /* renamed from: b */
        int f17862b;
        @AbstractC27891c(mo46611a = "appVersion")

        /* renamed from: c */
        String f17863c;
        @AbstractC27891c(mo46611a = "versionCode")

        /* renamed from: d */
        String f17864d;
        @AbstractC27891c(mo46611a = "netType")

        /* renamed from: e */
        String f17865e;
        @AbstractC27891c(mo46611a = "orientation")

        /* renamed from: f */
        String f17866f;
        @AbstractC27891c(mo46611a = "device_id")

        /* renamed from: g */
        String f17867g;
        @AbstractC27891c(mo46611a = "user_id")

        /* renamed from: h */
        String f17868h;
        @AbstractC27891c(mo46611a = "screenWidth")

        /* renamed from: i */
        float f17869i;
        @AbstractC27891c(mo46611a = "screenHeight")

        /* renamed from: j */
        float f17870j;

        static {
            Covode.recordClassIndex(7918);
        }

        C7172a() {
        }
    }

    /* renamed from: a */
    private static C7172a m15090a(C18338g gVar) {
        String str;
        C7172a aVar = new C7172a();
        IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
        aVar.f17861a = iHostContext.appName();
        aVar.f17862b = iHostContext.appId();
        try {
            str = gVar.f43859a.getPackageManager().getPackageInfo(gVar.f43859a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = iHostContext.getVersionCode();
        }
        aVar.f17863c = str;
        aVar.f17864d = iHostContext.getVersionCode();
        Context context = iHostContext.context();
        if (TextUtils.isEmpty(C58029j.f132254f) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132254f = NetworkUtils.getNetworkAccessType(context);
        }
        aVar.f17865e = C58029j.f132254f;
        ActivityC0945e a = C11279p.m20001a(gVar.f43859a);
        String str2 = "vertical";
        if (!(a == null || a.getRequestedOrientation() == 1)) {
            str2 = "horizontal";
        }
        aVar.f17866f = str2;
        aVar.f17867g = AppLog.getServerDeviceId();
        aVar.f17868h = String.valueOf(C11115u.m19743a().mo17915b().mo13161c());
        aVar.f17869i = C3966y.m9668e(C3966y.m9664c());
        aVar.f17870j = C3966y.m9668e(C3966y.m9662b());
        return aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18337f
    public final /* synthetic */ C7172a invoke(Object obj, C18338g gVar) {
        return m15090a(gVar);
    }
}
