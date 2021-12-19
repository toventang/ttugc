package com.p2082ss.android.ugc.aweme.p2340at;

import com.bytedance.apm.C12290b;
import com.bytedance.apm.p786n.C12556c;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.C21520c;
import com.bytedance.services.slardar.config.AbstractC22715a;
import com.bytedance.services.slardar.config.IConfigManager;
import com.p2082ss.android.common.applog.HandlerThreadC29808t;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.experiment.C46986gs;
import com.p2082ss.android.ugc.aweme.p2340at.C33966j;
import com.p2082ss.android.ugc.aweme.power.C63304d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.at.i */
public final class C33964i implements C12616b.AbstractC12622c, C12616b.AbstractC12623d, AbstractC22715a {

    /* renamed from: d */
    public static final C33965a f80327d = new C33965a((byte) 0);

    /* renamed from: i */
    private static volatile boolean f80328i;

    /* renamed from: a */
    public long f80329a = -1;

    /* renamed from: b */
    public double f80330b = -1.0d;

    /* renamed from: c */
    public HashMap<String, String> f80331c = new HashMap<>();

    /* renamed from: e */
    private boolean f80332e;

    /* renamed from: f */
    private String f80333f;

    /* renamed from: g */
    private JSONObject f80334g;

    /* renamed from: h */
    private boolean f80335h;

    static {
        Covode.recordClassIndex(40890);
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: a */
    public final void mo20180a(JSONObject jSONObject, boolean z) {
    }

    /* renamed from: com.ss.android.ugc.aweme.at.i$a */
    public static final class C33965a {
        static {
            Covode.recordClassIndex(40891);
        }

        private C33965a() {
        }

        public /* synthetic */ C33965a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m69557a(String str) {
            C89219l.m154721d(str, "");
            if (C89219l.m154714a((Object) str, (Object) "system_launch") || C89219l.m154714a((Object) str, (Object) "system_launch_1_minute") || C89219l.m154714a((Object) str, (Object) "system_launch_1_minute_feed") || C89219l.m154714a((Object) str, (Object) "system_launch_2_minute") || C89219l.m154714a((Object) str, (Object) "system_launch_2_minute_feed")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private final void m69551a() {
        this.f80331c.clear();
        this.f80329a = -1;
        this.f80330b = -1.0d;
        this.f80334g = null;
    }

    @Override // com.bytedance.services.slardar.config.AbstractC22715a
    /* renamed from: d */
    public final void mo20038d() {
        f80328i = true;
        ((IConfigManager) C21520c.m40424a(IConfigManager.class)).unregisterConfigListener(this);
        if (this.f80334g != null) {
            m69552b();
        }
    }

    /* renamed from: b */
    private final void m69552b() {
        String str;
        String str2 = this.f80333f;
        C89219l.m154721d(str2, "");
        if (!C12556c.m22586a("fps", str2) || this.f80329a <= 0 || this.f80330b <= 0.0d || this.f80334g == null) {
            m69551a();
            return;
        }
        HashMap<String, String> hashMap = this.f80331c;
        C63304d a = C63304d.m114803a();
        C89219l.m154716b(a, "");
        if (a.f143686a) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("is_battery_saver", str);
        String str3 = this.f80333f;
        double d = this.f80330b;
        long j = this.f80329a;
        JSONObject jSONObject = this.f80334g;
        HashMap<String, String> hashMap2 = this.f80331c;
        C89219l.m154721d(str3, "");
        C89219l.m154721d(hashMap2, "");
        C39163s sVar = new C39163s();
        if (hashMap2.size() > 0) {
            for (String str4 : hashMap2.keySet()) {
                sVar.mo67941a(str4, hashMap2.get(str4));
            }
        }
        HandlerThreadC29808t.m60042a().mo52082b(new C33966j.RunnableC33967a(sVar, str3, j, d, jSONObject));
        m69551a();
    }

    @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12623d
    /* renamed from: a */
    public final void mo20436a(double d) {
        this.f80330b = d;
    }

    public C33964i(String str) {
        C89219l.m154721d(str, "");
        this.f80333f = str;
        this.f80332e = false;
    }

    @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12622c
    /* renamed from: a */
    public final void mo20435a(JSONObject jSONObject) {
        String str;
        this.f80334g = jSONObject;
        if (!f80328i && C46986gs.m90270f() && !this.f80335h && C33965a.m69557a(this.f80333f)) {
            this.f80335h = true;
            ((IConfigManager) C21520c.m40424a(IConfigManager.class)).registerConfigListener(this);
        }
        boolean a = C33965a.m69557a(this.f80333f);
        if (a) {
            HashMap<String, String> hashMap = this.f80331c;
            C63304d a2 = C63304d.m114803a();
            C89219l.m154716b(a2, "");
            if (a2.f143686a) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_battery_saver", str);
            String str2 = this.f80333f;
            double d = this.f80330b;
            long j = this.f80329a;
            JSONObject jSONObject2 = this.f80334g;
            HashMap<String, String> hashMap2 = this.f80331c;
            C89219l.m154721d(str2, "");
            C39163s sVar = new C39163s();
            if (hashMap2 != null) {
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    sVar.mo67941a(entry.getKey(), entry.getValue());
                }
            }
            C33966j.m69558a(sVar, str2, j, d, jSONObject2);
            JSONObject a3 = sVar.mo67942a();
            JSONObject jSONObject3 = new JSONObject();
            Object remove = a3.remove("ui_scene");
            if (remove != null) {
                jSONObject3.put("ui_scene", remove);
            }
            Object remove2 = a3.remove("is_battery_saver");
            if (remove2 != null) {
                jSONObject3.put("is_battery_saver", remove2);
            }
            C12290b.m22066a("system_launch_ui_sample_report", jSONObject3, a3, (JSONObject) null);
        }
        if (!C46986gs.m90270f() || !a || f80328i) {
            m69552b();
        }
    }
}
