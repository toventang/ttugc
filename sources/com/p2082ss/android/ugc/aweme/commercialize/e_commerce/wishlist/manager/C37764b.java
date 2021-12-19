package com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.C16343g;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16326f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.C17031d;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.base.EnumC16636e;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.bullet.utils.C35301c;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.p2542a.C37700a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.api.WishListBulletApi;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2547a.AbstractC37735a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d.AbstractC37742a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d.AbstractC37746b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d.C37750c;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2550d.C37751d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AbstractC33378i;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88736bo;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4589j.C88937c;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b */
public final class C37764b implements AbstractC17046h.AbstractC17048b {

    /* renamed from: g */
    public static final String f89174g = C37764b.class.getSimpleName();

    /* renamed from: h */
    public static final C37765a f89175h = new C37765a((byte) 0);

    /* renamed from: a */
    public final C88411a f89176a = new C88411a();

    /* renamed from: b */
    public final C88958b<AbstractC37742a> f89177b;

    /* renamed from: c */
    public final C88958b<AbstractC37746b> f89178c;

    /* renamed from: d */
    public String f89179d;

    /* renamed from: e */
    final AbstractC1202k f89180e;

    /* renamed from: f */
    public final IAdLandPagePreloadService f89181f;

    /* renamed from: i */
    private boolean f89182i;

    /* renamed from: j */
    private long f89183j;

    /* renamed from: k */
    private final WishListBulletApi f89184k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$g */
    public static final class C37771g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C37771g f89190a = new C37771g();

        static {
            Covode.recordClassIndex(45218);
        }

        C37771g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$i */
    public static final class C37773i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C37773i f89192a = new C37773i();

        static {
            Covode.recordClassIndex(45220);
        }

        C37773i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$l */
    static final class C37776l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C37776l f89196a = new C37776l();

        static {
            Covode.recordClassIndex(45223);
        }

        C37776l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(qVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$a */
    public static final class C37765a {
        static {
            Covode.recordClassIndex(45212);
        }

        private C37765a() {
        }

        public /* synthetic */ C37765a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$m */
    public static final class C37777m implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f89197a = new JSONObject();

        /* renamed from: b */
        private final String f89198b = "favoritePageShow";

        static {
            Covode.recordClassIndex(45224);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f89198b;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f89197a;
        }

        C37777m() {
        }
    }

    /* renamed from: b */
    private static boolean m76389b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(45211);
    }

    /* renamed from: a */
    public final void mo65777a() {
        AbstractC88412b a = this.f89184k.getWishListGeckoChannel().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143285c(new C37766b(this)).mo143254a(new C37767c(this), new C37768d(this));
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f89176a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$e */
    public static final class C37769e<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C37769e f89188a = new C37769e();

        static {
            Covode.recordClassIndex(45216);
        }

        C37769e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89219l.m154721d(obj, "");
            return obj instanceof AbstractC37742a.C37745c;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$b */
    static final class C37766b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37764b f89185a;

        static {
            Covode.recordClassIndex(45213);
        }

        C37766b(C37764b bVar) {
            this.f89185a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f89185a.f89177b.onNext(AbstractC37742a.C37744b.f89139a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$d */
    static final class C37768d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37764b f89187a;

        static {
            Covode.recordClassIndex(45215);
        }

        C37768d(C37764b bVar) {
            this.f89187a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f89187a.f89177b.onNext(AbstractC37742a.C37743a.f89138a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$c */
    static final class C37767c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37764b f89186a;

        static {
            Covode.recordClassIndex(45214);
        }

        C37767c(C37764b bVar) {
            this.f89186a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C37751d dVar = (C37751d) obj;
            C88958b<AbstractC37742a> bVar = this.f89186a.f89177b;
            C89219l.m154716b(dVar, "");
            bVar.onNext(new AbstractC37742a.C37745c(dVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$j */
    static final class C37774j<T> implements AbstractC88438k {

        /* renamed from: a */
        public static final C37774j f89193a = new C37774j();

        static {
            Covode.recordClassIndex(45221);
        }

        C37774j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C89378p pVar = (C89378p) obj;
            C89219l.m154721d(pVar, "");
            if (!(pVar.getFirst() instanceof AbstractC33378i.C33380b) || !(pVar.getSecond() instanceof AbstractC37742a.C37745c)) {
                return false;
            }
            return true;
        }
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25851a(Uri uri) {
        C89219l.m154721d(uri, "");
        this.f89178c.onNext(AbstractC37746b.C37748b.f89142a);
        this.f89183j = System.currentTimeMillis();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$f */
    public static final class C37770f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37764b f89189a;

        static {
            Covode.recordClassIndex(45217);
        }

        public C37770f(C37764b bVar) {
            this.f89189a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<String> geckoChannels;
            AbstractC37742a aVar = (AbstractC37742a) obj;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.model.GeckoInfoFetchResult.Success");
            C37750c lynxSchema = ((AbstractC37742a.C37745c) aVar).f89140a.getLynxSchema();
            if (lynxSchema != null && (geckoChannels = lynxSchema.getGeckoChannels()) != null) {
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                C89219l.m154716b(f, "");
                f.mo59376a().mo59418c(geckoChannels);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$h */
    public static final class C37772h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC37735a f89191a;

        static {
            Covode.recordClassIndex(45219);
        }

        public C37772h(AbstractC37735a aVar) {
            this.f89191a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(Object obj) {
            if ((obj instanceof AbstractC37742a.C37744b) || (obj instanceof AbstractC33378i.C33381c) || (obj instanceof AbstractC37746b.C37748b)) {
                this.f89191a.mo65750a();
            } else if ((obj instanceof AbstractC37742a.C37743a) || (obj instanceof AbstractC37746b.C37747a)) {
                this.f89191a.mo65751b();
            } else if (obj instanceof AbstractC37746b.C37749c) {
                this.f89191a.mo65752c();
            }
        }
    }

    /* renamed from: a */
    private final C33744d m76388a(boolean z) {
        String queryParameter;
        C33744d a = new C33744d().mo59980a("success", z ? 1 : 0).mo59983a("load_time", String.valueOf(((float) (System.currentTimeMillis() - this.f89183j)) / 1000.0f));
        String str = this.f89179d;
        if (str == null) {
            str = "";
        }
        C33744d a2 = a.mo59983a("schema_url", str);
        Uri parse = Uri.parse(this.f89179d);
        String str2 = null;
        if (parse != null) {
            str2 = parse.getQueryParameter("channel");
        }
        if (!(str2 == null || str2.length() == 0 || str2 == null)) {
            a2.mo59983a("channel", str2);
        }
        Uri parse2 = Uri.parse(this.f89179d);
        if (!(parse2 == null || (queryParameter = parse2.getQueryParameter("bundle")) == null || queryParameter.length() == 0 || queryParameter == null)) {
            a2.mo59983a("bundle", queryParameter);
        }
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.b$k */
    static final class C37775k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37764b f89194a;

        /* renamed from: b */
        final /* synthetic */ C17031d f89195b;

        static {
            Covode.recordClassIndex(45222);
        }

        C37775k(C37764b bVar, C17031d dVar) {
            this.f89194a = bVar;
            this.f89195b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String renderUrl;
            String str;
            IResourceLoaderService iResourceLoaderService;
            Object second = ((C89378p) obj).getSecond();
            Objects.requireNonNull(second, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.model.GeckoInfoFetchResult.Success");
            C37750c lynxSchema = ((AbstractC37742a.C37745c) second).f89140a.getLynxSchema();
            if (lynxSchema != null && (renderUrl = lynxSchema.getRenderUrl()) != null) {
                this.f89194a.f89179d = renderUrl;
                C37764b bVar = this.f89194a;
                C17031d dVar = this.f89195b;
                IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
                if (f == null || (str = f.mo59391g("lynx_feed")) == null) {
                    str = "";
                }
                if (C80538hl.m139614a(str) && (iResourceLoaderService = (IResourceLoaderService) C16622e.C16623a.m30858a().mo26346a(IResourceLoaderService.class)) != null) {
                    GeckoConfig a = C16326f.m30330a(C16343g.C16345b.f39286a.mo25918a(iResourceLoaderService), str);
                    if (!C89219l.m154714a((Object) a.getAccessKey(), (Object) str)) {
                        iResourceLoaderService.registerConfig(str, new GeckoConfig(str, a.getOfflineDir(), a.getLoaderDepender(), false, false, 24, null));
                    }
                    AbstractC1196i lifecycle = dVar.getLifecycle();
                    iResourceLoaderService.registerCustomLoader(C37700a.class, EnumC16636e.HIGH);
                    lifecycle.mo4013b(bVar.f89180e);
                    lifecycle.mo4012a(bVar.f89180e);
                }
                this.f89195b.mo26838a(C35301c.m72246a(renderUrl), (Bundle) null, this.f89194a);
            }
        }
    }

    /* renamed from: a */
    public final void mo65778a(C17031d dVar) {
        C89219l.m154721d(dVar, "");
        if (!this.f89182i) {
            this.f89182i = true;
            AbstractC88979t<AbstractC33378i> b = this.f89181f.mo59376a().mo59414b();
            AbstractC88979t<AbstractC37742a> c = this.f89177b.mo143283c();
            C89219l.m154716b(c, "");
            C89219l.m154719c(b, "");
            C89219l.m154719c(c, "");
            C88937c.C88938a aVar = C88937c.C88938a.f201980a;
            C88466b.m153697a((Object) c, "other is null");
            C88466b.m153697a((Object) aVar, "combiner is null");
            AbstractC88979t a = C88925a.m154171a(new C88736bo(b, aVar, c));
            C89219l.m154709a((Object) a, "");
            AbstractC88412b a2 = a.mo143268a(C37774j.f89193a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37775k(this, dVar), C37776l.f89196a);
            C89219l.m154716b(a2, "");
            C88934a.m154195a(a2, this.f89176a);
        }
    }

    public C37764b(WishListBulletApi wishListBulletApi, IAdLandPagePreloadService iAdLandPagePreloadService) {
        C89219l.m154721d(wishListBulletApi, "");
        C89219l.m154721d(iAdLandPagePreloadService, "");
        this.f89184k = wishListBulletApi;
        this.f89181f = iAdLandPagePreloadService;
        C88958b<AbstractC37742a> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f89177b = bVar;
        C88958b<AbstractC37746b> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f89178c = bVar2;
        this.f89180e = WishListManager$lifecycleEventObserver$1.f89171a;
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25852a(Uri uri, Throwable th) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(th, "");
        this.f89178c.onNext(AbstractC37746b.C37747a.f89141a);
        C39162r.m79460a("ads_wishlist_tab_load", m76388a(false).f79943a);
    }

    @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
    /* renamed from: a */
    public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(iVar, "");
        iVar.onEvent(new C37777m());
        this.f89178c.onNext(AbstractC37746b.C37749c.f89143a);
        view.getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m76389b();
        }
        C39162r.m79460a("ads_wishlist_tab_load", m76388a(C58029j.f132253e).f79943a);
    }
}
