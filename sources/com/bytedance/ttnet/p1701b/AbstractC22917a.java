package com.bytedance.ttnet.p1701b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.common.utility.p910e.C13611a;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14659h;
import com.bytedance.frameworks.baselib.network.http.p994f.C14749b;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.frameworks.baselib.network.http.p995g.C14758h;
import com.bytedance.ttnet.AbstractC22897a;
import com.bytedance.ttnet.AbstractC22938d;
import com.bytedance.ttnet.C22932c;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.p1700a.C22898a;
import com.bytedance.ttnet.p1700a.C22904b;
import com.bytedance.ttnet.p1703d.C22939a;
import com.bytedance.ttnet.p1703d.C22942c;
import com.bytedance.ttnet.p1704e.C22949a;
import com.bytedance.ttnet.p1704e.C22950b;
import com.bytedance.ttnet.p1704e.C22951c;
import com.bytedance.ttnet.p1705f.C22954c;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.b.a */
public abstract class AbstractC22917a implements ICronetAppProvider, ICronetDepend {
    static {
        Covode.recordClassIndex(26825);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void doLoadLibrary(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbClient() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFeature() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFlag() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppId() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getBypassBOEJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCarrierRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getChannel() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDevicePlatform() {
        return "android";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getGetDomainDefaultJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getHttpDnsRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getManifestVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public ArrayList<byte[]> getOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSsmix() {
        return "a";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdcRuleJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSysRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getTNCRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUUID() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUpdateVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUserId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean needCustomLoadLibrary() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceBrand() {
        return Build.BRAND;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceType() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return C14756f.f35969a.get();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbi() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCronetSoPath() {
        return C22898a.m43150a(TTNetInit.getTTNetDepend().mo37259a()).f54076e;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestQuery() {
        AbstractC22938d tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend != null) {
            boolean z = tTNetDepend instanceof AbstractC22897a;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229232 */

            static {
                Covode.recordClassIndex(26831);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                TTNetInit.notifyColdStartFinish();
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onCronetBootSucceed() {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229276 */

            static {
                Covode.recordClassIndex(26835);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                C22898a a = C22898a.m43150a(TTNetInit.getTTNetDepend().mo37259a());
                try {
                    SharedPreferences a2 = C34822d.m71158a(a.f54074c, "ss_app_config", 0);
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putInt("chromium_boot_failures", 0);
                    Logger.debug();
                    C13611a.m24460a(edit);
                    a.f54075d = a2.getInt("chromium_boot_failures", 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("chromium_boot_failures", Integer.valueOf(a.f54075d));
                    TTNetInit.getTTNetDepend().mo37261a(a.f54074c, linkedHashMap);
                } catch (Throwable unused) {
                }
                C22932c.f54203e = true;
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDPI() {
        int d = C13628n.m24524d(TTNetInit.getTTNetDepend().mo37259a());
        if (d > 0) {
            return String.valueOf(d);
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            if (str == null || str.length() <= 10) {
                return str;
            }
            return str.substring(0, 10);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getResolution() {
        String c = C13628n.m24523c(TTNetInit.getTTNetDepend().mo37259a());
        if (!C13627m.m24498a(c)) {
            return c;
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getNetAccessType() {
        Context a = TTNetInit.getTTNetDepend().mo37259a();
        if (TextUtils.isEmpty(C58029j.f132249a) || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132249a = C13624l.m24481a(C13624l.m24479a(a));
        }
        return C58029j.f132249a;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] b = TTNetInit.getTTNetDepend().mo37264b();
        if (b != null) {
            if (b.length > 0) {
                linkedHashMap.put("first", b[0]);
            }
            if (b.length > 1) {
                linkedHashMap.put("second", b[1]);
            }
            if (b.length > 2) {
                linkedHashMap.put("third", b[2]);
            }
        }
        Map<String, String> f = TTNetInit.getTTNetDepend().mo37268f();
        if (TextUtils.isEmpty(f.get("httpdns")) || TextUtils.isEmpty(f.get("netlog")) || TextUtils.isEmpty(f.get("boe"))) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.put("httpdns", f.get("httpdns"));
        linkedHashMap.put("netlog", f.get("netlog"));
        linkedHashMap.put("boe", f.get("boe"));
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(final String str) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229243 */

            static {
                Covode.recordClassIndex(26832);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                TTNetInit.onClientIPChanged(str);
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onEffectiveConnectionTypeChanged(final int i) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C2291910 */

            static {
                Covode.recordClassIndex(26827);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigEtagChanged(final String str) {
        try {
            new RunnableC13596e() {
                /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229181 */

                static {
                    Covode.recordClassIndex(26826);
                }

                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                public final void run() {
                    try {
                        C22898a.m43150a(TTNetInit.getTTNetDepend().mo37259a()).f54078g = str;
                    } catch (Throwable unused) {
                    }
                }
            }.mo21860a();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigUpdated(final String str) {
        try {
            Logger.debug();
            new RunnableC13596e() {
                /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229287 */

                static {
                    Covode.recordClassIndex(26836);
                }

                @Override // com.bytedance.common.utility.p907b.RunnableC13596e
                public final void run() {
                    try {
                        C22954c.m43256a().f54287b.f54280c = "";
                        C22898a a = C22898a.m43150a(TTNetInit.getTTNetDepend().mo37259a());
                        String str = str;
                        boolean z = false;
                        if (!C13627m.m24498a(str)) {
                            try {
                                z = a.mo37237a(str, C22954c.EnumC22957a.TTCRONET, System.currentTimeMillis());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            int i = 102;
                            if (z) {
                                i = 101;
                            }
                            try {
                                new JSONObject().put("from", "cronet");
                                TTNetInit.getTTNetDepend();
                            } catch (Throwable unused) {
                            }
                            a.f54081j.sendEmptyMessage(i);
                        }
                        ClientKeyManager.m43224a().mo37257b(str);
                    } catch (Throwable unused2) {
                    }
                }
            }.mo21860a();
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(final String str) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229309 */

            static {
                Covode.recordClassIndex(26838);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onMultiNetworkStateChanged(final int i, final int i2) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C2292213 */

            static {
                Covode.recordClassIndex(26830);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(final ArrayList<String> arrayList, final String str) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229265 */

            static {
                Covode.recordClassIndex(26834);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                Context a;
                String str;
                String str2;
                String str3;
                String str4;
                C22904b.m43175a();
                ArrayList arrayList = arrayList;
                String str5 = str;
                if (arrayList != null && !arrayList.isEmpty() && (a = TTNetInit.getTTNetDepend().mo37259a()) != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str6 = (String) it.next();
                        try {
                            C22939a aVar = new C22939a();
                            aVar.f54228f = true;
                            aVar.f54229g = false;
                            C14758h hVar = new C14758h(str6);
                            hVar.mo23779a("tnc_src", "7");
                            String hVar2 = hVar.toString();
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            if (!TextUtils.isEmpty(str5)) {
                                hashMap2.put("x-tt-tnc-summary", str5);
                            }
                            String a2 = C22942c.m43245a(hVar2, hashMap2, hashMap, aVar);
                            if (!C13627m.m24498a(a2)) {
                                if ("success".equals(new JSONObject(a2).getString("message"))) {
                                    try {
                                        String str7 = "";
                                        if (hashMap.get("x-ss-etag") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-ss-etag")).get(0))) {
                                            str = str7;
                                        } else {
                                            str = (String) ((List) hashMap.get("x-ss-etag")).get(0);
                                        }
                                        if (hashMap.get("x-ss-canary") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-ss-canary")).get(0))) {
                                            str2 = str7;
                                        } else {
                                            str2 = (String) ((List) hashMap.get("x-ss-canary")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-config") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-config")).get(0))) {
                                            str3 = str7;
                                        } else {
                                            str3 = (String) ((List) hashMap.get("x-tt-tnc-config")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-abtest") == null || TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-abtest")).get(0))) {
                                            str4 = str7;
                                        } else {
                                            str4 = (String) ((List) hashMap.get("x-tt-tnc-abtest")).get(0);
                                        }
                                        if (hashMap.get("x-tt-tnc-control") != null && !TextUtils.isEmpty((CharSequence) ((List) hashMap.get("x-tt-tnc-control")).get(0))) {
                                            str7 = (String) ((List) hashMap.get("x-tt-tnc-control")).get(0);
                                        }
                                        C14659h.m26802a(a);
                                        C14659h.m26810a();
                                        Reflect.m24529on(C14659h.f35584c).call("notifyTNCConfigUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str7, a2).get();
                                        return;
                                    } catch (Throwable unused) {
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return C14731e.m26983a(str, hashMap);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onRTTOrThroughputEstimatesComputed(final int i, final int i2, final int i3) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C2292011 */

            static {
                Covode.recordClassIndex(26828);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(final String str, final String str2, final String str3) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229254 */

            static {
                Covode.recordClassIndex(26833);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                C22931b.m43215a().mo37252a(str, str2, str3);
                C14749b a = C14749b.m27031a();
                String str = str;
                String str2 = str2;
                String str3 = str3;
                if (a.f35946h != null && a.f35947i && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (!C14749b.f35936l && (a.f35940b == null || a.f35939a == null || a.f35943e == null)) {
                        throw new AssertionError();
                    } else if (!a.f35940b.equalsIgnoreCase(str) || !a.f35939a.equalsIgnoreCase(str2) || !a.f35943e.equalsIgnoreCase(str3)) {
                        SharedPreferences.Editor edit = C34822d.m71158a(a.f35946h, "ttnet_store_region", 0).edit();
                        if (!TextUtils.isEmpty(str)) {
                            a.f35940b = str;
                        }
                        a.f35939a = str2;
                        if (str3.equalsIgnoreCase("uid")) {
                            a.f35943e = "uid";
                            a.f35942d = str2;
                        } else if (str3.equalsIgnoreCase("did")) {
                            a.f35943e = "did";
                            a.f35941c = str2;
                        }
                        edit.putString("store_region", a.f35939a);
                        edit.putString("store_idc", a.f35940b);
                        edit.putString("store_region_src", a.f35943e);
                        edit.putString("store_region_did", a.f35941c);
                        edit.putString("store_region_uid", a.f35942d);
                        edit.apply();
                    }
                }
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onPacketLossComputed(final int i, final double d, final double d2, final double d3, final double d4) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C2292112 */

            static {
                Covode.recordClassIndex(26829);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(final String str, final String str2, final int i, final int i2, final int i3, final List<String> list, final String str3) {
        Logger.debug();
        new RunnableC13596e() {
            /* class com.bytedance.ttnet.p1701b.AbstractC22917a.C229298 */

            static {
                Covode.recordClassIndex(26837);
            }

            @Override // com.bytedance.common.utility.p907b.RunnableC13596e
            public final void run() {
                C22949a a = C22949a.m43251a();
                String str = str;
                int i = i;
                int i2 = i2;
                int i3 = i3;
                List list = list;
                String str2 = str3;
                C22950b bVar = a.f54255a.get(str);
                if (bVar != null) {
                    bVar.f54260e = new C22951c(i, i2, i3, list, str2);
                    bVar.f54259d.countDown();
                    a.f54255a.remove(str);
                }
            }
        }.mo21860a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, Exception exc) {
        Logger.debug();
        C14612a a = C14612a.m26716a();
        a.f35358a = str3;
        a.f35360c = j;
        a.f35361d = j;
        a.f35362e = j2;
        a.f35363f = j3;
        a.f35364g = j4;
        a.f35365h = j5;
        a.f35367j = j6;
        a.f35368k = j7;
        a.f35369l = j8;
        a.f35370m = j9;
        a.f35372o = j10;
        a.f35373p = z2;
        a.f35374q = j11;
        long j13 = j5 - j2;
        a.f35375r = j13;
        a.f35377t = j12;
        a.f35382y = str4;
        a.f35348B = str5;
        a.f35349C = str6;
        a.f35379v = 0;
        if (z) {
            C13627m.m24498a(str);
            C14731e.m26985a(j13, j2, str, str2, a);
            return;
        }
        C14731e.m26989a(str, exc);
        C14731e.m26986a(j13, j2, str, str2, a, exc);
    }
}
