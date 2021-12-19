package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.local_test.C58939a;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import p4600h.C89377o;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.q */
public final class C37684q implements IHostContextDepend {
    static {
        Covode.recordClassIndex(45117);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isDebuggable() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isTeenMode() {
        return false;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final int getAppId() {
        return C17867d.f42590n;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getChannel() {
        return C17867d.f42595s;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getAppName() {
        return C17867d.m33081b();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUserAgent() {
        return RawURLGetter.m77316a("other");
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final long getVersionCode() {
        return C17867d.m33084e();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getVersionName() {
        return C17867d.m33085f();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Application getApplication() {
        Application a = C17879g.m33104a();
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getCurrentTelcomCarrier() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        C89219l.m154716b(deviceId, "");
        return deviceId;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getLanguage() {
        String locale = C80398en.m139370a().toString();
        C89219l.m154716b(locale, "");
        return locale;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPPEChannel() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getPackageName() {
        String packageName = C17867d.m33078a().getPackageName();
        C89219l.m154716b(packageName, "");
        return packageName;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getRegion() {
        String g = C58071d.m104913g();
        C89219l.m154716b(g, "");
        return g;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinName() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getSkinType() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getUpdateVersion() {
        return String.valueOf(C17867d.m33083d());
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isBoeEnable() {
        return C58939a.C58940a.f134171a.f134170a.enableBoe();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isPPEEnable() {
        throw new C89377o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final Context getApplicationContext() {
        Context applicationContext = getApplication().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154709a((Object) applicationContext, "");
        return applicationContext;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final String getBoeChannel() {
        LocalTestApi localTestApi = C58939a.C58940a.f134171a.f134170a;
        C89219l.m154716b(localTestApi, "");
        String boeLane = localTestApi.getBoeLane();
        C89219l.m154716b(boeLane, "");
        return boeLane;
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IHostContextDepend
    public final boolean isMiniAppEnable() {
        C59320c cVar = C59320c.C59324a.f135560a;
        C89219l.m154716b(cVar, "");
        IMiniAppService a = cVar.mo96989a();
        if (a == null || !a.checkMiniAppEnable(C17867d.m33078a())) {
            return false;
        }
        return true;
    }
}
