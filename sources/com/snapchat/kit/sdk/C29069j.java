package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snapchat.kit.sdk.core.config.C28965f;
import com.snapchat.kit.sdk.core.config.C28969g;
import com.snapchat.kit.sdk.core.config.ConfigClient;
import com.snapchat.kit.sdk.core.controller.C28971b;
import com.snapchat.kit.sdk.core.controller.C28978c;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.C28983b;
import com.snapchat.kit.sdk.core.metrics.C28994c;
import com.snapchat.kit.sdk.core.metrics.C29006e;
import com.snapchat.kit.sdk.core.metrics.C29007f;
import com.snapchat.kit.sdk.core.metrics.C29008g;
import com.snapchat.kit.sdk.core.metrics.C29009h;
import com.snapchat.kit.sdk.core.metrics.C29010i;
import com.snapchat.kit.sdk.core.metrics.C29011j;
import com.snapchat.kit.sdk.core.metrics.C29012k;
import com.snapchat.kit.sdk.core.metrics.C29013l;
import com.snapchat.kit.sdk.core.metrics.C29014m;
import com.snapchat.kit.sdk.core.metrics.C29015n;
import com.snapchat.kit.sdk.core.metrics.C29017o;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.core.metrics.p2068a.C28980a;
import com.snapchat.kit.sdk.core.metrics.p2068a.C28982b;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28991a;
import com.snapchat.kit.sdk.core.metrics.p2069b.C28993b;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28995a;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28996b;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28998c;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28999d;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29000e;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29001f;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29002g;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29003h;
import com.snapchat.kit.sdk.core.metrics.p2070c.C29004i;
import com.snapchat.kit.sdk.core.metrics.skate.C29018a;
import com.snapchat.kit.sdk.core.metrics.skate.C29020b;
import com.snapchat.kit.sdk.core.metrics.skate.C29021c;
import com.snapchat.kit.sdk.core.metrics.skate.C29023d;
import com.snapchat.kit.sdk.core.metrics.skate.C29024e;
import com.snapchat.kit.sdk.core.metrics.skate.SkateClient;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C29025a;
import com.snapchat.kit.sdk.core.networking.C29027c;
import com.snapchat.kit.sdk.core.networking.C29028d;
import com.snapchat.kit.sdk.core.networking.C29029e;
import com.snapchat.kit.sdk.core.networking.C29031g;
import com.snapchat.kit.sdk.core.networking.C29033h;
import com.snapchat.kit.sdk.core.networking.C29034i;
import com.snapchat.kit.sdk.core.networking.C29035j;
import com.snapchat.kit.sdk.core.networking.C29037l;
import com.snapchat.kit.sdk.core.networking.C29039m;
import com.snapchat.kit.sdk.core.networking.FirebaseExtensionClient;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import com.snapchat.kit.sdk.core.security.Fingerprint_Factory;
import com.snapchat.kit.sdk.core.security.SecureSharedPreferences;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88076a;
import dagger.p4535a.C88077b;
import dagger.p4535a.C88081f;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import javax.p4631a.AbstractC89405a;
import okhttp3.C90040c;
import okhttp3.C90208y;

/* renamed from: com.snapchat.kit.sdk.j */
public final class C29069j implements SnapKitComponent {

    /* renamed from: A */
    private AbstractC89405a<Boolean> f68660A;

    /* renamed from: B */
    private AbstractC89405a<C28995a> f68661B;

    /* renamed from: C */
    private AbstractC89405a<C29001f> f68662C;

    /* renamed from: D */
    private AbstractC89405a<C28980a> f68663D;

    /* renamed from: E */
    private AbstractC89405a<MetricQueue<OpMetric>> f68664E;

    /* renamed from: F */
    private AbstractC89405a<C29073m> f68665F;

    /* renamed from: G */
    private C29085n f68666G;

    /* renamed from: H */
    private AbstractC89405a<C29015n> f68667H;

    /* renamed from: I */
    private AbstractC89405a<ConfigClient> f68668I;

    /* renamed from: J */
    private AbstractC89405a<C28965f> f68669J;

    /* renamed from: K */
    private AbstractC89405a<Random> f68670K;

    /* renamed from: L */
    private AbstractC89405a<C29023d> f68671L;

    /* renamed from: M */
    private AbstractC89405a<SkateClient> f68672M;

    /* renamed from: N */
    private AbstractC89405a<C29018a> f68673N;

    /* renamed from: O */
    private AbstractC89405a<MetricQueue<SkateEvent>> f68674O;

    /* renamed from: P */
    private AbstractC89405a<SnapKitInitType> f68675P;

    /* renamed from: Q */
    private AbstractC89405a<C29021c> f68676Q;

    /* renamed from: R */
    private AbstractC89405a<SnapKitAppLifecycleObserver> f68677R;

    /* renamed from: a */
    private AbstractC89405a<Context> f68678a;

    /* renamed from: b */
    private AbstractC89405a<C27910f> f68679b;

    /* renamed from: c */
    private AbstractC89405a<SharedPreferences> f68680c;

    /* renamed from: d */
    private AbstractC89405a<SecureSharedPreferences> f68681d;

    /* renamed from: e */
    private AbstractC89405a<C29072l> f68682e;

    /* renamed from: f */
    private AbstractC89405a<Handler> f68683f;

    /* renamed from: g */
    private AbstractC89405a<C28971b> f68684g;

    /* renamed from: h */
    private AbstractC89405a<C90208y> f68685h;

    /* renamed from: i */
    private AbstractC89405a<C90040c> f68686i;

    /* renamed from: j */
    private AbstractC89405a<String> f68687j;

    /* renamed from: k */
    private AbstractC89405a<Fingerprint> f68688k;

    /* renamed from: l */
    private AbstractC89405a<C29027c> f68689l;

    /* renamed from: m */
    private AbstractC89405a<C29031g> f68690m;

    /* renamed from: n */
    private AbstractC89405a<C29034i> f68691n;

    /* renamed from: o */
    private AbstractC89405a<C29025a> f68692o;

    /* renamed from: p */
    private AbstractC89405a<FirebaseExtensionClient> f68693p;

    /* renamed from: q */
    private AbstractC89405a<C29037l> f68694q;

    /* renamed from: r */
    private AbstractC89405a<C29004i> f68695r;

    /* renamed from: s */
    private AbstractC89405a<MetricsClient> f68696s;

    /* renamed from: t */
    private AbstractC89405a<C28991a> f68697t;

    /* renamed from: u */
    private AbstractC89405a<C28996b> f68698u;

    /* renamed from: v */
    private AbstractC89405a<ScheduledExecutorService> f68699v;

    /* renamed from: w */
    private AbstractC89405a f68700w;

    /* renamed from: x */
    private AbstractC89405a<C28983b<ServerEvent>> f68701x;

    /* renamed from: y */
    private AbstractC89405a<C28999d> f68702y;

    /* renamed from: z */
    private AbstractC89405a<KitPluginType> f68703z;

    static {
        Covode.recordClassIndex(35418);
    }

    /* renamed from: com.snapchat.kit.sdk.j$a */
    public static final class C29070a {

        /* renamed from: a */
        C29085n f68704a;

        static {
            Covode.recordClassIndex(35419);
        }

        private C29070a() {
        }

        /* synthetic */ C29070a(byte b) {
            this();
        }
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final boolean sdkIsFromReactNativePlugin() {
        return this.f68666G.f68754g;
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<ServerEvent> analyticsEventQueue() {
        return this.f68702y.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final C29025a apiFactory() {
        return this.f68692o.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final AuthTokenManager authTokenManager() {
        return (AuthTokenManager) C88081f.m153153a(this.f68665F.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final String clientId() {
        return (String) C88081f.m153153a(this.f68666G.f68749b, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final Context context() {
        return this.f68678a.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final FirebaseStateController firebaseStateController() {
        return (FirebaseStateController) C88081f.m153153a(this.f68684g.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final FirebaseTokenManager firebaseTokenManager() {
        return (FirebaseTokenManager) C88081f.m153153a(this.f68665F.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final C27910f gson() {
        return this.f68679b.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final KitPluginType kitPluginType() {
        return (KitPluginType) C88081f.m153153a(this.f68666G.f68753f, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final LoginStateController loginStateController() {
        return (LoginStateController) C88081f.m153153a(this.f68684g.get(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<OpMetric> operationalMetricsQueue() {
        return this.f68664E.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final String redirectUrl() {
        return (String) C88081f.m153153a(this.f68666G.f68750c, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final SharedPreferences sharedPreferences() {
        return this.f68680c.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final SnapKitAppLifecycleObserver snapKitAppLifecycleObserver() {
        return this.f68677R.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final C28995a kitEventBaseFactory() {
        return new C28995a(clientId(), kitPluginType(), sdkIsFromReactNativePlugin());
    }

    @Override // com.snapchat.kit.sdk.SnapKitProvidingComponent
    public final MetricQueue<SnapKitStorySnapView> snapViewEventQueue() {
        C28983b bVar = new C28983b(this.f68667H.get(), this.f68699v.get(), (C28994c) this.f68700w.get(), 10);
        bVar.mo50354a();
        return (MetricQueue) C88081f.m153153a(bVar, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.snapchat.kit.sdk.SnapKitComponent
    public final void inject(ActivityC29063d dVar) {
        dVar.f68651a = this.f68665F.get();
    }

    @Override // com.snapchat.kit.sdk.SnapKitComponent
    public final void inject(AbstractActivityC28935a aVar) {
        aVar.f68366a = this.f68665F.get();
        aVar.f68367b = loginStateController();
    }

    private C29069j(C29070a aVar) {
        this.f68678a = C88077b.m153149a(new C29088q(aVar.f68704a));
        this.f68679b = C88077b.m153149a(new C29091t(aVar.f68704a));
        this.f68680c = C88077b.m153149a(new C28944aa(aVar.f68704a));
        this.f68681d = C88077b.m153149a(new C29097z(aVar.f68704a, this.f68679b, this.f68680c));
        this.f68682e = C88077b.m153149a(new C29090s(aVar.f68704a, this.f68680c, this.f68679b));
        C29066g gVar = new C29066g(aVar.f68704a);
        this.f68683f = gVar;
        this.f68684g = C88077b.m153149a(new C28978c(gVar));
        this.f68685h = C88077b.m153149a(new C29094w(aVar.f68704a));
        this.f68686i = C88077b.m153149a(new C29086o(aVar.f68704a));
        this.f68665F = new C88076a();
        this.f68687j = new C29087p(aVar.f68704a);
        AbstractC88078c<Fingerprint> create = Fingerprint_Factory.create(this.f68678a);
        this.f68688k = create;
        this.f68689l = new C29028d(this.f68665F, this.f68684g, this.f68687j, create, this.f68679b);
        this.f68690m = new C29033h(this.f68665F, this.f68684g, this.f68687j, this.f68679b);
        C29035j jVar = new C29035j(this.f68687j, this.f68688k);
        this.f68691n = jVar;
        this.f68692o = C88077b.m153149a(new C29029e(this.f68686i, this.f68679b, this.f68689l, this.f68690m, jVar));
        AbstractC89405a<FirebaseExtensionClient> a = C88077b.m153149a(new C29089r(aVar.f68704a, this.f68692o));
        this.f68693p = a;
        this.f68694q = C88077b.m153149a(new C29039m(a, this.f68679b));
        this.f68695r = new C29013l(this.f68680c);
        this.f68696s = C88077b.m153149a(new C29009h(this.f68692o));
        C28993b bVar = new C28993b(this.f68679b);
        this.f68697t = bVar;
        this.f68698u = C88077b.m153149a(new C28998c(this.f68680c, this.f68695r, this.f68696s, bVar));
        AbstractC89405a<ScheduledExecutorService> a2 = C88077b.m153149a(C29012k.f68533a);
        this.f68699v = a2;
        AbstractC89405a a3 = C88077b.m153149a(new C29010i(this.f68678a, a2));
        this.f68700w = a3;
        C29006e eVar = new C29006e(this.f68698u, this.f68699v, a3);
        this.f68701x = eVar;
        this.f68702y = C88077b.m153149a(new C29000e(this.f68695r, eVar));
        this.f68703z = new C29092u(aVar.f68704a);
        C29096y yVar = new C29096y(aVar.f68704a);
        this.f68660A = yVar;
        C29003h hVar = new C29003h(this.f68687j, this.f68703z, yVar);
        this.f68661B = hVar;
        this.f68662C = new C29002g(hVar);
        AbstractC89405a<C28980a> a4 = C88077b.m153149a(new C28982b(this.f68680c, this.f68696s, this.f68697t));
        this.f68663D = a4;
        this.f68664E = C88077b.m153149a(new C29011j(a4, this.f68699v, this.f68700w));
        C88076a aVar2 = (C88076a) this.f68665F;
        AbstractC89405a<T> a5 = C88077b.m153149a(new C29093v(aVar.f68704a, this.f68681d, this.f68682e, this.f68684g, this.f68685h, this.f68694q, this.f68679b, this.f68702y, this.f68662C, this.f68664E));
        this.f68665F = a5;
        C88081f.m153152a(a5);
        if (aVar2.f199985a == null) {
            aVar2.f199985a = a5;
            this.f68666G = aVar.f68704a;
            this.f68667H = C88077b.m153149a(new C29017o(this.f68680c, this.f68696s, this.f68697t, this.f68687j));
            AbstractC89405a<ConfigClient> a6 = C88077b.m153149a(new C29007f(this.f68692o));
            this.f68668I = a6;
            this.f68669J = C88077b.m153149a(new C28969g(a6, this.f68680c));
            C29095x xVar = new C29095x(aVar.f68704a);
            this.f68670K = xVar;
            this.f68671L = new C29024e(this.f68680c, xVar);
            AbstractC89405a<SkateClient> a7 = C88077b.m153149a(new C29014m(this.f68692o));
            this.f68672M = a7;
            AbstractC89405a<C29018a> a8 = C88077b.m153149a(new C29020b(this.f68669J, this.f68680c, this.f68695r, a7, this.f68697t));
            this.f68673N = a8;
            this.f68674O = C88077b.m153149a(new C29008g(a8, this.f68699v, this.f68700w));
            this.f68675P = new C29065f(aVar.f68704a);
            this.f68676Q = C88077b.m153149a(new C28945ab(aVar.f68704a, this.f68669J, this.f68671L, this.f68674O, this.f68665F, this.f68675P));
            this.f68677R = C88077b.m153149a(new C28946ac(aVar.f68704a, this.f68676Q));
            return;
        }
        throw new IllegalStateException();
    }

    /* synthetic */ C29069j(C29070a aVar, byte b) {
        this(aVar);
    }
}
