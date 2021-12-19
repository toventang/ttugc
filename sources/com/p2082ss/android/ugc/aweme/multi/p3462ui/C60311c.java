package com.p2082ss.android.ugc.aweme.multi.p3462ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRouter;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.google.p1998c.p1999a.C27258s;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34500b;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SquareImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40563b;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60200b;
import com.p2082ss.android.ugc.aweme.multi.C60211k;
import com.p2082ss.android.ugc.aweme.multi.C60212l;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.ui.c */
public final class C60311c implements AbstractC1214u<Map<String, String>> {

    /* renamed from: k */
    public static final C60319b f137444k = new C60319b((byte) 0);

    /* renamed from: a */
    public int f137445a = this.f137455l;

    /* renamed from: b */
    public final int f137446b = C34728n.m70946a(4.0d);

    /* renamed from: c */
    public final int f137447c = C34728n.m70946a(12.0d);

    /* renamed from: d */
    public final int f137448d = C34728n.m70946a(16.0d);

    /* renamed from: e */
    public final AbstractC60200b f137449e;

    /* renamed from: f */
    public final Context f137450f;

    /* renamed from: g */
    public final List<C60211k> f137451g;

    /* renamed from: h */
    public final C33744d f137452h;

    /* renamed from: i */
    public final boolean f137453i;

    /* renamed from: j */
    public final int f137454j;

    /* renamed from: l */
    private final int f137455l;

    /* renamed from: m */
    private final int f137456m = 1;

    /* renamed from: n */
    private final AbstractC89244h f137457n = C89250i.m154773a((AbstractC89171a) new C60320c(this));

    static {
        Covode.recordClassIndex(70847);
    }

    /* renamed from: a */
    public final RecyclerView mo97980a() {
        return (RecyclerView) this.f137457n.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$b */
    public static final class C60319b {
        static {
            Covode.recordClassIndex(70855);
        }

        private C60319b() {
        }

        public /* synthetic */ C60319b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a */
    public static final class C60313a extends RecyclerView.AbstractC1350a<C60314a> implements AbstractC90252i, AbstractC90253j {

        /* renamed from: a */
        Map<String, String> f137459a;

        /* renamed from: b */
        public int f137460b = -1;

        /* renamed from: c */
        public long f137461c = SystemClock.elapsedRealtime();

        /* renamed from: d */
        public final AbstractC60200b f137462d;

        /* renamed from: e */
        public final Context f137463e;

        /* renamed from: f */
        public final boolean f137464f;

        /* renamed from: g */
        public final List<C60211k> f137465g;

        /* renamed from: h */
        public final HashMap<String, String> f137466h;

        /* renamed from: i */
        public final boolean f137467i;

        /* renamed from: j */
        public final int f137468j;

        static {
            Covode.recordClassIndex(70849);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // org.greenrobot.eventbus.AbstractC90252i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(152, new RunnableC90250g(C60313a.class, "onEvent", C40563b.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C60314a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m110020a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f137465g.size();
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$e */
        public static final class C60318e extends C24202c<AbstractC24457f> {

            /* renamed from: a */
            final /* synthetic */ C60317d f137480a;

            static {
                Covode.recordClassIndex(70854);
            }

            C60318e(C60317d dVar) {
                this.f137480a = dVar;
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                this.f137480a.mo97985a(false);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                this.f137480a.mo97985a(true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$a */
        public static final class C60314a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final View f137469a;

            /* renamed from: b */
            public int f137470b;

            static {
                Covode.recordClassIndex(70850);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            private C60314a(View view) {
                super(view);
                C89219l.m154721d(view, "");
                this.f137469a = view;
                this.f137470b = 0;
            }

            public /* synthetic */ C60314a(View view, byte b) {
                this(view);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$d */
        static final class C60317d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C60313a f137477a;

            /* renamed from: b */
            final /* synthetic */ int f137478b;

            /* renamed from: c */
            final /* synthetic */ SquareImageView f137479c;

            static {
                Covode.recordClassIndex(70853);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60317d(C60313a aVar, int i, SquareImageView squareImageView) {
                super(1);
                this.f137477a = aVar;
                this.f137478b = i;
                this.f137479c = squareImageView;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                mo97985a(bool.booleanValue());
                return C89391z.f203057a;
            }

            /* renamed from: a */
            public final void mo97985a(boolean z) {
                C60313a aVar = this.f137477a;
                aVar.mo97982a(String.valueOf(aVar.f137465g.get(this.f137478b).f137247b.f137258b), Long.valueOf(SystemClock.elapsedRealtime() - this.f137477a.f137461c), Boolean.valueOf(z), this.f137478b);
                if (!z) {
                    this.f137479c.setActualImageResource(2131232340);
                }
            }
        }

        @AbstractC90264r
        public final void onEvent(C40563b bVar) {
            C60211k kVar;
            String str = "";
            C89219l.m154721d(bVar, str);
            int i = this.f137460b;
            if (!(i == -1 || (kVar = this.f137465g.get(i)) == null)) {
                String c = this.f137462d.mo97884c();
                Aweme b = this.f137462d.mo97883b();
                C33744d a = new C33744d().mo59985a((HashMap<? extends String, ? extends String>) this.f137466h).mo59983a("enter_from", c).mo59983a("anchor_entry", kVar.f137248c);
                String authorUid = b.getAuthorUid();
                if (authorUid == null) {
                    authorUid = str;
                }
                C33744d a2 = a.mo59983a("author_id", authorUid);
                String aid = b.getAid();
                if (aid == null) {
                    aid = str;
                }
                C39162r.m79460a("anchor_stay_time", a2.mo59983a("group_id", aid).mo59983a("duration", String.valueOf(bVar.f94910a)).mo59983a("music_id", C59208ac.m108770d(b)).f79943a);
                ICommerceService a3 = C37533a.m75656a();
                C37534a aVar = new C37534a();
                if (c == null) {
                    c = str;
                }
                aVar.f88680b = c;
                String authorUid2 = b.getAuthorUid();
                if (authorUid2 == null) {
                    authorUid2 = str;
                }
                aVar.f88682d = authorUid2;
                String aid2 = b.getAid();
                if (aid2 == null) {
                    aid2 = str;
                }
                aVar.f88681c = aid2;
                String requestId = b.getRequestId();
                if (requestId != null) {
                    str = requestId;
                }
                aVar.f88683e = str;
                aVar.f88695q = "shopify";
                aVar.f88696r = String.valueOf(bVar.f94910a);
                aVar.f88664I = C34500b.m70485a(this.f137462d.mo97883b());
                aVar.f88662G = "video_multi_anchor";
                aVar.f88663H = "video";
                a3.logCommerceEvents("product_stay_time", aVar);
            }
            EventBus.m156962a().mo145395b(this);
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$c */
        static final class View$OnClickListenerC60316c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C60313a f137474a;

            /* renamed from: b */
            final /* synthetic */ int f137475b;

            /* renamed from: c */
            final /* synthetic */ C60211k f137476c;

            static {
                Covode.recordClassIndex(70852);
            }

            View$OnClickListenerC60316c(C60313a aVar, int i, C60211k kVar) {
                this.f137474a = aVar;
                this.f137475b = i;
                this.f137476c = kVar;
            }

            public final void onClick(View view) {
                Integer num;
                ClickAgent.onClick(view);
                this.f137474a.f137460b = this.f137475b;
                ICommerceService a = C37533a.m75656a();
                C37534a aVar = new C37534a();
                aVar.f88658C = "TEMAI";
                aVar.f88681c = this.f137474a.f137462d.mo97883b().getAid();
                int i = 1;
                if (this.f137474a.f137462d.mo97883b().isAd()) {
                    num = 1;
                } else {
                    num = 0;
                }
                aVar.f88660E = num;
                aVar.f88682d = this.f137474a.f137462d.mo97883b().getAuthorUid();
                aVar.f88683e = this.f137474a.f137462d.mo97883b().getRequestId();
                String c = this.f137474a.f137462d.mo97884c();
                if (c == null) {
                    c = "";
                }
                aVar.f88680b = c;
                aVar.f88700v = "video_cart_tag";
                aVar.f88703y = String.valueOf(this.f137474a.f137465g.get(this.f137475b).f137247b.f137265i);
                aVar.f88702x = this.f137474a.f137465g.get(this.f137475b).f137247b.f137267k;
                aVar.f88701w = this.f137474a.f137465g.get(this.f137475b).f137247b.f137268l;
                aVar.f88704z = String.valueOf(this.f137474a.f137465g.get(this.f137475b).f137247b.f137258b);
                String authorUid = this.f137474a.f137462d.mo97883b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (!C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i = 0;
                }
                aVar.f88656A = i;
                aVar.f88657B = "no";
                aVar.f88659D = String.valueOf(this.f137475b + 1);
                aVar.f88664I = C34500b.m70485a(this.f137474a.f137462d.mo97883b());
                aVar.f88662G = "video_multi_anchor";
                aVar.f88663H = "video";
                a.logCommerceEvents("tiktokec_product_click", aVar);
                if (this.f137474a.f137462d.mo97883b().isAd()) {
                    C18129a.m33746a("anchor_detail", "otherclick", this.f137474a.f137462d.mo97883b().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
                }
                this.f137474a.mo97981a(this.f137476c);
            }
        }

        /* renamed from: a */
        public final void mo97981a(C60211k kVar) {
            String str = "";
            C89219l.m154721d(kVar, str);
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(this.f137463e, kVar.f137253h, str);
            EventBus.m156966a(EventBus.m156962a(), this);
            Context context = this.f137463e;
            if (context instanceof AbstractC1204m) {
                ((AbstractC1204m) context).getLifecycle().mo4012a(new ShopWindowView$Adapter$whenShopLinkAnchorClicked$1());
            }
            C33744d a = new C33744d().mo59985a((HashMap<? extends String, ? extends String>) this.f137466h).mo59983a("enter_from", this.f137462d.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
            String authorUid = this.f137462d.mo97883b().getAuthorUid();
            if (authorUid == null) {
                authorUid = str;
            }
            C33744d a2 = a.mo59983a("author_id", authorUid);
            String aid = this.f137462d.mo97883b().getAid();
            if (aid == null) {
                aid = str;
            }
            C39162r.m79460a("enter_multi_anchor_detail", a2.mo59983a("group_id", aid).mo59983a("music_id", C59208ac.m108770d(this.f137462d.mo97883b())).mo59983a("click_type", "webview").f79943a);
            AbstractC60200b bVar = this.f137462d;
            ICommerceService a3 = C37533a.m75656a();
            C37534a aVar = new C37534a();
            String c = bVar.mo97884c();
            if (c != null) {
                str = c;
            }
            aVar.f88680b = str;
            aVar.f88682d = bVar.mo97883b().getAuthorUid();
            aVar.f88681c = bVar.mo97883b().getAid();
            aVar.f88683e = bVar.mo97883b().getRequestId();
            aVar.f88695q = "shopify";
            aVar.f88699u = "video";
            aVar.f88700v = "video_cart_tag";
            aVar.f88664I = C34500b.m70485a(this.f137462d.mo97883b());
            aVar.f88662G = "video_multi_anchor";
            aVar.f88663H = "video";
            a3.logCommerceEvents("enter_product_detail", aVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onViewAttachedToWindow(C60314a aVar) {
            int i;
            int i2;
            C60314a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            super.onViewAttachedToWindow(aVar2);
            String a = C60212l.m109763a(this.f137462d.mo97883b(), this.f137467i);
            if (a == null) {
                a = "video_multi_anchor";
            }
            ICommerceService a2 = C37533a.m75656a();
            C37534a aVar3 = new C37534a();
            aVar3.f88658C = "TEMAI";
            aVar3.f88681c = this.f137462d.mo97883b().getAid();
            if (this.f137462d.mo97883b().isAd()) {
                i = 1;
            } else {
                i = 0;
            }
            aVar3.f88660E = i;
            aVar3.f88682d = this.f137462d.mo97883b().getAuthorUid();
            aVar3.f88683e = this.f137462d.mo97883b().getRequestId();
            String c = this.f137462d.mo97884c();
            if (c == null) {
                c = "";
            }
            aVar3.f88680b = c;
            aVar3.f88700v = "video_cart_tag";
            aVar3.f88703y = String.valueOf(this.f137465g.get(aVar2.f137470b).f137247b.f137265i);
            aVar3.f88702x = this.f137465g.get(aVar2.f137470b).f137247b.f137267k;
            aVar3.f88701w = this.f137465g.get(aVar2.f137470b).f137247b.f137268l;
            aVar3.f88704z = String.valueOf(this.f137465g.get(aVar2.f137470b).f137247b.f137258b);
            String authorUid = this.f137462d.mo97883b().getAuthorUid();
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            aVar3.f88656A = i2;
            aVar3.f88657B = "no";
            aVar3.f88659D = String.valueOf(aVar2.f137470b + 1);
            aVar3.f88664I = C34500b.m70485a(this.f137462d.mo97883b());
            aVar3.f88662G = a;
            aVar3.f88663H = "video";
            aVar3.f88679a = C60212l.m109766a(this.f137462d.mo97883b(), "tiktokec_product_show", aVar3.f88680b);
            a2.logCommerceEvents("tiktokec_product_show", aVar3);
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$a$b */
        public static final class C60315b extends AbstractView$OnClickListenerC80259bp {

            /* renamed from: a */
            final /* synthetic */ C60313a f137471a;

            /* renamed from: b */
            final /* synthetic */ int f137472b;

            /* renamed from: c */
            final /* synthetic */ C60211k f137473c;

            static {
                Covode.recordClassIndex(70851);
            }

            @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
            /* renamed from: a */
            public final void mo60873a(View view) {
                int i;
                int i2;
                Integer num;
                this.f137471a.f137460b = this.f137472b;
                String a = C60212l.m109763a(this.f137471a.f137462d.mo97883b(), this.f137471a.f137467i);
                if (a == null) {
                    a = "video_multi_anchor";
                }
                if (C80538hl.m139614a(this.f137473c.f137247b.f137266j)) {
                    Integer num2 = this.f137473c.f137250e;
                    int type = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
                    if (num2 != null && num2.intValue() == type && (num = this.f137473c.f137247b.f137265i) != null && num.intValue() == 100) {
                        C60212l.m109767a(this.f137471a.f137462d.mo97886e(), this.f137473c, this.f137471a.f137462d.mo97883b(), this.f137471a.f137462d.mo97884c(), a, this.f137471a.f137467i);
                    } else {
                        SmartRouter.buildRoute(this.f137471a.f137462d.mo97886e(), C60212l.m109764a(this.f137473c, this.f137471a.f137462d.mo97883b(), this.f137471a.f137462d.mo97884c(), a, this.f137471a.f137467i)).open();
                    }
                } else {
                    C60313a aVar = this.f137471a;
                    C60211k kVar = this.f137473c;
                    String str = null;
                    Integer num3 = kVar.f137250e;
                    int type2 = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
                    if (num3 != null && num3.intValue() == type2) {
                        str = kVar.f137247b.f137269m;
                        String str2 = kVar.f137247b.f137269m;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C89219l.m154721d(kVar, "");
                        C89219l.m154721d(str2, "");
                        MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(aVar.f137463e, str2, "");
                        EventBus.m156966a(EventBus.m156962a(), aVar);
                        if (aVar.f137463e instanceof AbstractC1204m) {
                            ((AbstractC1204m) aVar.f137463e).getLifecycle().mo4012a(new ShopWindowView$Adapter$whenShopWindowAnchorClicked$1());
                        }
                        C33744d a2 = new C33744d().mo59985a((HashMap<? extends String, ? extends String>) aVar.f137466h).mo59983a("enter_from", aVar.f137462d.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
                        String authorUid = aVar.f137462d.mo97883b().getAuthorUid();
                        if (authorUid == null) {
                            authorUid = "";
                        }
                        C33744d a3 = a2.mo59983a("author_id", authorUid);
                        String aid = aVar.f137462d.mo97883b().getAid();
                        if (aid == null) {
                            aid = "";
                        }
                        C39162r.m79460a("enter_multi_anchor_detail", a3.mo59983a("group_id", aid).mo59983a("music_id", C59208ac.m108770d(aVar.f137462d.mo97883b())).mo59983a("click_type", "webview").f79943a);
                        AbstractC60200b bVar = aVar.f137462d;
                        ICommerceService a4 = C37533a.m75656a();
                        C37534a aVar2 = new C37534a();
                        String c = bVar.mo97884c();
                        if (c == null) {
                            c = "";
                        }
                        aVar2.f88680b = c;
                        aVar2.f88682d = bVar.mo97883b().getAuthorUid();
                        aVar2.f88681c = bVar.mo97883b().getAid();
                        aVar2.f88683e = bVar.mo97883b().getRequestId();
                        aVar2.f88695q = "shopify";
                        aVar2.f88699u = "video";
                        aVar2.f88700v = "video_cart_tag";
                        aVar2.f88664I = C34500b.m70485a(aVar.f137462d.mo97883b());
                        aVar2.f88662G = "video_multi_anchor";
                        aVar2.f88663H = "video";
                        a4.logCommerceEvents("enter_product_detail", aVar2);
                    } else {
                        Integer num4 = kVar.f137250e;
                        int type3 = EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
                        if (num4 != null && num4.intValue() == type3) {
                            str = kVar.f137253h;
                            aVar.mo97981a(kVar);
                        }
                    }
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).showThirdpartyDisclaimerTips(aVar.f137462d.mo97886e(), str);
                }
                ICommerceService a5 = C37533a.m75656a();
                C37534a aVar3 = new C37534a();
                aVar3.f88658C = "TEMAI";
                aVar3.f88681c = this.f137471a.f137462d.mo97883b().getAid();
                if (this.f137471a.f137462d.mo97883b().isAd()) {
                    i = 1;
                } else {
                    i = 0;
                }
                aVar3.f88660E = i;
                aVar3.f88682d = this.f137471a.f137462d.mo97883b().getAuthorUid();
                aVar3.f88683e = this.f137471a.f137462d.mo97883b().getRequestId();
                String c2 = this.f137471a.f137462d.mo97884c();
                if (c2 == null) {
                    c2 = "";
                }
                aVar3.f88680b = c2;
                aVar3.f88700v = "video_cart_tag";
                aVar3.f88703y = String.valueOf(this.f137471a.f137465g.get(this.f137472b).f137247b.f137265i);
                aVar3.f88702x = this.f137471a.f137465g.get(this.f137472b).f137247b.f137267k;
                aVar3.f88701w = this.f137471a.f137465g.get(this.f137472b).f137247b.f137268l;
                aVar3.f88704z = String.valueOf(this.f137471a.f137465g.get(this.f137472b).f137247b.f137258b);
                String authorUid2 = this.f137471a.f137462d.mo97883b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (C89219l.m154714a((Object) authorUid2, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar3.f88656A = i2;
                aVar3.f88657B = "no";
                aVar3.f88659D = String.valueOf(this.f137472b + 1);
                aVar3.f88664I = C34500b.m70485a(this.f137471a.f137462d.mo97883b());
                aVar3.f88662G = a;
                aVar3.f88663H = "video";
                aVar3.f88679a = C60212l.m109766a(this.f137471a.f137462d.mo97883b(), "tiktokec_product_click", aVar3.f88680b);
                a5.logCommerceEvents("tiktokec_product_click", aVar3);
                if (this.f137471a.f137462d.mo97883b().isAd()) {
                    C18129a.m33746a("anchor_detail", "otherclick", this.f137471a.f137462d.mo97883b().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
                }
            }

            C60315b(C60313a aVar, int i, C60211k kVar) {
                this.f137471a = aVar;
                this.f137472b = i;
                this.f137473c = kVar;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C60314a aVar, int i) {
            String str;
            String str2;
            C60314a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (this.f137464f) {
                View view = aVar2.f137469a;
                C60211k kVar = this.f137465g.get(i);
                TextView textView = (TextView) view.findViewById(R.id.title);
                SquareImageView squareImageView = (SquareImageView) view.findViewById(R.id.bh1);
                TextView textView2 = (TextView) view.findViewById(R.id.d6d);
                Integer num = kVar.f137250e;
                int type = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
                if (num != null && num.intValue() == type) {
                    try {
                        C60317d dVar = new C60317d(this, i, squareImageView);
                        if (C80538hl.m139614a(kVar.f137247b.f137260d)) {
                            C89219l.m154716b(textView, "");
                            textView.setText(kVar.f137247b.f137260d);
                        } else {
                            C89219l.m154716b(textView, "");
                            textView.setText(kVar.f137247b.f137259c);
                        }
                        if (C80538hl.m139614a(kVar.f137247b.f137264h)) {
                            str = kVar.f137247b.f137264h;
                        } else if (C80538hl.m139614a(kVar.f137247b.f137263g)) {
                            str = kVar.f137247b.f137263g;
                        } else {
                            str = null;
                        }
                        if (str == null || str.length() == 0) {
                            dVar.mo97985a(false);
                        } else {
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUrlList(C89070n.m154524c(str));
                            C34577e.m70596a(squareImageView, urlModel, new C60318e(dVar));
                        }
                        int i2 = this.f137468j;
                        if (i2 == 1) {
                            str2 = kVar.f137247b.f137262f;
                        } else if (i2 == 2) {
                            Map<String, String> map = this.f137459a;
                            if (map != null) {
                                str2 = map.get(String.valueOf(this.f137465g.get(i).f137247b.f137258b));
                            }
                        }
                        if (str2 != null) {
                            C89219l.m154716b(textView2, "");
                            textView2.setText(str2);
                        }
                    } catch (Exception e) {
                        C39162r.m79460a("rd_tiktokec_shop_anchor_exception", new C33744d().mo59983a("e_stack_trace", C27258s.m54268b(e)).mo59983a("extra_data", "anchor.extra : " + kVar.f137247b).mo59983a("where", "ShopWindowView").f79943a);
                    }
                }
                Integer num2 = kVar.f137250e;
                int type2 = EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 != null && num2.intValue() == type2) {
                    C89219l.m154716b(textView, "");
                    textView.setText(kVar.f137248c);
                    squareImageView.setActualImageResource(2131232340);
                    C89219l.m154716b(textView2, "");
                    textView2.setVisibility(4);
                }
                view.setOnClickListener(new C60315b(this, i, kVar));
                aVar2.f137470b = i;
                return;
            }
            View view2 = aVar2.f137469a;
            C60211k kVar2 = this.f137465g.get(i);
            view2.setOnClickListener(new View$OnClickListenerC60316c(this, i, kVar2));
            View findViewById = view2.findViewById(R.id.title);
            C89219l.m154716b(findViewById, "");
            ((TextView) findViewById).setText(kVar2.f137248c);
            ((SimpleDraweeView) view2.findViewById(R.id.bh1)).setActualImageResource(2131232341);
            aVar2.f137470b = i;
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m110020a(C60313a aVar, ViewGroup viewGroup, int i) {
            C60314a aVar2;
            boolean a;
            MethodCollector.m26663i(7624);
            C89219l.m154721d(viewGroup, "");
            if (aVar.f137464f) {
                View a2 = C1764a.m5927a(LayoutInflater.from(aVar.f137463e), R.layout.a_o, viewGroup, false);
                C89219l.m154716b(a2, "");
                aVar2 = new C60314a(a2, (byte) 0);
            } else {
                View a3 = C1764a.m5927a(LayoutInflater.from(aVar.f137463e), R.layout.a_p, viewGroup, false);
                C89219l.m154716b(a3, "");
                aVar2 = new C60314a(a3, (byte) 0);
            }
            try {
                if (aVar2.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar2.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = aVar2.getClass().getName();
            MethodCollector.m26664o(7624);
            return aVar2;
        }

        /* renamed from: a */
        public final void mo97982a(String str, Long l, Boolean bool, int i) {
            ICommerceService a = C37533a.m75656a();
            C37534a aVar = new C37534a();
            aVar.f88658C = "TEMAI";
            aVar.f88680b = this.f137462d.mo97884c();
            aVar.f88682d = this.f137462d.mo97883b().getAuthorUid();
            aVar.f88704z = str;
            int i2 = 1;
            aVar.f88659D = String.valueOf(i + 1);
            aVar.f88681c = this.f137462d.mo97883b().getAid();
            if (!C89219l.m154714a((Object) bool, (Object) true)) {
                i2 = 0;
            }
            aVar.f88677V = Integer.valueOf(i2);
            aVar.f88678W = String.valueOf(l);
            a.logCommerceEvents("rd_tiktokec_video_shopping_list_render", aVar);
        }

        public C60313a(AbstractC60200b bVar, Context context, boolean z, List<C60211k> list, HashMap<String, String> hashMap, boolean z2, int i) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(hashMap, "");
            this.f137462d = bVar;
            this.f137463e = context;
            this.f137464f = z;
            this.f137465g = list;
            this.f137466h = hashMap;
            this.f137467i = z2;
            this.f137468j = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.c$c */
    static final class C60320c extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C60311c f137481a;

        static {
            Covode.recordClassIndex(70856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60320c(C60311c cVar) {
            super(0);
            this.f137481a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return new RecyclerView(this.f137481a.f137450f);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(Map<String, String> map) {
        int i;
        Map<String, String> map2 = map;
        C89219l.m154721d(map2, "");
        RecyclerView.AbstractC1350a adapter = mo97980a().getAdapter();
        if (!(adapter instanceof C60313a)) {
            adapter = null;
        }
        C60313a aVar = (C60313a) adapter;
        if (aVar != null) {
            aVar.f137459a = map2;
            aVar.notifyDataSetChanged();
        }
        if (map2 == null || map2.isEmpty()) {
            i = this.f137455l;
        } else {
            i = this.f137456m;
        }
        this.f137445a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006c, code lost:
        if (r3 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006f, code lost:
        r5 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60311c(com.p2082ss.android.ugc.aweme.multi.AbstractC60200b r11, android.content.Context r12, java.util.List<com.p2082ss.android.ugc.aweme.multi.C60211k> r13, com.p2082ss.android.ugc.aweme.app.p2328f.C33744d r14, boolean r15, int r16) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.multi.p3462ui.C60311c.<init>(com.ss.android.ugc.aweme.multi.b, android.content.Context, java.util.List, com.ss.android.ugc.aweme.app.f.d, boolean, int):void");
    }
}
