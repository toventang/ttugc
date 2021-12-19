package com.bytedance.android.monitorV2.lynx;

import android.view.View;
import com.bytedance.android.monitorV2.C12074b;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.lynx.p742b.C12151a;
import com.bytedance.android.monitorV2.lynx.p742b.C12152b;
import com.bytedance.android.monitorV2.lynx.p742b.C12153c;
import com.bytedance.android.monitorV2.lynx.p742b.C12154d;
import com.bytedance.android.monitorV2.lynx.p743c.p744a.C12164a;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12165a;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12166b;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12167c;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12168d;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12169e;
import com.bytedance.android.monitorV2.lynx.p743c.p745b.C12171f;
import com.bytedance.android.monitorV2.lynx.p743c.p746c.C12174c;
import com.bytedance.android.monitorV2.lynx.p743c.p746c.C12175d;
import com.bytedance.android.monitorV2.lynx.p743c.p746c.C12176e;
import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p731d.C12081a;
import com.bytedance.android.monitorV2.p731d.C12082b;
import com.bytedance.android.monitorV2.p731d.C12083c;
import com.bytedance.android.monitorV2.p731d.C12084d;
import com.bytedance.android.monitorV2.p731d.C12089h;
import com.bytedance.android.monitorV2.p731d.C12091j;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p734g.C12095a;
import com.bytedance.android.monitorV2.p735h.AbstractC12113f;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p739k.AbstractC12120c;
import com.bytedance.android.monitorV2.p739k.C12118a;
import com.bytedance.android.monitorV2.p739k.C12119b;
import com.bytedance.android.monitorV2.p739k.C12121d;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.android.monitorV2.p740l.C12126c;
import com.bytedance.android.monitorV2.webview.AbstractC12190b;
import com.bytedance.android.monitorV2.webview.C12188a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c */
public final class C12155c implements AbstractC12120c {

    /* renamed from: j */
    public static final C12155c f29212j = C12157b.f29228a;

    /* renamed from: k */
    public static final long f29213k = ((System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000));

    /* renamed from: l */
    public static final C12156a f29214l = new C12156a((byte) 0);

    /* renamed from: a */
    public C12153c f29215a;

    /* renamed from: b */
    public C12154d f29216b;

    /* renamed from: c */
    public C12151a f29217c;

    /* renamed from: d */
    public C12174c f29218d;

    /* renamed from: e */
    public C12175d f29219e;

    /* renamed from: f */
    public C12095a f29220f;

    /* renamed from: g */
    public C12176e f29221g;

    /* renamed from: h */
    public C12164a f29222h;

    /* renamed from: i */
    public final AbstractC12136a f29223i;

    /* renamed from: m */
    private int f29224m;

    /* renamed from: n */
    private int f29225n;

    /* renamed from: o */
    private long f29226o;

    /* renamed from: p */
    private Executor f29227p;

    @Override // com.bytedance.android.monitorV2.p739k.AbstractC12120c
    /* renamed from: a */
    public final void mo19495a(String str, Object obj) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(obj, "");
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c$a */
    public static final class C12156a {
        static {
            Covode.recordClassIndex(13885);
        }

        private C12156a() {
        }

        public /* synthetic */ C12156a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c$b */
    static final class C12157b {

        /* renamed from: a */
        static final C12155c f29228a = new C12155c((byte) 0);

        /* renamed from: b */
        public static final C12157b f29229b = new C12157b();

        private C12157b() {
        }

        static {
            Covode.recordClassIndex(13886);
        }
    }

    /* renamed from: a */
    public final void mo19524a(LynxView lynxView, String str) {
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(str, "");
        C12115b.m21583b("LynxViewMonitor", "addUrlBid: bid: ".concat(String.valueOf(str)));
        if (lynxView.getTemplateUrl() != null) {
            this.f29215a.mo19516a(lynxView.getTemplateUrl(), str);
        }
    }

    /* renamed from: a */
    public final void mo19523a(LynxView lynxView, C12171f fVar) {
        C12166b c;
        C89219l.m154719c(lynxView, "");
        C12115b.m21583b("LynxViewMonitor", "reportPerf");
        C12152b a = this.f29217c.mo19514a(lynxView);
        if (a != null && m21709a().mo19473g() && (c = this.f29218d.mo19536b(lynxView)) != null) {
            C12081a a2 = C12118a.m21594a(lynxView);
            C12082b b = C12118a.m21597b(lynxView);
            String str = c.f29010b;
            if (!mo19527a(str, "perf")) {
                mo19529b(str, "perf");
                c.mo19442a(mo19528b(lynxView), mo19519a(lynxView));
                mo19526a(C12093a.m21522a(), new C12162g(this, lynxView, c, a2, b, fVar, (C12167c) this.f29219e.mo19536b(lynxView), a));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo19527a(String str, String str2) {
        C89219l.m154719c(str2, "");
        return this.f29220f.mo19446b(str, str2);
    }

    /* renamed from: a */
    public final void mo19522a(LynxView lynxView, C12169e eVar) {
        C12166b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(eVar, "");
        C12115b.m21583b("LynxViewMonitor", "reportError");
        C12152b a = this.f29217c.mo19514a(lynxView);
        if (a != null && (c = this.f29218d.mo19536b(lynxView)) != null) {
            c.mo19442a(mo19528b(lynxView), mo19519a(lynxView));
            C12081a a2 = C12118a.m21594a(lynxView);
            m21711a(eVar);
            mo19526a(C12093a.m21522a(), new C12160e(this, lynxView, c, a2, eVar, a));
        }
    }

    /* renamed from: a */
    public final void mo19520a(LynxView lynxView, C12089h hVar) {
        C12152b a;
        C12166b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(hVar, "");
        C12115b.m21583b("LynxViewMonitor", "reportJsbInfo");
        if (m21709a().mo19475i() && (a = this.f29217c.mo19514a(lynxView)) != null && (c = this.f29218d.mo19536b(lynxView)) != null) {
            c.mo19442a(mo19528b(lynxView), mo19519a(lynxView));
            mo19521a((C12155c) lynxView, (LynxView) c, (C12166b) C12118a.m21594a(lynxView), (C12081a) hVar, (AbstractC12067b) a, (C12152b) null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor] */
    /* renamed from: a */
    public final void mo19526a(ExecutorService executorService, AbstractC89171a<C89391z> aVar) {
        if (executorService == 0) {
            executorService = m21715b();
        }
        try {
            executorService.execute(new RunnableC12163h(aVar));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19521a(LynxView lynxView, C12166b bVar, C12081a aVar, AbstractC12067b bVar2, C12152b bVar3, C12082b bVar4) {
        String str = bVar.f29010b;
        if (!mo19527a(str, "has_report_perf_before")) {
            this.f29222h.mo19533a(str, bVar2);
            if (bVar2 != null && C89219l.m154714a((Object) "performance", (Object) bVar2.f28927a)) {
                mo19529b(str, "has_report_perf_before");
            }
        }
        if (mo19527a(str, "has_report_perf_before")) {
            List<AbstractC12067b> a = this.f29222h.mo19532a(str);
            if (a == null || a.isEmpty()) {
                m21714a(lynxView, new C12168d(bVar, bVar2, aVar, bVar4), bVar3);
                return;
            }
            for (AbstractC12067b bVar5 : a) {
                m21714a(lynxView, new C12168d(bVar, bVar5, aVar, bVar4), bVar3);
            }
        }
    }

    /* renamed from: a */
    public final void mo19525a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        C12115b.m21583b("LynxViewMonitor", "reportCustom: eventType: ".concat(String.valueOf(str)));
        C12084d a = new C12084d.C12085a(str).mo19433a(str2).mo19434a(jSONObject).mo19436b(jSONObject2).mo19437c(jSONObject3).mo19438d(jSONObject4).mo19439e(null).mo19432a(i).mo19435a();
        C89219l.m154709a((Object) a, "");
        m21713a(lynxView, a);
    }

    @Override // com.bytedance.android.monitorV2.p739k.AbstractC12120c
    /* renamed from: a */
    public final void mo19494a(View view, C12081a aVar, C12119b bVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        C12115b.m21583b("LynxViewMonitor", "reportContainerError: errorCode: " + bVar.f29144a);
        try {
            C12152b bVar2 = new C12152b(bVar.f29147d, new C12188a());
            C12166b bVar3 = new C12166b();
            bVar3.f29013e = bVar.f29146c;
            bVar3.f29272k = 999;
            C12083c cVar = new C12083c();
            C12082b a = bVar.mo19490a();
            if (C89219l.m154714a((Object) "containerError", (Object) cVar.f28927a)) {
                m21714a((LynxView) null, new C12168d(bVar3, cVar, aVar, a), bVar2);
            }
        } catch (Throwable unused) {
            C12126c.m21636a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.lynx.c$h */
    public static final class RunnableC12163h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f29259a;

        static {
            Covode.recordClassIndex(13892);
        }

        RunnableC12163h(AbstractC89171a aVar) {
            this.f29259a = aVar;
        }

        public final void run() {
            this.f29259a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c$c */
    public static final class C12158c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12155c f29230a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29231b;

        /* renamed from: c */
        final /* synthetic */ C12166b f29232c;

        /* renamed from: d */
        final /* synthetic */ C12081a f29233d;

        /* renamed from: e */
        final /* synthetic */ C12165a f29234e;

        /* renamed from: f */
        final /* synthetic */ C12152b f29235f;

        static {
            Covode.recordClassIndex(13887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12158c(C12155c cVar, LynxView lynxView, C12166b bVar, C12081a aVar, C12165a aVar2, C12152b bVar2) {
            super(0);
            this.f29230a = cVar;
            this.f29231b = lynxView;
            this.f29232c = bVar;
            this.f29233d = aVar;
            this.f29234e = aVar2;
            this.f29235f = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f29230a.mo19521a((C12155c) this.f29231b, (LynxView) this.f29232c, (C12166b) this.f29233d, (C12081a) this.f29234e, (AbstractC12067b) this.f29235f, (C12152b) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.lynx.c$e */
    public static final class C12160e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12155c f29239a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29240b;

        /* renamed from: c */
        final /* synthetic */ C12166b f29241c;

        /* renamed from: d */
        final /* synthetic */ C12081a f29242d;

        /* renamed from: e */
        final /* synthetic */ C12169e f29243e;

        /* renamed from: f */
        final /* synthetic */ C12152b f29244f;

        static {
            Covode.recordClassIndex(13889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12160e(C12155c cVar, LynxView lynxView, C12166b bVar, C12081a aVar, C12169e eVar, C12152b bVar2) {
            super(0);
            this.f29239a = cVar;
            this.f29240b = lynxView;
            this.f29241c = bVar;
            this.f29242d = aVar;
            this.f29243e = eVar;
            this.f29244f = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f29239a.mo19521a((C12155c) this.f29240b, (LynxView) this.f29241c, (C12166b) this.f29242d, (C12081a) this.f29243e, (AbstractC12067b) this.f29244f, (C12152b) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.monitorV2.lynx.c$f */
    static final class C12161f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12155c f29245a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29246b;

        /* renamed from: c */
        final /* synthetic */ C12166b f29247c;

        /* renamed from: d */
        final /* synthetic */ C12081a f29248d;

        /* renamed from: e */
        final /* synthetic */ C12091j f29249e;

        /* renamed from: f */
        final /* synthetic */ C12152b f29250f;

        static {
            Covode.recordClassIndex(13890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12161f(C12155c cVar, LynxView lynxView, C12166b bVar, C12081a aVar, C12091j jVar, C12152b bVar2) {
            super(0);
            this.f29245a = cVar;
            this.f29246b = lynxView;
            this.f29247c = bVar;
            this.f29248d = aVar;
            this.f29249e = jVar;
            this.f29250f = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f29245a.mo19521a((C12155c) this.f29246b, (LynxView) this.f29247c, (C12166b) this.f29248d, (C12081a) this.f29249e, (AbstractC12067b) this.f29250f, (C12152b) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.lynx.c$g */
    public static final class C12162g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12155c f29251a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29252b;

        /* renamed from: c */
        final /* synthetic */ C12166b f29253c;

        /* renamed from: d */
        final /* synthetic */ C12081a f29254d;

        /* renamed from: e */
        final /* synthetic */ C12082b f29255e;

        /* renamed from: f */
        final /* synthetic */ C12171f f29256f;

        /* renamed from: g */
        final /* synthetic */ C12167c f29257g;

        /* renamed from: h */
        final /* synthetic */ C12152b f29258h;

        static {
            Covode.recordClassIndex(13891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12162g(C12155c cVar, LynxView lynxView, C12166b bVar, C12081a aVar, C12082b bVar2, C12171f fVar, C12167c cVar2, C12152b bVar3) {
            super(0);
            this.f29251a = cVar;
            this.f29252b = lynxView;
            this.f29253c = bVar;
            this.f29254d = aVar;
            this.f29255e = bVar2;
            this.f29256f = fVar;
            this.f29257g = cVar2;
            this.f29258h = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C12155c cVar = this.f29251a;
            LynxView lynxView = this.f29252b;
            C12166b bVar = this.f29253c;
            C12081a aVar = this.f29254d;
            C12082b bVar2 = this.f29255e;
            C12171f fVar = this.f29256f;
            if (fVar == null) {
                fVar = new C12171f();
            }
            C12167c cVar2 = this.f29257g;
            C12152b bVar3 = this.f29258h;
            fVar.f29302l = cVar2;
            cVar.mo19521a(lynxView, bVar, aVar, fVar, bVar3, bVar2);
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(13884);
    }

    /* renamed from: a */
    public static C12103e m21709a() {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        AbstractC12113f hybridSettingManager = instance.getHybridSettingManager();
        C89219l.m154709a((Object) hybridSettingManager, "");
        C12103e c = hybridSettingManager.mo19480c();
        C89219l.m154709a((Object) c, "");
        return c;
    }

    /* renamed from: b */
    private final Executor m21715b() {
        if (this.f29227p == null) {
            this.f29227p = new ThreadPoolExecutor(this.f29224m, this.f29225n, this.f29226o, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        Executor executor = this.f29227p;
        if (executor == null) {
            C89219l.m154707a();
        }
        return executor;
    }

    private C12155c() {
        C12121d.m21609a("lynx", this);
        this.f29215a = new C12153c();
        this.f29216b = new C12154d();
        this.f29217c = new C12151a();
        this.f29218d = new C12174c();
        this.f29219e = new C12175d();
        this.f29220f = new C12095a();
        this.f29221g = new C12176e();
        this.f29222h = new C12164a();
        this.f29224m = 4;
        this.f29225n = 8;
        this.f29226o = 15;
        this.f29223i = new C12148b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitorV2.lynx.c$d */
    public static final class C12159d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C12155c f29236a;

        /* renamed from: b */
        final /* synthetic */ LynxView f29237b;

        /* renamed from: c */
        final /* synthetic */ C12084d f29238c;

        static {
            Covode.recordClassIndex(13888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12159d(C12155c cVar, LynxView lynxView, C12084d dVar) {
            super(0);
            this.f29236a = cVar;
            this.f29237b = lynxView;
            this.f29238c = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
            // Method dump skipped, instructions count: 304
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitorV2.lynx.C12155c.C12159d.invoke():java.lang.Object");
        }
    }

    public /* synthetic */ C12155c(byte b) {
        this();
    }

    /* renamed from: b */
    public final C12097a.C12098a mo19528b(LynxView lynxView) {
        return m21708a(mo19519a(lynxView));
    }

    /* renamed from: a */
    public static C12097a.C12098a m21708a(String str) {
        HybridMultiMonitor instance = HybridMultiMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        AbstractC12113f hybridSettingManager = instance.getHybridSettingManager();
        C89219l.m154709a((Object) hybridSettingManager, "");
        C12097a.C12098a a = hybridSettingManager.mo19479b().mo19449a(str);
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* renamed from: c */
    public final boolean mo19530c(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C12152b a = this.f29217c.mo19514a(lynxView);
        if ((a == null || a.f29204b) && m21709a().mo19467a() && m21709a().mo19472f()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m21711a(C12169e eVar) {
        if (eVar.f29290c == 201) {
            eVar.f28927a = "js_exception";
        } else if (eVar.f29290c == 301) {
            eVar.f28927a = "static";
        }
    }

    /* renamed from: a */
    public final String mo19519a(LynxView lynxView) {
        String str;
        if (lynxView == null) {
            return "";
        }
        C12152b a = this.f29217c.mo19514a(lynxView);
        if (a != null) {
            str = a.f29203a;
        } else {
            str = null;
        }
        String valueOf = String.valueOf(str);
        String a2 = this.f29215a.mo19515a(lynxView.getTemplateUrl());
        return a2 != null ? a2 : valueOf;
    }

    /* renamed from: b */
    public final void mo19529b(String str, String str2) {
        C89219l.m154719c(str2, "");
        this.f29220f.mo19445a(str, str2);
    }

    /* renamed from: a */
    private void m21713a(LynxView lynxView, C12084d dVar) {
        C89219l.m154719c(dVar, "");
        C12093a.m21523a(new C12159d(this, lynxView, dVar));
    }

    /* renamed from: a */
    private static void m21710a(C12168d dVar, C12152b bVar, String str) {
        if (bVar.f29204b) {
            dVar.f29283a = str;
            AbstractC12190b bVar2 = bVar.f29206d;
            if (bVar2 != null) {
                C12074b.m21492a(dVar, bVar2);
            }
        }
    }

    /* renamed from: a */
    private final void m21714a(LynxView lynxView, C12168d dVar, C12152b bVar) {
        if (C12125b.m21632a(dVar.mo19427h(), mo19528b(lynxView))) {
            m21710a(dVar, bVar, mo19519a(lynxView));
            C12115b.m21583b("LynxViewMonitor", C89219l.m154704a(dVar.mo19427h(), (Object) "_lynx hit"));
            return;
        }
        C12115b.m21583b("LynxViewMonitor", C89219l.m154704a(dVar.mo19427h(), (Object) "_lynx not hit"));
    }
}
