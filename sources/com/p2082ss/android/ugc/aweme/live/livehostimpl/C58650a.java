package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bef.effectsdk.AssetResourceFinder;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.p906a.C13584a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1007g.C14853c;
import com.p2082ss.android.deviceregister.DeviceRegisterManager;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.live.LiveHostOuterService;
import com.p2082ss.android.ugc.aweme.live.p3410g.C58640d;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import java.util.Locale;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.a */
public final class C58650a implements IHostContext {

    /* renamed from: a */
    private EffectManager f133554a;

    static {
        Covode.recordClassIndex(68952);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int appId() {
        return 1180;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String appName() {
        return "trill";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final void enterRecorderActivity(Activity activity) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Pair<String, String> getFreeFlowModel() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqd6WT9zqz6boFUWCNb8hXcqWD+Ya5iCZdsBpqQbCrCATK5TY8vC0Qmemj8khX0LVtnQ9H7S9iPR9RquroRhShnoY0FgQWC9VqQj5zYD5WQfsWW4GAzArMJyr2XeWapOkUjlR/9xrlF3pxj3d+OSFgomF8CAy7I59SbJ8HO08APFpXOjv/bCGXD5MrA0/Zmgeqml7+RvCyMtlvV+7dHlvQ2nmwjcxS021zmwI2ArXTi3XEaXerIuE1vF0GJuIKoxxKqRvMStJShgEzjjAmOtGNaS04nw7VBctpYjEw8giftMjR3L43QyL/PNlD98w0SCx/1kkDEN4HuuRxCByVtdH0QIDAQAB";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getPackageName() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int liveId() {
        return 12;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getChannel() {
        return C17867d.f42595s;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final void refreshClientABTestValues() {
        C14853c.m27281b();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Context context() {
        return C17867d.m33078a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getServerDeviceId() {
        return DeviceRegisterManager.getDeviceId();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isBoe() {
        LiveHostOuterService.m107232p();
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Locale currentLocale() {
        return LiveHostOuterService.m107232p().mo95809c();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getBoeLane() {
        return LiveHostOuterService.m107232p().mo95820l();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int getUpdateVersionCode() {
        try {
            return C13584a.m24416a(context(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getVersionCode() {
        return String.valueOf(C17867d.m33087h());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final boolean isNeedProtectMinor() {
        return LiveHostOuterService.m107232p().mo95808b();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final int getLastVersionCode() {
        return C33842s.C33843a.f80132a.mo60078v().mo59941c().intValue();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final EffectManager getEffectManager() {
        if (this.f133554a == null) {
            C1743j jVar = new C1743j();
            AVExternalServiceImpl.m113114a().abilityService().effectService().buildEffectPlatform(context(), new C58677b(jVar), C58678c.f133589a);
            try {
                C1731i<TResult> iVar = jVar.f5610a;
                iVar.mo5547f();
                if (iVar.mo5544c()) {
                    C73991bj.m130131b("So decompress: LiveAppContext, get effect manager wrong,  task error: " + Log.getStackTraceString(iVar.mo5546e()));
                } else {
                    this.f133554a = iVar.mo5545d();
                }
            } catch (InterruptedException e) {
                C73991bj.m130131b("So decompress: LiveAppContext, get effect manager wrong, " + e.getMessage() + "at " + Log.getStackTraceString(e));
                e.printStackTrace();
            }
        }
        return this.f133554a;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoCdnUrl(String str, String str2) {
        return C58640d.m107768a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final File getTTLiveGeckoResourceFile(String str, String str2) {
        return C58640d.m107771b(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoResourcePath(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        File b = C58640d.m107771b(str, str2);
        if (b == null || !b.exists()) {
            return "";
        }
        return b.getAbsolutePath();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final String getTTLiveGeckoResourcePathAndUrl(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        File b = C58640d.m107771b(str, str2);
        if (b == null || !b.exists()) {
            return C58640d.m107768a(str, str2);
        }
        return b.getAbsolutePath();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostContext
    public final Object getResourceFinder(Context context, String str) {
        C1743j jVar = new C1743j();
        AVExternalServiceImpl.m113114a().abilityService().effectService().provideResourceFinder(new C58679d(this, jVar));
        C1731i<TResult> iVar = jVar.f5610a;
        try {
            iVar.mo5547f();
            if (iVar.mo5544c()) {
                C73991bj.m130131b("So decompress: LiveAppContext, get resource finder wrong,  task error: " + Log.getStackTraceString(iVar.mo5546e()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        TResult d = iVar.mo5545d();
        if (d == null) {
            return new AssetResourceFinder(context.getAssets(), str);
        }
        return d;
    }
}
