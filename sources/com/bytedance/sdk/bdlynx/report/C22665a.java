package com.bytedance.sdk.bdlynx.report;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14420a;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14421b;
import com.bytedance.p951d.p952a.p953a.p954a.p955a.C14422c;
import com.bytedance.sdk.bdlynx.p1677a.C22588a;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22589a;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22595c;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22599d;
import com.bytedance.sdk.bdlynx.p1684b.C22615a;
import com.bytedance.sdk.bdlynx.p1685c.C22624f;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.base.LLog;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.sdk.bdlynx.report.a */
public final class C22665a {

    /* renamed from: a */
    public static final C22665a f53533a = new C22665a();

    /* renamed from: b */
    private static final AbstractC89244h f53534b = C89250i.m154773a((AbstractC89171a) C22666a.f53535a);

    /* renamed from: a */
    private static BdpInfoService m42734a() {
        return (BdpInfoService) f53534b.getValue();
    }

    private C22665a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.a$a */
    static final class C22666a extends AbstractC89220m implements AbstractC89171a<BdpInfoService> {

        /* renamed from: a */
        public static final C22666a f53535a = new C22666a();

        static {
            Covode.recordClassIndex(26484);
        }

        C22666a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26483);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.a$b */
    public static final class RunnableC22667b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f53536a;

        /* renamed from: b */
        final /* synthetic */ String f53537b;

        /* renamed from: c */
        final /* synthetic */ String f53538c;

        static {
            Covode.recordClassIndex(26485);
        }

        public RunnableC22667b(String str, String str2, String str3) {
            this.f53536a = str;
            this.f53537b = str2;
            this.f53538c = str3;
        }

        public final void run() {
            byte[] bArr;
            String str = this.f53536a;
            String str2 = this.f53537b;
            String str3 = this.f53538c;
            JSONObject a = C22665a.m42735a(str);
            if (a != null) {
                C22599d.m42634b("BDLynxJsReporter", a.toString());
                JSONObject a2 = C22665a.m42736a(a, str2, str3);
                if (a2 != null) {
                    String b = C22589a.m42626a().mo36874b();
                    Application application = C22615a.f53428a;
                    if (application == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(b)) {
                        C89219l.m154719c("BDLynxJsReporter", "");
                        LLog.m56861c("BDLynx_".concat("BDLynxJsReporter"), "js report url not set");
                        return;
                    }
                    Map b2 = C89041ag.m154427b(C89387v.m154943a("Content-Type", "application/json"), C89387v.m154943a("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36"));
                    if (b == null) {
                        try {
                            C89219l.m154707a();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    C22668c cVar = C22668c.f53539a;
                    C89219l.m154719c(application, "");
                    C89219l.m154719c(b, "");
                    C89219l.m154719c(cVar, "");
                    C14421b bVar = new C14421b(C14420a.f34882b, b);
                    bVar.f34888b.put("Content-Type", "application/json");
                    String jSONObject = a2.toString();
                    if (jSONObject != null) {
                        bArr = jSONObject.getBytes(C89338d.f202990a);
                        C89219l.m154709a((Object) bArr, "");
                    } else {
                        bArr = null;
                    }
                    C22595c.m42632a(application, bVar, b2, bArr, cVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.report.a$c */
    static final class C22668c extends AbstractC89220m implements AbstractC89172b<C14422c, C89391z> {

        /* renamed from: a */
        public static final C22668c f53539a = new C22668c();

        static {
            Covode.recordClassIndex(26486);
        }

        C22668c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14422c cVar) {
            C89219l.m154719c(cVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    static JSONObject m42735a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static JSONObject m42736a(JSONObject jSONObject, String str, String str2) {
        boolean z;
        JSONObject jSONObject2;
        try {
            Object opt = jSONObject.opt("error");
            if (opt == null) {
                opt = new JSONObject();
            } else if (opt instanceof String) {
                try {
                    jSONObject2 = new JSONObject((String) opt);
                } catch (JSONException unused) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(StringSet.type, "INTERNAL_RUNTIME_ERROR");
                    jSONObject3.put("value", opt);
                    JSONArray put = new JSONArray().put(jSONObject3);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("values", put);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("exception", jSONObject4);
                    jSONObject2 = new JSONObject();
                    jSONObject2.put("sentry", jSONObject5);
                    jSONObject2.put("url", jSONObject.opt("url"));
                }
                opt = jSONObject2;
            }
            if (!(opt instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject6 = (JSONObject) opt;
            jSONObject6.put("bid", "bdlynx_core");
            jSONObject6.put("context", "{}");
            jSONObject6.put("ev_type", "jserr");
            jSONObject6.put("hostname", "");
            String optString = jSONObject6.optString("pid");
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jSONObject6.put("pid", "INTERNAL_ERROR");
            }
            jSONObject6.put("protocol", "file://");
            jSONObject6.put("sample_rate", "1");
            jSONObject6.put("slardar_session_id", C22624f.m42681a());
            BdpInfoService a = m42734a();
            C89219l.m154709a((Object) a, "");
            BdpHostInfo hostInfo = a.getHostInfo();
            C89219l.m154709a((Object) hostInfo, "");
            jSONObject6.put("slardar_web_id", hostInfo.getDeviceId());
            jSONObject6.put("timestamp", System.currentTimeMillis());
            JSONObject optJSONObject = jSONObject6.optJSONObject("sentry");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                jSONObject6.put("sentry", optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("tags");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
                optJSONObject.put("tags", optJSONObject2);
                optJSONObject2.put("jscrash", true);
            }
            optJSONObject2.put("app_type", "card");
            BdpInfoService a2 = m42734a();
            C89219l.m154709a((Object) a2, "");
            BdpHostInfo hostInfo2 = a2.getHostInfo();
            C89219l.m154709a((Object) hostInfo2, "");
            optJSONObject2.put("did", hostInfo2.getDeviceId());
            BdpInfoService a3 = m42734a();
            C89219l.m154709a((Object) a3, "");
            BdpHostInfo hostInfo3 = a3.getHostInfo();
            C89219l.m154709a((Object) hostInfo3, "");
            optJSONObject2.put("aid", hostInfo3.getAppId());
            BdpInfoService a4 = m42734a();
            C89219l.m154709a((Object) a4, "");
            BdpHostInfo hostInfo4 = a4.getHostInfo();
            C89219l.m154709a((Object) hostInfo4, "");
            optJSONObject2.put("app_name", hostInfo4.getAppName());
            optJSONObject2.put("group_id", str);
            optJSONObject2.put("card_id", str2);
            optJSONObject2.put("native_lynx_sdk_version", C22588a.f53373b);
            optJSONObject2.put("native_bdlynx_sdk_version", "1.0.0-rc.34.3-bugfix");
            optJSONObject2.put("system", "android");
            return (JSONObject) opt;
        } catch (JSONException unused2) {
            return null;
        }
    }
}
