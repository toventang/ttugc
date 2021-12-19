package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12036f;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.y */
public final class C34354y extends AbstractC34303ad implements AbstractC34344q {

    /* renamed from: g */
    private final AbstractC89244h f81216g = C89250i.m154774a(EnumC89331m.NONE, new C34355a(this));

    /* renamed from: h */
    private String f81217h;

    /* renamed from: i */
    private long f81218i;

    /* renamed from: j */
    private long f81219j;

    /* renamed from: k */
    private long f81220k;

    /* renamed from: l */
    private long f81221l;

    /* renamed from: m */
    private long f81222m;

    /* renamed from: n */
    private long f81223n;

    /* renamed from: o */
    private long f81224o;

    /* renamed from: p */
    private long f81225p;

    static {
        Covode.recordClassIndex(41298);
    }

    /* renamed from: c */
    private AbstractC12021c m70296c() {
        return (AbstractC12021c) this.f81216g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: j */
    public final void mo60791j() {
        this.f81219j = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.y$a */
    static final class C34355a extends AbstractC89220m implements AbstractC89171a<AbstractC12021c> {

        /* renamed from: a */
        final /* synthetic */ C34354y f81226a;

        /* renamed from: com.ss.android.ugc.aweme.ax.a.y$a$b */
        public final /* synthetic */ class C34357b implements AbstractC12009a {

            /* renamed from: a */
            private final /* synthetic */ AbstractC89188r f81227a;

            static {
                Covode.recordClassIndex(41301);
            }

            public C34357b(AbstractC89188r rVar) {
                this.f81227a = rVar;
            }

            @Override // com.bytedance.android.monitor.webview.AbstractC12009a
            /* renamed from: a */
            public final /* synthetic */ void mo13268a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                C89219l.m154716b(this.f81227a.mo8774a(str, Integer.valueOf(i), jSONObject, jSONObject2), "");
            }
        }

        static {
            Covode.recordClassIndex(41299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34355a(C34354y yVar) {
            super(0);
            this.f81226a = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC12021c invoke() {
            AbstractC12021c cVar = C12044i.f28862a;
            AbstractC12021c.C12022a d = cVar.mo19228d();
            d.f28775g = "HybridMonitor";
            d.f28793y = "mt";
            d.f28770b = C12036f.m21317a();
            d.mo19254a(new C34357b(new C34356a(this.f81226a)));
            return cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ax.a.y$a$a */
        static final /* synthetic */ class C34356a extends C89217j implements AbstractC89188r<String, Integer, JSONObject, JSONObject, C89391z> {
            static {
                Covode.recordClassIndex(41300);
            }

            C34356a(C34354y yVar) {
                super(4, yVar, C34354y.class, "monitorStatusAndDuration", "monitorStatusAndDuration(Ljava/lang/String;Ljava/lang/Integer;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89188r
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C89391z mo8774a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
                ((AbstractC34303ad) this.receiver).mo60743a(str, num, jSONObject, jSONObject2);
                return C89391z.f203057a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60792k() {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34354y.mo60792k():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: a */
    public final void mo60775a(C34308b bVar, C34320c cVar) {
        C89219l.m154721d(bVar, "");
        C34351w q = mo60749q();
        JSONObject jSONObject = new JSONObject();
        C34322e.m70198a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            C34322e.m70198a(jSONObject, cVar.getFormatData());
        }
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_fetch_api_error", q, jSONObject, null, 24);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34293a, com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: a */
    public final void mo60718a(String str, boolean z) {
        C89219l.m154721d(str, "");
        super.mo60718a(str, z);
        this.f81218i = System.currentTimeMillis();
        C34350v a = mo60740a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", "load_url");
        AbstractC34303ad.m70177a(this, "hybrid_app_monitor_load_url_event", a, jSONObject, null, 24);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34354y(Uri uri, C34324g gVar, Map<String, String> map) {
        super(uri, gVar, map);
        C89219l.m154721d(uri, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(map, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34303ad
    /* renamed from: a */
    public final void mo60742a(String str, AbstractC34348t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(tVar, "");
        try {
            m70295a(tVar, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            mo60741a(e, tVar.mo60803b(), "rn");
        }
    }

    /* renamed from: a */
    private final void m70295a(AbstractC34348t tVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str2;
        AbstractC12021c c = m70296c();
        String b = tVar.mo60803b();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put(StringSet.type, "rn");
        if (mo60748p() == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        C34322e.m70198a(jSONObject, tVar.getFormatData());
        C34350v r = mo60750r();
        if (r != null) {
            C34322e.m70198a(jSONObject, r.getFormatData());
        }
        String jSONObject4 = jSONObject.toString();
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject2 != null) {
            C34322e.m70198a(jSONObject5, jSONObject2);
        }
        String jSONObject6 = jSONObject5.toString();
        JSONObject jSONObject7 = new JSONObject();
        if (jSONObject3 != null) {
            C34322e.m70198a(jSONObject7, jSONObject3);
        }
        c.mo19231a(null, b, str, jSONObject4, jSONObject6, jSONObject7.toString());
        m70296c().mo19251a((WebView) null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s
    /* renamed from: a */
    public final void mo60779a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C34350v a = mo60740a();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("trigger", str2);
        if (jSONObject != null) {
            C34322e.m70198a(jSONObject4, jSONObject);
        }
        mo60742a(str, a, jSONObject4, jSONObject2, jSONObject3);
    }
}
