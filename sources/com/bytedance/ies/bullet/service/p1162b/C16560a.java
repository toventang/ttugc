package com.bytedance.ies.bullet.service.p1162b;

import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16589aa;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16602ak;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16637a;
import com.bytedance.ies.bullet.service.base.p1168e.C16641e;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.b.a */
public final class C16560a extends C16616a implements AbstractC16654o {

    /* renamed from: f */
    public static final Map<String, Integer> f39685f = C89041ag.m154421a(new C89378p("web", 0), new C89378p("rn", 2), new C89378p("lynx", 3), new C89378p("unknown", -1));

    /* renamed from: g */
    public static final C16561a f39686g = new C16561a((byte) 0);

    /* renamed from: a */
    public final AbstractC12009a f39687a;

    /* renamed from: b */
    public final AbstractC16589aa f39688b;

    /* renamed from: c */
    public final C16602ak f39689c;

    /* renamed from: h */
    private JSONObject f39690h;

    /* renamed from: com.bytedance.ies.bullet.service.b.a$a */
    public static final class C16561a {
        static {
            Covode.recordClassIndex(18997);
        }

        private C16561a() {
        }

        public /* synthetic */ C16561a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16654o
    /* renamed from: b */
    public final C16602ak mo26321b() {
        return this.f39689c;
    }

    static {
        Covode.recordClassIndex(18996);
    }

    /* renamed from: com.bytedance.ies.bullet.service.b.a$c */
    static final class CallableC16563c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C16560a f39692a;

        /* renamed from: b */
        final /* synthetic */ C16607an f39693b;

        static {
            Covode.recordClassIndex(18999);
        }

        CallableC16563c(C16560a aVar, C16607an anVar) {
            this.f39692a = aVar;
            this.f39693b = anVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            String str2;
            JSONObject jSONObject;
            String str3;
            boolean z;
            boolean z2;
            String str4;
            JSONObject jSONObject2;
            try {
                String str5 = this.f39693b.f39741f;
                int i = 1;
                Boolean bool = null;
                if (str5 == null) {
                    AbstractC16640d dVar = this.f39693b.f39738c;
                    if (dVar != null) {
                        int i2 = C16641e.f39804a[dVar.mo26402c().ordinal()];
                        if (i2 == 1) {
                            str5 = "lynx";
                        } else if (i2 == 2) {
                            str5 = "web";
                        } else if (i2 != 3) {
                            str5 = "unknown";
                        } else {
                            str5 = "rn";
                        }
                    } else {
                        str5 = null;
                    }
                }
                C16560a aVar = this.f39692a;
                JSONObject jSONObject3 = this.f39693b.f39742g;
                AbstractC16640d dVar2 = this.f39693b.f39738c;
                if (dVar2 != null) {
                    str = dVar2.mo26401b();
                } else {
                    str = null;
                }
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                jSONObject3.put("_bid", aVar.f39774d);
                C16602ak akVar = aVar.f39689c;
                if (akVar != null) {
                    str2 = akVar.f39725c;
                } else {
                    str2 = null;
                }
                jSONObject3.put("_container", str2);
                jSONObject3.put("_bullet_sdk_version", "2.1.4-rc.8-tiktok");
                jSONObject3.put("hybrid_platform", str5);
                jSONObject3.put("_full_url", str);
                C16602ak akVar2 = aVar.f39689c;
                if (!(akVar2 == null || (jSONObject2 = akVar2.f39726d) == null)) {
                    C16560a.m30738a(jSONObject3, jSONObject2);
                }
                JSONObject jSONObject4 = this.f39693b.f39745j;
                C16602ak akVar3 = this.f39692a.f39689c;
                if (akVar3 != null) {
                    jSONObject = akVar3.f39727e;
                } else {
                    jSONObject = null;
                }
                JSONObject a = C16560a.m30737a(jSONObject4, jSONObject, str5);
                C16602ak akVar4 = this.f39692a.f39689c;
                String str6 = "";
                if (akVar4 != null) {
                    String str7 = akVar4.f39723a;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    str3 = akVar4.f39724b;
                } else {
                    str3 = null;
                }
                String str8 = this.f39693b.f39736a;
                boolean z3 = false;
                if (str8 == null || str8.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str3 = this.f39693b.f39736a;
                }
                String str9 = this.f39693b.f39737b;
                if (str9 == null || str9.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    str6 = this.f39693b.f39737b;
                }
                AbstractC16640d dVar3 = this.f39693b.f39738c;
                if (dVar3 == null || (str4 = dVar3.mo26400a()) == null) {
                    str4 = this.f39693b.f39740e;
                }
                AbstractC16640d dVar4 = this.f39693b.f39738c;
                if (dVar4 != null) {
                    if (!(dVar4 instanceof C16637a)) {
                        dVar4 = null;
                    }
                    C16637a aVar2 = (C16637a) dVar4;
                    if (aVar2 != null) {
                        AbstractC16559e<String, Object> b = C16622e.C16623a.m30858a().mo26341b(aVar2.f39801a);
                        if (b != null) {
                            bool = b.getBoolean("res_memory");
                        }
                        if (!C89219l.m154714a((Object) bool, (Object) true)) {
                            i = 0;
                        }
                        jSONObject3.put("res_memory", i);
                    }
                }
                C11919c.C11920a e = new C11919c.C11920a(this.f39693b.f39739d).mo19131a(jSONObject3).mo19135b(this.f39693b.f39743h).mo19129a(this.f39692a.f39687a).mo19137c(this.f39693b.f39746k).mo19134b(str6).mo19130a(str4).mo19139e(a);
                Boolean bool2 = this.f39693b.f39744i;
                if (bool2 != null) {
                    z3 = bool2.booleanValue();
                }
                C11919c.C11920a a2 = e.mo19132a(z3);
                if (str3 != null) {
                    a2.mo19136c(str3);
                }
                HybridMonitor.getInstance().customReport(a2.mo19133a());
            } catch (Throwable unused) {
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16654o
    /* renamed from: a */
    public final void mo26319a(C16607an anVar) {
        C89219l.m154719c(anVar, "");
        C1731i.m5635a((Callable) new CallableC16563c(this, anVar));
    }

    @Override // com.bytedance.ies.bullet.service.base.p1164b.C16616a, com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c
    /* renamed from: b */
    public final void mo26322b(String str) {
        C89219l.m154719c(str, "");
        super.mo26322b(str);
        HybridMonitor.getInstance().setCustomReportMonitor(this.f39687a);
    }

    public C16560a(AbstractC16589aa aaVar, C16602ak akVar) {
        C89219l.m154719c(aaVar, "");
        this.f39688b = aaVar;
        this.f39689c = akVar;
        if (akVar != null) {
            this.f39690h = akVar.f39727e;
        }
        this.f39687a = new C16562b(this);
    }

    /* renamed from: a */
    public static void m30738a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(jSONObject2, "");
        Iterator<String> keys = jSONObject2.keys();
        C89219l.m154709a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    /* renamed from: a */
    public static JSONObject m30737a(JSONObject jSONObject, JSONObject jSONObject2, Object obj) {
        JSONObject jSONObject3;
        Iterator<String> keys;
        Iterator<String> keys2;
        if (jSONObject2 == null) {
            jSONObject3 = new JSONObject();
        } else {
            jSONObject3 = jSONObject2;
        }
        if (!(jSONObject == null || (keys2 = jSONObject.keys()) == null)) {
            while (keys2.hasNext()) {
                String next = keys2.next();
                jSONObject3.put(next, jSONObject.opt(next));
            }
        }
        if (!(jSONObject2 == null || (keys = jSONObject2.keys()) == null)) {
            while (keys.hasNext()) {
                String next2 = keys.next();
                jSONObject3.put(next2, jSONObject2.opt(next2));
            }
        }
        if (obj != null) {
            jSONObject3.put("platform", f39685f.get(obj));
        }
        return jSONObject3;
    }

    /* renamed from: com.bytedance.ies.bullet.service.b.a$b */
    static final class C16562b implements AbstractC12009a {

        /* renamed from: a */
        final /* synthetic */ C16560a f39691a;

        static {
            Covode.recordClassIndex(18998);
        }

        C16562b(C16560a aVar) {
            this.f39691a = aVar;
        }

        @Override // com.bytedance.android.monitor.webview.AbstractC12009a
        /* renamed from: a */
        public final void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f39691a.f39688b.mo26351a(str, i, jSONObject, jSONObject2);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.AbstractC16654o
    /* renamed from: a */
    public final void mo26320a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f39688b.mo26351a(str, i, jSONObject, jSONObject2);
    }
}
