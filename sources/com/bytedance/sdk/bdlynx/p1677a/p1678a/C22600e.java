package com.bytedance.sdk.bdlynx.p1677a.p1678a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.monitor.BdpHybridMonitorService;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.C22588a;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.bytedance.sdk.bdlynx.p1677a.p1683f.C22613a;
import com.p2082ss.ugc.live.sdk.message.BuildConfig;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.sdk.bdlynx.a.a.e */
public final class C22600e {

    /* renamed from: a */
    static final AbstractC89244h f53397a = C89250i.m154773a((AbstractC89171a) C22601a.f53399a);

    /* renamed from: b */
    public static final C22600e f53398b = new C22600e();

    private C22600e() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.e$a */
    static final class C22601a extends AbstractC89220m implements AbstractC89171a<BdpHybridMonitorService> {

        /* renamed from: a */
        public static final C22601a f53399a = new C22601a();

        static {
            Covode.recordClassIndex(26417);
        }

        C22601a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpHybridMonitorService invoke() {
            return BdpManager.getInst().getService(BdpHybridMonitorService.class);
        }
    }

    static {
        Covode.recordClassIndex(26416);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.e$b */
    public static final class RunnableC22602b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f53400a;

        /* renamed from: b */
        final /* synthetic */ String f53401b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f53402c;

        /* renamed from: d */
        final /* synthetic */ C22607a f53403d;

        /* renamed from: e */
        final /* synthetic */ JSONObject f53404e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f53405f = null;

        static {
            Covode.recordClassIndex(26418);
        }

        public RunnableC22602b(String str, String str2, JSONObject jSONObject, C22607a aVar, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.f53400a = str;
            this.f53401b = str2;
            this.f53402c = jSONObject;
            this.f53403d = aVar;
            this.f53404e = jSONObject2;
        }

        public final void run() {
            BdpHybridMonitorService bdpHybridMonitorService = (BdpHybridMonitorService) C22600e.f53397a.getValue();
            if (bdpHybridMonitorService != null) {
                String str = this.f53400a;
                if (str == null) {
                    str = "bdlynx://";
                }
                String str2 = this.f53401b;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bid", "");
                jSONObject.put("pid", "");
                jSONObject.put("ev_type", "custom");
                jSONObject.put("url", this.f53400a);
                jSONObject.put("host", "");
                jSONObject.put("path", "");
                jSONObject.put("platform", 3);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = this.f53402c;
                if (jSONObject3 != null) {
                    C22613a.m42644a(jSONObject2, jSONObject3);
                }
                jSONObject2.put("sdk_type", "bdLynx");
                jSONObject2.put("core_js_version", BuildConfig.VERSION_NAME);
                jSONObject2.put("bd_core_js_version", "0.1.0");
                jSONObject2.put("lynx_version", C22588a.f53373b);
                jSONObject2.put("bdlynx_version", "1.0.0-rc.34.3-bugfix");
                C22607a aVar = this.f53403d;
                if (aVar != null) {
                    jSONObject2.put("group_id", aVar.f53415b);
                    jSONObject2.put("card_id", aVar.f53416c);
                }
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = this.f53404e;
                if (jSONObject5 != null) {
                    C22613a.m42644a(jSONObject4, jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                JSONObject jSONObject7 = this.f53405f;
                if (jSONObject7 != null) {
                    C22613a.m42644a(jSONObject6, jSONObject7);
                }
                jSONObject6.put("event_name", this.f53401b);
                bdpHybridMonitorService.hybridMonitorEvent(str, str2, jSONObject, jSONObject2, jSONObject4, jSONObject6, 3);
            }
        }
    }
}
