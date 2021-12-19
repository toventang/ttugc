package com.bytedance.android.livesdk.container.p505c;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.jsbridge.C7038b;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.p504b.C8214a;
import com.bytedance.android.livesdk.container.p511h.AbstractC8249a;
import com.bytedance.android.livesdk.container.util.C8303d;
import com.bytedance.android.livesdk.container.util.C8306e;
import com.bytedance.android.livesdk.container.util.C8310g;
import com.bytedance.android.livesdk.container.util.C8311h;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxShareGroupSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveImportHostLynxJsb;
import com.bytedance.android.livesdk.lynx.AbstractC9352c;
import com.bytedance.android.livesdk.lynx.bridge.C9350c;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdk.lynx.p567a.C9339a;
import com.bytedance.android.livesdk.lynx.p568b.C9342a;
import com.bytedance.android.livesdk.lynx.p568b.p569a.C9344a;
import com.bytedance.android.livesdk.lynx.p570ui.C9379b;
import com.bytedance.android.livesdkapi.host.AbstractC11816k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16584o;
import com.bytedance.ies.bullet.service.base.p1163a.C16566a;
import com.bytedance.ies.bullet.service.base.p1163a.C16567b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.p1436j.p1437a.C20072c;
import com.bytedance.p1436j.p1437a.C20102f;
import com.bytedance.p1436j.p1437a.p1442e.C20098a;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.google.gson.C28022o;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.android.livesdk.container.c.b */
public final class C8223b extends AbstractC8221a {

    /* renamed from: j */
    public static final C8224a f20425j = new C8224a((byte) 0);

    /* renamed from: f */
    public LynxView f20426f;

    /* renamed from: g */
    public C9339a f20427g;

    /* renamed from: h */
    AbstractC16629c f20428h;

    /* renamed from: i */
    public int f20429i;

    /* renamed from: k */
    private AbstractC16582m f20430k;

    /* renamed from: l */
    private AbstractC16584o f20431l;

    /* renamed from: m */
    private C9350c f20432m;

    /* renamed from: n */
    private int f20433n;

    /* renamed from: com.bytedance.android.livesdk.container.c.b$a */
    public static final class C8224a {
        static {
            Covode.recordClassIndex(9049);
        }

        private C8224a() {
        }

        public /* synthetic */ C8224a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ View mo14496f() {
        return this.f20426f;
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: d */
    public final void mo14494d() {
        this.f20426f = m16352i();
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$c */
    static final class C8226c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C8223b f20435a;

        static {
            Covode.recordClassIndex(9051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8226c(C8223b bVar) {
            super(0);
            this.f20435a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f20435a.f20421c.getUrl();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$e */
    static final class C8230e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C8223b f20441a;

        static {
            Covode.recordClassIndex(9055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8230e(C8223b bVar) {
            super(0);
            this.f20441a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return this.f20441a.f20421c.getUrl();
        }
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: c */
    public final void mo14493c() {
        this.f20427g = new C9339a(new C8231f(this));
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: e */
    public final void mo14495e() {
        AbstractC16629c cVar = this.f20428h;
        if (cVar != null) {
            cVar.mo26411b();
        }
        super.mo14495e();
    }

    static {
        Covode.recordClassIndex(9048);
        ((AbstractC9352c) C6193a.m13435a(AbstractC9352c.class)).tryInitEnvIfNeeded();
        C28573r.m57143a(C8306e.C8307a.f20578a);
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14487a() {
        mo14493c();
        this.f20419a = mo14492b();
        C7038b bVar = this.f20419a;
        if (bVar != null) {
            mo14489a(bVar);
        }
        mo14494d();
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: b */
    public final C7038b mo14492b() {
        C9350c cVar = new C9350c(this.f20420b, new C8226c(this));
        cVar.f22826c = new C8225b(this);
        this.f20432m = cVar;
        C7038b a = C7038b.m14992a(this.f20420b, cVar);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: i */
    private final LynxView m16352i() {
        String str;
        String str2;
        Object obj;
        AbstractC16629c cVar;
        Map<String, ? extends Object> map;
        C89233z.C89238e eVar = new C89233z.C89238e();
        C20072c cVar2 = new C20072c((byte) 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new C20100b(TTLiveLynxBridgeModule.class, this.f20432m));
        cVar2.f47778n = linkedHashMap;
        cVar2.f47779o = C9379b.m17646a();
        cVar2.f47769e = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        cVar2.f47768d = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        String url = this.f20421c.getUrl();
        if (!EnableLynxShareGroupSetting.INSTANCE.getValue() || !(!C89361p.m154870a((CharSequence) url))) {
            C9342a.m17608a(url);
            str = "unspecified-" + this.f20422d;
        } else {
            Uri parse = Uri.parse(url);
            if (parse == null || (str = parse.getQueryParameter("business_type")) == null) {
                str = "unspecified-" + this.f20422d;
            }
        }
        C89219l.m154716b(str, "");
        View view = null;
        cVar2.f47765a = C28818l.m57691a(str, null, this.f20421c.getEnableCanvas());
        C9339a aVar = this.f20427g;
        if (aVar != null) {
            str2 = aVar.f22813a;
        } else {
            str2 = null;
        }
        C20098a a = C20098a.C20099a.m38059a(str2);
        if (!TextUtils.isEmpty(this.f20421c.getInitialData())) {
            a.mo33444a("initial_data", new JSONObject(this.f20421c.getInitialData()));
        }
        cVar2.f47780p = a;
        cVar2.mo33422a(new C8214a(this));
        eVar.element = (T) C9344a.f22819a.mo16227a(cVar2);
        cVar2.f47772h = new C8227d(url, this, eVar);
        C9339a aVar2 = this.f20427g;
        if (aVar2 == null || (map = aVar2.f22814b) == null) {
            obj = null;
        } else {
            obj = map.get("__globalProps");
        }
        if (!(obj instanceof Map)) {
            obj = null;
        }
        cVar2.mo33424a((Map) obj);
        AbstractC16582m mVar = this.f20430k;
        if (mVar == null) {
            C89219l.m154710a("serviceContext");
        }
        mVar.mo26324a().mo26344a(C20072c.class, cVar2);
        AbstractC16582m mVar2 = this.f20430k;
        if (mVar2 == null) {
            C89219l.m154710a("serviceContext");
        }
        C16567b bVar = new C16567b("live", mVar2);
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC16628b bVar2 = (AbstractC16628b) bVar.mo25790b_(AbstractC16628b.class);
        if (bVar2 != null) {
            cVar = bVar2.mo26387b(bVar);
        } else {
            cVar = null;
        }
        this.f20428h = cVar;
        C9342a.m17604a(currentTimeMillis);
        this.f20431l = bVar;
        C9350c cVar3 = this.f20432m;
        if (cVar3 != null) {
            cVar3.f22825b = this.f20428h;
        }
        AbstractC16629c cVar4 = this.f20428h;
        if (cVar4 != null) {
            view = cVar4.mo26408a();
        }
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        LynxView lynxView = (LynxView) view;
        T t = eVar.element;
        if (t != null) {
            t.mo16229a(lynxView);
        }
        return lynxView;
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14489a(C7038b bVar) {
        C89219l.m154721d(bVar, "");
        this.f20430k = new C16566a(this.f20420b, C8303d.m16458a());
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$b */
    static final class C8225b extends AbstractC89220m implements AbstractC89172b<TTLiveLynxBridgeModule, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8223b f20434a;

        static {
            Covode.recordClassIndex(9050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8225b(C8223b bVar) {
            super(1);
            this.f20434a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
            C18364w wVar;
            C7038b bVar;
            C18364w wVar2;
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule2 = tTLiveLynxBridgeModule;
            C89219l.m154721d(tTLiveLynxBridgeModule2, "");
            C8223b bVar2 = this.f20434a;
            Activity activity = bVar2.f20420b;
            if (LiveImportHostLynxJsb.INSTANCE.getValue()) {
                C9350c cVar = new C9350c(activity, new C8230e(bVar2));
                cVar.mo16234a(tTLiveLynxBridgeModule2);
                cVar.f22825b = bVar2.f20428h;
                AbstractC11816k kVar = (AbstractC11816k) C6193a.m13435a(AbstractC11816k.class);
                C7038b bVar3 = bVar2.f20419a;
                if (bVar3 != null) {
                    wVar = bVar3.f17644b;
                } else {
                    wVar = null;
                }
                Object a = kVar.mo18883a(wVar, activity, bVar2.f20428h, bVar2.f20426f, cVar);
                if (!(!(a instanceof C18364w) || (bVar = bVar2.f20419a) == null || (wVar2 = bVar.f17644b) == null)) {
                    wVar2.mo29402a("host", (C18364w) a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$d */
    public static final class C8227d extends C20102f {

        /* renamed from: a */
        final /* synthetic */ String f20436a;

        /* renamed from: b */
        final /* synthetic */ C8223b f20437b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f20438c;

        static {
            Covode.recordClassIndex(9052);
        }

        @Override // com.bytedance.p1436j.p1437a.C20102f
        /* renamed from: a */
        public final void mo14501a(C16610ap apVar) {
            int i;
            Object obj;
            Map<String, ? extends Object> map;
            C9339a aVar;
            C89219l.m154721d(apVar, "");
            C8223b bVar = this.f20437b;
            if (apVar.f39757q == EnumC16609ao.GECKO) {
                i = 1;
            } else {
                i = 0;
            }
            bVar.f20429i = i;
            C7038b bVar2 = this.f20437b.f20419a;
            if (!(bVar2 == null || (aVar = this.f20437b.f20427g) == null)) {
                aVar.mo16224a(this.f20436a, bVar2, new AbstractC89172b<C28022o, C89391z>(this) {
                    /* class com.bytedance.android.livesdk.container.p505c.C8223b.C8227d.C82281 */

                    /* renamed from: a */
                    final /* synthetic */ C8227d f20439a;

                    static {
                        Covode.recordClassIndex(9053);
                    }

                    {
                        this.f20439a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C28022o oVar) {
                        C28022o oVar2 = oVar;
                        C89219l.m154721d(oVar2, "");
                        oVar2.mo46800a("offline", Integer.valueOf(this.f20439a.f20437b.f20429i));
                        return C89391z.f203057a;
                    }
                }, new AbstractC89172b<Map<String, ? extends Object>, C89391z>(this) {
                    /* class com.bytedance.android.livesdk.container.p505c.C8223b.C8227d.C82292 */

                    /* renamed from: a */
                    final /* synthetic */ C8227d f20440a;

                    static {
                        Covode.recordClassIndex(9054);
                    }

                    {
                        this.f20440a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Map<String, ? extends Object> map) {
                        Map<String, ? extends Object> map2 = map;
                        C89219l.m154721d(map2, "");
                        LynxView lynxView = this.f20440a.f20437b.f20426f;
                        if (lynxView != null) {
                            lynxView.updateData(map2);
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            LynxView lynxView = this.f20437b.f20426f;
            if (lynxView != null) {
                C9339a aVar2 = this.f20437b.f20427g;
                Object obj2 = null;
                if (aVar2 == null || (map = aVar2.f22814b) == null) {
                    obj = null;
                } else {
                    obj = map.get("__globalProps");
                }
                if (obj instanceof Map) {
                    obj2 = obj;
                }
                lynxView.setGlobalProps((Map) obj2);
            }
            C9342a.m17603a(this.f20437b.f20429i, this.f20437b.mo14500a(new C89378p[0]));
        }

        C8227d(String str, C8223b bVar, C89233z.C89238e eVar) {
            this.f20436a = str;
            this.f20437b = bVar;
            this.f20438c = eVar;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo14500a(C89378p<String, ? extends Object>... pVarArr) {
        C89219l.m154721d(pVarArr, "");
        C89378p[] pVarArr2 = new C89378p[5];
        boolean z = false;
        pVarArr2[0] = C89387v.m154943a("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.f20433n < 2) {
            z = true;
        }
        pVarArr2[1] = C89387v.m154943a("isFirstTime", Boolean.valueOf(z));
        pVarArr2[2] = C89387v.m154943a("offline", Integer.valueOf(this.f20429i));
        pVarArr2[3] = C89387v.m154943a("template_url", this.f20421c.getUrl());
        Uri parse = Uri.parse(this.f20421c.getUrl());
        C89219l.m154716b(parse, "");
        pVarArr2[4] = C89387v.m154943a("path", parse.getPath());
        Map<String, Object> b = C89041ag.m154427b(pVarArr2);
        C89041ag.m154425a(b, pVarArr);
        return b;
    }

    /* renamed from: com.bytedance.android.livesdk.container.c.b$f */
    static final class C8231f extends AbstractC89220m implements AbstractC89172b<C28022o, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8223b f20442a;

        static {
            Covode.recordClassIndex(9056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8231f(C8223b bVar) {
            super(1);
            this.f20442a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C28022o oVar) {
            int i;
            Configuration configuration;
            Uri uri;
            C28022o oVar2 = oVar;
            C89219l.m154721d(oVar2, "");
            Resources resources = this.f20442a.f20420b.getResources();
            C89219l.m154716b(resources, "");
            if (resources.getConfiguration().orientation == 2) {
                i = 1;
            } else {
                i = 0;
            }
            oVar2.mo46800a("orientation", Integer.valueOf(i));
            oVar2.mo46801a("initTimestamp", String.valueOf(System.currentTimeMillis()));
            Resources resources2 = this.f20442a.f20420b.getResources();
            if (resources2 != null) {
                configuration = resources2.getConfiguration();
            } else {
                configuration = null;
            }
            oVar2.mo46801a("theme", C8311h.m16462a(configuration));
            oVar2.mo46801a("containerID", this.f20442a.f20422d);
            String originUri = this.f20442a.f20421c.getOriginUri();
            if (originUri == null || originUri.length() == 0) {
                uri = Uri.parse(this.f20442a.f20421c.getUrl());
            } else {
                uri = Uri.parse(this.f20442a.f20421c.getOriginUri());
            }
            C89219l.m154716b(uri, "");
            oVar2.mo46797a("queryItems", C8310g.m16461a(uri));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.container.p505c.AbstractC8221a
    /* renamed from: a */
    public final void mo14490a(String str) {
        C89219l.m154721d(str, "");
        this.f20433n++;
        AbstractC16629c cVar = this.f20428h;
        if (cVar != null) {
            cVar.mo26409a(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8223b(Activity activity, HybridConfig hybridConfig, String str, AbstractC8249a aVar) {
        super(activity, hybridConfig, str, aVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(hybridConfig, "");
        C89219l.m154721d(str, "");
    }
}
