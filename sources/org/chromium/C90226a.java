package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.p995g.C14757g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

/* renamed from: org.chromium.a */
public class C90226a extends TTAppInfoProvider {

    /* renamed from: a */
    private static C90226a f204960a;

    /* renamed from: b */
    private TTAppInfoProvider.AppInfo f204961b;

    /* renamed from: c */
    private Context f204962c;

    static {
        Covode.recordClassIndex(106485);
    }

    @Override // com.ttnet.org.chromium.net.TTAppInfoProvider
    /* renamed from: a */
    public final TTAppInfoProvider.AppInfo mo141646a() {
        MethodCollector.m26663i(5701);
        try {
            synchronized (C90226a.class) {
                try {
                    if (this.f204961b == null) {
                        this.f204961b = new TTAppInfoProvider.AppInfo();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5701);
                    throw th;
                }
            }
            this.f204961b.f198578b = C90228c.m156904a().mo145261a("getAppId");
            this.f204961b.f198584h = C90228c.m156904a().mo145261a("getAppName");
            this.f204961b.f198585i = C90228c.m156904a().mo145261a("getSdkAppId");
            this.f204961b.f198586j = C90228c.m156904a().mo145261a("getSdkVersion");
            this.f204961b.f198587k = C90228c.m156904a().mo145261a("getChannel");
            this.f204961b.f198580d = C90228c.m156904a().mo145261a("getDeviceId");
            if (C90232f.m156944a(this.f204962c)) {
                this.f204961b.f198602z = "1";
            } else {
                this.f204961b.f198602z = "0";
            }
            this.f204961b.f198595s = C90228c.m156904a().mo145261a("getAbi");
            this.f204961b.f198589m = C90228c.m156904a().mo145261a("getDevicePlatform");
            this.f204961b.f198583g = C90228c.m156904a().mo145261a("getDeviceType");
            this.f204961b.f198590n = C90228c.m156904a().mo145261a("getDeviceBrand");
            this.f204961b.f198591o = C90228c.m156904a().mo145261a("getDeviceModel");
            this.f204961b.f198581e = C90228c.m156904a().mo145261a("getNetAccessType");
            this.f204961b.f198579c = C90228c.m156904a().mo145261a("getOSApi");
            this.f204961b.f198588l = C90228c.m156904a().mo145261a("getOSVersion");
            this.f204961b.f198577a = C90228c.m156904a().mo145261a("getUserId");
            this.f204961b.f198582f = C90228c.m156904a().mo145261a("getVersionCode");
            this.f204961b.f198592p = C90228c.m156904a().mo145261a("getVersionName");
            this.f204961b.f198593q = C90228c.m156904a().mo145261a("getUpdateVersionCode");
            this.f204961b.f198594r = C90228c.m156904a().mo145261a("getManifestVersionCode");
            this.f204961b.f198569A = C90228c.m156904a().mo145261a("getStoreIdc");
            this.f204961b.f198570B = C90228c.m156904a().mo145261a("getRegion");
            this.f204961b.f198571C = C90228c.m156904a().mo145261a("getSysRegion");
            this.f204961b.f198572D = C90228c.m156904a().mo145261a("getCarrierRegion");
            this.f204961b.f198575G = C90228c.m156904a().mo145261a("getTNCRequestFlags");
            this.f204961b.f198576H = C90228c.m156904a().mo145261a("getHttpDnsRequestFlags");
            Map<String, String> b = C90228c.m156904a().mo145264b();
            if (b != null && !b.isEmpty()) {
                this.f204961b.f198596t = b.get("first");
                this.f204961b.f198597u = b.get("second");
                this.f204961b.f198598v = b.get("third");
                this.f204961b.f198599w = b.get("httpdns");
                this.f204961b.f198600x = b.get("netlog");
                this.f204961b.f198601y = b.get("boe");
            }
            Map<String, String> f = C90228c.m156904a().mo145268f();
            String str = "";
            if (f != null && !f.isEmpty()) {
                for (Map.Entry<String, String> entry : f.entrySet()) {
                    str = entry.getKey() + ":" + entry.getValue() + "\r\n" + str;
                }
            }
            String a = m156898a(b.get("first"));
            if (!TextUtils.isEmpty(a)) {
                str = "Cookie:" + a + "\r\n" + str;
            }
            this.f204961b.f198573E = str;
            Map<String, String> g = C90228c.m156904a().mo145269g();
            String str2 = "";
            if (g != null && !g.isEmpty()) {
                for (Map.Entry<String, String> entry2 : g.entrySet()) {
                    str2 = entry2.getKey() + ":" + entry2.getValue() + "\r\n" + str2;
                }
            }
            this.f204961b.f198574F = str2;
            if (C90229d.m156924a().loggerDebug()) {
                C90229d.m156924a().loggerD("CronetAppInfoProvider", "get appinfo = ".concat(String.valueOf("AppInfo{, mUserId='" + this.f204961b.getUserId() + '\'' + ", mAppId='" + this.f204961b.getAppId() + '\'' + ", mOSApi='" + this.f204961b.getOSApi() + '\'' + ", mDeviceId='" + this.f204961b.getDeviceId() + '\'' + ", mNetAccessType='" + this.f204961b.getNetAccessType() + '\'' + ", mVersionCode='" + this.f204961b.getVersionCode() + '\'' + ", mDeviceType='" + this.f204961b.getDeviceType() + '\'' + ", mAppName='" + this.f204961b.getAppName() + '\'' + ", mSdkAppID='" + this.f204961b.getSdkAppID() + '\'' + ", mSdkVersion='" + this.f204961b.getSdkVersion() + '\'' + ", mChannel='" + this.f204961b.getChannel() + '\'' + ", mOSVersion='" + this.f204961b.getOSVersion() + '\'' + ", mAbi='" + this.f204961b.getAbi() + '\'' + ", mDevicePlatform='" + this.f204961b.getDevicePlatform() + '\'' + ", mDeviceBrand='" + this.f204961b.getDeviceBrand() + '\'' + ", mDeviceModel='" + this.f204961b.getDeviceModel() + '\'' + ", mVersionName='" + this.f204961b.getVersionName() + '\'' + ", mUpdateVersionCode='" + this.f204961b.getUpdateVersionCode() + '\'' + ", mManifestVersionCode='" + this.f204961b.getManifestVersionCode() + '\'' + ", mHostFirst='" + this.f204961b.getHostFirst() + '\'' + ", mHostSecond='" + this.f204961b.getHostSecond() + '\'' + ", mHostThird='" + this.f204961b.getHostThird() + '\'' + ", mDomainHttpDns='" + this.f204961b.getDomainHttpDns() + '\'' + ", mDomainNetlog='" + this.f204961b.getDomainNetlog() + '\'' + ", mDomainBoe='" + this.f204961b.getDomainBoe() + '\'' + '}')));
            }
        } catch (Throwable unused) {
        }
        TTAppInfoProvider.AppInfo appInfo = this.f204961b;
        MethodCollector.m26664o(5701);
        return appInfo;
    }

    private C90226a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f204962c = applicationContext;
    }

    /* renamed from: a */
    public static C90226a m156899a(Context context) {
        MethodCollector.m26663i(5692);
        if (f204960a == null) {
            synchronized (C90226a.class) {
                try {
                    if (f204960a == null) {
                        f204960a = new C90226a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5692);
                    throw th;
                }
            }
        }
        C90226a aVar = f204960a;
        MethodCollector.m26664o(5692);
        return aVar;
    }

    /* renamed from: a */
    private static String m156898a(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                Map<String, List<String>> map = cookieHandler.get(C14757g.m27061b("https://".concat(String.valueOf(str))), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : entry.getValue()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
