package com.p2082ss.android.ugc.tools.infosticker.view.internal.provider;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20391d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.C84543k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel;
import com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.p2082ss.android.ugc.tools.p4344f.AbstractC84430d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84456m;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.EnumC84444c;
import com.p2082ss.android.ugc.tools.view.base.HumbleViewModel;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel */
public final class InfoStickerProviderListViewModel extends HumbleViewModel implements AbstractC84697h<ProviderEffect>, AbstractC84700k<ProviderEffect>, AbstractC84700k {

    /* renamed from: i */
    public static final String f189550i = "trending";

    /* renamed from: j */
    public static final String f189551j = "search";

    /* renamed from: k */
    public static final C84838a f189552k = new C84838a((byte) 0);

    /* renamed from: A */
    private final AbstractC84534b f189553A;

    /* renamed from: B */
    private final AbstractC84430d f189554B;

    /* renamed from: a */
    public final C1213t<String> f189555a;

    /* renamed from: b */
    public final C1213t<List<ProviderEffect>> f189556b;

    /* renamed from: c */
    public final C1213t<EnumC85026a> f189557c;

    /* renamed from: d */
    public final C1213t<EnumC85026a> f189558d;

    /* renamed from: e */
    public final C1213t<Object> f189559e;

    /* renamed from: f */
    public final C1213t<Map<ProviderEffect, C89378p<EnumC84444c, Integer>>> f189560f;

    /* renamed from: g */
    public final C1213t<C20391d<List<ProviderEffect>>> f189561g;

    /* renamed from: h */
    public final C1213t<C20391d<List<ProviderEffect>>> f189562h;

    /* renamed from: l */
    private final TrendListViewModel f189563l;

    /* renamed from: m */
    private final ProviderStateViewModel f189564m;

    /* renamed from: n */
    private SearchListViewModel f189565n;

    /* renamed from: o */
    private ProviderStateViewModel f189566o;

    /* renamed from: p */
    private boolean f189567p;

    /* renamed from: q */
    private String f189568q;

    /* renamed from: r */
    private final C1213t<String> f189569r;

    /* renamed from: s */
    private final AbstractC1214u<List<ProviderEffect>> f189570s;

    /* renamed from: t */
    private final AbstractC1214u<EnumC85026a> f189571t;

    /* renamed from: u */
    private final AbstractC1214u<EnumC85026a> f189572u;

    /* renamed from: v */
    private final AbstractC1214u<Object> f189573v;

    /* renamed from: w */
    private final AbstractC1214u<Map<ProviderEffect, C89378p<EnumC84444c, Integer>>> f189574w;

    /* renamed from: x */
    private final AbstractC1214u<C20391d<List<ProviderEffect>>> f189575x;

    /* renamed from: y */
    private final AbstractC1214u<C20391d<List<ProviderEffect>>> f189576y;

    /* renamed from: z */
    private final AbstractC1204m f189577z;

    @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$SearchListViewModel */
    public static final class SearchListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> implements AbstractC33974au {

        /* renamed from: d */
        public long f189580d;

        /* renamed from: e */
        public final C1213t<Object> f189581e = new C1213t<>();

        /* renamed from: f */
        public final String f189582f;

        /* renamed from: g */
        public final AbstractC84430d f189583g;

        /* renamed from: h */
        private AbstractC84451j<ProviderEffect, ProviderEffectModel> f189584h;

        /* renamed from: i */
        private final AbstractC84534b f189585i;

        static {
            Covode.recordClassIndex(98815);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: e */
        public final LiveData<Object> mo129562e() {
            return this.f189581e;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: h */
        public final AbstractC88403ab<List<ProviderEffect>> mo129565h() {
            AbstractC84451j<ProviderEffect, ProviderEffectModel> a = this.f189585i.mo129480a(this.f189582f);
            this.f189584h = a;
            this.f189580d = System.currentTimeMillis();
            AbstractC84430d dVar = this.f189583g;
            if (dVar != null) {
                dVar.mo118970b(this.f189582f, "video_shoot_page");
            }
            AbstractC88403ab<R> c = a.mo129432a().mo142920b(new C84830a(this)).mo142925c(C84831b.f189587a);
            C89219l.m154716b(c, "");
            return c;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: i */
        public final AbstractC88403ab<List<ProviderEffect>> mo129566i() {
            AbstractC88403ab<C89378p<List<ProviderEffect>, ProviderEffectModel>> a;
            AbstractC88403ab<C89378p<List<ProviderEffect>, ProviderEffectModel>> b;
            AbstractC88403ab<R> c;
            AbstractC84451j<ProviderEffect, ProviderEffectModel> jVar = this.f189584h;
            if (jVar != null && (a = jVar.mo129432a()) != null && (b = a.mo142920b(new C84832c(this))) != null && (c = b.mo142925c(C84833d.f189589a)) != null) {
                return c;
            }
            AbstractC88403ab<List<ProviderEffect>> a2 = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            C89219l.m154716b(a2, "");
            return a2;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$SearchListViewModel$b */
        static final class C84831b<T, R> implements AbstractC88434g<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a */
            public static final C84831b f189587a = new C84831b();

            static {
                Covode.recordClassIndex(98817);
            }

            C84831b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends ProviderEffect> apply(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$SearchListViewModel$c */
        static final class C84832c<T> implements AbstractC88433f<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ SearchListViewModel f189588a;

            static {
                Covode.recordClassIndex(98818);
            }

            C84832c(SearchListViewModel searchListViewModel) {
                this.f189588a = searchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f189588a.f189581e.setValue(pVar.component2());
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$SearchListViewModel$d */
        static final class C84833d<T, R> implements AbstractC88434g<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a */
            public static final C84833d f189589a = new C84833d();

            static {
                Covode.recordClassIndex(98819);
            }

            C84833d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends ProviderEffect> apply(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$SearchListViewModel$a */
        static final class C84830a<T> implements AbstractC88433f<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ SearchListViewModel f189586a;

            static {
                Covode.recordClassIndex(98816);
            }

            C84830a(SearchListViewModel searchListViewModel) {
                this.f189586a = searchListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f189586a.f189581e.setValue(pVar.component2());
                AbstractC84430d dVar = this.f189586a.f189583g;
                if (dVar != null) {
                    dVar.mo118965a(InfoStickerProviderListViewModel.f189551j, (int) (System.currentTimeMillis() - this.f189586a.f189580d), this.f189586a.f189582f);
                }
                this.f189586a.f189580d = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchListViewModel(AbstractC1204m mVar, AbstractC84534b bVar, String str, AbstractC84430d dVar) {
            super(mVar);
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(str, "");
            this.f189585i = bVar;
            this.f189582f = str;
            this.f189583g = dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$TrendListViewModel */
    public static final class TrendListViewModel extends BaseInfoStickerListViewModel<ProviderEffect> implements AbstractC33974au {

        /* renamed from: d */
        public long f189590d;

        /* renamed from: e */
        public final C1213t<Object> f189591e = new C1213t<>();

        /* renamed from: f */
        public final AbstractC84430d f189592f;

        /* renamed from: g */
        private AbstractC84451j<ProviderEffect, ProviderEffectModel> f189593g;

        /* renamed from: h */
        private final AbstractC84534b f189594h;

        static {
            Covode.recordClassIndex(98820);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
        /* renamed from: e */
        public final LiveData<Object> mo129562e() {
            return this.f189591e;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: h */
        public final AbstractC88403ab<List<ProviderEffect>> mo129565h() {
            AbstractC84451j<ProviderEffect, ProviderEffectModel> a = this.f189594h.mo129479a();
            this.f189593g = a;
            this.f189590d = System.currentTimeMillis();
            AbstractC88403ab<R> c = a.mo129432a().mo142920b(new C84834a(this)).mo142925c(C84835b.f189596a);
            C89219l.m154716b(c, "");
            return c;
        }

        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerListViewModel
        /* renamed from: i */
        public final AbstractC88403ab<List<ProviderEffect>> mo129566i() {
            AbstractC88403ab<C89378p<List<ProviderEffect>, ProviderEffectModel>> a;
            AbstractC88403ab<C89378p<List<ProviderEffect>, ProviderEffectModel>> b;
            AbstractC88403ab<R> c;
            AbstractC84451j<ProviderEffect, ProviderEffectModel> jVar = this.f189593g;
            if (jVar != null && (a = jVar.mo129432a()) != null && (b = a.mo142920b(new C84836c(this))) != null && (c = b.mo142925c(C84837d.f189598a)) != null) {
                return c;
            }
            AbstractC88403ab<List<ProviderEffect>> a2 = AbstractC88403ab.m153603a((Throwable) new IllegalStateException("Illegal method invoke order, should request data before request more."));
            C89219l.m154716b(a2, "");
            return a2;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$TrendListViewModel$b */
        static final class C84835b<T, R> implements AbstractC88434g<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a */
            public static final C84835b f189596a = new C84835b();

            static {
                Covode.recordClassIndex(98822);
            }

            C84835b() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends ProviderEffect> apply(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$TrendListViewModel$c */
        static final class C84836c<T> implements AbstractC88433f<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ TrendListViewModel f189597a;

            static {
                Covode.recordClassIndex(98823);
            }

            C84836c(TrendListViewModel trendListViewModel) {
                this.f189597a = trendListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f189597a.f189591e.setValue(pVar.component2());
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$TrendListViewModel$d */
        static final class C84837d<T, R> implements AbstractC88434g<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>, List<? extends ProviderEffect>> {

            /* renamed from: a */
            public static final C84837d f189598a = new C84837d();

            static {
                Covode.recordClassIndex(98824);
            }

            C84837d() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ List<? extends ProviderEffect> apply(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar2 = pVar;
                C89219l.m154721d(pVar2, "");
                return pVar2.component1();
            }
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$TrendListViewModel$a */
        static final class C84834a<T> implements AbstractC88433f<C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel>> {

            /* renamed from: a */
            final /* synthetic */ TrendListViewModel f189595a;

            static {
                Covode.recordClassIndex(98821);
            }

            C84834a(TrendListViewModel trendListViewModel) {
                this.f189595a = trendListViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C89378p<? extends List<? extends ProviderEffect>, ? extends ProviderEffectModel> pVar) {
                this.f189595a.f189591e.setValue(pVar.component2());
                AbstractC84430d dVar = this.f189595a.f189592f;
                if (dVar != null) {
                    dVar.mo118965a(InfoStickerProviderListViewModel.f189550i, (int) (System.currentTimeMillis() - this.f189595a.f189590d), (String) null);
                }
                this.f189595a.f189590d = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TrendListViewModel(AbstractC1204m mVar, AbstractC84534b bVar, AbstractC84430d dVar) {
            super(mVar);
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            this.f189594h = bVar;
            this.f189592f = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$a */
    public static final class C84838a {
        static {
            Covode.recordClassIndex(98825);
        }

        private C84838a() {
        }

        public /* synthetic */ C84838a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h
    /* renamed from: a */
    public final LiveData<String> mo129617a() {
        return this.f189569r;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: b */
    public final LiveData<List<ProviderEffect>> mo129559b() {
        return this.f189556b;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: c */
    public final LiveData<EnumC85026a> mo129560c() {
        return this.f189557c;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: d */
    public final LiveData<EnumC85026a> mo129561d() {
        return this.f189558d;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: e */
    public final LiveData<Object> mo129562e() {
        return this.f189559e;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h
    /* renamed from: h */
    public final LiveData<String> mo129619h() {
        return this.f189555a;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: j */
    public final LiveData<Map<ProviderEffect, C89378p<EnumC84444c, Integer>>> mo129569j() {
        return this.f189560f;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: k */
    public final LiveData<C20391d<List<ProviderEffect>>> mo129570k() {
        return this.f189561g;
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: l */
    public final LiveData<C20391d<List<ProviderEffect>>> mo129571l() {
        return this.f189562h;
    }

    static {
        Covode.recordClassIndex(98812);
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: f */
    public final void mo129563f() {
        if (this.f189567p) {
            this.f189563l.mo129563f();
            return;
        }
        SearchListViewModel searchListViewModel = this.f189565n;
        if (searchListViewModel != null) {
            searchListViewModel.mo129563f();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: g */
    public final void mo129564g() {
        if (this.f189567p) {
            this.f189563l.mo129564g();
            return;
        }
        SearchListViewModel searchListViewModel = this.f189565n;
        if (searchListViewModel != null) {
            searchListViewModel.mo129564g();
        }
    }

    /* renamed from: i */
    private final void m145713i() {
        if (!this.f189567p) {
            m145712b(this.f189565n, this.f189566o);
            m145711a(this.f189563l, this.f189564m);
            this.f189555a.setValue(C84856c.m145758a(this.f189563l.f189591e.getValue()));
            this.f189567p = true;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$d */
    static final class C84842d<T> implements AbstractC1214u<List<? extends ProviderEffect>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189602a;

        static {
            Covode.recordClassIndex(98829);
        }

        C84842d(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189602a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(List<? extends ProviderEffect> list) {
            this.f189602a.f189556b.setValue(list);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$e */
    static final class C84843e<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189603a;

        static {
            Covode.recordClassIndex(98830);
        }

        C84843e(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189603a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            this.f189603a.f189558d.setValue(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$f */
    static final class C84844f<T> implements AbstractC1214u<EnumC85026a> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189604a;

        static {
            Covode.recordClassIndex(98831);
        }

        C84844f(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189604a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(EnumC85026a aVar) {
            this.f189604a.f189557c.setValue(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$h */
    static final class C84847h<T> implements AbstractC1214u<Map<ProviderEffect, ? extends C89378p<? extends EnumC84444c, ? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189607a;

        static {
            Covode.recordClassIndex(98834);
        }

        C84847h(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189607a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Map<ProviderEffect, ? extends C89378p<? extends EnumC84444c, ? extends Integer>> map) {
            this.f189607a.f189560f.setValue(map);
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$c */
    static final class C84840c<T> implements AbstractC1214u<C20391d<? extends List<? extends ProviderEffect>>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189600a;

        static {
            Covode.recordClassIndex(98827);
        }

        C84840c(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189600a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C20391d<? extends List<? extends ProviderEffect>> dVar) {
            C20391d<? extends List<? extends ProviderEffect>> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.mo33724a(new AbstractC89172b<List<? extends ProviderEffect>, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel.C84840c.C848411 */

                    /* renamed from: a */
                    final /* synthetic */ C84840c f189601a;

                    static {
                        Covode.recordClassIndex(98828);
                    }

                    {
                        this.f189601a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(List<? extends ProviderEffect> list) {
                        List<? extends ProviderEffect> list2 = list;
                        C89219l.m154721d(list2, "");
                        InfoStickerProviderListViewModel.m145710a(this.f189601a.f189600a.f189562h, (List<ProviderEffect>) list2);
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$g */
    static final class C84845g<T> implements AbstractC1214u<C20391d<? extends List<? extends ProviderEffect>>> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189605a;

        static {
            Covode.recordClassIndex(98832);
        }

        C84845g(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189605a = infoStickerProviderListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C20391d<? extends List<? extends ProviderEffect>> dVar) {
            C20391d<? extends List<? extends ProviderEffect>> dVar2 = dVar;
            if (dVar2 != null) {
                dVar2.mo33724a(new AbstractC89172b<List<? extends ProviderEffect>, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel.C84845g.C848461 */

                    /* renamed from: a */
                    final /* synthetic */ C84845g f189606a;

                    static {
                        Covode.recordClassIndex(98833);
                    }

                    {
                        this.f189606a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(List<? extends ProviderEffect> list) {
                        List<? extends ProviderEffect> list2 = list;
                        C89219l.m154721d(list2, "");
                        InfoStickerProviderListViewModel.m145710a(this.f189606a.f189605a.f189561g, (List<ProviderEffect>) list2);
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84693e
    /* renamed from: a */
    public final void mo129558a(AbstractC84456m mVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$ProviderStateViewModel */
    public static final class ProviderStateViewModel extends BaseInfoStickerStateViewModel<ProviderEffect> implements AbstractC33974au {

        /* renamed from: d */
        private final AbstractC84534b f189578d;

        static {
            Covode.recordClassIndex(98813);
        }

        @Override // com.p2082ss.android.ugc.tools.view.base.HumbleViewModel, com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.AbstractC1202k
        public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* Return type fixed from 'f.a.t' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
        /* renamed from: b */
        public final /* synthetic */ AbstractC88979t<C20375am<ProviderEffect, EnumC84444c, Integer>> mo129568b(ProviderEffect providerEffect) {
            ProviderEffect providerEffect2 = providerEffect;
            C89219l.m154721d(providerEffect2, "");
            AbstractC88979t<R> d = this.f189578d.mo129481a(providerEffect2).mo143292d(C84829a.f189579a);
            C89219l.m154716b(d, "");
            return d;
        }

        /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$ProviderStateViewModel$a */
        static final class C84829a<T, R> implements AbstractC88434g<C84543k, C20375am<ProviderEffect, EnumC84444c, Integer>> {

            /* renamed from: a */
            public static final C84829a f189579a = new C84829a();

            static {
                Covode.recordClassIndex(98814);
            }

            C84829a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ C20375am<ProviderEffect, EnumC84444c, Integer> apply(C84543k kVar) {
                EnumC84444c cVar;
                C84543k kVar2 = kVar;
                C89219l.m154721d(kVar2, "");
                ProviderEffect providerEffect = kVar2.f188948a;
                int i = C84855b.f189626a[kVar2.f188949b.f188953a.ordinal()];
                if (i == 1) {
                    cVar = EnumC84444c.UNKNOWN;
                } else if (i == 2) {
                    cVar = EnumC84444c.DOWNLOADING;
                } else if (i == 3) {
                    cVar = EnumC84444c.NOT_DOWNLOAD;
                } else if (i == 4) {
                    cVar = EnumC84444c.DOWNLOAD_SUCCESS;
                } else if (i != 5) {
                    cVar = EnumC84444c.UNKNOWN;
                } else {
                    cVar = EnumC84444c.DOWNLOAD_FAILED;
                }
                return new C20375am(providerEffect, cVar, kVar2.f188950c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProviderStateViewModel(AbstractC1204m mVar, AbstractC84534b bVar) {
            super(mVar);
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(bVar, "");
            this.f189578d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.view.internal.provider.InfoStickerProviderListViewModel$b */
    static final class C84839b<T> implements AbstractC1214u<Object> {

        /* renamed from: a */
        final /* synthetic */ InfoStickerProviderListViewModel f189599a;

        static {
            Covode.recordClassIndex(98826);
        }

        C84839b(InfoStickerProviderListViewModel infoStickerProviderListViewModel) {
            this.f189599a = infoStickerProviderListViewModel;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final void onChanged(Object obj) {
            this.f189599a.f189555a.setValue(C84856c.m145758a(obj));
            this.f189599a.f189559e.setValue(obj);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84700k
    /* renamed from: a */
    public final /* synthetic */ void mo129567a(Object obj) {
        C89219l.m154721d(obj, "");
        if (this.f189567p) {
            this.f189564m.mo129567a(obj);
            return;
        }
        ProviderStateViewModel providerStateViewModel = this.f189566o;
        if (providerStateViewModel != null) {
            providerStateViewModel.mo129567a(obj);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.view.internal.AbstractC84697h
    /* renamed from: a */
    public final void mo129618a(String str) {
        Object obj;
        C1213t<Object> tVar;
        C1213t<C20391d<List<DATA>>> tVar2;
        C1213t<C20391d<List<DATA>>> tVar3;
        C1213t<C20391d<List<DATA>>> tVar4;
        if (str == null || str.length() == 0) {
            m145713i();
        } else if (this.f189567p || !C89219l.m154714a((Object) this.f189568q, (Object) str)) {
            if (this.f189567p) {
                m145712b(this.f189563l, this.f189564m);
            }
            if (!C89219l.m154714a((Object) this.f189568q, (Object) str)) {
                if (!this.f189567p) {
                    m145712b(this.f189565n, this.f189566o);
                }
                ProviderStateViewModel providerStateViewModel = this.f189566o;
                if (!(providerStateViewModel == null || (tVar4 = providerStateViewModel.f189129b) == null)) {
                    tVar4.removeObserver(this.f189575x);
                }
                ProviderStateViewModel providerStateViewModel2 = this.f189566o;
                if (!(providerStateViewModel2 == null || (tVar3 = providerStateViewModel2.f189130c) == null)) {
                    tVar3.removeObserver(this.f189576y);
                }
                SearchListViewModel searchListViewModel = this.f189565n;
                if (searchListViewModel != null) {
                    searchListViewModel.onDestroy();
                }
                ProviderStateViewModel providerStateViewModel3 = this.f189566o;
                if (providerStateViewModel3 != null) {
                    providerStateViewModel3.onDestroy();
                }
                SearchListViewModel searchListViewModel2 = new SearchListViewModel(this.f189577z, this.f189553A, str, this.f189554B);
                searchListViewModel2.mo129563f();
                this.f189565n = searchListViewModel2;
                ProviderStateViewModel providerStateViewModel4 = new ProviderStateViewModel(this.f189577z, this.f189553A);
                this.f189566o = providerStateViewModel4;
                C1213t<C20391d<List<DATA>>> tVar5 = providerStateViewModel4.f189129b;
                if (tVar5 != null) {
                    tVar5.observe(this.f189577z, this.f189575x);
                }
                ProviderStateViewModel providerStateViewModel5 = this.f189566o;
                if (!(providerStateViewModel5 == null || (tVar2 = providerStateViewModel5.f189130c) == null)) {
                    tVar2.observe(this.f189577z, this.f189576y);
                }
            } else {
                C1213t<String> tVar6 = this.f189555a;
                SearchListViewModel searchListViewModel3 = this.f189565n;
                if (searchListViewModel3 == null || (tVar = searchListViewModel3.f189581e) == null) {
                    obj = null;
                } else {
                    obj = tVar.getValue();
                }
                tVar6.setValue(C84856c.m145758a(obj));
            }
            m145711a(this.f189565n, this.f189566o);
            this.f189567p = false;
            this.f189568q = str;
        }
        this.f189569r.setValue(str);
    }

    public /* synthetic */ InfoStickerProviderListViewModel(AbstractC1204m mVar, AbstractC84534b bVar) {
        this(mVar, bVar, null);
    }

    /* renamed from: a */
    public static void m145710a(C1213t<C20391d<List<ProviderEffect>>> tVar, List<ProviderEffect> list) {
        List arrayList;
        List<ProviderEffect> a;
        if (!list.isEmpty()) {
            C20391d<List<ProviderEffect>> value = tVar.getValue();
            if (value == null || (a = value.mo33723a()) == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = C89070n.m154585g((Collection) a);
            }
            arrayList.addAll(list);
            tVar.setValue(new C20391d<>(arrayList));
        }
    }

    /* renamed from: b */
    private final void m145712b(AbstractC84693e<ProviderEffect> eVar, AbstractC84700k<ProviderEffect> kVar) {
        LiveData<Map<ProviderEffect, C89378p<EnumC84444c, Integer>>> j;
        if (eVar != null) {
            LiveData<List<ProviderEffect>> b = eVar.mo129559b();
            if (b != null) {
                b.removeObserver(this.f189570s);
            }
            LiveData<EnumC85026a> c = eVar.mo129560c();
            if (c != null) {
                c.removeObserver(this.f189571t);
            }
            LiveData<EnumC85026a> d = eVar.mo129561d();
            if (d != null) {
                d.removeObserver(this.f189572u);
            }
            LiveData<Object> e = eVar.mo129562e();
            if (e != null) {
                e.removeObserver(this.f189573v);
            }
        }
        if (kVar != null && (j = kVar.mo129569j()) != null) {
            j.removeObserver(this.f189574w);
        }
    }

    /* renamed from: a */
    private final void m145711a(AbstractC84693e<ProviderEffect> eVar, AbstractC84700k<ProviderEffect> kVar) {
        LiveData<Map<ProviderEffect, C89378p<EnumC84444c, Integer>>> j;
        if (eVar != null) {
            LiveData<List<ProviderEffect>> b = eVar.mo129559b();
            if (b != null) {
                b.observe(this.f189577z, this.f189570s);
            }
            LiveData<EnumC85026a> c = eVar.mo129560c();
            if (c != null) {
                c.observe(this.f189577z, this.f189571t);
            }
            LiveData<EnumC85026a> d = eVar.mo129561d();
            if (d != null) {
                d.observe(this.f189577z, this.f189572u);
            }
            LiveData<Object> e = eVar.mo129562e();
            if (e != null) {
                e.observe(this.f189577z, this.f189573v);
            }
        }
        if (kVar != null && (j = kVar.mo129569j()) != null) {
            j.observe(this.f189577z, this.f189574w);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerProviderListViewModel(AbstractC1204m mVar, AbstractC84534b bVar, AbstractC84430d dVar) {
        super(mVar);
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f189577z = mVar;
        this.f189553A = bVar;
        this.f189554B = dVar;
        this.f189555a = new C1213t<>();
        this.f189563l = new TrendListViewModel(mVar, bVar, dVar);
        ProviderStateViewModel providerStateViewModel = new ProviderStateViewModel(mVar, bVar);
        this.f189564m = providerStateViewModel;
        this.f189568q = "";
        this.f189556b = new C1213t<>();
        this.f189557c = new C1213t<>();
        this.f189558d = new C1213t<>();
        this.f189559e = new C1213t<>();
        this.f189560f = new C1213t<>();
        this.f189561g = new C1213t<>();
        this.f189562h = new C1213t<>();
        this.f189569r = new C1213t<>();
        this.f189570s = new C84842d(this);
        this.f189571t = new C84844f(this);
        this.f189572u = new C84843e(this);
        this.f189573v = new C84839b(this);
        this.f189574w = new C84847h(this);
        C84845g gVar = new C84845g(this);
        this.f189575x = gVar;
        C84840c cVar = new C84840c(this);
        this.f189576y = cVar;
        m145713i();
        providerStateViewModel.f189129b.observe(mVar, gVar);
        providerStateViewModel.f189130c.observe(mVar, cVar);
    }
}
