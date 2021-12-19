package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18419a;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18420b;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.AbstractC35339ca;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80398en;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.b */
public final class C53523b implements IHostContextDepend {
    static {
        Covode.recordClassIndex(63099);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getSkinName() {
        return "white";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getSkinType() {
        return "white";
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final int getAppId() {
        return C17867d.f42590n;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getChannel() {
        return C17867d.f42595s;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getAppName() {
        return C17867d.m33081b();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final long getVersionCode() {
        return C17867d.m33084e();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getVersionName() {
        return C17867d.m33085f();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isTeenMode() {
        return C80580in.m139687c();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final Application getApplication() {
        Context a = C17867d.m33078a();
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.Application");
        return (Application) a;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getDeviceId() {
        String deviceId = DeviceRegisterManager.getDeviceId();
        C89219l.m154716b(deviceId, "");
        return deviceId;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getLanguage() {
        String locale = C80398en.m139370a().toString();
        C89219l.m154716b(locale, "");
        return locale;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getPackageName() {
        String packageName = C17867d.m33078a().getPackageName();
        C89219l.m154716b(packageName, "");
        return packageName;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getUpdateVersion() {
        return String.valueOf(C17867d.m33083d());
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isDebuggable() {
        if (C89219l.m154714a((Object) C17867d.f42595s, (Object) "local_test")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final Context getApplicationContext() {
        Context applicationContext = getApplication().getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154709a((Object) applicationContext, "");
        return applicationContext;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getBoeChannel() {
        Object service = ServiceManager.get().getService(LocalTestApi.class);
        C89219l.m154716b(service, "");
        String boeLane = ((LocalTestApi) service).getBoeLane();
        C89219l.m154716b(boeLane, "");
        return boeLane;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getCurrentTelcomCarrier() {
        AbstractC35339ca l;
        C31575b.m65859a();
        IAccountService iAccountService = C31575b.f75524a;
        if (iAccountService == null || (l = iAccountService.mo57076l()) == null) {
            return null;
        }
        return l.getCurrentTelecomCarrier();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final String getPPEChannel() {
        String pPELane = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getPPELane();
        C89219l.m154716b(pPELane, "");
        return pPELane;
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isBoeEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final boolean isPPEEnable() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enablePpe();
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostContextDepend
    public final List<C18420b> getSettings(List<C18419a> list) {
        Object obj;
        Object a;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : list) {
            String str = t.f44006a;
            if (str.hashCode() == 3322092 && str.equals("live")) {
                arrayList2.add(t.f44007b);
            } else {
                arrayList.add(t.f44007b);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList2.isEmpty()) {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            Map<String, Object> a2 = s.mo95837k().mo95879a(arrayList2);
            C89219l.m154716b(a2, "");
            linkedHashMap.putAll(a2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            Map<String, Object> settings = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getSettings(arrayList);
            C89219l.m154716b(settings, "");
            linkedHashMap2.putAll(settings);
        }
        ArrayList arrayList3 = new ArrayList();
        for (T t2 : list) {
            if (C89219l.m154714a((Object) t2.f44006a, (Object) "live")) {
                obj = linkedHashMap.get(t2.f44007b);
            } else {
                obj = linkedHashMap2.get(t2.f44007b);
            }
            if (!(obj == null || (a = m98744a(t2.f44008c, obj)) == null)) {
                arrayList3.add(new C18420b(t2.f44007b, a));
            }
        }
        return arrayList3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:72|73|74|75|76|(2:80|(1:88)(1:89))(3:90|93|(1:95)(1:96))) */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x00ea */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m98744a(com.bytedance.ies.xbridge.base.runtime.p1292a.EnumC18421c r3, java.lang.Object r4) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a.C53523b.m98744a(com.bytedance.ies.xbridge.base.runtime.a.c, java.lang.Object):java.lang.Object");
    }
}
