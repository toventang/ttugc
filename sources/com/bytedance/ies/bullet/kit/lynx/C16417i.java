package com.bytedance.ies.bullet.kit.lynx;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.lynx.api.AbstractC16380d;
import com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule;
import com.bytedance.ies.bullet.kit.lynx.model.C16431a;
import com.bytedance.ies.bullet.kit.lynx.model.C16447d;
import com.bytedance.ies.bullet.kit.lynx.model.C16448e;
import com.bytedance.ies.bullet.kit.lynx.p1153b.C16389b;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16406a;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16407b;
import com.bytedance.ies.bullet.kit.lynx.p1154c.AbstractC16408c;
import com.bytedance.ies.bullet.kit.lynx.p1155d.C16410a;
import com.bytedance.ies.bullet.kit.p1148a.C16342f;
import com.bytedance.ies.bullet.kit.p1148a.C16362m;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.lynx_adapter_impl.C16533a;
import com.bytedance.ies.bullet.lynx_adapter_impl.C16536b;
import com.bytedance.ies.bullet.lynx_adapter_impl.C16549d;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.C16257i;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1130a.C16149b;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16204e;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16214m;
import com.bytedance.ies.bullet.p1129c.p1132c.C16221q;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16187m;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.AbstractC16249c;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16251e;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.C17022c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.AbstractC16597ag;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.AbstractC16699y;
import com.bytedance.ies.bullet.service.base.C16565a;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.EnumC16609ao;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16582m;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16629c;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.bullet.service.base.p1168e.C16637a;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16658a;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.web.AbstractC16679f;
import com.bytedance.ies.bullet.service.p1161a.AbstractC16559e;
import com.bytedance.ies.bullet.service.p1172f.p1173a.C16852d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.C16746t;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.AbstractC17608c;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.C17611f;
import com.bytedance.p1436j.p1437a.C20068b;
import com.bytedance.p1436j.p1437a.C20072c;
import com.bytedance.p1436j.p1437a.p1442e.C20100b;
import com.bytedance.p1436j.p1437a.p1442e.C20101c;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.C28463a;
import com.lynx.tasm.navigator.AbstractC28831b;
import com.lynx.tasm.navigator.AbstractC28837g;
import com.lynx.tasm.navigator.C28832c;
import com.lynx.tasm.navigator.C28833d;
import com.p2082ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.xml.transform.Transformer;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4610e.C89145b;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.kit.lynx.i */
public final class C16417i extends AbstractC17026c<LynxView> implements AbstractC16387b, AbstractC28831b {

    /* renamed from: A */
    private final AbstractC89244h f39425A;

    /* renamed from: B */
    private long f39426B;

    /* renamed from: C */
    private long f39427C;

    /* renamed from: j */
    public final List<AbstractC16370a> f39428j = new ArrayList();

    /* renamed from: k */
    public Uri f39429k;

    /* renamed from: l */
    public volatile byte[] f39430l;

    /* renamed from: m */
    public Uri f39431m;

    /* renamed from: n */
    public long f39432n;

    /* renamed from: o */
    long f39433o;

    /* renamed from: p */
    long f39434p;

    /* renamed from: q */
    long f39435q;

    /* renamed from: r */
    public long f39436r;

    /* renamed from: s */
    long f39437s;

    /* renamed from: t */
    boolean f39438t;

    /* renamed from: u */
    private final List<AbstractC16406a> f39439u = new ArrayList();

    /* renamed from: v */
    private final List<AbstractC16407b> f39440v = new ArrayList();

    /* renamed from: w */
    private Map<String, ? extends Object> f39441w;

    /* renamed from: x */
    private AbstractC16629c f39442x;

    /* renamed from: y */
    private final C16418a f39443y = new C16418a(this);

    /* renamed from: z */
    private final Map<String, Object> f39444z = new LinkedHashMap();

    static {
        Covode.recordClassIndex(18720);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: c */
    public final void mo25800c(List<String> list, AbstractC16253f fVar) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: p_ */
    public final Uri mo25780p_() {
        return this.f39429k;
    }

    @Override // com.lynx.tasm.navigator.AbstractC28831b
    /* renamed from: a */
    public final void mo26057a(C28833d dVar, AbstractC28837g gVar) {
        String str = "";
        C89219l.m154719c(gVar, str);
        if (dVar == null) {
            try {
                C89219l.m154707a();
            } catch (Exception e) {
                AbstractC16576j.C16578b.m30778a(this, "create lynxview failed with e:" + String.valueOf(e.getMessage()), null, null, 6);
                return;
            }
        }
        String str2 = dVar.f68075b;
        if (str2 == null) {
            C89219l.m154707a();
        }
        if (this.f38994i.mo25832c(C16658a.class) != null) {
            AbstractC16582m g = mo25792g();
            Object c = this.f38994i.mo25832c(C16658a.class);
            if (c == null) {
                C89219l.m154707a();
            }
            g.mo26326a(C16658a.class, c);
        }
        AbstractC16204e s_ = mo25807s_();
        if (s_ == null) {
            C89219l.m154707a();
        }
        AbstractC16405c a = m30466a(s_);
        if (a == null) {
            C89219l.m154707a();
        }
        AbstractC16408c f = a.mo26037f(this.f38994i);
        C89219l.m154707a();
        C16852d a2 = f.mo26039a();
        if (a2 == null) {
            C89219l.m154707a();
        }
        IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) mo25790b_(IResourceLoaderService.class);
        if (iResourceLoaderService != null) {
            C16667j jVar = new C16667j();
            C16658a aVar = (C16658a) this.f38994i.mo25832c(C16658a.class);
            int i = 0;
            if (aVar == null) {
                aVar = new C16658a(false);
            }
            jVar.mo26450a(aVar);
            String b = a2.f40025Q.mo26550b();
            if (b == null) {
                b = str;
            }
            jVar.mo26451a(b);
            String b2 = a2.f40026R.mo26550b();
            if (b2 == null) {
                b2 = str;
            }
            jVar.mo26452b(b2);
            String b3 = m30470b(a2);
            if (b3 != null) {
                str = b3;
            }
            jVar.mo26453c(str);
            jVar.f39851s = this;
            Integer num = (Integer) a2.f40038ad.mo26550b();
            if (num != null) {
                i = num.intValue();
            }
            jVar.f39842j = Integer.valueOf(i);
            jVar.mo26454d("template");
            jVar.f39855w = this.f38991f;
            iResourceLoaderService.loadAsync(str2, jVar, new C16420c(a2, this, str2, gVar, dVar), new C16421d(this, str2, gVar, dVar));
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: a */
    public final void mo26058a(AbstractC89172b<? super List<C17029d<LynxView>>, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        LynxView a = mo26052a(mo26061t());
        if (a != null) {
            C28832c.m57726a().mo49962a(this, a);
            bVar.invoke(C89070n.m154516a(new C17029d(a)));
            AbstractC16576j.C16578b.m30778a(this, "create and add view component success", null, null, 6);
        }
        this.f39437s = System.currentTimeMillis() - currentTimeMillis;
    }

    @Override // com.lynx.tasm.navigator.AbstractC28831b
    /* renamed from: a */
    public final void mo26056a(LynxView lynxView) {
        LynxView lynxView2;
        C17029d dVar = (C17029d) C89070n.m154583g((List) this.f40544H);
        if (dVar != null && (lynxView2 = (LynxView) dVar.f40551a) != null) {
            lynxView2.addView(lynxView);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: a */
    public final boolean mo25794a(Uri uri, AbstractC89172b<? super Throwable, C89391z> bVar) {
        C89219l.m154719c(uri, "");
        C89219l.m154719c(bVar, "");
        this.f39426B = System.currentTimeMillis();
        return true;
    }

    /* renamed from: x */
    private final C16423f m30472x() {
        return new C16423f(this);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    /* renamed from: l */
    public final void mo25777l() {
        super.mo25777l();
        Uri uri = this.f39429k;
        if (uri != null) {
            mo25793a(uri, true);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r, com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: r */
    public final void mo25804r() {
        super.mo25804r();
        AbstractC17045g z = mo26902z();
        if (z != null) {
            z.mo26824a(this.f39443y);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$b */
    static final class C16419b extends AbstractC89220m implements AbstractC89171a<File> {

        /* renamed from: a */
        final /* synthetic */ C16248b f39446a;

        static {
            Covode.recordClassIndex(18722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16419b(C16248b bVar) {
            super(0);
            this.f39446a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ File invoke() {
            Application application = (Application) this.f39446a.mo25832c(Application.class);
            if (application != null) {
                return application.getFilesDir();
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$f */
    public static final class C16423f extends AbstractC28838o {

        /* renamed from: a */
        public Uri f39457a;

        /* renamed from: b */
        final /* synthetic */ C16417i f39458b;

        static {
            Covode.recordClassIndex(18726);
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: c */
        public final void mo16280c() {
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25960d(this.f39458b);
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: d */
        public final void mo19152d() {
            this.f39458b.mo26901y();
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25962f(this.f39458b);
            }
            AbstractC16576j.C16578b.m30778a(this.f39458b, "lynx client onRuntimeReady", null, null, 6);
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14467a() {
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25958b(this.f39458b);
            }
            for (T t : this.f39458b.f40544H) {
                Uri uri = this.f39458b.f39429k;
                if (uri == null) {
                    uri = Uri.EMPTY;
                    C89219l.m154709a((Object) uri, "");
                }
                t.mo26906b(uri);
            }
            AbstractC16576j.C16578b.m30778a(this.f39458b, "lynx client onLoadSuccess", null, null, 6);
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14470b() {
            Long l;
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25959c(this.f39458b);
            }
            C16417i iVar = this.f39458b;
            if (iVar.f39438t) {
                iVar.f39438t = false;
                iVar.f39434p = System.currentTimeMillis();
                C16257i iVar2 = (C16257i) iVar.f38994i.mo25832c(C16257i.class);
                if (!(iVar2 == null || (l = iVar2.f39049b) == null)) {
                    long longValue = l.longValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", System.currentTimeMillis() - longValue);
                    AbstractC16654o oVar = (AbstractC16654o) iVar.mo25790b_(AbstractC16654o.class);
                    if (oVar != null) {
                        C16607an anVar = new C16607an("bdx_monitor_lynx_first_screen_duration", null, null, 254);
                        anVar.f39743h = jSONObject;
                        anVar.f39738c = iVar.f38991f;
                        oVar.mo26319a(anVar);
                    }
                    AbstractC16654o oVar2 = (AbstractC16654o) iVar.mo25790b_(AbstractC16654o.class);
                    if (oVar2 != null) {
                        C16607an anVar2 = new C16607an("bdx_monitor_lynx_timeline", null, null, 254);
                        anVar2.f39738c = iVar.f38991f;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("init_to_start_render", iVar2.f39051d);
                        jSONObject2.put("lynx_render", iVar.f39434p - iVar.f39433o);
                        jSONObject2.put("resource_load", iVar2.f39054g);
                        jSONObject2.put("render_template_main", iVar.f39435q);
                        jSONObject2.put("read_template", iVar.f39436r);
                        jSONObject2.put("create_view_component", iVar.f39437s);
                        anVar2.f39743h = jSONObject2;
                        oVar2.mo26319a(anVar2);
                    }
                }
            }
            AbstractC16576j.C16578b.m30778a(this.f39458b, "lynx client onFirstScreen", null, null, 6);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16423f(C16417i iVar) {
            this.f39458b = iVar;
        }

        /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$f$a */
        static final class C16424a extends AbstractC89220m implements AbstractC89172b<Object, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC28510f.AbstractC28511a f39459a;

            static {
                Covode.recordClassIndex(18727);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16424a(AbstractC28510f.AbstractC28511a aVar) {
                super(1);
                this.f39459a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                this.f39459a.mo49016a(obj, null);
                return C89391z.f203057a;
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
            C89219l.m154719c(lynxPerfMetric, "");
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25957a(this.f39458b, lynxPerfMetric.toJSONObject());
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
            C89219l.m154719c(lynxPerfMetric, "");
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                C16417i iVar = this.f39458b;
                lynxPerfMetric.toJSONObject();
                it.next().mo25961e(iVar);
            }
        }

        /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$f$b */
        static final class C16425b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C16423f f39460a;

            /* renamed from: b */
            final /* synthetic */ AbstractC28510f.AbstractC28511a f39461b;

            /* renamed from: c */
            final /* synthetic */ String f39462c;

            static {
                Covode.recordClassIndex(18728);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16425b(C16423f fVar, AbstractC28510f.AbstractC28511a aVar, String str) {
                super(1);
                this.f39460a = fVar;
                this.f39461b = aVar;
                this.f39462c = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Throwable th) {
                String str;
                Throwable th2 = th;
                C89219l.m154719c(th2, "");
                this.f39461b.mo49016a(null, th2);
                AbstractC16654o oVar = (AbstractC16654o) this.f39460a.f39458b.mo25790b_(AbstractC16654o.class);
                if (oVar != null) {
                    C16607an anVar = new C16607an("bdx_monitor_preload_image_cache_miss", null, null, 254);
                    anVar.f39740e = this.f39462c;
                    JSONObject jSONObject = new JSONObject();
                    AbstractC16640d dVar = this.f39460a.f39458b.f38991f;
                    if (dVar == null || (str = dVar.mo26401b()) == null) {
                        str = "unknown";
                    }
                    jSONObject.put("schema", str);
                    anVar.f39742g = jSONObject;
                    oVar.mo26319a(anVar);
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: b */
        public final void mo14472b(String str) {
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25956a(this.f39458b, str);
            }
            C16257i iVar = (C16257i) this.f39458b.f38994i.mo25832c(C16257i.class);
            if (iVar != null) {
                iVar.f39056i = str;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Lynx#onLoadFailed ".concat(String.valueOf(str)));
            this.f39458b.mo25766a(illegalStateException);
            this.f39458b.mo25799c(illegalStateException);
            AbstractC16576j.C16578b.m30778a(this.f39458b, "lynx client onLoadFailed on error:".concat(String.valueOf(str)), null, null, 6);
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo19151a(C28816j jVar) {
            C17029d q_;
            if (jVar != null) {
                Iterator<T> it = this.f39458b.f39428j.iterator();
                while (it.hasNext()) {
                    it.next().mo25955a(this.f39458b, new C16389b(jVar.mo49932a(), jVar.f68013a));
                }
                C89219l.m154719c(jVar, "");
                if (!(!C89070n.m154522b(100, 102, 103, 1201).contains(Integer.valueOf(jVar.f68013a)) || this.f39457a == null || (q_ = this.f39458b.mo26900q_()) == null)) {
                    Uri uri = this.f39457a;
                    if (uri == null) {
                        C89219l.m154707a();
                    }
                    q_.mo26904a(uri, new RuntimeException(jVar.toString()));
                }
                AbstractC16576j.C16578b.m30778a(this.f39458b, "lynx client onReceivedError on error:".concat(String.valueOf(jVar)), null, null, 6);
            }
        }

        @Override // com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo14469a(String str) {
            this.f39458b.f39432n = System.currentTimeMillis();
            Iterator<T> it = this.f39458b.f39428j.iterator();
            while (it.hasNext()) {
                it.next().mo25953a(this.f39458b);
            }
            this.f39457a = Uri.parse(str);
        }

        @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
        /* renamed from: a */
        public final void mo26065a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC28510f.AbstractC28511a aVar) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(aVar, "");
            if (this.f39458b.f39428j.isEmpty()) {
                super.mo26065a(context, str, str2, f, f2, transformer, aVar);
                return;
            }
            C16417i iVar = this.f39458b;
            C16413f fVar = new C16413f(iVar, iVar.f39428j);
            C16416h hVar = new C16416h(context, str, str2, f, f2, transformer);
            C16424a aVar2 = new C16424a(aVar);
            C16425b bVar = new C16425b(this, aVar, str2);
            C89219l.m154719c(hVar, "");
            C89219l.m154719c(aVar2, "");
            C89219l.m154719c(bVar, "");
            Iterator<AbstractC16370a> it = fVar.f39411a.iterator();
            if (!it.hasNext()) {
                bVar.invoke(new Throwable("None of ILynxClientDelegate processor for image " + hVar.f39421c));
            } else {
                fVar.mo26044a(it, hVar, aVar2, bVar);
            }
        }
    }

    /* renamed from: w */
    private final boolean m30471w() {
        C16565a b;
        AbstractC16597ag agVar = (AbstractC16597ag) mo25790b_(AbstractC16597ag.class);
        if (agVar == null || (b = agVar.mo26367b()) == null) {
            return false;
        }
        return b.f39696c;
    }

    /* renamed from: t */
    public final C16852d mo26061t() {
        AbstractC16741q o_ = mo25778o_();
        if (o_ != null) {
            return (C16852d) o_;
        }
        C89219l.m154707a();
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c, com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b
    /* renamed from: u */
    public final String mo26062u() {
        return "Lynx View(" + mo25806s().mo25713d() + ')';
    }

    @Override // com.lynx.tasm.navigator.AbstractC28831b
    /* renamed from: v */
    public final void mo26063v() {
        Activity activity;
        Context context = (Context) this.f38994i.mo25832c(Context.class);
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing() && (activity = (Activity) context) != null) {
            activity.finish();
        }
    }

    /* renamed from: A */
    private final void m30465A() {
        Map<String, Object> a;
        if (!this.f39444z.isEmpty()) {
            this.f39444z.clear();
        }
        Map<String, Object> map = this.f39444z;
        map.put("bullet_version", "2.1.4-rc.8-tiktok");
        for (T t : mo25801o()) {
            if (t != null) {
                Map<String, Object> a2 = t.mo26018a(this, this.f38994i);
                if (a2 != null) {
                    map.putAll(a2);
                }
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        AbstractC16214m r_ = mo25805r_();
        if (!(r_ instanceof AbstractC16412e)) {
            r_ = null;
        }
        AbstractC16412e eVar = (AbstractC16412e) r_;
        if (!(eVar == null || (a = eVar.mo26018a(this, this.f38994i)) == null)) {
            map.putAll(a);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$a */
    public static final class C16418a extends C17022c {

        /* renamed from: a */
        final /* synthetic */ C16417i f39445a;

        static {
            Covode.recordClassIndex(18721);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C16418a(C16417i iVar) {
            this.f39445a = iVar;
        }

        @Override // com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17017a, com.bytedance.ies.bullet.p1184ui.common.C17022c
        /* renamed from: a */
        public final boolean mo26064a(Activity activity) {
            C89219l.m154719c(activity, "");
            try {
                if (C89219l.m154714a((Object) this.f39445a.mo26061t().f40048an.mo26550b(), (Object) false)) {
                    return true;
                }
            } catch (Exception e) {
                this.f39445a.printReject(e, " on uri " + this.f39445a.f39429k);
            }
            return C28832c.m57726a().mo49963b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$e */
    public static final class C16422e extends AbstractC89220m implements AbstractC89172b<C16417i, AbstractC16187m> {

        /* renamed from: a */
        public static final C16422e f39456a = new C16422e();

        static {
            Covode.recordClassIndex(18725);
        }

        C16422e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ AbstractC16187m invoke(C16417i iVar) {
            C16417i iVar2 = iVar;
            C89219l.m154719c(iVar2, "");
            return iVar2.f38988c;
        }
    }

    /* renamed from: a */
    private static AbstractC16405c m30466a(AbstractC16204e eVar) {
        if (eVar == null || !(eVar instanceof AbstractC16405c)) {
            return null;
        }
        return (AbstractC16405c) eVar;
    }

    /* renamed from: b */
    static String m30470b(C16852d dVar) {
        String b = dVar.f40051aq.mo26550b();
        if (b != null) {
            return b;
        }
        String b2 = dVar.f40034Z.mo26550b();
        if (b2 == null) {
            return dVar.f40036ab.mo26550b();
        }
        return b2;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: a */
    public final void mo26053a(Activity activity) {
        Iterator<T> it = this.f40544H.iterator();
        while (it.hasNext()) {
            ((LynxView) it.next().f40551a).onEnterForeground();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$d */
    static final class C16421d extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16417i f39452a;

        /* renamed from: b */
        final /* synthetic */ String f39453b;

        /* renamed from: c */
        final /* synthetic */ AbstractC28837g f39454c;

        /* renamed from: d */
        final /* synthetic */ C28833d f39455d;

        static {
            Covode.recordClassIndex(18724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16421d(C16417i iVar, String str, AbstractC28837g gVar, C28833d dVar) {
            super(1);
            this.f39452a = iVar;
            this.f39453b = str;
            this.f39454c = gVar;
            this.f39455d = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            AbstractC16576j.C16578b.m30778a(this.f39452a, "load resource for navigation failed with msg: " + th2.getMessage(), null, null, 6);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$i */
    static final class C16428i extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ byte[] f39471a;

        /* renamed from: b */
        final /* synthetic */ C17029d f39472b;

        /* renamed from: c */
        final /* synthetic */ C16417i f39473c;

        /* renamed from: d */
        final /* synthetic */ Uri f39474d;

        /* renamed from: e */
        final /* synthetic */ Map f39475e;

        /* renamed from: f */
        final /* synthetic */ boolean f39476f;

        static {
            Covode.recordClassIndex(18731);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16428i(byte[] bArr, C17029d dVar, C16417i iVar, Uri uri, Map map, boolean z) {
            super(1);
            this.f39471a = bArr;
            this.f39472b = dVar;
            this.f39473c = iVar;
            this.f39474d = uri;
            this.f39475e = map;
            this.f39476f = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            C16610ap apVar2 = apVar;
            C89219l.m154719c(apVar2, "");
            String str = apVar2.f39755o;
            if (str == null) {
                C89219l.m154707a();
            }
            this.f39473c.mo26055a(this.f39472b, this.f39471a, TemplateData.m56771a(C89159j.m154648c(new File(str))), this.f39476f);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$j */
    static final class C16429j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C17029d f39477a;

        /* renamed from: b */
        final /* synthetic */ C16417i f39478b;

        /* renamed from: c */
        final /* synthetic */ Uri f39479c;

        /* renamed from: d */
        final /* synthetic */ Map f39480d;

        /* renamed from: e */
        final /* synthetic */ boolean f39481e;

        static {
            Covode.recordClassIndex(18732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16429j(C17029d dVar, C16417i iVar, Uri uri, Map map, boolean z) {
            super(1);
            this.f39477a = dVar;
            this.f39478b = iVar;
            this.f39479c = uri;
            this.f39480d = map;
            this.f39481e = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            AbstractC16576j.C16578b.m30778a(this.f39478b, "load durl resource failed:" + th2.getMessage(), null, null, 6);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17024b
    /* renamed from: a */
    public final void mo26054a(C17029d<LynxView> dVar) {
        C89219l.m154719c(dVar, "");
        C16746t b = mo26061t().f39935k.mo26550b();
        if (b != null) {
            Integer valueOf = Integer.valueOf(b.f39989a);
            if (valueOf.intValue() != -2 && valueOf != null) {
                ((LynxView) dVar.f40551a).setBackgroundColor(valueOf.intValue());
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.p1187c.AbstractC17026c
    /* renamed from: b */
    public final void mo26059b(Activity activity) {
        Iterator<T> it = this.f40544H.iterator();
        while (it.hasNext()) {
            ((LynxView) it.next().f40551a).onEnterBackground();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$h */
    static final class C16427h extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16417i f39468a;

        /* renamed from: b */
        final /* synthetic */ long f39469b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39470c;

        static {
            Covode.recordClassIndex(18730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16427h(C16417i iVar, long j, AbstractC89172b bVar) {
            super(1);
            this.f39468a = iVar;
            this.f39469b = j;
            this.f39470c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154719c(th2, "");
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f39469b);
            AbstractC16654o oVar = (AbstractC16654o) this.f39468a.mo25790b_(AbstractC16654o.class);
            AbstractC16640d dVar = this.f39468a.f38991f;
            String message = th2.getMessage();
            Long valueOf = Long.valueOf(millis);
            if (oVar != null) {
                C16607an anVar = new C16607an("bdx_monitor_lynx_resource_load", null, null, 254);
                anVar.f39738c = dVar;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_url", "Unknown");
                jSONObject.put("res_version", "-1");
                jSONObject.put("res_status", "failure");
                jSONObject.put("fail_reason", message);
                anVar.f39742g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", valueOf);
                anVar.f39743h = jSONObject2;
                oVar.mo26319a(anVar);
            }
            this.f39470c.invoke(th2);
            return C89391z.f203057a;
        }
    }

    @Override // com.lynx.tasm.navigator.AbstractC28831b
    /* renamed from: b */
    public final void mo26060b(LynxView lynxView) {
        LynxView lynxView2;
        C17029d dVar = (C17029d) C89070n.m154583g((List) this.f40544H);
        if (dVar != null && (lynxView2 = (LynxView) dVar.f40551a) != null) {
            lynxView2.removeView(lynxView);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$c */
    static final class C16420c extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16852d f39447a;

        /* renamed from: b */
        final /* synthetic */ C16417i f39448b;

        /* renamed from: c */
        final /* synthetic */ String f39449c;

        /* renamed from: d */
        final /* synthetic */ AbstractC28837g f39450d;

        /* renamed from: e */
        final /* synthetic */ C28833d f39451e;

        static {
            Covode.recordClassIndex(18723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16420c(C16852d dVar, C16417i iVar, String str, AbstractC28837g gVar, C28833d dVar2) {
            super(1);
            this.f39447a = dVar;
            this.f39448b = iVar;
            this.f39449c = str;
            this.f39450d = gVar;
            this.f39451e = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:13:0x0049 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.bytedance.ies.bullet.service.base.a.p, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.ies.bullet.service.base.C16610ap r8) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.lynx.C16417i.C16420c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: b */
    public final void mo25796b(Throwable th) {
        super.mo25796b(th);
        this.f39430l = null;
        AbstractC17045g z = mo26902z();
        if (z != null) {
            z.mo26827b(this.f39443y);
        }
        C28832c.m57726a().mo49961a(this);
        AbstractC16629c cVar = this.f39442x;
        if (cVar != null) {
            cVar.mo26411b();
        }
        AbstractC16576j.C16578b.m30778a(this, "lynxview was destroy, currentUri: " + this.f39429k, null, null, 6);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.i$g */
    static final class C16426g extends AbstractC89220m implements AbstractC89172b<C16610ap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C16417i f39463a;

        /* renamed from: b */
        final /* synthetic */ long f39464b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f39465c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89172b f39466d;

        /* renamed from: e */
        final /* synthetic */ Uri f39467e;

        static {
            Covode.recordClassIndex(18729);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16426g(C16417i iVar, long j, AbstractC89172b bVar, AbstractC89172b bVar2, Uri uri) {
            super(1);
            this.f39463a = iVar;
            this.f39464b = j;
            this.f39465c = bVar;
            this.f39466d = bVar2;
            this.f39467e = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C16610ap apVar) {
            Uri b;
            AbstractC16187m mVar;
            AbstractC16187m mVar2;
            AbstractC16559e<String, Object> b2;
            boolean z;
            MethodCollector.m26663i(11739);
            C16610ap apVar2 = apVar;
            String str = "";
            C89219l.m154719c(apVar2, str);
            AbstractC16640d dVar = (AbstractC16640d) this.f39463a.mo25789a_(AbstractC16640d.class);
            byte[] bArr = null;
            if (dVar != null) {
                if (!(dVar instanceof C16637a)) {
                    dVar = null;
                }
                C16637a aVar = (C16637a) dVar;
                if (!(aVar == null || !C16326f.m30334a(aVar.f39801a) || (b2 = C16622e.C16623a.m30858a().mo26341b(aVar.f39801a)) == null)) {
                    if (!(apVar2 instanceof C16342f) || !((C16342f) apVar2).f39276c) {
                        z = false;
                    } else {
                        z = true;
                    }
                    b2.putBooleanIfAbsent("res_memory", z);
                }
            }
            String str2 = apVar2.f39755o;
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f39464b);
            C16257i iVar = (C16257i) this.f39463a.f38994i.mo25832c(C16257i.class);
            if (iVar != null) {
                iVar.f39054g = Long.valueOf(millis);
            }
            AbstractC16654o oVar = (AbstractC16654o) this.f39463a.mo25790b_(AbstractC16654o.class);
            AbstractC16640d dVar2 = this.f39463a.f38991f;
            String b3 = this.f39463a.mo26061t().f40025Q.mo26550b();
            String b4 = apVar2.mo26372b();
            String valueOf = String.valueOf(apVar2.f39759s);
            Long valueOf2 = Long.valueOf(millis);
            C89219l.m154719c(b4, str);
            if (oVar != null) {
                C16607an anVar = new C16607an("bdx_monitor_lynx_resource_load", null, null, 254);
                anVar.f39738c = dVar2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("res_from", b4);
                jSONObject.put("res_url", str2);
                jSONObject.put("res_version", valueOf);
                jSONObject.put("res_status", "success");
                jSONObject.put("channel", b3);
                anVar.f39742g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", valueOf2);
                anVar.f39743h = jSONObject2;
                oVar.mo26319a(anVar);
            }
            AbstractC16699y yVar = (AbstractC16699y) this.f39463a.mo25790b_(AbstractC16699y.class);
            if (!(yVar == null || (mVar2 = this.f39463a.f38988c) == null)) {
                Object a = yVar.mo26536a(this.f39463a.f38994i);
                if (a != null) {
                    mVar2.mo25732a((AbstractC16192q) a);
                } else {
                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(11739);
                    throw wVar;
                }
            }
            AbstractC16679f fVar = (AbstractC16679f) this.f39463a.mo25790b_(AbstractC16679f.class);
            if (!(fVar == null || (mVar = this.f39463a.f38988c) == null)) {
                Object a2 = fVar.mo26491a(this.f39463a.f38994i);
                if (a2 != null) {
                    mVar.mo25732a((AbstractC16192q) a2);
                } else {
                    C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(11739);
                    throw wVar2;
                }
            }
            InputStream a3 = apVar2.mo25913a();
            if (a3 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC89172b bVar = this.f39465c;
                try {
                    InputStream inputStream = a3;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                        long unused = C89145b.m154635a(inputStream, byteArrayOutputStream2, 8192);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        C89146c.m154636a(byteArrayOutputStream, null);
                        try {
                            C89146c.m154636a(a3, null);
                            bArr = byteArray;
                        } catch (Exception e) {
                            bVar.invoke(new RuntimeException("Script decode error!", e));
                        }
                        if (bArr != null) {
                            this.f39463a.f39430l = bArr;
                            C16417i iVar2 = this.f39463a;
                            if (apVar2.f39757q != EnumC16609ao.CDN || !this.f39463a.mo25792g().mo26328c()) {
                                String str3 = apVar2.f39755o;
                                if (str3 == null) {
                                    C89219l.m154707a();
                                }
                                b = C16362m.m30382b(str3);
                            } else {
                                String b5 = C16417i.m30470b(this.f39463a.mo26061t());
                                if (b5 != null) {
                                    str = b5;
                                }
                                b = Uri.parse(str);
                            }
                            iVar2.f39431m = b;
                            this.f39463a.f39436r = System.currentTimeMillis() - currentTimeMillis;
                            this.f39466d.invoke(this.f39467e);
                        }
                    } catch (Throwable th) {
                        C89146c.m154636a(byteArrayOutputStream, th);
                        MethodCollector.m26664o(11739);
                        throw th;
                    }
                } catch (Throwable th2) {
                    C89146c.m154636a(a3, th);
                    MethodCollector.m26664o(11739);
                    throw th2;
                }
            } else {
                this.f39465c.invoke(new FileNotFoundException(String.valueOf(apVar2)));
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(11739);
            return zVar;
        }
    }

    /* renamed from: a */
    public final LynxView mo26052a(C16852d dVar) {
        boolean z;
        View a;
        C16248b b = this.f38994i.mo25829b();
        b.mo25827a(AbstractC16187m.class, (AbstractC16249c) new C16251e(this, C16422e.f39456a));
        boolean z2 = false;
        C20072c cVar = new C20072c((byte) 0);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f39439u.iterator();
        while (true) {
            boolean z3 = true;
            AbstractC16629c cVar2 = null;
            if (it.hasNext()) {
                List<?> a2 = it.next().mo26038a();
                if (a2 == null) {
                    a2 = C89086z.INSTANCE;
                }
                if (true ^ a2.isEmpty()) {
                    if (a2.get(0) instanceof C28463a) {
                        arrayList.addAll(a2);
                    } else if (a2.get(0) instanceof AbstractC17608c) {
                        for (T t : a2) {
                            if (t != null) {
                                arrayList.add(C16533a.m30706a(t));
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        continue;
                    } else if (a2.get(0) instanceof AbstractC16380d) {
                        for (T t2 : a2) {
                            if (t2 != null) {
                                arrayList.add(C16431a.m30510a(t2));
                            } else {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                        }
                        continue;
                    } else {
                        AbstractC16576j.C16578b.m30778a(this, "not supported type ".concat(String.valueOf(a2)), null, null, 6);
                    }
                }
            } else {
                cVar.f47779o = arrayList;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("bridge", new C20100b(LynxBridgeModule.class, b));
                C20101c cVar3 = (C20101c) this.f38994i.mo25832c(C20101c.class);
                if (cVar3 != null) {
                    linkedHashMap.putAll(cVar3.f47849a);
                }
                cVar.f47778n = linkedHashMap;
                cVar.f47767c = dVar.f40045ak.mo26550b();
                cVar.f47769e = dVar.f40041ag.mo26550b();
                cVar.f47768d = dVar.f40042ah.mo26550b();
                Object b2 = dVar.f40044aj.mo26550b();
                Integer num = (Integer) b2;
                if (num != null && num.intValue() == 0) {
                    b2 = null;
                }
                Integer num2 = (Integer) b2;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    C20068b bVar = new C20068b();
                    bVar.f47759a = dVar.f40043ai.mo26550b();
                    bVar.f47760b = Integer.valueOf(intValue);
                    cVar.f47781q = bVar;
                }
                cVar.f47773i = C16549d.C16550a.m30727a(dVar.f40030V.mo26550b()).f39673a;
                cVar.f47782r = dVar.f40047am.mo26550b();
                cVar.f47770f = dVar.f40049ao.mo26550b();
                Boolean b3 = dVar.f40052ar.mo26550b();
                if (b3 != null) {
                    z = b3.booleanValue();
                } else {
                    z = false;
                }
                cVar.f47774j = z;
                cVar.mo33424a(this.f39441w);
                cVar.mo33422a(m30472x());
                mo25792g().mo26324a().mo26344a(C20072c.class, cVar);
                String b4 = dVar.f40027S.mo26550b();
                if (b4 == null) {
                    C89219l.m154707a();
                }
                String str = b4;
                Boolean b5 = dVar.f40028T.mo26550b();
                if (b5 != null) {
                    z3 = b5.booleanValue();
                }
                Boolean b6 = dVar.f40029U.mo26550b();
                if (b6 != null) {
                    z2 = b6.booleanValue();
                }
                cVar.mo33423a(str, z3, z2, m30471w() ? new String[]{"assets://bdlynx_core.js"} : null);
                AbstractC16628b bVar2 = (AbstractC16628b) mo25790b_(AbstractC16628b.class);
                if (bVar2 != null) {
                    cVar2 = bVar2.mo26387b(this);
                }
                this.f39442x = cVar2;
                if (cVar2 == null || (a = cVar2.mo26408a()) == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
                LynxView lynxView = (LynxView) a;
                b.mo25828a(LynxView.class, lynxView);
                this.f38994i.mo25828a(LynxView.class, lynxView);
                lynxView.setTag(R.id.zr, "bullet");
                return lynxView;
            }
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i
    public final void onEvent(AbstractC16191p pVar) {
        Map h;
        String str;
        String str2;
        C89219l.m154719c(pVar, "");
        TemplateData templateData = null;
        if (C89219l.m154714a((Object) pVar.mo25699a(), (Object) "__updateData")) {
            Object b = pVar.mo25700b();
            if (b != null) {
                if ((b instanceof CharSequence) || (b instanceof JSONObject) || (b instanceof JSONArray)) {
                    str2 = String.valueOf(b);
                } else if (b instanceof ReadableMap) {
                    str2 = String.valueOf(C16410a.f39406a.mo26043a((ReadableMap) b));
                } else if (b instanceof ReadableArray) {
                    str2 = String.valueOf(C16410a.f39406a.mo26042a((ReadableArray) b));
                } else {
                    return;
                }
                if (str2 != null) {
                    Iterator<T> it = this.f40544H.iterator();
                    while (it.hasNext()) {
                        ((LynxView) it.next().f40551a).updateData(str2);
                    }
                }
            }
        } else if (C89219l.m154714a((Object) pVar.mo25699a(), (Object) "__updateGlobalProps") && this.f39441w != null) {
            Object b2 = pVar.mo25700b();
            if (b2 != null && (b2 instanceof Map)) {
                Map map = (Map) b2;
                if (map.isEmpty()) {
                    AbstractC16576j.C16578b.m30778a(this, "updateGlobalProps failed as diffProps is emtpy", null, null, 6);
                    return;
                }
                Map<String, ? extends Object> map2 = this.f39441w;
                if (!(map2 == null || !C89206ad.m154685g(map2) || (h = C89206ad.m154686h(map2)) == null)) {
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key == null || !(key instanceof String) || (str = (String) key) == null || str.length() <= 0 || entry.getValue() == null)) {
                            AbstractC16576j.C16578b.m30778a(this, "update globalProps item key: " + str + " from oldValue: " + h.get(str) + " to newValue: " + entry.getValue(), null, null, 6);
                            Object value = entry.getValue();
                            if (value == null) {
                                C89219l.m154707a();
                            }
                            h.put(str, value);
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, ? extends Object> map3 = this.f39441w;
                if (map3 == null) {
                    C89219l.m154707a();
                }
                linkedHashMap.put("__globalProps", map3);
                Iterator<T> it2 = this.f40544H.iterator();
                while (it2.hasNext()) {
                    ((LynxView) it2.next().f40551a).updateData(linkedHashMap);
                }
            }
        } else if (C89219l.m154714a((Object) "__updateTemplateData", (Object) pVar.mo25699a())) {
            Object b3 = pVar.mo25700b();
            if (b3 != null && (b3 instanceof C17611f)) {
                C17611f fVar = (C17611f) b3;
                if (fVar.f42100b != null) {
                    templateData = TemplateData.m56771a(fVar.f42100b);
                    for (Map.Entry<String, Object> entry2 : fVar.f42099a.entrySet()) {
                        templateData.mo48812a(entry2.getKey(), entry2.getValue());
                    }
                } else {
                    templateData = TemplateData.m56772a(fVar.f42099a);
                }
            }
            Iterator<T> it3 = this.f40544H.iterator();
            while (it3.hasNext()) {
                ((LynxView) it3.next().f40551a).updateData(templateData);
            }
        } else {
            Iterator<T> it4 = this.f40544H.iterator();
            while (it4.hasNext()) {
                LynxView lynxView = (LynxView) it4.next().f40551a;
                String a = pVar.mo25699a();
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                JSONObject jSONObject = new JSONObject();
                Object b4 = pVar.mo25700b();
                if (b4 != null) {
                    if ((b4 instanceof CharSequence) || (b4 instanceof JSONObject) || (b4 instanceof JSONArray)) {
                        jSONObject.put("data", b4);
                    } else if (b4 instanceof ReadableMap) {
                        jSONObject.put("data", C16410a.f39406a.mo26043a((ReadableMap) b4));
                    } else if (b4 instanceof ReadableArray) {
                        jSONObject.put("data", C16410a.f39406a.mo26042a((ReadableArray) b4));
                    } else {
                        jSONObject.put("data", new JSONObject());
                    }
                }
                C16447d dVar = new C16447d(this.f38993h.f39033a);
                C89219l.m154719c(jSONObject, "");
                C89219l.m154719c(dVar, "");
                jSONObject.put("containerID", dVar.f39505a);
                jSONObject.put("protocolVersion", dVar.f39506b);
                javaOnlyArray.pushMap(C16410a.f39406a.mo26041a(jSONObject));
                lynxView.sendGlobalEvent(a, javaOnlyArray);
            }
        }
    }

    /* renamed from: a */
    private final void m30467a(C17029d<LynxView> dVar, Map<String, ? extends Object> map) {
        Object obj;
        this.f39441w = map;
        ((LynxView) dVar.f40551a).setGlobalProps(map);
        if (C89219l.m154714a((Object) mo26061t().f40050ap.mo26550b(), (Object) true) && !mo26061t().f40049ao.mo26552c() && (obj = map.get("font_scale")) != null) {
            ((LynxView) dVar.f40551a).updateFontScacle(((Float) obj).floatValue());
        }
    }

    /* renamed from: a */
    private final void m30469a(Map<String, Object> map, Uri uri) {
        String str;
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        C89219l.m154709a((Object) queryParameterNames, "");
        for (T t : queryParameterNames) {
            C89219l.m154709a((Object) t, "");
            linkedHashMap.put(t, uri.getQueryParameter(t));
        }
        C16257i iVar = (C16257i) this.f38994i.mo25832c(C16257i.class);
        if (iVar == null || (l = iVar.f39049b) == null) {
            str = null;
        } else {
            str = String.valueOf(l.longValue());
        }
        linkedHashMap.put("containerInitTime", str);
        map.put("queryItems", linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.List<com.bytedance.ies.bullet.kit.lynx.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: b */
    public final void mo25797b(List<String> list, AbstractC16253f fVar) {
        AbstractC16405c a;
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        super.mo25797b(list, fVar);
        this.f39439u.clear();
        this.f39428j.clear();
        this.f39440v.clear();
        for (T t : mo25802p()) {
            if (t != null) {
                T t2 = t;
                this.f39428j.add(t2.mo26033b(this.f38994i));
                AbstractC16406a c = t2.mo26034c(this.f38994i);
                if (c != null) {
                    this.f39439u.add(c);
                }
                t2.mo26035d(this.f38994i);
                t2.mo26036e(this.f38994i);
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        AbstractC16204e s_ = mo25807s_();
        if (!(s_ == null || (a = m30466a(s_)) == null)) {
            this.f39428j.add(a.mo26033b(this.f38994i));
            AbstractC16406a c2 = a.mo26034c(this.f38994i);
            if (c2 != null) {
                this.f39439u.add(c2);
            }
            a.mo26035d(this.f38994i);
            a.mo26036e(this.f38994i);
        }
        Object c3 = this.f38994i.mo25832c(AbstractC16370a.class);
        if (c3 != null) {
            this.f39428j.add(c3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: com.bytedance.ies.bullet.lynx_adapter_impl.d */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: a */
    public final void mo25793a(Uri uri, boolean z) {
        boolean z2;
        String str;
        JSONObject jSONObject;
        boolean z3;
        C17029d<LynxView> dVar;
        Object obj;
        C16565a b;
        Map<String, ? extends Object> map;
        C16148a aVar;
        C16149b bVar;
        C16565a b2;
        C89219l.m154719c(uri, "");
        Uri uri2 = this.f39429k;
        boolean z4 = true;
        if (uri2 == null || (!C89219l.m154714a(uri2, uri))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f39429k = uri;
        JSONObject jSONObject2 = null;
        AbstractC16576j.C16578b.m30778a(this, "start to load lynxview", null, null, 6);
        if (z2) {
            m30465A();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f39444z);
        AbstractC16640d dVar2 = this.f38991f;
        if (dVar2 == null || (str = dVar2.mo26400a()) == null) {
            str = "";
        }
        linkedHashMap.put("resolvedUrl", str);
        for (C17029d<LynxView> dVar3 : this.f40544H) {
            dVar3.mo26903a(uri);
            byte[] bArr = this.f39430l;
            if (bArr != null) {
                String b3 = mo26061t().f40030V.mo26550b();
                if (b3 != null) {
                    jSONObject = new JSONObject(b3);
                } else {
                    jSONObject = jSONObject2;
                }
                TemplateData templateData = (TemplateData) this.f38994i.mo25832c(TemplateData.class);
                AbstractC16597ag agVar = (AbstractC16597ag) mo25790b_(AbstractC16597ag.class);
                if (agVar == null || (b2 = agVar.mo26367b()) == null) {
                    z3 = false;
                } else {
                    z3 = b2.f39695b;
                }
                C16549d dVar4 = (C16549d) this.f38994i.mo25832c(C16549d.class);
                C16549d dVar5 = dVar4;
                if (dVar4 == null) {
                    C16549d a = C16536b.m30713a((C17611f) this.f38994i.mo25832c(C17611f.class));
                    dVar5 = a;
                    if (a == null) {
                        Boolean valueOf = Boolean.valueOf(z3);
                        if (!valueOf.booleanValue() || jSONObject == null) {
                            dVar5 = jSONObject2;
                        } else {
                            valueOf.booleanValue();
                            dVar5 = C16549d.C16550a.m30727a(String.valueOf(jSONObject));
                        }
                    }
                }
                Map<String, Object> linkedHashMap2 = new LinkedHashMap<>();
                C16448e.m30530a(linkedHashMap2, new C16447d(this.f38993h.f39033a));
                m30469a(linkedHashMap2, uri);
                for (Map.Entry entry : C89041ag.m154429c(linkedHashMap).entrySet()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                String b4 = mo26061t().f40035aa.mo26550b();
                if (b4 != null && b4.length() > 0 && (aVar = (C16148a) this.f38994i.mo25832c(C16148a.class)) != null && (bVar = aVar.f38892b) != null && bVar.f38894a == z4) {
                    IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) mo25790b_(IResourceLoaderService.class);
                    if (iResourceLoaderService != null) {
                        String uri3 = Uri.parse(b4).toString();
                        C89219l.m154709a((Object) uri3, "");
                        C16667j jVar = new C16667j();
                        jVar.f39851s = this;
                        C16658a aVar2 = (C16658a) this.f38994i.mo25832c(C16658a.class);
                        if (aVar2 == null) {
                            aVar2 = new C16658a(false);
                        }
                        jVar.mo26450a(aVar2);
                        jVar.mo26454d("template");
                        jVar.f39855w = this.f38991f;
                        dVar = dVar3;
                        iResourceLoaderService.loadAsync(uri3, jVar, new C16428i(bArr, dVar, this, uri, linkedHashMap, z), new C16429j(dVar, this, uri, linkedHashMap, z));
                    } else {
                        dVar = dVar3;
                    }
                } else if (dVar5 != null) {
                    Map<String, Object> linkedHashMap3 = new LinkedHashMap<>();
                    linkedHashMap3.put("containerID", this.f38993h.f39033a);
                    linkedHashMap3.put("protocolVersion", "1.0");
                    m30469a(linkedHashMap3, uri);
                    for (Map.Entry entry2 : C89041ag.m154429c(linkedHashMap).entrySet()) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                    dVar = dVar3;
                    m30467a(dVar, linkedHashMap3);
                    mo26055a(dVar, bArr, dVar5.f39673a, z);
                } else {
                    dVar = dVar3;
                    if (jSONObject == null) {
                        if (templateData != null) {
                            Map<String, Object> linkedHashMap4 = new LinkedHashMap<>();
                            linkedHashMap4.put("containerID", this.f38993h.f39033a);
                            linkedHashMap4.put("protocolVersion", "1.0");
                            m30469a(linkedHashMap4, uri);
                            for (Map.Entry entry3 : C89041ag.m154429c(linkedHashMap).entrySet()) {
                                linkedHashMap4.put(entry3.getKey(), entry3.getValue());
                            }
                            AbstractC16597ag agVar2 = (AbstractC16597ag) mo25790b_(AbstractC16597ag.class);
                            if (agVar2 == null || (b = agVar2.mo26367b()) == null || !b.f39695b) {
                                m30467a(dVar, linkedHashMap4);
                            } else {
                                Object a2 = C16549d.C16550a.m30729a(linkedHashMap4);
                                if (!(a2 == null || (map = (Map) a2) == null)) {
                                    m30467a(dVar, map);
                                }
                            }
                            mo26055a(dVar, bArr, templateData, z);
                        } else {
                            AbstractC16699y yVar = (AbstractC16699y) mo25790b_(AbstractC16699y.class);
                            if (yVar != null) {
                                obj = yVar.mo26539c(uri);
                            } else {
                                obj = null;
                            }
                            jSONObject = new JSONObject();
                            if (obj != null) {
                                jSONObject.put("prefetchInitData", obj);
                            }
                            AbstractC16640d dVar6 = this.f38991f;
                            if (dVar6 != null) {
                                Uri parse = Uri.parse(dVar6.mo26400a());
                                AbstractC16699y yVar2 = (AbstractC16699y) mo25790b_(AbstractC16699y.class);
                                if (yVar2 != null) {
                                    C89219l.m154709a((Object) parse, "");
                                    Object c = yVar2.mo26539c(parse);
                                    if (c != null) {
                                        jSONObject.put("localInitData", c);
                                    }
                                }
                            }
                        }
                    }
                    m30467a(dVar, linkedHashMap2);
                    m30468a(dVar, bArr, jSONObject, z);
                }
                if (z) {
                    dVar.mo26906b(uri);
                }
                z4 = true;
                jSONObject2 = null;
            }
        }
        this.f39429k = uri;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16222r
    /* renamed from: c */
    public final void mo25798c(Uri uri, AbstractC89172b<? super Uri, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        Long b;
        MethodCollector.m26663i(8861);
        String str = "";
        C89219l.m154719c(uri, str);
        C89219l.m154719c(bVar, str);
        C89219l.m154719c(bVar2, str);
        AbstractC16203d<?, ?, ?, ?> s = mo25806s();
        if (s != null) {
            ILynxKitApi iLynxKitApi = (ILynxKitApi) s;
            if (!iLynxKitApi.mo25951h()) {
                bVar2.invoke(new IllegalStateException("Lynx has not inited", iLynxKitApi.mo25952i()));
                MethodCollector.m26664o(8861);
            } else if (C89219l.m154714a((Object) mo26061t().f40039ae.mo26550b(), (Object) true)) {
                bVar2.invoke(new C16221q(this, uri, null, 4, null));
                MethodCollector.m26664o(8861);
            } else {
                Integer num = (Integer) mo26061t().f40038ad.mo26550b();
                if (num != null) {
                    num.intValue();
                }
                this.f39427C = System.currentTimeMillis();
                IResourceLoaderService iResourceLoaderService = (IResourceLoaderService) mo25790b_(IResourceLoaderService.class);
                if (iResourceLoaderService == null) {
                    bVar2.invoke(new RuntimeException("loader service is null"));
                    MethodCollector.m26664o(8861);
                    return;
                }
                this.f39438t = true;
                long nanoTime = System.nanoTime();
                if (C89219l.m154714a((Object) mo26061t().f39917H.mo26550b(), (Object) true) && (b = mo26061t().f39918I.mo26550b()) != null) {
                    long longValue = b.longValue();
                    if (longValue > 0) {
                        Thread.sleep(longValue);
                    }
                }
                String uri2 = uri.toString();
                C89219l.m154709a((Object) uri2, str);
                C16667j jVar = new C16667j();
                C16658a aVar = (C16658a) this.f38994i.mo25832c(C16658a.class);
                int i = 0;
                if (aVar == null) {
                    aVar = new C16658a(false);
                }
                jVar.mo26450a(aVar);
                String b2 = mo26061t().f40025Q.mo26550b();
                if (b2 == null) {
                    b2 = str;
                }
                jVar.mo26451a(b2);
                String b3 = mo26061t().f40026R.mo26550b();
                if (b3 == null) {
                    b3 = str;
                }
                jVar.mo26452b(b3);
                String b4 = m30470b(mo26061t());
                if (b4 != null) {
                    str = b4;
                }
                jVar.mo26453c(str);
                jVar.f39851s = this;
                Integer num2 = (Integer) mo26061t().f40038ad.mo26550b();
                if (num2 != null) {
                    i = num2.intValue();
                }
                jVar.f39842j = Integer.valueOf(i);
                jVar.mo26454d("template");
                jVar.f39855w = this.f38991f;
                iResourceLoaderService.loadAsync(uri2, jVar, new C16426g(this, nanoTime, bVar2, bVar, uri), new C16427h(this, nanoTime, bVar2));
                MethodCollector.m26664o(8861);
            }
        } else {
            C89388w wVar = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(8861);
            throw wVar;
        }
    }

    /* renamed from: a */
    private final void m30468a(C17029d<LynxView> dVar, byte[] bArr, JSONObject jSONObject, boolean z) {
        String valueOf = String.valueOf(this.f39431m);
        AbstractC16576j.C16578b.m30778a(this, "start to render js, templateUrl: " + valueOf + ", reload: " + z, null, null, 6);
        if (z) {
            ((LynxView) dVar.f40551a).updateData(String.valueOf(jSONObject));
            return;
        }
        this.f39433o = System.currentTimeMillis();
        C16257i iVar = (C16257i) this.f38994i.mo25832c(C16257i.class);
        if (!(iVar == null || iVar.f39051d != null || iVar.f39049b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = iVar.f39049b;
            if (l == null) {
                C89219l.m154707a();
            }
            iVar.f39051d = Long.valueOf(currentTimeMillis - l.longValue());
        }
        ((LynxView) dVar.f40551a).renderTemplateWithBaseUrl(bArr, String.valueOf(jSONObject), valueOf);
        this.f39435q = System.currentTimeMillis() - this.f39433o;
    }

    /* renamed from: a */
    public final void mo26055a(C17029d<LynxView> dVar, byte[] bArr, TemplateData templateData, boolean z) {
        String valueOf = String.valueOf(this.f39431m);
        AbstractC16576j.C16578b.m30778a(this, "start to render js, templateUrl: " + valueOf + ", reload: " + z, null, null, 6);
        if (z) {
            ((LynxView) dVar.f40551a).updateData(templateData);
            return;
        }
        this.f39433o = System.currentTimeMillis();
        C16257i iVar = (C16257i) this.f38994i.mo25832c(C16257i.class);
        if (!(iVar == null || iVar.f39051d != null || iVar.f39049b == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = iVar.f39049b;
            if (l == null) {
                C89219l.m154707a();
            }
            iVar.f39051d = Long.valueOf(currentTimeMillis - l.longValue());
        }
        ((LynxView) dVar.f40551a).renderTemplateWithBaseUrl(bArr, templateData, valueOf);
        this.f39435q = System.currentTimeMillis() - this.f39433o;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16417i(LynxKitApi lynxKitApi, C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        super(lynxKitApi, zVar, list, fVar, bVar);
        C89219l.m154719c(lynxKitApi, "");
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        this.f39425A = C89250i.m154773a((AbstractC89171a) new C16419b(bVar));
    }
}
