package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14214d;
import com.bytedance.creativex.recorder.filter.p942a.C14215e;
import com.bytedance.creativex.recorder.filter.p942a.EnumC14221k;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50705m;
import com.p2082ss.android.ugc.aweme.filter.view.p2989a.C50816c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75650j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75588b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76331c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76359j;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76114a;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l */
public final class C73416l extends AbstractC2562j<AbstractC73415k> implements AbstractC21566a, AbstractC73415k {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f164945a = {new C89232y(C73416l.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C73416l.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b */
    final AbstractC14210a f164946b = ((AbstractC14210a) getDiContainer().mo35252b(AbstractC14210a.class, null));

    /* renamed from: c */
    public boolean f164947c = true;

    /* renamed from: d */
    private final AbstractC89248d f164948d = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: e */
    private final AbstractC89248d f164949e = C21572a.m40505b(getDiContainer(), AbstractC84089j.class);

    /* renamed from: f */
    private final AbstractC14214d f164950f = ((AbstractC14214d) getDiContainer().mo35252b(AbstractC14214d.class, null));

    /* renamed from: g */
    private final C88411a f164951g = new C88411a();

    /* renamed from: h */
    private final C21582f f164952h;

    static {
        Covode.recordClassIndex(86153);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ShortVideoContext mo116040a() {
        return (ShortVideoContext) this.f164948d.mo23374a(this, f164945a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC84089j mo116042b() {
        return (AbstractC84089j) this.f164949e.mo23374a(this, f164945a[1]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC73415k getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f164952h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$d */
    public static final class C73420d extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76337f f164956a;

        static {
            Covode.recordClassIndex(86157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73420d(AbstractC76337f fVar) {
            super(0);
            this.f164956a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("is_panel_infold", ((AbstractC76337f.C76338a) this.f164956a).f171476a);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$e */
    public static final class C73421e extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76337f f164957a;

        static {
            Covode.recordClassIndex(86158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73421e(AbstractC76337f fVar) {
            super(0);
            this.f164957a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("is_panel_infold", ((AbstractC76337f.C76341d) this.f164957a).f171483a);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$a */
    public static final class C73417a extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76337f f164953a;

        static {
            Covode.recordClassIndex(86154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73417a(AbstractC76337f fVar) {
            super(0);
            this.f164953a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            if (C89219l.m154714a((Object) ((AbstractC76337f.C76339b) this.f164953a).f171477a, (Object) "click_icon")) {
                hashMap.put("enter_method", "click");
            } else {
                hashMap.put("enter_method", ((AbstractC76337f.C76339b) this.f164953a).f171477a);
            }
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$b */
    public static final class C73418b extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76337f f164954a;

        static {
            Covode.recordClassIndex(86155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73418b(AbstractC76337f fVar) {
            super(0);
            this.f164954a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("search_id", ((AbstractC76337f.C76340c) this.f164954a).f171480c);
            hashMap.put("enter_method", "search_nomal");
            hashMap.put("is_success", ((AbstractC76337f.C76340c) this.f164954a).f171481d);
            hashMap.put("duration", ((AbstractC76337f.C76340c) this.f164954a).f171482e);
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$c */
    public static final class C73419c extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76337f f164955a;

        static {
            Covode.recordClassIndex(86156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73419c(AbstractC76337f fVar) {
            super(0);
            this.f164955a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            HashMap hashMap = new HashMap();
            hashMap.put("search_id", ((AbstractC76337f.C76342e) this.f164955a).f171485b);
            hashMap.put("search_method", ((AbstractC76337f.C76342e) this.f164955a).f171484a);
            hashMap.put("is_panel_infold", ((AbstractC76337f.C76342e) this.f164955a).f171486c);
            hashMap.put("prop_id", ((AbstractC76337f.C76342e) this.f164955a).f171487d.getEffect_id());
            hashMap.put("impr_position", String.valueOf(((AbstractC76337f.C76342e) this.f164955a).f171488e));
            String recId = ((AbstractC76337f.C76342e) this.f164955a).f171487d.getRecId();
            if (recId == null) {
                recId = "0";
            }
            hashMap.put("prop_rec_id", recId);
            return hashMap;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        AbstractC84089j b;
        AbstractC75655o t;
        AbstractC75650j n;
        LiveData<C75588b> g;
        C2559g<Boolean> d;
        AbstractC88979t<C50816c> b2;
        AbstractC88412b a;
        LiveData<EnumC14221k> a2;
        super.onCreate();
        AbstractC14214d dVar = this.f164950f;
        if (!(dVar == null || (a2 = dVar.mo22963a()) == null)) {
            a2.observe(this, new C73424h(this));
        }
        AbstractC14214d dVar2 = this.f164950f;
        if (!(dVar2 == null || (b2 = dVar2.mo22965b()) == null || (a = b2.mo143254a(new C73425i(this), C84909p.f189747a)) == null)) {
            this.f164951g.mo142945a(a);
        }
        AbstractC84089j b3 = mo116042b();
        if (!(b3 == null || (d = b3.mo23122d()) == null)) {
            d.mo6997a(this, new C73426j(this));
        }
        AbstractC75461d dVar3 = (AbstractC75461d) getDiContainer().mo35252b(AbstractC75461d.class, null);
        if (dVar3 != null && (b = mo116042b()) != null && (t = b.mo23167t()) != null && (n = t.mo119302n()) != null && (g = n.mo119330g()) != null) {
            g.observe(this, new C73428k(dVar3));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$f */
    static final class C73422f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73416l f164958a;

        static {
            Covode.recordClassIndex(86159);
        }

        C73422f(C73416l lVar) {
            this.f164958a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC76337f fVar = (AbstractC76337f) obj;
            C73416l lVar = this.f164958a;
            C89219l.m154716b(fVar, "");
            lVar.mo116041a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$g */
    static final class C73423g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73416l f164959a;

        static {
            Covode.recordClassIndex(86160);
        }

        C73423g(C73416l lVar) {
            this.f164959a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC76337f fVar = (AbstractC76337f) obj;
            C73416l lVar = this.f164959a;
            C89219l.m154716b(fVar, "");
            lVar.mo116041a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$k */
    static final class C73428k<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ AbstractC75461d f164964a;

        static {
            Covode.recordClassIndex(86165);
        }

        C73428k(AbstractC75461d dVar) {
            this.f164964a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            C75588b bVar = (C75588b) obj;
            AbstractC75461d dVar = this.f164964a;
            if (bVar != null) {
                effect = bVar.f169916a;
            } else {
                effect = null;
            }
            dVar.mo59541a(effect);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$j */
    static final class C73426j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C73416l f164962a;

        static {
            Covode.recordClassIndex(86163);
        }

        C73426j(C73416l lVar) {
            this.f164962a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC75573i v;
            AbstractC76331c e;
            LiveData<AbstractC76337f> f;
            if (C89219l.m154714a(obj, (Object) true)) {
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73416l.C73426j.CallableC734271 */

                    /* renamed from: a */
                    final /* synthetic */ C73426j f164963a;

                    static {
                        Covode.recordClassIndex(86164);
                    }

                    {
                        this.f164963a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        FaceStickerBean i;
                        C73416l lVar = this.f164963a.f164962a;
                        if (TextUtils.isEmpty(lVar.mo116040a().f155771aE)) {
                            lVar.mo116040a().f155771aE = "normal";
                        }
                        if (C63244g.m114602a().mo73255A().mo93901a()) {
                            C84425b bVar = new C84425b();
                            bVar.mo129406a("shoot_way", lVar.mo116040a().f155831p);
                            bVar.mo129406a("creation_id", lVar.mo116040a().f155830o);
                            bVar.mo129406a("enter_from", "video_shoot_page");
                            AbstractC84089j b = lVar.mo116042b();
                            if (!(b == null || (i = b.mo23127i()) == null)) {
                                bVar.mo129406a("effect_id", i.getId());
                                bVar.mo129406a("effect_name", i.getName());
                            }
                            if (lVar.mo116040a().f155740A != 0) {
                                bVar.mo129403a("draft_id", lVar.mo116040a().f155740A);
                            }
                            String str = lVar.mo116040a().f155741B;
                            C89219l.m154716b(str, "");
                            if (str.length() > 0) {
                                bVar.mo129406a("new_draft_id", lVar.mo116040a().f155741B);
                            }
                            C39162r.m79460a("click_prop_entrance", bVar.f188764a);
                        } else {
                            C84425b a = new C84425b().mo129406a("creation_id", lVar.mo116040a().f155830o).mo129406a("shoot_way", lVar.mo116040a().f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("enter_method", lVar.mo116040a().f155771aE).mo129406a("content_type", lVar.mo116040a().mo110034j().getContentType()).mo129406a("content_source", lVar.mo116040a().mo110034j().getContentSource()).mo129406a("from_group_id", C70747dv.m124972a());
                            if (lVar.mo116040a().f155740A != 0) {
                                a.mo129403a("draft_id", lVar.mo116040a().f155740A);
                            }
                            String str2 = lVar.mo116040a().f155741B;
                            C89219l.m154716b(str2, "");
                            if (str2.length() > 0) {
                                a.mo129406a("new_draft_id", lVar.mo116040a().f155741B);
                            }
                            a.mo129406a("shoot_page", "video_shoot_page");
                            a.mo129406a("shoot_tab_name", lVar.mo116040a().mo110042r());
                            C80322d.m139251a("click_prop_entrance", a.f188764a);
                            lVar.mo116040a().f155771aE = "";
                        }
                        lVar.mo116040a().f155771aE = "";
                        return C89391z.f203057a;
                    }
                }, C1731i.f5562a);
            }
            if (this.f164962a.f164947c && C89219l.m154714a(obj, (Object) true)) {
                this.f164962a.f164947c = false;
                C73416l lVar = this.f164962a;
                AbstractC84089j b = lVar.mo116042b();
                if (!(b == null || (v = b.mo23169v()) == null || (e = v.mo119141e()) == null || (f = e.mo120011f()) == null)) {
                    f.observe(lVar, new C73423g(lVar));
                }
                AbstractC76115b bVar = (AbstractC76115b) lVar.getDiContainer().mo35249a((Type) AbstractC76115b.class, (String) null);
                if (bVar.mo119858a("sticker_category:search") instanceof C76359j) {
                    AbstractC76114a a = bVar.mo119858a("sticker_category:search");
                    Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerCategoryTabView");
                    ((C76359j) a).mo120076a().f171406k.observe(lVar, new C73422f(lVar));
                }
            }
        }
    }

    public C73416l(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f164952h = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$h */
    static final class C73424h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C73416l f164960a;

        static {
            Covode.recordClassIndex(86161);
        }

        C73424h(C73416l lVar) {
            this.f164960a = lVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C2560h<FilterBean> curSelectedFilter;
            T value;
            AbstractC50705m mVar;
            LiveData<C14215e> currentFilterSource;
            C14215e value2;
            if (obj == EnumC14221k.ON_SHOWN) {
                C73416l lVar = this.f164960a;
                ShortVideoContext a = lVar.mo116040a();
                C39162r.m79460a("click_modify_entrance", new C84425b().mo129406a("creation_id", a.f155830o).mo129406a("shoot_way", a.f155831p).mo129406a("content_source", a.mo110034j().getContentSource()).mo129406a("content_type", a.mo110034j().getContentType()).mo129406a("enter_from", "video_shoot_page").mo129406a("scene_id", "1004").mo129406a("shoot_page", "video_shoot_page").mo129406a("shoot_tab_name", lVar.mo116040a().mo110042r()).f188764a);
            } else if (obj == EnumC14221k.ON_DISMISSED) {
                C73416l lVar2 = this.f164960a;
                AbstractC14210a aVar = lVar2.f164946b;
                Float f = null;
                if (aVar != null && (curSelectedFilter = aVar.getCurSelectedFilter()) != null && (value = curSelectedFilter.f7727a.getValue()) != null) {
                    AbstractC14210a aVar2 = lVar2.f164946b;
                    if (aVar2 == null || (currentFilterSource = aVar2.getCurrentFilterSource()) == null || (value2 = currentFilterSource.getValue()) == null) {
                        mVar = null;
                    } else {
                        mVar = value2.f34499c;
                    }
                    C84425b a2 = new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("creation_id", lVar2.mo116040a().f155830o).mo129406a("shoot_way", lVar2.mo116040a().f155831p).mo129403a("draft_id", lVar2.mo116040a().f155740A).mo129403a("filter_id", value.getId()).mo129406a("filter_name", value.getEnName());
                    if (mVar != null) {
                        f = Float.valueOf(mVar.mo86055a(value));
                    }
                    Map<String, String> map = a2.mo129405a("value", f).f188764a;
                    C89219l.m154716b(map, "");
                    C39162r.m79460a("adjust_filter_complete", map);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.l$i */
    static final class C73425i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C73416l f164961a;

        static {
            Covode.recordClassIndex(86162);
        }

        C73425i(C73416l lVar) {
            this.f164961a = lVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C50816c cVar = (C50816c) obj;
            int i = C73429m.f164965a[cVar.f117264a.ordinal()];
            if (i == 1) {
                EffectCategoryResponse effectCategoryResponse = cVar.f117265b;
                if (effectCategoryResponse != null) {
                    C73416l lVar = this.f164961a;
                    AVETParameter j = lVar.mo116040a().mo110034j();
                    if (j != null) {
                        C80322d.m139251a("click_filter_tab", new C84425b().mo129406a("creation_id", j.getCreationId()).mo129406a("shoot_way", j.getShootWay()).mo129406a("tab_name", effectCategoryResponse.getName()).mo129406a("content_source", j.getContentSource()).mo129406a("content_type", j.getContentType()).mo129406a("enter_from", "video_shoot_page").mo129406a("scene_id", "1002").mo129406a("shoot_page", "video_shoot_page").mo129406a("shoot_tab_name", lVar.mo116040a().mo110042r()).f188764a);
                    }
                }
            } else if (i == 2) {
                AVETParameter j2 = this.f164961a.mo116040a().mo110034j();
                if (j2 != null) {
                    C39162r.m79460a("filter_deleted", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", j2.getShootWay()).mo129406a("creation_id", j2.getCreationId()).mo129406a("filter_id", "-1").f188764a);
                }
            } else if (i == 3) {
                C63244g.m114602a().mo73263I().mo101634a("click_filter_box", new C84425b().mo129406a("enter_from", "video_shoot_page").f188764a);
            }
        }
    }

    /* renamed from: a */
    public final void mo116041a(AbstractC76337f fVar) {
        if (fVar instanceof AbstractC76337f.C76339b) {
            m129532a("click_prop_search_icon", new C73417a(fVar));
        } else if (fVar instanceof AbstractC76337f.C76340c) {
            m129532a("prop_search", new C73418b(fVar));
        } else if (fVar instanceof AbstractC76337f.C76342e) {
            m129532a("prop_show", new C73419c(fVar));
        } else if (fVar instanceof AbstractC76337f.C76338a) {
            m129532a("clear_prop_search_text", new C73420d(fVar));
        } else if (fVar instanceof AbstractC76337f.C76341d) {
            m129532a("prop_search_cancel", new C73421e(fVar));
        }
    }

    /* renamed from: a */
    private final void m129532a(String str, AbstractC89171a<? extends HashMap<String, String>> aVar) {
        C84425b a = new C84425b().mo129406a("creation_id", mo116040a().f155830o).mo129406a("shoot_way", mo116040a().f155831p).mo129406a("music_id", mo116040a().f155820e).mo129406a("shoot_tab_name", mo116040a().mo110042r()).mo129406a("enter_from", "video_shoot_page");
        a.mo129408a((Map) aVar.invoke());
        C80322d.m139251a(str, a.f188764a);
    }
}
