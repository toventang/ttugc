package com.bytedance.android.livesdk.container.p504b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.container.p505c.C8223b;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.container.util.C8303d;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdk.lynx.p568b.C9342a;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.LynxPerfMetric;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.container.b.a */
public final class C8214a extends AbstractC28838o {

    /* renamed from: a */
    public final C8223b f20394a;

    /* renamed from: b */
    private long f20395b;

    /* renamed from: c */
    private long f20396c;

    /* renamed from: d */
    private long f20397d;

    /* renamed from: e */
    private long f20398e;

    /* renamed from: f */
    private boolean f20399f;

    /* renamed from: g */
    private LynxPerfMetric f20400g;

    /* renamed from: h */
    private LynxPerfMetric f20401h;

    static {
        Covode.recordClassIndex(9039);
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        super.mo14467a();
        this.f20399f = true;
        this.f20398e = System.currentTimeMillis();
        AbstractC8249a aVar = this.f20394a.f20423e;
        if (aVar != null) {
            aVar.mo14598d();
        }
        C9342a.m17602a(0, this.f20398e - this.f20396c, this.f20394a.mo14500a(new C89378p[0]));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        super.mo14470b();
        long currentTimeMillis = System.currentTimeMillis();
        this.f20397d = currentTimeMillis;
        long j = currentTimeMillis - this.f20396c;
        C8223b bVar = this.f20394a;
        C89378p<String, ? extends Object>[] pVarArr = new C89378p[2];
        pVarArr[0] = C89387v.m154943a("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", this.f20395b);
        jSONObject2.put("pageStart", this.f20396c);
        jSONObject2.put("loadEnd", this.f20398e);
        jSONObject2.put("firstScreen", this.f20397d);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = this.f20401h;
        if (lynxPerfMetric != null) {
            jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        }
        pVarArr[1] = C89387v.m154943a("event", jSONObject);
        C9342a.m17612c(j, bVar.mo14500a(pVarArr));
    }

    public C8214a(C8223b bVar) {
        C89219l.m154721d(bVar, "");
        this.f20394a = bVar;
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo14473c(String str) {
        super.mo14473c(str);
        C9342a.m17611b(this.f20394a.mo14500a(C89387v.m154943a("err_log", str)));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        super.mo14468a(lynxPerfMetric);
        this.f20401h = lynxPerfMetric;
        C8223b bVar = this.f20394a;
        Map a = C89041ag.m154421a(C89387v.m154943a("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), C89387v.m154943a("perf", lynxPerfMetric));
        C89219l.m154721d("perf", "");
        C89219l.m154721d(a, "");
        C7038b bVar2 = bVar.f20419a;
        if (bVar2 != null) {
            bVar2.mo13332a("perf", a);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        if (!C8303d.m16458a() || !LiveForceLynxFallback.INSTANCE.getValue()) {
            super.mo14469a(str);
            this.f20396c = System.currentTimeMillis();
            C9342a.m17605a(System.currentTimeMillis() - this.f20395b, this.f20394a.mo14500a(new C89378p[0]));
            return;
        }
        AbstractC8249a aVar = this.f20394a.f20423e;
        if (aVar != null) {
            aVar.mo14599e();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.mo14471b(lynxPerfMetric);
        this.f20400g = lynxPerfMetric;
        C8223b bVar = this.f20394a;
        C89378p<String, ? extends Object>[] pVarArr = new C89378p[2];
        pVarArr[0] = C89387v.m154943a("ev_type", "performance");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("initStart", this.f20395b);
        jSONObject3.put("pageStart", this.f20396c);
        jSONObject3.put("loadEnd", this.f20398e);
        jSONObject3.put("firstScreen", this.f20397d);
        jSONObject2.put("navigation", jSONObject3);
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        jSONObject2.put("performance", jSONObject);
        pVarArr[1] = C89387v.m154943a("event", jSONObject2);
        C9342a.m17609a(bVar.mo14500a(pVarArr));
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final String mo14474d(String str) {
        int i;
        if (TextUtils.isEmpty(str) || str == null || !C89361p.m154874b(str, "app://", false)) {
            if (!TextUtils.isEmpty(str)) {
                String str2 = null;
                if (((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18881a((WebView) null, str) != null) {
                    if (str != null) {
                        i = C89361p.m154888a((CharSequence) str, "tiktok_live_lynx", 0, false, 6);
                    } else {
                        i = -1;
                    }
                    AbstractC2953a a = C6193a.m13435a(AbstractC11816k.class);
                    C89219l.m154716b(a, "");
                    String b = ((AbstractC11816k) a).mo18887b();
                    if (b != null && i > 0) {
                        StringBuilder append = new StringBuilder("file://").append(b).append('/');
                        if (str != null) {
                            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                            str2 = str.substring(i + 16);
                            C89219l.m154716b(str2, "");
                        }
                        return append.append(str2).toString();
                    }
                }
            }
            return super.mo14474d(str);
        }
        String substring = str.substring(6);
        C89219l.m154716b(substring, "");
        return "res:///".concat(String.valueOf(substring));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14472b(String str) {
        String str2;
        super.mo14472b(str);
        this.f20398e = System.currentTimeMillis();
        this.f20399f = true;
        AbstractC8249a aVar = this.f20394a.f20423e;
        if (aVar != null) {
            aVar.mo14599e();
        }
        C9342a.EnumC9343a aVar2 = C9342a.EnumC9343a.LOAD_FAILED;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C9342a.m17606a(aVar2, str2);
        C9342a.m17602a(1, this.f20398e - this.f20396c, this.f20394a.mo14500a(C89387v.m154943a("err_msg", str)));
        C9342a.m17610b(System.currentTimeMillis() - this.f20396c, this.f20394a.mo14500a(C89387v.m154943a("err_msg", str), C89387v.m154943a(StringSet.type, 0)));
        C9342a.EnumC9343a aVar3 = C9342a.EnumC9343a.LOAD_FAILED;
        if (str == null) {
            str = "";
        }
        C9342a.m17607a(aVar3, str, this.f20394a.f20421c.getUrl());
    }
}
