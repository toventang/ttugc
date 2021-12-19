package com.bytedance.android.monitor.lynx;

import com.bytedance.android.monitor.C11905b;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.p716b.C11979a;
import com.bytedance.android.monitor.lynx.p716b.C11980b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11984a;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11985b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11986c;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11987d;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11988e;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11989f;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11991g;
import com.bytedance.android.monitor.lynx.p717c.p719b.C11994c;
import com.bytedance.android.monitor.lynx.p717c.p719b.C11995d;
import com.bytedance.android.monitor.lynx.p717c.p719b.C11996e;
import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p706d.C11917a;
import com.bytedance.android.monitor.p706d.C11918b;
import com.bytedance.android.monitor.p706d.C11924g;
import com.bytedance.android.monitor.p706d.C11925h;
import com.bytedance.android.monitor.p706d.C11927j;
import com.bytedance.android.monitor.p708f.C11929a;
import com.bytedance.android.monitor.p712j.AbstractC11940b;
import com.bytedance.android.monitor.p712j.C11941c;
import com.bytedance.android.monitor.p713k.AbstractC11944b;
import com.bytedance.android.monitor.p713k.C11943a;
import com.bytedance.android.monitor.p713k.C11945c;
import com.bytedance.android.monitor.webview.AbstractC12009a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
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

/* renamed from: com.bytedance.android.monitor.lynx.b */
public final class C11969b implements AbstractC11944b {

    /* renamed from: f */
    public static final C11969b f28620f = C11971b.f28632a;

    /* renamed from: g */
    public static final long f28621g = ((System.currentTimeMillis() * 1000) - (System.nanoTime() / 1000));

    /* renamed from: h */
    public static final C11970a f28622h = new C11970a((byte) 0);

    /* renamed from: a */
    public C11979a f28623a;

    /* renamed from: b */
    public C11994c f28624b;

    /* renamed from: c */
    public C11995d f28625c;

    /* renamed from: d */
    public C11996e f28626d;

    /* renamed from: e */
    public final AbstractC11957a f28627e;

    /* renamed from: i */
    private int f28628i;

    /* renamed from: j */
    private int f28629j;

    /* renamed from: k */
    private long f28630k;

    /* renamed from: l */
    private Executor f28631l;

    /* renamed from: com.bytedance.android.monitor.lynx.b$a */
    public static final class C11970a {
        static {
            Covode.recordClassIndex(13696);
        }

        private C11970a() {
        }

        public /* synthetic */ C11970a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$b */
    static final class C11971b {

        /* renamed from: a */
        static final C11969b f28632a = new C11969b((byte) 0);

        /* renamed from: b */
        public static final C11971b f28633b = new C11971b();

        private C11971b() {
        }

        static {
            Covode.recordClassIndex(13697);
        }
    }

    /* renamed from: a */
    public final boolean mo19186a(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a == null || !a.f28674b || !m21140a().f28563a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo19187a(String str, String str2) {
        C89219l.m154719c(str2, "");
        return this.f28626d.mo19199b(str, str2);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor] */
    /* renamed from: a */
    public final void mo19185a(ExecutorService executorService, AbstractC89171a<C89391z> aVar) {
        if (executorService == 0) {
            executorService = m21142b();
        }
        try {
            executorService.execute(new RunnableC11978i(aVar));
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo19184a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        mo19183a(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, null, jSONObject4, z);
    }

    /* renamed from: a */
    public final void mo19183a(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, boolean z) {
        C11929a.m21041a(new C11973d(this, jSONObject5, lynxView, str2, str, jSONObject, jSONObject2, jSONObject3, jSONObject4, z));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.lynx.b$i */
    public static final class RunnableC11978i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f28671a;

        static {
            Covode.recordClassIndex(13704);
        }

        RunnableC11978i(AbstractC89171a aVar) {
            this.f28671a = aVar;
        }

        public final void run() {
            this.f28671a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$c */
    public static final class C11972c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28634a;

        /* renamed from: b */
        final /* synthetic */ C11985b f28635b;

        /* renamed from: c */
        final /* synthetic */ C11917a f28636c;

        /* renamed from: d */
        final /* synthetic */ C11984a f28637d;

        /* renamed from: e */
        final /* synthetic */ C11980b f28638e;

        static {
            Covode.recordClassIndex(13698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11972c(C11969b bVar, C11985b bVar2, C11917a aVar, C11984a aVar2, C11980b bVar3) {
            super(0);
            this.f28634a = bVar;
            this.f28635b = bVar2;
            this.f28636c = aVar;
            this.f28637d = aVar2;
            this.f28638e = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f28634a.mo19177a((C11969b) this.f28635b, (C11985b) this.f28636c, (C11917a) this.f28637d, (AbstractC11908b) this.f28638e, (C11980b) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$e */
    static final class C11974e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28649a;

        /* renamed from: b */
        final /* synthetic */ C11985b f28650b;

        /* renamed from: c */
        final /* synthetic */ C11917a f28651c;

        /* renamed from: d */
        final /* synthetic */ C11989f f28652d;

        /* renamed from: e */
        final /* synthetic */ C11980b f28653e;

        static {
            Covode.recordClassIndex(13700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11974e(C11969b bVar, C11985b bVar2, C11917a aVar, C11989f fVar, C11980b bVar3) {
            super(0);
            this.f28649a = bVar;
            this.f28650b = bVar2;
            this.f28651c = aVar;
            this.f28652d = fVar;
            this.f28653e = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f28649a.mo19177a((C11969b) this.f28650b, (C11985b) this.f28651c, (C11917a) this.f28652d, (AbstractC11908b) this.f28653e, (C11980b) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$f */
    static final class C11975f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28654a;

        /* renamed from: b */
        final /* synthetic */ C11985b f28655b;

        /* renamed from: c */
        final /* synthetic */ C11917a f28656c;

        /* renamed from: d */
        final /* synthetic */ C11986c f28657d;

        /* renamed from: e */
        final /* synthetic */ C11980b f28658e;

        static {
            Covode.recordClassIndex(13701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11975f(C11969b bVar, C11985b bVar2, C11917a aVar, C11986c cVar, C11980b bVar3) {
            super(0);
            this.f28654a = bVar;
            this.f28655b = bVar2;
            this.f28656c = aVar;
            this.f28657d = cVar;
            this.f28658e = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f28654a.mo19177a((C11969b) this.f28655b, (C11985b) this.f28656c, (C11917a) this.f28657d, (AbstractC11908b) this.f28658e, (C11980b) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$g */
    static final class C11976g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28659a;

        /* renamed from: b */
        final /* synthetic */ C11985b f28660b;

        /* renamed from: c */
        final /* synthetic */ C11917a f28661c;

        /* renamed from: d */
        final /* synthetic */ C11927j f28662d;

        /* renamed from: e */
        final /* synthetic */ C11980b f28663e;

        static {
            Covode.recordClassIndex(13702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11976g(C11969b bVar, C11985b bVar2, C11917a aVar, C11927j jVar, C11980b bVar3) {
            super(0);
            this.f28659a = bVar;
            this.f28660b = bVar2;
            this.f28661c = aVar;
            this.f28662d = jVar;
            this.f28663e = bVar3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f28659a.mo19177a((C11969b) this.f28660b, (C11985b) this.f28661c, (C11917a) this.f28662d, (AbstractC11908b) this.f28663e, (C11980b) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.monitor.lynx.b$h */
    static final class C11977h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28664a;

        /* renamed from: b */
        final /* synthetic */ C11985b f28665b;

        /* renamed from: c */
        final /* synthetic */ C11917a f28666c;

        /* renamed from: d */
        final /* synthetic */ C11918b f28667d;

        /* renamed from: e */
        final /* synthetic */ C11991g f28668e;

        /* renamed from: f */
        final /* synthetic */ C11987d f28669f;

        /* renamed from: g */
        final /* synthetic */ C11980b f28670g;

        static {
            Covode.recordClassIndex(13703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11977h(C11969b bVar, C11985b bVar2, C11917a aVar, C11918b bVar3, C11991g gVar, C11987d dVar, C11980b bVar4) {
            super(0);
            this.f28664a = bVar;
            this.f28665b = bVar2;
            this.f28666c = aVar;
            this.f28667d = bVar3;
            this.f28668e = gVar;
            this.f28669f = dVar;
            this.f28670g = bVar4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C11969b bVar = this.f28664a;
            C11985b bVar2 = this.f28665b;
            C11917a aVar = this.f28666c;
            C11918b bVar3 = this.f28667d;
            C11991g gVar = this.f28668e;
            if (gVar == null) {
                gVar = new C11991g();
            }
            C11987d dVar = this.f28669f;
            C11980b bVar4 = this.f28670g;
            gVar.f28737l = dVar;
            bVar.mo19177a(bVar2, aVar, gVar, bVar4, bVar3);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static C11941c m21140a() {
        HybridMonitor instance = HybridMonitor.getInstance();
        C89219l.m154709a((Object) instance, "");
        AbstractC11940b settingManager = instance.getSettingManager();
        C89219l.m154709a((Object) settingManager, "");
        C11941c c = settingManager.mo19155c();
        C89219l.m154709a((Object) c, "");
        return c;
    }

    static {
        Covode.recordClassIndex(13695);
    }

    private C11969b() {
        C11945c.m21083a("lynx", this);
        this.f28623a = new C11979a();
        this.f28624b = new C11994c();
        this.f28625c = new C11995d();
        this.f28626d = new C11996e();
        this.f28628i = 4;
        this.f28629j = 8;
        this.f28630k = 15;
        this.f28627e = new C11981c();
    }

    /* renamed from: b */
    private final Executor m21142b() {
        if (this.f28631l == null) {
            this.f28631l = new ThreadPoolExecutor(this.f28628i, this.f28629j, this.f28630k, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
        }
        Executor executor = this.f28631l;
        if (executor == null) {
            C89219l.m154707a();
        }
        return executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.monitor.lynx.b$d */
    public static final class C11973d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11969b f28639a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f28640b;

        /* renamed from: c */
        final /* synthetic */ LynxView f28641c;

        /* renamed from: d */
        final /* synthetic */ String f28642d;

        /* renamed from: e */
        final /* synthetic */ String f28643e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f28644f;

        /* renamed from: g */
        final /* synthetic */ JSONObject f28645g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f28646h;

        /* renamed from: i */
        final /* synthetic */ JSONObject f28647i;

        /* renamed from: j */
        final /* synthetic */ boolean f28648j;

        static {
            Covode.recordClassIndex(13699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11973d(C11969b bVar, JSONObject jSONObject, LynxView lynxView, String str, String str2, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, boolean z) {
            super(0);
            this.f28639a = bVar;
            this.f28640b = jSONObject;
            this.f28641c = lynxView;
            this.f28642d = str;
            this.f28643e = str2;
            this.f28644f = jSONObject2;
            this.f28645g = jSONObject3;
            this.f28646h = jSONObject4;
            this.f28647i = jSONObject5;
            this.f28648j = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
            // Method dump skipped, instructions count: 173
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.monitor.lynx.C11969b.C11973d.invoke():java.lang.Object");
        }
    }

    public /* synthetic */ C11969b(byte b) {
        this();
    }

    /* renamed from: b */
    public final void mo19188b(String str, String str2) {
        C89219l.m154719c(str2, "");
        this.f28626d.mo19198a(str, str2);
    }

    /* renamed from: a */
    public final void mo19178a(LynxView lynxView, C11924g gVar) {
        C11985b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(gVar, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a != null && a.f28678f && m21140a().f28566d && (c = this.f28624b.mo19194b(lynxView)) != null) {
            mo19177a((C11969b) c, (C11985b) C11943a.m21078a(lynxView), (C11917a) gVar, (AbstractC11908b) a, (C11980b) null);
        }
    }

    /* renamed from: a */
    public final void mo19179a(LynxView lynxView, C11925h hVar) {
        C11985b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(hVar, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a != null && a.f28678f && m21140a().f28566d && (c = this.f28624b.mo19194b(lynxView)) != null) {
            mo19177a((C11969b) c, (C11985b) C11943a.m21078a(lynxView), (C11917a) hVar, (AbstractC11908b) a, (C11980b) null);
        }
    }

    /* renamed from: a */
    public final void mo19180a(LynxView lynxView, C11986c cVar) {
        C11985b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(cVar, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a != null && a.f28679g && m21140a().f28565c && (c = this.f28624b.mo19194b(lynxView)) != null) {
            mo19185a(C11929a.m21040a(), new C11975f(this, c, C11943a.m21078a(lynxView), cVar, a));
        }
    }

    /* renamed from: a */
    public final void mo19181a(LynxView lynxView, C11989f fVar) {
        C11985b c;
        C89219l.m154719c(lynxView, "");
        C89219l.m154719c(fVar, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a != null && (c = this.f28624b.mo19194b(lynxView)) != null) {
            mo19185a(C11929a.m21040a(), new C11974e(this, c, C11943a.m21078a(lynxView), fVar, a));
        }
    }

    /* renamed from: a */
    public final void mo19182a(LynxView lynxView, C11991g gVar) {
        C11985b c;
        C89219l.m154719c(lynxView, "");
        C11980b a = this.f28623a.mo19190a(lynxView);
        if (a != null && a.f28675c && (c = this.f28624b.mo19194b(lynxView)) != null) {
            String str = c.f28530b;
            if (!mo19187a(str, "perf")) {
                mo19188b(str, "perf");
                mo19185a(C11929a.m21040a(), new C11977h(this, c, C11943a.m21078a(lynxView), C11943a.m21080b(lynxView), gVar, (C11987d) this.f28625c.mo19194b(lynxView), a));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo19177a(C11985b bVar, C11917a aVar, AbstractC11908b bVar2, C11980b bVar3, C11918b bVar4) {
        C11988e eVar = new C11988e(bVar, bVar2, aVar, bVar4);
        if (bVar3.f28674b) {
            eVar.f28718a = bVar3.f28673a;
            AbstractC12009a aVar2 = bVar3.f28680h;
            if (aVar2 != null) {
                C11905b.m20995a(eVar, aVar2);
            }
        }
    }
}
