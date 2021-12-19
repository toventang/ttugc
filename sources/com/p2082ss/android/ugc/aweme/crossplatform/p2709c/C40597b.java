package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2709c.C40603d;
import com.p2082ss.android.ugc.aweme.feed.C48017a;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b */
public final class C40597b {

    /* renamed from: a */
    public static final AbstractC89244h f95007a = C89250i.m154773a((AbstractC89171a) C40600c.f95016a);

    /* renamed from: b */
    public static final C40599b f95008b = new C40599b((byte) 0);

    /* renamed from: c */
    private final AbstractC89244h f95009c = C89250i.m154773a((AbstractC89171a) C40601d.f95017a);

    /* renamed from: d */
    private final ConcurrentHashMap<String, C40598a> f95010d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final Set<String> f95011e = C89047am.m154439b("rn_base_android", "fe_lynx_main_search_transfer");

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b$a */
    public static final class C40598a {

        /* renamed from: a */
        public long f95012a = 0;

        /* renamed from: b */
        public boolean f95013b = false;

        /* renamed from: c */
        public boolean f95014c = false;

        /* renamed from: d */
        public boolean f95015d = true;

        static {
            Covode.recordClassIndex(48438);
        }
    }

    /* renamed from: a */
    public final long mo69754a() {
        return ((Number) this.f95009c.getValue()).longValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b$b */
    public static final class C40599b {
        static {
            Covode.recordClassIndex(48439);
        }

        /* renamed from: a */
        public static C40597b m81953a() {
            return (C40597b) C40597b.f95007a.getValue();
        }

        private C40599b() {
        }

        public /* synthetic */ C40599b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b$c */
    static final class C40600c extends AbstractC89220m implements AbstractC89171a<C40597b> {

        /* renamed from: a */
        public static final C40600c f95016a = new C40600c();

        static {
            Covode.recordClassIndex(48440);
        }

        C40600c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40597b invoke() {
            return new C40597b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.b$d */
    static final class C40601d extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C40601d f95017a = new C40601d();

        static {
            Covode.recordClassIndex(48441);
        }

        C40601d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C48017a.f111238c);
        }
    }

    static {
        Covode.recordClassIndex(48437);
    }

    /* renamed from: a */
    public final C40598a mo69755a(String str) {
        C40598a aVar = this.f95010d.get(str);
        if (aVar != null) {
            return aVar;
        }
        C40598a aVar2 = new C40598a();
        this.f95010d.put(str, aVar2);
        return aVar2;
    }

    /* renamed from: b */
    public final boolean mo69758b(String str) {
        List<String> geckoChannelMonitorAllowList;
        C40603d.C40604a.m81964a();
        HybridMonitorConfig a = C40603d.m81955a();
        if (a == null || (geckoChannelMonitorAllowList = a.getGeckoChannelMonitorAllowList()) == null || geckoChannelMonitorAllowList.isEmpty()) {
            return this.f95011e.contains(str);
        }
        return geckoChannelMonitorAllowList.contains(str);
    }

    /* renamed from: a */
    public final void mo69756a(String str, boolean z, Throwable th) {
        String message;
        if (mo69758b(str)) {
            mo69755a(str).f95013b = z;
            C40603d a = C40603d.C40604a.m81964a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (!(th == null || (message = th.getMessage()) == null)) {
                jSONObject.put("exception_msg", message);
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_download_end_interval", currentTimeMillis - mo69754a());
            Long valueOf = Long.valueOf(mo69755a(str).f95012a);
            if (valueOf.longValue() > 0 && valueOf != null) {
                jSONObject2.put("download_interval", currentTimeMillis - valueOf.longValue());
            }
            a.m81959a((C40603d) "hybrid_monitor_gecko_event", "on_download", (String) jSONObject, jSONObject2);
        }
    }

    /* renamed from: b */
    public final void mo69757b(String str, boolean z, Throwable th) {
        String message;
        if (mo69758b(str)) {
            C40603d a = C40603d.C40604a.m81964a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_channel", str);
            jSONObject.put("success", String.valueOf(z));
            if (!(th == null || (message = th.getMessage()) == null)) {
                jSONObject.put("exception_msg", message);
            }
            JSONObject jSONObject2 = new JSONObject();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject2.put("cold_start_to_activate_end_interval", currentTimeMillis - mo69754a());
            Long valueOf = Long.valueOf(mo69755a(str).f95012a);
            if (valueOf.longValue() > 0 && valueOf != null) {
                jSONObject2.put("activate_interval", currentTimeMillis - valueOf.longValue());
            }
            a.m81959a((C40603d) "hybrid_monitor_gecko_event", "on_activate", (String) jSONObject, jSONObject2);
        }
    }
}
