package com.bytedance.sdk.bdlynx.p1677a.p1678a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.bdp.serviceapi.defaults.event.BdpEventService;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpHostInfo;
import com.bytedance.bdp.serviceapi.hostimpl.Info.BdpInfoService;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.C22588a;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.p2082ss.ugc.live.sdk.message.BuildConfig;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.a.b */
public final class C22591b {

    /* renamed from: c */
    public static final AbstractC89244h f53378c = C89250i.m154773a((AbstractC89171a) C22593b.f53384a);

    /* renamed from: d */
    public static final C22592a f53379d = new C22592a((byte) 0);

    /* renamed from: a */
    public final JSONObject f53380a;

    /* renamed from: b */
    public final String f53381b;

    /* renamed from: e */
    private final AbstractC89244h f53382e;

    /* renamed from: f */
    private C22607a f53383f;

    /* renamed from: b */
    private final BdpInfoService m42627b() {
        return (BdpInfoService) this.f53382e.getValue();
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.b$a */
    public static final class C22592a {
        static {
            Covode.recordClassIndex(26408);
        }

        private C22592a() {
        }

        public /* synthetic */ C22592a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.b$b */
    static final class C22593b extends AbstractC89220m implements AbstractC89171a<BdpEventService> {

        /* renamed from: a */
        public static final C22593b f53384a = new C22593b();

        static {
            Covode.recordClassIndex(26409);
        }

        C22593b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpEventService invoke() {
            return BdpManager.getInst().getService(BdpEventService.class);
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.b$c */
    static final class C22594c extends AbstractC89220m implements AbstractC89171a<BdpInfoService> {

        /* renamed from: a */
        public static final C22594c f53385a = new C22594c();

        static {
            Covode.recordClassIndex(26410);
        }

        C22594c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BdpInfoService invoke() {
            return BdpManager.getInst().getService(BdpInfoService.class);
        }
    }

    static {
        Covode.recordClassIndex(26407);
    }

    /* renamed from: a */
    public final void mo36871a() {
        C89219l.m154719c(this, "");
        try {
            ((BdpEventService) f53378c.getValue()).sendEventV3(this.f53381b, this.f53380a);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final C22591b mo36870a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        Iterator<String> keys = jSONObject.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            this.f53380a.put(next, jSONObject.get(next));
        }
        return this;
    }

    private C22591b(String str) {
        C89219l.m154719c(str, "");
        this.f53381b = str;
        this.f53383f = null;
        JSONObject jSONObject = new JSONObject();
        this.f53380a = jSONObject;
        this.f53382e = C89250i.m154773a((AbstractC89171a) C22594c.f53385a);
        BdpInfoService b = m42627b();
        C89219l.m154709a((Object) b, "");
        BdpHostInfo hostInfo = b.getHostInfo();
        C89219l.m154709a((Object) hostInfo, "");
        jSONObject.put("app_id", hostInfo.getAppId());
        BdpInfoService b2 = m42627b();
        C89219l.m154709a((Object) b2, "");
        BdpHostInfo hostInfo2 = b2.getHostInfo();
        C89219l.m154709a((Object) hostInfo2, "");
        jSONObject.put("app_version", hostInfo2.getVersionName());
        BdpInfoService b3 = m42627b();
        C89219l.m154709a((Object) b3, "");
        BdpHostInfo hostInfo3 = b3.getHostInfo();
        C89219l.m154709a((Object) hostInfo3, "");
        jSONObject.put("app_name", hostInfo3.getAppName());
        jSONObject.put("lynx_version", C22588a.f53373b);
        jSONObject.put("bdlynx_version", "1.0.0-rc.34.3-bugfix");
        jSONObject.put("core_js_version", BuildConfig.VERSION_NAME);
        jSONObject.put("bd_core_js_version", BuildConfig.VERSION_NAME);
        C22607a aVar = this.f53383f;
        if (aVar != null) {
            jSONObject.put("group_id", aVar.f53415b);
            jSONObject.put("card_id", aVar.f53416c);
            jSONObject.put("cli_version", aVar.f53414a);
        }
    }

    public /* synthetic */ C22591b(String str, byte b) {
        this(str);
    }

    /* renamed from: a */
    public final C22591b mo36869a(String str, Object obj) {
        C89219l.m154719c(str, "");
        if (obj != null) {
            this.f53380a.put(str, obj);
        }
        return this;
    }
}
