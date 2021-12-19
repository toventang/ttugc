package com.bytedance.android.livesdk.lynx.p570ui;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.C6952c;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6953a;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxShareGroupSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveImportHostLynxJsb;
import com.bytedance.android.livesdk.lynx.AbstractC9341b;
import com.bytedance.android.livesdk.lynx.AbstractC9352c;
import com.bytedance.android.livesdk.lynx.AbstractC9353d;
import com.bytedance.android.livesdk.lynx.bridge.C9350c;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdk.lynx.p567a.C9339a;
import com.bytedance.android.livesdk.lynx.p568b.C9342a;
import com.bytedance.android.livesdk.lynx.p568b.p569a.C9344a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16566a;
import com.bytedance.ies.bullet.service.base.p1163a.C16567b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.p1436j.p1437a.C20072c;
import com.bytedance.p1436j.p1437a.C20102f;
import com.bytedance.p1436j.p1437a.p1442e.C20098a;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.google.gson.C28022o;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.lynx.ui.c */
public final class C9431c implements AbstractC9341b {

    /* renamed from: r */
    public static final C9434a f22881r = new C9434a((byte) 0);

    /* renamed from: a */
    public int f22882a;

    /* renamed from: b */
    public final LynxView f22883b;

    /* renamed from: c */
    public C9339a f22884c;

    /* renamed from: d */
    public final C7038b f22885d;

    /* renamed from: e */
    public String f22886e;

    /* renamed from: f */
    public boolean f22887f;

    /* renamed from: g */
    public LynxPerfMetric f22888g;

    /* renamed from: h */
    public LynxPerfMetric f22889h;

    /* renamed from: i */
    public long f22890i;

    /* renamed from: j */
    public long f22891j;

    /* renamed from: k */
    public long f22892k;

    /* renamed from: l */
    public long f22893l;

    /* renamed from: m */
    AbstractC16629c f22894m;

    /* renamed from: n */
    public final boolean f22895n;

    /* renamed from: o */
    public final String f22896o;

    /* renamed from: p */
    public String f22897p;

    /* renamed from: q */
    public AbstractC9353d f22898q;

    /* renamed from: s */
    private int f22899s;

    /* renamed from: t */
    private String f22900t;

    /* renamed from: u */
    private final AbstractC16582m f22901u;

    /* renamed from: v */
    private AbstractC16584o f22902v;

    /* renamed from: w */
    private String f22903w;

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$a */
    public static final class C9434a {
        static {
            Covode.recordClassIndex(10942);
        }

        private C9434a() {
        }

        public /* synthetic */ C9434a(byte b) {
            this();
        }

        /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$a$a */
        static final class C9435a implements C28573r.AbstractC28574a {

            /* renamed from: a */
            public static final C9435a f22910a = new C9435a();

            static {
                Covode.recordClassIndex(10943);
            }

            C9435a() {
            }

            @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
            /* renamed from: a */
            public final Typeface mo14647a(String str, int i) {
                if (C89219l.m154714a((Object) str, (Object) "live_font")) {
                    return ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostTypeface(i);
                }
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$b */
    final class C9436b extends AbstractC28838o {
        static {
            Covode.recordClassIndex(10944);
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: c */
        public final void mo16280c() {
            super.mo16280c();
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14467a() {
            super.mo14467a();
            C9431c.this.f22887f = true;
            C9431c.this.f22893l = System.currentTimeMillis();
            AbstractC9353d dVar = C9431c.this.f22898q;
            if (dVar != null) {
                dVar.mo13230a(C9431c.this.f22883b);
            }
            C9342a.m17602a(0, C9431c.this.f22893l - C9431c.this.f22891j, C9431c.this.mo16279a(new C89378p[0]));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14470b() {
            super.mo14470b();
            C9431c.this.f22892k = System.currentTimeMillis();
            long j = C9431c.this.f22892k - C9431c.this.f22891j;
            C9431c cVar = C9431c.this;
            C89378p<String, ? extends Object>[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("ev_type", "performance");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("initStart", C9431c.this.f22890i);
            jSONObject2.put("pageStart", C9431c.this.f22891j);
            jSONObject2.put("loadEnd", C9431c.this.f22893l);
            jSONObject2.put("firstScreen", C9431c.this.f22892k);
            jSONObject.put("navigation", jSONObject2);
            LynxPerfMetric lynxPerfMetric = C9431c.this.f22889h;
            if (lynxPerfMetric != null) {
                jSONObject.put("performance", lynxPerfMetric.toJSONObject());
            }
            pVarArr[1] = C89387v.m154943a("event", jSONObject);
            C9342a.m17612c(j, cVar.mo16279a(pVarArr));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9436b() {
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: c */
        public final void mo14473c(String str) {
            super.mo14473c(str);
            C9342a.m17611b(C9431c.this.mo16279a(C89387v.m154943a("err_log", str)));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
            super.mo14468a(lynxPerfMetric);
            C9431c.this.f22889h = lynxPerfMetric;
            C9431c.this.mo13267a("perf", C89041ag.m154421a(C89387v.m154943a("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), C89387v.m154943a("perf", lynxPerfMetric)));
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14469a(String str) {
            if (!C9431c.this.f22895n || !LiveForceLynxFallback.INSTANCE.getValue()) {
                super.mo14469a(str);
                C9431c.this.f22891j = System.currentTimeMillis();
                C9342a.m17605a(System.currentTimeMillis() - C9431c.this.f22890i, C9431c.this.mo16279a(new C89378p[0]));
                return;
            }
            AbstractC9353d dVar = C9431c.this.f22898q;
            if (dVar != null) {
                dVar.mo13229a();
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
            JSONObject jSONObject;
            super.mo14471b(lynxPerfMetric);
            C9431c.this.f22888g = lynxPerfMetric;
            C9431c cVar = C9431c.this;
            C89378p<String, ? extends Object>[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("ev_type", "performance");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("initStart", C9431c.this.f22890i);
            jSONObject3.put("pageStart", C9431c.this.f22891j);
            jSONObject3.put("loadEnd", C9431c.this.f22893l);
            jSONObject3.put("firstScreen", C9431c.this.f22892k);
            jSONObject2.put("navigation", jSONObject3);
            if (lynxPerfMetric != null) {
                jSONObject = lynxPerfMetric.toJSONObject();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("performance", jSONObject);
            pVarArr[1] = C89387v.m154943a("event", jSONObject2);
            C9342a.m17609a(cVar.mo16279a(pVarArr));
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

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14472b(java.lang.String r11) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.p570ui.C9431c.C9436b.mo14472b(java.lang.String):void");
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9338a
    /* renamed from: a */
    public final View mo16220a() {
        return this.f22883b;
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9338a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC6953a mo16222b() {
        return this.f22885d;
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9341b
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ View mo16225d() {
        return this.f22883b;
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$d */
    static final class C9440d extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C9431c f22918a;

        static {
            Covode.recordClassIndex(10948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9440d(C9431c cVar) {
            super(0);
            this.f22918a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.f22918a.f22886e;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$e */
    static final class C9441e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C9431c f22919a;

        static {
            Covode.recordClassIndex(10949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9441e(C9431c cVar) {
            super(0);
            this.f22919a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.f22919a.f22886e;
        }
    }

    static {
        Covode.recordClassIndex(10939);
        C28573r.m57143a(C9434a.C9435a.f22910a);
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9338a
    /* renamed from: c */
    public final void mo16223c() {
        AbstractC16629c cVar = this.f22894m;
        if (cVar != null) {
            cVar.mo26411b();
        }
        this.f22885d.mo13238b();
        Object obj = null;
        this.f22898q = null;
        int i = !this.f22887f ? 1 : 0;
        C89378p<String, ? extends Object>[] pVarArr = new C89378p[2];
        pVarArr[0] = C89387v.m154943a("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", this.f22890i);
        jSONObject2.put("pageStart", this.f22891j);
        jSONObject2.put("loadEnd", this.f22893l);
        jSONObject2.put("firstScreen", this.f22892k);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = this.f22888g;
        if (lynxPerfMetric != null) {
            obj = lynxPerfMetric.toJSONObject();
        }
        jSONObject.put("performance", obj);
        pVarArr[1] = C89387v.m154943a("event", jSONObject);
        Map<String, Object> a = mo16279a(pVarArr);
        C89219l.m154721d(a, "");
        C89219l.m154716b(LynxEnv.m56706b(), "");
        a.put("lynx_version", "2.1.5-rc.22-cxxshared");
        C3868c.m9491a("ttlive_lynx_overview_service", i, a);
    }

    @Override // com.bytedance.android.livesdk.lynx.AbstractC9338a
    /* renamed from: a */
    public final void mo16221a(String str) {
        C89219l.m154721d(str, "");
        m17703d(str);
    }

    /* renamed from: d */
    private final void m17703d(String str) {
        this.f22890i = System.currentTimeMillis();
        if (str.length() > 0 && str != null) {
            m17702c(str);
            this.f22899s++;
            AbstractC16629c cVar = this.f22894m;
            if (cVar != null) {
                cVar.mo26409a(str);
            }
        }
    }

    /* renamed from: c */
    private void m17702c(String str) {
        Object obj;
        String str2 = "";
        this.f22886e = str;
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, str2);
            obj = C89379q.m157068constructorimpl(parse.getPath());
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        String str3 = (String) obj;
        if (str3 != null) {
            str2 = str3;
        }
        this.f22900t = str2;
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$c */
    public static final class C9437c extends C20102f {

        /* renamed from: a */
        final /* synthetic */ C9431c f22912a;

        /* renamed from: b */
        final /* synthetic */ C9350c f22913b;

        /* renamed from: c */
        final /* synthetic */ Integer f22914c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f22915d;

        static {
            Covode.recordClassIndex(10945);
        }

        @Override // com.bytedance.p1436j.p1437a.C20102f
        /* renamed from: a */
        public final void mo14501a(C16610ap apVar) {
            int i;
            C89219l.m154721d(apVar, "");
            C9431c cVar = this.f22912a;
            if (apVar.f39757q == EnumC16609ao.GECKO) {
                i = 1;
            } else {
                i = 0;
            }
            cVar.f22882a = i;
            this.f22912a.f22884c.mo16224a(this.f22912a.f22886e, this.f22912a.f22885d, new AbstractC89172b<C28022o, C89391z>(this) {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9431c.C9437c.C94381 */

                /* renamed from: a */
                final /* synthetic */ C9437c f22916a;

                static {
                    Covode.recordClassIndex(10946);
                }

                {
                    this.f22916a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C28022o oVar) {
                    C28022o oVar2 = oVar;
                    C89219l.m154721d(oVar2, "");
                    oVar2.mo46800a("offline", Integer.valueOf(this.f22916a.f22912a.f22882a));
                    return C89391z.f203057a;
                }
            }, new AbstractC89172b<Map<String, ? extends Object>, C89391z>(this) {
                /* class com.bytedance.android.livesdk.lynx.p570ui.C9431c.C9437c.C94392 */

                /* renamed from: a */
                final /* synthetic */ C9437c f22917a;

                static {
                    Covode.recordClassIndex(10947);
                }

                {
                    this.f22917a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(Map<String, ? extends Object> map) {
                    Map<String, ? extends Object> map2 = map;
                    C89219l.m154721d(map2, "");
                    this.f22917a.f22912a.f22883b.updateData(map2);
                    return C89391z.f203057a;
                }
            });
            LynxView lynxView = this.f22912a.f22883b;
            Object obj = this.f22912a.f22884c.f22814b.get("__globalProps");
            if (!(obj instanceof Map)) {
                obj = null;
            }
            lynxView.setGlobalProps((Map) obj);
            C9342a.m17603a(this.f22912a.f22882a, this.f22912a.mo16279a(new C89378p[0]));
        }

        C9437c(C9431c cVar, C9350c cVar2, Integer num, C89233z.C89238e eVar) {
            this.f22912a = cVar;
            this.f22913b = cVar2;
            this.f22914c = num;
            this.f22915d = eVar;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo16279a(C89378p<String, ? extends Object>... pVarArr) {
        C89378p[] pVarArr2 = new C89378p[5];
        boolean z = false;
        pVarArr2[0] = C89387v.m154943a("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.f22899s < 2) {
            z = true;
        }
        pVarArr2[1] = C89387v.m154943a("isFirstTime", Boolean.valueOf(z));
        pVarArr2[2] = C89387v.m154943a("offline", Integer.valueOf(this.f22882a));
        pVarArr2[3] = C89387v.m154943a("template_url", this.f22886e);
        pVarArr2[4] = C89387v.m154943a("path", this.f22900t);
        Map<String, Object> b = C89041ag.m154427b(pVarArr2);
        C89041ag.m154425a(b, pVarArr);
        return b;
    }

    /* renamed from: b */
    public static C28022o m17701b(String str) {
        Long l;
        User owner;
        FollowInfo followInfo;
        User owner2;
        String valueOf;
        String str2;
        C28022o oVar = new C28022o();
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                oVar.mo46801a(t, parse.getQueryParameter(t));
            }
            String str3 = "0";
            if (!oVar.mo46802b("room_id")) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                    str2 = str3;
                }
                oVar.mo46801a("room_id", str2);
            }
            if (!oVar.mo46802b("user_id")) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                oVar.mo46801a("user_id", String.valueOf(b.mo13161c()));
            }
            if (!oVar.mo46802b("anchor_id")) {
                Room room2 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (!(room2 == null || (owner2 = room2.getOwner()) == null || (valueOf = String.valueOf(owner2.getId())) == null)) {
                    str3 = valueOf;
                }
                oVar.mo46801a("anchor_id", str3);
            }
            if (!oVar.mo46802b("follow_status")) {
                Room room3 = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                    l = null;
                } else {
                    l = Long.valueOf(followInfo.getFollowStatus());
                }
                oVar.mo46800a("follow_status", l);
            }
            C11870f fVar = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar, "");
            EnterRoomLinkSession a = fVar.mo19010a();
            C89219l.m154716b(a, "");
            EnterRoomConfig.RoomsData roomsData = a.f28391b.f28233c;
            if (!oVar.mo46802b("enter_from_merge")) {
                oVar.mo46801a("enter_from_merge", roomsData.f28293J);
            }
            if (!oVar.mo46802b("enter_method")) {
                oVar.mo46801a("enter_method", roomsData.f28295L);
            }
            if (!oVar.mo46802b("action_type")) {
                oVar.mo46801a("action_type", roomsData.f28296M);
            }
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        return oVar;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.AbstractC7033a
    /* renamed from: a */
    public final <T> void mo13267a(String str, T t) {
        this.f22885d.mo13332a(str, t);
    }

    private C9431c(final Activity activity, final String str, Integer num, String str2, String str3, AbstractC9353d dVar, boolean z, String str4) {
        Configuration configuration;
        final String str5;
        int i;
        String str6;
        String str7;
        AbstractC16629c cVar;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        this.f22896o = str2;
        this.f22897p = str3;
        this.f22898q = dVar;
        this.f22903w = str4;
        this.f22900t = "";
        this.f22886e = "";
        AbstractC2953a a = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a, "");
        boolean isLocalTest = ((IHostContext) a).isLocalTest();
        this.f22895n = isLocalTest;
        if (TextUtils.isEmpty(this.f22897p)) {
            this.f22897p = C6952c.m14838b();
        }
        m17702c(str);
        ((AbstractC9352c) C6193a.m13435a(AbstractC9352c.class)).tryInitEnvIfNeeded();
        Resources resources = activity.getResources();
        View view = null;
        if (resources != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration == null || (configuration.uiMode & 48) != 32) {
            str5 = "light";
        } else {
            str5 = "dark";
        }
        this.f22884c = new C9339a(new AbstractC89172b<C28022o, C89391z>(this) {
            /* class com.bytedance.android.livesdk.lynx.p570ui.C9431c.C94321 */

            /* renamed from: a */
            final /* synthetic */ C9431c f22904a;

            static {
                Covode.recordClassIndex(10940);
            }

            {
                this.f22904a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C28022o oVar) {
                int i;
                String str;
                C28022o oVar2 = oVar;
                C89219l.m154721d(oVar2, "");
                Resources resources = activity.getResources();
                C89219l.m154716b(resources, "");
                if (resources.getConfiguration().orientation == 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                oVar2.mo46800a("orientation", Integer.valueOf(i));
                oVar2.mo46801a("initTimestamp", String.valueOf(System.currentTimeMillis()));
                oVar2.mo46801a("theme", str5);
                oVar2.mo46801a("containerID", this.f22904a.f22897p);
                String str2 = this.f22904a.f22896o;
                if (str2 == null || C89361p.m154870a((CharSequence) str2)) {
                    str = str;
                } else {
                    str = this.f22904a.f22896o;
                }
                oVar2.mo46797a("queryItems", C9431c.m17701b(str));
                return C89391z.f203057a;
            }
        });
        C9350c cVar2 = new C9350c(activity, new C9441e(this));
        cVar2.f22826c = new AbstractC89172b<TTLiveLynxBridgeModule, C89391z>(this) {
            /* class com.bytedance.android.livesdk.lynx.p570ui.C9431c.C94332 */

            /* renamed from: a */
            final /* synthetic */ C9431c f22908a;

            static {
                Covode.recordClassIndex(10941);
            }

            {
                this.f22908a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
                TTLiveLynxBridgeModule tTLiveLynxBridgeModule2 = tTLiveLynxBridgeModule;
                C89219l.m154721d(tTLiveLynxBridgeModule2, "");
                C9431c cVar = this.f22908a;
                Activity activity = activity;
                if (LiveImportHostLynxJsb.INSTANCE.getValue()) {
                    C9350c cVar2 = new C9350c(activity, new C9440d(cVar));
                    cVar2.mo16234a(tTLiveLynxBridgeModule2);
                    cVar2.f22825b = cVar.f22894m;
                    Object a = ((AbstractC11816k) C6193a.m13435a(AbstractC11816k.class)).mo18883a(cVar.f22885d.f17644b, activity, cVar.f22894m, cVar.f22883b, cVar2);
                    if (a instanceof C18364w) {
                        cVar.f22885d.f17644b.mo29402a("host", (C18364w) a);
                    }
                }
                return C89391z.f203057a;
            }
        };
        C7038b a2 = C7038b.m14992a(activity, cVar2);
        C89219l.m154716b(a2, "");
        this.f22885d = a2;
        C16566a aVar = new C16566a(activity, isLocalTest);
        this.f22901u = aVar;
        C89233z.C89238e eVar = new C89233z.C89238e();
        C20072c cVar3 = new C20072c((byte) 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new C20100b(TTLiveLynxBridgeModule.class, cVar2));
        cVar3.f47778n = linkedHashMap;
        cVar3.f47779o = C9379b.m17646a();
        if (num == null || num.intValue() <= 0) {
            Resources a3 = C3966y.m9655a();
            C89219l.m154716b(a3, "");
            i = a3.getDisplayMetrics().widthPixels;
        } else {
            i = num.intValue();
        }
        cVar3.f47769e = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(i, 1073741824));
        cVar3.f47768d = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        if (!EnableLynxShareGroupSetting.INSTANCE.getValue() || !(true ^ C89361p.m154870a((CharSequence) this.f22886e))) {
            C9342a.m17608a(this.f22886e);
            str6 = "unspecified-" + this.f22897p;
        } else {
            Uri parse = Uri.parse(this.f22886e);
            if (parse == null || (str6 = parse.getQueryParameter("business_type")) == null) {
                str6 = "unspecified-" + this.f22897p;
            }
        }
        C89219l.m154716b(str6, "");
        Uri parse2 = Uri.parse(str2);
        if (parse2 != null) {
            str7 = parse2.getQueryParameter("enable_canvas");
        } else {
            str7 = null;
        }
        cVar3.f47765a = C28818l.m57691a(str6, null, C89219l.m154714a((Object) "1", (Object) str7));
        C20098a a4 = C20098a.C20099a.m38059a(this.f22884c.f22813a);
        if (!TextUtils.isEmpty(this.f22903w)) {
            String str8 = this.f22903w;
            if (str8 == null) {
                C89219l.m154715b();
            }
            a4.mo33444a("initial_data", new JSONObject(str8));
        }
        cVar3.f47780p = a4;
        cVar3.mo33422a(new C9436b());
        eVar.element = (T) C9344a.f22819a.mo16227a(cVar3);
        cVar3.f47772h = new C9437c(this, cVar2, num, eVar);
        Object obj = this.f22884c.f22814b.get("__globalProps");
        cVar3.mo33424a((Map) (!(obj instanceof Map) ? null : obj));
        aVar.mo26324a().mo26344a(C20072c.class, cVar3);
        C16567b bVar = new C16567b("live", aVar);
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC16628b bVar2 = (AbstractC16628b) bVar.mo25790b_(AbstractC16628b.class);
        if (bVar2 != null) {
            cVar = bVar2.mo26387b(bVar);
        } else {
            cVar = null;
        }
        this.f22894m = cVar;
        C9342a.m17604a(currentTimeMillis);
        this.f22902v = bVar;
        cVar2.f22825b = this.f22894m;
        AbstractC16629c cVar4 = this.f22894m;
        view = cVar4 != null ? cVar4.mo26408a() : view;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        LynxView lynxView = (LynxView) view;
        T t = eVar.element;
        if (t != null) {
            t.mo16229a(lynxView);
        }
        this.f22883b = lynxView;
        if (z) {
            m17703d(this.f22886e);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9431c(android.app.Activity r10, java.lang.String r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, com.bytedance.android.livesdk.lynx.AbstractC9353d r15, boolean r16, java.lang.String r17, int r18) {
        /*
            r9 = this;
            r1 = r18
            r2 = r11
            r7 = r16
            r3 = r12
            r8 = r17
            r4 = r13
            r0 = r1 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0019
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0019:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x001e
            r4 = r5
        L_0x001e:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0034
        L_0x0022:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0028
            r0 = 0
            r7 = 0
        L_0x0028:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002d
            r8 = 0
        L_0x002d:
            r0 = r9
            r1 = r10
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0034:
            r5 = r14
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.p570ui.C9431c.<init>(android.app.Activity, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.bytedance.android.livesdk.lynx.d, boolean, java.lang.String, int):void");
    }
}
